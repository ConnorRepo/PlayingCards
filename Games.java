
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class Games {

   public static void main(String[] args) {
      Games start = new Games();
      start.useDeck();
   }

   private JFrame base = new JFrame();
   private JPanel background = new JPanel();
   private JPanel menuPanel = new JPanel();
   private JPanel gamePanel = new JPanel();
   private JPanel temp = new JPanel();
   private JLabel title = new JLabel("GAME MENU");
   private JButton cycleB = new JButton("Cycle Deck");

   private Deck deck = new Deck();

   public void useDeck() {
      background.setPreferredSize(new Dimension(1000, 800));
      background.setBackground(Color.gray);
      background.setLayout(null);

      base.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      base.getContentPane().add(background);
      base.setVisible(true);

      background.add(menuPanel);
      menuPanel.setBounds(10, 10, 200, 750);
      background.add(gamePanel);
      gamePanel.setBounds(220, 10, 750, 750);

      title.setFont(new Font("times", Font.PLAIN, 20));
      cycleB.addActionListener(new CycleListener());
      menuPanel.setLayout(new GridLayout(10, 1));
      menuPanel.add(title);
      menuPanel.add(cycleB);

      base.pack();
   }

   class CycleListener implements ActionListener {
      int i = 1;
      public void actionPerformed (ActionEvent event) {
         System.out.println("i = " + i);

         temp.add(deck.drawCard(i));
         temp.revalidate();
         temp.repaint();
         temp.setBounds(250,10,200,200);
         gamePanel.add(temp);
         gamePanel.revalidate();
         gamePanel.repaint();


         i++;
      }
   }
	/**
	* Returns value of base
	* @return
	*/
	public JFrame getBase() {
		return base;
	}

	/**
	* Returns value of background
	* @return
	*/
	public JPanel getBackground() {
		return background;
	}

	/**
	* Returns value of menuPanel
	* @return
	*/
	public JPanel getMenuPanel() {
		return menuPanel;
	}

	/**
	* Returns value of game
	* @return
	*/
	public JPanel getGamePanel() {
		return gamePanel;
	}

}
