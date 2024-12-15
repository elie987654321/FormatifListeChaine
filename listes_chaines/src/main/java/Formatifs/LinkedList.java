package Formatifs;

public class LinkedList
{
    private Link firstLink;
    private Link lastLink;

    public void addPersonneFirst(Personne personne)
    {
        if(firstLink == null)
        {
            firstLink = new Link();
            firstLink.setPersonne(personne);
            lastLink = firstLink;
        }
        else if(firstLink == lastLink)
        {
            Link newLink = new Link();
            newLink.setPersonne(personne);
            newLink.setNextLink(firstLink);
            firstLink = newLink;
        }
        else
        {
            Link previousFirstLink = firstLink;
            firstLink = new Link();
            firstLink.setPersonne(personne);
            firstLink.setNextLink(previousFirstLink);

        }
    }

    public void addPersonneLast1(Personne personne)
    {
        Link newLink = new Link();
        newLink.setPersonne(personne);
        if(firstLink == null)
        {
            firstLink = newLink;
            lastLink = newLink;
        }
        else if(firstLink == lastLink)
        {
            firstLink.setNextLink(newLink);
            lastLink = newLink;
        }
        else
        {
            lastLink.setNextLink(newLink);
            lastLink = newLink;
        }
    }

    public void addPersonneAt(int positionNouvelElement, Personne personne)
    {

        if(firstLink != null && firstLink != lastLink) {
            int i = 0;

            Link lastLink = null;
            Link currentLink = firstLink;

            boolean depasser = false;

            while(i <= positionNouvelElement && currentLink != null && !depasser)
            {
                lastLink = currentLink;
                currentLink = lastLink.getNextLink();
                if(currentLink.getNextLink() == null)
                {
                    depasser = true;
                }
                i++;
            }

            if(!depasser)
            {
                Link newLink = new Link();
                newLink.setPersonne(personne);
                lastLink.setNextLink(newLink);
                newLink.setNextLink(currentLink);
            }

        }
    }

    public void findPersonne(String nas)
    {
        Link currentLink = firstLink;
        boolean trouve = false;
        while(!trouve && currentLink != null && currentLink.getNextLink() != null)
        {
            if(currentLink.getPersonne().getNas().equals(nas))
            {
                trouve = true;
            }
            else
            {
                currentLink = currentLink.getNextLink();
            }
        }

        if(trouve)
        {
            System.out.println("La personne a été trouvé");
            System.out.println("Nom: " + currentLink.getPersonne().getNom());
            System.out.println("Prenom:" + currentLink.getPersonne().getPrenom());
            System.out.println("NAS:" + currentLink.getPersonne().getNas());
        }
        else
        {
            System.out.println("La personne n'a pas été trouvé");
        }
    }

    public void displayList()
    {
        Link currentLink = firstLink;

        while(currentLink != null)
        {
            Personne personne = currentLink.getPersonne();
            System.out.print("Nom: "  + personne.getNom() + " Prenom: " + personne.getPrenom() + " NAS: " + personne.getNas() + " ->");
            currentLink = currentLink.getNextLink();
        }
    }


}