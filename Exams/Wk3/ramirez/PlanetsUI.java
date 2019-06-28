import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.util.*;
import java.text.*;

/*
Cpmpile. 10
Run. 10
Job: 7

There is an error when taking out a planet from the list

*/
public class PlanetsUI extends JFrame implements ActionListener, ListSelectionListener
{
	private Universe universo = new Universe();
	private JPanel mainPanel, planetListsPanel, transferPanel, startPanel, resultsPanel;
	private JButton bSelect, bDeselect, bReset, bStart;
	private JTextArea taTotalPlanets, taSelectedPlanets, taResults;
	private JList planetList, selectedList;
	int addPlanet, removePlanet;
	Planet[] planets;
	Planet[] planeta;

	private Vector planetsVector, passedPlanetsVector;

  	public PlanetsUI()
  	{
  		super("Planet Miner Simulator");

  		planetsVector = new Vector();
  		passedPlanetsVector = new Vector();

  		planeta = new Planet[20];

  		mainPanel = new JPanel();
  		mainPanel.setLayout(new GridLayout(4,1));

  		planetListsPanel = new JPanel();
		planetListsPanel.setLayout(new GridLayout(1,2));

		transferPanel = new JPanel();
 		transferPanel.setLayout(new GridLayout(1,2));

 		startPanel = new JPanel();
 		startPanel.setLayout(new GridLayout());

 		resultsPanel = new JPanel();
 		resultsPanel.setLayout(new GridLayout(1,2));

 		bSelect = new JButton("-->");
 		bSelect.addActionListener(this);

 		bDeselect = new JButton("<--");
 		bDeselect.addActionListener(this);

 		bStart = new JButton("Start");
 		bStart.addActionListener(this);

 		bReset = new JButton("Exit");
 		bReset.addActionListener(this);

 		taTotalPlanets = new JTextArea("",150,150);
 		loadPlanets();

 		planetList = new JList(planetsVector);

 		planetList.addListSelectionListener(this);

 		taSelectedPlanets = new JTextArea("",150,150);
 		taResults = new JTextArea("",150,150);

 		selectedList = new JList(passedPlanetsVector);
 		selectedList.addListSelectionListener(this);

 		planetListsPanel.add(new JScrollPane(planetList));
 		planetListsPanel.add(new JScrollPane(selectedList));

 		transferPanel.add(bSelect);
 		transferPanel.add(bDeselect);

 		startPanel.add(bStart);

 		resultsPanel.add(taResults);
 		resultsPanel.add(bReset);

 		mainPanel.add(planetListsPanel);
 		mainPanel.add(transferPanel);
 		mainPanel.add(startPanel);
 		mainPanel.add(resultsPanel);
 		add(mainPanel);

  		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
  		setVisible(true);
  	}

  	public void loadPlanets()
  	{
  		planets = universo.getPlanets();

  		for(int i = 0; i < 20; i++)
  		{
  			planetsVector.add(planets[i]);
  		}
  	}

  	public void passPlanets()
  	{
  		boolean encontrado=false;
  		for (int i = 0; i < passedPlanetsVector.size(); i++)
  		{
            if(planets[addPlanet] == passedPlanetsVector.get(i))
            	encontrado=true;
  		}
  		if(!encontrado)
  			passedPlanetsVector.add(planets[addPlanet]);
  	}
  	public void removePlanets()
  	{
  		boolean encontrado=false;
  		for (int i = 0; i < passedPlanetsVector.size(); i++)
  		{
            if(planets[addPlanet] == passedPlanetsVector.get(i))
            	encontrado=true;
  		}
  		if(encontrado)

  			passedPlanetsVector.remove(removePlanet);
  	}

  	public void valueChanged(ListSelectionEvent lse)
  	{

  		if(lse.getSource() == planetList)
  		{
  			addPlanet = planetList.getSelectedIndex();
  		}
  			if(lse.getSource() == selectedList)
  		{

  			removePlanet = selectedList.getSelectedIndex();
  			System.out.println(removePlanet);
  		}
  	}

  	public void actionPerformed(ActionEvent evt)
  	{
  		if(evt.getSource()==bSelect)
  		{
			passPlanets();

			selectedList = new JList(passedPlanetsVector);
			planetListsPanel.setVisible(false);
			planetListsPanel.removeAll();
			planetListsPanel.add(new JScrollPane(planetList));
			planetListsPanel.add(new JScrollPane(selectedList));
			planetListsPanel.setVisible(true);
  		}
  		if(evt.getSource()==bDeselect)
  		{
  			removePlanets();
  			selectedList = new JList(passedPlanetsVector);
			planetListsPanel.setVisible(false);
			planetListsPanel.removeAll();
			planetListsPanel.add(new JScrollPane(planetList));
			planetListsPanel.add(new JScrollPane(selectedList));
			planetListsPanel.setVisible(true);
  		}
  		if(evt.getSource()==bReset)
  		{
			System.exit(0);
  		}
  		if(evt.getSource()==bStart)
  		{
  			for(int i =0;i<passedPlanetsVector.size();i++)
  			{
  				planeta[i]=(Planet) passedPlanetsVector.get(i);
  			}
  			String str = universo.runDays(planeta);
  			taResults.setText(str);

  			resultsPanel.setVisible(false);
			resultsPanel.removeAll();
			resultsPanel.add(taResults);
			resultsPanel.add(bReset);
			resultsPanel.setVisible(true);
  		}
  	}

 	public static void main(String args[])
  	{
   		new PlanetsUI();
 	}
}
