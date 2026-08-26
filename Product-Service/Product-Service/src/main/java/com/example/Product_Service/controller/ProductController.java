package com.example.Product_Service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class ProductController {
    
    @Autowired 
    private Environment environment;

    @GetMapping("/place")
    public String placeOder(){
        String port = environment.getProperty("server.port");
        return "running on port "+port+" Hello your order: Iphone is placed.";
    }

    @GetMapping("/product/{name}")
    public String orderWithName(@PathVariable String name){
        return "Hello" +name+ "your order done:";
    }
}

