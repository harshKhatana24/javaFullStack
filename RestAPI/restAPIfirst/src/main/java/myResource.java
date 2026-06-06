import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/myresource")
public class myResource {


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return "got it!";
    }


}
