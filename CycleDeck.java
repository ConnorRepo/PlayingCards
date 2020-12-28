
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

   public void playGame(JFrame base, JPanel background) {
      cards.setLayout(new BorderLayout());

      for (int i = 1; i < 53; i++) {
         cards.add(drawCard.paintCard(i));

         background.remove(cards);
         background.repaint();
         background.add(cards);

         base.pack();

         try {
            TimeUnit.MILLISECONDS.sleep(500);
         } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
         }
      }
   }
}
