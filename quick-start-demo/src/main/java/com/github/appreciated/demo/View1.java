package com.github.appreciated.demo;

import com.github.appreciated.app.layout.annotations.MenuCaption;
import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.github.appreciated.quickstart.base.navigation.description.SubpageDescription;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = "") // in Spring an empty view name is also the default view
@MenuIcon(VaadinIcons.HOME)
@SubpageDescription(name = "Home View")
public class View1 extends ExampleView {
    @Override
    String getViewName() {
        return getClass().getName();
    }
}
