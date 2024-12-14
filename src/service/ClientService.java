package service;

import DAO.IDAO;
import connexion.Connexion;
import entities.Client;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;


public class ClientService implements IDAO<Client> {

    @Override
    public boolean create(Client o) {
        String req = "Insert Into Client Values (null,?,?,?,?)";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1,o.getNome());
            stm.setString(2,o.getPrenom());
            stm.setString(3,o.getTelephone());
            stm.setString(4,o.getEmail());
            if (stm.executeUpdate()==1){
                return true;
            }
        }catch (SQLException e){
            System.out.println("sql Exception");
        }
        return false;
    }

    @Override
    public boolean update(Client o) {
        String req = "UPDATE client SET nom=?,prenom=?,email=?,telephone=? WHERE id=?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setString(1,o.getNome());
            stm.setString(2,o.getPrenom());
            stm.setString(3,o.getTelephone());
            stm.setString(4,o.getEmail());
            stm.setInt(5,o.getId());
            if (stm.executeUpdate()==1){
                return true;
            }
        }catch (SQLException e){
            System.out.println("sql Exception");
        }
        return false;
    }

    @Override
    public boolean delete(Client o) {
        String req = "DELETE FROM client WHERE id=?";
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
    public Client findByID(int id) {
        String req = "SELECT * FROM client WHERE id=?";
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println("sql Exception");
        }
        return null;
    }

    @Override
    public List<Client> findByAll() {
        String req = "SELECT * FROM client";
        List<Client> clients = new ArrayList<>();
        try {
            PreparedStatement stm = Connexion.getCnx().prepareStatement(req);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                clients.add(new Client(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"), rs.getString("email")));
            }
        } catch (SQLException e) {
            System.out.println("sql Exception");
        }
        return clients;
    }
}
