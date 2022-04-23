
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
  static Scanner sc = new Scanner(System.in);
    static Pila pila = new Pila();
    static String variable, palabra;
    public static void main(String[] args) {
        Main pilaExamen = new Main();
        
        pilaExamen.datos();
        pilaExamen.palabra();
        pilaExamen.verificar();
    }
    
    public void datos(){
        System.out.println("Ingresar dato");
        variable = sc.next();
        for(char c: variable.toCharArray()){
            pila.push(c);
        }
    }
    
 
    
    public void verificar(){
      if (variable.equals(palabra)){
          System.out.println("La cadena es palindromo");
      }else{
          System.out.println("La cadena no es palindromo");
      }
    }
       public void palabra(){
    palabra = "";
        while(!pila.estaVacia()){
            palabra+=pila.pop();
        }
        System.out.println(palabra);
    } // TODO code application logic here
    }
    

