package fr.iutvalence.info.dut.m2107;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class IHM extends JFrame implements ActionListener
{
    JPanel panneau = new JPanel ();
    JLabel salver = new JLabel();
    JLabel affichage = new JLabel();
    private JButton strengthening, attack, moveTroops, nextplayer, leave;
    static JFrame fenetre;
    
    public IHM()
    {
        setSize(700, 500);
        setTitle("RiskGame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        fenetre = new JFrame("RiskGame");
		fenetre.setLayout(new GridLayout(1,1));
		
		salver.setIcon(new ImageIcon(("G:\\Git\\Risk-IUT\\Image\\planisphere.jpg")));
        strengthening = new JButton("Renforcement");
        attack = new JButton("Attaque");
        moveTroops = new JButton("Dépacement");
        nextplayer = new JButton("Fin de Tour");
        leave = new JButton("Quitter");

        strengthening.addActionListener(new TraitementBut1());  
        attack.addActionListener(new TraitementBut2());   
        moveTroops.addActionListener(new TraitementBut3());
        nextplayer.addActionListener(new TraitementBut4());
        leave.addActionListener(new TraitementBut6());

        strengthening.setBounds(100, 100, 100, 100);
        attack.setBounds(100, 100, 100, 100);
        moveTroops.setBounds(100, 100, 100, 100);
        nextplayer.setBounds(100, 100, 100, 100);
        leave.setBounds(100, 100, 100, 100);
        panneau.setBounds(300, 100, 800, 500);
        fenetre.setBounds(0, 0, 1280, 1024);

        panneau.add(salver);
        panneau.add(strengthening);
        panneau.add(attack);
        panneau.add(moveTroops);
        panneau.add(nextplayer);
        panneau.add(leave);
        
        fenetre.add(panneau); 
        
        fenetre.setVisible(false);       
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
      
      
      public  class   TraitementBut6 implements   ActionListener
      {
           /**
           * mandatory because test implements the ActionListener interface
           */
          public  void    actionPerformed(ActionEvent e)
          {
          	 fenetre.dispose();    
          }
      }

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
}
 