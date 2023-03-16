package at.htl.gettingstarted;

import at.htl.gettingstarted.entity.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person hello() {
        return new Person("John", "Doe");
    }
}