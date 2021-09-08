/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Migration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Migration#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.Migration#getT <em>T</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getMigration()
 * @model
 * @generated
 */
public interface Migration extends Task
{
  /**
   * Returns the value of the '<em><b>R</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.sml.sml.Region}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>R</em>' reference list.
   * @see org.xtext.example.sml.sml.SmlPackage#getMigration_R()
   * @model
   * @generated
   */
  EList<Region> getR();

  /**
   * Returns the value of the '<em><b>T</b></em>' reference list.
   * The list contents are of type {@link org.xtext.example.sml.sml.Region}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' reference list.
   * @see org.xtext.example.sml.sml.SmlPackage#getMigration_T()
   * @model
   * @generated
   */
  EList<Region> getT();

} // Migration
