/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.AtomicIndicator#getOc <em>Oc</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getAtomicIndicator()
 * @model
 * @generated
 */
public interface AtomicIndicator extends EObject
{
  /**
   * Returns the value of the '<em><b>Oc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oc</em>' containment reference.
   * @see #setOc(Occurence)
   * @see org.xtext.example.sml.sml.SmlPackage#getAtomicIndicator_Oc()
   * @model containment="true"
   * @generated
   */
  Occurence getOc();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.AtomicIndicator#getOc <em>Oc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oc</em>' containment reference.
   * @see #getOc()
   * @generated
   */
  void setOc(Occurence value);

} // AtomicIndicator
