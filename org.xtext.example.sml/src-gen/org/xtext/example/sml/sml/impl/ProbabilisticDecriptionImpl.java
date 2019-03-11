/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.sml.sml.ProbabilisticDecription;
import org.xtext.example.sml.sml.Region;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Probabilistic Decription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.ProbabilisticDecriptionImpl#getDis <em>Dis</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ProbabilisticDecriptionImpl#getK <em>K</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProbabilisticDecriptionImpl extends MinimalEObjectImpl.Container implements ProbabilisticDecription
{
  /**
   * The default value of the '{@link #getDis() <em>Dis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDis()
   * @generated
   * @ordered
   */
  protected static final String DIS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDis() <em>Dis</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDis()
   * @generated
   * @ordered
   */
  protected String dis = DIS_EDEFAULT;

  /**
   * The cached value of the '{@link #getK() <em>K</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getK()
   * @generated
   * @ordered
   */
  protected Region k;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProbabilisticDecriptionImpl()
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
    return SmlPackage.Literals.PROBABILISTIC_DECRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDis()
  {
    return dis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDis(String newDis)
  {
    String oldDis = dis;
    dis = newDis;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.PROBABILISTIC_DECRIPTION__DIS, oldDis, dis));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Region getK()
  {
    return k;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetK(Region newK, NotificationChain msgs)
  {
    Region oldK = k;
    k = newK;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.PROBABILISTIC_DECRIPTION__K, oldK, newK);
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
  public void setK(Region newK)
  {
    if (newK != k)
    {
      NotificationChain msgs = null;
      if (k != null)
        msgs = ((InternalEObject)k).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.PROBABILISTIC_DECRIPTION__K, null, msgs);
      if (newK != null)
        msgs = ((InternalEObject)newK).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.PROBABILISTIC_DECRIPTION__K, null, msgs);
      msgs = basicSetK(newK, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.PROBABILISTIC_DECRIPTION__K, newK, newK));
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
      case SmlPackage.PROBABILISTIC_DECRIPTION__K:
        return basicSetK(null, msgs);
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
      case SmlPackage.PROBABILISTIC_DECRIPTION__DIS:
        return getDis();
      case SmlPackage.PROBABILISTIC_DECRIPTION__K:
        return getK();
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
      case SmlPackage.PROBABILISTIC_DECRIPTION__DIS:
        setDis((String)newValue);
        return;
      case SmlPackage.PROBABILISTIC_DECRIPTION__K:
        setK((Region)newValue);
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
      case SmlPackage.PROBABILISTIC_DECRIPTION__DIS:
        setDis(DIS_EDEFAULT);
        return;
      case SmlPackage.PROBABILISTIC_DECRIPTION__K:
        setK((Region)null);
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
      case SmlPackage.PROBABILISTIC_DECRIPTION__DIS:
        return DIS_EDEFAULT == null ? dis != null : !DIS_EDEFAULT.equals(dis);
      case SmlPackage.PROBABILISTIC_DECRIPTION__K:
        return k != null;
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
    result.append(" (dis: ");
    result.append(dis);
    result.append(')');
    return result.toString();
  }

} //ProbabilisticDecriptionImpl
