package laurentesp.spike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BracketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracket);

        final TextView textViewBra = (TextView) findViewById(R.id.text_view_bra_0);
        final EditText editTextBra =(EditText) findViewById(R.id.edit_text_bra_0);
        Button buttonEnter = (Button) findViewById(R.id.button_bra_0);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Brackets.checkBrackets(editTextBra.getText().toString())){
                    textViewBra.setText("OK");
                } else {
                    textViewBra.setText("NOK");
                }
            }
        });

    }
}
