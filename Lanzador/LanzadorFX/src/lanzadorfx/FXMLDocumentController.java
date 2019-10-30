/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzadorfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author jmfdiaz
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button btnLanzar;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        ProcessBuilder pb;
        try {
                pb = new ProcessBuilder("C:\\Program Files (x86)\\Adobe\\Acrobat Reader DC\\Reader\\AcroRd32.exe");
                pb.start();
        } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
}
