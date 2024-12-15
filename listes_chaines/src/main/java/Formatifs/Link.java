package Formatifs;

public class Link
{
    private Link nextLink;
    private Link lastLink;
    private Personne personne;

    public Link getNextLink() {
        return nextLink;
    }

    public void setNextLink(Link nextLink) {
        this.nextLink = nextLink;
    }

    public Link getLastLink() {
        return lastLink;
    }

    public void setLastLink(Link lastLink) {
        this.lastLink = lastLink;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }
}
