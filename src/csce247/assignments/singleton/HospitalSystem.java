package csce247.assignments.singleton;

import java.util.ArrayList;


/**
 * A hospital system that store patient information
 * 
 * @author Nghia Nguyen
 *
 */
public class HospitalSystem {
  private ArrayList<Patient> patients;
  private static HospitalSystem hospitalSystem;

  /**
   * Creates a hospital system and initializes the patients arraylist
   */
  private HospitalSystem() {
    patients = new ArrayList<Patient>();
  }

  /**
   * Gets a singular instance of the HospitalSystem If the HospitalSystem hasn't been initialized,
   * then it would create a new hospital system Otherwise, it would return the hospital system that
   * is already initialized
   * 
   * @return the single instance of the HospitalSystem
   */
  public static HospitalSystem getInstance() {
    if (hospitalSystem == null) {
      hospitalSystem = new HospitalSystem();
    }
    return hospitalSystem;
  }

  /**
   *
   * @param firstName - a String with the first name of the patient
   * @param lastName - a String with the last name of the patient
   * @return a int of the patient's id
   */
  public int addPatient(String firstName, String lastName) {
    int id = patients.size();
    patients.add(new Patient(id, firstName, lastName));
    return id;
  }

  /**
   * Gets the patient record given a patient ID
   * 
   * @param id - an int of the patient ID
   * @return a Patient with the corresponding ID
   */
  public Patient getRecord(int id) {
    return patients.get(id);
  }

  /**
   * Adds an allergy to the patients record
   * 
   * @param id - an int of the patient ID
   * @param allergy - a String of a patient's allergy
   */
  public void addAllergy(int id, String allergy) {
    getRecord(id).addAllergy(allergy);
  }

  /**
   * Gets the data of all the patients in the HospitalSystem
   * 
   * @return - a String representation of all the patients in the HospitalSystem
   */
  public String getAllPatientsData() {
    String ret = "";
    for (Patient patient : patients) {
      ret += patient.toString() + "\n\n";
    }
    return ret;
  }
}
