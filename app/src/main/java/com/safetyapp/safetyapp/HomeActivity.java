package com.safetyapp.safetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_layout);
    }

    public void btnNav(View view)
    {
        //text of the button goes in a variable called button_text
        String button_text;
        button_text = ((Button) view).getText().toString();

        if(button_text.equals("Location"))
        {
            Intent z = new Intent(this, LocationActivity.class);
            startActivity(z);
        }
        else if(button_text.equals("Settings"))
        { //invoke settingsActivity
            Intent z = new Intent(this, SettingsActivity.class);
            startActivity(z);
        }
    }
}
