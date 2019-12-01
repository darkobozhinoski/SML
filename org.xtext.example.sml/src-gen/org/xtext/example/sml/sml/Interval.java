/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Interval#getM <em>M</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getInterval()
 * @model
 * @generated
 */
public interface Interval extends Range
{
  /**
   * Returns the value of the '<em><b>M</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>M</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>M</em>' attribute.
   * @see #setM(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getInterval_M()
   * @model
   * @generated
   */
  String getM();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Interval#getM <em>M</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>M</em>' attribute.
   * @see #getM()
   * @generated
   */
  void setM(String value);

} // Interval
