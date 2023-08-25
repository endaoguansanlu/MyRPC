package com.ganghuan.MyRPC.service;

import com.ganghuan.MyRPC.common.Blog;
import com.ganghuan.MyRPC.service.BlogService;

public class BlogServiceImpl implements BlogService {

    @Override
    public Blog getBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).title("我的博客").useId(22).build();
        System.out.println("客户端查询了"+id+"博客");
        return blog;
    }
}
