package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by FrozenC on 2016/6/18.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word){
        return functionService.sayHello(word);
    }
}
