package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controllergi
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);    //model将请求里携带的参数传给要返回给前端的html页面中
        return "hello";
    }
}
