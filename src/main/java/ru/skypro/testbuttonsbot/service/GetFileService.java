package ru.skypro.testbuttonsbot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.File;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.PhotoSize;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.request.InputFile;
import com.pengrad.telegrambot.request.GetFile;
import com.pengrad.telegrambot.response.GetFileResponse;

import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.net.URL;



public class GetFileService {
    public void downloadPhotoFromBot(TelegramBot bot, Update update) {
        Message message = update.message();

        if (message.photo() != null && message.photo().length > 0) {
            String fileId = message.photo()[0].fileId();
            GetFileResponse getFileResponse = bot.execute(new GetFile(fileId));
            File file = getFileResponse.file();
            String fileUrl = bot.getFullFilePath(file);

            // Download the photo
            try {
                URL url = new URL(fileUrl);
                InputStream in = url.openStream();
                FileOutputStream out = new FileOutputStream("photo.jpg");

                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                in.close();
                out.close();

                System.out.println("Photo downloaded successfully: photo.jpg");
            } catch (IOException e) {
                System.out.println("Error downloading photo: " + e.getMessage());
            }
        } else {
            System.out.println("No photo found in the message.");
        }
    }


}

