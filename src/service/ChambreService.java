package service;

import DAO.IDAO;
import connexion.Connexion;
import entities.Chambre;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ChambreService implements IDAO<Chambre> {

    @Override
    public boolean create(Chambre o) {
        String req = "INSERT INTO chambre VALUES (null, ?, ?)";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1, o.getTelephone());
            stm.setInt(2, o.getCategorie().getId());
            if (stm.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("sql Exception");
        }
        return false;
    }

    @Override
    public boolean update(Chambre o) {
        String req = "UPDATE chambre SET telephone=?, categorie_id=? WHERE id=?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1, o.getTelephone());
            stm.setInt(2, o.getCategorie().getId());
            stm.setInt(3, o.getId());
            if (stm.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("sql Exception");
        }
        return false;
    }

    @Override
    public boolean delete(Chambre o) {
        String req = "DELETE FROM chambre WHERE id=?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setInt(1, o.getId());
            if (stm.executeUpdate() == 1) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("sql Exception");
        }
        return false;
    }

    @Override
    public Chambre findByID(int id) {

        return null;
    }

    @Override
    public List<Chambre> findByAll() {

        return null;
    }
}
