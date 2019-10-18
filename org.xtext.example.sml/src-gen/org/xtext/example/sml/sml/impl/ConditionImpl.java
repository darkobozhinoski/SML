/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.sml.sml.Condition;
import org.xtext.example.sml.sml.Region;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.ConditionImpl#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ConditionImpl#getN <em>N</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ConditionImpl#getNest <em>Nest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionImpl extends ScopeImpl implements Condition
{
  /**
   * The cached value of the '{@link #getR() <em>R</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected Region r;

  /**
   * The default value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected static final int N_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getN() <em>N</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getN()
   * @generated
   * @ordered
   */
  protected int n = N_EDEFAULT;

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
  protected ConditionImpl()
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
    return SmlPackage.Literals.CONDITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Region getR()
  {
    if (r != null && r.eIsProxy())
    {
      InternalEObject oldR = (InternalEObject)r;
      r = (Region)eResolveProxy(oldR);
      if (r != oldR)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.CONDITION__R, oldR, r));
      }
    }
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Region basicGetR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setR(Region newR)
  {
    Region oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CONDITION__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getN()
  {
    return n;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setN(int newN)
  {
    int oldN = n;
    n = newN;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CONDITION__N, oldN, n));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SmlPackage.CONDITION__NEST, oldNest, nest));
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
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.CONDITION__NEST, oldNest, nest));
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
      case SmlPackage.CONDITION__R:
        if (resolve) return getR();
        return basicGetR();
      case SmlPackage.CONDITION__N:
        return getN();
      case SmlPackage.CONDITION__NEST:
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
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SmlPackage.CONDITION__R:
        setR((Region)newValue);
        return;
      case SmlPackage.CONDITION__N:
        setN((Integer)newValue);
        return;
      case SmlPackage.CONDITION__NEST:
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
      case SmlPackage.CONDITION__R:
        setR((Region)null);
        return;
      case SmlPackage.CONDITION__N:
        setN(N_EDEFAULT);
        return;
      case SmlPackage.CONDITION__NEST:
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
      case SmlPackage.CONDITION__R:
        return r != null;
      case SmlPackage.CONDITION__N:
        return n != N_EDEFAULT;
      case SmlPackage.CONDITION__NEST:
        return nest != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (n: ");
    result.append(n);
    result.append(')');
    return result.toString();
  }

} //ConditionImpl
