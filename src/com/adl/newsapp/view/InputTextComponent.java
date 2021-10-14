package com.adl.newsapp.view;

import java.util.Scanner;

public class InputTextComponent extends Component {
	private String value ="";
	private Scanner scan = new Scanner(System.in); 
	
	public InputTextComponent(String name, String label) {
		
		super(name, label);
	}
	
	@Override
	public void show() {
		System.out.print(this.getLabel());
		this.value = scan.nextLine();
		
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
