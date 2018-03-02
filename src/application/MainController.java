package application;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.controller.AppController;
import com.facade.MyAppInterface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class MainController implements Initializable {
private MyAppInterface appInterface=new AppController();
	private Stage stage;

	@FXML
	private TextField filePath;

    @FXML
    private VBox vbox1;
    
    @FXML
    private VBox vbox2;
    
    @FXML
    private VBox vbox3;
    
    @FXML
    private Label label1;
    
    @FXML
    private Label label2;
    
    @FXML
    private Label label3;
	

	public void init(Stage stage) {
		// TODO Auto-generated method stub
		this.stage = stage;

	}

	private File fileChooser(String title, String absolutePath, String nameEx, String extension) {
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle(title);
		if (absolutePath != null) {
			File userDirectory = new File(absolutePath);
			fileChooser.setInitialDirectory(userDirectory);
		}
		fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter(nameEx, extension));
		return fileChooser.showOpenDialog(new Stage());
	}

	@FXML
	void chooseFile(ActionEvent event) {
		File file = fileChooser("Select the File", null, "wfwps file", "*.wfwps");
		filePath.setText(file.getName());
		//System.out.println(file.getName());
		

		for(String str:appInterface.getLocalWpsList()){
			vbox1.getChildren().add(new CheckBox(str));	
		}
		
		for(String str2:appInterface.getRemoteWpsList()){
			vbox2.getChildren().add(new CheckBox(str2));
		}
		
		for(String str3:appInterface.getWorkFlowList()){
			vbox3.getChildren().add(new CheckBox(str3));
		}
	}
	
	@FXML
	private void handelGenerateAction(ActionEvent event){
		
	 DirectoryChooser directoryChooser = new DirectoryChooser();	
	 File selectedDirectory = 
             directoryChooser.showDialog(stage);
	  label1.setText(appInterface.generate());
	  //appInterface.generate();
     
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		filePath.setEditable(false);
		
	}

}
