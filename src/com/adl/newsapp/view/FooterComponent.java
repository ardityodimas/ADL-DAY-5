package com.adl.newsapp.view;

public class FooterComponent extends Component {
	
	
	public FooterComponent() {
		super();
		
	}

public FooterComponent(String name, String label) {
	super(name, label);
}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		String footer = "===================================\n" + 
						"|                                 |\n" +
						"|    "+this.getLabel() +"        |\n" +
						"|                                 |\n" +
						"|                                 |\n" +
						"|                                 |\n" +
						"===================================\n" ;
				System.out.println(footer);
	
	}					
	
				
}
