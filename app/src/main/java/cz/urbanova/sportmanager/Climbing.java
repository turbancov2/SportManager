package cz.urbanova.sportmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Climbing extends AppCompatActivity {

    int hourClimbing = 0;
    int minutesClimbing = 0;

    TextView textViewHourClimbing;
    TextView textViewMinutesClimbing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_climbing);

        textViewHourClimbing = (TextView)findViewById(R.id.hour_climbing_text_view);
        textViewMinutesClimbing = (TextView)findViewById(R.id.minutes_climbing_text_view);

    }

    public void buttonClicked(View button)
    {

    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view)
    {
        hourClimbing = hourClimbing + 1;
        display();
    }



    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        hourClimbing = hourClimbing - 1;
        display();
    }




    /**
     * This method is called when the plus button is clicked.
     */
    public void increment2(View view)
    {
        minutesClimbing = minutesClimbing + 1;
        display();
    }



    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement2(View view)
    {
        minutesClimbing = minutesClimbing - 1;
        display();
    }


    public void display()
    {
        textViewHourClimbing.setText("" + hourClimbing);
        textViewMinutesClimbing.setText("" + minutesClimbing);
    }
}

