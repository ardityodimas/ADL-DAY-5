package com.adl.newsapp.view;

public class HeaderComponent extends Component {
	
	public HeaderComponent() {
		super();
		
	}

public HeaderComponent(String name, String label) {
	super(name, label);
}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		String header = "===================================\n" + 
						"|                                 |\n" +
						"|    "+this.getLabel() +"         	  |\n" +
						"|                                 |\n" +
						"|                                 |\n" +
						"|                                 |\n" +
						"===================================\n" ;
				System.out.println(header);
	
	}					
	
				
}
