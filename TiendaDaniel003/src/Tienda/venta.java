package Tienda;

public class venta {
String fechahora;

public String getFechahora() {
	return fechahora;
}

public venta(String fechahora) {
	super();
	this.fechahora = fechahora;
}

@Override
public String toString() {
	return "venta [fechahora=" + fechahora + "]";
}

public void setFechahora(String fechahora) {
	this.fechahora = fechahora;
}
}
