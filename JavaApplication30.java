/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import javax.swing.JOptionPane;

/**
 *
 * @author lab211
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
      //Matheus H. - RA:20695841
      //Marcos P. - RA:21312400
      //Matheus G. - RA:21221011
      //RAFAEL O -  RA:21298419
      //LUCAS R  - RA:21196620

      int balas = 0;
         String jogador;
        jogador = JOptionPane.showInputDialog("Seu nome:");
        JOptionPane.showMessageDialog(null,"Preparado para o Quiz sobre os Vingadores," + jogador+"?"+"\n"
                                     + "\nVamos lá . . .\n"
                                     + "\nCada resposta certa vale 1 bala"
                                     + "\nVeja quantas balas você consegue ganhar.");
        String pr1, pr2, pr3, pr4, pr5, pr6, pr7, pr8, pr9, pr10;
        pr1 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Qual é o vingador por quem Viúva Negra é apaixonada?\n"              
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
        if ( ("C".equals(pr1))){
              JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"Você merece um abraço de consolação!");
            System.exit(0); 
        } 
        
         pr2 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Quem é o líder da equipe?\n"
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
                
        if ( ("B".equals(pr2))){
              JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
          JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
            System.exit(0); 
      
      }
    
         pr3 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Qual desses membros da equipe é um cientista?\n"
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
                
        if ( ("C".equals(pr3))){
               JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
          JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
            System.exit(0); 
            
      }
        
         pr4 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Qual cidade dos EUA é atacada por Loki?\n"
              + "A) Nova Jersey \n"
              + "B) Seatlle \n"
              + "C) Nova Iorque \n"
              + "D) Los Angeles \n");
                
        if ( ("C".equals(pr4))){
              JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
         JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
            System.exit(0); 
      }
        
        pr5 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Qual desses vingadores não utiliza uma arma\n"              
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
        if ( ("C".equals(pr5))){
            JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
          JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
            System.exit(0); 
        } 
        
         pr6 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Qual desses vingadores é um agente da SHIELD?\n"
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
                
        if ( ("D".equals(pr6))){
              JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
         JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
            System.exit(0); 
      
      }
    
         pr7 = JOptionPane.showInputDialog("Jogador: "   +jogador+  "\nBalas: "   +balas+"\n"
              + "Quem é o membro mais velho da equipe?\n"
              + "A) Homem de Ferro \n"
              + "B) Capitão América \n"
              + "C) Hulk \n"
              + "D) Gavião Arqueiro \n");
                
        if ( ("B".equals(pr7))){
             JOptionPane.showMessageDialog(null, "+1 BALA!" );
            balas = balas + 1;
             JOptionPane.showMessageDialog(null, "Você ganhou:"+ balas +"Balas");
        } else {
         JOptionPane.showMessageDialog(null,"PERDEU!");
         
        }
   }}
    

    

