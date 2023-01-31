package org.acme.client;

import org.acme.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/last")
@RegisterRestClient
@ApplicationScoped
public interface PriceClient {

    @GET
    @Path("/{pair}")
    CurrencyPriceDTO getPriceById(@PathParam("pair") String currencyPair);
}
