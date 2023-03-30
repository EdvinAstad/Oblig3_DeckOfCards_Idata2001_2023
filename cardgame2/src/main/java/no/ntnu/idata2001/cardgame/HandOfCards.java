package no.ntnu.idata2001.cardgame;

import java.util.ArrayList;

public class HandOfCards {
  private ArrayList<PlayingCard> hand;

  public HandOfCards() {
    hand = new ArrayList<>();
  }

  public HandOfCards(ArrayList<PlayingCard> hand) {
    this.hand = hand;
  }

  public ArrayList<PlayingCard> getHand() {
    return hand;
  }

  public boolean checkForFlush(int amountNeededForFlush) {
    if(hand.stream().filter(c -> c.getSuit()=='S').count() >= amountNeededForFlush||
            hand.stream().filter(c -> c.getSuit()=='H').count() >= amountNeededForFlush||
            hand.stream().filter(c -> c.getSuit()=='D').count() >= amountNeededForFlush||
            hand.stream().filter(c -> c.getSuit()=='C').count() >= amountNeededForFlush){
      return true;
    }
    return false;
  }

}
