package com.ganghuan.MyRPC.server;

import com.ganghuan.MyRPC.service.BlogService;
import com.ganghuan.MyRPC.service.BlogServiceImpl;
import com.ganghuan.MyRPC.service.UserService;
import com.ganghuan.MyRPC.service.UserServiceImpl;

public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();
        //Map<String, Object> serviceProvide = new HashMap<>();
        //// 暴露两个服务接口， 即在RPCServer中
        // 加一个HashMap
        //serviceProvide.put("com.ganghuan.MyRPC.service.UserService",userService);
        //serviceProvide.put("com.ganghuan.MyRPC.service.BlogService",blogService);
        ServiceProvider serviceProvider = new ServiceProvider("127.0.0.1", 8899);
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);

        RPCServer RPCServer = new NettyRPCServer(serviceProvider);
        RPCServer.start(8899);
    }
}
