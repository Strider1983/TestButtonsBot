package ru.skypro.testbuttonsbot.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.File;
import com.pengrad.telegrambot.request.GetFile;
import com.pengrad.telegrambot.response.GetFileResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE_NEW;


@Service

public class GetFileService {
    @Value("${path.to.photos.folder}")
    private String diskFilePath;
    private final int BUFFER_SIZE = 1024;

    TelegramBot telegramBot;

    public GetFileService(TelegramBot telegramBot) {
        this.telegramBot = telegramBot;
    }

    public String getFileUrl (String fileId) {
        GetFileResponse getFileResponse = telegramBot.execute(new GetFile(fileId));
        File file = getFileResponse.file();
        String fileUrl = telegramBot.getFullFilePath(file);
        String filePath = getFileResponse.file().filePath();
        try {
            byte[] pic = telegramBot.getFileContent(getFileResponse.file());
            String picture = pic.toString();
            return picture;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

