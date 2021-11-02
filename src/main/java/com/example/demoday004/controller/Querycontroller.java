package com.example.demoday004.controller;

import com.example.demoday004.entity.qdd;
import com.example.demoday004.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller()
@RequestMapping("/query")
public class Querycontroller {
    @Autowired
    private QueryService queryService;

    @GetMapping("/All")
    public List<qdd> all(){

        List<qdd> q=queryService.QueryAll();
        System.out.println(q);
        return q;
    }
}
