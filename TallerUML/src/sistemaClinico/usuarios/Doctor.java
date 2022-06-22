package sistemaClinico.usuarios;

import java.util.ArrayList;

import sistemaClinico.historiaClinica.Cita;

public class Doctor<E> extends Persona {
	protected int regDoctor;
	protected String especialidad;
	protected ArrayList<E> cita;
	
    public Doctor(int regDoctor, String especialidad, ArrayList<E> cita) {
		super();
		this.regDoctor = regDoctor;
		this.especialidad = especialidad;
	    	this.cita = cita;
	}
	public int getRegDoctor() {
		return regDoctor;
	}
	public void setRegDoctor(int regDoctor) {
		this.regDoctor = regDoctor;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
		
	public ArrayList<E> getCita() {
		return cita;
	}
	public void setCita(ArrayList<E> cita) {
		this.cita = cita;
	}
	public void recetar(){}
    public void agregarPlanNut(){}
    public void ImprimirReceta(){}
    public void registrarSecretaria(){}
	
	public Cita AtenderPaciente(){}
	
}
