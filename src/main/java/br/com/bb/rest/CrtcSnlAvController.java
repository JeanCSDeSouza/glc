package br.com.bb.rest;


import br.com.bb.persistense.model.CrtcSnlAv;
import br.com.bb.repository.CrtcSnlAvRepository;
import br.com.bb.service.CrtcSnlAvService;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import org.eclipse.microprofile.openapi.annotations.enums.SchemaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import java.time.Instant;

@Path("/api/CRTC-SNL-AV")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Crtc_Snl_Avs", description = "Classe blablabla" )
public class CrtcSnlAvController {
    @Inject
    public CrtcSnlAvService crtcSnlAvService;

    @GET
    @APIResponse(
            responseCode = "200",
            description = "Recupera todos os items de CRTC_SNL_AV",
            content = @Content(
                    mediaType = MediaType.APPLICATION_JSON,
                    schema = @Schema(type = SchemaType.ARRAY, implementation = CrtcSnlAv.class)
            )
    )
    public Response findAll(){
        return Response.status(Response.Status.OK).entity(  crtcSnlAvService.getCrtcSnlAvs()  ).build();
    }
    @POST
    public Response insert(@NotNull @Valid CrtcSnlAv crtcSnlAv, @Context UriInfo uriInfo){
        //TO-DO inserir no retorno o link para o recurso criado
        crtcSnlAv = new CrtcSnlAv.Builder().id(30)
                .nmCrtc("teste")
                .cdUsuRspCrtc("teste")
                .tsAtlCrtc(Instant.now() )
                .build();
        return Response.status( Response.Status.CREATED ).entity( crtcSnlAv ).build();
    }
}
