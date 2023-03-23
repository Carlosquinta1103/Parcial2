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
    Integer [] Imgempleado;
    ImageView imgfoto;
    TextView tvNombreE;

    public AdaptadorEmpleado(Activity contexto, String[]empleado,Integer[] Imgempleado) {
        super(contexto, R.layout.empleado, empleado);
        this.contexto = contexto;
        this.empleado = empleado;
        this.Imgempleado = Imgempleado;

    }

    public View getView(int posicion, View v, ViewGroup parent) {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.paises, null, true);
        tvNombre = rowView.findViewById(R.id.tvNombrePais);
        imgBande = rowView.findViewById(R.id.imgvBandera);
        tvNombre.setText(paises[posicion]);
        imgBande.setImageResource(ImgPais[posicion]);
        return rowView;
    }}
