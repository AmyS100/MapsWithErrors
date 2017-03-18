package com.safetyapp.safetyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LocationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.location_layout);
    }

    public void btnLmethod(View view)
    {
        String button_text2;
        button_text2 = ((Button) view).getText().toString();

        if(button_text2.equals("Home"))
        {
            Intent z2 = new Intent(this, HomeActivity.class);
                startActivity(z2);
        }
        else if(button_text2.equals("Settings"))
        {
            Intent z2=new Intent(this, HomeActivity.class);
            startActivity(z2);
        }
    }

}
