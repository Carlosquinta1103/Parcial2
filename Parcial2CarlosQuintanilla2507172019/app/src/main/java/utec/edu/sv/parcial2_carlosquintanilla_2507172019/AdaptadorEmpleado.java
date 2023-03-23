package utec.edu.sv.parcial2_carlosquintanilla_2507172019;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class AdaptadorEmpleado extends ArrayAdapter<String> {
    Activity contexto;
    String []empleado;
    String []cargo;
    String []compañia;
    Integer [] Imgempleado;
    ImageView imgfoto;
    TextView tvNombre,tvCargo,tvCompañia;


    public AdaptadorEmpleado(Activity contexto, String[]empleado,String []cargo,String []compañia,Integer[] Imgempleado) {
        super(contexto, R.layout.empleado, empleado);
        this.contexto = contexto;
        this.empleado = empleado;
        this.cargo = cargo;
        this.compañia = compañia;
        this.Imgempleado = Imgempleado;

    }

    public View getView(int posicion, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.empleado, null, true);
        tvNombre = rowView.findViewById(R.id.txNombre);
        tvCargo = rowView.findViewById(R.id.txtcargo);
        tvCompañia = rowView.findViewById(R.id.txtcompañia);
        imgfoto = rowView.findViewById(R.id.imgvempleado);
        tvNombre.setText(empleado[posicion]);
        tvCargo.setText(cargo[posicion]);
        tvCompañia.setText(compañia[posicion]);
        imgfoto.setImageResource(Imgempleado[posicion]);
        return rowView;
    }}
