package id.sch.smktelkom_mlg.learn.formpendaftaran;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etNL, etNP, etA;
    TextView HasilNL, HasilNP, HasilAL, HasilJK, HasilAM, HasilJP;
    Button buttonOK;
    RadioGroup rgJK;
    CheckBox cbjazz, cbpop, cbklasik, cbrock;
    Spinner spJP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNL = (EditText) findViewById(R.id.editTextNL);
        etNP = (EditText) findViewById(R.id.editTextNP);
        etA = (EditText) findViewById(R.id.editTextA);
        HasilNL = (TextView) findViewById(R.id.hasilNL);
        HasilNP = (TextView) findViewById(R.id.hasilNP);
        HasilAL = (TextView) findViewById(R.id.hasilA);
        HasilJK = (TextView) findViewById(R.id.hasilJK);
        HasilAM = (TextView) findViewById(R.id.hasilAM);
        HasilJP = (TextView) findViewById(R.id.hasilJP);
        rgJK = (RadioGroup) findViewById(R.id.JK);
        cbjazz = (CheckBox) findViewById(R.id.checkBoxJ);
        cbpop = (CheckBox) findViewById(R.id.checkBoxP);
        cbklasik = (CheckBox) findViewById(R.id.checkBoxK);
        cbrock = (CheckBox) findViewById(R.id.checkBoxR);
        spJP = (Spinner) findViewById(R.id.spinnerJP);
        buttonOK = (Button) findViewById(R.id.buttonOK);

    }
}
