package kr.hs.phjin1106e_mirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /* implements View.OnClickListener */ {
    EditText editFirst, editSecond;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editFirst = (EditText) findViewById(R.id.edit_first);
        editSecond = (EditText) findViewById(R.id.edit_second);
        Button butPlus = (Button) findViewById(R.id.but_plus);
        Button butMinus = (Button) findViewById(R.id.but_minus);
        Button butMultiply = (Button) findViewById(R.id.but_multiply);
        Button butDivision = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);
        butPlus.setOnClickListener(butHandler);
        butMinus.setOnClickListener(butHandler);
        butMultiply.setOnClickListener(butHandler);
        butDivision.setOnClickListener(butHandler);

     /*   butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editFirst.getText().toString());
                int num2 = Integer.parseInt(editSecond.getText().toString());
                textResult.setText(num1+num2+"");
            }
        });*/
    }// end oncreat

    View.OnClickListener butHandler=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int num1 = Integer.parseInt(editFirst.getText().toString());
            int num2 = Integer.parseInt(editSecond.getText().toString());
            int result=0;

            switch (v.getId()){
                case R.id.but_plus :
                    result = num1+num2;
                    break;

                case R.id.but_minus :
                    result = num1-num2;
                    break;

                case R.id.but_multiply :
                    result = num1*num2;
                    break;

                case R.id.but_division :
                    result = num1/num2;
                    break;

            }

            textResult.setText(result+"");
        }
    };

 /*    @Override
       public void onClick(View view) {
            int num1 = Integer.parseInt(editFirst.getText().toString());
            int num2 = Integer.parseInt(editSecond.getText().toString());
            int result=0;

           switch (view.getId()){
                case R.id.but_plus :
                  result = num1+num2;
                  break;

               case R.id.but_minus :
                 result = num1-num2;
                 break;

               case R.id.but_multiply :
                 result = num1*num2;
                 break;

               case R.id.but_division :
                 result = num1/num2;
                 break;

        }

        textResult.setText(result+"");
        */
    }
}