package com.yarasa.math;

import com.yarasa.math.polars.ArchimedesSpiral01;
import com.yarasa.math.polars.ArchimedesSpiral02;
import com.yarasa.math.polars.Cardiod01;
import com.yarasa.math.polars.Cardiod02;
import com.yarasa.math.polars.Cardiod03;
import com.yarasa.math.polars.ParabolicSpiral01;
import com.yarasa.math.polars.ParabolicSpiral02;
import com.yarasa.math.polars.Rosacea01;
import com.yarasa.math.polars.Rosacea02;
import com.yarasa.math.polars.Rosacea03;

public class EquationsDatabase {
    public static PolarEquation[] equationList = {
        new Cardiod01(),
        new Cardiod02(),
        new Cardiod03(),
        new Rosacea01(),
        new Rosacea02(),
        new Rosacea03(),
        new ArchimedesSpiral01(),
        new ArchimedesSpiral02(),
        new ParabolicSpiral01(),
        new ParabolicSpiral02()
    };
}
