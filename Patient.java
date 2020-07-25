//==============================================================================================
/**
 * Class Name: Paitient
 *
 * DESCRIPTION: 
 * 
 * COMP2140 Section D01 Assighnment Assightnment #5, Question #1
 * 
 * @author Rubait Ul Ahamed, 007876180
 * @version (23rd July 2020)
 */
class Patient implements Comparable {
    
    private int patientNum;
    private int urgency;
    private int treatementTime;


    /**
     * constructor
     */
    Patient (int patientNum, int urgency, int treatementTime) {
        this.patientNum = patientNum;
        this.urgency = urgency;
        this.treatementTime = treatementTime;
    }


    //****Getters & Setters****

    public void setPatientNum (int patientNum) {
        this.patientNum = patientNum;
    } 
    
    public void setUrgency (int urgency) {
        this.urgency = urgency;
    }

    public void SetTreatementTime (int treatementTime) {
        this.treatementTime = treatementTime;
    }

    public int getPatientNum () {
        return patientNum;
    }

    public int getUrgency () {
        return urgency;
    }

    public int getTreatementTime () {
        return treatementTime;
    }

    public String toString () {
        String toReturn = "";
        toReturn += "number: " + patientNum + " ";
        toReturn += "urgerncy: " + urgency + " ";
        toReturn += "treatemnt time: " + treatementTime + " ";
        return toReturn;
    }

    @Override
    public int compareTo(Object o) {
        Patient other = (Patient) o;
        if (getUrgency() > other.getUrgency()) {
            return 1;
        } else if (getUrgency() < other.getUrgency()) {
            return -1;
        }
        return 0;
    }
}