package sistemaClinico.usuarios;

import java.util.ArrayList;
import java.util.Queue;

import sistemaClinico.historiaClinica.Cita;
import sistemaClinico.recetas.Medicamento;

public class Doctor extends Persona {
	protected int regDoctor;
	protected String especialidad;
	protected Queue<Cita> citas;
	
    public Doctor(int regDoctor, String especialidad, Queue<Cita> citas) {
		super();
		this.regDoctor = regDoctor;
		this.especialidad = especialidad;
	    	this.citas = citas;
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
		
	public Queue<Cita> getCitas() {
		return citas;
	}
	public void setCita(Queue<Cita> cita) {
		this.citas = cita;
	}
	public Medicamento recetar(Paciente paciente){
		return new Medicamento();
	}
    public void agregarPlanNut(Paciente paciente){}
    public void ImprimirReceta(Medicamento medicamento){}
    public void registrarSecretaria(){}
	
	public void AtenderPaciente(){
		Cita cita = citas.poll();
		Paciente paciente = cita.getPaciente();
		recetar(paciente);
		ImprimirReceta(recetar(paciente));
		agregarPlanNut(paciente);
	}
	
}
