package fr.iutvalence.info.dut.m2107;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class IHM extends JFrame implements ActionListener
{
    JPanel Game = new JPanel ();
    JLabel salver = new JLabel();
    JLabel affichage = new JLabel();
    private JButton strengthening, attack, moveTroops, nextplayer, leave, settings;
    static JFrame window;
    
    public IHM()
    {
        setSize(700, 500);
        setTitle("RiskGame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        window = new JFrame("RiskGame");
		window.setLayout(new GridLayout(1,1));
		
		salver.setIcon(new ImageIcon(("G:\\Git\\Risk-IUT\\Image\\planisphereFinal.jpg")));
        strengthening = new JButton("Renforcement");
        attack = new JButton("Attaque");
        moveTroops = new JButton("Dépacement");
        nextplayer = new JButton("Fin de Tour");
        settings = new JButton("Paramètres");
        leave = new JButton("Quitter");

        strengthening.addActionListener(new TraitementBut1());  
        attack.addActionListener(new TraitementBut2());   
        moveTroops.addActionListener(new TraitementBut3());
        nextplayer.addActionListener(new TraitementBut4());
        leave.addActionListener(new TraitementBut5());
        settings.addActionListener(new TraitementBut6());

        strengthening.setBounds(100, 100, 100, 100);
        attack.setBounds(100, 100, 100, 100);
        moveTroops.setBounds(100, 100, 100, 100);
        nextplayer.setBounds(100, 100, 100, 100);
        leave.setBounds(100, 100, 100, 100);
        Game.setBounds(0, 0, 800, 500);
        affichage.setBounds(500, 500, 100, 100);
        window.setBounds(0, 0, 1280, 1024);

        Game.add(salver);
        Game.add(strengthening);
        Game.add(attack);
        Game.add(moveTroops);
        Game.add(nextplayer);
        
        affichage.add(leave);
        affichage.add(settings);
        
        window.add(affichage);
        window.add(Game);
        
        window.setVisible(false);       
    }

    public  class   TraitementBut1 implements   ActionListener
    {
        /**
        * mandatory because test implements the ActionListener interface
        */
       public  void    actionPerformed(ActionEvent e)
       {
       	System.out.println("Renforcement");
       }
    }
    
     public  class   TraitementBut2 implements   ActionListener
     {
         /**
         * mandatory because test implements the ActionListener interface
         */
        public  void    actionPerformed(ActionEvent e)
        {
        	System.out.println("Attaque");
        }
     }
     
     public  class   TraitementBut3 implements   ActionListener
     {
          /**
          * mandatory because test implements the ActionListener interface
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Déplacement");
         }
     }
     
      public  class   TraitementBut4 implements   ActionListener
     {
          /**
          * mandatory because test implements the ActionListener interface
          */
         public  void    actionPerformed(ActionEvent e)
         {
        	 System.out.println("Joueur suivant");
         }
      }
      
      
      public  class   TraitementBut5 implements   ActionListener
      {
           /**
           * mandatory because test implements the ActionListener interface
           */
          public  void    actionPerformed(ActionEvent e)
          {
          	 window.dispose();    
          }
      }
      
      public  class   TraitementBut6 implements   ActionListener
      {
 	       /**
	         * mandatory because test implements the ActionListener interface
	         */
	        public  void    actionPerformed(ActionEvent e)
	        {
	        	 Parametres.window.setVisible(true);
	        	 window.dispose();
	        	 Parametres.window.setResizable(false);
	        }
	  }
    	    
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
}
 