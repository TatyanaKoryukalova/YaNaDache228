package com.gmail.san666.yoshi.oopImplementsInterfaces;

public interface IdealCompany {
    /**
     *
     * @param newWorker
     * @param salary
     */
    void hirePerson(Worker newWorker, double salary);

    /**
     *Метод увольняет сотрудника (удалить элемент массива)
     * Т.е. необходимо создать новый массив
     * @param firedWorker
     */
    void firePerson(Worker firedWorker);

    /**
     *
     */
    void printAllStuffNames();

    /**
     * Печатает списком имена и возраст всех сотрудников компании
     */
    void printAllStuffNamesAndAge();
}
