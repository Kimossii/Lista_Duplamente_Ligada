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
public class Proprietario extends Habitacao{
    private String nome;
    private String sexo;
    private float valor;

    public Proprietario() {}

    public Proprietario(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public Proprietario(String nome, String sexo, String numero_casa, String municipio, String bairro, String rua, String hora, float valor) {
        super(numero_casa, municipio, bairro, rua, hora);
        this.nome = nome;
        this.sexo = sexo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public float getValor() {
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Proprietario[ " + "Nome: " + nome + ", Sexo: " + sexo +" ]"+super.toString()+ "\n Valor Perdido" +valor;
    }

    
    
    
    
    
}
