package me.bo0tzz.launchlibrary.models.type;

import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
public class LaunchStatus extends Type {

    String description;

}
