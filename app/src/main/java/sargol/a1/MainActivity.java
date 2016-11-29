package sargol.a1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    String b;

    EditText textNumber1 ;
    EditText textNumber2 ;


TextView txtResult1;
 @Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

 textNumber1 = (EditText) findViewById(R.id.txt_number1);
 textNumber2 = (EditText) findViewById(R.id.txt_number2);
 txtResult1 = (TextView) findViewById(R.id.txt_Result);
    }

    public void buttonClicked(View view) {

String sNumber1 = textNumber1.getText().toString();
String sNumber2 = textNumber2.getText().toString();

int iNumber1 =Integer.parseInt(sNumber1);
int iNumber2 =Integer.parseInt(sNumber2);

int iResult =iNumber1 + iNumber2;
        b =  String.valueOf(iResult);

}

    public void Taghsim(View view){

String b;
        String sNumber1 = textNumber1.getText().toString();
        String sNumber2 = textNumber2.getText().toString();

        int iNumber1 =Integer.parseInt(sNumber1);
        int iNumber2 =Integer.parseInt(sNumber2);

        int iResult =iNumber1 / iNumber2;


     b =  String.valueOf(iResult);


    }
    public void manfi (View view){
        String sNumber1 = textNumber1.getText().toString();
        String sNumber2 = textNumber2.getText().toString();

        int iNumber1 =Integer.parseInt(sNumber1);
        int iNumber2 =Integer.parseInt(sNumber2);

        int iResult =iNumber1 - iNumber2;


        b =  String.valueOf(iResult);

    }

    public void xarb(View view){
        String sNumber1 = textNumber1.getText().toString();
        String sNumber2 = textNumber2.getText().toString();

        int iNumber1 =Integer.parseInt(sNumber1);
        int iNumber2 =Integer.parseInt(sNumber2);

        int iResult =iNumber1 * iNumber2;


        b =  String.valueOf(iResult);

    }

    public void mosavi(View view ){

        txtResult1.setText(b);
    }
}