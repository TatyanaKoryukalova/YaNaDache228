package com.gmail.san666.yoshi.oopImplementsInterfaces;

public interface Worker {
    /**
     * Позволяет установить значение поля companyName
     * при найме или увольнении сотрудника
     *
     * @param name - название компании
     */
    void setCompanyName(String name);

    /**
     * Позволяет установить значение поля salary работника
     *
     * @param salary - зарплата сотрудника
     */
    void setSalary(double salary);

    /**
     * Возвращает имя работника
     *
     * @return имя сотрудника
     */
    String getName();

    /**
     * Возвращает возраст сотрудника
     *
     * @return возраст сотрудника
     */
    int getAge();

    /**
     * Возвращает зарплату работника
     *
     * @return зарплата сотрудника
     */
    double getSalary();


    /**
     * Проверяет корректность устанавливаемой зарплаты
     *
     * @param salary - новая зарплата
     * @throws SalaryLessThanAgeException в случае
     *                                    если устанавливаемая зарплата меньше возраста
     */
    void salaryValidate(double salary);

    /**
     * Рассчитывает размер подоходного налога работника,
     * возвращает значение типа double
     * По умолчанию размер налога 13%
     *
     * @return размер подоходного налога для сотрудника
     */
    default double calculateIncomeTax() {
        return getSalary() * 0.13;
    }

    /**
     * Возвращает имя сотрудника
     */
    String printName();

    /**
     * Возвращает имя и возраст сотрудника
     */
    String printNameAndAge();
}
