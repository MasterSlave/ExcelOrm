package com.semihunaldi.excelorm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation marks POJO classes to be mapped to excel row.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Excel {

    /**
     * initial row position
     *
     * @return row number in the excel
     */
    int firstRow() default 1;

    /**
     * initial column position
     *
     * @return column position in the excel
     */
    int firstCol() default 0;

    /**
     *
     * @return sheet name in the excel
     */
    String sheetName();
}