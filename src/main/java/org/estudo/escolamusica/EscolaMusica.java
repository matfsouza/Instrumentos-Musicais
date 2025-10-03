package org.estudo.escolamusica;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaMusica {

    public static void main(String[] args) {
        // Configura a saída do console para aceitar caracteres especiais (acentos)
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        System.out.println("Iniciando a Orquestra...");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];
        banda[0] = new ViolaoExercicio("Violão Clássico", "Madeira", 6);
        banda[1] = new PianoExercicio("Piano de Cauda", "Madeira e Metal", 88);
        banda[2] = new BateriaExercicio("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new SaxofoneExercicio("Saxofone", "Latão", "Alto");

        EscolaMusica escola = new EscolaMusica();

        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda);
    }

    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("\n--- A ORQUESTRA VAI COMEÇAR ---");

        System.out.println("\n--- Afinação dos Instrumentos ----");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }
        System.out.println();

        System.out.println("--- Instrumentos começaram a tocar ---");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }
        System.out.println();

        System.out.println("---- Mostrando informações dos Instrumentos ----");
        for (int i = 0; i < banda.length; i++) {
            System.out.println("Instrumento musical " + (i + 1) + ":");
            banda[i].mostrarInformacoes();
            System.out.println();
        }
    }

    public void contarInstrumentosPorTipo(InstrumentoMusical[] instrumentos) {
        System.out.println("\n--- Estatísticas da Orquestra ---");

        int violoes = 0, pianos = 0, baterias = 0, saxofones = 0, outros = 0;

        for (InstrumentoMusical instrumento : instrumentos) {
            if (instrumento instanceof ViolaoExercicio) {
                violoes++;
            } else if (instrumento instanceof PianoExercicio) {
                pianos++;
            } else if (instrumento instanceof BateriaExercicio) {
                baterias++;
            } else if (instrumento instanceof SaxofoneExercicio) {
                saxofones++;
            } else {
                outros++;
            }
        }

        System.out.println("Total de instrumentos: " + instrumentos.length);
        System.out.println("Violões: " + violoes);
        System.out.println("Pianos: " + pianos);
        System.out.println("Baterias: " + baterias);
        System.out.println("Saxofones: " + saxofones);
        System.out.println("Outros: " + outros);
    }
}