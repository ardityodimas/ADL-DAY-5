package com.adl.newsapp.view;

public class ContentComponent extends Component {
	
	public ContentComponent(String name, String label) {
		super(name, label);
	}
	
	@Override
	public void show() {
		System.out.println(this.getLabel());
	}

}
