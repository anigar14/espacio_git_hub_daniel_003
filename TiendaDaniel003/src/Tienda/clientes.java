package Tienda;

public class clientes {
String idcliente;

@Override
public String toString() {
	return "clientes [idcliente=" + idcliente + "]";
}

public String getIdcliente() {
	return idcliente;
}

public clientes(String idcliente) {
	super();
	this.idcliente = idcliente;
}

public void setIdcliente(String idcliente) {
	this.idcliente = idcliente;
}
}
