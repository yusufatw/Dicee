package id.cathode.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRoll = findViewById(R.id.btn_roll);

        final ImageView leftDice = findViewById(R.id.img_leftDice);
        final ImageView rightDice = findViewById(R.id.img_rightDice);

        final int[] arrDice = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4,
                                R.drawable.dice5, R.drawable.dice6};

        btnRoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random generateDice = new Random();

                int diceNumber = generateDice.nextInt(6);
                leftDice.setImageResource(arrDice[diceNumber]);
                Log.d("Roll", "the left dice " + (diceNumber + 1));

                diceNumber = generateDice.nextInt(6);
                rightDice.setImageResource(arrDice[diceNumber]);
                Log.d("Roll", "the right dice " + (diceNumber + 1));

            }
        });
    }
}
