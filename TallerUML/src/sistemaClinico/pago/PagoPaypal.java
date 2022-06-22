package sistemaClinico.pago;

public class PagoPaypal implements Pago{
	protected float pago;
	protected String email;
	public PagoPaypal(float pago, String email) {
		super();
		this.pago = pago;
		this.email = email;
	}
	public float getPago() {
		return pago;
	}
	public void setPago(float pago) {
		this.pago = pago;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public boolean realizarPago(float monto) {
		return true;
		}
}
