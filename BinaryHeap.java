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
class BinaryHeap {
    
    private Patient[] heap;
    private int length;

    /**
     * constructor:
     * creates a patient array with in the maxSize
     * @param maxSize total number of spaces in the array
     */
    BinaryHeap (int maxSize) {
        heap = new Patient[maxSize];
        length = 0;
    }

    /**
     * @param parent index of the parent
     * @return (int) index of the left child
     */
    public int leftChild (int parent) {
        return (2 * parent) + 1;
    }

    /**
     * @param parent index of the parent
     * @return (int) index of the right child
     */
    public int rightChild (int parent) {
        return (2 * parent) + 2;
    }

    /**
     * @param index index of the current patient
     * @return (int) index of the parent
     */
    public int parent (int index) {
        return (index - 1) / 2;
    }

    /**
     * @return (boolean) true if heap array is empty.
     */
    public boolean isEmpty () {
        return length == 0;
    }

    /*
     * @return (boolean) true if heap is full
     */
    public boolean isFull () {
        return length >= heap.length;
    }

    /**
     * inserts patients decendingly with the patient with
     * highest priority on the top
     * @param newPatient patient to enter
     */
    public void insert (Patient newPatient) {
        if ( !isFull() ) {
            heap[length++] = newPatient;
            shiftUp(length - 1);
        }

    }

    /**
     * swaps position with its parents if parent is smaller
     * @param index the index to inspect and perform operation
     */
    private void shiftUp(int index) {
        if (index == 0) {return;}
        int parent = parent(index);
        if (heap[index].compareTo(heap[parent]) > 0) {
            swap(index, parent);
            shiftUp(parent);
        }

    }

    /**
     * displays the content of the binary heap
     */
    @Override
    public String toString () {
        String toReturn = "";
        for (int i = 0; i < length; i++) {
            toReturn += heap[i].toString() + "\n";
        }
        return toReturn;
    }

    /**
     * deletes the patient with the hiest priority
     * @return the patient to be deleted
     */
    public Patient deleteMax () {
        if ( isEmpty() ) {
            return null;
        }
        Patient toDel = heap[0];
        swap(0, --length);
        shiftDown(0);
        return toDel;
        
    }

    /**
     * swap position with child nodes if child node has hier peiority,
     * till in the correct posotion to matain heap order
     * @param parent index to inspect and perfor swaps
     */
    private void shiftDown(int parent) {
        int leftIndex = leftChild(parent);
        int rightIndex = rightChild(parent);

        if ( leftIndex >= length  ||  rightIndex >= length) {
            return;
        }

        if ( heap[leftIndex].compareTo(heap[rightIndex]) > 0 
        && heap[parent].compareTo(heap[leftIndex]) < 0) {
            swap(parent, leftIndex);
            shiftDown(leftIndex);
        } else if ( heap[parent].compareTo(heap[rightIndex]) < 0 ) {
            swap(parent, rightIndex);
            shiftDown(rightIndex);
        }

    }

    /**
     * swaps the value of two indices in the heap
     * @param i value of this index will be coped to index j
     * @param j value of this index will be coped to index i
     */
    private void swap(int i, int j) {
        Patient temp = heap[j];
        heap[j] = heap [i];
        heap[i] = temp;
    }

    /**
     * @return (patient) the root of the bianry heap
     */
    public Patient getRoot () {
        return heap[0];
    }
    

}