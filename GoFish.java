
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class GoFish {
   private JFrame base = new JFrame();
   private JPanel background = new JPanel();
   private Card card = new Card();

   public void playGame() {
      background.setPreferredSize(new Dimension(800, 500));
      background.setBackground(Color.white);
      background.setLayout(new BorderLayout());

      base.setPreferredSize(new Dimension(850, 550));
      base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      base.getContentPane().add(background);
      base.setVisible(true);

      background.add(card.getNewCard(1), "Center");
      base.pack();
   }
}
