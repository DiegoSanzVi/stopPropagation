package org.vaadin.diego;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the test-button.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("test-button")
@HtmlImport("src/test-button.html")
public class TestButton extends PolymerTemplate<TestButton.TestButtonModel> {

    @Id("vaadinButton")
    private Button vaadinButton;

    /**
     * Creates a new my.com.example.TestButton.
     */
    public TestButton() {
        // You can initialise any data required for the connected UI components here.
        vaadinButton.addClickListener(buttonClickEvent -> {
            System.out.print("buttonClickEvent");
        });
    }

    /*
    @Override
    public void onComponentEvent(ClickEvent clickEvent) {
        System.out.print("click !");
    }*/

    /**
     * This model binds properties between my.com.example.TestButton and test-button.html
     */

    public interface TestButtonModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
    /*
    @DomEvent("click")
    public class ClickEvent extends ComponentEvent<Button> {
        private final int button;

        public ClickEvent(Button source, boolean fromClient,
                          @EventData("event.button") int button) {
            super(source, fromClient);
            this.button = button;
        }

        public int getButton() {
            return button;
        }
    }*/

}
