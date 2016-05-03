package restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/test")
public class test {

	@GET
	public Response get(){
		String output = "test is working";
		return Response.status(200).entity(output).build();
	}
}
