package metier;

public class Produit {
    private long id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int nb_stock;

    public Produit(long id, String nom, String marque, double prix, String description, int nb_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nb_stock = nb_stock;
    }

    public Produit() {
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNb_stock() {
        return this.nb_stock;
    }

    public void setNb_stock(int nb_stock) {
        this.nb_stock = nb_stock;
    }

    public String toString() {
        return "Produit{id=" + this.id + ", nom='" + this.nom + "', marque='" + this.marque + "', prix=" + this.prix + ", description='" + this.description + "', nb_stock=" + this.nb_stock + "}";
    }
}
