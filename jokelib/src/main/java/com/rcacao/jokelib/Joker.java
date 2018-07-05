package com.rcacao.jokelib;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Random;

public class Joker {

    private ArrayList<String> piadas;

    public Joker() {

        piadas = new ArrayList<>();

        piadas.add("Fui almoçar ontem na casa de uma amiga.\n" +
                    "Quando terminamos de almoçar, ela me disse:\n" +
                    "-Fiz o almoço, agora a louca é sua.\n" +
                    "Peguei a louça, coloquei tudo em um saco plástico e fui embora.\n" +
                    "Agora a mulher tá aqui na frente de casa com a polícia" +
                    "querendo a louça de volta...");

        piadas.add("O bêbado atravessa a rua com o farol " +
                "fechado e um carro passa e buzina \"BIBI\"...\n" +
                "O bêbado olha para o carro e diz: \n" +
                "EU TAMBÉM BIBI E MUITO...");

        piadas.add("Joãozinho entra em casa esbaforido:\n" +
                "\n" +
                "- Mãe, mãe, me dá um real pra eu dar pro tio ali na rua!!\n" +
                "\n" +
                "Orgulhosa, ela dá o dinheiro ao filho e pergunta:\n" +
                "\n" +
                "- Pra qual tio você vai dar o dinheiro, meu anjo?\n" +
                "\n" +
                "- Pra aquele ali que está gritando \"Olha a pipoca quentinha!\"");

        piadas.add("Joãozinho chamou o pai no meio da noite e disse:\n" +
                "- Pai, tem muitos mosquitos no meu quarto!\n" +
                "- Apague a luz que eles vão embora, filhote! — diz o pai, carinhosamente.\n" +
                "Logo depois apareceu um vaga-lume. O menino chamou o pai outra vez:\n" +
                "- Pai,socorro! Agora os mosquitos estão vindo com lanternas!");

        piadas.add("O que são cinco pontinhos coloridos no jardim?\n\n" +
                "São os \"Flower Rangers\"!");



    }

    public String getPiada(){
        Random randomGenerator = new Random();
        int index = randomGenerator.nextInt(piadas.size());
        return piadas.get(index);
    }


}
