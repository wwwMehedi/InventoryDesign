package com.tolet.sajib.inventorydesign.model;

public class ModelCarditem {
    String cpname;
    String ac;
    String cpgsm;
    public void ModelCarditem(){

    }

    public ModelCarditem(String cpname, String ac, String cpgsm) {
        this.cpname = cpname;
        this.ac = ac;
        this.cpgsm = cpgsm;
    }

    public String getCpname() {
        return cpname;
    }

    public void setCpname(String cpname) {
        this.cpname = cpname;
    }

    public String getAc() {
        return ac;
    }

    public void setAc(String ac) {
        this.ac = ac;
    }

    public String getCpgsm() {
        return cpgsm;
    }

    public void setCpgsm(String cpgsm) {
        this.cpgsm = cpgsm;
    }
}
