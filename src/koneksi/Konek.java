/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Axel
 */
public class Konek {
    Connection conect ;
    public Konek(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bendahara", "root","");
//            JOptionPane.showMessageDialog(null, "terkoneksi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"gagal terkoneksi"+ e);
        }

    }
    public Connection login() {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
            conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bendahara", "root","");
//            JOptionPane.showMessageDialog(null, "terkoneksi");
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"gagal terkoneksi"+ e);
        }
        return conect;
    }
}
