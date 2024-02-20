package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationInstentiationDynamique {
    public static void main(String[] args) throws Exception {

        // Injection des dépendances par instanciation dynamique

        // Recuperer le nom de la classe
        File file = new File("C:\\Users\\pc\\Documents\\SDIA\\Programmation Distribuées & Middlewares\\Tp\\ioc-enset-sdia\\src\\main\\java\\config.txt");
        Scanner scanner = new Scanner(file);
        String daoClassName = scanner.nextLine();
        String metierClassName = scanner.nextLine();

        // Chargement de la classe en mémoire
        Class cDao = Class.forName(daoClassName);
        Class cMetier = Class.forName(metierClassName);

        // Instentiation de la classe
        IDao dao = (IDao) cDao.newInstance();
        IMetier metier = (IMetier) cMetier.newInstance();


        Method method = cMetier.getMethod("setDao", IDao.class);

        // appliquer la méthode sur métier en passant dao en paramètres
        method.invoke(metier, dao);

        System.out.println("Résultat : " +metier.calcul());
    }
}
