package sistemaClinico.usuarios;

public class Paciente {
	protected String email;
	
	public Paciente(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean solicitarCita() {
		return true;
	}
}
