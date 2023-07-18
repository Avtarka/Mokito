package ru.netology.Mokito;

public class Manager {
    //обьявить переменную типа массив длинной 0
    private String[] films = new String[0];
    //объявить переменную лимита показа фильмов
    private int limit;
    // объявить конструктор без параметров, выставляющий лимит менеджера в 5
    public Manager() {
        this.limit = 5;
    }
    // объявить конструктор с уточненными параметрами, берущий значение лимита для менеджера из параметра конструктора.
    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films; // вернуть массив
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp; // вернуть массив
    }
}
