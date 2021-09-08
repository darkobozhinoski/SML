/**
 * generated by Xtext 2.21.0
 */
package org.xtext.example.sml.sml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.sml.sml.Element;
import org.xtext.example.sml.sml.ElementDescription;
import org.xtext.example.sml.sml.ProbabilisticDecription;
import org.xtext.example.sml.sml.Range;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.ElementDescriptionImpl#getX <em>X</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ElementDescriptionImpl#getObj <em>Obj</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.ElementDescriptionImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDescriptionImpl extends EnvironmentElementsImpl implements ElementDescription
{
  /**
   * The cached value of the '{@link #getX() <em>X</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getX()
   * @generated
   * @ordered
   */
  protected Range x;

  /**
   * The cached value of the '{@link #getObj() <em>Obj</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObj()
   * @generated
   * @ordered
   */
  protected Element obj;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected ProbabilisticDecription r;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDescriptionImpl()
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
    return SmlPackage.Literals.ELEMENT_DESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Range getX()
  {
    return x;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetX(Range newX, NotificationChain msgs)
  {
    Range oldX = x;
    x = newX;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__X, oldX, newX);
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
  public void setX(Range newX)
  {
    if (newX != x)
    {
      NotificationChain msgs = null;
      if (x != null)
        msgs = ((InternalEObject)x).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__X, null, msgs);
      if (newX != null)
        msgs = ((InternalEObject)newX).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__X, null, msgs);
      msgs = basicSetX(newX, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__X, newX, newX));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Element getObj()
  {
    return obj;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetObj(Element newObj, NotificationChain msgs)
  {
    Element oldObj = obj;
    obj = newObj;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__OBJ, oldObj, newObj);
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
  public void setObj(Element newObj)
  {
    if (newObj != obj)
    {
      NotificationChain msgs = null;
      if (obj != null)
        msgs = ((InternalEObject)obj).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__OBJ, null, msgs);
      if (newObj != null)
        msgs = ((InternalEObject)newObj).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__OBJ, null, msgs);
      msgs = basicSetObj(newObj, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__OBJ, newObj, newObj));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProbabilisticDecription getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetR(ProbabilisticDecription newR, NotificationChain msgs)
  {
    ProbabilisticDecription oldR = r;
    r = newR;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__R, oldR, newR);
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
  public void setR(ProbabilisticDecription newR)
  {
    if (newR != r)
    {
      NotificationChain msgs = null;
      if (r != null)
        msgs = ((InternalEObject)r).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__R, null, msgs);
      if (newR != null)
        msgs = ((InternalEObject)newR).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SmlPackage.ELEMENT_DESCRIPTION__R, null, msgs);
      msgs = basicSetR(newR, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.ELEMENT_DESCRIPTION__R, newR, newR));
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
      case SmlPackage.ELEMENT_DESCRIPTION__X:
        return basicSetX(null, msgs);
      case SmlPackage.ELEMENT_DESCRIPTION__OBJ:
        return basicSetObj(null, msgs);
      case SmlPackage.ELEMENT_DESCRIPTION__R:
        return basicSetR(null, msgs);
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
      case SmlPackage.ELEMENT_DESCRIPTION__X:
        return getX();
      case SmlPackage.ELEMENT_DESCRIPTION__OBJ:
        return getObj();
      case SmlPackage.ELEMENT_DESCRIPTION__R:
        return getR();
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
      case SmlPackage.ELEMENT_DESCRIPTION__X:
        setX((Range)newValue);
        return;
      case SmlPackage.ELEMENT_DESCRIPTION__OBJ:
        setObj((Element)newValue);
        return;
      case SmlPackage.ELEMENT_DESCRIPTION__R:
        setR((ProbabilisticDecription)newValue);
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
      case SmlPackage.ELEMENT_DESCRIPTION__X:
        setX((Range)null);
        return;
      case SmlPackage.ELEMENT_DESCRIPTION__OBJ:
        setObj((Element)null);
        return;
      case SmlPackage.ELEMENT_DESCRIPTION__R:
        setR((ProbabilisticDecription)null);
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
      case SmlPackage.ELEMENT_DESCRIPTION__X:
        return x != null;
      case SmlPackage.ELEMENT_DESCRIPTION__OBJ:
        return obj != null;
      case SmlPackage.ELEMENT_DESCRIPTION__R:
        return r != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementDescriptionImpl
