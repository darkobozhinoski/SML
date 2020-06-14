/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.MissionTime#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.MissionTime#getM <em>M</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getMissionTime()
 * @model
 * @generated
 */
public interface MissionTime extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Range)
   * @see org.xtext.example.sml.sml.SmlPackage#getMissionTime_T()
   * @model containment="true"
   * @generated
   */
  Range getT();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.MissionTime#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Range value);

  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see #setM(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getMissionTime_M()
   * @model
   * @generated
   */
  String getM();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.MissionTime#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see #getM()
   * @generated
   */
  void setM(String value);

} // MissionTime
