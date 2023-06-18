package programme;

import metier.MetierProduitImpl;
import metier.Produit;

import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Scanner;

public class Application {
    public Application() {
    }

    public static void main(String[] args) throws IOException, NotSerializableException {
        MetierProduitImpl metier = new MetierProduitImpl();

        int choix;
        do {
            String MENU = "\n1. Afficher la liste des produits.\n2. Rechercher un produit par son id.\n3. Ajouter un nouveau produit dans la liste.\n4. Supprimer un produit par id.\n5. sauvgarder la liste des produits dans un fichier produits.txt.\n6. Quitter ce programme.\n";
            System.out.println(MENU);
            Scanner sc = new Scanner(System.in);
            choix = sc.nextInt();
            switch (choix) {
                case 1:
                    System.out.println(metier.getAll());
                    break;
                case 2:
                    System.out.println("entrer l'id du produit que vous recherchez");
                    Scanner Rp = new Scanner(System.in);
                    long id1 = (long)Rp.nextInt();
                    System.out.println(metier.findById(id1));
                    break;
                case 3:
                    System.out.println("entrer l'id du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Ip = new Scanner(System.in);
                    long Idp = (long)Ip.nextInt();
                    System.out.println("entrer le nom du produit que vous Souhaitez ajouter dans la liste");
                    Scanner np = new Scanner(System.in);
                    String Nom_p = np.nextLine();
                    System.out.println("entrer la marque du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Mp = new Scanner(System.in);
                    String Marque_p = Mp.nextLine();
                    System.out.println("entrer le prix du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Pp = new Scanner(System.in);
                    double Prix_p = Pp.nextDouble();
                    System.out.println("entrer la Description du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Dp = new Scanner(System.in);
                    String Descr_p = Dp.nextLine();
                    System.out.println("entrer le nombre de stock du produit que vous Souhaitez ajouter dans la liste");
                    Scanner Ns_p = new Scanner(System.in);
                    int Nbr_s_p = Ns_p.nextInt();
                    Produit p = new Produit(Idp, Nom_p, Marque_p, Prix_p, Descr_p, Nbr_s_p);
                    metier.add(p);
                    break;
                case 4:
                    System.out.println("entrer l'id du produit que vous souhaitez Supprimer");
                    Scanner Sp = new Scanner(System.in);
                    long id3 = (long)Sp.nextInt();
                    metier.delete(id3);
                    break;
                case 5:
                    metier.SaveAll();
                    break;
                case 6:
                    System.out.println("vous avez quitter l'application");
                    break;
                default:
                    System.out.println("choix invalide");
            }
        } while(choix != 6);

    }
}
