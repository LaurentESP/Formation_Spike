package laurentesp.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RandomTextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_text);

        final TextView textViewRand = (TextView) findViewById(R.id.text_view_rand_0);
        final EditText editTextRand =(EditText) findViewById(R.id.edit_text_rand_0);
        Button buttonEnter = (Button) findViewById(R.id.button_rand_0);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewRand.setText(RandomText.mixLettersInWords(editTextRand.getText().toString()));
            }
        });

    }
}
