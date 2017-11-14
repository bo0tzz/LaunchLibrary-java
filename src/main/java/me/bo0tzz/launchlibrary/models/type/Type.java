package me.bo0tzz.launchlibrary.models.type;

import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public abstract class Type {

    Integer id;
    String name;

}
