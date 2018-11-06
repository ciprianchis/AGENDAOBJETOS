/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaagendaobjeto;

/**
 *
 * @author alumno
 */
public class JavaAGENDAOBJETO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor gestor=new Gestor("Agenda");
        System.out.println(gestor.mostrarTodasPersonas());
        
        Persona per1= new Persona("Alin", "7272457257");
        Persona per2= new Persona("Chis", "2547258436",52);
        Persona[] vAgenda=new Persona[5];
        vAgenda[0]=per1;
        vAgenda[1]=per2;
        
        for (int i = 0; i < vAgenda.length; i++) {
            if(vAgenda[i]!=null)
                System.out.println(vAgenda[i].toString());
        }
        
    }
    
}
