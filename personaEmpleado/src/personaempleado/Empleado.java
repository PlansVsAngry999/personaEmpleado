package personaempleado;
/**
 * Clase 'empleado'; hereda propiedades del la clase 'persona'.
 */
public class Empleado extends PersonaEmpleado{
    double sueldo;
    public void mostrarSueldo(){
        System.out.println("Sueldo: " + sueldo);
    }
}
