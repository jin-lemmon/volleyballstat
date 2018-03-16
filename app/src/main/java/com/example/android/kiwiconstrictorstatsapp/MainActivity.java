package com.example.android.kiwiconstrictorstatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int set1atk1 = 0;
    int set1atk0 = 0;
    int set1srv1 = 0;
    int set1srv0 = 0;
    int set1def1 = 0;
    int set1def0 = 0;
    int set1pas1 = 0;
    int set1pas0 = 0;
    int hit1atk1 = 0;
    int hit1atk0 = 0;
    int hit1srv1 = 0;
    int hit1srv0 = 0;
    int hit1def1 = 0;
    int hit1def0 = 0;
    int hit1pas1 = 0;
    int hit1pas0 = 0;
    int mid1atk1 = 0;
    int mid1atk0 = 0;
    int mid1srv1 = 0;
    int mid1srv0 = 0;
    int mid1def1 = 0;
    int mid1def0 = 0;
    int mid1pas1 = 0;
    int mid1pas0 = 0;
    int set2atk1 = 0;
    int set2atk0 = 0;
    int set2srv1 = 0;
    int set2srv0 = 0;
    int set2def1 = 0;
    int set2def0 = 0;
    int set2pas1 = 0;
    int set2pas0 = 0;
    int hit2atk1 = 0;
    int hit2atk0 = 0;
    int hit2srv1 = 0;
    int hit2srv0 = 0;
    int hit2def1 = 0;
    int hit2def0 = 0;
    int hit2pas1 = 0;
    int hit2pas0 = 0;
    int mid2atk1 = 0;
    int mid2atk0 = 0;
    int mid2srv1 = 0;
    int mid2srv0 = 0;
    int mid2def1 = 0;
    int mid2def0 = 0;
    int mid2pas1 = 0;
    int mid2pas0 = 0;
    int libdef1 = 0;
    int libdef0 = 0;
    int libpas1 = 0;
    int libpas0 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set1srv1(View view) {
        set1srv1 += 1;
        set1srv0 += 1;
        set1point();
    }

    public void set1srv0(View view) {
        set1srv0 += 1;
        set1point();
    }

    public void set1atk1(View view) {
        set1atk1 += 1;
        set1atk0 += 1;
        set1point();
    }

    public void set1atk0(View view) {
        set1atk0 += 1;
        set1point();
    }

    public void set1def1(View view) {
        set1def1 += 1;
        set1def0 += 1;
        set1point();
    }

    public void set1def0(View view) {
        set1def0 += 1;
        set1point();
    }

    public void set1pas1(View view) {
        set1pas1 += 1;
        set1pas0 += 1;
        set1point();
    }

    public void set1pas0(View view) {
        set1pas0 += 1;
        set1point();
    }


    public void set1point() {
        String set1 = getString(R.string.srv);
        set1 += set1srv1 + "/" + set1srv0;
        set1 += "\n" + getString(R.string.atck);
        set1 += set1atk1 + "/" + set1atk0;
        set1 += "\n" + getString(R.string.dfns);
        set1 += set1def1 + "/" + set1def0;
        set1 += "\n" + getString(R.string.pass);
        set1 += set1pas1 + "/" + set1pas0;
        TextView set1A = findViewById(R.id.set1point);
        set1A.setText(set1);
    }

    public void hit1srv1(View view) {
        hit1srv1 += 1;
        hit1srv0 += 1;
        hit1point();
    }

    public void hit1srv0(View view) {
        hit1srv0 += 1;
        hit1point();
    }

    public void hit1atk1(View view) {
        hit1atk1 += 1;
        hit1atk0 += 1;
        hit1point();
    }

    public void hit1atk0(View view) {
        hit1atk0 += 1;
        hit1point();
    }

    public void hit1def1(View view) {
        hit1def1 += 1;
        hit1def0 += 1;
        hit1point();
    }

    public void hit1def0(View view) {
        hit1def0 += 1;
        hit1point();
    }

    public void hit1pas1(View view) {
        hit1pas1 += 1;
        hit1pas0 += 1;
        hit1point();
    }

    public void hit1pas0(View view) {
        hit1pas0 += 1;
        hit1point();
    }


    public void hit1point() {
        String hit1 = getString(R.string.srv);
        hit1 += hit1srv1 + "/" + hit1srv0;
        hit1 += "\n" + getString(R.string.atck);
        hit1 += hit1atk1 + "/" + hit1atk0;
        hit1 += "\n" + getString(R.string.dfns);
        hit1 += hit1def1 + "/" + hit1def0;
        hit1 += "\n" + getString(R.string.pass);
        hit1 += hit1pas1 + "/" + hit1pas0;
        TextView hit1A = findViewById(R.id.hit1point);
        hit1A.setText(hit1);
    }


    public void mid1srv1(View view) {
        mid1srv1 += 1;
        mid1srv0 += 1;
        mid1point();
    }

    public void mid1srv0(View view) {
        mid1srv0 += 1;
        mid1point();
    }

    public void mid1atk1(View view) {
        mid1atk1 += 1;
        mid1atk0 += 1;
        mid1point();
    }

    public void mid1atk0(View view) {
        mid1atk0 += 1;
        mid1point();
    }

    public void mid1def1(View view) {
        mid1def1 += 1;
        mid1def0 += 1;
        mid1point();
    }

    public void mid1def0(View view) {
        mid1def0 += 1;
        mid1point();
    }

    public void mid1pas1(View view) {
        mid1pas1 += 1;
        mid1pas0 += 1;
        mid1point();
    }

    public void mid1pas0(View view) {
        mid1pas0 += 1;
        mid1point();
    }


    public void mid1point() {
        String mid1 = getString(R.string.srv);
        mid1 += mid1srv1 + "/" + mid1srv0;
        mid1 += "\n" + getString(R.string.atck);
        mid1 += mid1atk1 + "/" + mid1atk0;
        mid1 += "\n" + getString(R.string.dfns);
        mid1 += mid1def1 + "/" + mid1def0;
        mid1 += "\n" + getString(R.string.pass);
        mid1 += mid1pas1 + "/" + mid1pas0;
        TextView mid1A = findViewById(R.id.mid1point);
        mid1A.setText(mid1);
    }

    public void set2srv1(View view) {
        set2srv1 += 1;
        set2srv0 += 1;
        set2point();
    }

    public void set2srv0(View view) {
        set2srv0 += 1;
        set2point();
    }

    public void set2atk1(View view) {
        set2atk1 += 1;
        set2atk0 += 1;
        set2point();
    }

    public void set2atk0(View view) {
        set2atk0 += 1;
        set2point();
    }

    public void set2def1(View view) {
        set2def1 += 1;
        set2def0 += 1;
        set2point();
    }

    public void set2def0(View view) {
        set2def0 += 1;
        set2point();
    }

    public void set2pas1(View view) {
        set2pas1 += 1;
        set2pas0 += 1;
        set2point();
    }

    public void set2pas0(View view) {
        set2pas0 += 1;
        set2point();
    }


    public void set2point() {
        String set2 = getString(R.string.srv);
        set2 += set2srv1 + "/" + set2srv0;
        set2 += "\n" + getString(R.string.atck);
        set2 += set2atk1 + "/" + set2atk0;
        set2 += "\n" + getString(R.string.dfns);
        set2 += set2def1 + "/" + set2def0;
        set2 += "\n" + getString(R.string.pass);
        set2 += set2pas1 + "/" + set2pas0;
        TextView set2A = findViewById(R.id.set2point);
        set2A.setText(set2);
    }

    public void hit2srv1(View view) {
        hit2srv1 += 1;
        hit2srv0 += 1;
        hit2point();
    }

    public void hit2srv0(View view) {
        hit2srv0 += 1;
        hit2point();
    }

    public void hit2atk1(View view) {
        hit2atk1 += 1;
        hit2atk0 += 1;
        hit2point();
    }

    public void hit2atk0(View view) {
        hit2atk0 += 1;
        hit2point();
    }

    public void hit2def1(View view) {
        hit2def1 += 1;
        hit2def0 += 1;
        hit2point();
    }

    public void hit2def0(View view) {
        hit2def0 += 1;
        hit2point();
    }

    public void hit2pas1(View view) {
        hit2pas1 += 1;
        hit2pas0 += 1;
        hit2point();
    }

    public void hit2pas0(View view) {
        hit2pas0 += 1;
        hit2point();
    }


    public void hit2point() {
        String hit2 = getString(R.string.srv);
        hit2 += hit2srv1 + "/" + hit2srv0;
        hit2 += "\n" + getString(R.string.atck);
        hit2 += hit2atk1 + "/" + hit2atk0;
        hit2 += "\n" + getString(R.string.dfns);
        hit2 += hit2def1 + "/" + hit2def0;
        hit2 += "\n" + getString(R.string.pass);
        hit2 += hit2pas1 + "/" + hit2pas0;
        TextView hit2A = findViewById(R.id.hit2point);
        hit2A.setText(hit2);
    }


    public void mid2srv1(View view) {
        mid2srv1 += 1;
        mid2srv0 += 1;
        mid2point();
    }

    public void mid2srv0(View view) {
        mid2srv0 += 1;
        mid2point();
    }

    public void mid2atk1(View view) {
        mid2atk1 += 1;
        mid2atk0 += 1;
        mid2point();
    }

    public void mid2atk0(View view) {
        mid2atk0 += 1;
        mid2point();
    }

    public void mid2def1(View view) {
        mid2def1 += 1;
        mid2def0 += 1;
        mid2point();
    }

    public void mid2def0(View view) {
        mid2def0 += 1;
        mid2point();
    }

    public void mid2pas1(View view) {
        mid2pas1 += 1;
        mid2pas0 += 1;
        mid2point();
    }

    public void mid2pas0(View view) {
        mid2pas0 += 1;
        mid2point();
    }


    public void mid2point() {
        String mid2 = getString(R.string.srv);
        mid2 += mid2srv1 + "/" + mid2srv0;
        mid2 += "\n" + getString(R.string.atck);
        mid2 += mid2atk1 + "/" + mid2atk0;
        mid2 += "\n" + getString(R.string.dfns);
        mid2 += mid2def1 + "/" + mid2def0;
        mid2 += "\n" + getString(R.string.pass);
        mid2 += mid2pas1 + "/" + mid2pas0;
        TextView mid2A = findViewById(R.id.mid2point);
        mid2A.setText(mid2);
    }


    public void libdef1(View view) {
        libdef1 += 1;
        libdef0 += 1;
        libpoint();
    }

    public void libdef0(View view) {
        libdef0 += 1;
        libpoint();
    }

    public void libpas1(View view) {
        libpas1 += 1;
        libpas0 += 1;
        libpoint();
    }

    public void libpas0(View view) {
        libpas0 += 1;
        libpoint();
    }


    public void libpoint() {
        String lib = getString(R.string.dfns);
        lib += libdef1 + "/" + libdef0;
        lib += "\n" + getString(R.string.pass);
        lib += libpas1 + "/" + libpas0;
        TextView libA = findViewById(R.id.libpoint);
        libA.setText(lib);
    }

    public void reset(View view) {
        set1atk1 = 0;
        set1atk0 = 0;
        set1srv1 = 0;
        set1srv0 = 0;
        set1def1 = 0;
        set1def0 = 0;
        set1pas1 = 0;
        set1pas0 = 0;
        hit1atk1 = 0;
        hit1atk0 = 0;
        hit1srv1 = 0;
        hit1srv0 = 0;
        hit1def1 = 0;
        hit1def0 = 0;
        hit1pas1 = 0;
        hit1pas0 = 0;
        mid1atk1 = 0;
        mid1atk0 = 0;
        mid1srv1 = 0;
        mid1srv0 = 0;
        mid1def1 = 0;
        mid1def0 = 0;
        mid1pas1 = 0;
        mid1pas0 = 0;
        set2atk1 = 0;
        set2atk0 = 0;
        set2srv1 = 0;
        set2srv0 = 0;
        set2def1 = 0;
        set2def0 = 0;
        set2pas1 = 0;
        set2pas0 = 0;
        hit2atk1 = 0;
        hit2atk0 = 0;
        hit2srv1 = 0;
        hit2srv0 = 0;
        hit2def1 = 0;
        hit2def0 = 0;
        hit2pas1 = 0;
        hit2pas0 = 0;
        mid2atk1 = 0;
        mid2atk0 = 0;
        mid2srv1 = 0;
        mid2srv0 = 0;
        mid2def1 = 0;
        mid2def0 = 0;
        mid2pas1 = 0;
        mid2pas0 = 0;
        libdef1 = 0;
        libdef0 = 0;
        libpas1 = 0;
        libpas0 = 0;
        TextView libA = findViewById(R.id.libpoint);
        libA.setText("");
        TextView set1A = findViewById(R.id.set1point);
        set1A.setText("");
        TextView hit1A = findViewById(R.id.hit1point);
        hit1A.setText("");
        TextView mid1A = findViewById(R.id.mid1point);
        mid1A.setText("");
        TextView set2A = findViewById(R.id.set2point);
        set2A.setText("");
        TextView hit2A = findViewById(R.id.hit2point);
        hit2A.setText("");
        TextView mid2A = findViewById(R.id.mid2point);
        mid2A.setText("");
    }
}



