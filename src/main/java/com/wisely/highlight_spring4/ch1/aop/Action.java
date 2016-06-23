package com.wisely.highlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by FrozenC on 2016/6/23.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
