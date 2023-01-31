package org.acme.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.util.Date;
@Jacksonized
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CryptoPriceDTO {

    public String id;
    public String symbol;
    public String name;
    public String image;
    public Integer current_price;
    public Long market_cap;
    public Integer market_cap_rank;
    public Long fully_diluted_valuation;
    public Long total_volume;
    public Integer high_24h;
    public Integer low_24h;
    public Double price_change_24h;
    public Double price_change_percentage_24h;
    public Long market_cap_change_24h;
    public Double market_cap_change_percentage_24h;
    public Integer circulating_supply;
    public Integer total_supply;
    public Integer max_supply;
    public Integer ath;
    public Double ath_change_percentage;
    public Date ath_date;
    public Double atl;
    public Double atl_change_percentage;
    public Date atl_date;
    public Object roi;
    public Date last_updated;

}
