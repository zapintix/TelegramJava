package ru.rusguardian.bot;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class QuestionKeyboard {

    public InlineKeyboardMarkup setQuestions(String[] answers) {
        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        for (String answer : answers) {
            rowInline.add(InlineKeyboardButton.builder().text(answer).callbackData(answer).build());
        }
        rowsInline.add(rowInline);
        inlineKeyboardMarkup.setKeyboard(rowsInline);
        return inlineKeyboardMarkup;
    }
     public InlineKeyboardMarkup setInit(){
         InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
         List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
         List<InlineKeyboardButton> rowInline = new ArrayList<>();

         rowInline.add(InlineKeyboardButton.builder().text("exam").callbackData("/exam").build());
         rowInline.add(InlineKeyboardButton.builder().text("study").callbackData("/study").build());
         rowInline.add(InlineKeyboardButton.builder().text("learn").callbackData("/learn").build());

         rowsInline.add(rowInline);
         inlineKeyboardMarkup.setKeyboard(rowsInline);
         return inlineKeyboardMarkup;
    }
}
