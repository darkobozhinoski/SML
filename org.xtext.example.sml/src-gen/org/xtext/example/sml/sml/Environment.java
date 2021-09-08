/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Environment#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends EObject
{
  /**
   * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sml.sml.EnvironmentElements}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Environment</em>' containment reference list.
   * @see org.xtext.example.sml.sml.SmlPackage#getEnvironment_Environment()
   * @model containment="true"
   * @generated
   */
  EList<EnvironmentElements> getEnvironment();

} // Environment
