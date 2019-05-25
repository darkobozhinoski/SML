/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Scope#getP <em>P</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Scope#getQ <em>Q</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Scope#getT <em>T</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getScope()
 * @model
 * @generated
 */
public interface Scope extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' attribute.
   * @see #setP(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getScope_P()
   * @model
   * @generated
   */
  String getP();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Scope#getP <em>P</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' attribute.
   * @see #getP()
   * @generated
   */
  void setP(String value);

  /**
   * Returns the value of the '<em><b>Q</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Q</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Q</em>' attribute.
   * @see #setQ(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getScope_Q()
   * @model
   * @generated
   */
  String getQ();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Scope#getQ <em>Q</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Q</em>' attribute.
   * @see #getQ()
   * @generated
   */
  void setQ(String value);

  /**
   * Returns the value of the '<em><b>T</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' containment reference.
   * @see #setT(Time)
   * @see org.xtext.example.sml.sml.SmlPackage#getScope_T()
   * @model containment="true"
   * @generated
   */
  Time getT();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Scope#getT <em>T</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' containment reference.
   * @see #getT()
   * @generated
   */
  void setT(Time value);

} // Scope