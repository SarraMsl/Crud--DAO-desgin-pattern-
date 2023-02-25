/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author Sara Mousselmal
 */
public class DAOCours  implements  Operationes{

    Database db =new Database();
     Cours   cr =new Cours();
    
    @Override
    public boolean insert(Object obj) {
     cr=(Cours) obj;
     Connection con;
     PreparedStatement pst;
       String sql="insert into Cours values(?,?,?,?,?)";
       try{
           System.out.println(db.getDriver());
          Class.forName(db.getDriver());
           con=DriverManager.getConnection(
           db.getUrl(),
           db.getUss(),
           db.getPwd()
           );
           pst=con.prepareStatement(sql);
           pst.setInt(1,cr.getIdCours());
           pst.setString(2,cr.getNomCours());
           pst.setInt(3,cr.getCofficientCours());
           pst.setInt(4,cr.getCreditCours());
           pst.setString(5,cr.getNomProfesseur());

           int filas=pst.executeUpdate();
           if(filas>0){
           con.close();
           return true;}
           else{
           return false;
           }
       }catch (SQLException | ClassNotFoundException e){
           e.printStackTrace();
           JOptionPane.showConfirmDialog(null, "error"+e.getMessage());
           return false;
    }
        
    }
    @Override
    public boolean delete(Object obj) {
     cr=(Cours) obj;
     Connection con;
     PreparedStatement pst;
       String sql="delete from Cours where IdCours=?";
       try{
           Class.forName(db.getDriver());
           con=DriverManager.getConnection(
           db.getUrl(),
           db.getUss(),
           db.getPwd()
           );
           pst=con.prepareStatement(sql);
           
           pst.setInt(1,cr.getIdCours());
        
           int filas=pst.executeUpdate();
           if(filas>0){
           con.close();
           return true;}
           else{
           return false;
           }
       }catch (SQLException | ClassNotFoundException e){
          e.printStackTrace();
           JOptionPane.showConfirmDialog(null, "error"+e.getMessage());
           return false;
    }    }

    @Override
    public boolean update(Object obj) {
     cr=(Cours) obj;
     Connection con;
     PreparedStatement pst;
       String sql="update  Cours set NomCours=?,CofficientCours=?,CreditCours=?,NomProfesseur=? where IdCours=?";
       try{
           Class.forName(db.getDriver());
           con=DriverManager.getConnection(
           db.getUrl(),
           db.getUss(),
           db.getPwd()
           );
           pst=con.prepareStatement(sql);
           
    
           pst.setString(1,cr.getNomCours());
           pst.setInt(2,cr.getCofficientCours());
           pst.setInt(3,cr.getCreditCours());
           pst.setString(4,cr.getNomProfesseur());
           pst.setInt(5,cr.getIdCours());
           int filas=pst.executeUpdate();
           if(filas>0){
           con.close();
           return true;}
           else{
           return false;
           }
       }catch (SQLException | ClassNotFoundException e){
           JOptionPane.showConfirmDialog(null, "error"+e.getMessage());
           return false;
    }    }

    @Override
    public ArrayList<Object[]> read() {
ArrayList<Object[]> data=new ArrayList<>();
    Connection con;
     PreparedStatement pst;
     ResultSet rs;
     String sql="select*from Cours ";
    
 try{
           Class.forName(db.getDriver());
           con=DriverManager.getConnection(
           db.getUrl(),
           db.getUss(),
           db.getPwd()
           );
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            while(rs.next()){
            Object[] fila=new Object[5];
            for(int i=0; i<=4;i++){
                fila[i]=rs.getObject(i+1);
            }
            data.add(fila);
            }
            con.close();
          
           
       }catch (SQLException | ClassNotFoundException e){
           JOptionPane.showConfirmDialog(null, "error"+e.getMessage());
           
    }
 finally{
     return data;
 }
    }

    @Override
    public ArrayList<Object[]> recherch(int id) {
ArrayList<Object[]> data=new ArrayList<>();
    Connection con;
     PreparedStatement pst;
     ResultSet rs;
     String sql="SELECT * FROM Cours where IdCours =?";
    
 try{
           Class.forName(db.getDriver());
           con=DriverManager.getConnection(
           db.getUrl(),
           db.getUss(),
           db.getPwd()
           );
            pst=con.prepareStatement(sql);
            pst.setInt(1, id);
            rs=pst.executeQuery();
            while(rs.next()){
            Object[] fila=new Object[5];
            for(int i=0; i<=4;i++){
                fila[i]=rs.getObject(i+1);
            }
            data.add(fila);
            }
            con.close();
          
           
       }catch (SQLException | ClassNotFoundException e){
           JOptionPane.showConfirmDialog(null, "error"+e.getMessage());
           
    }
 finally{
     return data;
 }    }

   
    
}



