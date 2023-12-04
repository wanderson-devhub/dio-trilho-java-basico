package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as em uma lista. Após isto,
 * calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média, e em que mês elas
 * ocorreram (mostrar o mês por extenso: 1 - Janeiro. 2- Fevereiro e etc).
 */
public class Exer01 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Double> temperaturaSemestral = new ArrayList<Double>();

        Double soma = 0.0;
        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a temperatura " + (i + 1) + ": ");
            double temp = 0.0;
            temp = random.nextDouble(40);
            temperaturaSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturaSemestral = soma / temperaturaSemestral.size();
        System.out.println("Valores informados: " + temperaturaSemestral);
        System.out.println("A media de temperatura semestral: " + mediaTemperaturaSemestral);
        System.out.println("-------------------------");

        for (Double temp : temperaturaSemestral) {
            if (temp > mediaTemperaturaSemestral) {
                int index = temperaturaSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " ºC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + " ºC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp + " ºC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp + " ºC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp + " ºC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp + " ºC");
                        break;
                }
            }
        }
    }
}
