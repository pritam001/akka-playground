package com.playground.core;

import akka.actor.typed.ActorSystem;
import com.playground.core.hello.HelloWorldMain;

public class MainApplication {

    public static void main(String[] args) {
        final ActorSystem<HelloWorldMain.SayHello> system = ActorSystem.create(HelloWorldMain.create(), "hello");

        system.tell(new HelloWorldMain.SayHello("World"));
        system.tell(new HelloWorldMain.SayHello("Akka"));
    }
}
