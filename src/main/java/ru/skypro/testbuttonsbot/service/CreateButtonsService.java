package ru.skypro.testbuttonsbot.service;

import com.pengrad.telegrambot.model.request.InlineKeyboardButton;
import com.pengrad.telegrambot.model.request.InlineKeyboardMarkup;
import org.springframework.stereotype.Service;

@Service
public class CreateButtonsService {

    public InlineKeyboardMarkup mainMenu () {
        InlineKeyboardMarkup mainMenu = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Menu1");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Menu2");
        InlineKeyboardButton button3 = new InlineKeyboardButton("Menu3");
        button1.callbackData("/menu1");
        button2.callbackData("/menu2");
        button3.callbackData("/menu3");
        mainMenu.addRow(button1);
        mainMenu.addRow(button2);
        mainMenu.addRow(button3);
        return mainMenu;

    }
    public InlineKeyboardMarkup menu1 () {
        InlineKeyboardMarkup menu1 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("SubMenu-1 of Menu-1");
        InlineKeyboardButton button2 = new InlineKeyboardButton("SubMenu-2 of Menu-1");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        button1.callbackData("/subMenu1OfMenu1");
        button2.callbackData("/subMenu2OfMenu1");
        backButton.callbackData("/mainMenu");
        menu1.addRow(button1);
        menu1.addRow(button2);
        menu1.addRow(backButton);
        return menu1;
    }

    public InlineKeyboardMarkup subMenu1OfMenu1 () {
        InlineKeyboardMarkup subMenu1OfMenu1 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-1");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-2");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext1");
        button2.callbackData("/infotext2");
        backButton.callbackData("/menu1");
        mainMenuButton.callbackData("/mainMenu");
        subMenu1OfMenu1.addRow(button1);
        subMenu1OfMenu1.addRow(button2);
        subMenu1OfMenu1.addRow(backButton);
        subMenu1OfMenu1.addRow(mainMenuButton);
        return subMenu1OfMenu1;
    }

    public InlineKeyboardMarkup subMenu2OfMenu1 () {
        InlineKeyboardMarkup subMenu2OfMenu1 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-3");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-4");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext3");
        button2.callbackData("/infotext4");
        backButton.callbackData("/menu1");
        mainMenuButton.callbackData("/mainMenu");
        subMenu2OfMenu1.addRow(button1);
        subMenu2OfMenu1.addRow(button2);
        subMenu2OfMenu1.addRow(backButton);
        subMenu2OfMenu1.addRow(mainMenuButton);
        return subMenu2OfMenu1;
    }


    public InlineKeyboardMarkup menu2 () {
        InlineKeyboardMarkup menu2 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("SubMenu-1 of Menu-2");
        InlineKeyboardButton button2 = new InlineKeyboardButton("SubMenu-2 of Menu-2");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        button1.callbackData("/subMenu1OfMenu2");
        button2.callbackData("/subMenu2OfMenu2");
        backButton.callbackData("/mainMenu");
        menu2.addRow(button1);
        menu2.addRow(button2);
        menu2.addRow(backButton);
        return menu2;
    }

    public InlineKeyboardMarkup subMenu1OfMenu2 () {
        InlineKeyboardMarkup subMenu1OfMenu2 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-5");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-6");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext5");
        button2.callbackData("/infotext6");
        backButton.callbackData("/menu2");
        mainMenuButton.callbackData("/mainMenu");
        subMenu1OfMenu2.addRow(button1);
        subMenu1OfMenu2.addRow(button2);
        subMenu1OfMenu2.addRow(backButton);
        subMenu1OfMenu2.addRow(mainMenuButton);
        return subMenu1OfMenu2;
    }

    public InlineKeyboardMarkup subMenu2OfMenu2 () {
        InlineKeyboardMarkup subMenu2OfMenu2 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-7");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-8");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext7");
        button2.callbackData("/infotext8");
        backButton.callbackData("/menu2");
        mainMenuButton.callbackData("/mainMenu");
        subMenu2OfMenu2.addRow(button1);
        subMenu2OfMenu2.addRow(button2);
        subMenu2OfMenu2.addRow(backButton);
        subMenu2OfMenu2.addRow(mainMenuButton);
        return subMenu2OfMenu2;
    }

    public InlineKeyboardMarkup menu3 () {
        InlineKeyboardMarkup menu3 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("SubMenu-1 of Menu-3");
        InlineKeyboardButton button2 = new InlineKeyboardButton("SubMenu-2 of Menu-3");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        button1.callbackData("/subMenu1OfMenu3");
        button2.callbackData("/subMenu2OfMenu3");
        backButton.callbackData("/menu2");
        menu3.addRow(button1);
        menu3.addRow(button2);
        menu3.addRow(backButton);
        return menu3;
    }

    public InlineKeyboardMarkup subMenu1OfMenu3 () {
        InlineKeyboardMarkup subMenu1OfMenu3 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-9");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-10");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext9");
        button2.callbackData("/infotext10");
        backButton.callbackData("/menu2");
        mainMenuButton.callbackData("/mainMenu");
        subMenu1OfMenu3.addRow(button1);
        subMenu1OfMenu3.addRow(button2);
        subMenu1OfMenu3.addRow(backButton);
        subMenu1OfMenu3.addRow(mainMenuButton);
        return subMenu1OfMenu3;
    }
    public InlineKeyboardMarkup subMenu2OfMenu3 () {
        InlineKeyboardMarkup subMenu2OfMenu3 = new InlineKeyboardMarkup();
        InlineKeyboardButton button1 = new InlineKeyboardButton("Infotext-11");
        InlineKeyboardButton button2 = new InlineKeyboardButton("Infotext-12");
        InlineKeyboardButton backButton = new InlineKeyboardButton("Back");
        InlineKeyboardButton mainMenuButton = new InlineKeyboardButton("Main Menu");
        button1.callbackData("/infotext11");
        button2.callbackData("/infotext12");
        backButton.callbackData("/menu2");
        mainMenuButton.callbackData("/mainMenu");
        subMenu2OfMenu3.addRow(button1);
        subMenu2OfMenu3.addRow(button2);
        subMenu2OfMenu3.addRow(backButton);
        subMenu2OfMenu3.addRow(mainMenuButton);
        return subMenu2OfMenu3;
    }
}
