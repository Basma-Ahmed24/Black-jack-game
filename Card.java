/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author Basma
 */
public class Card {
    
   private int suit;
   private  int rank;
   private  int value;
   int [] suits={0,1,2,3};
 int[]ranks={0,1,2,3,4,5,6,7,8,9,10,11,12,13};
   
    public Card(int suit, int rank, int value) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
    }
public Card(Card c){
     this.suit = c.suit;
        this.rank = c.rank;
        this.value = c.value;
    
}
   

   

    public int getSuit() {
        return suit;
        
    }

    public int getRank() {
        return rank;
    }

    public int getValue() {
        
        return value;
    }

   

    
}
  
   

