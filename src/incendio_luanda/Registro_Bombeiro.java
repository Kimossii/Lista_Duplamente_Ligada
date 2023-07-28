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
public class Registro_Bombeiro {
    private String nome_Inst;
    private String equipa_Bombeiro;
    public Proprietario prop;
    private boolean cituacao_grave;

    public Registro_Bombeiro() {}

    public Registro_Bombeiro(String nome_Inst, String equipa_Bombeiro,Proprietario prop) {
        this.nome_Inst = nome_Inst;
        this.equipa_Bombeiro = equipa_Bombeiro;
        this.prop = prop;
    }

    
    public Registro_Bombeiro(String nome_Inst, String equipa_Bombeiro, Proprietario prop,boolean cituacao_grave) {
        this.nome_Inst = nome_Inst;
        this.equipa_Bombeiro = equipa_Bombeiro;
        this.prop = prop;
        this.cituacao_grave = cituacao_grave;
    }
    

    public String getNome_Inst() {
        return nome_Inst;
    }

    public String getEquipa_Bombeiro() {
        return equipa_Bombeiro;
    }

    public Proprietario getProp() {
        return prop;
    }

    public boolean isCituacao_grave() {
        return cituacao_grave;
    }

    
    @Override
    public String toString() {
        return "\nRegistro de Incendio[ "+"\n" + prop +"\nRegistro_Bombeiro[" +" Nome_Inst: " + nome_Inst + ", Equipa_Bombeiro: " + equipa_Bombeiro  + ']';
    }
    
    
    
    
}
