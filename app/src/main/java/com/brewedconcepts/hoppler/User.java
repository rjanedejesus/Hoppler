package com.brewedconcepts.hoppler;

/**
 * Created by RoseJane on 6/24/2015.
 */
public class User {
    public String house_address;
    public String house_sqm;
    public String house_br;
    public String house_ba;
    public String house_id;
    public String house_price;

    public User(String house_address, String house_sqm, String house_br, String house_ba, String house_id, String house_price) {
        this.house_address = house_address;
        this.house_sqm = house_sqm;
        this.house_br = house_br;
        this.house_ba = house_ba;
        this.house_id = house_id;
        this.house_price = house_price;
    }


}
