package com.ganghuan.MyRPC.server;

import com.ganghuan.MyRPC.common.RPCRequest;
import com.ganghuan.MyRPC.common.RPCResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public interface RPCServer {
    void start(int port);
    void stop();
}
