package com.adl.newsapp;

import com.adl.newsapp.interfaces.ActionListener;
import com.adl.newsapp.view.Component;
import com.adl.newsapp.view.FooterComponent;
import com.adl.newsapp.view.FooterComponent;
import com.adl.newsapp.view.Form;
import com.adl.newsapp.view.HeaderComponent;
import com.adl.newsapp.view.InputTextComponent;
import com.adl.newsapp.view.InputTextComponent;

public class NewsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Form form = new Form();
		
		Component component1 = new Component("txtNama", "Nama Saya Iren");
		Component component2 = new Component("txtNama2", "Nama Saya Boba");
		HeaderComponent headerComponent1 = new HeaderComponent("txtNama3", "Ini adalah header");
		FooterComponent footer = new FooterComponent("footer1", "Halo ini Footer lho");
		InputTextComponent txtInput = new InputTextComponent("txtInput", "Masukkan pilihan anda?>");
		

		
		form.addComponent(headerComponent1);
		form.addComponent(component1);
		form.addComponent(component2);
		form.addComponent(footer);
		form.addComponent(txtInput);
		form.showComponents();
		
		txtInput.setAction(new ActionListener() {
			
			@Override
			public void onAction(Component component) {
				component.setLabel(txtInput.getValue());
				form.showComponents();
			}
		},headerComponent1);
	}
	
}