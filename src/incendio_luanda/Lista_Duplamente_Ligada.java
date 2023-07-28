/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incendio_luanda;

import java.util.NoSuchElementException;

/**
 *
 * @author Eluck L Kimossi
 */
public class Lista_Duplamente_Ligada {
     private Node primeiro;
    private Node ultimo;
    private int tamanho;

    Lista_Duplamente_Ligada(){}
    
    public Lista_Duplamente_Ligada(Node primeiro, Node ultimo, int tamanho) {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public boolean estaVAzia() {
        return this.primeiro == null;
    }
    
    public void addInicio(Registro_Bombeiro registrar_bombeiro) {
         Node novoNode = new Node(registrar_bombeiro);

        if (estaVAzia()) {
            this.primeiro = novoNode;
            this.ultimo = novoNode;
        } else {
            novoNode.proximo = this.primeiro;
            this.primeiro.anterior = novoNode;
            this.primeiro = novoNode;
        }

        tamanho += 1;
    }
    
     public void addUltimo(Registro_Bombeiro registrar_bombeiro) {
        Node novoNode = new Node(registrar_bombeiro);

        if (estaVAzia()) {
            this.primeiro = novoNode;
            this.ultimo = novoNode;
        } else if (registrar_bombeiro.isCituacao_grave() == true) {
            addInicio(registrar_bombeiro);
        } else {
            this.ultimo.proximo = novoNode;
            novoNode.anterior = ultimo;
            this.ultimo = novoNode;
        }

        this.tamanho += 1;
    }
     
      public void add(int indice, Registro_Bombeiro registrar_bombeiro) {
        if (indice < 0 || indice > tamanho)
            throw new IndexOutOfBoundsException();

        Node novoNode = new Node(registrar_bombeiro);

        if (indice == 0) {
            this.addInicio(registrar_bombeiro);

        } else if (indice == tamanho - 1) {
            this.addUltimo(registrar_bombeiro);

        } else {
            Node ou = this.primeiro;

            for (int i = 0; i < indice - 1; i++)
                ou = ou.proximo;

            novoNode.proximo = ou.proximo;
            ou.proximo = novoNode;
            novoNode.proximo.anterior = novoNode;
            novoNode.anterior = ou;

            tamanho += 1;
        }
    }
      
      public Registro_Bombeiro get(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException();

         Node ou = this.primeiro;

        for (int i = 0; i < indice; i++)
            ou = ou.proximo;

        return ou.getBomb();
    }

       public Registro_Bombeiro removeInicio() {

        if (estaVAzia()){ throw new NoSuchElementException();}

        Registro_Bombeiro registrar_bombeiro = this.primeiro.getBomb();

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.primeiro = this.primeiro.proximo;
            this.primeiro.anterior = null;
        }

        tamanho -= 1;
        return registrar_bombeiro;
    } 
      
         public Registro_Bombeiro removeUltimo() {

        if (estaVAzia()) throw new NoSuchElementException();

        Registro_Bombeiro registrar_bombeiro = this.ultimo.getBomb();

        if (this.primeiro.proximo == null) {
            this.primeiro = null;
            this.ultimo = null;
        } else {
            this.ultimo = this.ultimo.anterior;
            this.ultimo.proximo = null;
        }

        tamanho -= 1;
        return registrar_bombeiro;

    }
         public Registro_Bombeiro remover(int indice) {
        if (indice < 0 || indice >= tamanho)
            throw new IndexOutOfBoundsException();

        if (indice == 0) return removeInicio();
        if (indice == tamanho - 1) return removeUltimo();

        Node ou = this.primeiro;
        for (int i = 0; i < indice; i++)
            ou = ou.proximo;

        ou.anterior.proximo = ou.proximo;
        ou.proximo.anterior = ou.anterior;
        tamanho -= 1;
        return ou.getBomb();
    }
         public boolean remove(String nome) {
         Node ou = this.primeiro;
        for (int i = 0; i < this.tamanho; i++) {
            if (ou.getBomb().getProp().getNome().equalsIgnoreCase(nome))
                 {
                if (i == 0) removeInicio();
                else if (i == tamanho - 1) removeUltimo();
                else {
                    try {
                        ou.anterior.proximo = ou.proximo;
                        ou.proximo.anterior = ou.anterior;
                    } catch (NullPointerException e) {

                    }
                    tamanho -= 1;
                }
                return true;
            }
            ou = ou.proximo;
        }

        return false;
    }
         
         public float perda(){
        float v =0;
        float total=0;
        Float sb = null;

        Node ocorre = primeiro;
        while (ocorre != null) {
            sb=ocorre.getBomb().getProp().getValor();
             total = sb;
            ocorre = ocorre.proximo;
             v+=total;
        }

        return v;
    }
         
          @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        Node ocorre = primeiro;
        while (ocorre != null) {
            sb.append(ocorre.getBomb() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }
    
     public String toStringProprietario() {
        StringBuilder sb = new StringBuilder();

        Node ocorre = primeiro;
        while (ocorre != null) {
            sb.append("Nome: "+ ocorre.getBomb().getProp().getNome()+", Sexo: "+ ocorre.getBomb().getProp().getSexo()+"\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }
     
     public String toStringAcintesGraves() {
        StringBuffer sb = new StringBuffer();

        Node ocorre = primeiro;
        while (ocorre != null) {
            if (ocorre.bomb.isCituacao_grave())
                sb.append(ocorre.getBomb() + "\n ");
            ocorre = ocorre.proximo;
        }

        return sb.toString();
    }
}
