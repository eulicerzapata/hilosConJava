/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cliente.compra.thread.producto;

import com.mycompany.cliente.compra.cliente.producto.ClienteProducto;
import com.mycompany.cliente.compra.cliente.producto.Producto;


public class CajeraThreadProducto extends Thread {
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }
    
    @Override
    public void run(){
        System.out.println(
        "la cajera: " + this.nombre
        + "comienza a procesar la compra del cliente "+
                this.cliente.getNombre() + "en el tiempo: "+
                (System.currentTimeMillis() - this.tiempoInicial)/1000+" seg");
        
        
        int contCliente=1;
       for(Producto producto:cliente.getProductos()){
           this.esperarXsegundos();
           System.out.println("procesando el producto " + contCliente
           +" nombre producto "+ producto.getNombre()
           +" precio producto "+ producto.getPrecio()
           +" cantidad de productops "+ producto.getCantidad()
           +" costo total del producto "+producto.getCantidad()+producto.getPrecio()
           +" ->Tiempo "+  (System.currentTimeMillis() - this.tiempoInicial)/1000+" seg " );
       }
       System.out.println("la cajera " + this.nombre + "ha terminado de procesar "
       + this.cliente.getNombre()+" en el tiempo "
       + (System.currentTimeMillis() - this.tiempoInicial)/1000+" seg");
       contCliente++;
    
    }
    private void esperarXsegundos(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    }

