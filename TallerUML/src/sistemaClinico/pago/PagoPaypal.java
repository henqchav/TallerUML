package sistemaClinico.pago;

public class PagoPaypal implements Pago{
	protected float pago;
	protected String email;
	@Override
	public boolean realizarPago(float monto) {
		return true;
		}
}
