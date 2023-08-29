package runner;

import taskTwo.DynamicArray;

public class DynamicArrayRunner {
    public static void main(String[] args) {
        // демонстрация работы класса DynamicArray
        // Создание изначального объекта класса DynamicArray, наполненного элементами
        DynamicArray<Integer> integerDynamicArray = new DynamicArray<>(1,2,3,4,5);
        System.out.println("Оригинальный массив: " + integerDynamicArray.toString() + " Размер массива: "
                + integerDynamicArray.getSize() + "\n");
        // addElement - добавление элемента в конец массива
        integerDynamicArray.addElement(15);
        System.out.println("Текущий массив, после использования метода addElement: "
                + integerDynamicArray.toString() + " Размер массива: " + integerDynamicArray.getSize() + "\n");
        //addElement - добавление элемента по произвольному индексу
        integerDynamicArray.addElement(2,20);
        System.out.println("Текущий массив, после использования метода addElement: "
                + integerDynamicArray.toString() + " Размер массива: " + integerDynamicArray.getSize() + "\n");
        //setElement - перезапись элемента по индексу
        integerDynamicArray.setElement(1,12);
        System.out.println("Текущий массив, после использования метода setElement: "
                + integerDynamicArray.toString() + " Размер массива: " + integerDynamicArray.getSize() + "\n");
        //getElement - получение элемента по индексу
        System.out.println("Элемент под индексом \"6\", полученный с помощью метода getElement: "
                + integerDynamicArray.getElement(6) + "\n");
        //removeElement удаление произвольного элемента по индексу
        integerDynamicArray.removeElement(0);
        System.out.println("Текущий массив, после использования метода removeElement: "
                + integerDynamicArray.toString() + " Размер массива: " + integerDynamicArray.getSize() + "\n");
        //containsElement - проверка на вхождение элемента
        System.out.println("Проверка присутствия элемента \"6\" в массиве с помощью метода containsElement: "
                + integerDynamicArray.containsElement(6) + "\n");
        System.out.println("Проверка присутствия элемента \"4\" в массиве с помощью метода containsElement: "
                + integerDynamicArray.containsElement(4) + "\n");
    }
}
