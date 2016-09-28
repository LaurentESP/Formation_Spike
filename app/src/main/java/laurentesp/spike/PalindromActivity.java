package laurentesp.spike;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.inputmethodservice.Keyboard;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrom);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        final TextView textViewPal = (TextView) findViewById(R.id.text_view_pal_0);
        final EditText editTextPal = (EditText) findViewById(R.id.edit_text_pal_0);

        editTextPal.addTextChangedListener(new TextWatcher() {
                                               public void afterTextChanged(Editable s) {

                                               }

                                               public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        /*This method is called to notify you that, within s, the count characters beginning at start are about to be replaced by new text with length after. It is an error to attempt to make changes to s from this callback.*/
                                               }

                                               public void onTextChanged(CharSequence s, int start, int before, int count) {
                                                   String getStringFromUser = editTextPal.getText().toString();
                                                   if (Palindrom.isPalindrome(getStringFromUser)) {
                                                       //fab.setBackgroundColor(Color.GREEN);
                                                       fab.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
                                                   } else {
                                                       fab.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
                                                   }
                                                   textViewPal.setText(Palindrom.checkIfPalindrom(getStringFromUser));
                                               }
                                           }

        );
    }

}
