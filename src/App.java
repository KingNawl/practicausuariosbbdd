import conexiones.CConexionbbdd;
import ventanas.SignUpIn;

public class App {
    public static void main(String[] args) throws Exception {
        CConexionbbdd conector = new CConexionbbdd();
        conector.estableceConexion();
        SignUpIn menuChoose= new SignUpIn();
    }
}
