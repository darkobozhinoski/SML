/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.sml.sml.Foraging;
import org.xtext.example.sml.sml.Region;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foraging</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.ForagingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ForagingImpl#getNest <em>Nest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForagingImpl extends TaskImpl implements Foraging
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<Region> source;

  /**
   * The cached value of the '{@link #getNest() <em>Nest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNest()
   * @generated
   * @ordered
   */
  protected Region nest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ForagingImpl()
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
    return SmlPackage.Literals.FORAGING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Region> getSource()
  {
    if (source == null)
    {
      source = new EObjectResolvingEList<Region>(Region.class, this, SmlPackage.FORAGING__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Region getNest()
  {
    if (nest != null && nest.eIsProxy())
    {
      InternalEObject oldNest = (InternalEObject)nest;
      nest = (Region)eResolveProxy(oldNest);
      if (nest != oldNest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.FORAGING__NEST, oldNest, nest));
      }
    }
    return nest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region basicGetNest()
  {
    return nest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNest(Region newNest)
  {
    Region oldNest = nest;
    nest = newNest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.FORAGING__NEST, oldNest, nest));
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
      case SmlPackage.FORAGING__SOURCE:
        return getSource();
      case SmlPackage.FORAGING__NEST:
        if (resolve) return getNest();
        return basicGetNest();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmlPackage.FORAGING__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends Region>)newValue);
        return;
      case SmlPackage.FORAGING__NEST:
        setNest((Region)newValue);
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
      case SmlPackage.FORAGING__SOURCE:
        getSource().clear();
        return;
      case SmlPackage.FORAGING__NEST:
        setNest((Region)null);
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
      case SmlPackage.FORAGING__SOURCE:
        return source != null && !source.isEmpty();
      case SmlPackage.FORAGING__NEST:
        return nest != null;
    }
    return super.eIsSet(featureID);
  }

} //ForagingImpl
