package com.bohdanbest;

import io.quarkus.security.Authenticated;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/secured")
@Authenticated
public class SecuredResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getSecuredResource() {
        return "This is a secured resource!";
    }
}
