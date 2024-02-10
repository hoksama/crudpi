package edu.esprit.tests;

import edu.esprit.entites.Achat;
import edu.esprit.entites.Formation;
import edu.esprit.entites.Outil;
import edu.esprit.entites.User;
import edu.esprit.services.ServiceAchat;
import edu.esprit.utils.DataSource;

import java.io.Serial;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        ServiceAchat serviceAchat = new ServiceAchat();
        System.out.println(DataSource.getInstance());
        Formation formation = new Formation(4);
        Outil outil = new Outil(3);
        User user = new User(1);
        LocalDate localDate = LocalDate.of(2024, 1, 13);
        Date sqlDate = Date.valueOf(localDate);
        System.out.println("SQL Date: " + sqlDate);
        String code_promo="test23";
        Achat achat1 = new Achat(user,formation,outil,code_promo,5000,sqlDate);
        serviceAchat.ajouter(achat1);


    }
}
