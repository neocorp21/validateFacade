package com.validate.validatefacade;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Campo {
    /**
     * Expresión regular para validar el contenido del campo.
     * Por defecto, coincide con cualquier cadena.
     */
    String regex() default ".*";

    /**
     * Longitud mínima permitida para el campo String.
     */
    int longitudMinima() default 1;

    /**
     * Longitud máxima permitida para el campo String.
     */
    int longitudMaxima() default 50;

    /**
     * Indica si el campo es obligatorio.
     */
    boolean obligatorio() default false;



}
