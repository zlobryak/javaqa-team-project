package ru.netology.exeptions;
public class NoGameExeption extends RuntimeException {
    public NoGameExeption(String message) {
        super(message);
    }
}
