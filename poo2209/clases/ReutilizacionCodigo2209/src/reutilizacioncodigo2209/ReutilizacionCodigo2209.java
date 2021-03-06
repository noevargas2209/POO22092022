/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reutilizacioncodigo2209;

import Asus.com.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Procesador;
import ico.fes.componentes.Teclado;
import ico.fes.herencia.Alumno;
import javax.swing.JFrame;

/**
 *
 * @author Noé
 */
public class ReutilizacionCodigo2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre= new String("José José");
        System.out.println( nombre );
        System.out.println( nombre.charAt(5) );
        System.out.println( nombre.toUpperCase() );
        
        /*
        JFrame ventana = new JFrame("Mi primer ventana java");
        ventana.setSize(600, 400);
        ventana.setVisible(true);
        */
        
        Computadora miCompu= new Computadora ();
        miCompu.setMarca("Asus");
        miCompu.setCpu(new Procesador("Intel", 2.6f));
        System.out.println( miCompu );
        miCompu.getCpu().setMarca("AMD");
        System.out.println(miCompu);
        miCompu.setRaton(new Mouse("Logitech", "Óptico"));
        System.out.println(miCompu);
        
        Computadora compu2= new Computadora("Apple", "Mcbook pro",
                new Monitor("Toshiba",14.3f), 
                new Mouse ("Actek", "optico"), 
                new Teclado("Apple",101), 
                new Procesador("M1",3.4f));
        System.out.println(compu2);
        compu2.getRaton().setMarca("Apple");
        compu2.getRaton().setTipo("Touch");
        System.out.println(compu2);
        
        System.out.println("---------------------------------------------");
        Alumno alu1= new Alumno();
        alu1.setNombre("José");
        System.out.println(alu1);
        
        Alumno alu2 = new Alumno("1234567-8", "ICO" , "José Perex", 19);
        System.out.println(alu2);
        
    }
    
}
