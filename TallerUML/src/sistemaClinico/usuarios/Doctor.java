package sistemaClinico.usuarios;

public class Doctor extends Persona {
	protected int regDoctor;
	protected String especialidad;
	
    public Doctor(int regDoctor, String especialidad) {
		super();
		this.regDoctor = regDoctor;
		this.especialidad = especialidad;
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
	public void recetar(){}
    public void agregarPlanNut(){}
    public void ImprimirReceta(){}
    public void registrarSecretaria(){}
	
}
