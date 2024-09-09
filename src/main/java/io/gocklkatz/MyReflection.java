package io.gocklkatz;

import java.net.URLClassLoader;
import java.security.SecureClassLoader;
import java.util.Date;
import java.util.HashMap;

public class MyReflection {

    public static void main(String[] args) throws ClassNotFoundException {
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
    }
}
