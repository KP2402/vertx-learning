package org.example.kp;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    private String[] args;

    public MainVerticle(String[] args) {
        this.args = args;
    }

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(request -> {
            String name = request.getParam("name");
            request.response().setChunked(true);
            request.response().putHeader("content-type", "text/plain")
                    .end("Hello " +  name + " from " + args[0] + " !");
        }).listen(8080);
    }
}
