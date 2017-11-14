package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Agency;

import java.util.List;

@Data
public class AgencyPage extends Page {

    private List<Agency> agencies;

}
