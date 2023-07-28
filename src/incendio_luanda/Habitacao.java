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
public class Habitacao {
    private String numero_casa;
    private String municipio;
    private String bairro;
    private String rua;
    private String hora;
    
    public Habitacao() {}

    
    public Habitacao(String numero_casa, String municipio, String bairro, String rua, String hora) {
        this.numero_casa = numero_casa;
        this.municipio = municipio;
        this.bairro = bairro;
        this.rua = rua;
        this.hora = hora;
    }

    public String getNumero_casa() {
        return numero_casa;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public String getHora() {
        return hora;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "\nHabitacao[" + " Numero_casa: " + numero_casa + ", Municipio: " + municipio + ", Bairro: " + bairro + ", Rua: " + rua + ",  Hora: " + hora + ']';
    }
    
    
}
