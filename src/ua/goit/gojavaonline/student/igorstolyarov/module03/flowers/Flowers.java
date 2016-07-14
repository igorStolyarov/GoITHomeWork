package ua.goit.gojavaonline.student.igorstolyarov.module03.flowers;

import java.util.List;

public class Flowers {
    private String color;
    private int amounts;
    private String maufactor;
    private List <MakeABouquet> makeABouquet;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmounts() {
        return amounts;
    }

    public void setAmounts(int amounts) {
        this.amounts = amounts;
    }

    public String getMaufactor() {
        return maufactor;
    }

    public void setMaufactor(String maufactor) {
        this.maufactor = maufactor;
    }

}
