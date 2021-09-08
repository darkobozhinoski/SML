/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.Definition2#getPoint <em>Point</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.sml.sml.SmlPackage#getDefinition2()
 * @model
 * @generated
 */
public interface Definition2 extends RegionDefinition
{
  /**
   * Returns the value of the '<em><b>Point</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.sml.sml.Position}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Point</em>' containment reference list.
   * @see org.xtext.example.sml.sml.SmlPackage#getDefinition2_Point()
   * @model containment="true"
   * @generated
   */
  EList<Position> getPoint();

} // Definition2