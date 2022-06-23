package sistemaClinico.usuarios;

import sistemaClinico.historiaClinica.Cita;

public class Paciente extends Persona{
	protected String email;
	protected Cita cita;
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
	
	public Cita getCita(){
		return this.cita;
	}

	public void setCita(Cita cita){
		this.cita = cita;
	}

	public boolean solicitarCita() {
		java.util.Date date = new java.util.Date();
		Cita cita = new Cita(date, false, this.usuario); //pagada es false porque se paga al momento de verificar la cita
		this.cita = cita;
		return true;
	}

}
