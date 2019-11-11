package com.gagan.secondassignmentrecyclerview.Model;

public class ClassModelPresident {

    private int imgId;
    private String name, detail;

    public ClassModelPresident() {
    }


    public ClassModelPresident(int imgId, String name, String detail) {
        this.imgId = imgId;
        this.name = name;
        this.detail = detail;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
