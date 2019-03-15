/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.sml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.sml.sml.Arena;
import org.xtext.example.sml.sml.ArithmeticExpression;
import org.xtext.example.sml.sml.AtomicIndicator;
import org.xtext.example.sml.sml.BoolLiteral;
import org.xtext.example.sml.sml.Circle;
import org.xtext.example.sml.sml.CircleD;
import org.xtext.example.sml.sml.CompoundIndicator;
import org.xtext.example.sml.sml.Condition;
import org.xtext.example.sml.sml.ConstantSize;
import org.xtext.example.sml.sml.Coordinate;
import org.xtext.example.sml.sml.Dimension;
import org.xtext.example.sml.sml.ElementDescription;
import org.xtext.example.sml.sml.Environment;
import org.xtext.example.sml.sml.EnvironmentElement;
import org.xtext.example.sml.sml.EnvironmentElements;
import org.xtext.example.sml.sml.Indicator;
import org.xtext.example.sml.sml.Interval;
import org.xtext.example.sml.sml.Light;
import org.xtext.example.sml.sml.Lowerbound;
import org.xtext.example.sml.sml.LowerorEqualbound;
import org.xtext.example.sml.sml.Mission;
import org.xtext.example.sml.sml.MissionObjective;
import org.xtext.example.sml.sml.MissionTime;
import org.xtext.example.sml.sml.Model;
import org.xtext.example.sml.sml.Obstacle;
import org.xtext.example.sml.sml.Occurence;
import org.xtext.example.sml.sml.Penatly;
import org.xtext.example.sml.sml.PointD;
import org.xtext.example.sml.sml.Position;
import org.xtext.example.sml.sml.ProbabilisticDecription;
import org.xtext.example.sml.sml.Range;
import org.xtext.example.sml.sml.Rectangle;
import org.xtext.example.sml.sml.RectangleD;
import org.xtext.example.sml.sml.Region;
import org.xtext.example.sml.sml.Reward;
import org.xtext.example.sml.sml.Scope;
import org.xtext.example.sml.sml.SmlPackage;
import org.xtext.example.sml.sml.Swarmconf;
import org.xtext.example.sml.sml.Task;
import org.xtext.example.sml.sml.Time;
import org.xtext.example.sml.sml.Upperbound;
import org.xtext.example.sml.sml.UpperorEqualbound;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.sml.sml.SmlPackage
 * @generated
 */
public class SmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SmlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ENVIRONMENT:
      {
        Environment environment = (Environment)theEObject;
        T result = caseEnvironment(environment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.PROBABILISTIC_DECRIPTION:
      {
        ProbabilisticDecription probabilisticDecription = (ProbabilisticDecription)theEObject;
        T result = caseProbabilisticDecription(probabilisticDecription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.SWARMCONF:
      {
        Swarmconf swarmconf = (Swarmconf)theEObject;
        T result = caseSwarmconf(swarmconf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.MISSION_TIME:
      {
        MissionTime missionTime = (MissionTime)theEObject;
        T result = caseMissionTime(missionTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.MISSION:
      {
        Mission mission = (Mission)theEObject;
        T result = caseMission(mission);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.TASK:
      {
        Task task = (Task)theEObject;
        T result = caseTask(task);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.MISSION_OBJECTIVE:
      {
        MissionObjective missionObjective = (MissionObjective)theEObject;
        T result = caseMissionObjective(missionObjective);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.INDICATOR:
      {
        Indicator indicator = (Indicator)theEObject;
        T result = caseIndicator(indicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ATOMIC_INDICATOR:
      {
        AtomicIndicator atomicIndicator = (AtomicIndicator)theEObject;
        T result = caseAtomicIndicator(atomicIndicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.COMPOUND_INDICATOR:
      {
        CompoundIndicator compoundIndicator = (CompoundIndicator)theEObject;
        T result = caseCompoundIndicator(compoundIndicator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.SCOPE:
      {
        Scope scope = (Scope)theEObject;
        T result = caseScope(scope);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.OCCURENCE:
      {
        Occurence occurence = (Occurence)theEObject;
        T result = caseOccurence(occurence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.PENATLY:
      {
        Penatly penatly = (Penatly)theEObject;
        T result = casePenatly(penatly);
        if (result == null) result = caseOccurence(penatly);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.REWARD:
      {
        Reward reward = (Reward)theEObject;
        T result = caseReward(reward);
        if (result == null) result = caseOccurence(reward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.CONDITION:
      {
        Condition condition = (Condition)theEObject;
        T result = caseCondition(condition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.TIME:
      {
        Time time = (Time)theEObject;
        T result = caseTime(time);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ENVIRONMENT_ELEMENTS:
      {
        EnvironmentElements environmentElements = (EnvironmentElements)theEObject;
        T result = caseEnvironmentElements(environmentElements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ENVIRONMENT_ELEMENT:
      {
        EnvironmentElement environmentElement = (EnvironmentElement)theEObject;
        T result = caseEnvironmentElement(environmentElement);
        if (result == null) result = caseEnvironmentElements(environmentElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ELEMENT_DESCRIPTION:
      {
        ElementDescription elementDescription = (ElementDescription)theEObject;
        T result = caseElementDescription(elementDescription);
        if (result == null) result = caseEnvironmentElements(elementDescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.OBJECT:
      {
        org.xtext.example.sml.sml.Object object = (org.xtext.example.sml.sml.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = caseEnvironmentElement(object);
        if (result == null) result = caseEnvironmentElements(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.OBSTACLE:
      {
        Obstacle obstacle = (Obstacle)theEObject;
        T result = caseObstacle(obstacle);
        if (result == null) result = caseEnvironmentElement(obstacle);
        if (result == null) result = caseEnvironmentElements(obstacle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.LIGHT:
      {
        Light light = (Light)theEObject;
        T result = caseLight(light);
        if (result == null) result = caseEnvironmentElement(light);
        if (result == null) result = caseEnvironmentElements(light);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.POSITION:
      {
        Position position = (Position)theEObject;
        T result = casePosition(position);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ARENA:
      {
        Arena arena = (Arena)theEObject;
        T result = caseArena(arena);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.REGION:
      {
        Region region = (Region)theEObject;
        T result = caseRegion(region);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.DIMENSION:
      {
        Dimension dimension = (Dimension)theEObject;
        T result = caseDimension(dimension);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.CIRCLE_D:
      {
        CircleD circleD = (CircleD)theEObject;
        T result = caseCircleD(circleD);
        if (result == null) result = caseDimension(circleD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.RECTANGLE_D:
      {
        RectangleD rectangleD = (RectangleD)theEObject;
        T result = caseRectangleD(rectangleD);
        if (result == null) result = caseDimension(rectangleD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.COORDINATE:
      {
        Coordinate coordinate = (Coordinate)theEObject;
        T result = caseCoordinate(coordinate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.RANGE:
      {
        Range range = (Range)theEObject;
        T result = caseRange(range);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.CONSTANT_SIZE:
      {
        ConstantSize constantSize = (ConstantSize)theEObject;
        T result = caseConstantSize(constantSize);
        if (result == null) result = caseRange(constantSize);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.LOWERBOUND:
      {
        Lowerbound lowerbound = (Lowerbound)theEObject;
        T result = caseLowerbound(lowerbound);
        if (result == null) result = caseRange(lowerbound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.LOWEROR_EQUALBOUND:
      {
        LowerorEqualbound lowerorEqualbound = (LowerorEqualbound)theEObject;
        T result = caseLowerorEqualbound(lowerorEqualbound);
        if (result == null) result = caseRange(lowerorEqualbound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.UPPERBOUND:
      {
        Upperbound upperbound = (Upperbound)theEObject;
        T result = caseUpperbound(upperbound);
        if (result == null) result = caseRange(upperbound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.UPPEROR_EQUALBOUND:
      {
        UpperorEqualbound upperorEqualbound = (UpperorEqualbound)theEObject;
        T result = caseUpperorEqualbound(upperorEqualbound);
        if (result == null) result = caseRange(upperorEqualbound);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.INTERVAL:
      {
        Interval interval = (Interval)theEObject;
        T result = caseInterval(interval);
        if (result == null) result = caseRange(interval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.ARITHMETIC_EXPRESSION:
      {
        ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
        T result = caseArithmeticExpression(arithmeticExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.BOOL_LITERAL:
      {
        BoolLiteral boolLiteral = (BoolLiteral)theEObject;
        T result = caseBoolLiteral(boolLiteral);
        if (result == null) result = caseArithmeticExpression(boolLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.CIRCLE:
      {
        Circle circle = (Circle)theEObject;
        T result = caseCircle(circle);
        if (result == null) result = casePosition(circle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.RECTANGLE:
      {
        Rectangle rectangle = (Rectangle)theEObject;
        T result = caseRectangle(rectangle);
        if (result == null) result = casePosition(rectangle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SmlPackage.POINT_D:
      {
        PointD pointD = (PointD)theEObject;
        T result = casePointD(pointD);
        if (result == null) result = casePosition(pointD);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironment(Environment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Probabilistic Decription</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Probabilistic Decription</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProbabilisticDecription(ProbabilisticDecription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Swarmconf</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Swarmconf</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwarmconf(Swarmconf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mission Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mission Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMissionTime(MissionTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMission(Mission object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTask(Task object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mission Objective</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mission Objective</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMissionObjective(MissionObjective object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIndicator(Indicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomicIndicator(AtomicIndicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compound Indicator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compound Indicator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompoundIndicator(CompoundIndicator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScope(Scope object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Occurence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Occurence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOccurence(Occurence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Penatly</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Penatly</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePenatly(Penatly object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReward(Reward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCondition(Condition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTime(Time object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Elements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Elements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentElements(EnvironmentElements object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Environment Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Environment Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnvironmentElement(EnvironmentElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementDescription(ElementDescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(org.xtext.example.sml.sml.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Obstacle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Obstacle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObstacle(Obstacle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Light</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Light</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLight(Light object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Position</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePosition(Position object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arena</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arena</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArena(Arena object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegion(Region object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDimension(Dimension object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Circle D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Circle D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCircleD(CircleD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rectangle D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rectangle D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRectangleD(RectangleD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Coordinate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Coordinate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCoordinate(Coordinate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRange(Range object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Size</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Size</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantSize(ConstantSize object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lowerbound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lowerbound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerbound(Lowerbound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loweror Equalbound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loweror Equalbound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerorEqualbound(LowerorEqualbound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Upperbound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upperbound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpperbound(Upperbound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Upperor Equalbound</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Upperor Equalbound</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpperorEqualbound(UpperorEqualbound object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterval(Interval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArithmeticExpression(ArithmeticExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolLiteral(BoolLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCircle(Circle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rectangle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRectangle(Rectangle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Point D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Point D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointD(PointD object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SmlSwitch
