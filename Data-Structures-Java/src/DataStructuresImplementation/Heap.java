package DataStructuresImplementation;

import java.util.Arrays;

public class Heap {

    int [] arr;
    int maxSize;

    int heapSize;

    public Heap (int maxSize){
        this.maxSize = maxSize;
        arr = new int [maxSize];
        heapSize = 0;
    }

    public void maxHeapify(int i){

        int l = lChild(i);
        int r = rChild(i);
        int largest = i;
        if(l < heapSize && arr[l] > arr[i]){
            largest = l;
        }

        if(r < heapSize && arr[r] > arr[i]){
            largest = r;
        }

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(largest);
        }

    }

    public void insert(int n){
        if (heapSize == maxSize) {
            System.out.println("OVERFLOW");
            return;
        }

        heapSize++;
        int i = heapSize - 1;
        increaseKey(i, n);
    }

    public int removeMax(){
        if (heapSize == 0) {
            return Integer.MIN_VALUE;
        }
        if (heapSize == 1) {
            heapSize--;
            return arr[0];
        }

        int root = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;

        maxHeapify(0);

        return root;

    }

    public void delete(int i){
        increaseKey(i, Integer.MAX_VALUE);
        removeMax();
    }


    private int lChild(int i){
        return (2 * i + 1);
    }

    private int rChild(int i){
        return (2 * i + 2);
    }

    private int parent(int i){
        return (i - 1) / 2;
    }

    public int getHeapSize(){
        return heapSize;
    }

    private void increaseKey(int i, int newValue){
        arr[i] = newValue;
        while (i != 0 && arr[parent(i)] < arr[i]){
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    @Override
    public String toString() {
        return "Heap{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
