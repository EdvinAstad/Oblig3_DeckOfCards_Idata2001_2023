package no.ntnu.idata2001.cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * represents a deck of playing cards.
 */
public class DeckOfCards {
  private List<PlayingCard> deckOfCards;

  private final char[] suits = {'S', 'H', 'D', 'C'};

  /** creates a new instance of DeckOfCards with standard cards. no jokers. */
  public DeckOfCards() {
    this.deckOfCards = new ArrayList<>();
    for(char c: suits) {
      for (int i = 1; i <= 13; i++) {
        deckOfCards.add(new PlayingCard(c, i));
      }
    }
  }

  /** returns deckOfCards */
  public List<PlayingCard> getDeckOfCards() {
    return deckOfCards;
  }

  /** shuffles the deck */
  public void shuffle() {
    Collections.shuffle(deckOfCards);
  }

  /**
   * deals a hand. cards are taken out of the deck when dealt.
   *
   * @param sizeOfHand number of cards which constitutes a hand
   * @return a hand of cards
   */
  public HandOfCards dealHand(int sizeOfHand) {
    ArrayList<PlayingCard> hand = new ArrayList();
    for (int i = 0; i < sizeOfHand; i++) {
      hand.add(deckOfCards.get(i));
    }

    return new HandOfCards(hand);
  }
}
