/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Patch#getPt <em>Pt</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Patch#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Patch#getR <em>R</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getPatch()
 * @model
 * @generated
 */
public interface Patch extends EnvironmentElement
{
  /**
   * Returns the value of the '<em><b>Pt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pt</em>' attribute.
   * @see #setPt(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getPatch_Pt()
   * @model
   * @generated
   */
  String getPt();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Patch#getPt <em>Pt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pt</em>' attribute.
   * @see #getPt()
   * @generated
   */
  void setPt(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getPatch_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Patch#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

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
   * @see org.xtext.example.sml.sml.SmlPackage#getPatch_R()
   * @model containment="true"
   * @generated
   */
  Region getR();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Patch#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(Region value);

} // Patch
