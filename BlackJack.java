/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;
import java.util.Scanner;
/**
 *
 * @author Basma
 */
public class BlackJack {
   static Game game=new Game ();
  public  static void  main(String[] args){
      GUI gui = new GUI();
      game.generate();
      game.setinfo();
      gui.runGUI(game.carddeck , game.players[0].getArraycard() ,game.players[1].getArraycard(),
      game.players[2].getArraycard() , game.players[3].getArraycard() );   
      for(int i=0 ; i<3 ; i++)
      {
         Scanner input=new Scanner(System.in);
         int x=1;
         while(x==1){
             System.out.println("please player"+(i+1)+" press 1 if you want to Hit or 2 if you want to Stand");
             x=input.nextInt();
             if(x==2)
                 break;
             Card c=game.cardrandomly();
             game.players[i].addcard(c);
             gui.updatePlayerHand(c, i);
             if(game.players[i].getScore() > 21)
             {
               System.out.println( "player"+(i+1)+" "+ "is a busted ");
               break;
             }
             else if(game.players[i].getScore() == 21)
                 break;
         game.updatemaxscore();
         }
         if(!game.players[i].isLost())
              System.out.println("player"+(i+1)+" "+"has score:"+ game.players[i].getScore());
         
      } 
      game.updatemaxscore();
//Dealer.....................................
boolean dealer=false;
      if(game.updatemaxscore()<game.players[3].getScore()&&game.players[3].getScore()<=21)
          dealer=true;
      else
      { while(game.updatemaxscore()>=game.players[3].getScore() && game.players[3].getScore()<21)
      {
          Card c=game.cardrandomly();
           game.players[3].addcard(c);
           gui.updateDealerHand(c,game.carddeck);
           if(game.players[3].getScore() >= 21)
               break;
      }
      }
      game.updatemaxscore();
      System.out.println(game.players[0].getScore());
      System.out.println(game.players[1].getScore());
      System.out.println(game.players[2].getScore());
      System.out.println(game.players[3].getScore());
     
       //who is the winner .........................
       int count=0;
       for (int i = 0; i < 4; i++) {

//            
             if (game.players[i].getScore() == 21) {
             count++;
             continue;}
        else if (game.players[i].getScore() > 21){
            game.players[i].setLost(true);
               continue;
        }
            else if( (game.players[i].getScore()==game.highscore&&
                game.players[i].getScore()<game.players[3].getScore()&&game.players[3].getScore()>21)||
                (game.players[i].getScore()==game.players[3].getScore()&&game.players[3].getScore()>game.highscore&&game.players[3].getScore()<21))
            { count++;}
            else{
            game.players[i].setLost(true);}
        if(count>1){
                  System.out.println(" Game is push");
                  break;
              }}
       for(int i=0;i<4;i++){
              if(count==1&&!game.players[i].isLost()){
                 System.out.println( "the winner is player:"+(i+1) ); 
             break;}
             else if(count==1&&game.players[i].isBlack()){
                 System.out.println( "the winner is player:"+ (i+1));
         break;}}}}
      
    
