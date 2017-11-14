package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Agency {

    private Integer id;
    private String name;
    private String abbrev;
    private String countryCode;
    private Integer type;
    private String infoURL;
    private String wikiURL;
    private List<String> infoURLs;
    private Integer islsp;

}