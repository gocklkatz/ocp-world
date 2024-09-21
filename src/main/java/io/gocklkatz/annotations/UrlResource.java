package io.gocklkatz.annotations;

public @interface UrlResource {
    String value();
    boolean trim() default false;
}
