package edu.esprit.tests;

import edu.esprit.entites.*;
import edu.esprit.services.ServiceReclamation;
import edu.esprit.services.ServiceReponse;
import edu.esprit.utils.DataSource;


public class Main {
    public static void main(String[] args) {
        //wiwwwwww
        ServiceReponse serviceReponse = new ServiceReponse();
        ServiceReclamation serviceReclamation = new ServiceReclamation();
        System.out.println(DataSource.getInstance());
        Formation formation = new Formation(1);
        Outil outil = new Outil(1);
        User user = new User(2);
        Reclamation reclamation = new Reclamation();
        reclamation.setId_reclamation(1);

        //serviceReponse.ajouter(new Reponse(user,"wiiiiw",reclamation));

        System.out.println(serviceReponse.getOneById(2));



       //serviceAchat.modifier(achat1(1,80,70,70,code_promo,690));
      //  Reponse r1 = new Reponse(desc);
        //serviceAchat.ajouter(achat1);
        //serviceAchat.supprimer(4);
        //ajouter reponse
        //serviceReponse.ajouter(r1);
        //serviceReponse.modifier(r1);
        //serviceReponse.supprimer(2);
        //System.out.println(serviceReponse.getOneById(1));
       // System.out.println(serviceReponse.getAll());

       // Reclamation rec = new Reclamation(422,0,0,5, "wiiw");
      //  serviceReclamation.ajouter(rec);
       // System.out.println(serviceReclamation.getAll());
        //serviceReclamation.supprimer(1);



    }
}
