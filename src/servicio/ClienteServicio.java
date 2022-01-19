package servicio;

import java.util.List;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;

public class ClienteServicio {

	private List<Cliente> listaClientes;
	Scanner sc = new Scanner(System.in);

	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public void listarCliente() {
		System.out.println("-------------Datos del Cliente-------------");
		for (Cliente iteracion : listaClientes) {
			System.out.println("RUN del Cliente: " + iteracion.getRunCliente());
			System.out.println("Nombre del Cliente: " + iteracion.getNombreCliente());
			System.out.println("Apellido del Cliente: " + iteracion.getApellidoCliente());
			System.out.println("Años como Cliente: " + iteracion.getAniosCliente());
			System.out.println("Categoria del Cliente: " + iteracion.getNombreCategoria());
			System.out.println("-------------------------------------------");
		}

	}

	public void agregarCliente(String run, String nombre, String apellido, String anios) {

		// Cliente clienteNuevo=new Cliente(run,nombre, apellido,anios);
	}

	public void editarCliente() {
		System.out.println("-------------Editar Cliente-------------\n" + "Seleccione qué desea hacer:\n");
		System.out.println("1.-Cambiar el estado del Cliente\n" + "2.-Editar los datos ingresados del Cliente\n"
				+ "Ingrese opcion:\n" + "----------------------------------------\n");
		String opcion = sc.nextLine();
		System.out.println("Ingrese RUN del Cliente a editar:");
		String run = sc.nextLine(); // revisar manejor errores
		if (opcion=="1") {
			System.out.println("-----Actualizando estado del Cliente----");
			for (Cliente iteracion : listaClientes) {
				if (run.equals(iteracion.getRunCliente())) {
					System.out.println("El estado actual es: " + iteracion.getNombreCategoria());
					System.out.println("1.-Si desea cambiar el estado del Cliente a Inactivo\r\n"
							+ "2.-Si desea mantener el estado del cliente Activo\r\n" + "Ingrese opcion:\r\n"
							+ "----------------------------------------");
					String opcionEstado = sc.nextLine();
					if (opcionEstado=="1") {
						iteracion.setNombreCategoria(CategoriaEnum.Inactivo);
					} else {
						if (opcionEstado=="2") {
							
						} else {
							System.out.println("Ingrese una opcion valida");
						}
					}
				}
			}
		} else {
			if (opcion=="2") {

			} else {
				System.out.println("Ingrese una opcion valida");
				// llamar menu o metodo editarCliente
			}
		}
	}

}
