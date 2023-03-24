package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    void publishGame() {
    }

    @Test
    void containsGame() {
    }

    @Test
    void addPlayTime() {
    }

    @Test
    void getMostPlayer() {
    }

    @Test
    void getSumPlayedTime() {
    }

    // другие ваши тесты
}
