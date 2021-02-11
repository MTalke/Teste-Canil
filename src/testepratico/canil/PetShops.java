/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepratico.canil;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PetShops {

    private int Qtd_CachorroPeq;
    private int Qtd_CachorroGrand;

    public int getQtd_CachorroPeq() {
        return Qtd_CachorroPeq;
    }

    public void setQtd_CachorroPeq(int Qtd_CachorroPeq) {
        this.Qtd_CachorroPeq = Qtd_CachorroPeq;
    }

    public int getQtd_CachorroGrand() {
        return Qtd_CachorroGrand;
    }

    public void setQtd_CachorroGrand(int Qtd_CachorroGrand) {
        this.Qtd_CachorroGrand = Qtd_CachorroGrand;
    }


    public int quantidadeAnimais(int Fds) {
        if (Fds != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite quantidade de cachorros pequenos: ");
            int CachorroPeq = scanner.nextInt();
            setQtd_CachorroPeq(CachorroPeq);
            System.out.print("Digite quantidade de cachorros grandes: ");
            int CachorroGrand = scanner.nextInt();
            setQtd_CachorroGrand(CachorroGrand);
        }
        return Fds;

    }
    //função responsável por dizer qual é o petshop com menor custo
    public void MelhorOpcao(float op1, float op2, float op3) {
        float opcao;
        opcao = op1;
        String petshop = "Meu Canino Feliz";
        
        if ((op1 == op2) && (op1 == op3)) {
            opcao = op3;
            petshop = "ChowChagas";

        } else if (op1 == op2) {

            if (op2 < op3) {
                opcao = op2;
                petshop = "Vai Rex";
            } else {
                opcao = op3;
                petshop = "ChowChagas";
            }

        } else if (op1 == op3) {

            if (op3 < op2) {
                opcao = op3;
                petshop = "ChowChagas";
            } else {
                opcao = op2;
                petshop = "Vai Rex";
            }
        } else if ((op2 == op3)) {

            if (op3 < op1) {
                opcao = op3;
                petshop = "ChowChagas";
            } else {
                opcao = op1;
                petshop = "Meu Canino Feliz";
            }

        } else if (op2 < opcao) {
            opcao = op2;
            petshop = "Vai Rex";
        } if (op3 < opcao) {
            petshop = "ChowChagas";
            opcao = op3;
        }

        System.out.println("O melhor petshop para levar os cães é o " + petshop);
        System.out.println("O preco total é de: R$" + opcao);

    }

}
