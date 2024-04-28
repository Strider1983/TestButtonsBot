package ru.skypro.testbuttonsbot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import org.springframework.stereotype.Component;

@Component
public class SendButtonsService {

    private final TelegramBot telegramBot;
    private final CreateButtonsService buttonsList;

    public SendButtonsService(TelegramBot telegramBot, CreateButtonsService buttonsList) {
        this.telegramBot = telegramBot;
        this.buttonsList = buttonsList;
    }

    public void sendMainMenu (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "Main Menu").replyMarkup(buttonsList.mainMenu()));
    }

    public void sendMenu1 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "Menu1").replyMarkup(buttonsList.menu1()));
    }

    public void sendMenu2 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "Menu2").replyMarkup(buttonsList.menu2()));
    }

    public void sendMenu3 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "Menu3").replyMarkup(buttonsList.menu3()));
    }
    public void sendSubMenu1OfMenu1 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-1 of Menu-1").replyMarkup(buttonsList.subMenu1OfMenu1()));
    }
    public void sendSubMenu2OfMenu1 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-2 of Menu-1").replyMarkup(buttonsList.subMenu2OfMenu1()));
    }
    public void sendSubMenu1OfMenu2 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-1 of Menu-2").replyMarkup(buttonsList.subMenu1OfMenu2()));
    }
    public void sendSubMenu2OfMenu2 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-2 of Menu-2").replyMarkup(buttonsList.subMenu2OfMenu2()));
    }
    public void sendSubMenu1OfMenu3 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-1 of Menu-3").replyMarkup(buttonsList.subMenu1OfMenu3()));
    }
    public void sendSubMenu2OfMenu3 (Long chatId) {
        SendResponse buttons = telegramBot.execute(new SendMessage(chatId, "SubMenu-2 of Menu-3").replyMarkup(buttonsList.subMenu2OfMenu3()));
    }


}
