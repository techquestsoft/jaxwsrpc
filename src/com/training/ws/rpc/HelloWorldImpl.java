package com.training.ws.rpc;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.training.ws.rpc.HelloWorld")
public class HelloWorldImpl implements com.training.ws.rpc.HelloWorld {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS " + name;
    }

}