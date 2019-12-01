/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.sml.sml.DefinitionOne;
import org.xtext.example.sml.sml.Dimension;
import org.xtext.example.sml.sml.Position;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition One</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.DefinitionOneImpl#getReferencepoint <em>Referencepoint</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.DefinitionOneImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionOneImpl extends RegionDefinitionImpl implements DefinitionOne
{
  /**
   * The cached value of the '{@link #getReferencepoint() <em>Referencepoint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencepoint()
   * @generated
   * @ordered
   */
  protected Position referencepoint;

  /**
   * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDimensions()
   * @generated
   * @ordered
   */
  protected Dimension dimensions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionOneImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SmlPackage.Literals.DEFINITION_ONE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Position getReferencepoint()
  {
    return referencepoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReferencepoint(Position newReferencepoint, NotificationChain msgs)
  {
    Position oldReferencepoint = referencepoint;
    referencepoint = newReferencepoint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.DEFINITION_ONE__REFERENCEPOINT, oldReferencepoint, newReferencepoint);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReferencepoint(Position newReferencepoint)
  {
    if (newReferencepoint != referencepoint)
    {
      NotificationChain msgs = null;
      if (referencepoint != null)
        msgs = ((InternalEObject)referencepoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.DEFINITION_ONE__REFERENCEPOINT, null, msgs);
      if (newReferencepoint != null)
        msgs = ((InternalEObject)newReferencepoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.DEFINITION_ONE__REFERENCEPOINT, null, msgs);
      msgs = basicSetReferencepoint(newReferencepoint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DEFINITION_ONE__REFERENCEPOINT, newReferencepoint, newReferencepoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dimension getDimensions()
  {
    return dimensions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDimensions(Dimension newDimensions, NotificationChain msgs)
  {
    Dimension oldDimensions = dimensions;
    dimensions = newDimensions;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.DEFINITION_ONE__DIMENSIONS, oldDimensions, newDimensions);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDimensions(Dimension newDimensions)
  {
    if (newDimensions != dimensions)
    {
      NotificationChain msgs = null;
      if (dimensions != null)
        msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.DEFINITION_ONE__DIMENSIONS, null, msgs);
      if (newDimensions != null)
        msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.DEFINITION_ONE__DIMENSIONS, null, msgs);
      msgs = basicSetDimensions(newDimensions, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DEFINITION_ONE__DIMENSIONS, newDimensions, newDimensions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SmlPackage.DEFINITION_ONE__REFERENCEPOINT:
        return basicSetReferencepoint(null, msgs);
      case SmlPackage.DEFINITION_ONE__DIMENSIONS:
        return basicSetDimensions(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SmlPackage.DEFINITION_ONE__REFERENCEPOINT:
        return getReferencepoint();
      case SmlPackage.DEFINITION_ONE__DIMENSIONS:
        return getDimensions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmlPackage.DEFINITION_ONE__REFERENCEPOINT:
        setReferencepoint((Position)newValue);
        return;
      case SmlPackage.DEFINITION_ONE__DIMENSIONS:
        setDimensions((Dimension)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SmlPackage.DEFINITION_ONE__REFERENCEPOINT:
        setReferencepoint((Position)null);
        return;
      case SmlPackage.DEFINITION_ONE__DIMENSIONS:
        setDimensions((Dimension)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SmlPackage.DEFINITION_ONE__REFERENCEPOINT:
        return referencepoint != null;
      case SmlPackage.DEFINITION_ONE__DIMENSIONS:
        return dimensions != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionOneImpl