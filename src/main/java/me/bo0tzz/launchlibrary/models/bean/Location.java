package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Location {

    private List<Pad> pads;
    private Integer id;
    private String name;
    private String infoURL;
    private String wikiURL;
    private String countryCode;

}