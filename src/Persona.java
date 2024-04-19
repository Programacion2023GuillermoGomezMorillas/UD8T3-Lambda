import java.util.List;

public class Persona {
    private String nombre;
    private String dni;
    private int tel;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String dni, int tel) {
        this.nombre = nombre;
        this.dni = dni;
        this.tel = tel;
        poblacion.add();
    }

    public String getNombre(){
        return this.nombre;
    }
}
