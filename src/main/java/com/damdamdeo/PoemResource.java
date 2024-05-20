package com.damdamdeo;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/poem")
public class PoemResource {
    @Inject
    MyAiService myAiService;

    @GET
    @Path("/{topic}")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello(@PathParam("topic") final String topic) {
        return myAiService.writeAPoem(topic, 3);
    }
}
