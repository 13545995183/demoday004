package com.example.demoday004.service;

import com.example.demoday004.entity.qdd;
import com.example.demoday004.mapper.QueryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService{
    @Autowired
    private QueryMapper queryMapper;

    @Override
    public List<qdd> QueryAll() {
        return queryMapper.QueryAll();
    }
}
