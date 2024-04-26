package ru.rusguardian.bot;

public class Examinator {
    Question quest;
    int i = 0;
    int k = 0;


    public Question action(Storage storage){
        this.quest = storage.array[k];
        return quest;
    }

    public Boolean check(String answer){

        return quest.answer.equals(answer);
    }

    public String result(Storage storage){
        return "Всего вопросов: " + storage.array.length + "\nКоличество верных: " + i;
    }
}