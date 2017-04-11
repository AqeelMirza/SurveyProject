package com.example.yeshu.homework5;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.example.yeshu.homework5.Models.Q1_Result;
import com.example.yeshu.homework5.Models.Result_Model;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.json.JSONException;
import org.json.JSONObject;

public class result extends AppCompatActivity {

    Boolean clicked;
    FirebaseDatabase database;
    DatabaseReference myRef;
    String TAG = "Result_Activity";
    TextView tv1, tv2, tv3, tv4, tv5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundle = getIntent().getExtras();

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("result");

        tv1 = (TextView) findViewById(R.id.r1);
        tv2 = (TextView) findViewById(R.id.r2);
        tv3 = (TextView) findViewById(R.id.r3);
        tv4 = (TextView) findViewById(R.id.r4);
        tv5 = (TextView) findViewById(R.id.r5);


        if (bundle != null) {

            tv1.setText("QUESTION 1\n" + "Strongly Disagree = " + bundle.getInt("q1sd") + "\n" + "Disagree = " + bundle.getInt("q1d") + "\n" + "Neutral = " + bundle.getInt("q1n") + "\n" + "Agree = " + bundle.getInt("q1a") + "\n" + "Strongly Agree = " + bundle.getInt("q1sa"));
            tv2.setText("QUESTION 2\n" + "Strongly Disagree = " + bundle.getInt("q2sd") + "\n" + "Disagree = " + bundle.getInt("q2d") + "\n" + "Neutral = " + bundle.getInt("q2n") + "\n" + "Agree = " + bundle.getInt("q2a") + "\n" + "Strongly Agree = " + bundle.getInt("q2sa"));
            tv3.setText("QUESTION 3\n" + "Student is:\n" + bundle.getString("q31") + "\n" + bundle.getString("q32") + "\n" + bundle.getString("q33") + "\n" + bundle.getString("q34") + "\n" + bundle.getString("q35"));
            tv4.setText("QUESTION 4\n" + bundle.getString("q4"));
            tv5.setText("QUESTION 5\n" + bundle.getString("q5"));
        } else {
            getData();

        }


    }

    void getData() {
//https://surveyhomework-a0f02.firebaseio.com/result.json
        String url = "https://surveyhomework-a0f02.firebaseio.com/result.json";

        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();

        JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.d(TAG, response.toString());
                        pDialog.hide();

                        try {
                            JSONObject jsonObject = new JSONObject(response.toString());
                            JSONObject result_obj = jsonObject.getJSONObject("Result");

                            JSONObject result_1 = result_obj.getJSONObject("q1_result");
                            String q1a = result_1.getString("q1a");
                            String q1d = result_1.getString("q1d");
                            String q1n = result_1.getString("q1n");
                            String q1sa = result_1.getString("q1sa");
                            String q1sd = result_1.getString("q1sd");

                            tv1.setText("QUESTION 1\n" + "Strongly Disagree = " + q1sd + "\n" + "Disagree = " + q1d + "\n" + "Neutral = " + q1n + "\n" + "Agree = " + q1a + "\n" + "Strongly Agree = " + q1sa);

                            JSONObject result_2 = result_obj.getJSONObject("q2_result");
                            String q2a = result_2.getString("q2a");
                            String q2d = result_2.getString("q2d");
                            String q2n = result_2.getString("q2n");
                            String q2sa = result_2.getString("q2sa");
                            String q2sd = result_2.getString("q2sd");

                            tv2.setText("QUESTION 2\n" + "Strongly Disagree = " + q2sd + "\n" + "Disagree = " + q2d + "\n" + "Neutral = " + q2n + "\n" + "Agree = " + q2a + "\n" + "Strongly Agree = " + q2sa);


                            JSONObject result_3 = result_obj.getJSONObject("q3_result");
                            String q31 = result_3.getString("q31");
                            String q32 = result_3.getString("q32");
                            String q33 = result_3.getString("q33");
                            String q34 = result_3.getString("q34");
                            String q35 = result_3.getString("q35");

                            tv3.setText("QUESTION 3\n" + "Student is:\n" + q31 + "\n" + q32 + "\n" + q33 + "\n" + q34 + "\n" + q35);


                            JSONObject result_4 = result_obj.getJSONObject("q4_result");
                            String q4 = result_4.getString("q4");

                            tv4.setText("QUESTION 4\n" + q4);


                            JSONObject result_5 = result_obj.getJSONObject("q5_result");
                            String q5 = result_5.getString("q5");
                            tv5.setText("QUESTION 5\n" + q5);

                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                // hide the progress dialog
                Toast.makeText(result.this, "Survey not submitted", Toast.LENGTH_SHORT).show();
                TextView tv = (TextView) findViewById(R.id.r3);
                tv.setText("Survey not submitted");
                pDialog.hide();
            }
        });

// Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonObjReq);


    }

}