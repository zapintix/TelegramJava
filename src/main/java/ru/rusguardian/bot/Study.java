package ru.rusguardian.bot;

public class Study {
    Question quest;

    public Question action(Storage storage){

        this.quest = storage.getRandQuote();
        return quest;
    }


    public String end(String answer) {
        return "Верный ответ: " + quest.answer + "\nВаш ответ: " + answer;
    }

}
