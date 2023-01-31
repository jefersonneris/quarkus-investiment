package org.acme.resource;

import org.acme.client.CryptoPriceClient;
import org.acme.client.PriceClient;
import org.acme.dto.CryptoPriceDTO;
import org.acme.dto.CurrencyPriceDTO;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/currency")
public class CurrencyResource {

    @Inject
    @RestClient
    PriceClient priceClient;

    @Inject
    @RestClient
    CryptoPriceClient cryptoPriceClient;

    @GET
    @Path("/info")
    public String getPairValue(){

        CurrencyPriceDTO currencyValues = priceClient.getPriceById("USD-BRL");
        List<CryptoPriceDTO> cryptoPrice = cryptoPriceClient.getPriceById("usd", "bitcoin");

        return "The high to pair (USD-BRL) is: " + currencyValues.getUSDBRL().getHigh()
                + " and Bitcoin price is " + cryptoPrice.get(0).getCurrent_price();
    }

}
