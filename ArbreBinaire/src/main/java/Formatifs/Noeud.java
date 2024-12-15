package Formatifs;

public class Noeud
{
    private int cle;
    private Noeud left;
    private Noeud right;

    public Noeud(int cle)
    {
        this.cle = cle;
    }

    public int getCle() {
        return cle;
    }

    public void setCle(int cle) {
        this.cle = cle;
    }

    public Noeud getLeft() {
        return left;
    }

    public void setLeft(Noeud left) {
        this.left = left;
    }

    public Noeud getRight() {
        return right;
    }

    public void setRight(Noeud right) {
        this.right = right;
    }
}
