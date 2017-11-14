package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;

@Data
public class Page {

    private Integer total;
    private Integer count;
    private Integer offset;
    private String status;
    private String msg;

}
