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
public class Patient {
    
    private int patientNum;
    private int urgency;
    private int treatementTime;


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
}