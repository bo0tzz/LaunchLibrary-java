package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Launch;

import java.util.List;

@Data
public class LaunchPage extends Page {

    private List<Launch> launches;

}
