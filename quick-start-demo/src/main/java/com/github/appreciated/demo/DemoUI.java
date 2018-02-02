package com.github.appreciated.demo;

import com.github.appreciated.quickstart.base.authentication.login.example.ExampleAccessControl;
import com.github.appreciated.quickstart.base.authentication.registration.example.ExampleRegistrationControl;
import com.github.appreciated.quickstart.base.navigation.description.WebAppDescription;
import com.github.appreciated.quickstart.base.navigation.description.WebAppDescriptionBuilder;
import com.github.appreciated.quickstart.base.splashscreen.CustomSplashScreenConfigurator;
import com.github.appreciated.quickstart.base.ui.QuickStartUI;
import com.github.appreciated.quickstart.material.MaterialDesignProvider;
import com.vaadin.annotations.*;
import com.vaadin.navigator.PushStateNavigation;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import org.vaadin.leif.splashscreen.SplashScreenConfigurator;

import javax.servlet.annotation.WebServlet;

@Push
@PushStateNavigation
@SpringUI
@Viewport("width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no")
@Theme("demo")
@Title("App Layout Demo")
@SplashScreenConfigurator(value = CustomSplashScreenConfigurator.class) // This hopefully won't be necessary in future
public class DemoUI extends QuickStartUI {

    @Override
    public WebAppDescription initWebAppDescription() {
        return new WebAppDescriptionBuilder().withDesignProvider(MaterialDesignProvider.class) // Set the "design" for the desktop platform
                .withAccessControl(new ExampleAccessControl()) // Set your custom login procedure
                .withRegistrationControl(new ExampleRegistrationControl()) // Set your custom registration procedure
                .withLoginPage() // Set a login Subpage if you want to have one, otherwise a login / registration button will be shown on the menu
                .withTitle("TestWebsite")
                .withPages(new View1(),     // add all the Views your want to be able to navigate in
                        new View2(),        // ...
                        new View3())        // ...
                .build();
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = DemoUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

}