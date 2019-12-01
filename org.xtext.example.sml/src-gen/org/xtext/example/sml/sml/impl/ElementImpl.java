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

import org.xtext.example.sml.sml.Dimension2;
import org.xtext.example.sml.sml.Element;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.ElementImpl#getOb <em>Ob</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ElementImpl#getD <em>D</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element
{
  /**
   * The default value of the '{@link #getOb() <em>Ob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOb()
   * @generated
   * @ordered
   */
  protected static final String OB_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOb() <em>Ob</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOb()
   * @generated
   * @ordered
   */
  protected String ob = OB_EDEFAULT;

  /**
   * The cached value of the '{@link #getD() <em>D</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getD()
   * @generated
   * @ordered
   */
  protected Dimension2 d;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
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
    return SmlPackage.Literals.ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOb()
  {
    return ob;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOb(String newOb)
  {
    String oldOb = ob;
    ob = newOb;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT__OB, oldOb, ob));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dimension2 getD()
  {
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetD(Dimension2 newD, NotificationChain msgs)
  {
    Dimension2 oldD = d;
    d = newD;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT__D, oldD, newD);
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
  public void setD(Dimension2 newD)
  {
    if (newD != d)
    {
      NotificationChain msgs = null;
      if (d != null)
        msgs = ((InternalEObject)d).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT__D, null, msgs);
      if (newD != null)
        msgs = ((InternalEObject)newD).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT__D, null, msgs);
      msgs = basicSetD(newD, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT__D, newD, newD));
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
      case SmlPackage.ELEMENT__D:
        return basicSetD(null, msgs);
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
      case SmlPackage.ELEMENT__OB:
        return getOb();
      case SmlPackage.ELEMENT__D:
        return getD();
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
      case SmlPackage.ELEMENT__OB:
        setOb((String)newValue);
        return;
      case SmlPackage.ELEMENT__D:
        setD((Dimension2)newValue);
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
      case SmlPackage.ELEMENT__OB:
        setOb(OB_EDEFAULT);
        return;
      case SmlPackage.ELEMENT__D:
        setD((Dimension2)null);
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
      case SmlPackage.ELEMENT__OB:
        return OB_EDEFAULT == null ? ob != null : !OB_EDEFAULT.equals(ob);
      case SmlPackage.ELEMENT__D:
        return d != null;
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
    result.append(" (ob: ");
    result.append(ob);
    result.append(')');
    return result.toString();
  }

} //ElementImpl
