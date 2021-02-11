/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepratico.canil;

/**
 *
 * @author Matheus Andrade Fernandes de Lima
 * email: matheus_afl@hotmail.com
 * 
 */
public class ChowChawgas {

    private float valor = 0;
    private float precoCachorroPeq = 30;
    private float precoCachorroGrand = 45;
    private float valorGrand = 0;
    private float valorPeq = 0;

    public float Calcular_Preco(int Fimds, int CachorroPeq, int CachorroGrand) {
        // se for igual a um que dizer que é final de semana

        if (Fimds == 1) {

            valorGrand = precoCachorroGrand * CachorroGrand;
            valorPeq = precoCachorroPeq * CachorroPeq;
            valor = valorGrand + valorPeq;

        } else if (Fimds == 2) { //se for igual a 2 quer dizer que é dia de semana
            valorGrand = precoCachorroGrand * CachorroGrand;
            valorPeq = precoCachorroPeq * CachorroPeq;
            valor = valorGrand + valorPeq;

        } else {
            System.out.println("Erro");
        }
        return valor;
    }

}
