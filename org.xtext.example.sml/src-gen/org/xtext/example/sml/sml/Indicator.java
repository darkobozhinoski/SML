/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indicator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Indicator#getSp <em>Sp</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Indicator#getOc <em>Oc</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getIndicator()
 * @model
 * @generated
 */
public interface Indicator extends EObject
{
  /**
   * Returns the value of the '<em><b>Sp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sp</em>' containment reference.
   * @see #setSp(Scope)
   * @see org.xtext.example.sml.sml.SmlPackage#getIndicator_Sp()
   * @model containment="true"
   * @generated
   */
  Scope getSp();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Indicator#getSp <em>Sp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sp</em>' containment reference.
   * @see #getSp()
   * @generated
   */
  void setSp(Scope value);

  /**
   * Returns the value of the '<em><b>Oc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oc</em>' containment reference.
   * @see #setOc(EObject)
   * @see org.xtext.example.sml.sml.SmlPackage#getIndicator_Oc()
   * @model containment="true"
   * @generated
   */
  EObject getOc();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Indicator#getOc <em>Oc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oc</em>' containment reference.
   * @see #getOc()
   * @generated
   */
  void setOc(EObject value);

} // Indicator