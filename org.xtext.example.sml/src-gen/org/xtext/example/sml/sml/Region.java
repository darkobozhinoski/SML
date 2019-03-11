/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Region#getColors <em>Colors</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Region#getShape <em>Shape</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Region#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Region#getReferencepoint <em>Referencepoint</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Region#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends EObject
{
  /**
   * Returns the value of the '<em><b>Colors</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colors</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colors</em>' attribute.
   * @see #setColors(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getRegion_Colors()
   * @model
   * @generated
   */
  String getColors();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Region#getColors <em>Colors</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colors</em>' attribute.
   * @see #getColors()
   * @generated
   */
  void setColors(String value);

  /**
   * Returns the value of the '<em><b>Shape</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shape</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shape</em>' attribute.
   * @see #setShape(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getRegion_Shape()
   * @model
   * @generated
   */
  String getShape();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Region#getShape <em>Shape</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shape</em>' attribute.
   * @see #getShape()
   * @generated
   */
  void setShape(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.sml.sml.SmlPackage#getRegion_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Region#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Referencepoint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referencepoint</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referencepoint</em>' containment reference.
   * @see #setReferencepoint(Position)
   * @see org.xtext.example.sml.sml.SmlPackage#getRegion_Referencepoint()
   * @model containment="true"
   * @generated
   */
  Position getReferencepoint();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Region#getReferencepoint <em>Referencepoint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referencepoint</em>' containment reference.
   * @see #getReferencepoint()
   * @generated
   */
  void setReferencepoint(Position value);

  /**
   * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dimensions</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dimensions</em>' containment reference.
   * @see #setDimensions(Dimension)
   * @see org.xtext.example.sml.sml.SmlPackage#getRegion_Dimensions()
   * @model containment="true"
   * @generated
   */
  Dimension getDimensions();

  /**
   * Sets the value of the '{@link org.xtext.example.sml.sml.Region#getDimensions <em>Dimensions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dimensions</em>' containment reference.
   * @see #getDimensions()
   * @generated
   */
  void setDimensions(Dimension value);

} // Region