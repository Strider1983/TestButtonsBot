package ru.skypro.testbuttonsbot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TelegramBotSender {

    private final TelegramBot telegramBot;

    public TelegramBotSender(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public void send(Long chatId, String message) {
        SendResponse response = telegramBot.execute(new SendMessage(chatId, message));


    }
    public void sendInfoText(Long chatId, String infoText) {
        Map<String, String> infoTexts = new HashMap<>();
        infoTexts.put("/infotext1", Infotext.INFOTEXT1.getText());
        infoTexts.put("/infotext2", Infotext.INFOTEXT2.getText());
        infoTexts.put("/infotext3", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext4", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext5", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext6", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext7", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext8", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext9", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext10", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext11", Infotext.INFOTEXT3.getText());
        infoTexts.put("/infotext12", Infotext.INFOTEXT3.getText());

        String infoTextMessage = infoTexts.get(infoText);
        SendResponse response = telegramBot.execute(new SendMessage(chatId, infoTextMessage));

    }




}
