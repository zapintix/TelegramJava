package ru.rusguardian.bot;

public class Learner{
    Question quest;

    public Question action(Storage storage){
        this.quest = storage.getRandQuote();
        return quest;
    }

    public Boolean check(String answer){
        return quest.rightAnswer.equals(answer);
    }

    public String end(String answer) {
        if (check(answer)) {
            return "Молодец";
        }
        else {
            return "Дурак";
        }
    }
}