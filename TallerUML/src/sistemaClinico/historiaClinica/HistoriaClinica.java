package sistemaClinico.historiaClinica;

import java.util.ArrayList;

public class HistoriaClinica<E> {
	public int nro;
	public ArrayList<E> enfermdades = new ArrayList<E>();
	public ArrayList<E> alergias = new ArrayList<E>();
	public ArrayList<E> otros = new ArrayList<E>();
	
	public HistoriaClinica(int nro, ArrayList<E> enfermdades, ArrayList<E> alergias, ArrayList<E> otros) {
		super();
		this.nro = nro;
		this.enfermdades = enfermdades;
		this.alergias = alergias;
		this.otros = otros;
	}
	
	public int getNro() {
		return nro;
	}

	public void setNro(int nro) {
		this.nro = nro;
	}
	public ArrayList<E> getEnfermdades() {
		return enfermdades;
	}
	public void setEnfermdades(ArrayList<E> enfermdades) {
		this.enfermdades = enfermdades;
	}
	public ArrayList<E> getAlergias() {
		return alergias;
	}
	public void setAlergias(ArrayList<E> alergias) {
		this.alergias = alergias;
	}
	public ArrayList<E> getOtros() {
		return otros;
	}
	public void setOtros(ArrayList<E> otros) {
		this.otros = otros;
	}
	
	
}