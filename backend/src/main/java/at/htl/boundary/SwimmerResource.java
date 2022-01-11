package at.htl.boundary;

import at.htl.control.SwimmerRepository;
import at.htl.enitity.Swimmer;
import io.quarkus.qute.CheckedTemplate;
import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.transform.Templates;
import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@Path("/swimmer")
public class SwimmerResource {

    @Inject
    SwimmerRepository repo;

    /*
        @CheckedTemplate
        public static class Templates {
            public static native TemplateInstance swimmer(Swimmer swimmer);
        }
    */

    @CheckedTemplate(requireTypeSafeExpressions = false)
    public static class Templates {
        public static native TemplateInstance swimmer(List<Swimmer> swimmers);
    }

    @POST
    @Path("/newswimmer")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public Response Swimmmer(@FormParam("firstname") String fname,
                             @FormParam("lastname") String lname,
                             @FormParam("bestStroke") String bestStroke,
                             @FormParam("SwamKilometers") int kS,
                             @FormParam("AttendedHours") int aH,
                             @Context UriInfo uriInfo
    ) {

        repo.insert(new
                Swimmer(
                fname,
                lname,
                LocalDate.now(),
                bestStroke,
                kS,
                aH)
        );

        URI uri = uriInfo.getAbsolutePathBuilder().path("42").build();
        return Response.created(uri).build();
    }

    /*
        @GET
        @Path("{id}")
        @Produces(MediaType.TEXT_HTML)
        public TemplateInstance get(@PathParam("id") Long id) {
            return Templates.swimmer(repo.findSwimmer(id));
        }
    */
    @GET
    @Path("/getAllSwimmers")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getAll() {
        return Templates.swimmer(repo.findAll());
    }

}