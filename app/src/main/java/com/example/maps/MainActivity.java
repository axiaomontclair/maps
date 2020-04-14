package com.example.maps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void msu (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/dir//Montclair+State+University,+1+Normal+Ave,+Montclair,+NJ+07043/@40.8625464,-74.1998409,17z/data=!4m8!4m7!1m0!1m5!1m1!1s0x89c2fe352883ec55:0xeece028744cfc9ae!2m2!1d-74.1976522!2d40.8625464"));
        startActivity(browserIntent);
        //links the button to the url when clicked
}
}
