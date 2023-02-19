/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

/**
 *
 * @author Axel
 */
public class Session {
    private  static int id_user;
    private static String username;
    private static String level;
    private static String password;
    
    
    public static int get_id_user(){
        return id_user;
    }
    public static void set_id(int id){
    Session.id_user = id;
    }
        public static String get_nama_user(){
        return username;
    }
             public static void  set_nama_user(String user){
        Session.username = user;
    }
        public static String get_lvl(){
        return level;
        }
        public static void set_lvl(String lev){
        Session.level = lev;
        }
        public static String get_password(){
            return password;
        }
        public static void  set_password(String pass){
        Session.password = pass;
        }

    public static void set_id(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
       }
