package org.example.homework5.task03;

class HeapSort {
    /**
     * @apiNote Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
     * индексом в arr[]. n - размер кучи
     * @param tree  массив
     * @param n   размер массива
     * @param i  index
     */
    public static void buildTree(int[] tree, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int left = 2 * i + 1;  // левый = 2*i + 1
        int right = 2 * i + 2;  // правый = 2*i + 2

        if (left < n && tree[left] > tree[largest]) largest = left;  // Если левый дочерний элемент больше корня
        if (right < n && tree[right] > tree[largest]) largest = right;  // Если правый дочерний элемент больше, чем самый
                                                                        // большой элемент на данный момент
        if (largest != i) {    // Если самый большой элемент не корень
            int swap = tree[i];
            tree[i] = tree[largest];
            tree[largest] = swap;

            buildTree(tree, n, largest);  // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
        }

    }

    public static void heapSort(int[] sortArray) {
        int n = sortArray.length;
        // Построение кучи (перегруппируем массив)
        for (int i = n/2-1; i >=0 ; i--) {
            buildTree(sortArray, n, i);

        }
        // Один за другим извлекаем элементы из кучи
        for (int i = n-1; i >= 0 ; i--) {
            // Перемещаем текущий корень в конец
            int tmp = sortArray[0];
            sortArray[0] = sortArray[i];
            sortArray[i] = tmp;

            // Вызываем процедуру buildTree на уменьшенной куче
            buildTree(sortArray, i, 0);
         }
    }
}
