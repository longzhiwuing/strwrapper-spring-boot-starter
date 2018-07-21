package com.lzwing.starter.importselector.annotation;

import com.lzwing.starter.importselector.WrapperImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(WrapperImportSelector.class)
public @interface EnableWrapper {
}
