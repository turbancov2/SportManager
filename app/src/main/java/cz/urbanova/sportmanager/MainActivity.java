
package cz.urbanova.sportmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void buttonCLickedBallGames (View button)
    {
        startActivity(new Intent(this,BallGames.class));
    }

    public void buttonClickedRunninng(View button)
    {
        startActivity(new Intent(this,Running.class));
    }

    public void buttonCLickedSwimming (View button)
    {
        startActivity(new Intent(this,Swimming.class));
    }

    public void buttonClickedClimbing(View button)
    {
        startActivity(new Intent(this,Climbing.class));
    }
}























