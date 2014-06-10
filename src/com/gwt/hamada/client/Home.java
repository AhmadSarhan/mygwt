package com.gwt.hamada.client;



import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Home implements EntryPoint {
	private TextBox aBox=new TextBox();
	private TextBox bBox=new TextBox();
	private TextBox cBox=new TextBox();
	private Label result =new Label();
	

	
	@Override
	public void onModuleLoad() {
		
		
		RootPanel rootPanel = RootPanel.get();
		RootPanel.get().add(aBox,54,104);
		RootPanel.get().add(bBox,54,136);
		RootPanel.get().add(cBox,54,168);
		RootPanel.get().add(result,300,300);
		
         
		 Button btn=new Button("Send To Server",new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				double a =Double.parseDouble(aBox.getText());
				double b =Double.parseDouble(bBox.getText());
				double c =Double.parseDouble(cBox.getText());
				
				double d=b*b - 4*a*c;
				
				if(d>0)
				{
					double x1 = -b + Math.sqrt(d)/2*a;
					double x2 = -b - Math.sqrt(d)/2*a;
					
					result.setText(Double.toString(x1)+"or"+Double.toString(x2));
			
					
				//	System.out.print(x1);
					//System.out.print(x2);
					
					
					
				}
				
				else if(d==0)
				{
					double x = -b/2*a;
					result.setText(Double.toString(x));
					System.out.print(x);
				}
				
				else
				{
					result.setText("No solution");
				}
				
				
				
			}
		
		});
		 
		 RootPanel.get().add(btn,227,168);
		 
		 Label lblMyFirstExample = new Label("my first example");
		 rootPanel.add(lblMyFirstExample, 227, 10);
		 
		 Label lblExSolveSquare = new Label("ex: solve square equation like ax^2+bx+c=0");
		 rootPanel.add(lblExSolveSquare, 10, 41);
		 
		 Label lblEnterThis = new Label("enter this");
		 rootPanel.add(lblEnterThis, 10, 67);
		 
		 Label lblA = new Label("a :");
		 rootPanel.add(lblA, 19, 110);
		 lblA.setSize("14px", "20px");
		 
		 Label lblB = new Label("b :");
		 rootPanel.add(lblB, 18, 142);
		 
		 Label lblC = new Label("c :");
		 rootPanel.add(lblC, 20, 168);
		 
		
		

	}
}
