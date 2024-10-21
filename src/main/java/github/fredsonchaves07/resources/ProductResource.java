package github.fredsonchaves07.resources;

import github.fredsonchaves07.entities.Product;
import github.fredsonchaves07.services.ProductService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import static jakarta.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/{tenant}/products")
@Consumes(APPLICATION_JSON)
@Produces(APPLICATION_JSON)
public class ProductResource {

    @Inject
    ProductService service;


    @POST
    public Response createProduct(@PathParam("tenant") String tenant, Product product) {
        service.createProduct(product);
        return Response.ok().entity(product).build();
    }
}
