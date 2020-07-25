//==============================================================================================
/**
 * Class Name: Heap
 *
 * DESCRIPTION: 
 * 
 * COMP2140 Section D01 Assighnment Assightnment #5, Question #1
 * 
 * @author Rubait Ul Ahamed, 007876180
 * @version (24th July 2020)
 */
class Heap {
    
    private Patient[] heap;
    private int length;

    Heap (int maxSize) {
        heap = new Patient[maxSize];
        length = 0;
    }

    public int leftChild (int parent) {
        return (2 * parent) + 1;
    }

    public int rightChild (int parent) {
        return (2 * parent) + 2;
    }

    public int parent (int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty () {
        return length == 0;
    }

    public boolean isFull () {
        return length >= heap.length;
    }

    public void insert (Patient newPatient) {
        if ( !isFull() ) {
            heap[length++] = newPatient;
            shiftUp(length - 1);
        }

    }

    private void shiftUp(int index) {
        if (index == 0) {return;}
        int parent = parent(index);
        if (heap[index].compareTo(heap[parent]) > 0) {
            swap(index, parent);
            shiftUp(parent);
        }

    }

    public String toString () {
        String toReturn = "";
        for (int i = 0; i < length; i++) {
            toReturn += heap[i].toString() + "\n";
        }
        return toReturn;
    }

    public Patient deleteMax () {
        if ( isEmpty() ) {
            return null;
        }
        Patient toDel = heap[0];
        swap(0, length--);
        shiftDown(0);
        return toDel;
        
    }

    private void shiftDown(int parent) {
        int leftIndex = leftChild(parent);
        int rightIndex = rightChild(parent);

        if (leftIndex >= length  ||  rightIndex >= length) {
            return;
        }

        if (heap[leftIndex].getUrgency() > heap[rightIndex].getUrgency() &&
            heap[parent].getUrgency() < heap[leftIndex].getUrgency()) {
                swap(parent, leftIndex);
                shiftDown(leftIndex);
        } else if (heap[parent].getUrgency() < heap[rightIndex].getUrgency()) {
            swap(parent, rightIndex);
            shiftDown(rightIndex);
        }

    }

    private void swap(int i, int j) {
        Patient temp = heap[j];
        heap[j] = heap [i];
        heap[i] = temp;
    }
    

}