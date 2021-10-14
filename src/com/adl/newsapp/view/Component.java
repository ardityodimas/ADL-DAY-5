package com.adl.newsapp.view;

import com.adl.newsapp.interfaces.ActionListener;

public class Component {
	
	private String name;
	private String label;
	
	public Component() {
		
	}
	
	public Component(String name, String label) {
		this.name = name;
		this.label = label;
	}

		public void show() {
		System.out.println(label);
	}
		
		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
	public void setAction(ActionListener action, Component component) {
		action.onAction(component);
	}
	
}