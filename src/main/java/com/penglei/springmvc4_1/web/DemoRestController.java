package com.penglei.springmvc4_1.web;

import com.penglei.springmvc4_1.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pl on 2017/1/9.
 */
@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value="/getJson",produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj demoObj){
        return new DemoObj(demoObj.getId()+1,demoObj.getName()+"xxx");
    }
    @RequestMapping(value="/getXml",produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj demoObj){
        return new DemoObj(demoObj.getId()+2,demoObj.getName()+"yyy");
    }

}
