package ni.edu.uca.damov1.entidades;

import com.orm.SugarRecord;

/**
 * Created by pwk04 on 11-02-16.
 */
public class Persona extends SugarRecord {

    private String nombre;
    private String cedula;
    private String telefono;
    private String carnet;

    public Persona(){}

    public Persona (String nombre, String cedula, String telefono, String carnet){
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.carnet = carnet;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
}
