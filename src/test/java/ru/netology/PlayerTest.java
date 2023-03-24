package ru.netology;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.exeptions.NoGameExeption;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);

        int expected = 3;
        int actual = player.sumGenre(game.getGenre());
        assertEquals(expected, actual);
    }

    @Test
    void timePlayed() { //Проверяю исключение
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game2 = store.publishGame("Game 2", "TestGenre2");
        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);
        Assertions.assertThrows(NoGameExeption.class, () -> {
            player.timePlayed(game2);
        });
    }

    @Test
    void timePlayedPositive() { // Позитивная проверка метода
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Player player = new Player("Petya");
        player.installGame(game);
        player.play(game, 3);
        assertEquals(3, player.timePlayed(game));
    }
    // другие ваши тесты
}
