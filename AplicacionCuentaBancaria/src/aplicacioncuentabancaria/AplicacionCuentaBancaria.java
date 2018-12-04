/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncuentabancaria;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AplicacionCuentaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String entidad;
        String oficina;
        String numerointernocuenta;
        String titular;
        int opcion;
        
        System.out.println("Dime el codigo de entidad");
        entidad = leer.nextLine();
        System.out.println("Dime el codigo de oficina");
        oficina = leer.nextLine();
        System.out.println("Dime el numero de cuenta");
        numerointernocuenta = leer.nextLine();
        System.out.println("Dime el nombre del titular");
        titular = leer.nextLine();
        CuentaBancaria c = new CuentaBancaria("", "", 0);
       
      

        
         do{
             Menu.mostrarMenu();
            opcion = leer.nextInt();
            switch(opcion){
                //Ver el número de cuenta completo (CCC- Código Cuenta Cliente).
                case 1:
                    System.out.println(c.getNumerocuenta());
                    break;
                //Ver el titular de la cuenta.
                case 2:
                    System.out.println(c.getTitular());
                    break;
                //Ver el código de la entidad.    
                case 3:
                    System.out.println(c.getCodigoentidad());
                    break;
                //Ver el código de la oficina.    
                case 4:
                    System.out.println(c.getCodigooficina());
                    break;
                //Ver el número de la cuenta (solamente el número de cuenta, sin entidad, oficina ni dígitos de control).
                case 5:
                    System.out.println(c.getNumcuentainterno());
                    break;
                //Ver los dígitos de control de la cuenta.
                case 6:
                    System.out.println(c.calcularDigitosControl());
                    break;
                //Realizar un ingreso. Habrá que solicitar por teclado la cantidad que se desea ingresar.
                case 7:
                    c.añadirSaldo();
                    break;
                //Consultar saldo.
                case 8:
                    System.out.println(c.getSaldo());
                    break;
                //Retirar efectivo. Habrá que solicitar por teclado la cantidad que se desea retirar.
                case 9:
                    c.añadirSaldo();
                    break;
                //Salir de la aplicación.
                case 10:
                    System.out.println("ADIOS");
                    
                    
        }
    }while(opcion!=10);
}
}