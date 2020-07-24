class Heap {
    
    private Patient[] heap;
    private int length;
    private int maxSize;

    Heap () {
        maxSize = 100;
        heap = new Patient[maxSize];
        length = 0;
    }

    public int getleftChild (int parent) {
        return (2 * parent) + 1;
    }

    public int getRightChild (int parent) {
        return (2 * parent) + 2;
    }

    public int getParent (int index) {
        return (index - 1) / 2;
    }

    public boolean isEmpty () {
        return length == 0;
    }

    public boolean isFull () {
        return length + 1 == maxSize;
    }
    

}