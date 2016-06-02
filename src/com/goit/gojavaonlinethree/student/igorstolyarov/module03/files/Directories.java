package com.goit.gojavaonlinethree.student.igorstolyarov.module03.files;

import java.util.List;

public class Directories extends Files {
    private List <Files> files;
    private List<Directories> directories;
    public List<Files> getFiles() {
        return files;
    }

    public void setFiles(List<Files> files) {
        this.files = files;
    }

    public List<Directories> getDirectories() {
        return directories;
    }

    public void setDirectories(List<Directories> directories) {
        this.directories = directories;
    }
}
