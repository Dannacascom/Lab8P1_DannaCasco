/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p1_dannnacasco;

import java.util.Random;

/**
 *
 * @author Danna Casco
 */
public class Pokemons {

    public String name1;
    public int vida1;
    public int ataque1;
    public int luck1;
    public String name2;
    public int vida2;
    public int ataque2;
    public int luck2;
 

    public Pokemons(String name1, int vida1, int ataque1, String name2, int luck1, int vida2) {
        this.name1 = name1;
        this.vida1 = vida1;
        this.ataque1 = ataque1;
        this.luck1 = luck1;
        this.name2 = name2;
        this.vida2 = vida2;
        this.ataque2 = ataque2;
        this.luck2 = luck2;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setVida1(int vida1) {
        this.vida1 = vida1;
    }

    public void setAtaque1(int ataque1) {
        this.ataque1 = ataque1;
    }

    public void setLuck1(int luck1) {
        this.luck1 = luck1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setVida2(int vida2) {
        this.vida2 = vida2;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }
    
    public void setluck2(int luck2) {
        this.luck2 = luck2;
    }
    

   
    

    public String getName1() {
        return name1;
    }

    public int getVida1() {
        return vida1;
    }

    public int getAtaque1() {
        return ataque1;
    }

    public int getLuck1() {
        return luck1;
    }

    public String getName2() {
        return name2;
    }

    public int getVida2() {
        return vida2;
    }

    public int getAtaque2() {
        return ataque2;
    }
    
     public int getluck2() {
        return luck2;
    }

  
    
    public int suerte(int luck1){
      luck1 = new Random().nextInt((5 - 1) + 1) + 1;
      return luck1;
    }

    void attack1(int vida1, int ataque2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

