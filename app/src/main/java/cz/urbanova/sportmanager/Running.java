package cz.urbanova.sportmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Running extends AppCompatActivity {

    int metresRunning = 0;
    int kilometresRunning = 0;

    TextView textViewMetresRunning;
    TextView textViewKilometresRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);

        textViewKilometresRunning = (TextView)findViewById(R.id.kilometres_running_text_view);
        textViewMetresRunning = (TextView)findViewById(R.id.metres_running_text_view);
    }


    public void increment(View view)
    {
        kilometresRunning = kilometresRunning + 1;
        display();
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        kilometresRunning = kilometresRunning - 1;
        display();
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment2(View view)
    {
        metresRunning = metresRunning + 1;
        display();
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement2(View view) {
        metresRunning = metresRunning - 1;
        display();
    }

    private void display() {

        textViewKilometresRunning.setText("" + kilometresRunning);
        textViewMetresRunning.setText("" + metresRunning);
    }

}
