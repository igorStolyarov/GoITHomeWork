package com.goit.gojavaonlinethree.student.igorstolyarov.module03.files;
import java.util.Date;

public abstract class Files {

    private String name;
    private double size;
    private Date date;
    private Date creatData;
    private Date modyfi;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getCreatData() {
        return creatData;
    }

    public void setCreatData(Date creatData) {
        this.creatData = creatData;
    }

    public Date getModyfi() {
        return modyfi;
    }

    public void setModyfi(Date modyfi) {
        this.modyfi = modyfi;
    }

}
