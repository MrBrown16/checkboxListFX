package view;

import javafx.scene.control.ComboBox;

public class ComboPanel extends ComboBox<String>{

    public ComboPanel() {
        this.setPromptText("Fruits");
        this.getItems().add("hazai");
        this.getItems().add("déli");
    }
    
}
