/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Meseros {
      private String Nombre;
    private int Edad;
    private String turno;
    private int propina;
    private int sueldo;
   
    
 public Meseros(){
 
 
 }//Fin del metodo vacio
 
 public Meseros(String n){
 
 Nombre=n;//Mi variable Nombre coincide con mi parametro n
 
 }//Fin del metodo
 
  public Meseros(String n, int Edad, String turno, int propina, int sueldo){
 
 Nombre=n;
 
 this.turno=turno;
 
 this.propina=propina;
 
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

    public int getPropina() {
        return propina;
    }

    public void setPropina(int propina) {
        this.propina = propina;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
  
  
    public String toString(){
    
    return "Nombre:"+Nombre+"\n"+"Edad:"+Edad+"\n"+"Turno:"+turno+"\n"+"Propina:"+propina+"\n"+"Sueldo:"+sueldo+"\n";
    
    }//Metodo Administracion
 
}//Fin de la clase
