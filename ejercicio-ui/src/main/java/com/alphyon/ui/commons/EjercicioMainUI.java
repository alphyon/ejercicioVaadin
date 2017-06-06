package com.alphyon.ui.commons;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SpringUI(path = EjercicioMainUI.NAME)
@Title("Ejercicio")
@Theme("valo")
public class EjercicioMainUI extends UI {
	public static final String NAME = "/ui";

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout root = new VerticalLayout();

		root.addComponent(new Label("TEst test"));
		setContent(root);

	}

}
