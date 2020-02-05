package cardoza.mcm.edu.ph.errorproblem1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent; /** this time gigamit nato ang intent para makareceive ug data **/
import android.widget.TextView; //gi import nato para naa tay display

public class SecondActivity extends AppCompatActivity {

    String txtTxt="";

    TextView tbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);


        Intent qwerty = getIntent();

        txtTxt = qwerty.getStringExtra("TXT");

        tbt = findViewById(R.id.textView);


        tbt.setText(txtTxt); 

    }
}
