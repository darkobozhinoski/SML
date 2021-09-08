/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.MissionObjective#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.MissionObjective#getIn <em>In</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getMissionObjective()
 * @model
 * @generated
 */
public interface MissionObjective extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getMissionObjective_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.MissionObjective#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>In</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sml.sml.Indicator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In</em>' containment reference list.
   * @see org.xtext.example.sml.sml.SmlPackage#getMissionObjective_In()
   * @model containment="true"
   * @generated
   */
  EList<Indicator> getIn();

} // MissionObjective
