package br.com.bb.rest;


import br.com.bb.repository.CrtcSnlAvRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/CRTC-SNL-AV")
public class CrtcSnlAvController {

    public CrtcSnlAvRepository crtcSnlAvRepository;
    @Inject
    public CrtcSnlAvController(CrtcSnlAvRepository crtcSnlAvRepository) {
        this.crtcSnlAvRepository = crtcSnlAvRepository;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll(){
        return Response.status(Response.Status.OK).entity(  crtcSnlAvRepository.listAll() ).build();
    }
}
