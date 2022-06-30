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
public class Player {

    Player() {
        
    }

    Player(String name) {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    int index= 0;
    private boolean black =false;
    private boolean lost=false;

    public boolean isBlack() {
        return black;
    }

    public boolean isLost() {
        return lost;
    }
    private String name;
    private int score=0;
 private  Card[]arraycard=new Card[11];
 
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }

    public void setLost(boolean lost) {
        this.lost = lost;
    }

    public Card[] getArraycard() {
        return arraycard;
    }

   public void addcard(Card cards){
       arraycard[index]=cards;
       this.score+=cards.getValue();
      index++;
   }

    /*public void setCard(Card card) {
        
        this.arraycard[index] = card;
        index++;
    }
*/


    public void setScore(int score) {
        this.score = score;
    }
 
}

