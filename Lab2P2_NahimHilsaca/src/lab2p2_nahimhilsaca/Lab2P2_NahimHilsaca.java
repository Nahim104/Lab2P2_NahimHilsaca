/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_nahimhilsaca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nahim
 */
public class Lab2P2_NahimHilsaca {

    /**
     * @param args the command line arguments
     */
    static Scanner leer= new Scanner(System.in);
   
    static ArrayList<Chefs> chefs= new ArrayList<>();
    static ArrayList<Meseros> meseros= new ArrayList<>();
    static ArrayList<Bartenders> bartenders= new ArrayList<>();
    static ArrayList<Mesas> mesas= new ArrayList<>();
       public static void main(String[] args) {
       
        int opcion = 0;
        
        while(opcion !=2){
        
            System.out.println("RESTAURANTE TITO'S ");
            System.out.println("1.Ingrese Sesion");
            System.out.println("2. Salir");
            opcion= leer.nextInt();
            
            
            switch (opcion) {
                case 1 :
                    String gerente_usuario;
                    boolean usuario=false;
                    String gerente_contrasena;
                    boolean contrasenia=false;
                   
                    System.out.println("Ingrese el usuario: ");
                    gerente_usuario=leer.next();
                    leer.nextLine();
                    System.out.println("Ingrese la contrasenia: ");
                    gerente_contrasena= leer.next();
                    leer.nextLine();
                    
                    if (gerente_usuario.equals("gerente")) {
                        usuario=true;
                    }else{
                     System.out.println("Uusario ingresado incorrectamente ");
                     usuario=false;
                    }
                    if( gerente_contrasena.equals("g3r$nt0")) {
                        contrasenia=true;
                    }else{
                        System.out.println("Contrasenia ingresada incorrectamente");
                        usuario=false;
                    }
                    
                    if(usuario== true && contrasenia==true){
                            System.out.println("Credenciales ingresadas correctamente");
                      
                                   
                         int opcion_submenu=0;          
                        System.out.println("Ingrese el tipo de activo a manipular:  ");
                        System.out.println("Chefs ");
                        System.out.println("Meseros");
                        System.out.println("Bartenders");
                        System.out.println("Mesas ");
                        opcion_submenu=leer.nextInt();
                        
                        switch (opcion_submenu) {
                            case 1:
                                  System.out.println("Ha ingresado la opcion de chefs, elegir que realizar:");
                                  int opcion_chef=0;
                                  while(opcion_chef !=5){
                                  System.out.println("1.Crear un Chef");
                                  System.out.println("2.Listar Chefs");
                                  System.out.println("3.Modificar Chefs");
                                  System.out.println("4.Eliminar Chefs");
                                  System.out.println("5.Salir");
                                  opcion_chef= leer.nextInt();
                                  
                                  switch (opcion_chef) {
                                    case 1:
                                        AgregarChefs();
                                        System.out.println("Chef agregado exitosamente");
                                        break;
                                        
                                    case 2:
                                        for (Chefs chef : chefs) {
                                            System.out.println(chefs.indexOf(chef)+"-"+"\n"+chef.toString());
                                        }
                                        break;
                                        
                                    case 3:
                                        boolean matutino_vespertino=false;
                                        
                                         for (Chefs chef : chefs) {
                                            System.out.println(chefs.indexOf(chef)+"-"+"\n"+chef.toString());
                                        }
                                         
                                         System.out.println("Chef Seleccionado: ");
                                         int chef= leer.nextInt();
                                         
                                         if(chef>=0 && chef<chefs.size()){
                                                    
                                             System.out.print("Nombre: ");
           String nombre= leer.next();
          leer.nextLine();
          chefs.get(chef).setNombre(nombre);
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Numero de Estrellas: ");
           int n_estrellas= leer.nextInt();
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           
           chefs.get(chef).setEdad(edad);
           while (n_estrellas <0) {               
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               n_estrellas=leer.nextInt();
           }//Validar que las estrellas no sea negativo
           chefs.get(chef).setNumero_estrellas(n_estrellas);
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           }//Fin del if
           }//Fin del while
           chefs.get(chef).setTurno(turno);
            while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
            chefs.get(chef).setSueldo(sueldo);
            
         
                                         }else{
                                         
                                             System.out.println("Chef no encontrado ");
                                         }//Fin del if
                                         
                                        break;
                                        
                                    case 4:
                                        for (Chefs c  : chefs) {
                                            System.out.println(chefs.indexOf(c)+"-"+"\n"+c.toString());
                                        }
                                        
                                        System.out.println("Ingrese el chef a eliminar: ");
                                        int eliminar=leer.nextInt();
                                        
                                        if(eliminar>=0 && eliminar<chefs.size()){
                                            
                                            chefs.remove(eliminar);
                                        }else{
                                            System.out.println("Chef no encontrado");
                                        
                                        }
                                        
                                  
                                    
                                        break;
                                        
                                    case 5:
                                        System.out.println("Ha salido del menu chef");
                                        break;
                                    default:
                                        System.out.println("Debe de introducir de las opciones dadas");;
                                     break;
                                }//Fin del switch
                                  }//Fin del while para chefs
                               
                                
                            case 2:
                               System.out.println("Ha ingresado la opcion de meseros, elegir que realizar:");
                                  int opcion_mesero=0;
                                  while(opcion_mesero !=5){
                                  System.out.println("1.Crear un Mesero");
                                  System.out.println("2.Listar Mesero");
                                  System.out.println("3.Modificar Mesero");
                                  System.out.println("4.Eliminar Mesero");
                                  System.out.println("5.Salir");
                                  opcion_mesero = leer.nextInt();
                                  
                                      switch (opcion_mesero) {
                                          case 1:
                                              AgregarMesero();
                                              break;
                                              
                                              
                                          case 2:
                                              for (Meseros mesero : meseros) {
                                            System.out.println(meseros.indexOf(mesero)+"-"+"\n"+mesero.toString());
                                        }
                                              break;
                                              
                                          case 3:
                                               boolean matutino_vespertino=false;
                                        for (Meseros mesero : meseros) {
                                            System.out.println(chefs.indexOf(mesero)+"-"+"\n"+mesero.toString());
                                        }
                                         
                                         System.out.println("Mesero Seleccionado: ");
                                         int mesero= leer.nextInt();
                                         
                                         if(mesero>=0 && mesero<meseros.size()){
                                          System.out.print("Nombre: ");
          String nombre= leer.next();
          leer.nextLine();
          meseros.get(mesero).setNombre(nombre);
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Propina: ");
           int propina= leer.nextInt();
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           meseros.get(mesero).setEdad(edad);
           
           while (propina <0) {               
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               propina=leer.nextInt();
           }//Validar que las propinas no sea negativo
           
           meseros.get(mesero).setPropina(propina);
           
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           
           }//Fin del if
           }//Fin del while
           
           meseros.get(mesero).setTurno(turno);
           
           
           while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
           meseros.get(mesero).setSueldo(sueldo);
         
                                           
                                         }else{
                                             System.out.println("Mesero no encontrado");
                                         
                                         
                                         }//Fin del if
                                         
                                              
                                              break;
                                         
                                          case 4:
                                               for (Meseros m  : meseros) {
                                            System.out.println(chefs.indexOf(m)+"-"+"\n"+m.toString());
                                        }
                                        
                                        System.out.println("Ingrese el mesero a eliminar: ");
                                        int eliminar=leer.nextInt();
                                        
                                        if(eliminar>=0 && eliminar<meseros.size()){
                                            
                                            meseros.remove(eliminar);
                                        }else{
                                            System.out.println("Mesero no encontrado");
                                        
                                        }
                                              break;
                                              
                                          case 5:
                                              System.out.println("Ha salido del menu de Meseros");
                                              break;
                                                  
                                          default:
                                              System.out.println("Ingrese de las opciones correctas");
 
                                      }//Fin del switc
                                  }//Fin del while
                                  
                                break;
                                
                            case 3:
                                System.out.println("Ha ingresado la opcion de Bartender, elegir que realizar:");
                                  int opcion_bartender=0;
                                  while(opcion_bartender !=5){
                                  System.out.println("1.Crear un Bartender");
                                  System.out.println("2.Listar Bartender");
                                  System.out.println("3.Modificar Bartender");
                                  System.out.println("4.Eliminar Bartender");
                                  System.out.println("5.Salir");
                                  opcion_bartender = leer.nextInt();
                            
                                  
                                      switch (opcion_bartender) {
                                          case 1:
                                              AgregarBartenders();
                                              break;
                                              
                                          case 2:
                                              for (Bartenders bartender : bartenders) {
                                            System.out.println(chefs.indexOf(bartender)+"-"+"\n"+bartender.toString());
                                        }
                                              break;
                                              
                                              
                                          case 3:
                                               for (Bartenders bartender : bartenders) {
                                            System.out.println(chefs.indexOf(bartender)+"-"+"\n"+bartender.toString());
                                        }
                                                System.out.println("Bartender Seleccionado: ");
                                         int bart= leer.nextInt();
                                               boolean matutino_vespertino=false;
                                                if(bart>=0 && bart<bartenders.size()){
                                                System.out.print("Nombre: ");
          String nombre= leer.next();
          leer.nextLine();
         bartenders.get(bart).setNombre(nombre);
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Numero de Licores: ");
           int n_licores= leer.nextInt();
           
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           bartenders.get(bart).setEdad(edad);
           
           while (n_licores <0) {               
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               n_licores=leer.nextInt();
               
           }//Validar que las propinas no sea negativo
           bartenders.get(bart).setnumero_licores(n_licores);
           
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           
           }//Fin del if
           }//Fin del while
           bartenders.get(bart).setTurno(turno);
           while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
           bartenders.get(bart).setSueldo(sueldo);
                                                }else{
                                                
                                                    System.out.println("Bartender no encontrasdo");
                                                }
            
                                              break;
                                              
                                          case 4:
                                              for (Bartenders b  : bartenders) {
                                            System.out.println(chefs.indexOf(b)+"-"+"\n"+b.toString());
                                        }
                                        
                                        System.out.println("Ingrese el chef a eliminar: ");
                                        int eliminar=leer.nextInt();
                                        
                                        if(eliminar>=0 && eliminar<bartenders.size()){
                                            
                                            bartenders.remove(eliminar);
                                        }else{
                                            System.out.println("Chef no encontrado");
                                        
                                        }
                                              
                                              break;
                                          default:
                                              
                                               System.out.println("Ingrese de las opciones correctas");
                                      }
                                  }
                                break;
                                
                            case 4:
                                 System.out.println("Ha ingresado la opcion de Mesas, elegir que realizar:");
                                  int opcion_m=0;
                                  while(opcion_m !=5){
                                  System.out.println("1.Crear un Mesas");
                                  System.out.println("2.Listar Mesa");
                                  System.out.println("3.Modificar Mesa");
                                  System.out.println("4.Eliminar Mesa");
                                  System.out.println("5.Salir");
                                  opcion_bartender = leer.nextInt();
                                  
                                      switch (opcion_m) {
                                          case 1:
                                              AgregarMesas();
                                              break;
                                              
                                          case 2:
                                              
                                              for (Mesas mesa : mesas) {
                                            System.out.println(mesas.indexOf(mesa)+"-"+"\n"+mesa.toString());
                                        }
                                              break;
                                              
                                              
                                          case 3:
                                                for (Mesas mesa : mesas) {
                                            System.out.println(mesas.indexOf(mesa)+"-"+"\n"+mesa.toString());
                                        }
                                              
                                               System.out.println("Mesa Seleccionado: ");
                                         int mesa= leer.nextInt();
                                         
                                              if (mesa>=0 && mesa<mesas.size()) {
                                                    System.out.print("Platos: ");
           int platos= leer.nextInt();
          System.out.print("Utensilios: ");
           int utensilios= leer.nextInt();
           
           System.out.println("Precio Total: ");
           int precio_total=leer.nextInt();
           
           while(platos<0){
           
               System.out.println("Tiene que ingresar un plato real y que no sea 0");
               platos=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           mesas.get(mesa).setNumero_platos(platos);
           
           
           while (utensilios <0) {             
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               utensilios=leer.nextInt();
           }//Validar que las propinas no sea negativo
           mesas.get(mesa).setNumero_utens(utensilios);
           
         
          
           
           while (precio_total <0) {               
               System.out.println("Su precio debe de ser un numero real");
               precio_total=leer.nextInt();
           }
           mesas.get(mesa).setPrecio_total(precio_total);
         
                                                  
                                              } else {
                                                  System.out.println("MESA INCORRECTA");
                                              }
                                              break;
                                              
                                          case 4:
                                                 for (Mesas b  : mesas) {
                                            System.out.println(chefs.indexOf(b)+"-"+"\n"+b.toString());
                                        }
                                        
                                        System.out.println("Ingrese la mesa a eliminar: ");
                                        int eliminar=leer.nextInt();
                                        
                                        if(eliminar>=0 && eliminar<bartenders.size()){
                                            
                                          mesas.remove(eliminar);
                                        }else{
                                            System.out.println("Mesa no encontrado");
                                        }
                                              break;
                                          default:
                                            System.out.println("Ingrese de las opciones correctas");
                                            break;
                                      }//Fin del switch
                                  }//Fin del while
                                break;
                                
                                
                            default:
                                System.out.println("Ingrese de las opciones dadas");
                                break;
                        }
                       
                        }//Fin del if
                    }//Fin del while
           
        
    }//Fin del while
       }//Fin del metodo main
    
       public static void AgregarChefs (){
    
                int turno_matutino=0;
                int turno_vespertino=0;
                boolean matutino_vespertino=false;
         System.out.print("Nombre: ");
          String nombre= leer.next();
          leer.nextLine();
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Numero de Estrellas: ");
           int n_estrellas= leer.nextInt();
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           
           
           while (n_estrellas <0) {               
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               n_estrellas=leer.nextInt();
           }//Validar que las estrellas no sea negativo
           
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           
           }//Fin del if
           }//Fin del while
           
           if(turno.equals("matutino")){
           
           turno_matutino++;
           }
           
           if(turno.equals("vespertino")){
           
           turno_vespertino++;
           }
           
           if(turno_matutino ==7){
               System.out.println("Ya no puede agregar mas turnos matutinos");
           
           }
           if(turno_vespertino ==7){
               System.out.println("Ya no puede agregar mas turnos vespertinps");
           
           }
           
           while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
         
         chefs.add(new Chefs(nombre,edad,turno,n_estrellas,sueldo));
         
         
    }// Fin del metodo AgregarChefs
       
       
        public static void AgregarMesero (){
 
                int turno_matutino=0;
                int turno_vespertino=0;
                boolean matutino_vespertino=false;
         System.out.print("Nombre: ");
          String nombre= leer.next();
          leer.nextLine();
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Propina: ");
           int propina= leer.nextInt();
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           
           
           while (propina <0) {               
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               propina=leer.nextInt();
           }//Validar que las propinas no sea negativo
           
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           
           }//Fin del if
           }//Fin del while
           
           if(turno.equals("matutino")){
           
           turno_matutino++;
           }
           
           if(turno.equals("vespertino")){
           
           turno_vespertino++;
           }
           
           if(turno_matutino ==4){
               System.out.println("Ya no puede agregar mas turnos matutinos");
           
           }
           if(turno_vespertino ==4){
               System.out.println("Ya no puede agregar mas turnos vespertinps");
           
           }
           
           while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
         
         meseros.add(new Meseros(nombre,edad,turno,propina,sueldo));
         
         
    }// Fin del metodo AgregarMeseros
       
        public static void AgregarBartenders (){
 
                int turno_matutino=0;
                int turno_vespertino=0;
                boolean matutino_vespertino=false;
         System.out.print("Nombre: ");
          String nombre= leer.next();
          leer.nextLine();
           System.out.print("Edad: ");
           int edad= leer.nextInt();
           System.out.print("Turno: ");
           String turno= leer.next();
           leer.nextLine();
          System.out.print("Numero de Licores: ");
           int n_licores= leer.nextInt();
           
           System.out.println("Sueldo: ");
           int sueldo=leer.nextInt();
           
           while(edad<=0){
           
               System.out.println("Tiene que ingresar una edad real y que no sea 0");
               edad=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           
           
           while (n_licores <0) {               
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               n_licores=leer.nextInt();
           }//Validar que las propinas no sea negativo
           
           if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           }else{
           
           matutino_vespertino=false;
           }
           
           while(matutino_vespertino==false){
           
            System.out.println("Tiene que ingresar si es matutino o vespertino, todo minuscula");;
               turno=leer.next();
               leer.nextLine();
                if (turno.equals("matutino") || turno.equals("vespertino")) {
              matutino_vespertino=true;
           
           
           }//Fin del if
           }//Fin del while
           
           if(turno.equals("matutino")){
           
           turno_matutino++;
           }
           
           if(turno.equals("vespertino")){
           
           turno_vespertino++;
           }
           
           if(turno_matutino ==4){
               System.out.println("Ya no puede agregar mas turnos matutinos");
           
           }
           if(turno_vespertino ==4){
               System.out.println("Ya no puede agregar mas turnos vespertinps");
           
           }
           
           while (sueldo <0) {               
               System.out.println("Su sueldo debe de ser un numero real");
               sueldo=leer.nextInt();
           }
         
         bartenders.add(new Bartenders(nombre,edad,turno,n_licores,sueldo));
         
         
    }// Fin del metodo AgregarChefs 
    
        
           public static void AgregarMesas (){
 
               
        
        
           System.out.print("Platos: ");
           int platos= leer.nextInt();
          System.out.print("Utensilios: ");
           int utensilios= leer.nextInt();
           
           System.out.println("Precio Total: ");
           int precio_total=leer.nextInt();
           
           while(platos<0){
           
               System.out.println("Tiene que ingresar un plato real y que no sea 0");
               platos=leer.nextInt();
           }// Validar que la edad no sea 0 o negativo
           
           
           while (utensilios <0) {               
               System.out.println("Tiene que ingresar una propina real y que no sea 0");
               utensilios=leer.nextInt();
           }//Validar que las propinas no sea negativo
           
         
          
           
           while (precio_total <0) {               
               System.out.println("Su precio debe de ser un numero real");
               precio_total=leer.nextInt();
           }
         
         mesas.add(new Mesas(platos,utensilios,precio_total));
         
         
    }// Fin del metodo AgregarChefs 
  
  
       
      
}//Fin de la clase
