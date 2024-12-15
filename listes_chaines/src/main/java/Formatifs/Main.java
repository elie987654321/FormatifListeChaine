package Formatifs;

public class Main {
    public static void main(String[] args)
    {
        Personne p = new PersonneBuilder().setNom("PoirierClement").setPrenom("Elie").setNas("11").build();
        Personne p2 = new PersonneBuilder().setNom("Clement").setPrenom("Denis").setNas("2222").build();
        Personne p3 = new PersonneBuilder().setNom("qwerty").setPrenom("Qwerty").setNas("333333333").build();
        Personne p4 = new PersonneBuilder().setNom("bob").setPrenom("Qwerty").setNas("4444").build();
        Personne p5 = new PersonneBuilder().setNom("fafs").setPrenom("ddsad").setNas("555555").build();
        Personne p6 = new PersonneBuilder().setNom("dadas").setPrenom("fdsfdsd").setNas("66666").build();
        Personne p7 = new PersonneBuilder().setNom("sedsa").setPrenom("gfdkgf").setNas("77777").build();
        Personne p8 = new PersonneBuilder().setNom("dsaada").setPrenom("fdsfkld334").setNas("88888").build();
        Personne p9 = new PersonneBuilder().setNom("dsada").setPrenom("432we").setNas("99999").build();
        Personne p10 = new PersonneBuilder().setNom("AjouteManuellement").setPrenom("Allo").setNas("000000").build();


        LinkedList list = new LinkedList();

        list.addPersonneLast(p);
        list.addPersonneLast(p2);
        list.addPersonneLast(p3);
        list.addPersonneLast(p4);
        list.addPersonneLast(p5);
        list.addPersonneLast(p6);
        list.addPersonneLast(p7);
        list.addPersonneLast(p8);
        list.addPersonneLast(p9);

        list.addPersonneAt(5, p10);

        list.displayList();

        list.findPersonne("2222");
        list.findPersonne("fdsfadsds");
        list.findPersonne("312321");
    }
}