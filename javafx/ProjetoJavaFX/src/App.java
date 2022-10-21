import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage palco) throws Exception {
        palco.setTitle("Minha primeira janela");
        Button botao = new Button("Clique aqui");
        StackPane painel = new StackPane();
        painel.getChildren().add(botao);
                                        //dimensões
        Scene cena = new Scene(painel, 300, 250);
        palco.setScene(cena);
        palco.show();


    }

    
}
