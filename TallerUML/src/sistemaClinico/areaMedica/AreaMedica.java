package sistemaClinico.areaMedica;

import sistemaClinico.usuarios.Doctor;

public class AreaMedica {
	public Doctor doctor;
	public String especialidad;
	public float costo;
	
	public AreaMedica(Doctor doctor, String especialidad, float costo) {
		super();
		this.doctor = doctor;
		this.especialidad = especialidad;
		this.costo = costo;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "AreaMedica [doctor=" + doctor + ", especialidad=" + especialidad + ", costo=" + costo + "]";
	}
	
	
}
