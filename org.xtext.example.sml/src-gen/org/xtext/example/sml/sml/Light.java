/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Light#getL <em>L</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Light#getC <em>C</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Light#getIt <em>It</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Light#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getLight()
 * @model
 * @generated
 */
public interface Light extends EnvironmentElement
{
  /**
   * Returns the value of the '<em><b>L</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>L</em>' attribute.
   * @see #setL(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getLight_L()
   * @model
   * @generated
   */
  String getL();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Light#getL <em>L</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>L</em>' attribute.
   * @see #getL()
   * @generated
   */
  void setL(String value);

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute.
   * @see #setC(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getLight_C()
   * @model
   * @generated
   */
  String getC();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Light#getC <em>C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>C</em>' attribute.
   * @see #getC()
   * @generated
   */
  void setC(String value);

  /**
   * Returns the value of the '<em><b>It</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>It</em>' attribute.
   * @see #setIt(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getLight_It()
   * @model
   * @generated
   */
  String getIt();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Light#getIt <em>It</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>It</em>' attribute.
   * @see #getIt()
   * @generated
   */
  void setIt(String value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(Position)
   * @see org.xtext.example.sml.sml.SmlPackage#getLight_P()
   * @model containment="true"
   * @generated
   */
  Position getP();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Light#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(Position value);

} // Light