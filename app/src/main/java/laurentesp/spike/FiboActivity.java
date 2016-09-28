package laurentesp.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FiboActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibo);

        final TextView textViewFibo = (TextView) findViewById(R.id.text_view_fibo_0);
        final EditText editTextFibo =(EditText) findViewById(R.id.edit_text_fibo_0);
        Button buttonEnter = (Button) findViewById(R.id.button_fibo_0);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFibo.setText(Fibonacci.fiboSequence(Integer.parseInt(editTextFibo.getText().toString())));
            }
        });


    }
}
