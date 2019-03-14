package com.example.android.firebase;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Post {
    @SerializedName("q1")
    @Expose
    private String q1;
    @SerializedName("q2")
    @Expose
    private String q2;
    @SerializedName("q3")
    @Expose
    private String q3;
    @SerializedName("q4")
    @Expose
    private String q4;

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }
}
