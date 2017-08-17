package com.semihunaldi.excelorm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ExcelColumn {

    /**
     *
     * @return column position of annotated variable
     */
    int col();

    /**
     *
     * @return header column name in excel to be read/write from/to variable
     */
    String columnName();

    /**
     * if excel field formatted as Date, formatter must be given
     * @return pattern of Date
     */
    String dateFormat() default "";
}
