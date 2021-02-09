package org.example.kp;

import io.vertx.core.AbstractVerticle;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        vertx.createHttpServer().requestHandler(request -> {
            String name = request.getParam("name");
            request.response().setChunked(true);
            request.response().putHeader("content-type", "text/plain")
                    .end("Hello " +  name + "!");
        }).listen(8080);
    }
}
