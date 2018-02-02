package com.github.appreciated.demo;

import com.github.appreciated.app.layout.annotations.MenuCaption;
import com.github.appreciated.app.layout.annotations.MenuIcon;
import com.github.appreciated.quickstart.base.navigation.description.SubpageDescription;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.spring.annotation.SpringView;

@SpringView(name = "view3") // the path under which you can navigate to it
@SubpageDescription(name = "View3")
public class View3 extends ExampleView {
    @Override
    String getViewName() {
        return getClass().getName();
    }
}
