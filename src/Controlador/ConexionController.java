/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.Conexion;
import Vista.frmLogin;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author umg
 */
public class ConexionController implements ActionListener {
    frmLogin VistaLogin;
    frmPrincipal VistaPrincipal;
    Conexion ModeloConexion;

    public ConexionController(frmLogin VistaLogin, frmPrincipal VistaPrincipal, Conexion ModeloConexion) {
        this.VistaLogin = VistaLogin;
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloConexion = ModeloConexion;
        
        //Levantar Formulario Principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        //Poner a la escucha el boton principal
        this.VistaLogin.btnAceptar.addActionListener(this);
        
        //
        this.VistaLogin.setLocationRelativeTo(null);
        this.VistaLogin.setVisible(true);
    }

    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource()==this.VistaLogin.btnAceptar){
            this.ModeloConexion.Conectar(this.VistaLogin.txtUser.getText(), 
                    this.VistaLogin.txtPass.getText());
        }
        //this.VistaPrincipal.setVisible(false);
        //this.VistaLogin.setVisible(true);
    }
    
    
}
