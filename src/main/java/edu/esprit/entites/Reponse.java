package edu.esprit.entites;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reponse {
    private int id_reponse;
    private String description;
    private LocalDateTime date;
    private Reclamation reclamation;

    public edu.esprit.entites.Reclamation getReclamation() {
        return reclamation;
    }

    public void setReclamation(edu.esprit.entites.Reclamation reclamation) {
        this.reclamation = reclamation;
    }

    public Reponse() {
    }

    public Reponse( String description,Reclamation reclamation) {

        this.description = description;
        this.reclamation=reclamation;
        this.date = LocalDateTime.now();
    }

    public Reponse(int id_reponse, String description,Reclamation reclamation, LocalDateTime date) {
        this.id_reponse = id_reponse;
        this.description = description;
        this.reclamation=reclamation;
        this.date = date;
    }

    public int getId_reponse() {
        return id_reponse;
    }

    public void setId_reponse(int id_reponse) {
        this.id_reponse = id_reponse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate() {
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Reponse{" +
                "id_reponse=" + id_reponse +
                ", description='" + description + '\'' +
                ", reclamation= " + reclamation +
            ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reponse reponse = (Reponse) o;
        return id_reponse == reponse.id_reponse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_reponse);
    }
}
