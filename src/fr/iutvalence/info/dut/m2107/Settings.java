package fr.iutvalence.info.dut.m2107;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Settings extends JFrame implements ActionListener
{
    private JButton NewGame, Player2, Player3, Player4, Leave;
    public int NumberOfPlayer;
    public JPanel panoe = new JPanel ();
    public JLabel image = new JLabel();
    public JLabel Boutton = new JLabel();
    public static JFrame window;
    
    public Settings()
    {
        setSize(750, 500);
        setTitle("Paramètres");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        window = new JFrame("Paramètres");
		window.setLayout(new GridLayout(1,1));

        image.setIcon(new ImageIcon(("G:\\Git\\Risk-IUT\\Image\\logo Risk.jpg")));
        Player2 = new JButton("2");
        Player3 = new JButton("3");
        Player4 = new JButton("4");
        NewGame = new JButton("Commencez la partie");
        Leave = new JButton("Quitter");
        		
		NewGame.addActionListener(new TreatmentButtonNewGame());
        Leave.addActionListener(new TreatmentButtonLeave());
        Player2.addActionListener(new TreatmentButton2Player());
        Player3.addActionListener(new TreatmentButton3Player());
        Player4.addActionListener(new TreatmentButton4Player());

        NewGame.setBounds(100, 100, 100, 100);
        Leave.setBounds(100, 100, 100, 100);
        Player2.setBounds(100, 100, 100, 100);
        Player3.setBounds(100, 100, 100, 100);
        Player4.setBounds(100 ,100, 100, 100);
        panoe.setBounds(300, 100, 400, 350);
        window.setBounds(450, 350, 400, 350);
        
		JLabel Player = new JLabel("Combien de joueur ?", SwingConstants.CENTER);
		Player.setVerticalTextPosition(SwingConstants.CENTER);
		Player.setHorizontalTextPosition(SwingConstants.CENTER);
				
		panoe.add(image);
        panoe.add(Player);
        panoe.add(Player2);
        panoe.add(Player3);
        panoe.add(Player4);
        panoe.add(NewGame);
        panoe.add(Leave);

        window.add(panoe);
        window.setVisible(false);
    }
    
    public class TreatmentButtonNewGame implements ActionListener
    {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public void actionPerformed(ActionEvent e)
        {
        	 new RiskGame(NumberOfPlayer).play();
        }
    }
    
     public class TreatmentButtonLeave implements ActionListener
    {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public void actionPerformed(ActionEvent e)
        {
        	 window.dispose();
        }
    }
     
     public class TreatmentButton2Player implements ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public void actionPerformed(ActionEvent e)
        {
        	NumberOfPlayer = 2;
        }
     }
     
     public class TreatmentButton3Player implements ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public void actionPerformed(ActionEvent e)
        {
        	NumberOfPlayer = 3;
        }
     }
     
     public class TreatmentButton4Player implements ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public void actionPerformed(ActionEvent e)
        {
        	NumberOfPlayer = 4;
        }
     }
     
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	}
}