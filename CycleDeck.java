
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

/**
 * Diagnostic class to test the GUI setup and MyCardDrawer
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class CycleDeck {

   private JPanel cards = new JPanel();

   private MyCardDrawer drawCard = new MyCardDrawer();

   public void next() {
      cards.setLayout(new BorderLayout());

      for (int i = 1; i < 53; i++) {
         cards.add(drawCard.paintCard(i));
         cards.repaint();
         cards.setBounds(250, 10, 200, 300);
         PlayingCards.test.getBackground().remove(cards);
         PlayingCards.test.getBackground().repaint();
         PlayingCards.test.getBackground().add(cards);

         PlayingCards.test.getBase().pack();

         try {
            TimeUnit.MILLISECONDS.sleep(500);
         } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
         }
      }
   }
}
