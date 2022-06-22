package sistemaClinico.recetas;

import java.util.Date;

public class Receta {
 protected Date fecha;
 
 public Date getFecha() {
	return fecha;
}

public void setFecha(Date fecha) {
	this.fecha = fecha;
}

@Override
public String toString() {
	return "Receta [fecha=" + fecha + "]";
}


}
