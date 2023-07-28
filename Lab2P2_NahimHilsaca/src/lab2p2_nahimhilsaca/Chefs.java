/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Chefs {
    //artibutos
    
    private String Nombre;
    private int Edad;
    private String turno;
    private int numero_estrellas;
    private int sueldo;
   
    
 public Chefs(){
 
 
 }//Fin del metodo vacio
 
 public Chefs(String n){
 
 Nombre=n;
 
 }//Fin del metodo
 
 
 public Chefs(String n, int Edad, String turno, int numero_estrellas, int sueldo){
 
 Nombre=n;
 
 this.turno=turno;
 
 this.numero_estrellas=numero_estrellas;
 
 this.sueldo=sueldo;
 
 this.Edad=Edad;
 
 }//Fin del metodo sobrecargado

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String n) {
        Nombre = n;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumero_estrellas() {
        return numero_estrellas;
    }

    public void setNumero_estrellas(int numero_estrellas) {
        this.numero_estrellas = numero_estrellas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
 
 
    public String toString(){
    
    return "Nombre:"+Nombre+"\n"+"Edad:"+Edad+"\n"+"Turno:"+turno+"\n"+"Estrellas Michelin:"+numero_estrellas+"\n"+"Sueldo:"+sueldo+"\n";
    
    }//Metodo Administracion

 
 
}//Fin de la clase


