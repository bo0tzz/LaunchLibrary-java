package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Rocket;

import java.util.List;

@Data
public class RocketPage extends Page {

    private List<Rocket> rockets;

}
