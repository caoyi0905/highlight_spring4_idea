package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by FrozenC on 2016/6/24.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
