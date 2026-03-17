package com.input.app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(new Locale("US"));

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Informe sua altura: ");
        double altura = sc.nextDouble();

        sc.nextLine();
        System.out.println("Informe seu e-mail: ");
        String email = sc.nextLine();

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
        System.out.println("Email: "+email);
        sc.close();
    }
}
