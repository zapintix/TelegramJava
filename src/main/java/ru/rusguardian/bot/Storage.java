package ru.rusguardian.bot;

import java.util.Random;

public class Storage {
    Question[] array = {new Question("Ответьте на вопрос: Лучший язык в мире \nВарианты ответа: Русский, Python, Go", "Python"),
            new Question("Ответьте на вопрос: Как зовут самого красивого парня на свете? \nВарианты ответа: Антон, Дима, Илья, Никита", "Антон"),
            new Question("Ответьте на вопрос: Выберите лишнее \nВарианты ответа: Django, Flask, React", "React")
    };
    public Question getRandQuote() {
        Random random = new Random();
        int randomNum = random.nextInt(2);
        return array[randomNum];
    }
}