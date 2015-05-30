package Tienda;

public class productos {
public String getIdproductos() {
		return idproductos;
	}

	public void setIdproductos(String idproductos) {
		this.idproductos = idproductos;
	}

public productos(String idproductos) {
		super();
		this.idproductos = idproductos;
	}

@Override
	public String toString() {
		return "productos [idproductos=" + idproductos + "]";
	}

String idproductos;
}
