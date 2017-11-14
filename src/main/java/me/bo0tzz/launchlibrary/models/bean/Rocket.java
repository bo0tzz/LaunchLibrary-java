package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Rocket {

    private Integer id;
    private String name;
    private String configuration;
    private String familyname;
    private List<Agency> agencies;
    private String wikiURL;
    private List<String> infoURLs;
    private String infoURL;
    private List<Integer> imageSizes;
    private String imageURL;

}