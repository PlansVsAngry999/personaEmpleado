package personaempleado;
/**
 * Programa que atraves de clases muestra la información de un empleado.
 * @author Ricardo Daniel Hernández Sosa (PlansVsAngry999).
 */
public class main {
     public static void main(String[] args) {
        Empleado emp = new Empleado();
        emp.nombre = "Fulano";
        emp.edad = 25;
        emp.sexo = "Masculino";
        emp.sueldo = 50000.0;
        emp.mostrarDatos();
        emp.mostrarSueldo();
    }
    
}
