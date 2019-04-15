package vn.edu.tdc.fit.myapplication;

import java.io.Serializable;

public class Song implements Serializable {

    public Song(String tenbaihat, int hinhAnh, int file) {
        this.tenbaihat = tenbaihat;
        this.hinhAnh = hinhAnh;
        File = file;
    }

    public String getTenbaihat() {
        return tenbaihat;
    }

    public void setTenbaihat(String tenbaihat) {
        this.tenbaihat = tenbaihat;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public int getFile() {
        return File;
    }

    public void setFile(int file) {
        File = file;
    }

    private String tenbaihat;
    private int hinhAnh;
    private int File;

}
