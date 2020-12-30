

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class Deck {
   private int[] deck = new int[52];
   private int[] oldDeck = new int[52];
   private MyCardDrawer drawer = new MyCardDrawer();
   private int rand = 0;

   //Unbox the Deck
   public int[] unbox() {
      for(int i = 1; i < deck.length; i++) {
         deck[i] = i;
         oldDeck[i] = i;
      }
      return deck;
   }
   //Draw a card
   public JPanel drawCard(int card) {
      return drawer.paintCard(card);
   }
   //Shuffle the deck
   public int[] shuffle(int[] currDeck) {
      //store the current deck state
      for(int i = 0; i < 52; i++) {
         oldDeck[i] = currDeck[i];
      }
      //randomly rearrange the values in the deck
      for(int i = 0; i < 52; i++) {
         do {
            rand = ((int) (Math.random() * 52));
         } while (oldDeck[rand] == 0);

         currDeck[i] = oldDeck[rand];
         oldDeck[rand] = 0;
               //Random number between 1 and 52 to choose card
      }
      return currDeck;
   }
}
