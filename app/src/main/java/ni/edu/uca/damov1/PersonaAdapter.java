package ni.edu.uca.damov1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import ni.edu.uca.damov1.entidades.Persona;

/**
 * Created by pwk04 on 11-02-16.
 */
public class PersonaAdapter extends ArrayAdapter<Persona> {

    private List<Persona> personaList;
    private TextView textNombre, textCedula, textTelefono, textCarnet;

    public PersonaAdapter(Context context, int resource, List<Persona> personas) {
        super(context, resource, personas);
        personaList = personas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.persona_adapter, parent, false);
        }

        textNombre = (TextView) convertView.findViewById(R.id.textNombre);
        textCedula = (TextView) convertView.findViewById(R.id.textCedula);
        textTelefono = (TextView) convertView.findViewById(R.id.textTelefono);
        textCarnet = (TextView) convertView.findViewById(R.id.textCarnet);

        Persona personaActual = personaList.get(position);

        textNombre.setText(personaActual.getNombre());
        textCedula.setText(personaActual.getCedula());
        textTelefono.setText(personaActual.getTelefono());
        textCarnet.setText(personaActual.getCarnet());

        return convertView;
    }
}
