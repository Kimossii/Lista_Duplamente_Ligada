/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incendio_luanda;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Eluck L Kimossi
 */
public class Incendio_Luanda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
        //System.out.println(bomb);
       // System.out.println("\n "+incendios_graves);
        /////gyegfyrhujcmkd
        Lista_Duplamente_Ligada td = new Lista_Duplamente_Ligada();
         Scanner teclado = new Scanner(System.in);
         
          int opcao;
                  
        do {
            Menu();
            System.out.print("Digite a Opção: ");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1: { 
                    System.out.println("Digita o nome: ");
                    teclado.nextLine();
                    String nome = teclado.nextLine();
                    System.out.println("Digita o Sexo: ");
                    String sexo = teclado.nextLine();
                    
                    System.out.println("Digita o numero da Casa: ");
                    String casa = teclado.nextLine();
                    System.out.println("Digita o Munícipio: ");
                    String municipio = teclado.nextLine();
                    System.out.println("Digita o Bairro: ");
                    String bairro = teclado.nextLine();
                    System.out.println("Digita a Rua: ");
                    String rua = teclado.nextLine();
                    System.out.println("Digita a hora da ocorrência");
                    String hora = teclado.nextLine();
                    System.out.println("Digita o valor Perdido");
                    float valor = teclado.nextFloat();
                   Proprietario prop = new Proprietario(nome,sexo,casa, municipio, bairro, rua,hora,valor); 
                    
                    System.out.println("Digita o nome da Instituição de Bombeiros: ");
                    teclado.nextLine();
                    String nome_Inst = teclado.nextLine();
                    System.out.println("Digita a equipa a intervir: ");
                    String equipa = teclado.nextLine();
                    
                    Registro_Bombeiro bomb = (new Registro_Bombeiro(nome_Inst,equipa, prop));
                    td.addUltimo(bomb);
                    break;
                }
                
                case 2:{
                    System.out.println("Digita o nome: ");
                    teclado.nextLine();
                    String nome2 = teclado.nextLine();
                    System.out.println("Digita o Sexo: ");
                    String sexo2 = teclado.nextLine();
                    
                    System.out.println("Digita o numero da Casa: ");
                    String casa2 = teclado.nextLine();
                    System.out.println("Digita o Munícipio: ");
                    String municipio2 = teclado.nextLine();
                    System.out.println("Digita o Bairro: ");
                    String bairro2 = teclado.nextLine();
                    System.out.println("Digita a Rua: ");
                    String rua2 = teclado.nextLine();
                    System.out.println("Digita a hora da ocorrência");
                    String hora2 = teclado.nextLine();
                    
                    System.out.println("Digita o valor Perdido");
                    float valor2 = teclado.nextFloat();
                   Proprietario prop2 = new Proprietario(nome2,sexo2,casa2, municipio2, bairro2, rua2,hora2,valor2); 
                    
                    System.out.println("Digita o nome da Instituição de Bombeiros: ");
                    teclado.nextLine();
                    String nome_Inst2 = teclado.nextLine();
                    System.out.println("Digita a equipa a intervir: ");
                    String equipa2 = teclado.nextLine();
                    
                    Registro_Bombeiro bomb2 = (new Registro_Bombeiro(nome_Inst2,equipa2, prop2,true));
                td.addInicio(bomb2);
                    break;
                }
                
                case 3:{
                
                    System.out.println(td.toStringProprietario());
                    break;
                }
                case 4:{
                    System.out.println("Total Valor Perdido: "+td.perda());
                
                    break;
                }
                case 5: {
                    if(td.estaVAzia()){
                        System.out.println("Lista Vazia");
                    }else{
                        System.out.println(td); 
                    }
                    
                   
                   
                    break;
                }
                case 6:{
                    System.out.println(td + "\n");
                    System.out.println("Digita o proprietário que pretende remover: ");
                    teclado.nextLine();
                    String nome=teclado.nextLine();
                    td.remove(nome);
                break;
                }
                
        case 7: {
                    System.out.println("Saindo do programa!!!");
                    break;
                }
                
           default: {
                   
                System.out.println("Opção inválida! ");
                    break;
                }     
        
          }
                
        } while (opcao != 7);
        
        System.out.println(td);
    }
   
    public static void Menu() {
        System.out.println("----------- MENU -------------");
        System.out.println("[1] -Registar Incendios normais");
        System.out.println("[2] -Registar Incendios graves");
        System.out.println("[3] -Mostrar Quantidade de Vítimas");
        System.out.println("[4] -Mostrar o valor Total de Perda ");
        System.out.println("[5] -Mostrar Todos os Dados");
        System.out.println("[6] -Remover Incendio ");
        System.out.println("[7] -Sair");
    }
    
}
