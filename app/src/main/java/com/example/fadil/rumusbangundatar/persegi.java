package com.example.fadil.rumusbangundatar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class persegi extends AppCompatActivity {
    EditText panjang,lebar;
    Button hitung;
    TextView hasilhitung;
    int pj;
    int lb;
    int hsl;
    String strhasil,pjg,lbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);
        panjang = (EditText)findViewById(R.id.panjang);
        lebar = (EditText)findViewById(R.id.lebar);
        hitung = (Button) findViewById(R.id.hitung);
        hasilhitung = (TextView)findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pjg = panjang.getText().toString();
                lbr = lebar.getText().toString();
                pj = Integer.parseInt(pjg);
                lb = Integer.parseInt(lbr);
                if (panjang.getText().toString().isEmpty()|| lbr.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Maaf ada yang belum di isi",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    hit(pj,lb);
                }
            }
        });
    }
        public void hit (int pj, int lb){
            hsl= pj*lb;
            strhasil=Integer.toString(hsl);
            hasilhitung.setText(strhasil);
    }
}

