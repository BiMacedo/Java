package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class TreinoFuncional {
    private ArrayList<exercicios> exercicios;
    private int tamanho;

    public TreinoFuncional() {
        exercicios = new ArrayList<>();
        tamanho = 0;
    }

    public void adicionar(exercicios exercicio) {
        exercicios.add(exercicio);
        tamanho++;
        System.out.println("Exercício adicionado: " + exercicio.getNome());
    }

    public exercicios proximo() {
        if (tamanho == 0) {
            System.out.println("Não há exercícios restantes.");
            return null;
        } else {
            exercicios proximoExercicio = exercicios.remove(0);
            tamanho--;
            System.out.println("Iniciando próximo exercício: " + proximoExercicio.getNome());
            return proximoExercicio;
        }
    }

    public void exibir() {
        System.out.println("Exercícios restantes:");
        for (exercicios exercicio : exercicios) {
            System.out.println("Nome: " + exercicio.getNome() + ", Repetições: " + exercicio.getRepeticoes());
        }
    }
  }