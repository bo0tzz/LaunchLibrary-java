package me.bo0tzz.launchlibrary.models.page;

import lombok.Data;
import me.bo0tzz.launchlibrary.models.bean.Pad;

import java.util.List;

@Data
public class PadPage extends Page {

    private List<Pad> pads;

}
