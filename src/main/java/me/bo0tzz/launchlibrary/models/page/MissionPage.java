package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Mission;

import java.util.List;

@Data
public class MissionPage extends Page {

    private List<Mission> missions;

}
