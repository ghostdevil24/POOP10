/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

import ExcepcionesPropias.SaldoInsuficienteException;

/**
 *
 * @author poo01alu03
 */
class Cuenta {

    private double saldo;

    public Cuenta() {
    }
    public void retirar(double monto) throws SaldoInsuficienteException{
        System.out.println("Retirando: "+monto);
        if(saldo<monto)
            throw new SaldoInsuficienteException();
        else
            this.saldo -=monto;
    }
    public void depositar(double monto){
        System.out.println("Deppositando: "+monto);
        this.saldo +=monto;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
}
