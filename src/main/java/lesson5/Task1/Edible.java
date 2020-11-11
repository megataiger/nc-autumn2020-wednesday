package lesson5.Task1;

/**
 * Интерфейс, который помечает объект как съедобный
 */

public interface Edible {
    /**
     * Метод для употребления в пищу объекта
     * @return число колорий, полученных после употребления
     */
    int eat();
}