package de.telran.lesson_7_011024;

public class DynamicArray {
    int[] array; // variable array[] is an array
    int count; // количество элементов в списке
    private int size; // размер массива
    private int k; // коэффициент увеличения массива

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
        k = 2;
    }

    // добавляем эл-ты в конец
    public void add(int data) {

        if (this.count == this.size) {
            growSize();
        }

        this.array[this.count] = data;
        this.count++;
    }

    // расширяем внутренний массив
    public void growSize() {
        int[] temp = new int[this.size * this.k];
        for (int i = 0; i < this.size; i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
        this.size = this.size * this.k;
    }

    // добавление по индексу
    public void addAt(int index, int data) {
        //расширяем массив
        if (this.count == this.size) {
            this.growSize();
        }

        // смещаем на единицу вправо, освобождая место по index
        for (int i = this.count - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        //вставляем элемент
        this.array[index] = data;
        this.count++;
    }

    //удаляем последний элемент
    public void remove() {
        if (this.count > 0) {
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }

    //удаление по индексу
    public void removeAt(int index) {
        if (this.count > 0) {
            for (int i = index; i < this.count - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }

    //-----------------------  Homework 071024   --------------------
    //set(index, data) - изменяет элемент
    public void setData(int index, int data) {
        if (this.count > 0) {
            this.array[index] = data;
        }
    }

    //   contains(data) - проверяет существует ли элемент
    public int containsData(int num) {
        if (this.count > 0) {
            for (int i = 0; i < this.count; i++) {
                if (this.array[i] == num) return i;
            }
        }
        return -1;
    }

    // isEmpty() - вернет false, если в структуре есть элемент
    public boolean isEmptyArr() {
        if (this.count > 0) return false;
        return true;
    }

    //    clean() - удаляет все элементы
    public void removeAll() {
        if (this.count > 0) {
            for (int i = 0; i < this.count; i++) {
                this.array[i] = 0;
            }
            this.count = 0;
        }
    }
}



