package com.example.finalhomework.bean;

public class UserInfo {
    public long rowid;
    public int sn;
    public String name;
    public int age;
    public long height;
    public float weight;
    public boolean sex;
    public String update_time;
    public String phone;
    public String pwd;

    public UserInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        age = 0;
        height = 0L;
        weight = 0.0f;
        sex = false;
        update_time = "";
        phone = "";
        pwd = "";

    }
}