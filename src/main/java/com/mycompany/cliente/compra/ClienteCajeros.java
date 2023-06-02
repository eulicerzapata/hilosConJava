/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cliente.compra;

import com.mycompany.cliente.compra.cliente.producto.ClienteProducto;
import com.mycompany.cliente.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USUARIO
 */
public class ClienteCajeros {

    public static void main(String[] args) {
        
       List<Producto> productos = new ArrayList<>();
       setProductos(productos);
       
       
        ClienteProducto cliete1=new ClienteProducto("cliente 1 ",productos);
        ClienteProducto cliete2=new ClienteProducto("cliente 2 ",productos);
        
        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Emma ");
        CajeraProducto cajera2 = new CajeraProducto("Martha ");
        
        cajera1.procesarCompra(cliete1, tiempoInicial);
        cajera2.procesarCompra(cliete2, tiempoInicial);
    }
    
    private static void setProductos(List<Producto> productos){
        Producto producto1 = new Producto("Manzana",200,6);
        Producto producto2 = new Producto("pera",400,7);
        Producto producto3 = new Producto("cafe",1000,1);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
    }
}
