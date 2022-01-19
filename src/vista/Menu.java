package vista;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente;
import servicio.ClienteServicio;

public class Menu {

	ClienteServicio clienteServicio = new ClienteServicio();
	ArchivoServicio archivoServicio = new ArchivoServicio();
	ExportadorCsv exportadorCsv = new ExportadorCsv();
	ExportarTxt exportarTxt = new ExportarTxt();
	private String fileName = "Clientes"; // exportar el archivo
	private String fileName1 = "DBClientes.csv"; // importar el archivo
	Scanner sc = new Scanner(System.in);

	public final void iniciarMenu() { // revisar final

		System.out.println("1. Listar Cliente\n" + "2. Agregar Cliente\n" + "3. Editar Cliente\n"
				+ "4. Importar Datos\n" + "5. Exportar Datos\n" + "6. Salir\n" + "Ingrese una opcion");
		String opcion = sc.nextLine();
		switch (opcion) {
		case "1":
			clienteServicio.listarCliente();
			break;
		case "2":
			agregarCliente();
			break;
		case "3":
			editarCliente();
			break;
		case "4":
			importarDatos();
			break;
		case "5":
			exportarDatos();
			break;
		case "6":
			terminarPrograma();
			break;
		default:
			System.out.println("Elija una opcion valida.");
			break;
		}

	}

}
