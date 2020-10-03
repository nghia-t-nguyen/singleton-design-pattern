package csce247.assignments.singleton;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A patient in the hospital
 * 
 * @author Nghia Nguyen
 *
 */
public class Patient {
  private int id;
  private String firstName;
  private String lastName;
  private ArrayList<String> allergies;

  /**
   * Creates a patient
   * 
   * @param id - an int of the patient id
   * @param firstName - the first name of the patient
   * @param lastName - the last name of the patient
   */
  public Patient(int id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    allergies = new ArrayList<String>();
  }

  /**
   * Adds an allergy to the patient's list of allergies
   * 
   * @param allergy - the patient's allergy
   */
  public void addAllergy(String allergy) {
    allergies.add(allergy);
  }

  /**
   * Gets a String representation of the patient with their first and last name, ID, and allergies
   * 
   * @return a String representation of the Patient
   */
  public String toString() {
    String ret = "Patient " + (id + 1) + ": " + firstName + " " + lastName;
    if (!allergies.isEmpty()) {
      ret += "\n  Allergies: ";

      Iterator<String> it = allergies.iterator();
      ret += it.next();

      while (it.hasNext()) {
        ret += ", " + it.next();
      }
    }

    return ret;
  }

}
