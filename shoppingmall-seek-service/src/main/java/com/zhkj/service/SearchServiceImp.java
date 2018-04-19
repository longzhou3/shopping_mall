package com.zhkj.service;

import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImp implements ISearchService{

    @Autowired
    private TransportClient client;

    @Override
    public void index(Long commodityId) {

    }

    @Override
    public void remove(Long commodityId) {

    }
}
