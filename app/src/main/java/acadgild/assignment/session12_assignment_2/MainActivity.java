package acadgild.assignment.session12_assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import acadgild.assignment.session12_assignment_2.fragment.SimpleAddition;

public class MainActivity extends AppCompatActivity implements MessagePasser, View.OnClickListener {

    MessagePasser messagePasser;
    EditText txtInput;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtInput = (EditText) findViewById(R.id.etInput);
        btnSubmit = (Button) findViewById(R.id.buttonSubmit);

        btnSubmit.setOnClickListener(this);


    }

    @Override
    public void onMessage(String message) {
        SimpleAddition simpleAddition =
                (SimpleAddition) getFragmentManager().findFragmentById(R.id.fragmentSimpleAddition);
        simpleAddition.setMessage(message);
    }

    @Override
    public void onClick(View v) {
//        messagePasser.onMessage(txtInput.getText().toString());
            onMessage(txtInput.getText().toString());
    }
}
