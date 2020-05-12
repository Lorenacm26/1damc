package EmpleadoJavaDoc;

/**
 * 
 * @author lorena
 * @version 1_2020
 * @since 12/05/2020
 *
 */

public class Empleado {

	private String nombre;
	private String apellido;
	private double salario;

	/**
	 * 
	 * @param nombre   -- Nombre del empleado
	 * @param apellido -- Primer apellido del empleado
	 * @param salario  -- Salario base del empleado
	 */
	public Empleado(String nombre, String apellido, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	// Métodos

	/**
	 * 
	 * @see -- Empleado (See--> Determina la clase a la que hace referencia ese metodo)
	 * @param subida -- cantidad que se sube 
	 */

	public void subirsalario(double subida) {
		salario = salario + subida;
	}
	
	/**
	 * 
	 * @return "true" si nombre no está vacio 
	 */

	private boolean comprobar() {
		if (nombre.equals("")) {
			return false;
		}
		return true;
	}

}
