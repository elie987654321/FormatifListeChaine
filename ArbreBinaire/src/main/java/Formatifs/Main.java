package Formatifs;

public class Main {
    public static void main(String[] args)
    {
        int[] tabInt = {  45 , 35, 24, 67, 89, 10, 232, 11 , 400, 2, 1};

        ArbreBinaire arbreBinaire = new ArbreBinaire();

        for(int i = 0; i < tabInt.length; i++)
        {
            arbreBinaire.ajouterNombre(tabInt[i]);
        }


        System.out.println("45 trouve :" + arbreBinaire.rechercherNombre(45));
        System.out.println("35 trouve :" + arbreBinaire.rechercherNombre(35));
        System.out.println("25 trouve :" + arbreBinaire.rechercherNombre(25));

//        arbreBinaire.parcourPrefixe();
        arbreBinaire.parcourPostfix();

    }
}