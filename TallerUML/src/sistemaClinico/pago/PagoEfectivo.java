package sistemaClinico.pago;

public class PagoEfectivo implements Pago {
	protected float pago;
	
	public PagoEfectivo(float pago) {
		super();
		this.pago = pago;
	}

	public float getPago() {
		return pago;
	}

	public void setPago(float pago) {
		this.pago = pago;
	}

	@Override
	public boolean realizarPago(float monto) {
		return true;
		}
	
}
