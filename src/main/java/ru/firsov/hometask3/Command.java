package ru.firsov.hometask3;

public enum Command {
    // какие у студента курсы
    STUDENTS_COURSES("/stcourse"),

    // какие студенты записаны на курс
    COURSE_STUDENTS("/coursest"),

    // удалить студента
    DELETE_ST("/delst"),

    // удалить курс
    DELETE_COURSE("/delco");

    public String getText() {
        return text;
    }

    private String text;

    Command(String s) {
        text = s;
    }
}
