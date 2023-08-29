package taskTwo;

//Создать класс DynamicArray, являющийся собственной реализацией динамического контейнера.
//Класс должен содержать внутри себя массив generic-элементов. Должны быть реализованы конструкторы для создания
//такого контейнера без каких-либо параметров (длина по умолчанию 10), с начальной длиной
//или с начальным массивом значений vararg.

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray<E> {
    private Object[] massiveOfElements = new Object[10];
    private int size = 0;

    public DynamicArray() {
        massiveOfElements = new Object[10];
    }

    public DynamicArray(int size) {
        massiveOfElements = new Object[size];
    }

    public DynamicArray(E... elements) {
        for (E addElements: elements) {
            addElement(addElements);
        }
    }


    //•	addElement - добавление элемента в конец массива
    public void addElement (E addElement) {
        if(massiveOfElements.length <= size) {
            Object[] tempData = massiveOfElements;
            massiveOfElements = new Object[size + 1];
            for (int i = 0; i < size; i++) {
                massiveOfElements[i] = tempData[i];
            }
        }
        massiveOfElements[size] = addElement;
        size++;
    }

    //•	addElement - добавление элемента по произвольному индексу
    public void  addElement (int index, E addElement) {
        if (index >= massiveOfElements.length || index < 0) {
            throw new IllegalArgumentException("Указанный индекс вне размера коллекции: " + index);
        }
        Object[] tempData = massiveOfElements;
        massiveOfElements = new Object[size + 1];
        for (int i = 0; i < index; i++) {
            massiveOfElements[i] = tempData[i];
        }
        size++;
        for (int i = index + 1; i < size; i++) {
            massiveOfElements[i] = tempData[i-1];
        }
        massiveOfElements[index] = addElement;
    }

    //•	setElement - перезапись элемента по индексу
    public void  setElement (int index, E addElement) {
        if (index >= massiveOfElements.length || index < 0) {
            throw new IllegalArgumentException("Указанный индекс вне размера коллекции: " + index);
        }
        massiveOfElements[index] = addElement;
    }

    //•	getElement - получение элемента по индексу
    public E getElement(int index) {
        if (index >= massiveOfElements.length || index < 0) {
            throw new IllegalArgumentException("Указанный индекс вне размера коллекции: " + index);
        }
        return (E) massiveOfElements[index];
    }

    //•	removeElement удаление произвольного элемента по индексу
    public void  removeElement (int index) {
        if (index >= massiveOfElements.length || index < 0) {
            throw new IllegalArgumentException("Указанный индекс вне размера коллекции: " + index);
        }
        Object[] tempData = massiveOfElements;
        massiveOfElements = new Object[size - 1];
        for (int i = 0; i < index; i++) {
            massiveOfElements[i] = tempData[i];
        }
        size--;
        for (int i = index; i < size; i++) {
            massiveOfElements[i] = tempData[i+1];
        }
    }

    //•	containsElement - проверка на вхождение элемента
    public boolean containsElement(E element) {
        for (Object numberElement: massiveOfElements) {
            if (String.valueOf(numberElement).equals(String.valueOf(element))) {
                return true;
            }
        }
        return false;
    }

    //•	getSize - получение текущего размера
    public int getSize() {
        return size;
    }

    //•	toString - конвертация внутреннего состояния для печати в виде [1, 2, 3].
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(massiveOfElements[i] + ", ");
        }
        if(stringBuilder.length() != 0){
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
        }
        return "[" + stringBuilder + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DynamicArray<?> that = (DynamicArray<?>) o;
        return size == that.size && Arrays.equals(massiveOfElements, that.massiveOfElements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(massiveOfElements);
        return result;
    }
}
