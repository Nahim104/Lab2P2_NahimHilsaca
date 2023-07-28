/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_nahimhilsaca;

/**
 *
 * @author nahim
 */
public class Mesas {
    
    private int numero_platos;
    private int numero_utens;
    private int precio_total;
    
    
public Mesas(){


}//Fin del metodo vacio


public Mesas(int n){
numero_platos=n;


}///Fin del metodo

public Mesas(int n, int numero_utens, int precio_total){

    numero_platos=n;
    
    this.numero_utens=numero_utens;
    
    this.precio_total=precio_total;


}//Fin del metodo sobrecargado

    public int getNumero_platos() {
        return numero_platos;
    }

    public void setNumero_platos(int numero_platos) {
        this.numero_platos = numero_platos;
    }

    public int getNumero_utens() {
        return numero_utens;
    }

    public void setNumero_utens(int numero_utens) {
        this.numero_utens = numero_utens;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }



public String toString(){

return "No. de Platos:"+numero_platos+"\n"+"Numero de Utensilios:"+numero_utens+"\n"+"Precio Total:"+precio_total+"\n";

}//Metodo Administracion
    
}//Fin de la clase
