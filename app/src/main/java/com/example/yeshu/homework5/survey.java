package com.example.yeshu.homework5;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ViewFlipper;

import com.example.yeshu.homework5.Models.Q1_Result;
import com.example.yeshu.homework5.Models.Q2_Result;
import com.example.yeshu.homework5.Models.Q3_Result;
import com.example.yeshu.homework5.Models.Q4_Result;
import com.example.yeshu.homework5.Models.Q5_Result;
import com.example.yeshu.homework5.Models.Result_Model;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class survey extends AppCompatActivity {

    private static final String TAG = "MyActivity";
    ViewFlipper vf;
    private float lastX;
    SharedPreferences myprefs;
    SharedPreferences sp;
    Boolean clicked = false;
    RadioButton rb;
    Button sav_sub, gohome;
    public static int st_ag1, ag1, nu1, da1, st_da1;
    public static int st_ag2, ag2, nu2, da2, st_da2;
    public String q11, q12, q13, q14, q15, q16, q17, q18, q19, q110, q111, q112, q21, q22, q23, q24, q25, q26, q27, q31, q32, q33, q34, q35, q4, q5;
    public String s1, s2, s3, s4, s5;

    private DatabaseReference mFirebaseDatabase;
    private FirebaseDatabase mFirebaseInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey);

        vf = (ViewFlipper) findViewById(R.id.vf_q1);

        //----------------set shared preferences-----------------
        myprefs = PreferenceManager.getDefaultSharedPreferences(this);

        mFirebaseInstance = FirebaseDatabase.getInstance();

        // get reference to 'result' node
        mFirebaseDatabase = mFirebaseInstance.getReference("result");


        //=Q1=
        int c11 = myprefs.getInt("q11", 0);
        if (c11 != 0) {
            rb = (RadioButton) findViewById(c11);
            rb.setChecked(true);
        }

        int c12 = myprefs.getInt("q12", 0);
        if (c12 != 0) {
            rb = (RadioButton) findViewById(c12);
            rb.setChecked(true);
        }

        int c13 = myprefs.getInt("q13", 0);
        if (c13 != 0) {
            rb = (RadioButton) findViewById(c13);
            rb.setChecked(true);
        }

        int c14 = myprefs.getInt("q14", 0);
        if (c14 != 0) {
            rb = (RadioButton) findViewById(c14);
            rb.setChecked(true);
        }

        int c15 = myprefs.getInt("q15", 0);
        if (c15 != 0) {
            rb = (RadioButton) findViewById(c15);
            rb.setChecked(true);
        }

        int c16 = myprefs.getInt("q16", 0);
        if (c16 != 0) {
            rb = (RadioButton) findViewById(c16);
            rb.setChecked(true);
        }

        int c17 = myprefs.getInt("q17", 0);
        if (c17 != 0) {
            rb = (RadioButton) findViewById(c17);
            rb.setChecked(true);
        }

        int c18 = myprefs.getInt("q18", 0);
        if (c18 != 0) {
            rb = (RadioButton) findViewById(c18);
            rb.setChecked(true);
        }

        int c19 = myprefs.getInt("q19", 0);
        if (c19 != 0) {
            rb = (RadioButton) findViewById(c19);
            rb.setChecked(true);
        }

        int c110 = myprefs.getInt("q110", 0);
        if (c110 != 0) {
            rb = (RadioButton) findViewById(c110);
            rb.setChecked(true);
        }

        int c111 = myprefs.getInt("q111", 0);
        if (c111 != 0) {
            rb = (RadioButton) findViewById(c111);
            rb.setChecked(true);
        }

        int c112 = myprefs.getInt("q112", 0);
        if (c112 != 0) {
            rb = (RadioButton) findViewById(c112);
            rb.setChecked(true);
        }

        //=q2=

        int c21 = myprefs.getInt("q21", 0);
        if (c21 != 0) {
            rb = (RadioButton) findViewById(c21);
            rb.setChecked(true);
        }

        int c22 = myprefs.getInt("q22", 0);
        if (c22 != 0) {
            rb = (RadioButton) findViewById(c22);
            rb.setChecked(true);
        }

        int c23 = myprefs.getInt("q23", 0);
        if (c23 != 0) {
            rb = (RadioButton) findViewById(c23);
            rb.setChecked(true);
        }

        int c24 = myprefs.getInt("q24", 0);
        if (c24 != 0) {
            rb = (RadioButton) findViewById(c24);
            rb.setChecked(true);
        }

        int c25 = myprefs.getInt("q25", 0);
        if (c25 != 0) {
            rb = (RadioButton) findViewById(c25);
            rb.setChecked(true);
        }

        int c26 = myprefs.getInt("q26", 0);
        if (c26 != 0) {
            rb = (RadioButton) findViewById(c26);
            rb.setChecked(true);
        }

        int c27 = myprefs.getInt("q27", 0);
        if (c27 != 0) {
            rb = (RadioButton) findViewById(c27);
            rb.setChecked(true);
        }
        //=q3=

        int c31 = myprefs.getInt("q31", 0);
        if (c31 != 0) {
            rb = (RadioButton) findViewById(c31);
            rb.setChecked(true);
        }

        int c32 = myprefs.getInt("q32", 0);
        if (c32 != 0) {
            rb = (RadioButton) findViewById(c32);
            rb.setChecked(true);
        }

        int c33 = myprefs.getInt("q33", 0);
        if (c33 != 0) {
            rb = (RadioButton) findViewById(c33);
            rb.setChecked(true);
        }

        int c34 = myprefs.getInt("q34", 0);
        if (c34 != 0) {
            rb = (RadioButton) findViewById(c34);
            rb.setChecked(true);
        }

        int c35 = myprefs.getInt("q35", 0);
        if (c35 != 0) {
            rb = (RadioButton) findViewById(c35);
            rb.setChecked(true);
        }

        //=q4=
        String c4 = myprefs.getString("q4", null);
        if (c4 != null) {
            EditText ec4 = (EditText) findViewById(R.id.q4);
            ec4.setText(c4);

        }

        //=q5=
        String c5 = myprefs.getString("q5", null);
        if (c5 != null) {
            EditText ec5 = (EditText) findViewById(R.id.q5);
            ec5.setText(c5);

        }

        //---------------------------------------------------------


        sav_sub = (Button) findViewById(R.id.sub_sur);
        sav_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), result.class);
                Bundle bundle = new Bundle();

                String sa = "Strongly Agree";
                String a = "Agree";
                String n = "Neutral ";
                String d = "Disagree";
                String sd = "Strongly Disagree";

                //=====Question-1=====

                st_ag1 = 0;
                ag1 = 0;
                nu1 = 0;
                da1 = 0;
                st_da1 = 0;

                if (q11.equals(sa)) {
                    st_ag1++;
                } else if (q11.equals(a)) {
                    ag1++;
                } else if (q11.equals(n)) {
                    nu1++;
                } else if (q11.equals(d)) {
                    da1++;
                } else if (q11.equals(sd)) {
                    st_da1++;
                }

                //---------
                if (q12.equals(sa)) {
                    st_ag1++;
                } else if (q12.equals(a)) {
                    ag1++;
                } else if (q12.equals(n)) {
                    nu1++;
                } else if (q12.equals(d)) {
                    da1++;
                } else if (q12.equals(sd)) {
                    st_da1++;
                }


                //--------
                if (q13.equals(sa)) {
                    st_ag1++;
                } else if (q13.equals(a)) {
                    ag1++;
                } else if (q13.equals(n)) {
                    nu1++;
                } else if (q13.equals(d)) {
                    da1++;
                } else if (q13.equals(sd)) {
                    st_da1++;
                }

                //-----
                if (q14.equals(sa)) {
                    st_ag1++;
                } else if (q14.equals(a)) {
                    ag1++;
                } else if (q14.equals(n)) {
                    nu1++;
                } else if (q14.equals(d)) {
                    da1++;
                } else if (q14.equals(sd)) {
                    st_da1++;
                }

                //----------
                if (q15.equals(sa)) {
                    st_ag1++;
                } else if (q15.equals(a)) {
                    ag1++;
                } else if (q15.equals(n)) {
                    nu1++;
                } else if (q15.equals(d)) {
                    da1++;
                } else if (q15.equals(sd)) {
                    st_da1++;
                }

                //-----------
                if (q16.equals(sa)) {
                    st_ag1++;
                } else if (q16.equals(a)) {
                    ag1++;
                } else if (q16.equals(n)) {
                    nu1++;
                } else if (q16.equals(d)) {
                    da1++;
                } else if (q16.equals(sd)) {
                    st_da1++;
                }

                //--------
                if (q17.equals(sa)) {
                    st_ag1++;
                } else if (q17.equals(a)) {
                    ag1++;
                } else if (q17.equals(n)) {
                    nu1++;
                } else if (q17.equals(d)) {
                    da1++;
                } else if (q17.equals(sd)) {
                    st_da1++;
                }

                //----------
                if (q18.equals(sa)) {
                    st_ag1++;
                } else if (q18.equals(a)) {
                    ag1++;
                } else if (q18.equals(n)) {
                    nu1++;
                } else if (q18.equals(d)) {
                    da1++;
                } else if (q18.equals(sd)) {
                    st_da1++;
                }

                //---------
                if (q19.equals(sa)) {
                    st_ag1++;
                } else if (q19.equals(a)) {
                    ag1++;
                } else if (q19.equals(n)) {
                    nu1++;
                } else if (q19.equals(d)) {
                    da1++;
                } else if (q19.equals(sd)) {
                    st_da1++;
                }

                //----------
                if (q110.equals(sa)) {
                    st_ag1++;
                } else if (q110.equals(a)) {
                    ag1++;
                } else if (q110.equals(n)) {
                    nu1++;
                } else if (q110.equals(d)) {
                    da1++;
                } else if (q110.equals(sd)) {
                    st_da1++;
                }

                //-----------
                if (q111.equals(sa)) {
                    st_ag1++;
                } else if (q111.equals(a)) {
                    ag1++;
                } else if (q111.equals(n)) {
                    nu1++;
                } else if (q111.equals(d)) {
                    da1++;
                } else if (q111.equals(sd)) {
                    st_da1++;
                }

                //-----------
                if (q112.equals(sa)) {
                    st_ag1++;
                } else if (q112.equals(a)) {
                    ag1++;
                } else if (q112.equals(n)) {
                    nu1++;
                } else if (q112.equals(d)) {
                    da1++;
                } else if (q112.equals(sd)) {
                    st_da1++;
                }

                bundle.putInt("q1sd", st_da1);
                bundle.putInt("q1d", da1);
                bundle.putInt("q1n", nu1);
                bundle.putInt("q1a", ag1);
                bundle.putInt("q1sa", st_ag1);

                Q1_Result q1_result = new Q1_Result(st_da1, da1, nu1, ag1, st_ag1);


                //=====Question-2=====

                st_ag2 = 0;
                ag2 = 0;
                nu2 = 0;
                da2 = 0;
                st_da2 = 0;


                if (q21.equals(sa)) {
                    st_ag2++;
                } else if (q21.equals(a)) {
                    ag2++;
                } else if (q21.equals(n)) {
                    nu2++;
                } else if (q21.equals(d)) {
                    da2++;
                } else if (q21.equals(sd)) {
                    st_da2++;
                }

                //-----------
                if (q22.equals(sa)) {
                    st_ag2++;
                } else if (q22.equals(a)) {
                    ag2++;
                } else if (q22.equals(n)) {
                    nu2++;
                } else if (q22.equals(d)) {
                    da2++;
                } else if (q22.equals(sd)) {
                    st_da2++;
                }

                //------------
                if (q23.equals(sa)) {
                    st_ag2++;
                } else if (q23.equals(a)) {
                    ag2++;
                } else if (q23.equals(n)) {
                    nu2++;
                } else if (q23.equals(d)) {
                    da2++;
                } else if (q23.equals(sd)) {
                    st_da2++;
                }

                //--------------
                if (q24.equals(sa)) {
                    st_ag2++;
                } else if (q24.equals(a)) {
                    ag2++;
                } else if (q24.equals(n)) {
                    nu2++;
                } else if (q24.equals(d)) {
                    da2++;
                } else if (q24.equals(sd)) {
                    st_da2++;
                }

                //--------------
                if (q25.equals(sa)) {
                    st_ag2++;
                } else if (q25.equals(a)) {
                    ag2++;
                } else if (q25.equals(n)) {
                    nu2++;
                } else if (q25.equals(d)) {
                    da2++;
                } else if (q25.equals(sd)) {
                    st_da2++;
                }

                //-------------
                if (q26.equals(sa)) {
                    st_ag2++;
                } else if (q26.equals(a)) {
                    ag2++;
                } else if (q26.equals(n)) {
                    nu2++;
                } else if (q26.equals(d)) {
                    da2++;
                } else if (q26.equals(sd)) {
                    st_da2++;
                }

                //---------------
                if (q27.equals(sa)) {
                    st_ag2++;
                } else if (q27.equals(a)) {
                    ag2++;
                } else if (q27.equals(n)) {
                    nu2++;
                } else if (q27.equals(d)) {
                    da2++;
                } else if (q27.equals(sd)) {
                    st_da2++;
                }


                bundle.putInt("q2sd", st_da2);
                bundle.putInt("q2d", da2);
                bundle.putInt("q2n", nu2);
                bundle.putInt("q2a", ag2);
                bundle.putInt("q2sa", st_ag2);

                Q2_Result q2_result = new Q2_Result(st_da2, da2, nu2, ag2, st_ag2);


                //=====Question-3=====


                bundle.putString("q31", q31);
                bundle.putString("q32", q32);
                bundle.putString("q33", q33);
                bundle.putString("q34", q34);
                bundle.putString("q35", q35);

                Q3_Result q3_result = new Q3_Result(q31, q32, q33, q34, q35);
                //=====Question-4=====

                bundle.putString("q4", q4);

                Q4_Result q4_result = new Q4_Result(q4);
                //=====Question-5=====

                bundle.putString("q5", q5);

                Q5_Result q5_result = new Q5_Result(q5);


                Result_Model result_model = new Result_Model(q1_result, q2_result, q3_result, q4_result, q5_result);


                mFirebaseDatabase.child("Result").setValue(result_model);

                intent.putExtras(bundle);
                //Intent in = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

                //--------------------------------------------------------------

                clicked = true;

                s1 = "QUESTION 1\n" + "Strongly Disagree = " + bundle.getInt("q1sd") + "\n" + "Disagree = " + bundle.getInt("q1d") + "\n" + "Neutral = " + bundle.getInt("q1n") + "\n" + "Agree = " + bundle.getInt("q1a") + "\n" + "Strongly Agree = " + bundle.getInt("q1sa");
                s2 = "QUESTION 2\n" + "Strongly Disagree = " + bundle.getInt("q2sd") + "\n" + "Disagree = " + bundle.getInt("q2d") + "\n" + "Neutral = " + bundle.getInt("q2n") + "\n" + "Agree = " + bundle.getInt("q2a") + "\n" + "Strongly Agree = " + bundle.getInt("q2sa");
                s3 = "QUESTION 3\n" + "Student is:\n" + bundle.getString("q31") + "\n" + bundle.getString("q32") + "\n" + bundle.getString("q33") + "\n" + bundle.getString("q34") + "\n" + bundle.getString("q35");
                s4 = "QUESTION 4\n" + bundle.getString("q4");
                s5 = "QUESTION 5\n" + bundle.getString("q5");

                myprefs.edit().clear().commit();

            }
        });


        gohome = (Button) findViewById(R.id.go_home);
        gohome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myprefs.edit().clear().commit();

                Intent in = new Intent(getApplicationContext(), MainActivity.class);
                in.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(in);
                finish();
            }
        });


    }

    public boolean onTouchEvent(MotionEvent touchevent) {

        //=====Question-1=====

        RadioGroup rg11 = (RadioGroup) findViewById(R.id.rg1_1);
        if (rg11.getCheckedRadioButtonId() != -1) {
            RadioButton rb11 = (RadioButton) findViewById(rg11.getCheckedRadioButtonId());
            q11 = rb11.getText().toString();
            myprefs.edit().putInt("q11", rg11.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg12 = (RadioGroup) findViewById(R.id.rg1_2);
        if (rg12.getCheckedRadioButtonId() != -1) {
            RadioButton rb12 = (RadioButton) findViewById(rg12.getCheckedRadioButtonId());
            q12 = rb12.getText().toString();
            myprefs.edit().putInt("q12", rg12.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg13 = (RadioGroup) findViewById(R.id.rg1_3);
        if (rg13.getCheckedRadioButtonId() != -1) {
            RadioButton rb13 = (RadioButton) findViewById(rg13.getCheckedRadioButtonId());
            q13 = rb13.getText().toString();
            myprefs.edit().putInt("q13", rg13.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg14 = (RadioGroup) findViewById(R.id.rg1_4);
        if (rg14.getCheckedRadioButtonId() != -1) {
            RadioButton rb14 = (RadioButton) findViewById(rg14.getCheckedRadioButtonId());
            q14 = rb14.getText().toString();
            myprefs.edit().putInt("q14", rg14.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg15 = (RadioGroup) findViewById(R.id.rg1_5);
        if (rg15.getCheckedRadioButtonId() != -1) {
            RadioButton rb15 = (RadioButton) findViewById(rg15.getCheckedRadioButtonId());
            q15 = rb15.getText().toString();
            myprefs.edit().putInt("q15", rg15.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg16 = (RadioGroup) findViewById(R.id.rg1_6);
        if (rg16.getCheckedRadioButtonId() != -1) {
            RadioButton rb16 = (RadioButton) findViewById(rg16.getCheckedRadioButtonId());
            q16 = rb16.getText().toString();
            myprefs.edit().putInt("q16", rg16.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg17 = (RadioGroup) findViewById(R.id.rg1_7);
        if (rg17.getCheckedRadioButtonId() != -1) {
            RadioButton rb17 = (RadioButton) findViewById(rg17.getCheckedRadioButtonId());
            q17 = rb17.getText().toString();
            myprefs.edit().putInt("q17", rg17.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg18 = (RadioGroup) findViewById(R.id.rg1_8);
        if (rg18.getCheckedRadioButtonId() != -1) {
            RadioButton rb18 = (RadioButton) findViewById(rg18.getCheckedRadioButtonId());
            q18 = rb18.getText().toString();
            myprefs.edit().putInt("q18", rg18.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg19 = (RadioGroup) findViewById(R.id.rg1_9);
        if (rg19.getCheckedRadioButtonId() != -1) {
            RadioButton rb19 = (RadioButton) findViewById(rg19.getCheckedRadioButtonId());
            q19 = rb19.getText().toString();
            myprefs.edit().putInt("q19", rg19.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg110 = (RadioGroup) findViewById(R.id.rg1_10);
        if (rg110.getCheckedRadioButtonId() != -1) {
            RadioButton rb110 = (RadioButton) findViewById(rg110.getCheckedRadioButtonId());
            q110 = rb110.getText().toString();
            myprefs.edit().putInt("q110", rg110.getCheckedRadioButtonId()).commit();
        }
        RadioGroup rg111 = (RadioGroup) findViewById(R.id.rg1_11);
        if (rg111.getCheckedRadioButtonId() != -1) {
            RadioButton rb111 = (RadioButton) findViewById(rg111.getCheckedRadioButtonId());
            q111 = rb111.getText().toString();
            myprefs.edit().putInt("q111", rg111.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg112 = (RadioGroup) findViewById(R.id.rg1_12);
        if (rg112.getCheckedRadioButtonId() != -1) {
            RadioButton rb112 = (RadioButton) findViewById(rg112.getCheckedRadioButtonId());
            q112 = rb112.getText().toString();
            myprefs.edit().putInt("q112", rg112.getCheckedRadioButtonId()).commit();
        }

        //=====Question-2=====

        RadioGroup rg21 = (RadioGroup) findViewById(R.id.rg2_1);
        if (rg21.getCheckedRadioButtonId() != -1) {
            RadioButton rb21 = (RadioButton) findViewById(rg21.getCheckedRadioButtonId());
            q21 = rb21.getText().toString();
            myprefs.edit().putInt("q21", rg21.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg22 = (RadioGroup) findViewById(R.id.rg2_2);
        if (rg22.getCheckedRadioButtonId() != -1) {
            RadioButton rb22 = (RadioButton) findViewById(rg22.getCheckedRadioButtonId());
            q22 = rb22.getText().toString();
            myprefs.edit().putInt("q22", rg22.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg23 = (RadioGroup) findViewById(R.id.rg2_3);
        if (rg23.getCheckedRadioButtonId() != -1) {
            RadioButton rb23 = (RadioButton) findViewById(rg23.getCheckedRadioButtonId());
            q23 = rb23.getText().toString();
            myprefs.edit().putInt("q23", rg23.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg24 = (RadioGroup) findViewById(R.id.rg2_4);
        if (rg24.getCheckedRadioButtonId() != -1) {
            RadioButton rb24 = (RadioButton) findViewById(rg24.getCheckedRadioButtonId());
            q24 = rb24.getText().toString();
            myprefs.edit().putInt("q24", rg24.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg25 = (RadioGroup) findViewById(R.id.rg2_5);
        if (rg25.getCheckedRadioButtonId() != -1) {
            RadioButton rb25 = (RadioButton) findViewById(rg25.getCheckedRadioButtonId());
            q25 = rb25.getText().toString();
            myprefs.edit().putInt("q25", rg25.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg26 = (RadioGroup) findViewById(R.id.rg2_6);
        if (rg26.getCheckedRadioButtonId() != -1) {
            RadioButton rb26 = (RadioButton) findViewById(rg26.getCheckedRadioButtonId());
            q26 = rb26.getText().toString();
            myprefs.edit().putInt("q26", rg26.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg27 = (RadioGroup) findViewById(R.id.rg2_7);
        if (rg27.getCheckedRadioButtonId() != -1) {
            RadioButton rb27 = (RadioButton) findViewById(rg27.getCheckedRadioButtonId());
            q27 = rb27.getText().toString();
            myprefs.edit().putInt("q27", rg27.getCheckedRadioButtonId()).commit();
        }

        //=====Question-3=====

        RadioGroup rg31 = (RadioGroup) findViewById(R.id.rg3_1);
        if (rg31.getCheckedRadioButtonId() != -1) {
            RadioButton rb31 = (RadioButton) findViewById(rg31.getCheckedRadioButtonId());
            q31 = rb31.getText().toString();
            myprefs.edit().putInt("q31", rg31.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg32 = (RadioGroup) findViewById(R.id.rg3_2);
        if (rg32.getCheckedRadioButtonId() != -1) {
            RadioButton rb32 = (RadioButton) findViewById(rg32.getCheckedRadioButtonId());
            q32 = rb32.getText().toString();
            myprefs.edit().putInt("q32", rg32.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg33 = (RadioGroup) findViewById(R.id.rg3_3);
        if (rg33.getCheckedRadioButtonId() != -1) {
            RadioButton rb33 = (RadioButton) findViewById(rg33.getCheckedRadioButtonId());
            q33 = rb33.getText().toString();
            myprefs.edit().putInt("q33", rg33.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg34 = (RadioGroup) findViewById(R.id.rg3_4);
        if (rg34.getCheckedRadioButtonId() != -1) {
            RadioButton rb34 = (RadioButton) findViewById(rg11.getCheckedRadioButtonId());
            q34 = rb34.getText().toString();
            myprefs.edit().putInt("q34", rg34.getCheckedRadioButtonId()).commit();
        }

        RadioGroup rg35 = (RadioGroup) findViewById(R.id.rg3_5);
        if (rg35.getCheckedRadioButtonId() != -1) {
            RadioButton rb35 = (RadioButton) findViewById(rg11.getCheckedRadioButtonId());
            q35 = rb35.getText().toString();
            myprefs.edit().putInt("q35", rg35.getCheckedRadioButtonId()).commit();
        }

        //=====Question-4=====

        EditText eq4 = (EditText) findViewById(R.id.q4);
        q4 = eq4.getText().toString();
        myprefs.edit().putString("q4", q4).commit();


        //=====Question-5=====

        EditText eq5 = (EditText) findViewById(R.id.q5);
        q5 = eq5.getText().toString();
        myprefs.edit().putString("q5", q5).commit();

        //-------------------------------------------------------------------------

        switch (touchevent.getAction()) {
            // when user first touches the screen to swap
            case MotionEvent.ACTION_DOWN: {
                lastX = touchevent.getX();
                break;
            }
            case MotionEvent.ACTION_UP: {
                float currentX = touchevent.getX();

                // if left to right swipe on screen
                if (lastX < currentX) {
                    // If no more View/Child to flip
                    if (vf.getDisplayedChild() == 0)
                        break;

                    vf.showPrevious();
                }

                // if right to left swipe on screen
                if (lastX > currentX) {
                    vf.showNext();
                }
                break;
            }
        }

        return false;
    }


}