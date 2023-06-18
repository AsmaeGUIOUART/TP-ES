package metier;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetierProduitImpl implements IMetier<Produit> {
    List<Produit> produits = new ArrayList();

    public MetierProduitImpl() {
    }

    public void add(Produit o) {
        new Produit();
        Iterator var3 = this.produits.iterator();

        while(var3.hasNext()) {
            Produit p = (Produit)var3.next();
            if (p.getId() == o.getId()) {
                System.err.println("produit deja exist");
            }
        }

        this.produits.add(o);
    }

    public List<Produit> getAll() {
        return this.produits;
    }

    public Produit findById(long id) {
        Produit P = new Produit();
        Iterator var4 = this.produits.iterator();

        while(var4.hasNext()) {
            Produit p = (Produit)var4.next();
            if (p.getId() == id) {
                P = p;
            }
        }

        return P;
    }

    public void delete(long id) {
        Produit p = new Produit();

        Produit produit;
        for(Iterator var4 = this.produits.iterator(); var4.hasNext(); p = produit) {
            produit = (Produit)var4.next();
            if (produit.getId() == id) {
            }
        }

        this.produits.remove(p);
    }

    public void SaveAll() throws IOException {
        File f1 = new File("produits.dat");
        FileOutputStream Fos = new FileOutputStream(f1);
        ObjectOutputStream Oos = new ObjectOutputStream(Fos);
        Iterator var4 = this.produits.iterator();

        while(var4.hasNext()) {
            Produit p = (Produit)var4.next();
            Oos.writeObject("" + p + "\n");
        }

        System.out.println("successful");
        Fos.close();
        Oos.close();
    }
}

