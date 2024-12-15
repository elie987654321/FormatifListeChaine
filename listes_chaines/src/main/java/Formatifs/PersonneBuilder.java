package Formatifs;

public class PersonneBuilder
{
    private Personne personne;

    public PersonneBuilder()
    {
        this.personne = new Personne();
    }

    public PersonneBuilder setNom(String nom)
    {
        personne.setNom(nom);
        return this;
    }

    public PersonneBuilder setPrenom(String prenom)
    {
        personne.setPrenom(prenom);
        return this;
    }

    public PersonneBuilder setNas(String nas)
    {
        personne.setNas(nas);
        return this;
    }

    public Personne build()
    {
        return personne;
    }
}
