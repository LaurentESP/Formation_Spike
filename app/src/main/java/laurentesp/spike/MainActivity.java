package laurentesp.spike;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPal = (Button) findViewById(R.id.button_to_Palindrom);
        Button buttonParenthese = (Button) findViewById(R.id.button_to_Parentheses);
        Button buttonFibo = (Button) findViewById(R.id.button_to_Fibo);

        buttonPal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PalindromActivity.class);
                startActivity(intent);
            }
        });

        buttonParenthese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BracketActivity.class);
                startActivity(intent);
            }
        });

        buttonFibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FiboActivity.class);
                startActivity(intent);
            }
        });
    }
}
