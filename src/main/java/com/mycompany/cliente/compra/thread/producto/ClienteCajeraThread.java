/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.compra.thread.producto;

import com.mycompany.cliente.compra.cliente.producto.ClienteProducto;
import com.mycompany.cliente.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;


public class ClienteCajeraThread {
    public static void main(String[] args){
        
        List<Producto> productos = new ArrayList<>();
       setProductos(productos);
       
       
        ClienteProducto cliete1=new ClienteProducto("cliente 1 ",productos);
        ClienteProducto cliete2=new ClienteProducto("cliente 2 ",productos);
        
        long tiempoInicial = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Emma ",cliete1,tiempoInicial);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Martha ",cliete2,tiempoInicial);
        
        cajera1.start();
        cajera2.start();
    }
        public static void setProductos(List<Producto> productos){
            Producto p1= new Producto("Mora", 1200,2);
            Producto p2= new Producto("papa", 1300,5);
            Producto p3= new Producto("Yuca", 1100,2);
            
            productos.add(p3);
            productos.add(p2);
            productos.add(p1);
            
            
        }
    
}
