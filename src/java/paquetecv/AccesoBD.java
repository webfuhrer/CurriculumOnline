/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
class AccesoBD {

    static List<Campo> recuperarCampos() {
      
       List<Campo> lista_campos=new ArrayList();
       try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_cv", "root", "");
            Statement stmt=c.createStatement();
            String sql="SELECT * FROM curriculum";
            ResultSet resultados=stmt.executeQuery(sql);
            while(resultados.next())
            {
                String titulo=resultados.getString("titulo");
                String texto=resultados.getString("texto");
                Campo campo=new Campo(titulo, texto);
                lista_campos.add(campo);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista_campos;
    }
    
   /* static void grabarPreguntas(Pregunta p)
    {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/trivial", "root", "");
            Statement stmt=c.createStatement();
            String sql="INSERT INTO t_preguntas(pregunta, respuesta, tipo) VALUES ('"+p.getPregunta()+"','"+p.getRespuesta()+"','"+p.getTipo()+"')";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
   

}
