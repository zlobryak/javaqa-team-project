package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameStoreTest {
    GameStore store = new GameStore();

    @Test
    public void shouldAddGame() {
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    @Test
    void addPlayTime() {
        store.addPlayTime("Player1", 100);
    }

    @Test
    void getMostPlayer() {
        store.addPlayTime("Player1", 100);
        store.addPlayTime("Player2", 200);
        store.addPlayTime("Player3", 300);

        Assertions.assertEquals("Player3", store.getMostPlayer());
    }

    @Test
    void getSumPlayedTime() {
        store.addPlayTime("Player1", 100);
        store.addPlayTime("Player2", 200);
        store.addPlayTime("Player3", 300);
        Assertions.assertEquals(300 + 200 + 100, store.getSumPlayedTime());
    }

    @Test
    void name() {

    }
}
