package com.example.midterm200474646;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentTableViewController implements Initializable {

    @FXML
    private TableColumn<Student, Integer> avgGradeColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn;

    @FXML
    private TableColumn<Student, String> genderColumn;

    @FXML
    private TableColumn<Student, String> lastNameColumn;

    @FXML
    private TableColumn<Student, String> majorCodeColumn;

    @FXML
    private TableColumn<Student, String> provinceColumn;

    @FXML
    private TableColumn<Student, Integer> studentIdColumn;

    @FXML
    private TableColumn<Student, Integer> telephoneController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        avgGradeColumn.setCellValueFactory(new PropertyValueFactory<>("Age"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("Directors"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<>("Genres"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("Id"));
        majorCodeColumn.setCellValueFactory(new PropertyValueFactory<>("Title"));
        provinceColumn.setCellValueFactory(new PropertyValueFactory<>("Year"));
        studentIdColumn.setCellValueFactory(new PropertyValueFactory<>("Year"));
        telephoneController.setCellValueFactory(new PropertyValueFactory<>("Year"));

    }
}

