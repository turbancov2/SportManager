package cz.urbanova.sportmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Swimming extends AppCompatActivity {

    int metres = 0;
    int kilometres = 0;

    TextView textViewMetresSwimming;
    TextView textViewKilometresSwimming;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swimming);

        textViewKilometresSwimming = (TextView)findViewById(R.id.kilometres_swimming_text_view);
        textViewMetresSwimming = (TextView)findViewById(R.id.metres_swimming_text_view);
    }


    public void increment(View view)
    {
        kilometres = kilometres + 1;
        display();
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        kilometres = kilometres - 1;
        display();
    }
    /**
     * This method is called when the plus button is clicked.
     */
    public void increment2(View view)
    {
        metres = metres + 1;
        display();
    }
    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement2(View view) {
        metres = metres - 1;
        display();
    }

    private void display() {

        textViewKilometresSwimming.setText("" + kilometres);
        textViewMetresSwimming.setText("" + metres);
    }

}
