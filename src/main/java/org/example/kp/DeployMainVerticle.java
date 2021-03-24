package org.example.kp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class DeployMainVerticle extends AbstractVerticle {

    public static void main(String[] args) {
        System.out.println("The argument passed was "+ args[0]);
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MainVerticle(args));
    }
}
