package Estructura1;

public class Empleado {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private int Edad;
    private String Cargo;
    public Empleado(String nombre,String apellido, String direccion, int edad, String cargo) {
        Nombre=nombre;
        Apellido=apellido;
        Direccion=direccion;
        Edad=edad;
        Cargo=cargo;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public String getDireccion() {
        return Direccion;
    }
    public int getEdad() {
        return Edad;
    }
    public String getCargo() {
        return Cargo;
    }
}
