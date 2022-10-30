
package org.caisezhaopian.MVCWebDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/H")
    private String index(){
        return "/html/index";
    }

    @RequestMapping("/J")
    private String indexJ(){
        return "/jsp/index";
    }
}