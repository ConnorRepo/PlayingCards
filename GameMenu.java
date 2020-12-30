
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class GameMenu {

   private JPanel menu = new JPanel();
   private JLabel title = new JLabel("GAME MENU");
   private JButton cycleB = new JButton("Cycle Deck");

   private CycleDeck cycle = new CycleDeck();

   public JPanel showMenu() {
      title.setFont(new Font("times", Font.PLAIN, 20));
      cycleB.addActionListener(new CycleListener());
      menu.setLayout(new GridLayout(10, 1));
      menu.add(title);
      menu.add(cycleB);

      menu.setBounds(10, 10, 200, 100);
      return menu;
   }

   class CycleListener implements ActionListener {
      public void actionPerformed (ActionEvent event) {
         cycle.next();

      }
   }
}
