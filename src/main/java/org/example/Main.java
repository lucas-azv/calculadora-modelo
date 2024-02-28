package org.example;

public class Main {
    public static void main(String[] args) {
        
        //padrao AAA: comportamento somar da classe Calculadora
        //Arrange: instanciar os obj e definir o cenario de teste
        Calculadora c = new Calculadora();
        //entradas
        int num1 = 7;
        int num2 = 2;

        //saída
        int resultadoEsperado = 9;

        //Act: executar o metodo
        int resultadoObtido = c.somar(num1, num2);

        //Assert: verificar se o resultado obtido é igual ao resultado esperado
        System.out.println(resultadoObtido);
    }
}
