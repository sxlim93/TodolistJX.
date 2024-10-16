package com.example.todolistjx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label inscription;
    @FXML
    private Label connexion;


    @FXML
    protected void Inscription() {
        inscription.setText("Vous essayez de vous inscrire !");
    }
    @FXML
    protected void Connexion() {
        connexion.setText("Vous essayez de vous connecter !");
    }
}