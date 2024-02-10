package edu.esprit.entites;

import java.util.Date;

public class Achat {
    private int id_achat;
    private User user;
    private Formation formation;
    private Outil outil;
    private String code_promo;
    private int total;
    private java.sql.Date date_achat;

    public Achat(int id_achat, User user, Formation formation, Outil outil, String code_promo, int total, java.sql.Date date_achat) {
        this.id_achat = id_achat;
        this.user = user;
        this.formation = formation;
        this.outil = outil;
        this.code_promo = code_promo;
        this.total = total;
        this.date_achat = date_achat;
    }

    public Achat() {
    }

    public Achat(User user, Formation formation, Outil outil, String code_promo, int total, java.sql.Date date_achat) {
        this.user = user;
        this.formation = formation;
        this.outil = outil;
        this.code_promo = code_promo;
        this.total = total;
        this.date_achat = date_achat;
    }

    public int getId_achat() {
        return id_achat;
    }

    public void setId_achat(int id_achat) {
        this.id_achat = id_achat;
    }

    public int getUser() {
        return user.getId_user();
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getFormation() {
        return formation.getId_formation();
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public int getOutil() {
        return outil.getId_outil();
    }

    public void setOutil(Outil outil) {
        this.outil = outil;
    }

    public String getCode_promo() {
        return code_promo;
    }

    public void setCode_promo(String code_promo) {
        this.code_promo = code_promo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public java.sql.Date getDate_achat() {
        return date_achat;
    }

    public void setDate_achat(java.sql.Date date_achat) {
        this.date_achat = date_achat;
    }
}

