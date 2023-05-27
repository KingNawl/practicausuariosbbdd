import conexiones.CConexionbbdd;

public class App {
    public static void main(String[] args) throws Exception {
        CConexionbbdd conector = new CConexionbbdd();
        conector.estableceConexion();
    }
}
