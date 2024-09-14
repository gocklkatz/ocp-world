package io.gocklkatz;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

import java.net.URLClassLoader;
import java.security.SecureClassLoader;
import java.util.HashMap;

public class MyReflection {

    public static Integer integer;
    public Double aDouble;

    public static void method1() {}
    private static void method2() {}
    public void method3() {}
    private void method4() {}

    public static void main(String[] args) throws Exception {
        System.out.println("Hello beautiful Reflection!");

        // java.lang.Class
        Class<MyReflection> clazz = MyReflection.class;
        Class<? extends MyReflection> clazz2 = new MyReflection().getClass();
        Class<?> clazz3 = Class.forName("io.gocklkatz.MyReflection");

        // java.lang.ClassLoader
        System.out.println(System.getProperty("java.class.path"));
        ClassLoader classLoader;
        SecureClassLoader secureClassLoader;
        URLClassLoader urlClassLoader;

        // more java.lang.Class
        Class<?> c = HashMap.class;
        System.out.println(c.getName());
        System.out.println(c.getSimpleName());
        System.out.println(c.toString());
        System.out.println(c.toGenericString());
        System.out.println(c.getTypeName());
        System.out.println(c.getPackageName());

        c.isInterface();
        c.isPrimitive();
        c.isArray();
        //...

        System.out.println(String.class.getSuperclass());
        System.out.println("--- --- ---");

        Constructor constructor;
        Method method;
        Executable executable;
        Field field;
        Member member;
        GenericDeclaration genericDeclaration;
        AccessibleObject accessibleObject;
        AnnotatedElement annotatedElement;

        Field[] fields = MyReflection.class.getFields();
        Field field1 = MyReflection.class.getField("integer");

        Member member1 = MyReflection.class.getField("integer");
        member1.getName();

        Method[] methods = MyReflection.class.getMethods();
        Method method1 = MyReflection.class.getMethod("method1");
        Member member2 = MyReflection.class.getMethod("method1");

        Constructor<?>[] constructors = MyReflection.class.getConstructors();

        // Create and manipulate objects
        Class<MyReflection> clayy = MyReflection.class;

        Constructor<MyReflection> constructor1 = clayy.getConstructor();
        MyReflection myReflection = constructor1.newInstance();
        myReflection.aDouble = 1.0;

        Field field2 = clayy.getField("aDouble");
        double d = (Double) field2.get(myReflection);
        //IllegalArgumentException
        //double dd = field2.getDouble(myReflection);
        System.out.println("double: " + d);
        field2.set(myReflection, 2.0);
        //IllegalArgumentException
        //field2.setDouble(myReflection, 4.0);
        System.out.println("double: " + myReflection.aDouble);

        Field field3 = clayy.getField("integer");
        field3.set(null, 3);
        System.out.println("integer: " + MyReflection.integer);

        System.out.println("--- --- ---");
    }
}
