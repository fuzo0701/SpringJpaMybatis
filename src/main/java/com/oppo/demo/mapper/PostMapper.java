package com.oppo.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.oppo.demo.model.Post;

@Mapper
public interface PostMapper {
    public List<Post> listPost();
}
