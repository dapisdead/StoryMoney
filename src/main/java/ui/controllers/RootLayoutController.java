package ui.controllers;

import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class RootLayoutController {

    @FXML private TableView<InfoTableLine> rootTableView;
    @FXML private TableColumn<InfoTableLine,String> categoriesColumn;
    @FXML private TableColumn<InfoTableLine,String> costColumn;
    @FXML private TableColumn<InfoTableLine,String> percentsColumn;
    @FXML private PieChart pieChart;


    public void init() {
        setupTableView();
    }

    private void setupTableView() {
        rootTableView.setEditable(false); // убрать фабрику и обработчик, если не будет возможности корректирования

        categoriesColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        categoriesColumn.setCellFactory(TextFieldTableCell.forTableColumn()); // List
        categoriesColumn.setOnEditCommit(event -> event.getRowValue().setCategory(event.getNewValue()));

        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        costColumn.setCellFactory(TextFieldTableCell.forTableColumn()); // List
        costColumn.setOnEditCommit(event -> event.getRowValue().setCost(event.getNewValue()));

        percentsColumn.setCellValueFactory(new PropertyValueFactory<>("percent"));
        percentsColumn.setCellFactory(TextFieldTableCell.forTableColumn()); // List
        percentsColumn.setOnEditCommit(event -> event.getRowValue().setPercent(event.getNewValue()));
    }

    public class InfoTableLine {
        private String category;
        private String cost;
        private String percent;

        public InfoTableLine(String category, String cost, String percent) {
            this.category = category;
            this.cost = cost;
            this.percent = percent;
        }

        public String getCategory() { return category; }
        public String getCost() { return cost; }
        public String getPercent() { return percent; }

        public void setCategory(String category) { this.category = category; }
        public void setCost(String cost) { this.cost = cost; }
        public void setPercent(String percent) { this.percent = percent; }
    }
}
