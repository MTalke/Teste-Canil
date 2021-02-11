/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepratico.canil;

/**
 *
 * @author User
 */
public class MeuCaninoFeliz extends PetShops {

    private float valor = 0;
    private float precoCachorroPeq = 20;
    private float precoCachorroGrand = 40;
    private float valorGrand = 0;
    private float valorPeq = 0;

    // função que calcula o preço
    public float Calcular_Preco(int Fimds, int CachorroPeq, int CachorroGrand) {

        if (Fimds == 1) {

            valorGrand = porcentagem(precoCachorroGrand) * CachorroGrand;
            valorPeq = porcentagem(precoCachorroPeq) * CachorroPeq;
            valor = valorGrand + valorPeq;

        } else if (Fimds == 2) {
            valorGrand = precoCachorroGrand * CachorroGrand;
            valorPeq = precoCachorroPeq * CachorroPeq;
            valor = valorGrand + valorPeq;

        } else {
            System.out.println("Erro");
        }
        return valor;
    }

    // calculo dos 20% do preço do meu Canino Feliz
    private float porcentagem(float precoCachorro) {
        float resultado;
        resultado = (float) (precoCachorro * 0.2);
        resultado = precoCachorro + resultado;
        return resultado;
    }

}
