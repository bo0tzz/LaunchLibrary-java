package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Location;

import java.util.List;

@Data
public class LocationPage extends Page {

    private List<Location> locations;

}
