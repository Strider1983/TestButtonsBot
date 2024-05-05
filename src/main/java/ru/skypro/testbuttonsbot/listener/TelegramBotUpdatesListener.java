package ru.skypro.testbuttonsbot.listener;

import com.pengrad.telegrambot.BotUtils;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.File;
import com.pengrad.telegrambot.model.PhotoSize;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.GetFile;
import com.pengrad.telegrambot.response.GetFileResponse;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.testbuttonsbot.model.ImagesFromTG;
import ru.skypro.testbuttonsbot.service.*;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;


@Service
public class TelegramBotUpdatesListener implements UpdatesListener {

    private final TelegramBot telegramBot;

    private final TelegramBotSender telegramBotSender;

    private final SendButtonsService buttonsService;
    private final CreateButtonsService buttonsList;



    public TelegramBotUpdatesListener(TelegramBot telegramBot, TelegramBotSender telegramBotSender, SendButtonsService buttonsService, CreateButtonsService buttonsList) {
        this.telegramBot = telegramBot;
        this.telegramBotSender = telegramBotSender;
        this.buttonsService = buttonsService;
        this.buttonsList = buttonsList;
    }

    @PostConstruct
    public void init() {
        telegramBot.setUpdatesListener(this);
    }



    @Override
    public int process(List<Update> updates) {
        updates.forEach(update -> {
            if (update.message() != null ) {
                if (update.message().text() != null && update.message().text().equals("/start")) {
                    String message = update.message().text();
                    Long chatId = update.message().chat().id();
                    telegramBotSender.send(chatId, "Wellcome");
                    buttonsService.sendMainMenu(chatId);
                } else if (update.message().photo() != null) {
                    Long chatId = update.message().chat().id();
                    String fileId = update.message().photo()[0].fileId();
                    GetFileResponse getFileResponse = telegramBot.execute(new GetFile(fileId));
                    File file = getFileResponse.file();
                    String fileUrl = telegramBot.getFullFilePath(file);
                    telegramBotSender.send(chatId, fileUrl);






                }

            } else if (update.callbackQuery() != null) {
                String buttonMessage = update.callbackQuery().data();
                Long chatId = update.callbackQuery().message().chat().id();
                

                switch (buttonMessage) {
                    case "/menu1":
                        buttonsService.sendMenu1(chatId);
                        break;
                    case "/menu2":
                        buttonsService.sendMenu2(chatId);
                        break;
                    case "/menu3":
                        buttonsService.sendMenu3(chatId);
                        break;
                    case "/mainMenu":
                        buttonsService.sendMainMenu(chatId);
                        break;
                    case "/subMenu1OfMenu1":
                        buttonsService.sendSubMenu1OfMenu1(chatId);
                        break;
                    case "/subMenu2OfMenu1":
                        buttonsService.sendSubMenu2OfMenu1(chatId);
                        break;
                    case "/subMenu1OfMenu2":
                        buttonsService.sendSubMenu1OfMenu2(chatId);
                        break;
                    case "/subMenu2OfMenu2":
                        buttonsService.sendSubMenu2OfMenu2(chatId);
                        break;
                    case "/subMenu1OfMenu3":
                        buttonsService.sendSubMenu1OfMenu3(chatId);
                        break;
                    case "/subMenu2OfMenu3":
                        buttonsService.sendSubMenu2OfMenu3(chatId);
                        break;
                    default:
                        telegramBotSender.sendInfoText(chatId, buttonMessage);
                }
            }
        });

        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }
}
