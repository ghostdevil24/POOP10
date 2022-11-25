/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import ExcepcionesPropias.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu03
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            String mensajes[] ={"Mensaje 1","Mensaje 2","Mensaje 3"};
            System.out.println(mensajes[1]);
            for (int i = 0; i <mensajes.length; i++) {
                System.out.println(mensajes[i]); 
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            e.printStackTrace();
        }
        System.out.println("#########################################");
        try{
            float x=10/2;
            System.out.println("x="+x);
        } catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally");
        }
        System.out.println("#######Catch anidado#########");
        try{
            float x=10/0;
            System.out.println("x="+x);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: apuntador fuera de los limites");
            e.printStackTrace();
        } 
        catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }
        System.out.println("#######Propagacion de Excepciones#########");
        try{
            float division = metodoDivision(4,0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion que sucede en el metodo");
        }
        System.out.println("#############Excepciones marcadas##################");
        try{
            float div = metodoDivisionMarcada(3,0);
        } catch(ArithmeticException e){
            System.out.println("Division entre 0 marcada");
        }
        System.out.println("#######Creación de excepciones#######");
        Cuenta cuenta = new Cuenta();
        try {
            cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    

    private static float metodoDivision(int a, int b) {
       return a/b;
    }

    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{
        return a/b;
    }

 
}
