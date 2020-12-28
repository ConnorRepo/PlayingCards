
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

   static JFrame base = new JFrame();
   static JPanel background = new JPanel();

   public static void main(String[] args) {   
      background.setPreferredSize(new Dimension(1000, 800));
      background.setBackground(Color.gray);

      base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      base.getContentPane().add(background);
      base.setVisible(true);

      CycleDeck test = new CycleDeck();
      test.playGame(base, background);
   }
}
