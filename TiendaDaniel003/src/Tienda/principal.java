package Tienda;

import java.text.SimpleDateFormat;
import java.util.*;

public class principal {

	public static void main(String[] args) {
		
		Date fechaActual = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
		String cadenaFecha = formato.format(fechaActual);
		
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
		
		System.out.println("El cliente " +cliente1+ " a comprado " +producto1+ " al vendedor " +vendedor1+ " en la tienda " +tienda1+ " a la hora " +cadenaFecha);
	}

}
