package cz.urbanova.sportmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BallGames extends AppCompatActivity {

    int hour = 0;
    int minutes = 0;

    TextView textViewHour;
    TextView textViewMinutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball_games);

        textViewHour = (TextView)findViewById(R.id.hour_text_view);
        textViewMinutes = (TextView)findViewById(R.id.minutes_text_view);
    }

    public void buttonClicked(View button)
    {

    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view)
    {
        hour = hour + 1;
        display();
    }



    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
    hour = hour - 1;
        display();
    }




    /**
     * This method is called when the plus button is clicked.
     */
    public void increment2(View view)
    {
        minutes = minutes + 1;
        display();
    }



    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement2(View view)
    {
        minutes= minutes - 1;
        display();
    }


    public void display()
    {
        textViewHour.setText("" + hour);
        textViewMinutes.setText("" + minutes);
    }
}
