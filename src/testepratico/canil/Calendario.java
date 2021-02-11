/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testepratico.canil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Calendario {

    public int VerificarData() {
        Locale Brasil = new Locale("pt", "BR"); //Retorna do país e a língua
        int retornaFimds = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ola! Digite a data no formato Dia/Mês/Ano: ");
            String date = scanner.next();
            Calendar data = Calendar.getInstance();
            SimpleDateFormat simpleFormat = new SimpleDateFormat("dd/MM/yyyy", Brasil);

            data.setTime(simpleFormat.parse(date));

            retornaFimds = checaFimDS(data);

        } catch (ParseException e) {
            System.out.println(" Data incorreta ");
            // retorna 0 para erro na semana, ou seja data incorreta
            retornaFimds = 0;
        }
        return retornaFimds;
    }

    public int checaFimDS(Calendar data) {
        // se for domingo
        if ((data.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) || (data.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)) {
            return 1;
        } else {
        // se for dia de semana
            return 2;
        }
    }
}
