package edu.tamu.ece.widget_testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void radioclick(View view) {
        ImageView imvu = (ImageView) findViewById(R.id.my_pic);
        int id = view.getId();
        if(id==R.id.rad_doggie){imvu.setImageResource(R.drawable.reveille);}
        else{imvu.setImageResource(R.drawable.horses);};

    }
}
