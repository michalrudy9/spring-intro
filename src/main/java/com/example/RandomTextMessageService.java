package com.example;

import org.springframework.stereotype.Component;

import java.util.Random;


@Component("messageRandomService")
public class RandomTextMessageService implements MessageService
{
    private final String [] tab = {
            "Wadomość 1",
            "Wadomość 2",
            "Wadomość 3",
            "Wadomość 4",
            "Wadomość 5",
            "Wadomość 6",
            "Wadomość 7",
            "Wadomość 8",
            "Wadomość 9",
            "Wadomość 10"
    };

    @Override
    public String getMessage()
    {
        int randomNumber = new Random().nextInt(this.tab.length);
        return this.tab[randomNumber];
    }
}
