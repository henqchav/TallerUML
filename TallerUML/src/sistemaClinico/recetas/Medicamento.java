package sistemaClinico.recetas;

public class Medicamento {
	protected String medicina;
	protected String dosis;
	protected String observaciones;
	protected int cantidadTotal;
	protected String unidad;
	
	public Medicamento(){}

	public String getMedicina() {
		return medicina;
	}

	public void setMedicina(String medicina) {
		this.medicina = medicina;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	@Override
	public String toString() {
		return "Medicamento [medicina=" + medicina + ", dosis=" + dosis + ", observaciones=" + observaciones
				+ ", cantidadTotal=" + cantidadTotal + ", unidad=" + unidad + "]";
	}

	public Medicamento(String medicina, String dosis, String observaciones, int cantidadTotal, String unidad) {
		super();
		this.medicina = medicina;
		this.dosis = dosis;
		this.observaciones = observaciones;
		this.cantidadTotal = cantidadTotal;
		this.unidad = unidad;
	}
}
