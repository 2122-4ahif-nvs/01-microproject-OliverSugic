package at.htl.boundary;

import at.htl.control.SwimmerRepository;
import at.htl.enitity.Swimmer;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;

@Path("/swimmer")
public class SwimmerResource {

    @Inject
    SwimmerRepository repo;

    @Path("/newswimmer")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response Swimmmer(@FormParam("firstname") String fname,
                            @FormParam("lastname") String lname,
                            @FormParam("bestStroke") String bestStroke,
                            @Context UriInfo uriInfo
    ){

        repo.insert(new Swimmer(fname, lname, null, bestStroke, 100, 100));

        URI uri = uriInfo.getAbsolutePathBuilder().path("42").build();

        return Response.created(uri).build();
    }
}