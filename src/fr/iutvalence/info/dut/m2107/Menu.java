package fr.iutvalence.info.dut.m2107;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener
{
    private JButton NewGame;
	private JButton Leave;
    JPanel panoe = new JPanel ();
    JLabel image = new JLabel();
    JLabel Boutton = new JLabel();
    JFrame window;
    
    public Menu()
    {
        setSize(750, 500);
        setTitle("RiskGame");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        window = new JFrame("RiskGame");
		window.setLayout(new GridLayout(1,1));

        image.setIcon(new ImageIcon(("G:\\Git\\Risk-IUT\\Image\\logo Risk.jpg")));
        NewGame = new JButton("Nouvelle Partie");
        Leave = new JButton("Quitter");
        
       
		NewGame.addActionListener(new TraitementBut1());
        Leave.addActionListener(new TraitementBut2());

        NewGame.setBounds(100, 100, 100, 100);
        Leave.setBounds(100, 100, 100, 100);
        panoe.setBounds(300, 100, 800, 500);
        window.setBounds(450, 350, 400, 300);

        panoe.add(image);
        panoe.add(NewGame);
        panoe.add(Leave);

        window.add(panoe);
        window.setVisible(true);
        validate(); 
    }
    
    public  class   TraitementBut1 implements   ActionListener
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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
	}
}