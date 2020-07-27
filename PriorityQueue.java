//==============================================================================================
/**
 * Class Name: PriorityQueue
 *
 * DESCRIPTION: 
 * 
 * COMP2140 Section D01 Assighnment Assightnment #5, Question #1
 * 
 * @author Rubait Ul Ahamed, 007876180
 * @version (25th July 2020)
 */
class PriorityQueue {
    
    BinaryHeap heap;


    /**
     * constructor: 
     * Creates a new bonary heap with a total of 100 spots
     */
    PriorityQueue () {
        heap = new BinaryHeap(100);
    }

    /**
     * adds patients in regars to their urgency
     * @param toAdd patient to add
     */
    public void insert (Patient toAdd) {
        heap.insert(toAdd);
    }

    /**
     * removes the hiest urgency patient from the queue
     * @return patient with the highest uegency
     */
    public Patient deleteMax () {
        return heap.deleteMax();
    }

    /**
     * @return (patient) the patient infront of the queue
     * without removing them
     */
    public Patient peek () {
        return heap.getRoot();
    }

    /**
     * @return (boolean) true if the queue is empty
     * false otherwise
     */
    public boolean isEmpty () {
        return heap.isEmpty();
    }
}