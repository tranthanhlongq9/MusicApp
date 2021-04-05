package com.example.myapplication.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Playlist implements Serializable {

@SerializedName("Idplaylist")
@Expose
private String idplaylist;
@SerializedName("Ten")
@Expose
private String ten;
@SerializedName("Hinhnen")
@Expose
private String hinhnen;
@SerializedName("Hinhicon")
@Expose
private String hinhicon;

public String getIdplaylist() {
return idplaylist;
}

public void setIdplaylist(String idplaylist) {
this.idplaylist = idplaylist;
}

public String getTen() {
return ten;
}

public void setTen(String ten) {
this.ten = ten;
}

public String getHinhnen() {
return hinhnen;
}

public void setHinhnen(String hinhnen) {
this.hinhnen = hinhnen;
}

public String getHinhicon() {
return hinhicon;
}

public void setHinhicon(String hinhicon) {
this.hinhicon = hinhicon;
}

}