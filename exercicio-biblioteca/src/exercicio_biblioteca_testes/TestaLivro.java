package exercicio_biblioteca_testes;
import exercicio_biblioteca_dominio.Armario;
import exercicio_biblioteca_dominio.Prateleira;
import exercicio_biblioteca_dominio.Livro;
import exercicio_biblioteca_tela.Tela;

import java.util.Objects;
import java.util.Scanner;

public class TestaLivro {

    public static void main(String[] args) {

    //Instancia Armários, Prateleiras e Livros ----------------------------------------------------------------------------------------
    Armario[] armarios = new Armario[]{new Armario("A"), new Armario("B")};
    Prateleira[] prateleiras = new Prateleira[]{
            //Armário A
            new Prateleira(1, armarios[0]), new Prateleira(2, armarios[0]), new Prateleira(3, armarios[0]),
            //Armário B
            new Prateleira(1, armarios[1]), new Prateleira(2, armarios[1]), new Prateleira(3, armarios[1]), new Prateleira(4, armarios[1])};
    Livro[] livros = new Livro[]{
            //Armário A, Prateleira 1
            new Livro("A11", prateleiras[0]), new Livro("A12", prateleiras[0]), new Livro("A13", prateleiras[0]),
            //Armário A, Prateleira 2
            new Livro("A21", prateleiras[1]), new Livro("A22", prateleiras[1]), new Livro("A23", prateleiras[1]),
            //Armário A, Prateleira 3
            new Livro("A31", prateleiras[2]), new Livro("A32", prateleiras[2]), new Livro("A33", prateleiras[2]),
            //Armário B, Prateleira 1
            new Livro("B11", prateleiras[3]), new Livro("B12", prateleiras[3]), new Livro("B13", prateleiras[3]),
            //Armário B, Prateleira 2
            new Livro("B21", prateleiras[4]), new Livro("B22", prateleiras[4]), new Livro("B23", prateleiras[4]),
            //Armário B, Prateleira 3
            new Livro("B31", prateleiras[5]), new Livro("B32", prateleiras[5]), new Livro("B33", prateleiras[5]),
            //Armário B, Prateleira 4
            new Livro("B41", prateleiras[6]), new Livro("B42", prateleiras[6]), new Livro("B43", prateleiras[6])
    };
    //----------------------------------------------------------------------------------------------------------------------------------

/*
        for (Livro value : livros) {
            System.out.println("Livro: " + value.getCodigo() + " Prateleira: " + value.getPrateleira().getNumero() + " Armário: " + value.getPrateleira().getArmario().getNome() + " Status: " + value.isDisponivel());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Livro livro : livros) {
            if (Objects.equals(livro.getCodigo(), "A12") || Objects.equals(livro.getCodigo(), "B31") || Objects.equals(livro.getCodigo(), "B42")) {
                livro.setDisponivel(false);
            }
        }

        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getCodigo() + " Prateleira: " + livro.getPrateleira().getNumero() + " Armário: " + livro.getPrateleira().getArmario().getNome() + " Status: " + livro.isDisponivel());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------");

        for (Livro livro : livros) {
            if (Objects.equals(livro.isDisponivel(), false)){
                livro.setDisponivel(true);
            }
        }

        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getCodigo() + " Prateleira: " + livro.getPrateleira().getNumero() + " Armário: " + livro.getPrateleira().getArmario().getNome() + " Status: " + livro.isDisponivel());
        }

        System.out.println("---------------------------------------------------------------------------------------------------------"); */

        //Solicita input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um livro para obter informações: ");
        String livroPesquisado = scanner.next();

        for(Livro livro : livros){
            if(Objects.equals(livro.getCodigo(), livroPesquisado)){
                Tela tela = new Tela();
                tela.imprimeInfosLivro(livro);
            };
        }
    }
}

