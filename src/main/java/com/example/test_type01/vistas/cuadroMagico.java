package com.example.test_type01.vistas;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class cuadroMagico extends Stage {
    private Scene escena;

    public cuadroMagico (){
        this.setTitle("cuadro magico");
        this.setScene(new Scene (new Button("puchale again")));
        this.show();
    }

    private void createUI(){
        escena = new Scene(new Button("puchale"));

    }
}
