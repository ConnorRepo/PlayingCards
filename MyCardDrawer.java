import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Connor Smith
 * @since 12/23/20
 */

public class MyCardDrawer {
   private DrawAceClubs aceClubsG = new DrawAceClubs();
   private DrawAceDiamonds aceDiamondsG = new DrawAceDiamonds();
   private DrawAceHearts aceHeartsG = new DrawAceHearts();
   private DrawAceSpades aceSpadesG = new DrawAceSpades();
   private DrawTwoClubs twoClubsG = new DrawTwoClubs();
   private DrawTwoDiamonds twoDiamondsG = new DrawTwoDiamonds();
   private DrawTwoHearts twoHeartsG = new DrawTwoHearts();
   private DrawTwoSpades twoSpadesG = new DrawTwoSpades();
   private DrawThreeClubs threeClubsG = new DrawThreeClubs();
   private DrawThreeDiamonds threeDiamondsG = new DrawThreeDiamonds();
   private DrawThreeHearts threeHeartsG = new DrawThreeHearts();
   private DrawThreeSpades threeSpadesG = new DrawThreeSpades();
   private DrawFourClubs fourClubsG = new DrawFourClubs();
   private DrawFourDiamonds fourDiamondsG = new DrawFourDiamonds();
   private DrawFourHearts fourHeartsG = new DrawFourHearts();
   private DrawFourSpades fourSpadesG = new DrawFourSpades();
   private DrawFiveClubs fiveClubsG = new DrawFiveClubs();
   private DrawFiveDiamonds fiveDiamondsG = new DrawFiveDiamonds();
   private DrawFiveHearts fiveHeartsG = new DrawFiveHearts();
   private DrawFiveSpades fiveSpadesG = new DrawFiveSpades();
   private DrawSixClubs sixClubsG = new DrawSixClubs();
   private DrawSixDiamonds sixDiamondsG = new DrawSixDiamonds();
   private DrawSixHearts sixHeartsG = new DrawSixHearts();
   private DrawSixSpades sixSpadesG = new DrawSixSpades();
   private DrawSevenClubs sevenClubsG = new DrawSevenClubs();
   private DrawSevenDiamonds sevenDiamondsG = new DrawSevenDiamonds();
   private DrawSevenHearts sevenHeartsG = new DrawSevenHearts();
   private DrawSevenSpades sevenSpadesG = new DrawSevenSpades();
   private DrawEightClubs eightClubsG = new DrawEightClubs();
   private DrawEightDiamonds eightDiamondsG = new DrawEightDiamonds();
   private DrawEightHearts eightHeartsG = new DrawEightHearts();
   private DrawEightSpades eightSpadesG = new DrawEightSpades();
   private DrawNineClubs nineClubsG = new DrawNineClubs();
   private DrawNineDiamonds nineDiamondsG = new DrawNineDiamonds();
   private DrawNineHearts nineHeartsG = new DrawNineHearts();
   private DrawNineSpades nineSpadesG = new DrawNineSpades();
   private DrawTenClubs tenClubsG = new DrawTenClubs();
   private DrawTenDiamonds tenDiamondsG = new DrawTenDiamonds();
   private DrawTenHearts tenHeartsG = new DrawTenHearts();
   private DrawTenSpades tenSpadesG = new DrawTenSpades();
   private DrawJackClubs jackClubsG = new DrawJackClubs();
   private DrawJackDiamonds jackDiamondsG = new DrawJackDiamonds();
   private DrawJackHearts jackHeartsG = new DrawJackHearts();
   private DrawJackSpades jackSpadesG = new DrawJackSpades();
   private DrawQueenClubs queenClubsG = new DrawQueenClubs();
   private DrawQueenDiamonds queenDiamondsG = new DrawQueenDiamonds();
   private DrawQueenHearts queenHeartsG = new DrawQueenHearts();
   private DrawQueenSpades queenSpadesG = new DrawQueenSpades();
   private DrawKingClubs kingClubsG = new DrawKingClubs();
   private DrawKingDiamonds kingDiamondsG = new DrawKingDiamonds();
   private DrawKingHearts kingHeartsG = new DrawKingHearts();
   private DrawKingSpades kingSpadesG = new DrawKingSpades();

   private JPanel card = new JPanel();
   private JPanel graphic = new JPanel();

   public JPanel paintCard (int choice) {
      graphic.setPreferredSize(new Dimension(150,200));
      card.setPreferredSize(new Dimension(160, 210));
      card.setLayout(new BorderLayout());

      switch(choice) {
         case 1:  //Ace of Clubs
            graphic = aceClubsG;
            break;
         case 2:  //Ace of Diamonds
            graphic = aceDiamondsG;
            break;
         case 3:  //Ace of Hearts
            graphic = aceHeartsG;
            break;
         case 4:  //Ace of Spades
            graphic = aceSpadesG;
            break;
         case 5:  //Two of Clubs
            graphic = twoClubsG;
            break;
         case 6:  //Two of Diamonds
            graphic = twoDiamondsG;
            break;
         case 7: //Two of Hearts
            graphic = twoHeartsG;
            break;
         case 8:  //Two of Spades
            graphic = twoSpadesG;
            break;
         case 9:  //Three of Clubs
            graphic = threeClubsG;
            break;
         case 10:  //Three of Diamonds
            graphic = threeDiamondsG;
            break;
         case 11:  //Three of Hearts
            graphic = threeHeartsG;
            break;
         case 12:  //Three of Spades
            graphic = threeSpadesG;
            break;
         case 13:  //Four of Clubs
            graphic = fourClubsG;
            break;
         case 14:  //Four of Diamonds
            graphic = fourDiamondsG;
            break;
         case 15:  //Four of Hearts
            graphic = fourHeartsG;
            break;
         case 16:  //Four of Spades
            graphic = fourSpadesG;
            break;
         case 17:  //Five of Clubs
            graphic = fiveClubsG;
            break;
         case 18:  //Five of Diamonds
            graphic = fiveDiamondsG;
            break;
         case 19:  //Five of Hearts
            graphic = fiveHeartsG;
            break;
         case 20:  //Five of Spades
            graphic = fiveSpadesG;
            break;
         case 21:  //Six of Clubs
            graphic = sixClubsG;
            break;
         case 22:  //Six of Diamonds
            graphic = sixDiamondsG;
            break;
         case 23:  //Six of Hearts
            graphic = sixHeartsG;
            break;
         case 24:  //Six of Spades
            graphic = sixSpadesG;
            break;
         case 25:  //Seven of Clubs
            graphic = sevenClubsG;
            break;
         case 26:  //Seven of Diamonds
            graphic = sevenDiamondsG;
            break;
         case 27:  //Seven of Hearts
            graphic = sevenHeartsG;
            break;
         case 28:  //Seven of Spades
            graphic = sevenSpadesG;
            break;
         case 29:  //Eight of Clubs
            graphic = eightClubsG;
            break;
         case 30:  //Eight of Diamonds
            graphic = eightDiamondsG;
            break;
         case 31:  //Eight of Hearts
            graphic = eightHeartsG;
            break;
         case 32:  //Eight of Spades
            graphic = eightSpadesG;
            break;
         case 33:  //Nine of Clubs
            graphic = nineClubsG;
            break;
         case 34:  //Nine of Diamonds
            graphic = nineDiamondsG;
            break;
         case 35:  //Nine of Hearts
            graphic = nineHeartsG;
            break;
         case 36:  //Nine of Spades
            graphic = nineSpadesG;
            break;
         case 37:  //Ten of Clubs
            graphic = tenClubsG;
            break;
         case 38:  //Ten of Diamonds
            graphic = tenDiamondsG;
            break;
         case 39:  //Ten of Hearts
            graphic = tenHeartsG;
            break;
         case 40:  //Ten of Spades
            graphic = tenSpadesG;
            break;
         case 41:  //Jack of Clubs
            graphic = jackClubsG;
            break;
         case 42:  //Jack of Diamonds
            graphic = jackDiamondsG;
            break;
         case 43:  //jack of Hearts
            graphic = jackHeartsG;
            break;
         case 44:  //Jack of Spades
            graphic = jackSpadesG;
            break;
         case 45:  //Queen of Clubs
            graphic = queenClubsG;
            break;
         case 46:  //Queen of Diamonds
            graphic = queenDiamondsG;
            break;
         case 47:  //Queen of Hearts
            graphic = queenHeartsG;
            break;
         case 48:  //Queen of Spades
            graphic = queenSpadesG;
            break;
         case 49:  //King of Clubs
            graphic = kingClubsG;
            break;
         case 50:  //King of Diamonds
            graphic = kingDiamondsG;
            break;
         case 51:  //King of Hearts
            graphic = kingHeartsG;
            break;
         case 52:  //King of Spades
            graphic = kingSpadesG;
            break;
         default:
            System.out.println("MyCardDrawer error");
            break;
      }
      card.add(graphic, "Center");

      return card;
   }

   class DrawAceClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("AceClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawAceDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("AceDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawAceHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("AceHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawAceSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("AceSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTwoClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TwoClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTwoDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TwoDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTwoHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TwoHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTwoSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TwoSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawThreeClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("ThreeClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawThreeDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("ThreeDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawThreeHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("ThreeHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawThreeSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("ThreeSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFourClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FourClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFourDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FourDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFourHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FourHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFourSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FourSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFiveClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FiveClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFiveDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FiveDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFiveHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FiveHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawFiveSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("FiveSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSixClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SixClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSixDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SixDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSixHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SixHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSixSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SixSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSevenClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SevenClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSevenDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SevenDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSevenHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SevenHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawSevenSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("SevenSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawEightClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("EightClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawEightDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("EightDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawEightHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("EightHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawEightSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("EightSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawNineClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("NineClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawNineDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("NineDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawNineHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("NineHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawNineSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("NineSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTenClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TenClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTenDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TenDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTenHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TenHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawTenSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("TenSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawJackClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("JackClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawJackDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("JackDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawJackHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("JackHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawJackSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("JackSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawQueenClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("QueenClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawQueenDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("QueenDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawQueenHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("QueenHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawQueenSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("QueenSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawKingClubs extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("KingClubs.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawKingDiamonds extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("KingDiamonds.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawKingHearts extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("KingHearts.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
   class DrawKingSpades extends JPanel {
      public void paintComponent(Graphics g) {
         Image icon = new ImageIcon("KingSpades.jpg").getImage();
         g.drawImage(icon, 0, 0, this);
      }
   }
}
