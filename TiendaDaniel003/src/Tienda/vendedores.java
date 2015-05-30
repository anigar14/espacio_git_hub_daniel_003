package Tienda;

public class vendedores {
String idvendedor;

public vendedores(String idvendedor) {
	super();
	this.idvendedor = idvendedor;
}

@Override
public String toString() {
	return "vendedores [idvendedor=" + idvendedor + "]";
}

public String getIdvendedor() {
	return idvendedor;
}

public void setIdvendedor(String idvendedor) {
	this.idvendedor = idvendedor;
}
}
