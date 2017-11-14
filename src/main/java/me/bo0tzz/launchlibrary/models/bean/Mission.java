package me.bo0tzz.launchlibrary.models.bean;

import lombok.*;

import java.util.List;

@Value
public class Mission {

    private Integer id;
    private String name;
    private String description;
    private Integer type;
    private String typeName;
    private List<Agency> agencies;

}