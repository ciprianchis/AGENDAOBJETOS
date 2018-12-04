package aplicacioncuentabancaria;

import java.util.Locale;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class CuentaBancaria {
    private String numerocuenta;
    private String codigoentidad;
    private String codigooficina;
    private String digitoscontrol;
    private String numcuentainterno;
    private String titular;
    private int saldo;


    public CuentaBancaria(String numcuentainterno, String titular, int saldo) {
        this.numcuentainterno = numcuentainterno;
        //Troceo
        partirNumCuenta();
        
        this.titular = titular;
        this.saldo = saldo;
    }
    
    private void partirNumCuenta(){
        if (getNumcuentainterno().length()==20){
            
        }else{
            
        }
    }
    
    public int calcularDigitosControl(){
        int nument1, nument2, nument3, nument4,resto1;      
        int numeofi1, numeofi2, numeofi3, numeofi4;  
        int cif1, cif2, cif3, cif4, cif5, cif6, cif7, cif8, cif9, cif10;
        int suma, suma2;
        int restodigito1, restodigito2 = 0;
            nument1 =  Integer.getInteger(getCodigoentidad().substring(0, 1)) * 4;
            nument2 =  Integer.getInteger(getCodigoentidad().substring(1, 2)) * 8; 
            nument3 =  Integer.getInteger(getCodigoentidad().substring(2, 3)) * 5;
            nument4 =  Integer.getInteger(getCodigoentidad().substring(3, 4)) * 10;
       
            numeofi1 = Integer.getInteger(getCodigooficina().substring(0, 1)) * 9;
            numeofi2 = Integer.getInteger(getCodigooficina().substring(1, 2)) * 7;
            numeofi3 = Integer.getInteger(getCodigooficina().substring(2, 3)) * 3;
            numeofi4 = Integer.getInteger(getCodigooficina().substring(3, 4)) * 6;
        
        suma = (nument1+nument2+nument3+nument4+numeofi1+numeofi2+numeofi3+numeofi4);
        resto1=suma%11;
        restodigito1 = 11-resto1;
        setDigitoscontrol(String.valueOf(restodigito1));
        if (restodigito1==10){
           restodigito1=1; 
        }  
        if(restodigito1==11){
            restodigito1=0;
        }
            
            cif1 = Integer.getInteger(getNumcuentainterno().substring(0, 1)) * 1;
            cif2 = Integer.getInteger(getNumcuentainterno().substring(1, 2)) * 2;
            cif3 = Integer.getInteger(getNumcuentainterno().substring(2, 3)) * 4;
            cif4 = Integer.getInteger(getNumcuentainterno().substring(3, 4)) * 8;
            cif5 = Integer.getInteger(getNumcuentainterno().substring(4, 5)) * 5;
            cif6 = Integer.getInteger(getNumcuentainterno().substring(5, 6)) * 10;
            cif7 = Integer.getInteger(getNumcuentainterno().substring(6, 7)) * 9;
            cif8 = Integer.getInteger(getNumcuentainterno().substring(7, 8)) * 7;
            cif9 = Integer.getInteger(getNumcuentainterno().substring(8, 9)) * 3;
            cif10 = Integer.getInteger(getNumcuentainterno().substring(9, 10)) * 6;
        
        suma2= (cif1+cif2+cif3+cif4+cif5+cif6+cif7+cif8+cif9+cif10);
        
        if (restodigito2==10){
           restodigito2=1; 
        }  
        if(restodigito2==11){
            restodigito2=0;   
      
      
    }
        return (restodigito1 + restodigito2);
    }

    
    public void añadirSaldo(){
        Scanner leer=new Scanner(System.in);        
        System.out.println("Cantidad a añadir");
        setSaldo(getSaldo() + leer.nextInt());
    }
    

    /**
     * @return the numerocuenta
     */
    public String getNumerocuenta(){
        return numerocuenta;
    }

    /**
     * @param numerocuenta the numerocuenta to set
     */
    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    /**
     * @return the codigoentidad
     */
    public String getCodigoentidad() {
        return codigoentidad;
    }

    /**
     * @param codigoentidad the codigoentidad to set
     */
    public void setCodigoentidad(String codigoentidad) {
        this.codigoentidad = codigoentidad;
    }

    /**
     * @return the codigooficina
     */
    public String getCodigooficina() {
        return codigooficina;
    }

    /**
     * @param codigooficina the codigooficina to set
     */
    public void setCodigooficina(String codigooficina) {
        this.codigooficina = codigooficina;
    }

    /**
     * @return the digitoscontrol
     */
    public String getDigitoscontrol() {
        return digitoscontrol;
    }

    /**
     * @param digitoscontrol the digitoscontrol to set
     */
    public void setDigitoscontrol(String digitoscontrol) {
        this.digitoscontrol = digitoscontrol;
    }

    /**
     * @return the numcuentainterno
     */
    public String getNumcuentainterno() {
        return numcuentainterno;
    }

    /**
     * @param numcuentainterno the numcuentainterno to set
     */
    public void setNumcuentainterno(String numcuentainterno) {
        this.numcuentainterno = numcuentainterno;
    }

    /**
     * @return the titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular the titular to set
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    

}
    


