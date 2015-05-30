package Tienda;

public class tiendas {
String idtienda;

public tiendas(String idtienda) {
	super();
	this.idtienda = idtienda;
}

@Override
public String toString() {
	return "tiendas [idtienda=" + idtienda + "]";
}

public String getIdtienda() {
	return idtienda;
}

public void setIdtienda(String idtienda) {
	this.idtienda = idtienda;
}
}
