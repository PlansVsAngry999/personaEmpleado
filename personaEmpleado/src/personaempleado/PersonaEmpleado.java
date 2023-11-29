package personaempleado;
/*
    Clase 'persona'.
*/
public class PersonaEmpleado {
    String nombre;
    int edad;
    String sexo;
    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
    }
}