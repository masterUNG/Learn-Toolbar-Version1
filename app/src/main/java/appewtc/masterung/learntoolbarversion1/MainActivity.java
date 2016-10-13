package appewtc.masterung.learntoolbarversion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        //Set Text
        getSupportActionBar().setTitle(R.string.my_title);
        getSupportActionBar().setSubtitle(R.string.sub_title);

        //Set Icon
        getSupportActionBar().setIcon(R.drawable.ic_toolbar);


    }   // Main Method

}   // Main Class
