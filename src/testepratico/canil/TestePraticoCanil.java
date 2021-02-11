/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepratico.canil;

// importações das bibliotecas
import java.text.ParseException;

/**
 *
 * @author User
 */
public class TestePraticoCanil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        int retornoFds;
        float PetShop1 = 0;
        float PetShop2 = 0;
        float PetShop3 = 0;

        Calendario calendario = new Calendario();
        PetShops pet = new PetShops();
        retornoFds = pet.quantidadeAnimais(calendario.VerificarData());
        // caso a data seja 0 quer dizer que a semana está incorreta, ou seja data digitada errada.
        if (retornoFds != 0) {
            MeuCaninoFeliz meuCanino = new MeuCaninoFeliz();
            //calculando o preço para o petshop Meu Canino Feliz
            PetShop1 = meuCanino.Calcular_Preco(retornoFds, pet.getQtd_CachorroPeq(), pet.getQtd_CachorroGrand());

            VaiRex vaiRex = new VaiRex();
            //calculando o preço para o petshop VaiRex
            PetShop2 = vaiRex.Calcular_Preco(retornoFds, pet.getQtd_CachorroPeq(), pet.getQtd_CachorroGrand());
            
            ChowChawgas chowChawgas = new ChowChawgas();
            //calculando o preço para o petshop chowChawgas
            PetShop3 = chowChawgas.Calcular_Preco(retornoFds, pet.getQtd_CachorroPeq(), pet.getQtd_CachorroGrand());
            
            // os preços de cada petshop é passado para o método da classe petshop que escolhe qual é a melhor opção
            pet.MelhorOpcao(PetShop1, PetShop2, PetShop3);
        } else {
            System.out.println("Tente novamente colocando o dia/mês/ano corretos");
        }

    }

}
