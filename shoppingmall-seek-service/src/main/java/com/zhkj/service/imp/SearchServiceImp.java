package com.zhkj.service.imp;

import com.zhkj.service.ISearchService;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

@Service
public class SearchServiceImp implements ISearchService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Override
    public void index(Long commodityId) {

    }

    @Override
    public void remove(Long commodityId) {

    }
}
