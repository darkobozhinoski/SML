/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.sml.sml.Dimension1;
import org.xtext.example.sml.sml.SmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.sml.sml.impl.Dimension1Impl#getR <em>R</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.Dimension1Impl#getM1 <em>M1</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.Dimension1Impl#getH <em>H</em>}</li>
 *   <li>{@link org.xtext.example.sml.sml.impl.Dimension1Impl#getM2 <em>M2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Dimension1Impl extends DimensionImpl implements Dimension1
{
  /**
   * The default value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected static final String R_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getR() <em>R</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getR()
   * @generated
   * @ordered
   */
  protected String r = R_EDEFAULT;

  /**
   * The default value of the '{@link #getM1() <em>M1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM1()
   * @generated
   * @ordered
   */
  protected static final String M1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getM1() <em>M1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM1()
   * @generated
   * @ordered
   */
  protected String m1 = M1_EDEFAULT;

  /**
   * The default value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected static final String H_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getH() <em>H</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getH()
   * @generated
   * @ordered
   */
  protected String h = H_EDEFAULT;

  /**
   * The default value of the '{@link #getM2() <em>M2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM2()
   * @generated
   * @ordered
   */
  protected static final String M2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getM2() <em>M2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getM2()
   * @generated
   * @ordered
   */
  protected String m2 = M2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Dimension1Impl()
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
    return SmlPackage.Literals.DIMENSION1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getR()
  {
    return r;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setR(String newR)
  {
    String oldR = r;
    r = newR;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DIMENSION1__R, oldR, r));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getM1()
  {
    return m1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setM1(String newM1)
  {
    String oldM1 = m1;
    m1 = newM1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DIMENSION1__M1, oldM1, m1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getH()
  {
    return h;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setH(String newH)
  {
    String oldH = h;
    h = newH;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DIMENSION1__H, oldH, h));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getM2()
  {
    return m2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setM2(String newM2)
  {
    String oldM2 = m2;
    m2 = newM2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SmlPackage.DIMENSION1__M2, oldM2, m2));
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
      case SmlPackage.DIMENSION1__R:
        return getR();
      case SmlPackage.DIMENSION1__M1:
        return getM1();
      case SmlPackage.DIMENSION1__H:
        return getH();
      case SmlPackage.DIMENSION1__M2:
        return getM2();
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
      case SmlPackage.DIMENSION1__R:
        setR((String)newValue);
        return;
      case SmlPackage.DIMENSION1__M1:
        setM1((String)newValue);
        return;
      case SmlPackage.DIMENSION1__H:
        setH((String)newValue);
        return;
      case SmlPackage.DIMENSION1__M2:
        setM2((String)newValue);
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
      case SmlPackage.DIMENSION1__R:
        setR(R_EDEFAULT);
        return;
      case SmlPackage.DIMENSION1__M1:
        setM1(M1_EDEFAULT);
        return;
      case SmlPackage.DIMENSION1__H:
        setH(H_EDEFAULT);
        return;
      case SmlPackage.DIMENSION1__M2:
        setM2(M2_EDEFAULT);
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
      case SmlPackage.DIMENSION1__R:
        return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
      case SmlPackage.DIMENSION1__M1:
        return M1_EDEFAULT == null ? m1 != null : !M1_EDEFAULT.equals(m1);
      case SmlPackage.DIMENSION1__H:
        return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
      case SmlPackage.DIMENSION1__M2:
        return M2_EDEFAULT == null ? m2 != null : !M2_EDEFAULT.equals(m2);
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
    result.append(" (r: ");
    result.append(r);
    result.append(", m1: ");
    result.append(m1);
    result.append(", h: ");
    result.append(h);
    result.append(", m2: ");
    result.append(m2);
    result.append(')');
    return result.toString();
  }

} //Dimension1Impl
