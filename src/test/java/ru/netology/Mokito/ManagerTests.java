package ru.netology.Mokito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTests {
    @Test
    public void addFilm() {
        Manager manager = new Manager();
        manager.addFilm("Film №1");
        manager.addFilm("Film №2");
        manager.addFilm("Film №3");

        String[] actual = manager.findAll();
        String[] expected = {"Film №1", "Film №2", "Film №3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFilmIfEmpty() {
        Manager manager = new Manager();

        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {
        Manager manager = new Manager();
        manager.addFilm("Film №1");

        String[] actual = manager.findAll();
        String[] expected = {"Film №1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilm() {
        Manager manager = new Manager();
        manager.addFilm("Film №1");
        manager.addFilm("Film №2");
        manager.addFilm("Film №3");

        String[] actual = manager.findLast();
        String[] expected = {"Film №3", "Film №2", "Film №1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmIfSix() {
        Manager manager = new Manager(6);
        manager.addFilm("Film №1");
        manager.addFilm("Film №2");
        manager.addFilm("Film №3");
        manager.addFilm("Film №4");
        manager.addFilm("Film №5");
        manager.addFilm("Film №6");

        String[] actual = manager.findLast();
        String[] expected = {"Film №6", "Film №5", "Film №4", "Film №3", "Film №2", "Film №1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showLastFilmDefault() {
        Manager manager = new Manager();

        manager.addFilm("Film №1");
        manager.addFilm("Film №2");
        manager.addFilm("Film №3");
        manager.addFilm("Film №4");
        manager.addFilm("Film №5");
        manager.addFilm("Film №6");
        manager.addFilm("Film №7");
        manager.addFilm("Film №8");
        manager.addFilm("Film №9");

        String[] expected = {"Film №9", "Film №8", "Film №7", "Film №6", "Film №5"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
