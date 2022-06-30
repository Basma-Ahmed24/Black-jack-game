/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Basma
 */
public class Game {

    Player[]players=new Player[4];
    Card[]carddeck= new Card[52];
    int highscore;
    
     public void generate(){
        int x=0;
        for (int a=0; a<=3; a++)
        {
            for (int b=0; b<=12; b++)
             { if (b<=9){
                 carddeck[x]=new Card(a,b,b+1);
             }
                 else
              
                     carddeck[x] = new Card(a,b,10);
               x++;
             }
        }
    }

   public Card  cardrandomly(){
        Card newcard;
        Random rand=new Random();
        int randomchoice=rand.nextInt(52);
        while(true){
         if(carddeck[randomchoice]!=null){
           newcard = carddeck[randomchoice];
           carddeck[randomchoice]=null;
           break;
          }
        } 
        return newcard;
   }
  
public void setinfo(){
   Scanner input=new Scanner(System.in);
    String name;
   for(int i=0;i<4;i++){
       players[i]=new Player();
       System.out.print("Enter player"+(i+1)+":");
       name=input.next();
       players[i]=new Player(name);
   }
   for(int i=0;i<4;i++){
       players[i]=new Player();
       for(int j=0;j<2;j++)
       {
           Card cards=this.cardrandomly();
          players[i].addcard(cards);
       }
   }
}
public int updatemaxscore(){

   Player max=new Player();
   for(int i=0;i<3;i++){
       if(players[i].getScore()<=21)
   max=players[0];
    if (players[i].getScore()>=max.getScore()){
      max.setScore(players[i].getScore());
    }
    highscore=max.getScore();
     }
   return highscore;
  
    
}}



       