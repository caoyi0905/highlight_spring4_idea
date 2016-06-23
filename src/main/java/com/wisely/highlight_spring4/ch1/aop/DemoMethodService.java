package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by FrozenC on 2016/6/23.
 */
@Service
public class DemoMethodService {

    public void add(){}

    public void sub(int a,int b){
        System.out.println(a + "-" + b + "=" + (a-b));
    }
}
