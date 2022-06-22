package sistemaClinico.pago;

public class PagoEfectivo implements Pago {
	protected float pago;
	
	@Override
	public boolean realizarPago(float monto) {
		return true;
		}
	
}
