/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistem.pencatatan.kedatangan.mahasiswa.baru.it.del;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 *
 * @author Ratu Aryella Johana
 */
public class FXMLDocumentController implements Initializable {
    ObservableList<String> gender = FXCollections.observableArrayList("Perempuan","Laki-Laki");
    
    ObservableList<String> prodi = FXCollections.observableArrayList("DIII Teknik Informatika","DIII Teknik Komputer","DIV Teknik Informatika", "S1 Teknik Informatika", "S1 Sistem Informasi", "S1 Teknik Elektro","S1 Manajemen Rekayasa", "S1 Teknik Bioproses");
    
    @FXML
    private Label label;
    
    @FXML
    private ComboBox genderbox;
    
    @FXML
    private ComboBox prodibox;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        genderbox.setValue("Perempuan");
        genderbox.setItems(gender);
        
        prodibox.setValue("DIII Teknik Informatika");
        prodibox.setItems(prodi);
    }    
    
}
