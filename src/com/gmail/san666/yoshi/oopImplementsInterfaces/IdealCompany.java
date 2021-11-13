package com.gmail.san666.yoshi.oopImplementsInterfaces;

public interface IdealCompany {
    /**
     * Позволяет нанять нового сотрудника
     * Т.е. добавляет в массив новый элемент     *
     *
     * @param newWorker новый сотрудник, элемент типа Worker
     * @param salary зарплана нового сотрудника
     */
    void hirePerson(Worker newWorker, double salary);

    /**
     * Позволяет увольняет сотрудника (удалить элемент массива)
     *
     * @param firedWorker сотрудник, которого увольняем
     */
    void firePerson(Worker firedWorker);

    /**
     * Выводит список имен всех сотрудников
     */
    void printAllStuffNames();

    /**
     * Печатает списком имена и возраст всех сотрудников компании
     */
    void printAllStuffNamesAndAge();
}
