package graph;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph_view extends Frame implements ActionListener,WindowListener{
	private Button button1 = new Button("BarChart");
	private Button button2 = new Button("LineChart");
	private Button button3 = new Button("Test");
	public Graph_view(int a)  {

		addWindowListener(this);
		setTitle("Graph");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(button1);
		add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		data.addValue(300, "USA", "2005");
		data.addValue(500, "USA", "2006");
		data.addValue(120, "USA", "2007");
		data.addValue(200, "China", "2005");
		data.addValue(400, "China", "2006");
		data.addValue(320, "China", "2007");
		System.out.print("done");
		   JFreeChart chart = 
				      ChartFactory.createLineChart("Import Volume",
				                                   "Year",
				                                   "Ton",
				                                   data,
				                                   PlotOrientation.HORIZONTAL,
				                                   true,
				                                   false,
				                                   false);

				    ChartPanel cpanel = new ChartPanel(chart);
				    
				    
					   JFreeChart cchart = 
							      ChartFactory.createBarChart("Import Volume",
							                                   "Year",
							                                   "Ton",
							                                   data,
							                                   PlotOrientation.HORIZONTAL,
							                                   true,
							                                   false,
							                                   false);

							    ChartPanel ccpanel = new ChartPanel(cchart);
if (a==1){	add(cpanel, BorderLayout.CENTER);}
if (a==2){	add(ccpanel, BorderLayout.CENTER);}
	    
	
       

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		System.exit(0);
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ		

		if(e.getSource()==button1){


			System.out.println("1");

					    Graph_view graph =   new Graph_view(1);
						graph.setBounds(5, 5, 800,600);
						graph.setVisible(true);
		}
			

		if(e.getSource()==button2){
			System.out.println("2");
	
			
			    Graph_view graph =   new Graph_view(2);
				graph.setBounds(5, 5, 800,600);
				graph.setVisible(true);
	
	}
			
		}


		}
	


