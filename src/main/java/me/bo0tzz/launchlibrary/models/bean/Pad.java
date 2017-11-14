package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Pad {

    private Integer id;
    private String name;
    private String infoURL;
    private String wikiURL;
    private String mapURL;
    private Double latitude;
    private Double longitude;
    private List<Agency> agencies;

}