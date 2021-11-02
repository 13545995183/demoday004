package com.example.demoday004.service;

import com.example.demoday004.entity.qdd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QueryService {


    List<qdd> QueryAll();
}
