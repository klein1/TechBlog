package com.tech.blog.dao;

import com.tech.blog.entity.BlogConfig;

import java.util.List;

public interface BlogConfigMapper {
    List<BlogConfig> selectAll();

    BlogConfig selectByPrimaryKey(String configName);

    int updateByPrimaryKeySelective(BlogConfig record);

}