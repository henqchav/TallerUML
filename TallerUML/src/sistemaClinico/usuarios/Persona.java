package sistemaClinico.usuarios;

import java.util.Date;

public class Persona {
	protected String usuario, clave, nombre, apellido, cedula, direccion;
	protected Date fechaNac;
	protected Administrador admin;
	
	public boolean logIn() {
		return true;
	}
	public boolean logOut() {
		return true;
	}
}
