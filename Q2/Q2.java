/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edt;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User543
 */
public class Q2 {
    
    public static int getPos = 1;
    public static int countA = 0;
    public static int countB = 0;
    public static int countC = 0;
    public static int countD = 0;
    public static int countE = 0;
    
    
  public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList<String>();
      list.add("A");
      list.add("B");
      list.add("C");
      list.add("D");
      list.add("E");
      
      Scanner kbd = new Scanner(System.in);
      while(true)
      {
         System.out.println("Enter command or type Exit to quit");
         String input = kbd.nextLine();
         simulateArm(input);
      
      if(input.equalsIgnoreCase("exit"))
      {
          break;
      }
        
      }
}
  
  public static void simulateArm(String commandInput){
        if(commandInput.equalsIgnoreCase("fd")){
            move(); dropLoad();
        }
        if(commandInput.equalsIgnoreCase("ffd")){
            move(); move();
            dropLoad();
        }
        if(commandInput.equalsIgnoreCase("r")){
            defaultPos();
        }
        if(commandInput.equalsIgnoreCase("rffd")){
            defaultPos();
            move(); move();
            dropLoad();
        }
  }
  
  public static void move(){
         int pos = getPos;
         if(pos != 4)
             getPos++;
      }
  
  public static void defaultPos(){
         getPos = 0;
      }
  
  public static void dropLoad(){
        int pos = getPos;
        if(pos == 0 && ((countA >= 0) && (countA <10)))
         {
             countA++;
             getPos++;
             System.out.println("Drop Succesfull");
         }
         if(pos == 1 && ((countB >= 0) && (countB <10)))
         {
             countB++;
             getPos++;
             System.out.println("Drop Succesfull");
         }
         if(pos == 2 && ((countC >= 0) && (countC <10)))
         {
             countC++;
             getPos++;
             System.out.println("Drop Succesfull");
         }
         if(pos == 3 && ((countD >= 0) && (countD <10)))
         {
             countD++;
             getPos++;
             System.out.println("Drop Succesfull");
         }
         if(pos == 4 && ((countE >= 0) && (countE <10)))
         {
             countE++;
             System.out.println("Drop Succesfull");
         }

  }
  }
  
 