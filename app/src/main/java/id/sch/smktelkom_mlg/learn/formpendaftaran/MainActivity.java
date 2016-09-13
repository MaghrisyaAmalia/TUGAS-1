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
    }
}
