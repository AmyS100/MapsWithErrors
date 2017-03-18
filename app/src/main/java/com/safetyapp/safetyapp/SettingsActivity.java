package com.safetyapp.safetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_layout);
    }

    public void btnSmethod(View view){
        String button_text3;
        button_text3 = ((Button) view).getText().toString();
        if(button_text3.equals("Home"))
        {
            Intent z3 = new Intent(this, HomeActivity.class);
                startActivity(z3);
        }
        else if(button_text3.equals("Location"))
        {
            Intent z3 = new Intent(this, LocationActivity.class);
            startActivity(z3);
        }
    }

}
