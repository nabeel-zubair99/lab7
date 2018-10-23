/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author tuf39838
 */
public class JavaApplication7 {
    
private void createBoard(){
   int[][] multi = new int[3][3];
}
public void currentPlayer(){
 char [] player = new char [] {'X','O','X','O','X','O','X','O','X','O'};
    for (int i=0; i<player.length; i++){
        System.out.println(i);
    }
}
public void changePlayer(){
    String [] player = new String [] {"player1", "player2","player1","player2","player1","player2","player1","player2"};
    for (int i=0; i<player.length;i++){
        System.out.println(i);
    }
}
public void makeMove(){
    System.out.println("Please make a move");
}
public void SpaceInUse(){
    int[][] multi = new int[3][3];
    for (int i=0; i<multi.length;i++){
        for (int j=0; j<multi[i].length;j++){
            System.out.println("Value are used are"+i+"]["+j+"] is "+multi[i][j]);
             
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
