package fr.iutvalence.info.dut.m2107;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Parametres extends JFrame implements ActionListener
{
    private JButton NewGame, NumberPlayer, Player1, Player2, Player3, Player4, Leave;
    JPanel panoe = new JPanel ();
    JLabel image = new JLabel();
    JLabel Boutton = new JLabel();
    static JFrame window;
    
    public Parametres()
    {
        setSize(750, 500);
        setTitle("Paramètres");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        window = new JFrame("Paramètres");
		window.setLayout(new GridLayout(1,1));

        image.setIcon(new ImageIcon(("G:\\Git\\Risk-IUT\\Image\\logo Risk.jpg")));
        NumberPlayer = new JButton("Nombre de joueurs ?");
        Player1 = new JButton("Joueur 1: Nom ? Faction ?");
        Player2 = new JButton("Joueur 2: Nom ? Faction ?");
        Player3 = new JButton("Joueur 3: Nom ? Faction ?");
        Player4 = new JButton("Joueur 4: Nom ? Faction ?");
        NewGame = new JButton("Commencez la partie");
        Leave = new JButton("Quitter");
        
       
		NewGame.addActionListener(new TraitementBut1());
        Leave.addActionListener(new TraitementBut2());
        NumberPlayer.addActionListener(new TraitementBut3());
        Player1.addActionListener(new TraitementBut4());
        Player2.addActionListener(new TraitementBut4());
        Player3.addActionListener(new TraitementBut4());
        Player4.addActionListener(new TraitementBut4());

        NewGame.setBounds(100, 100, 100, 100);
        Leave.setBounds(100, 100, 100, 100);
        NumberPlayer.setBounds(100, 100, 100, 100);
        Player1.setBounds(100, 100, 100, 100);
        Player2.setBounds(100, 100, 100, 100);
        Player3.setBounds(100, 100, 100, 100);
        Player4.setBounds(100 ,100, 100, 100);
        panoe.setBounds(300, 100, 800, 500);
        window.setBounds(450, 350, 500, 300);

        panoe.add(NumberPlayer);
        panoe.add(Player1);
        panoe.add(Player2);
        panoe.add(Player3);
        panoe.add(Player4);
        panoe.add(NewGame);
        panoe.add(Leave);

        window.add(panoe);
        window.setVisible(false);
    }
    
    public  class   TraitementBut1 implements   ActionListener
    {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 IHM.window.setVisible(true);
        	 window.dispose();
        	 IHM.window.setResizable(false);
        }
    }
    
     public  class   TraitementBut2 implements   ActionListener
    {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	 window.dispose();
        }
    }

     public  class   TraitementBut3 implements   ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	System.out.println("Number_Of_Player");
        }
     }
     
     public  class   TraitementBut4 implements   ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	System.out.println("Players");
        }
     }
     
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	}
}
