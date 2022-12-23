import javax.swing.*;
import java.lang.*;
import java.awt.*; // needed for grid layout
import java.awt.event.*;

public class GuessWho implements ActionListener
{
    JLabel Harris = new JLabel ("<html><font face=ComicSans size=5 color = white >Beep Boop my name is Harris the AI, Press Begin!</font>");
    JLabel label1 = new JLabel ();
    JLabel label3;
    JLabel label4;
    JLabel label2;
    JButton hari;
    JButton ethan;
    JButton paris;
    JButton marcel;
    JButton john;
    JButton mason;
    JButton moheez;
    JButton rolland;
    JButton paige;

    int startt = 0;
    int i = 0;
    int ge = 0;
    int hcc = 0;
    int tscc = 0;
    int ecc = 0;
    int person;

    JButton start = new JButton ("<html><font face=ComicSans size=3 color = Green >Start</font>");
    JButton button1 = new JButton ("<html><font face=ComicSans size=3 color = blue >Begin!</font>");
    JButton button3 = new JButton ("<html><font face=ComicSans size=3 color = red >Quit</font>");

    //Gender
    JButton button4 = new JButton ("<html><font face=ComicSans size=3 color = blue >M</font>");
    JButton button5 = new JButton ("<html><font face=ComicSans size=3 color = purple >W</font>");
    //Colours Menu
    JButton hc = new JButton ("<html><font face=ComicSans size=3 color = brown >HC</font>");
    JButton tsc = new JButton ("<html><font face=ComicSans size=3 color = green >TSC</font>");
    JButton ec = new JButton ("<html><font face=ComicSans size=3 color = green >EC</font>");
    JButton g = new JButton ("<html><font face=ComicSans size=3 color = Blue >G</font>");
    // ec = eye colour, hc = hair colour, tsc = tshirt colour, g = gender
    //colours
    JButton hcbr = new JButton ("<html><font face=ComicSans size=3 color = brown >Br</font>");
    JButton hcbl = new JButton ("<html><font face=ComicSans size=3 color = Black >B</font>");
    JButton hcblo = new JButton ("<html><font face=ComicSans size=3 color = Yellow >B</font>");
    JButton hcg = new JButton ("<html><font face=ComicSans size=3 color = orange >ging</font>");



    JButton tscbr = new JButton ("<html><font face=ComicSans size=3 color = brown >Br</font>");
    JButton tscgr = new JButton ("<html><font face=ComicSans size=3 color = grey >Gr</font>");
    JButton tscpi = new JButton ("<html><font face=ComicSans size=3 color = pink >Pi</font>");
    JButton tscp = new JButton ("<html><font face=ComicSans size=3 color = purple >P</font>");
    JButton tscw = new JButton ("<html><font face=ComicSans size=3 color = white >W</font>");
    JButton tscbl = new JButton ("<html><font face=ComicSans size=3 color = black >B</font>");

    JButton ecbl = new JButton ("<html><font face=ComicSans size=3 color = black >Bl</font>");
    JButton ecbr = new JButton ("<html><font face=ComicSans size=3 color = brown >Br</font>");
    JButton ecg = new JButton ("<html><font face=ComicSans size=3 color = green >G</font>");

    public GuessWho ()
    { // this constructs the GUI object
	JFrame frame = new JFrame ("GuessWho? by Hari and Paris");
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	JPanel panel = new JPanel ();
	panel.setLayout (null);

	//Harris
	Harris.setBounds (30, 205, 500, 80);
	Harris.setVisible (false);
	panel.add (Harris);

	//start
	start.setBounds (390, 442, 100, 40);
	panel.add (start);
	start.setOpaque (true);
	start.addActionListener (this);

	button1.setBounds (200, 330, 100, 40);
	panel.add (button1);
	button1.setOpaque (true);
	button1.addActionListener (this);

	button1.setVisible (false);
	button1.setBorderPainted (true);

	//Quit
	button3.setBounds (10, 442, 100, 40);
	panel.add (button3);
	button3.setVisible (true);
	button3.addActionListener (this);

	//Gender
	button4.setBounds (200, 175, 50, 40);
	panel.add (button4);
	button4.setVisible (false);
	button4.addActionListener (this);

	button5.setBounds (200, 225, 50, 40);
	panel.add (button5);
	button5.setVisible (false);
	button5.addActionListener (this);

	//HC Menu
	hc.setBounds (80, 125, 50, 40);
	panel.add (hc);
	hc.setVisible (false);
	hc.addActionListener (this);

	//TC Menu
	tsc.setBounds (20, 125, 50, 40);
	panel.add (tsc);
	tsc.setVisible (false);
	tsc.addActionListener (this);

	//EC Menu
	ec.setBounds (140, 125, 50, 40);
	panel.add (ec);
	ec.setVisible (false);
	ec.addActionListener (this);

	//Gender Menu
	g.setBounds (200, 125, 50, 40);
	panel.add (g);
	g.setVisible (false);
	g.addActionListener (this);

	//--------------------------------------
	hari = new JButton ("");

	hari.setBounds (405, 130, 70, 70);
	panel.add (hari);
	hari.setVisible (false);
	hari.addActionListener (this);

	//--------------------------------------

	paris = new JButton ("");

	paris.setBounds (335, 130, 70, 70);
	panel.add (paris);
	paris.setVisible (false);
	paris.addActionListener (this);

	//--------------------------------------

	marcel = new JButton ("");

	marcel.setBounds (335, 200, 70, 70);
	panel.add (marcel);
	marcel.setVisible (false);
	marcel.addActionListener (this);

	//--------------------------------------
	john = new JButton ("");

	john.setBounds (405, 200, 70, 70);
	panel.add (john);
	john.setVisible (false);
	john.addActionListener (this);

	//---------------------------------------
	ethan = new JButton ("");

	ethan.setBounds (335, 270, 70, 70);
	panel.add (ethan);
	ethan.setVisible (false);
	ethan.addActionListener (this);

	//--------------------------------------
	mason = new JButton ("");

	mason.setBounds (405, 270, 70, 70);
	panel.add (mason);
	mason.setVisible (false);
	mason.addActionListener (this);

	//--------------------------------------
	rolland = new JButton ("");

	rolland.setBounds (265, 200, 70, 70);
	panel.add (rolland);
	rolland.setVisible (false);
	rolland.addActionListener (this);

	//--------------------------------------
	paige = new JButton ("");

	paige.setBounds (265, 270, 70, 70);
	panel.add (paige);
	paige.setVisible (false);
	paige.addActionListener (this);

	//--------------------------------------
	//---------------------------------------- Hair Colours

	hcbr.setBounds (20, 175, 50, 40);
	panel.add (hcbr);
	hcbr.setVisible (false);
	hcbr.addActionListener (this);

	hcblo.setBounds (80, 175, 50, 40);
	panel.add (hcblo);
	hcblo.setVisible (false);
	hcblo.addActionListener (this);

	hcbl.setBounds (140, 175, 50, 40);
	panel.add (hcbl);
	hcbl.setVisible (false);
	hcbl.addActionListener (this);

	hcg.setBounds (200, 175, 50, 40);
	panel.add (hcg);
	hcg.setVisible (false);
	hcg.addActionListener (this);

	//---------------- Eye
	ecbr.setBounds (20, 175, 50, 40);
	panel.add (ecbr);
	ecbr.setVisible (false);
	ecbr.addActionListener (this);

	ecbl.setBounds (80, 175, 50, 40);
	panel.add (ecbl);
	ecbl.setVisible (false);
	ecbl.addActionListener (this);

	ecg.setBounds (140, 175, 50, 40);
	panel.add (ecg);
	ecg.setVisible (false);
	ecg.addActionListener (this);

	//------------------------------ Tshirt

	tscbr.setBounds (20, 175, 50, 40);
	panel.add (tscbr);
	tscbr.setVisible (false);
	tscbr.addActionListener (this);

	tscgr.setBounds (80, 175, 50, 40);
	panel.add (tscgr);
	tscgr.setVisible (false);
	tscgr.addActionListener (this);

	tscpi.setBounds (140, 175, 50, 40);
	panel.add (tscpi);
	tscpi.setVisible (false);
	tscpi.addActionListener (this);

	tscp.setBounds (20, 225, 50, 40);
	panel.add (tscp);
	tscp.setVisible (false);
	tscp.addActionListener (this);

	tscw.setBounds (80, 225, 50, 40);
	panel.add (tscw);
	tscw.setVisible (false);
	tscw.addActionListener (this);

	tscbl.setBounds (140, 225, 50, 40);
	panel.add (tscbl);
	tscbl.setVisible (false);
	tscbl.addActionListener (this);

	//------------------------------------------------
	label3 = new JLabel ("");
	label3.setBounds (95, 5, 500, 100);
	panel.add (label3);

	label3 = new JLabel ("");
	label3.setBounds (140, 45, 500, 100);
	panel.add (label3);

	Icon picture1 = new ImageIcon ("back.png");   // associates picture1 with image in class folder
	label1.setBounds (0, 0, 500, 500);
	label1.setIcon (picture1);
	label1.setOpaque (true);
	panel.add (label1);

	frame.getContentPane ().add (panel);
	frame.setSize (515, 525);
	frame.setVisible (true);
    }


    public void actionPerformed (ActionEvent event)
    {
	String eventName = event.getActionCommand ();

	if (event.getSource () == start && startt == 0)
	{
	    Harris.setVisible (true);
	    startt = 1;
	    button1.setVisible (true);
	    start.setVisible (true);
	    Icon pictureb = new ImageIcon ("back2.png");
	    label1.setIcon (pictureb);
	}

	if (event.getSource () == button1) //You
	{

	    person = (int) (Math.random () * 8) + 1;

	    Harris.setVisible (false);

	    button1.setVisible (false);
	    g.setVisible (true);
	    tsc.setVisible (true);
	    hc.setVisible (true);
	    ec.setVisible (true);

	    Icon pic1 = new ImageIcon ("marcel.jpeg");
	    marcel.setIcon (pic1);
	    marcel.setVisible (true);

	    Icon pic2 = new ImageIcon ("hari.jpeg");
	    hari.setIcon (pic2);
	    hari.setVisible (true);

	    Icon pic3 = new ImageIcon ("ethan.jpeg");
	    ethan.setIcon (pic3);
	    ethan.setVisible (true);

	    Icon pic4 = new ImageIcon ("paris.jpeg");
	    paris.setIcon (pic4);
	    paris.setVisible (true);

	    Icon pic5 = new ImageIcon ("paige.jpg");
	    paige.setIcon (pic5);
	    paige.setVisible (true);

	    Icon pic6 = new ImageIcon ("mason.jpg");
	    mason.setIcon (pic6);
	    mason.setVisible (true);

	    Icon pic7 = new ImageIcon ("rolland.jpeg");
	    rolland.setIcon (pic7);
	    rolland.setVisible (true);

	    Icon pic8 = new ImageIcon ("sammy.jpeg");
	    john.setIcon (pic8);
	    john.setVisible (true);

	    //Icons
	    Icon pic9 = new ImageIcon ("shirt.png");
	    tsc.setIcon (pic9);
	    Icon pic10 = new ImageIcon ("hair.png");
	    hc.setIcon (pic10);
	    Icon pic11 = new ImageIcon ("eye.png");
	    ec.setIcon (pic11);
	    Icon pic18 = new ImageIcon ("gem.jpg");
	    g.setIcon (pic18);
	    Icon pic12 = new ImageIcon ("w.png");
	    button4.setIcon (pic12);
	    Icon pic13 = new ImageIcon ("b.png");
	    button5.setIcon (pic13);
	    Icon pic14 = new ImageIcon ("blonde.png");
	    hcblo.setIcon (pic14);
	    Icon pic15 = new ImageIcon ("black.jpg");
	    hcbl.setIcon (pic15);
	    Icon pic16 = new ImageIcon ("brown.jpg");
	    hcbr.setIcon (pic16);
	    Icon pic17 = new ImageIcon ("ginger.jpg");
	    hcg.setIcon (pic17);
	    Icon pic19 = new ImageIcon ("green.jpg");
	    ecg.setIcon (pic19);
	    Icon pic20 = new ImageIcon ("blue.jpg");
	    ecbl.setIcon (pic20);
	    Icon pic21 = new ImageIcon ("brown.jpg");
	    ecbr.setIcon (pic21);
	    Icon pic22 = new ImageIcon ("brown.jpg");
	    tscbr.setIcon (pic22);
	    Icon pic23 = new ImageIcon ("white.jpg");
	    tscw.setIcon (pic23);
	    Icon pic24 = new ImageIcon ("pink.jpg");
	    tscpi.setIcon (pic24);
	    Icon pic25 = new ImageIcon ("purple.jpg");
	    tscp.setIcon (pic25);
	    Icon pic26 = new ImageIcon ("grey.jpg");
	    tscgr.setIcon (pic26);
	    Icon pic27 = new ImageIcon ("black.jpg");
	    tscbl.setIcon (pic27);

	    while (i == 0)
	    {
		if (person == 1)
		{
		    ge = 1;
		    ecc = 3;
		    hcc = 1;
		    tscc = 1;
		    i = 1;
		    // Harris.setText ("hari");
		    // Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}

		else if (person == 2)
		{
		    ge = 2;
		    ecc = 1;
		    hcc = 4;
		    tscc = 2;
		    i = 1;
		    //  Harris.setText ("paris");
		    //  Harris.setBounds (215, 315, 500, 80);
		    //  Harris.setVisible (true);
		}

		else if (person == 3)
		{
		    ge = 1;
		    ecc = 3;
		    hcc = 1;
		    tscc = 5;
		    i = 1;
		    //  Harris.setText ("marcel");
		    //  Harris.setBounds (215, 315, 500, 80);
		    //  Harris.setVisible (true);
		}

		else if (person == 4)
		{
		    ge = 1;
		    ecc = 2;
		    hcc = 2;
		    tscc = 6;
		    i = 1;
		    // Harris.setText ("ethan");
		    // Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}

		else if (person == 5)
		{
		    ge = 1;
		    ecc = 3;
		    hcc = 3;
		    tscc = 3;
		    i = 1;
		    // Harris.setText ("sammy");
		    // Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}

		else if (person == 6)
		{
		    ge = 1;
		    ecc = 2;
		    hcc = 2;
		    tscc = 1;
		    i = 1;
		    // Harris.setText ("rolland");
		    // Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}

		else if (person == 7)
		{
		    ge = 1;
		    ecc = 3;
		    hcc = 4;
		    tscc = 1;
		    i = 1;
		    // Harris.setText ("mason");
		    // Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}

		else if (person == 8)
		{
		    ge = 2;
		    ecc = 2;
		    hcc = 3;
		    tscc = 4;
		    i = 1;
		    // Harris.setText ("paige");
		    //  Harris.setBounds (215, 315, 500, 80);
		    // Harris.setVisible (true);
		}
	    }

	}
	//----------------------------------- random declares characteristics of person
	//--------------------------------------------- Gender ifs (You)
	if (event.getSource () == button4 && person >= 1 && ge == 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == button4 && person >= 1 && ge == 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == button5 && person >= 1 && ge == 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == button5 && person >= 1 && ge == 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	//--------------------------------------------- Hair Color ifs

	if (event.getSource () == hcbl && person >= 1 && hcc == 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == hcbl && person >= 1 && hcc != 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == hcblo && person >= 1 && hcc == 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == hcblo && person >= 1 && hcc != 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == hcbr && person >= 1 && hcc == 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == hcbr && person >= 1 && hcc != 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == hcg && person >= 1 && hcc == 4)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == hcg && person >= 1 && hcc != 4)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	//----------------------------------------- Eye Colour Ifs

	if (event.getSource () == ecg && person >= 1 && ecc == 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == ecg && person >= 1 && ecc != 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == ecbl && person >= 1 && ecc == 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == ecbl && person >= 1 && ecc != 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == ecbr && person >= 1 && ecc == 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == ecbr && person >= 1 && ecc != 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	//------------------------------------------------------- Tshirt Colour Ifs

	if (event.getSource () == tscbl && person >= 1 && tscc == 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscbl && person >= 1 && tscc != 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == tscw && person >= 1 && tscc == 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscw && person >= 1 && tscc != 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == tscbr && person >= 1 && tscc == 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscbr && person >= 1 && tscc != 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == tscpi && person >= 1 && tscc == 4)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscpi && person >= 1 && tscc != 4)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == tscp && person >= 1 && tscc == 5)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscp && person >= 1 && tscc != 5)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == tscgr && person >= 1 && tscc == 6)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >That is True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}
	if (event.getSource () == tscgr && person >= 1 && tscc != 6)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Nope! Not True!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	//-------------------------------- Charcter Ifs

	if (event.getSource () == marcel && person == 3)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);
	}
	else if (event.getSource () == marcel && person != 3)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == paris && person == 2)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);

	}
	else if (event.getSource () == paris && person != 2)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == hari && person == 1)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);

	}
	else if (event.getSource () == hari && person != 1)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == ethan && person == 4)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);
	}
	else if (event.getSource () == ethan && person != 4)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == john && person == 5)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);

	}
	else if (event.getSource () == john && person != 5)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == rolland && person == 6)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);

	}
	else if (event.getSource () == rolland && person != 6)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == mason && person == 7)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);
	}
	else if (event.getSource () == mason && person != 7)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	if (event.getSource () == paige && person == 8)
	{
	    paris.setVisible (false);
	    marcel.setVisible (false);
	    hari.setVisible (false);
	    john.setVisible (false);
	    mason.setVisible (false);
	    paige.setVisible (false);
	    ethan.setVisible (false);
	    rolland.setVisible (false);

	    g.setVisible (false);
	    hc.setVisible (false);
	    ec.setVisible (false);
	    tsc.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	    Harris.setVisible (false);
	    Icon pictureb = new ImageIcon ("back3.png");
	    label1.setIcon (pictureb);
	}
	else if (event.getSource () == paige && person != 8)
	{
	    Harris.setText ("<html><font face=ComicSans size=3 color = white >Try Again!</font>");
	    Harris.setBounds (215, 315, 500, 80);
	    Harris.setVisible (true);
	}

	// ----------------------

	if (event.getSource () == ec)
	{
	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    ecbr.setVisible (true);
	    ecg.setVisible (true);
	    ecbl.setVisible (true);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	}
	//------------------------------------------------
	if (event.getSource () == hc)
	{
	    hcbr.setVisible (true);
	    hcbl.setVisible (true);
	    hcblo.setVisible (true);
	    hcg.setVisible (true);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	}

	//------------------------------------------------
	if (event.getSource () == tsc)
	{
	    tscbr.setVisible (true);
	    tscpi.setVisible (true);
	    tscgr.setVisible (true);
	    tscw.setVisible (true);
	    tscbl.setVisible (true);
	    tscp.setVisible (true);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    button4.setVisible (false);
	    button5.setVisible (false);
	}

	if (event.getSource () == g)
	{
	    tscbr.setVisible (false);
	    tscpi.setVisible (false);
	    tscgr.setVisible (false);
	    tscw.setVisible (false);
	    tscbl.setVisible (false);
	    tscp.setVisible (false);

	    ecbr.setVisible (false);
	    ecg.setVisible (false);
	    ecbl.setVisible (false);

	    hcbr.setVisible (false);
	    hcbl.setVisible (false);
	    hcblo.setVisible (false);
	    hcg.setVisible (false);

	    button4.setVisible (true);
	    button5.setVisible (true);
	}

	if (event.getSource () == button3)
	{
	    System.exit (0);
	}
    }




    public static void main (String[] args)
    {

	// create  a GUI called g1 and run !
	GuessWho g1 = new GuessWho ();

    }
}

