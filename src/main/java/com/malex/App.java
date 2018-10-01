package com.malex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class App extends AbstractVerticle
{
    @Override
    public void start(Future<Void> startFuture) throws Exception
    {
        getVertx().createHttpServer()
                .requestHandler(event -> event.response().end("Ok"))
                .listen(8080, result ->
                {
                    if (result.succeeded())
                    {
                        startFuture.complete();
                    }
                    else
                    {
                        startFuture.fail(result.cause());
                    }
                });
    }
}
