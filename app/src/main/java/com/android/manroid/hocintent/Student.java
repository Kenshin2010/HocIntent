package com.android.manroid.hocintent;

import java.io.Serializable;

/**
 * Created by Manroid on 26/02/2017.
 */

public class Student implements Serializable {
    private String name;
    private String mobile;

    public Student(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

