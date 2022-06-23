package sistemaClinico.historiaClinica;

import java.util.Date;

import sistemaClinico.usuarios.Doctor;
import sistemaClinico.usuarios.Paciente;

public class Cita {

	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Paciente paciente;
	protected Doctor doctor;
	
	public Cita(Date fecha, boolean pagada, String registradoPor, Paciente paciente, Doctor doctor) {
		super();
		this.fecha = fecha;
		this.pagada = pagada;
		this.registradoPor = registradoPor;
		this.paciente = paciente;
		this.doctor = doctor;
	}
	public Cita(Date fecha, boolean pagada, String registradoPor) {
		super();
		this.fecha = fecha;
		this.pagada = pagada;
		this.registradoPor = registradoPor;
	}
	
	public void realizarPago (float pago) {
		this.pagada= true;
	}
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

