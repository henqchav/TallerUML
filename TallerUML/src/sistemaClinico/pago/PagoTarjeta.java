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
	public PagoTarjeta(float pago, String numero, String propietario, String banco, Date expira) {
		super();
		this.pago = pago;
		this.numero = numero;
		this.propietario = propietario;
		this.banco = banco;
		this.expira = expira;
	}
	public float getPago() {
		return pago;
	}
	public void setPago(float pago) {
		this.pago = pago;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public Date getExpira() {
		return expira;
	}
	public void setExpira(Date expira) {
		this.expira = expira;
	}
}
