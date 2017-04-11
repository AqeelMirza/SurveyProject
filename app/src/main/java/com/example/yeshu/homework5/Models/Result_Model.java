package com.example.yeshu.homework5.Models;

/**
 * Created by ITP on 4/11/2017.
 */

public class Result_Model {

    Q1_Result q1_result;
    Q2_Result q2_result;
    Q3_Result q3_result;
    Q4_Result q4_result;
    Q5_Result q5_result;

    public Q1_Result getQ1_result() {
        return q1_result;
    }

    public void setQ1_result(Q1_Result q1_result) {
        this.q1_result = q1_result;
    }

    public Q2_Result getQ2_result() {
        return q2_result;
    }

    public void setQ2_result(Q2_Result q2_result) {
        this.q2_result = q2_result;
    }

    public Q3_Result getQ3_result() {
        return q3_result;
    }

    public void setQ3_result(Q3_Result q3_result) {
        this.q3_result = q3_result;
    }

    public Q4_Result getQ4_result() {
        return q4_result;
    }

    public void setQ4_result(Q4_Result q4_result) {
        this.q4_result = q4_result;
    }

    public Q5_Result getQ5_result() {
        return q5_result;
    }

    public void setQ5_result(Q5_Result q5_result) {
        this.q5_result = q5_result;
    }

    public Result_Model(Q1_Result q1_result, Q2_Result q2_result, Q3_Result q3_result, Q4_Result q4_result, Q5_Result q5_result) {

        this.q1_result = q1_result;
        this.q2_result = q2_result;
        this.q3_result = q3_result;
        this.q4_result = q4_result;
        this.q5_result = q5_result;
    }
}
