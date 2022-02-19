package com.tms.flower_market;

import lombok.ToString;

@ToString
public class Constants {
    public static final String ROSE = "ROSE";
    public static final String LILY = "LILY";
    public static final String ASTER = "ASTER";
    public static final String GERBERA = "GERBERA";

    public static final String[][] flowerNameCostArray = {
            {ROSE, "15"},
            {LILY, "10"},
            {ASTER, "1"},
            {GERBERA, "2"}

    };

}
