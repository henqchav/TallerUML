package sistemaClinico.historiaClinica;
import java.util.Date;

import sistemaClinico.usuarios.Doctor;
import sistemaClinico.usuarios.Paciente;

public class Cita {
	public Date fecha;
	public boolean pagada;
	public String registradoPor;
	public Paciente paciente;
	public Doctor doctor;
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void realizarPago (float pago) {
		this.pagada= true;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public boolean isPagada() {
		return pagada;
	}
	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	public String getRegistradoPor() {
		return registradoPor;
	}
	public void setRegistradoPor(String registradoPor) {
		this.registradoPor = registradoPor;
	}
	
}

