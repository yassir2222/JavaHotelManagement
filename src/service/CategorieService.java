package service;

import DAO.IDAO;
import connexion.Connexion;
import entities.Categorie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategorieService implements IDAO<Categorie>{

    @Override
    public boolean create(Categorie o) {
        String req = "INSERT INTO categorie VALUES(null,?,?)";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1,o.getCode());
            stm.setString(2,o.getLibelle());
            if(stm.executeUpdate()>0){
                return true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return false;
    }

    @Override
    public boolean update(Categorie o) {
        String req = "UPDATE FROM categorie set code=? ,libelle = ? where id=?";
        try{
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1,o.getCode());
            stm.setString(2,o.getLibelle());
            stm.setInt(3,o.getId());
            if(stm.executeUpdate()==1){
                return true;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Categorie o) {
        String req = "DELETE from categorie where id=?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setInt(1,o.getId());
            if(stm.executeUpdate() ==1){
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Categorie findByID(int id) {
        String req = "SELECT * FROM categorie WHERE id = ?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setInt(1,id);
           ResultSet res= stm.executeQuery();
           if(res.next()){
               return new Categorie(res.getString(2),res.getString(3));
           }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Categorie> findByAll() {
        String req = "SELECT * FROM categorie ";
        List<Categorie> categories = new ArrayList<>();
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            ResultSet res = stm.executeQuery();

            while (res.next()){
                categories.add(new Categorie(res.getString(2),res.getString(3)));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return categories;
    }
}