/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8p1_dannnacasco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class Lab8P1_DannnaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
    Scanner entrada = new Scanner(System.in);
    int opcion;
        
        System.out.println("---Hola Memo, bienvenido al Lab8 de Danna :)---");
        
        do{
        System.out.println("-----------------------------------------------");
        System.out.println("1.Pocket Monster\n2.DC vrs Marvel\n3.SALIR");
        System.out.print("Ingrese una opcion: ");
        opcion = entrada.nextInt();
        
        if (opcion==1||opcion==2||opcion==3){
            switch(opcion){
                case 1:
                    battle();
                    break;
                case 2:
                    break;
                    
                default:
                    System.out.println("Que tengas buen día :)");
            }
            
        }else{
            System.out.println("¡¡OPCION INVALIDA!!");
        }
        }while (opcion<3||opcion>3);
    }
    
    public static void battle(){
        jugad();
        
    }
    
    @SuppressWarnings("empty-statement")
    public static void jugad(){
        Scanner entrada2 = new Scanner(System.in);
       Scanner entrada3 = new Scanner(System.in);        
        int poks=0;
        int poks2=0;
        String name1="";
        String name2="";
        int vida1=0;
        int vida2=0;
        int ataque1=0;
        int ataque2=0;
        int luck1=0;
        int luck2=0;
        ArrayList <String> lista1= new ArrayList();
        ArrayList <String> lista2= new ArrayList();
        ArrayList <Integer> ataq1= new ArrayList();
        ArrayList <Integer> ataq2= new ArrayList();
        ArrayList <Integer> vid1= new ArrayList();
        ArrayList <Integer> vid2= new ArrayList();



                
               

        System.out.println("-----------------------------------------------");
        System.out.println("                   JUGADOR 1                   ");
        System.out.println("-----------------------------------------------");
    
        do{
         System.out.print("Cuantos pokemon desea agregar (no mayor a 3): ");
            poks = entrada2.nextInt();
            
        if(poks>3||poks<1){
            System.out.println(" ");
            System.out.println("               DATO INVALIDO               ");
        System.out.println("     Ingrese un valor dentro del rango(1-3)     ");
            System.out.println(" ");

        }else{
             for (int i = 0; i < poks; i++) {
           
            System.out.println("-----------------------------------------------");
            System.out.print("Ingrese nombre de Pokemon: ");
            name1 = entrada3.nextLine();
            System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
            vida1 = entrada2.nextInt();
            if(vida1>300){
                System.out.println("Ingrese dato dentro del rangon 1-300\n");
                System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
                vida1 = entrada2.nextInt();

            }
    
            System.out.print("Ingrese puntos de ataque: ");
            ataque1 = entrada2.nextInt();
            if (ataque1 <= 0) {
                System.out.println("Ingrese un numero mayor a 0 ");
                System.out.println(" ");
                System.out.print("Ingrese puntos de ataque: ");
                 ataque1 = entrada2.nextInt();
                
             
            }
            System.out.println("Se ha registrado correctamente :) ");
                 System.out.println(" ");
              
            lista1.add(name1);
            ataq1.add(ataque1);
            vid1.add(vida1);
             }
            

            System.out.print("presione enter para definir su suerte");
            entrada3.nextLine();
            luck1 = new Random().nextInt((5 - 1) + 1) + 1;
            }
        }while(poks>3||poks<1);
            
            System.out.println("-----------------------------------------------");
            System.out.println("                   JUGADOR 2                   ");
            System.out.println("-----------------------------------------------");
            
            do{
         System.out.print("Cuantos pokemon desea agregar (no mayor a 3): ");
            poks2 = entrada2.nextInt();
            
        if(poks2>3||poks2<1){
            System.out.println(" ");
            System.out.println("               DATO INVALIDO               ");
        System.out.println("     Ingrese un valor dentro del rango(1-3)     ");
            System.out.println(" ");

        }else{
             for (int i = 0; i < poks; i++) {
           
            System.out.println("-----------------------------------------------");
            System.out.print("Ingrese nombre de Pokemon: ");
            name2 = entrada3.nextLine();
            System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
            vida2 = entrada2.nextInt();
            if(vida2>300){
                System.out.println("Ingrese dato dentro del rangon 1-300\n");
                System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
                vida2 = entrada2.nextInt();

            }
    
            System.out.print("Ingrese puntos de ataque: ");
            ataque2 = entrada2.nextInt();
            if (ataque2 <= 0) {
                System.out.println("Ingrese un numero mayor a 0 ");
                System.out.println(" ");
                System.out.print("Ingrese puntos de ataque: ");
                 ataque2 = entrada2.nextInt();
  
            }
            System.out.println("Se ha registrado correctamente :) ");
                 System.out.println(" ");
            lista2.add(name2);
            ataq2.add(ataque2);
            vid2.add(vida2);
            }
             
             System.out.print("presione enter para definir su suerte");
            entrada3.nextLine();
            luck2 = new Random().nextInt((5 - 1) + 1) + 1;
             
        }
            

            }while(poks2>3||poks2<1);
            
        for (String pokemons1 : lista1) {
                System.out.println(pokemons1+" vida: " +" Ataque: ");

            }
            
        for (String pokemons2 : lista2) {
                    System.out.println(pokemons2+"   vida: "+"   Ataque: ");
                    
                }
          

        
       
        System.out.println("  AMBOS JUGADORES REGISTRADOS CORRECTAMENTE  ");
        
        System.out.println("           QUE COMIENCE EL JUEGO...           ");
        
                Pokemons batt = new Pokemons(name1,vida1,ataque1,name2,vida2,ataque2);

        if (luck1>luck2){
            System.out.println("                  Ronda                   ");
            System.out.println(lista1.get(0)+" Ataca primero   Tiene: "+vid1.get(0));
            System.out.println(lista2.get(0)+" Ataca segundo  Tiene: "+vid2.get(0));
            System.out.println("**Puntos restantes**");
            System.out.println(lista1.get(0)+"Tiene :"+batt.attack1(vida1,ataque2));
            
        }else{
            System.out.println("                  Ronda                   ");
            System.out.println(lista2.get(0)+" Ataca primero  Tiene: "+vid2.get(0)); 
            System.out.println(lista1.get(0)+" Ataca segundo  Tiene: "+vid1.get(0));
        }
        }
}
        

        
     
    /*    for (int i = 0; i < poks; i++) {
           
            System.out.println("-----------------------------------------------");
            System.out.print("Ingrese nombre de Pokemon: ");
            name1 = entrada3.nextLine();
            System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
            vida1 = entrada2.nextInt();
            if(vida1>300){
                System.out.println("Ingrese dato dentro del rangon 1-300\n");
                System.out.print("Ingrese puntos de vida(no mayor a 300) : ");
                vida1 = entrada2.nextInt();

            }
    
            System.out.print("Ingrese puntos de ataque: ");
            ataque1 = entrada2.nextInt();
            if (ataque1 <= 0) {
                System.out.println("Ingrese un numero mayor a 0 ");
                System.out.println(" ");
                System.out.print("Ingrese puntos de ataque: ");
                 ataque1 = entrada2.nextInt();
                
               
                
            System.out.println("Se ha registrado correctamente :) ");
            lista1.add(name1);
            }
         
            }
            
            System.out.println(lista1);
            
            System.out.println("-----------------------------------------------");
            System.out.println("                   JUGADOR 2                   ");
            System.out.println("-----------------------------------------------");
            System.out.println("Cuantos pokemon desea agregar (no mayor a 3): ");
            poks2 = entrada2.nextInt();
        
        if(poks2>3){
            System.out.println("Ingrese un valor dentro del rango(1-3)");
        }else{
            
        for (int i = 0; i < poks2; i++) {

            System.out.println("-----------------------------------------------");
            System.out.println("Ingrese nombre de Pokemon: ");
            name2 = entrada3.nextLine();
            System.out.println("Ingrese puntos de vida(no mayor a 300) : ");
            vida2 = entrada2.nextInt();
            if(vida2>300){
                System.out.println("Ingrese dato dentro del rangon 1-300\n");
                System.out.println("Ingrese puntos de vida(no mayor a 300) : ");
                vida2 = entrada2.nextInt();

            }
                System.out.println("Ingrese puntos de ataque: ");
                ataque2=entrada2.nextInt();
                
            System.out.println("Se ha registrado correctamente :) ");
            lista2.add(name2);
            }
         
            }
            
            System.out.println(lista2);*/


            
    
    

    

