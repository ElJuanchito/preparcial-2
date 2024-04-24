package co.edu.uniquindio.preparcial.puntos;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private Integer edad;
    private Sexo sexo;

    public Persona(String nombre, Integer edad, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public int compareTo(Persona persona) {
        return edad.compareTo(persona.edad);
    }
}

enum Sexo{
    MASCULINO("Masculino"), FEMENINO("Femenino");

    private String text;
    Sexo(String text) {
        this.text = text;
    }

    public String getText() {return text;}
}
