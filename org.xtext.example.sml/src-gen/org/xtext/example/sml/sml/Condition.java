/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Condition#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Condition#getN <em>N</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends EObject
{
  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>R</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(Region)
   * @see org.xtext.example.sml.sml.SmlPackage#getCondition_R()
   * @model containment="true"
   * @generated
   */
  Region getR();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Condition#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(Region value);

  /**
   * Returns the value of the '<em><b>N</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>N</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>N</em>' attribute.
   * @see #setN(int)
   * @see org.xtext.example.sml.sml.SmlPackage#getCondition_N()
   * @model
   * @generated
   */
  int getN();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Condition#getN <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>N</em>' attribute.
   * @see #getN()
   * @generated
   */
  void setN(int value);

} // Condition