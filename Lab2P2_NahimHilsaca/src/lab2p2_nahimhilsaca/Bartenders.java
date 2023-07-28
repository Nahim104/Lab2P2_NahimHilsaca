/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Bartenders {
    private String Nombre;
    private int Edad;
    private String turno;
    private int numero_licores;
    private int sueldo;
   
    
 public Bartenders(){
 
 
 }//Fin del metodo vacio
 
 public Bartenders(String n){
 
 Nombre=n;//Mi variable Nombre coincide con mi parametro n
 
 }//Fin del metodo
 
  public Bartenders(String n, int Edad, String turno, int numero_licores, int sueldo){
 
 Nombre=n;
 
 this.turno=turno;
 
 this.numero_licores=numero_licores;
 
 this.sueldo=sueldo;
 
 this.Edad=Edad;
 
 }//Fin del metodo sobrecargado

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String n) {
        Nombre=n;
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

    public int getnumero_licores() {
        return numero_licores;
    }

    public void setnumero_licores(int numero_licores) {
        this.numero_licores = numero_licores;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
  
  
    public String toString(){
    
    return "Nombre:"+Nombre+"\n"+"Edad:"+Edad+"\n"+"Turno:"+turno+"\n"+"Numero de Licores:"+numero_licores+"\n"+"Sueldo:"+sueldo+"\n";
    
    }//Metodo Administracion
 
    
    
}//Fin de la clase
