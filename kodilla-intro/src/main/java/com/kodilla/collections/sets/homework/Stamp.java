package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    private String stampName;
    private double stampSize;
    private boolean stampSeal;

    public Stamp(String stampsName, double stampsSize, boolean stampsSeal) {
        this.stampName = stampsName;
        this.stampSize = stampsSize;
        this.stampSeal = stampsSeal;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampSize() {
        return stampSize;
    }

    public boolean isStampSeal() {
        return stampSeal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampSize, stampSize) == 0 && stampSeal == stamp.stampSeal && Objects.equals(stampName, stamp.stampName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stampSeal);
    }

    @Override
    public String toString() {
        return "Stamps{" +
                "stampsName='" + stampName + '\'' +
                ", stampsSize=" + stampSize +
                ", stampsSeal=" + stampSeal +
                '}';
    }
}
