package utec.edu.sv.parcial2_carlosquintanilla_2507172019;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ListView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String [] empleado={"Alexander Pierrot","Carlos Lopez",
            "Sara Bonz", "Liliana Clarence",
            "Benito Peralta","Juan Jaramillo",
            "Christian Steps","Alexa Giraldo",
            "Linda Murillo","Lizeth Astrada"};
    ListView lvstEmpleado;
    Integer[]Imgempleado={

            R.drawable.alexander,
            R.drawable.carlos,
            R.drawable.sara,
            R.drawable.liliana,
            R.drawable.benito,
            R.drawable.juan,
            R.drawable.christian,
            R.drawable.alexa,
            R.drawable.liliana,
            R.drawable.lizeth,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdaptadorEmpleado adaptador = new AdaptadorEmpleado(this, empleado, Imgempleado);
        lvstEmpleado = findViewById(R.id.lstEmpleado);
        lvstEmpleado.setAdapter (adaptador);
    }
}