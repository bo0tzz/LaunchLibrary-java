package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Launch {

    private Integer id;
    private String name;
    private String windowstart;
    private String windowend;
    private String net;
    private Integer wsstamp;
    private Integer westamp;
    private Integer netstamp;
    private String isostart;
    private String isoend;
    private String isonet;
    private Integer status;
    private Integer inhold;
    private Integer tbdtime;
    private List<String> vidURLs;
    private String vidURL;
    private List<String> infoURLs;
    private String infoURL;
    private String holdreason;
    private String failreason;
    private Integer tbddate;
    private Integer probability;
    private String hashtag;
    private Location location;
    private Rocket rocket;
    private List<Mission> missions;
    private Agency lsp;

}