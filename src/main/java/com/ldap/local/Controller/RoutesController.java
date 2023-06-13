package com.ldap.local.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {


    @GetMapping("/")
    public String index(){
        return "Hola mundo";
    }
}
