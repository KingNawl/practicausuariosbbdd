package ventanas;

import java.awt.event.*;
import javax.swing.*;

public class SignUpIn extends JFrame implements ActionListener{
    
    JButton signupButton; //Registrarse
    JButton signinButton; //Loguearte

    public SignUpIn(){
        configVentana();
        configBotones();
    }

    public void configVentana(){
        setLayout(null); //Elimina toda la plantilla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cuando cerremos la ventana finaliza el programa
        setSize(500, 500); //Establecemos el tamaño
        setLocationRelativeTo(null); //Centramos la ventana en el monitor
        setResizable(false); //No se puede modificar el tamaño de la ventana
        setTitle("LOGIN APP"); //Titulo
        setVisible(true); //Hacemos visible la ventana
    }

    public void configBotones(){

        this.signupButton=new JButton("Sign Up");
        this.signinButton=new JButton("Sign In");
        signupButton.setBounds(100, 250, 80, 30);
        signinButton.setBounds(300, 250, 80, 30);
        add(signupButton);
        add(signinButton);
        signupButton.addActionListener(this);
        signinButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==signupButton){
            //Abrimos ventana de signup
            JOptionPane.showMessageDialog(null,"Sign up");
        }
        if(e.getSource()==signinButton){
            //Abrimos ventana de signup
            JOptionPane.showMessageDialog(null,"Sign in");
        }
    }
}
