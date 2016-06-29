package com.wisely.highlight_spring4.ch3.conditional;

/**
 * Created by FrozenC on 2016/6/29.
 */
public class LInuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
