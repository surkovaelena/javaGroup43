package les_20;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ///создать коллек и заполнить начальное значения
        ArrayList<Integer> numbers =new ArrayList<Integer>();
        numbers.add(11);
        numbers.add(22);
        numbers.add(33);
        System.out.println("1.Состояние колл-цииArrayList "+ numbers);
        System.out.println();

        //метод add  указать индекс 0 и положить 99 тогда произойдет сдвиг всех значений
        // на один вправо
        numbers.add(0,99);
        System.out.println("2. Cостояние кол-ции " +numbers);
        System.out.println();
// метод add указать индекс 2 и положить 99 тогда произо сдвиг от индекса 2
// всех значений на один индекс вправо
        numbers.add(2,99);
        System.out.println("3. Cостояние кол-ции " +numbers);
        System.out.println();
        //4 метод set  указать индекс 2 и положить 88 тогда произ затирание 99 на 88
        numbers.set(2,88);
        System.out.println("4. Cостояние кол-ции " +numbers);
        System.out.println();
        //5 при записи значений в не сущест индкс будет ошибка
        System.out.println("5. При записи в не существующий индекс будет ошибка: ");
        try {
            numbers.set(20,7);
        }catch (IndexOutOfBoundsException e){
            //e.printStackTrace();
            System.out.println("   Выход за пределы ArrayList: IndexOutOfBoundsException");
        }
        System.out.println();
//6. Метод size() - возвращает количество элементов в коллекции
        System.out.print("6. Метод size() - возвращает количество элементов в коллекции: ");
        System.out.println(numbers.size());
        System.out.println();

        //7. Метод get() - возвращает значение по индексу
        System.out.print("7. Метод get() - возвращает значение по индексу 2: ");
        System.out.println(numbers.get(2));
        System.out.println();

        //8. Метод toArray() - поможет преобразовать коллекцию в массив
        System.out.print("8. Метод toArray() - поможет преобразовать Коллекцию в Массив: ");
        Object[] obj = numbers.toArray();
        for(Object v :obj){
            System.out.print(v + "; ");
        }
        System.out.println();
//9. Метод contains() - поиск значения в коллекции, например 81:
        System.out.println("9. Метод contains() - поиск значения в коллекции, например 81: " + numbers.contains(81));
        System.out.println();
        //10. Метод addAll - добавить все элементы в коллекцию из другой коллекции
        System.out.println("10. Метод addAll - добавить все элементы в коллекцию из другой коллекции");
        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(numbers);
        System.out.println("    В новую коллекцию numbers2 добавлены значения: " + numbers2);
//11 Метод remove(int index) - удалить по индексу 2
        System.out.print("11. Метод remove(int index) - удалить по индексу 2: ");
        numbers.remove(2);
        System.out.println(numbers);

        //12. Метод isEmpty() - boolean пустая ли коллекция:
        ArrayList<String> emptyArray = new ArrayList<String>();
        System.out.println("12. Метод isEmpty() - boolean пустая ли коллекция emptyArray: " + emptyArray.isEmpty());
        System.out.println();
        //13. Метод clear() - удаляет все элементы коллекции
        System.out.println("13. Метод clear() - удаляет все элементы коллекции, numbers2 до удаления: " + numbers2.size());
        numbers2.clear();
        System.out.println("    В коллекции numbers2 количество элементов после удаления: " + numbers2.size());
    }
}
