package com.example.yeshu.homework5.Models;

import org.json.JSONObject;

/**
 * Created by ITP on 4/11/2017.
 */

public class Q1_Result {

    int q1sd;
    int q1d;
    int q1n;
    int q1a;

    public Q1_Result(int q1sd, int q1d, int q1n, int q1a, int q1sa) {
        this.q1sd = q1sd;
        this.q1d = q1d;
        this.q1n = q1n;
        this.q1a = q1a;
        this.q1sa = q1sa;
    }

    public int getQ1sd() {
        return q1sd;
    }

    public void setQ1sd(int q1sd) {
        this.q1sd = q1sd;
    }

    public int getQ1d() {
        return q1d;
    }

    public void setQ1d(int q1d) {
        this.q1d = q1d;
    }

    public int getQ1n() {
        return q1n;
    }

    public void setQ1n(int q1n) {
        this.q1n = q1n;
    }

    public int getQ1a() {
        return q1a;
    }

    public void setQ1a(int q1a) {
        this.q1a = q1a;
    }

    public int getQ1sa() {
        return q1sa;
    }

    public void setQ1sa(int q1sa) {
        this.q1sa = q1sa;
    }

    int q1sa;

}
