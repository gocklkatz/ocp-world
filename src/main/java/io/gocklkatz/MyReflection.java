package io.gocklkatz;

public class MyReflection {

    public static void main(String[] args) {
        System.out.println("Hello beautiful Reflection!");

        Class<MyReflection> clazz = MyReflection.class;
        System.out.println(clazz);

        Class<? extends MyReflection> clazz2 = new MyReflection().getClass();

        try {
            Class<?> clazz3 = Class.forName("io.gocklkatz.MyReflection");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
