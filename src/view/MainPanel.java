package view;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox {
  ComboPanel comboPanel;

  ListPanel listPanel;

  public MainPanel() {
    this.comboPanel = new ComboPanel();
    this.listPanel = new ListPanel();
    this.getChildren().add(comboPanel);
    this.getChildren().add(listPanel);

  }

  public ListPanel getListPanel() {
    return listPanel;
  }

  public ComboPanel getComboPanel() {
    return comboPanel;
  }
}
