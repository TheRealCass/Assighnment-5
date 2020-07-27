public class Test {
    
    public static void main(String[] args) {
        int x = 0;
        BinaryHeap heap = new BinaryHeap(100);
        Patient p1 = new Patient(++x, 1, 10);
        Patient p2 = new Patient(++x, 2, 60);
        Patient p3 = new Patient(++x, 3, 60);
        Patient p4 = new Patient(++x, 4, 10);
        Patient p5 = new Patient(++x, 5, 10);
        Patient p6 = new Patient(++x, 6, 60);
        Patient p7 = new Patient(++x, 7, 60);
        Patient p8 = new Patient(++x, 8, 10);
        heap.insert(p1);
        //System.out.println(heap);
        heap.insert(p2);
        heap.insert(p3);
        heap.insert(p4);
        heap.insert(p8);
        heap.insert(p5);
        heap.insert(p6);
        heap.insert(p7);
        System.out.println(heap);
        Patient del = heap.deleteMax();
        System.out.println("deleted " + del.toString() + "\nNewLine\n" + heap);

        
    }
}