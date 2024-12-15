package Formatifs;

public class ArbreBinaire
{
    private Noeud racineArbre;

    public void ajouterNombre(int nombre)
    {
        ajouterNombreRec(nombre, racineArbre);
    }

    private void ajouterNombreRec(int nombre, Noeud racine)
    {
        if(racine == null)
        {
            racineArbre = new Noeud(nombre);
        }
        else
        {
            Noeud noeud = new Noeud(nombre);

            if(nombre < racine.getCle())
            {
                if(racine.getLeft() == null)
                {
                    racine.setLeft(noeud);
                }
                else
                {
                    ajouterNombreRec(nombre, racine.getLeft());
                }
            }
            else
            {
                if(racine.getRight() == null)
                {
                    racine.setRight(noeud);
                }
                else
                {
                    ajouterNombreRec(nombre, racine.getRight());
                }
            }
        }
    }


    public boolean rechercherNombre(int nombre)
    {
       return rechercherNombreRecursif(nombre, racineArbre);
    }

    private boolean rechercherNombreRecursif(int nombre, Noeud racine)
    {
        boolean cleTrouve = false;

        if(racine.getCle() == nombre)
        {
            cleTrouve = true;
        }

        boolean cleTrouveGauche = false;
        if(racine.getLeft() != null)
        {
            cleTrouveGauche = rechercherNombreRecursif(nombre, racine.getLeft());
        }

        boolean cleTrouveDroite = false;
        if(racine.getRight() != null)
        {
            cleTrouveDroite = rechercherNombreRecursif(nombre, racine.getRight());
        }


        return cleTrouve || cleTrouveGauche || cleTrouveDroite;
    }

    public void parcourPrefixe()
    {
        parcourPrefixRec(racineArbre);
    }

    private void parcourPrefixRec(Noeud racine)
    {
        if(racine == null)
        {
            return;
        }

        System.out.println(racine.getCle());
        parcourPrefixRec(racine.getLeft());
        parcourPrefixRec(racine.getRight());

    }


    public void parcourPostfix()
    {
        parcourPostFixRec(racineArbre);
    }

    private void parcourPostFixRec(Noeud racine)
    {
        if(racine == null)
        {
            return;
        }

        parcourPostFixRec(racine.getLeft());
        parcourPostFixRec(racine.getRight());
        System.out.println(racine.getCle());
    }
}