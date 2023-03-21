package control;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.MainModel;
import view.MainPanel;

public class MainControl {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainControl() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvents();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }    
    private void handleEvents(){
        this.mainPanel.getComboPanel().setOnAction(e -> this.selectCategory());
    }
    private void selectCategory(){
        int selected = this.mainPanel.getComboPanel().getSelectionModel().getSelectedIndex() + 1;
        ObservableList<String> obFruitsList = FXCollections.observableArrayList();
        System.out.println(selected);
        this.mainModel.getFruits().forEach(fruit -> {
            if (selected == fruit.getCategory()){
                System.out.println("fruit "+fruit.getName()+fruit.getCategory()); 
                obFruitsList.add(fruit.getName());
            }
        });
        this.mainPanel.getListPanel().setFruits(obFruitsList);
    }            

}
