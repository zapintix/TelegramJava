package ru.rusguardian.bot;

import java.util.Random;

public class Storage {
    Question[] array = {
            new Question("Ответьте на вопрос: Лучший язык в мире", "Python", new String[]{"Go", "Русский", "Python"}),
            new Question("Ответьте на вопрос: Да?", "Да", new String[]{"Нет", "Да", "NO"}),
            new Question("Ответьте на вопрос: 1, 2 или 52?", "52", new String[]{"1", "2", "52"}),
    };
    public Question getRandQuote() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        return array[randomNum];
    }
}