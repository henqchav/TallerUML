package sistemaClinico.pago;

import java.util.Date;

public class PagoTarjeta implements Pago{
	protected float pago;
	protected String numero, propietario, banco;
	protected Date expira;
	@Override
	public boolean realizarPago(float monto) {
		return true;
		}
}
