package edu.esprit.controllers;

import edu.esprit.entites.Reclamation;
import edu.esprit.services.ServiceReclamation;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;

public class AfficherReclamationBack implements Initializable {
    @FXML
    private GridPane reclamationContainer;
    private final ServiceReclamation ReclamationService = new ServiceReclamation();
    private Set<Reclamation> Liste ;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Liste = new HashSet<>(reclamations());
        int column = 0;
        int row = 0;

        try {
            for (Reclamation reclamation: Liste) {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/Reclamation.fxml"));
                VBox reclamationBox = fxmlLoader.load();
                ReclamationController reclamationController = fxmlLoader.getController();
                reclamationController.setData(reclamation);

                if(column == 3){
                    column = 0;
                    ++row;
                }
                reclamationContainer.add(reclamationBox,column++,row);

                reclamationContainer.setMinWidth(Region.USE_COMPUTED_SIZE);
                reclamationContainer.setPrefWidth(Region.USE_COMPUTED_SIZE);
                reclamationContainer.setMaxWidth(Region.USE_COMPUTED_SIZE);


                reclamationContainer.setMinHeight(Region.USE_COMPUTED_SIZE);
                reclamationContainer.setPrefHeight(Region.USE_COMPUTED_SIZE);
                reclamationContainer.setMaxHeight(Region.USE_COMPUTED_SIZE);
                GridPane.setMargin(reclamationBox , new Insets(10));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }



    private Set<Reclamation> reclamations(){
        Set<Reclamation> listR = new HashSet<>();
        try {
            listR.addAll(ReclamationService.getAll());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listR;
    }


}
