package Tienda;

public class principal {

	public static void main(String[] args) {
		clientes cliente1= new clientes("clienteuno");
		clientes cliente2= new clientes("clientedos");
		clientes cliente3= new clientes("clientetres");
		productos producto1=new productos("productouno");
		productos producto2=new productos("productodos");
		productos producto3=new productos("productotres");
		vendedores vendedor1=new vendedores("vendedoruno");
		vendedores vendedor2=new vendedores("vendedordos");
		vendedores vendedor3=new vendedores("vendedortres");
		tiendas tienda1=new tiendas("tiendauno");
		tiendas tienda2=new tiendas("tiendados");
		tiendas tienda3=new tiendas("tiendatres");
	}

}
