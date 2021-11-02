package com.example.demoday004.mapper;

import com.example.demoday004.entity.qdd;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QueryMapper {

    List<qdd> QueryAll();
}
