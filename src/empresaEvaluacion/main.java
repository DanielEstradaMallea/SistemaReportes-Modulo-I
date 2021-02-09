package empresaEvaluacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		List<Asesoria> listaAsesoria = new ArrayList<Asesoria>();
		List<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();

		Contenedor sc2 = new Contenedor(listaAsesoria, listaCapacitacion);

		Integer opcion, rut, run, sistsalud, edad, id, duracionCapacitacion, asistCapacitacion, telefono;
		String fechaNacimiento, nombreUsuario, nombresCliente, apellidosCliente, afp, direccion, comuna, titulo,
				fechaIngreso, area, expPrevia, diaCapacitacion, horaCapacitacion, lugarCapacitacion;

		boolean validadorFecha = false, validadorHora = false;

		Scanner leer = new Scanner(System.in);

		// MENÚ

		System.out.println("INVENTARIO DE PERFILES Y CAPACITACIONES" + "\n");
		do {
			do {
				System.out.println("1.- Ingresar Usuario tipo cliente");
				System.out.println("2.- Ingresar Usuario tipo Profesional");
				System.out.println("3.- Ingresar Usuario tipo Administrativo");
				System.out.println("4.- Ingresar Capacitacion");
				System.out.println("5.- Eliminar usuario");
				System.out.println("6.- Listar usuarios ingresados");
				System.out.println("7.- Listar usuarios ingresados por tipo");
				System.out.println("8.- Mostrar capacitaciones ingresadas");
				System.out.println("9.- SALIR");
				opcion = validarEnteros();
				System.out.println("             ");

				// Para que no de error al ingresar letra

			} while (opcion == null);

			switch (opcion) {

			// 1 Almacenar Cliente
			case 1:

				Cliente cliente1 = new Cliente();

				System.out.println("1. Ingresando perfil de Cliente" + "\n");

				// Almacenar Nombre de Usuario
				System.out.println("Ingresa Nombre de usuario");
				nombreUsuario = validar1050();
				cliente1.setNombre(nombreUsuario);

				// Almacenar fecha de nacimiento de Usuario
				do {
					System.out.println("Ingrese fecha de nacimiento de usuario (formato dd/mm/aaaa)");
					fechaNacimiento = leer.nextLine();
					validadorFecha = validarFecha(fechaNacimiento);
				} while (validadorFecha == false);
				cliente1.setFechaNacimiento(fechaNacimiento);

				// Almacenar Run Usuario
				System.out.println("Ingrese RUN de usuario");
				run = validarRolUnico();
				cliente1.setRun(run);

				// Almacenar Rut Cliente
				System.out.println("Ingrese RUT de cliente");
				rut = validarRolUnico();
				cliente1.setRut(rut);

				// Almacenar Nombres Cliente
				System.out.println("Ingrese nombres de cliente");
				nombresCliente = validar0530();
				cliente1.setNombres(nombresCliente);

				// Almacenar Apellidos Cliente
				System.out.println("Ingrese apellidos de cliente");
				apellidosCliente = validar0530();
				cliente1.setApellidos(apellidosCliente);

				// Almacenar Telefono Cliente
				do {
					System.out.println("Ingrese telefono de cliente (8 digitos) ");
					telefono = validarEnteros();
				} while (telefono == null || telefono > 100000000 || telefono < 9999999);
				cliente1.setTelefono(telefono);

				// Almacenar AFP Cliente
				do {
					System.out.println("Ingrese AFP de cliente (min 4 caracteres, max 30)");
					afp = leer.nextLine().strip();
				} while (afp.length() < 4 || afp.length() > 30);
				cliente1.setAfp(afp);

				// Almacenar Sistema de Salud Cliente
				do {
					System.out.println("Sistema de salud de cliente, Ingrese:");
					System.out.println("1 para Fonasa ");
					System.out.println("2 para Isapre ");
					sistsalud = validarEnteros();
				} while (sistsalud == null || sistsalud < 1 || sistsalud > 2);
				cliente1.setSalud(sistsalud);

				// Almacenar Direccion Cliente
				do {
					System.out.println("Ingrese direccion de cliente (maximo 70 caracteres)");
					direccion = leer.nextLine().strip();
				} while (direccion.length() > 70 || direccion == "");
				cliente1.setDireccion(direccion);

				// Almacenar Comuna Cliente
				do {
					System.out.println("Ingrese comuna de cliente  (maximo 50 caracteres)");
					comuna = leer.nextLine().strip();
				} while (comuna.length() > 50 || comuna == "");
				cliente1.setComuna(comuna);

				// Almacenar Edad Cliente
				do {
					System.out.println("Ingrese edad de cliente (rango de edad 0-150 años)");
					edad = validarEnteros();
				} while (edad == null || edad < 0 || edad > 150);
				cliente1.setEdad(edad);

				// Almacena Cliente en Array
				listaAsesoria.add(cliente1);
				System.out.println("Cliente ingresado a la base de datos" + "\n");
				pausa();
				break;

			// Alamacenar Profecional
			case 2:

				Profesional profesional1 = new Profesional();

				System.out.println("2. Ingresando perfil profesional" + "\n");

				// Alamacenar Nombre Usuario
				System.out.println("Ingrese nombre del Usuario");
				nombreUsuario = validar1050();
				profesional1.setNombre(nombreUsuario);

				// Alamacenar Fecha de nacimiento del Usuario
				do {
					System.out.println("Ingrese fecha de nacimiento del Usuario (formato dd/mm/aaaa)");
					fechaNacimiento = leer.nextLine();
					validadorFecha = validarFecha(fechaNacimiento);
				} while (validadorFecha == false);
				profesional1.setFechaNacimiento(fechaNacimiento);

				// Almacenar Run Usuario
				System.out.println("Ingrese RUN de usuario");
				run = validarRolUnico();
				profesional1.setRun(run);

				// Alamacenar Titulo Profeional
				System.out.println("Ingrese titulo profesional");
				titulo = validar1050();
				profesional1.setTitulo(titulo);

				// Alamacenar Fecha ingreso Profeional
				do {
					System.out.println("Ingrese fecha de ingreso (formato (dd/mm/aaaa)");
					fechaIngreso = leer.nextLine();
					validadorFecha = validarFecha(fechaIngreso);
				} while (validadorFecha == false);
				profesional1.setFechaIngreso(fechaIngreso);

				// Almacena profesional en Array listaAsesoria.add(profesional1);
				listaAsesoria.add(profesional1);
				System.out.println("Profesional ingresado a la base de datos" + "\n");
				pausa();
				break;

			// Almacenar Administrativo
			case 3:

				Administrativo administrativo1 = new Administrativo();

				System.out.println("3. Ingresando administrativo" + "\n");

				// Alamacenar Nombre Usuario
				System.out.println("Ingrese nombre del administrativo");
				nombreUsuario = validar1050();
				administrativo1.setNombre(nombreUsuario);

				// Alamacenar Fecha de nacimiento del Usuario
				do {
					System.out.println("Ingrese fecha de nacimiento del administrativo (formato (dd/mm/aaaa)");
					fechaNacimiento = leer.nextLine();
					validadorFecha = validarFecha(fechaNacimiento);
				} while (validadorFecha == false);
				administrativo1.setFechaNacimiento(fechaNacimiento);

				// Almacenar Run Usuario
				System.out.println("Ingrese RUN del administrativo sin digito verificador (hasta 8 digitos)");
				run = validarRolUnico();
				administrativo1.setRun(run);

				// Almacenar Area Administrativo
				do {
					System.out.println("Ingrese area de Administrativo (min 5 caracteres, max 20 )");
					area = leer.nextLine().strip();
				} while (area.length() < 5 || area.length() > 100);
				administrativo1.setArea(area);

				// Almacenar Experiencia Administrativo
				do {
					System.out.println("Ingrese experiencia previa (maximo 100 caracteres)");
					expPrevia = leer.nextLine().strip();
				} while (expPrevia.length() > 100);
				administrativo1.setExperienciaPrevia(expPrevia);

				// Almacena Administrativo en Array listaAsesoria.add(administrativo1);
				listaAsesoria.add(administrativo1);
				System.out.println("Administrativo ingresado a la base de datos" + "\n");
				pausa();
				break;

			// Almacenar Capacitación
			case 4:

				Asesoria contieneUsuario;
				// para saber si hay clientes en base de dato
				contieneUsuario = sc2.encontrarCliente();

				if (contieneUsuario == null) {

					System.out.println("No tiene ningun cliente registrado en la base de datos,"
							+ " favor antes de cargar una capacitacion, ingrese un cliente"+"\n");
					pausa();
					break;
					// como encuentra empieza a pedir datos de Capacitación
				} else {

					Capacitacion capacitacion1 = new Capacitacion();
					System.out.println("IV.- Ingresando capacitacion" + "\n");

					// Almacena identificador Capacitación
					do {
						System.out.println("Ingrese identificador (ID) de la capacitacion (solo digitos)");
						id = validarEnteros();
					} while (id == null);
					capacitacion1.setIdentificador(id);

					// Busca Run Cliente en base de dato
					do {
						System.out.println("Ingrese RUT del cliente sin digito verificador (hasta 8 digitos)");
						rut = validarEnteros();
					} while (rut == null || rut > 99999999);

					boolean existeRut = sc2.compararRut(rut);

					if (existeRut == false) {
						System.out.println("rut ingresado no coincide con ninguno registrado en nuestra base de datos" + "\n");
						pausa();
						break;
					} else {
						// Almacena Rut Cliente
						capacitacion1.setRutCliente(rut);

						// Alamcena Día de Capacitación
						do {
							System.out.println("Escriba el dia de la capacitacion (lunes a domingo)");
							diaCapacitacion = leer.nextLine().toLowerCase();
						} while (!diaCapacitacion.equals("lunes") && !diaCapacitacion.equals("martes")
								&& !diaCapacitacion.equals("miercoles") && !diaCapacitacion.equals("jueves")
								&& !diaCapacitacion.equals("viernes") && !diaCapacitacion.equals("sabado")
								&& !diaCapacitacion.equals("domingo"));
						capacitacion1.setDia(diaCapacitacion);

						// Almacena Hora de Capacitación
						do {
							System.out.println("Ingrese hora que se realizará la capacitacion (formato hh:mm)");
							horaCapacitacion = leer.nextLine();
							validadorHora = validarHora(horaCapacitacion);
						} while (validadorHora == false);
						capacitacion1.setHora(horaCapacitacion);

						// Almacena lugar capacitacion
						System.out.println("Ingrese lugar de la capacitacion");
						lugarCapacitacion = validar1050();
						capacitacion1.setLugar(lugarCapacitacion);

						// Almacena Hora Capacitación
						do {
							System.out.println("Ingrese duracion de horas de la capacitacion (solo digitos)");
							duracionCapacitacion = validarEnteros();
						} while (duracionCapacitacion == null);
						capacitacion1.setDuracion(duracionCapacitacion);

						// Almacena Cantidad PArticipantes
						do {
							System.out.println("Ingrese la cantidad de participantes (solo digitos)");
							asistCapacitacion = validarEnteros();
						} while (asistCapacitacion == null || (asistCapacitacion < 0 || asistCapacitacion > 1000));
						capacitacion1.setCantidadAsistentes(asistCapacitacion);

						// Almacena Capacitación al Array
						listaCapacitacion.add(capacitacion1);
						System.out.println("Capacitacion ingresada a la base de datos" + "\n");
						pausa();
					}
				}

				break;

			// Eliminar Usuario
			case 5:

				System.out.println("Eliminando usuario" + "\n");

				do {
					System.out.println("Ingrese el RUN del usuario registrado que desea eliminar de la base de datos");
					run = validarEnteros();
				} while (run == null);

				sc2.eliminarUsuario(run);
				pausa();

				break;

			// Listar Usuarios
			case 6:

				System.out.println("Mostrando usuarios registrados" + "\n");
				sc2.mostrarUsuario();
				pausa();

				break;

			// Listar Usuario por tipo
			case 7:

				System.out.println("7- Mostrando usuarios registrados por tipo");

				Integer elegirUsuario;

				do {
					System.out.println("Elija la opcion que quiera ver: (Ingrese numero)");
					System.out.println("1.- Cliente");
					System.out.println("2.- Profesional");
					System.out.println("3.- Administrativo");
					elegirUsuario = validarEnteros();
				} while (elegirUsuario == null || (elegirUsuario != 1 && elegirUsuario != 2 && elegirUsuario != 3));

				switch (elegirUsuario) {
				case 1:

					sc2.mostrarCliente();

					break;
				case 2:

					sc2.mostrarProfesional();

					break;
				case 3:

					sc2.mostrarAdministrativo();
				}
				pausa();
				break;

			// Listar Capacitaciones
			case 8:

				System.out.println("Capacitaciones registradas" + "\n");
				sc2.mostrarCapacitacion();
				pausa();

				break;

			// Salir
			case 9:

				System.out.println("Cerrando base de datos" + "\n");
				System.out.println("Hasta la proxima");

				break;

			default:

				System.out.println("Opcion incorrecta, intentelo nuevamente" + "\n");
				pausa();

				break;
			}
		} while (opcion != 9);

	}

	// Metodo que valida String
	public static String validar1050() {
		Scanner leer = new Scanner(System.in);
		String frase;
		do {
			System.out.println("(parrafo con un mínimo de 10 caracteres y un máximo de 50)");
			frase = leer.nextLine().strip();
		} while (frase.length() < 10 || frase.length() > 50);

		return frase;
	}

	// Metodo que valida String de largo entre 5 y 30 caracteres
	public static String validar0530() {
		Scanner leer = new Scanner(System.in);
		String frase;
		do {
			System.out.println("(parrafo con un mínimo de 5 caracteres y un máximo de 30)");
			frase = leer.nextLine().strip();
		} while (frase.length() < 5 || frase.length() > 30);

		return frase;
	}

	// metodo que valida un rut o un run
	public static Integer validarRolUnico() {
		Scanner leer = new Scanner(System.in);
		Integer rol;

		do {
			System.out.println("(sin digito verificador, hasta 8 digitos)");
			rol = validarEnteros();
		} while (rol == null || rol > 99999999 || rol < 999999);

		return rol;
	}

	/**
	 * metodo que añade una pausa a la ejecucion de la consola
	 * 
	 */

	public static void pausa() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	/**
	 * Metodo que valida la entrada solo de enteros, evitando error de consola
	 * 
	 */

	public static Integer validarEnteros() {
		Integer num;
		try {
			Scanner scanner = new Scanner(System.in);
			num = scanner.nextInt();
		} catch (Exception e) {
			num = null;
		}
		return num;
	}

	/**
	 * metodo que valida un string como formato de fecha (dd/mm/aaaa)
	 * 
	 * 
	 * @param fecha
	 * @return boolean
	 */
	public static boolean validarFecha(String fecha) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate.parse(fecha, formatter);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	/*
	 * Metodo que valida la hora Creamos la hora con formato del api Java
	 * SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss"); Date date =
	 * sdf.parse(myDateString);
	 */
	public static boolean validarHora(String hora) {
		try {

			LocalTime.parse(hora);

		} catch (Exception e) {
			return false;
		}
		return true;
	}

}