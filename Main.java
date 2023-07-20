/** Сортировка кучей или пирамидальная сортировка
 *
 */

public class Main {
    public static void main(String[] args) {
        int a[] = {12, 3, 17, 8, 9, 2};
        heapSort(a);
        printArray(a);}


    /**
     * Метод создания кучи
     * @param array - массив
     * @param heapSize - размер массива
     * @param rootIndex - индекс родителя
     */
        public static void createHeap ( int[] array, int heapSize, int rootIndex){
            int largest = rootIndex; //инициализируем индекс наибольшего элемента как индекс родителя
            int leftChild = 2 * rootIndex + 1;// определяем левого потомока
            int rightChild = 2 * rootIndex + 2;//определяем правого потомока
            if (leftChild < heapSize && array[leftChild] > array[largest]) {
                largest = leftChild;// если левый потомок > родителя, то присваиваем ему значение наибольшего элемента
            }
            if (rightChild < heapSize && array[rightChild] > array[leftChild]) {
                largest = rightChild;//если правый потомок >наибольшего элемента(левого),то присваиваем ему значение наибольшего
                // элемента }
            if (largest != rootIndex) {
                    int temp = array[rootIndex];
                    array[rootIndex] = array[largest];
                    array[largest] = temp; //если индекс наибольшего эл не равен родителю, то меняем местами наибольший эл и родителя
                // и снова запускаем метод createHeap, но при этом в параметрах у него уже на месте родителя стоит наименьший эл
                    createHeap(array, heapSize, largest);}}}

    /**
     * метод сортировки кучей
     * @param array - массив
     */


        public static void heapSort ( int[] array){
            for (int i = array.length / 2 - 1; i >= 0; i--) {
                createHeap(array,array.length, i);}
            for (int i = array.length - 1; i >= 0; i--) {
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;
                createHeap(array, i, 0);}}


    /**
     * Метод печати массива
     * @param ar - массив
     */
    public static void printArray(int[]ar){
        for (int i = 0; i< ar.length; i++){
            System.out.print(ar[i]+" ");}}}



