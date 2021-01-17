package com.cezklosowski.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
public enum ProbeType {

    LINEAR("Głowica liniowa"),
    CONVEX("Głowica convex"),
    VOLUME_CONVEX("Głowica convex objętościowa"),
    MICRO_CONVEX("Głowica micro convex"),
    ENDOCAVITARY("Głowica endokawitarna"),
    VOLUME_ENDOCAVITARY("Głowica endokawitarna objętościowa"),
    PHASED_ARRAY("Głowica phased array");

    public final String displayName;


}
