/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Obstacle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Obstacle#getObs <em>Obs</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Obstacle#getR <em>R</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getObstacle()
 * @model
 * @generated
 */
public interface Obstacle extends EnvironmentElement
{
  /**
   * Returns the value of the '<em><b>Obs</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obs</em>' attribute.
   * @see #setObs(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getObstacle_Obs()
   * @model
   * @generated
   */
  String getObs();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Obstacle#getObs <em>Obs</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obs</em>' attribute.
   * @see #getObs()
   * @generated
   */
  void setObs(String value);

  /**
   * Returns the value of the '<em><b>R</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' containment reference.
   * @see #setR(Region)
   * @see org.xtext.example.sml.sml.SmlPackage#getObstacle_R()
   * @model containment="true"
   * @generated
   */
  Region getR();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Obstacle#getR <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>R</em>' containment reference.
   * @see #getR()
   * @generated
   */
  void setR(Region value);

} // Obstacle