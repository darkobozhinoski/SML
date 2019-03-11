/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Probabilistic Decription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.ProbabilisticDecription#getDis <em>Dis</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.ProbabilisticDecription#getK <em>K</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getProbabilisticDecription()
 * @model
 * @generated
 */
public interface ProbabilisticDecription extends EObject
{
  /**
   * Returns the value of the '<em><b>Dis</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dis</em>' attribute.
   * @see #setDis(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getProbabilisticDecription_Dis()
   * @model
   * @generated
   */
  String getDis();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.ProbabilisticDecription#getDis <em>Dis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dis</em>' attribute.
   * @see #getDis()
   * @generated
   */
  void setDis(String value);

  /**
   * Returns the value of the '<em><b>K</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>K</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>K</em>' containment reference.
   * @see #setK(Region)
   * @see org.xtext.example.sml.sml.SmlPackage#getProbabilisticDecription_K()
   * @model containment="true"
   * @generated
   */
  Region getK();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.ProbabilisticDecription#getK <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>K</em>' containment reference.
   * @see #getK()
   * @generated
   */
  void setK(Region value);

} // ProbabilisticDecription