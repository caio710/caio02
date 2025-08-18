package org.example;

public class main {
    public static void main(String[] args) {

       cliente c1 = new cliente();
       Produto p1 = new Produto();

       c1.setNome("marta");
       c1.setIdade(25);


       System.out.println("Nome:"+ c1.getNome());
       System.out.println("Idade"+ c1.getIdade());

    }
}



