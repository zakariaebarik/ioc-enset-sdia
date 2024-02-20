package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationInstentiationStatique {
    public static void main(String[] args) {
        // Injection des dépendances par instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("Résultat : " + metier.calcul());
    }
}
