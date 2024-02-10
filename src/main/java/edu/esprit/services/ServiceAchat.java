package edu.esprit.services;

import edu.esprit.entites.Achat;
import edu.esprit.utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class ServiceAchat implements IService<Achat>{
    Connection cnx = DataSource.getInstance().getCnx();

    @Override
    public void ajouter(Achat achat) {
        String req = "INSERT INTO `achat`(`id_user`, `id_formation`, `id_outil`, `code_promo`, `total`, `date`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = cnx.prepareStatement(req);
            ps.setInt(1,achat.getUser());
            ps.setInt(2,achat.getFormation());
            ps.setInt(3,achat.getOutil());
            ps.setString(4,achat.getCode_promo());
            ps.setInt(5,achat.getTotal());
            ps.setDate(6,achat.getDate_achat());
            ps.executeUpdate();
            System.out.println("Achat added !");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void modifier(Achat achat) {

    }

    @Override
    public void supprimer(int id) {

    }

    @Override
    public Achat getOneById(int id) {
        return null;
    }

    @Override
    public Set<Achat> getAll() {
        return null;
    }
}
