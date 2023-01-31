package org.acme.client;

import org.acme.dto.CryptoPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/api/v3/coins/markets")
@RegisterRestClient
@ApplicationScoped
public interface CryptoPriceClient {

    @GET
    List<CryptoPriceDTO> getPriceById(@QueryParam("vs_currency") String vs_currency, @QueryParam("ids") String ids);
}
