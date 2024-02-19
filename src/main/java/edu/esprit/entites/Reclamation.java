package edu.esprit.entites;

import edu.esprit.services.IService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Reclamation {
    private int id_reclamation;
    private int id_user;
    private int id_outil;
    private int id_formation;
    private String description;

    private LocalDateTime date_reclamation;

    public Reclamation() {
    }

    public Reclamation(int id_reclamation, int user, int outil, int formation, String description , LocalDateTime date_reclamation) {
        this.id_reclamation = id_reclamation;
        this.id_user = user;
        this.id_outil = outil;
        this.id_formation = formation;
        this.description = description;
        this.date_reclamation = date_reclamation;
    }
    public Reclamation( int user, int outil, int formation,String description ) {

        this.id_user = user;
        this.id_outil = outil;
        this.id_formation = formation;
        this.description = description;

        this.date_reclamation = LocalDateTime.now();
    }
    public Reclamation( int id_reclamation , int user, int outil, int formation,String description) {
        this.id_reclamation = id_reclamation;
        this.id_user = user;
        this.id_outil = outil;
        this.id_formation = formation;
        this.description = description;


    }

    public int getId_reclamation() {
        return id_reclamation;
    }

    public void setId_reclamation(int id_reclamation) {
        this.id_reclamation = id_reclamation;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_outil() {
        return id_outil;
    }

    public void setId_outil(int id_outil) {
        this.id_outil = id_outil;
    }

    public int getId_formation() {
        return id_formation;
    }

    public void setId_formation(int id_formation) {
        this.id_formation = id_formation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDateTime getDate_reclamation() {
        return date_reclamation;
    }

    public void setDate_reclamation() {
        this.date_reclamation = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Reclamation{" +
                "id_reclamation=" + id_reclamation +
                ", id_user=" + id_user +
                ", id_outil=" + id_outil +
                ", id_formation=" + id_formation +
                ", description='" + description + '\'' +
                ", date_reclamation=" + date_reclamation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reclamation that = (Reclamation) o;
        return id_reclamation == that.id_reclamation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_reclamation);
    }
}
