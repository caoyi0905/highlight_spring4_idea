package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

/**
 * Created by FrozenC on 2016/6/18.
 */
@Service
public class FunctionService {
    public String sayHello(String word){
        return "Hello " + word + " !";
    }
}
