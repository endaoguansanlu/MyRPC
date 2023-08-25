package com.ganghuan.MyRPC.cilent;

import com.ganghuan.MyRPC.common.Blog;
import com.ganghuan.MyRPC.common.RPCRequest;
import com.ganghuan.MyRPC.common.RPCResponse;
import com.ganghuan.MyRPC.common.User;
import com.ganghuan.MyRPC.service.BlogService;
import com.ganghuan.MyRPC.service.UserService;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;

public interface RPCClient {
        RPCResponse sendRequest(RPCRequest request);
}
