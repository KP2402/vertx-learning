package org.example.kp;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class DeployMainVerticle extends AbstractVerticle {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new MainVerticle());
    }
}
