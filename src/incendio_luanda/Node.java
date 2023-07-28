/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incendio_luanda;

/**
 *
 * @author Eluck L Kimossi
 */
public class Node {
    public Registro_Bombeiro bomb;
    public  Node proximo;
    public Node anterior;

    public Node() {
    }

    public Node(Registro_Bombeiro bomb) {
        this.bomb = bomb;
    }

    public Registro_Bombeiro getBomb() {
        return bomb;
    }

    public Node getProximo() {
        return proximo;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setBomb(Registro_Bombeiro bomb) {
        this.bomb = bomb;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    
    
    
    
}
