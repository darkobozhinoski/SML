/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.sml.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext

import org.eclipse.xtext.naming.IQualifiedNameProvider


import com.google.inject.Inject
import org.xtext.example.sml.sml.Model
import org.xtext.example.sml.sml.Arena
import org.xtext.example.sml.sml.Coordinate2D
import org.xtext.example.sml.sml.Coordinate3D

import org.xtext.example.sml.sml.Dimension
//import org.xtext.example.sml.sml.RectnagleD
import org.xtext.example.sml.sml.Region
import org.xtext.example.sml.sml.Arena
import org.xtext.example.sml.sml.Position

import org.xtext.example.sml.sml.Swarmconf
import org.xtext.example.sml.sml.Light
import org.xtext.example.sml.sml.Obstacle
import org.xtext.example.sml.sml.Object
import org.xtext.example.sml.sml.EnvironmentElement
import org.xtext.example.sml.sml.EnvironmentElements
import org.xtext.example.sml.sml.ProbabilisticDecription
import org.xtext.example.sml.sml.Environment
import org.xtext.example.sml.sml.ElementDescription
import org.xtext.example.sml.sml.MissionObjective
import org.xtext.example.sml.sml.Reward
import org.xtext.example.sml.sml.Indicator
import org.xtext.example.sml.sml.AtomicIndicator
import org.xtext.example.sml.sml.Scope
import org.xtext.example.sml.sml.Occurence
import org.xtext.example.sml.sml.Penalty
import org.xtext.example.sml.sml.Condition
import org.xtext.example.sml.sml.CompoundIndicator
import org.xtext.example.sml.sml.Range
import org.xtext.example.sml.sml.Lowerbound
import org.xtext.example.sml.sml.Upperbound
import org.xtext.example.sml.sml.UpperorEqualbound
import org.xtext.example.sml.sml.LowerorEqualbound
import org.xtext.example.sml.sml.ConstantSize
import org.xtext.example.sml.sml.Interval
import org.xtext.example.sml.sml.Dimension1
import org.xtext.example.sml.sml.Dimension2
import org.xtext.example.sml.sml.Dimension3
import org.xtext.example.sml.sml.Patch
import org.xtext.example.sml.sml.RegionDefinition
import org.xtext.example.sml.sml.DefinitionOne
import org.xtext.example.sml.sml.DefinitionTwo
import org.xtext.example.sml.sml.DefinitionThree
import java.util.Random;

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SmlGenerator extends AbstractGenerator {
var members= <String,Integer>newLinkedHashMap();
var initializationList=<String,int[]>newLinkedHashMap();
//var double[] Specification=<double, double, double>newArrayList();


Model model1;
Model model;
@Inject extension IQualifiedNameProvider
override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
// fsa.generateFile('greetings.txt', 'People to greet: ' +
// resource.allContents
// .filter(Greeting)
// .map[name]
// .join(', '))

    // «IF model.env !== null»«model.ms.compile» «ENDIF»
    //«IF model.sw !== null»«model.sw.compile» «ENDIF»


     model = resource.contents.head as Model
     model1 = resource.contents.head as Model
     
     fsa.generateFile('setup.xml', '''
        <?xml version="1.0" ?>
     <argos-configuration>
       <!-- ************* -->
       <!-- * Framework * -->
       <!-- ************* -->
       <!--AGGREGATION ON ONE  SPOT-->
       <framework>
         <experiment length="«model.ms.mt.t.compile»"  ticks_per_second="10" random_seed="0"/>
       </framework>
         <!-- ****************** -->
         <!-- * Loop functions * -->
         <!-- ****************** -->
         <loop_functions library="PROVIDE_PATH_TO_LOOPFUNCTIONS_LIB/libchocolate_mission1_loopfunc.dylib" label="chocolate_mission1_loop_functions">
          <params dist_radius="1.2" number_robots="«calculatenumRobotsMax(model.sw.x)»" m_min_robots="«calculatenumRobotsMin(model.sw.x)»"/>
         </loop_functions>
       
         <!-- *************** -->
         <!-- * Controllers * -->
         <!-- *************** -->
         <controllers>
        <!-- TRANSMITTER -->
           <automode_controller id="automode"
                               library="PROVIDE_PATH_TO_CONTROLLER_LIB/libautomode.dylib">
             <actuators>
               <epuck_wheels implementation="default" noise_std_dev="0.05"/>
               <epuck_rgb_leds implementation="default" medium="leds"/>
               <epuck_range_and_bearing implementation="medium" medium="rab" data_size="4" range="0.7"/>
             </actuators>
             <sensors>
           <epuck_proximity implementation="default" show_rays="false" noise_level="0.05" calibrated="true"/>
               <epuck_range_and_bearing implementation="medium" medium="rab" data_size="4" nois_std_deviation="1.5" loss_probability="0.85" calibrated="true"/>
           <epuck_light implementation="default" show_rays="true" noise_level="0.05" calibrated="true"/>
           <epuck_ground implementation="rot_z_only" noise_level="0.05" calibrated="true"/>
           <epuck_omnidirectional_camera implementation="rot_z_only" medium="leds" show_rays="false"/>
             </sensors>
        <!--  <params fsm-config="--nstates 1 --s0 1" />  -->
       <params  fsm-config="--nstates 2 --s0 4 --att0 5 --n0 1 --n0x0 0 --c0x0 0 --p0x0
       1.0 --s1 1 --n1 1 --n1x0 0 --c1x0 5 --p1x0 0.25"/>
           </automode_controller>
         </controllers>
       
         <!-- ********* -->
         <!-- * Arena * -->
         <!-- ********* -->
         <arena size="10, 10, 1" center="0,0,0">
       
         <!-- Change the floor here -->
         <floor id="floor" source="loop_functions" pixels_per_meter="300"/>
       «IF model.arenas !== null»«model.env.compile» «ENDIF»
       «IF model.arenas !== null»«model.sw.compile» «ENDIF»
     
 </arena>
 
    <!-- ******************* -->
    <!-- * Physics engines * -->
    <!-- ******************* -->
    <physics_engines>
      <dynamics2d id="dyn2d" />
    </physics_engines>
 
   <!-- ********* -->
   <!-- * Media * -->
   <!-- ********* -->
   <media>
     <led id="leds" grid_size="1,1,1"/>
     <range_and_bearing id="ircom"/>
     <range_and_bearing id="rab"/>
   </media>
 
   <!-- ***************** -->
   <!-- * Visualization * -->
   <!-- ***************** -->
   <visualization>
    <qt-opengl>
     </qt-opengl>
   </visualization>
 </argos-configuration>
      ''')
     
     
 fsa.generateFile('loopfunctions.cpp', ''' 
	         «constructor()»
	          «destructor()»
	          «destroy()»
	         «ObjectiveFunction()»
	         «RegisterLoopFunctions()»
	         «GetFloorColor()»
	          ''')
     
     
}
		
		


def Initialize(Model m)'''
ChocolateMission2LoopFunction::ChocolateMission2LoopFunction() {
«InitializeVariables(m)»
}
'''

def InitializeVariables(Model m)'''
 «FOR patch: m.env.environment.filter(Patch)»
 «IF TypeDefinition(patch.r.region)==1»  «ENDIF»
 «ENDFOR»
m_unNumberEdges=«IF m.arenas.s.numSides()!=0»«m.arenas.s.numSides»«ENDIF»;
sidesize=«(m.arenas.s.region as DefinitionOne).compile(false)» ;
'''




//CalculatenumFigures(pt.r.shape2d,TypeDefinition(pt.r.region))

def GetFloor(Patch pt, int i)
	'''«IF i==1»if (IsWithin«pt.r.shape2d»(vCurrentPoint,«pt.r.region.GetFigureArguments(pt.r.shape2d)»){
		                return CColor::«pt.c.toUpperCase()»;
		              } 
	«ELSE»else if (IsWithin«pt.r.shape2d»(vCurrentPoint,«pt.r.region.GetFigureArguments(pt.r.shape2d)»){
		  		                return CColor::«pt.c.toUpperCase()»;
		  		              } «ENDIF»
'''


def GetFloor(Arena a)
'''
 else 
       return CColor::«a.s.colors.toUpperCase()»50;
'''

def TypeDefinition(RegionDefinition df){
	switch df{
		case DefinitionOne: return 1
		case DefinitionTwo: return 2
		case DefinitionThree: return 3
	}
	return -1;
}



//def GetInitializationTriangle(RegionDefinition rg, int i)
//'''«FOR patch: m.env.environment.filter(Patch)»
 //«IF TypeDefinition(patch.r.region)==1»  «ENDIF»
 //«ENDFOR»'''


def GetIntializationArguments(RegionDefinition df, String shape){
	'''«var i= CalculateFigureSequence(shape)»
	«IF df instanceof DefinitionTwo»
	«IF shape =="Triangle"»
	m_TriangleCoord«3*i+1»=CVector2();
	m_TriangleCoord«3*i+2»=CVector2();
	m_TriangleCoord«3*i+3»=CVector2())
	«ELSEIF shape =="Rectangle"»
	m_RectangleCoord«4*i+1»=CVector2();
	m_RectangleCoord«4*i+2»=CVector2();
	m_RectangleCoord«4*i+3»=CVector2();
	m_RectangleCoord«4*i+4»=CVector2();)
	«ELSEIF shape =="Hexagon"»
	m_HexagonCoord«6*i+1»=CVector2();
	m_HexagonCoord«6*i+2»=CVector2();
	m_HexagonCoord«6*i+3»=CVector2();
	m_HexagonCoord«6*i+4»=CVector2();
	m_HexagonCoord«6*i+5»=CVector2();
	m_HexagonCoord«6*i+6»=CVector2();)
	«ELSEIF shape =="Square"»m_SquareCoord«4*i+1», m_SquareCoord«4*i+2», m_SquareCoord«4*i+3», m_SquareCoord«4*i+4»)
	«ELSEIF shape =="Dodecagon"»m_SquareCoord«i+1», m_SquareCoord«12*i+2», m_SquareCoord«12*i+3», m_SquareCoord«12*i+4», m_SquareCoord«12*i+5», m_SquareCoord«12*i+6», m_cCoordSpot«12*i+7», m_SquareCoord«12*i+8», m_SquareCoord«12*i+9», m_SquareCoord«12*i+10», m_SquareCoord«12*i+11»), m_SquareCoord«12*i+12»«ENDIF»
	«ELSEIF df instanceof DefinitionOne»
	«IF shape =="Circle"»m_CircleCoord«i+1», m_fRadius«i+1»)
	«ELSEIF shape =="Rectangle"»m_RectangleCoord«i+1», m_Rectlength«i+1», m_Rectwidth«i+1»)
	«ELSEIF shape =="Square"»m_SquareCoord«i+1», m_Squareside«i+1»)«ENDIF»
	«ELSEIF df instanceof DefinitionThree»
	«IF  df.ax=="y"»'y', m_LimitMin«i+1», m_LimitMax«i+1»)
	«ELSEIF  df.ax=="x"»'x', m_LimitMin«i+1», m_LimitMax«i+1»)
	«ENDIF»
	«ENDIF»«PlaceFigure(shape,TypeDefinition(df))»
	'''
		//«ELSEIF shape =="Triangle"»
 	
}





def GetFigureArguments(RegionDefinition df, String shape)
	'''«var i= CalculateFigureSequence(shape)»
	«var j= CalculateFigureDimensionX(shape)»
	«var v= CalculateFigureDimensionY(shape)»
	«IF df instanceof DefinitionTwo»
	«IF shape =="Triangle"»m_TriangleCoord«i+1», m_TriangleCoord«i+2», m_TriangleCoord«i+3»«i+3»)
	«ELSEIF shape =="Rectangle"»m_RectangleCoord«4*i+1», m_RectangleCoord«4*i+2», m_RectangleCoord«4*i+3», m_RectangleCoord«4*i+4»«i+4»)
	«ELSEIF shape =="Hexagon"»m_HexagonCoord«6*i+1», m_HexagonCoord«6*i+2», m_HexagonCoord«6*i+3», m_HexagonCoord«6*i+4», m_HexagonCoord«6*i+5», m_HexagonCoord«6*i+6»«i+6»)
	«ELSEIF shape =="Square"»m_SquareCoord«4*i+1», m_SquareCoord«4*i+2», m_SquareCoord«4*i+3», m_SquareCoord«4*i+4»)
	«ELSEIF shape =="Dodecagon"»m_SquareCoord«i+1», m_SquareCoord«12*i+2», m_SquareCoord«12*i+3», m_SquareCoord«12*i+4», m_SquareCoord«12*i+5», m_SquareCoord«12*i+6», m_cCoordSpot«12*i+7», m_SquareCoord«12*i+8», m_SquareCoord«12*i+9», m_SquareCoord«12*i+10», m_SquareCoord«12*i+11»), m_SquareCoord«12*i+12»«ENDIF»
	«ELSEIF df instanceof DefinitionOne»
	«IF shape =="Circle"»m_CircleCoord«i+1», m_fRadius«j+1»)
	«ELSEIF shape =="Rectangle"»m_RectangleCoord«i+1», m_Rectlength«j+1», m_Rectwidth«v+1»)
	«ELSEIF shape =="Square"»m_SquareCoord«i+1», m_Squareside«j+1»)«ENDIF»
	«ELSEIF df instanceof DefinitionThree»
	«IF  df.ax=="y"»'y', m_LimitMin«j+1», m_LimitMax«v+1»)
	«ELSEIF  df.ax=="x"»'x', m_LimitMin«j+1», m_LimitMax«v+1»)
	«ENDIF»
	«ENDIF»''' //«ELSEIF shape =="Triangle"»
 	



def CalculateFigureSequence(String shape){
	var value=initializationList.get(shape);
	
	if (value!=null){
		
		return value.get(0);
	}
	
	else return 0;
	//else 
	//members.put(shape+2,1);
	
}

def CalculateFigureDimensionX(String shape){
	var value=initializationList.get(shape);
	
	if (value!=null){
		
		return value.get(1);
	}
	
	else return 0;
	//else 
	//members.put(shape+2,1);
	
}

def CalculateFigureDimensionY(String shape){
	var value=initializationList.get(shape);
	
	if (value!=null){
		
		return value.get(1);
	}
	
	else return 0;
	//else 
	//members.put(shape+2,1);
	
}



def CalculatenumFigures(String shape, int definition){
	val value=members.get(shape+definition.toString());
	
	if (value!=null){
		
		return value;
	}
	
	else return 0;
	//else 
	//members.put(shape+2,1);
	
}

def PlaceFigure(String shape, int[] v){
	val value=initializationList.get(shape);
	
	if (value!=null){
		
		initializationList.replace(shape,v);
	}
	
	else initializationList.put(shape,v);
	
	
}

def PlaceFigure(String shape, int definition){
	val value=members.get(shape+definition.toString());
	
	if (value!=null){
		
		members.replace(shape+definition.toString(),value, value+1);
	}
	
	else members.put(shape+definition.toString(),1);
	
	
}

def GetFloorColor()
'''argos::CColor ChocolateMission1LoopFunction::GetFloorColor(const argos::CVector2& c_position_on_plane) {
	            CVector2 vCurrentPoint(c_position_on_plane.GetX(), c_position_on_plane.GetY());
	              «var i=1»
	             «FOR patch: model1.env.environment.filter(Patch)»
	              
	                  «patch.GetFloor(i++)»
	                          «ENDFOR»
	            «GetFloor(model1.arenas)»
	           	}'''



 //«IF patch.r.region instanceof DefinitionOne»«ENDIF»   



def constructor()'''#include "mission.h"
	          
	          /****************************************/
	          /****************************************/
	          
	         
	          
	          /****************************************/
	          /****************************************/
	          
	          ChocolateMission1LoopFunction::ChocolateMission1LoopFunction(const ChocolateMission1LoopFunction& orig) {}'''
	
def destructor()'''/****************************************/
	          /****************************************/
	          
	          ChocolateMission1LoopFunction::~ChocolateMission1LoopFunction() {}
	          
	          /****************************************/
	          /****************************************/
	          '''
	          
def destroy()''' 
	          void ChocolateMission1LoopFunction::Destroy() {}
	          
	          /****************************************/
	          /****************************************/
	          '''


def ObjectiveFunction()
'''Real ChocolateMission3LoopFunction::GetObjectiveFunction(){
   return m_fObjectiveFunction;
}
'''

def RegisterLoopFunctions()'''
/****************************************/
	          /****************************************/
	          REGISTER_LOOP_FUNCTIONS(ChocolateMission1LoopFunction, "chocolate_mission1_loop_functions");
'''


def compile(Environment en)
      '''«FOR e: en.environment»
      «IF e instanceof ElementDescription»
             «(e as ElementDescription).compile»
             «ELSEIF e instanceof EnvironmentElement»
             «(e as EnvironmentElement).compile»«ENDIF»
             «ENDFOR»'''
     


 
 def compile(EnvironmentElement en)
      '''«IF en instanceof Obstacle»«(en as Obstacle).compile»«
      ELSEIF en instanceof Object»«(en as Object).compile»«
      ELSEIF en instanceof Light»«(en as Light).compile»«ENDIF»'''
             
 
 
 def calculatenumRobotsMax(Range rg){
if (rg instanceof Lowerbound) {return Math.round(Double.parseDouble(rg.n)-1.0);}
else if (rg instanceof LowerorEqualbound) {return Math.round(Double.parseDouble(rg.n));}
else if (rg instanceof Upperbound) {return Math.round(Double.parseDouble(rg.n)+10.0);}
else if (rg instanceof UpperorEqualbound) {return Math.round(Double.parseDouble(rg.n)+10.0);}
else if (rg instanceof ConstantSize) {return Math.round(Double.parseDouble(rg.n));}
else if (rg instanceof Interval) {return Math.round(Double.parseDouble(rg.n));}
}
   


 def calculatenumRobotsMin(Range rg){
if (rg instanceof Lowerbound) {return 1;}
else if (rg instanceof LowerorEqualbound) {return 1;}
else if (rg instanceof Upperbound) {return Math.round(Double.parseDouble(rg.n)+1.0);}
else if (rg instanceof UpperorEqualbound) {return Math.round(Double.parseDouble(rg.n));}
else if (rg instanceof ConstantSize) {return Math.round(Double.parseDouble(rg.n));}
else if (rg instanceof Interval) {return Math.round(Double.parseDouble(rg.m));}
}
 




 
 
   
def compile(DefinitionOne defone,boolean referencepoint)  
 '''«IF referencepoint==true»«defone.referencepoint.compile»«ELSE»«defone.dimensions.compile»«ENDIF»'''      



  def compile(Dimension en) 
      '''«IF en instanceof Dimension3»«(en as Dimension3).compile»«ELSEIF en instanceof Dimension2»«(en as Dimension2).compile»«ELSEIF en instanceof Dimension1»«(en as Dimension1).compile»«ENDIF»'''
           

def compile(Arena A)
          '''«IF A !== null»<arena size="10, 10, 1" center="0,0,0">
         </arena>«ENDIF»'''

def compile(Range R)
'''«IF R instanceof ConstantSize»«R.n»
 «ELSEIF R instanceof Interval»«R.m»«ENDIF»'''
 
def compile(Light l)
      '''<light id="light_«Math.round(Math.random()*100)»" position="«l.p.compile»" orientation="0,0,0" color="«l.c»" intensity="«l.it»" medium="leds"/>
         '''



def compile(Position pt) '''«IF pt.point instanceof Coordinate2D»«(pt.point as Coordinate2D).compile»«ELSEIF pt.point instanceof Coordinate3D»«(pt.point as Coordinate3D).compile»«ENDIF»'''  
 


//function to set the movable property of an element in the environment: true for objects, false for obstacles;
def check(String en){
  if (en.contains("objects")) {return true;}
  else if (en.contains("obstacles")) {return false;}
 
 }


//calculate the sides of a Region
def numSides(Region r){
if (r.shape2d=="Hexagon") {return 6;}
else if (r.shape2d=="Dodecagon") {return 12;}
else if (r.shape2d=="Square") {return 4;}
else if (r.shape2d=="Triangle") {return 3;}
else if (r.shape2d=="Circle") 0;

}



  def compile(Obstacle ob)
'''<box id="obstacle_«Math.round(Math.random()*100)»" size="«(ob.r.region as DefinitionOne).compile(false)»" movable="false"><body position="«(ob.r.region as DefinitionOne).compile(true)»" orientation="0,0,0" /></box>'''
	      	      
def compile(Object ob)
'''<box id="object_«Math.round(Math.random()*100)»" size="«(ob.r.region as DefinitionOne).compile(false)»" movable="true"><body position="«(ob.r.region as DefinitionOne).compile(true)»" orientation="0,0,0" /></box>'''

//calculate the min X,Y coordinate in a Region (excluding regiondefinition3)
def calculateMax(Double innerR){
return Math.round(innerR*Math.abs(Math.cos(Math.toRadians(Math.PI)))*100.0)/100.0;
}

//def calculateMaxY(Double innerR){
//return Math.round(innerR*Math.abs(Math.sin(Math.toRadians(Math.PI)))*100.0)/100.0;
//}



//calculate the max X coordinate in a Region with definition3 (representing regions through axis)
def calculateMaxX(DefinitionThree dt3){
if (dt3.ax=="x") {return calculatenumMax(dt3.r);}
else return InnerRadious(model1.arenas.s);
//if (dt3.ax=="y") return calculateMaxY(dt3.r);
}


//calculate the min X coordinate in a Region with definition3 (representing regions through axis)
def calculateMinX(DefinitionThree dt3){
if (dt3.ax=="x") {return calculatenumMin(dt3.r);}
else return -InnerRadious(model1.arenas.s);
//if (dt3.ax=="y") return calculateMaxY(dt3.r);
}


def calculateMaxY(DefinitionThree dt3){
if (dt3.ax=="y") {return calculatenumMax(dt3.r);}
else return InnerRadious(model1.arenas.s);
//if (dt3.ax=="y") return calculateMaxY(dt3.r);
}

def calculateMinY(DefinitionThree dt3){ 
if (dt3.ax=='y') {return  calculatenumMin(dt3.r);}
else {return  -InnerRadious(model1.arenas.s);}
//if (dt3.ax=="y") return calculateMaxY(dt3.r);
}



def calculatenumMin(Range rg){
if (rg instanceof Interval) {return Math.round(Double.parseDouble(rg.n)*100.0)/100.0;}
}

def calculatenumMax(Range rg){
if (rg instanceof Interval) {return Math.round(Double.parseDouble(rg.m)*100.0)/100.0;}
}

def calculateAngle(int numEdges){
return Math.round(2*Math.toRadians(Math.PI)/numEdges*100.0)/100.0;
}

def returnRadius(Dimension1 d1){return d1.r;}



//calculate innerradius for a Region represented through DefinitionOne
def InnerRadious(Region r) {
  //val fInnerRadious = 0.0;
  if (r.numSides>0){
  return Math.round(Double.parseDouble(((r.region as DefinitionOne).dimensions as Dimension3).s)/(2.0 * Math.tan(Math.toRadians(180/r.numSides)))*100.0)/100.0;
  }
  else if (r.numSides==0) { return  Math.round(Double.parseDouble(((r.region as DefinitionOne).dimensions as Dimension1).r)*100.0)/100.0;}
  //return ((r.region instanceof DefinitionOne)
   //return (r.region instanceof DefinitionOne).compile(Dimension3);
  else if(r.region instanceof DefinitionThree){
  return -1;
 }
 
 }


//DefinitionOne df=r.region instanceof DefinitionOne;
  // return (df.dimensions instanceof Dimension1).compile;}

  // (2 * Math.tan(CRadians::PI / 6))»;
       //return fInnerRadious;


 
 
 



 def compile(Dimension1 dm1)
  '''«dm1.r»«IF dm1.h !==null»,«dm1.h»«ENDIF»'''



def compile(Dimension2 dm2)
  '''«dm2.l»,«dm2.w»,«dm2.h»'''


def compile(Dimension3 dm3)
  '''«dm3.s»'''





def comparemax(Double a, Double b){
	if (a<b) return b;
	return a;
}

def comparemin(Double a, Double b){
	if (a<b) return a;
	return b;
}

def maxPointX(Position a, Position b){
	if ((a.point instanceof Coordinate2D && b.point instanceof Coordinate2D))
	{return comparemax(Double.parseDouble((a.point as Coordinate2D).x),Double.parseDouble((b.point as Coordinate2D).x));}
	return -1.0;
}

def maxPointY(Position a, Position b){
	if ((a.point instanceof Coordinate2D && b.point instanceof Coordinate2D))
	{return comparemax(Double.parseDouble((a.point as Coordinate2D).y),Double.parseDouble((b.point as Coordinate2D).y));}
	return -1.0;
}

def minPointX(Position a, Position b){
	if ((a.point instanceof Coordinate2D && b.point instanceof Coordinate2D))
	{return comparemin(Double.parseDouble((a.point as Coordinate2D).x),Double.parseDouble((b.point as Coordinate2D).x));}
	return -1.0;
}

def minPointY(Position a, Position b){
	if ((a.point instanceof Coordinate2D && b.point instanceof Coordinate2D))
	{return comparemin(Double.parseDouble((a.point as Coordinate2D).y),Double.parseDouble((b.point as Coordinate2D).y));}
	return -1.0;
}


def calculateMinX(DefinitionTwo dt2){
	var element = 10.0;
	var temp=0.0;
	for (i : 0 ..< dt2.point.size-1) {
	 	temp=minPointX(dt2.point.get(i), dt2.point.get(i+1));
	 	if (temp<element)element=temp;
	}		
	return element;
}



def calculateMaxX(DefinitionTwo dt2){
	var element = -10.0;
	var temp=0.0;
	for (i : 0 ..< dt2.point.size-1) {
	 	temp=maxPointX(dt2.point.get(i), dt2.point.get(i+1));
	 	if (temp>element)element=temp;
	}		
	return element;
}



def calculateMaxY(DefinitionTwo dt2){
	var element = -10.0;
	var temp=0.0;
	for (i : 0 ..< dt2.point.size-1) {
	 	temp=maxPointY(dt2.point.get(i), dt2.point.get(i+1));
	 	if (temp>element)element=temp;
	}		
	return element;

}

def calculateMinY(DefinitionTwo dt2){ 
	var element = 10.0;
	var temp=0.0;
	for (i : 0 ..< dt2.point.size-1) {
	 	temp=minPointY(dt2.point.get(i), dt2.point.get(i+1));
	 	if (temp<element)element=temp;
	}		
	return element;

}


def UniformRepresent(Region zt)
'''«IF zt.region instanceof DefinitionThree»min="«(calculateMinX(zt.region as DefinitionThree))
»,«calculateMinY(zt.region as DefinitionThree)»,0" max="«calculateMaxX(zt.region as DefinitionThree)
»,«calculateMaxY(zt.region as DefinitionThree).toString()
»,0" />
 «ELSEIF zt.region instanceof DefinitionTwo»min="«(calculateMinX(zt.region as DefinitionTwo))
 »,«calculateMinY(zt.region as DefinitionTwo)»,0" max="«calculateMaxX(zt.region as DefinitionTwo)
 »,«calculateMaxY(zt.region as DefinitionTwo).toString()
 »,0" />
«ELSE»min="«((-calculateMax(InnerRadious(zt)))+((zt.region as DefinitionOne).referencepoint.point as Coordinate2D).x).toString()
»,«(-calculateMax(InnerRadious(zt))+((zt.region as DefinitionOne).referencepoint.point as Coordinate2D).y).toString()
»,0" max="«(calculateMax(InnerRadious(zt))+((zt.region as DefinitionOne).referencepoint.point as Coordinate2D).x).toString()
»,«(calculateMax(InnerRadious(zt))+((zt.region as DefinitionOne).referencepoint.point as Coordinate2D).y).toString()
»,0" />«ENDIF»
'''


def GaussianRepresent()
''' mean="0,0,0" std_dev="360,0,0" />'''

def compile(Swarmconf sw)''' <distribute>
            <position method="«sw.pr.dis»" «IF sw.pr.dis == "Uniform"» «UniformRepresent(sw.pr.k)»«ELSEIF sw.pr.dis  == "Gaussian"»«GaussianRepresent()»«ENDIF»
            <orientation method="«sw.pr.dis»" «IF sw.pr.dis == "Uniform"» min="0,0,0" max="90,0,0" />«ELSEIF sw.pr.dis  == "Gaussian"»GaussianRepresent()«ENDIF»
            <entity quantity="«calculatenumRobotsMax(sw.x)»" max_trials="100">
              <«sw.r» id="«sw.r.toString»">
                <controller «IF sw.r == "foot-boot"» config="fdc"«ELSEIF sw.r  == "e- puck"» config="automode"«ENDIF» />
              </«sw.r» >
           </entity>
          </distribute>  
        '''


//def UniformRepresent(ProbabilisticDecription pr)
//	'''«IF pr.k !=null»«UniformRepresent(pr.k)»
//	«ELSEIF pr.k !=null»«UniformRepresent(pr.k)»«ENDIF»'''





def compile(ElementDescription ed)''' <distribute>
            <position method="«ed.r.dis»" «IF ed.r.dis == "Uniform"» «UniformRepresent(ed.r.k)»«ELSEIF ed.r.dis  == "Gaussian"»«GaussianRepresent()»«ENDIF»
            <orientation method="«ed.r.dis»" «IF ed.r.dis == "Uniform"» min="0,0,0" max="90,0,0" />
            «ELSEIF ed.r.dis  == "Gaussian"»GaussianRepresent()«ENDIF»
            <entity quantity="«ed.x.n»" max_trials="100">
                <box   id="box_«Math.round(Math.random() *100)»" size="«ed.obj.d.compile»" «IF ed.obj !== null» mass="«ed.obj.w»"«ENDIF» movable="«check(ed.obj.ob).toString()»" />
           </entity>
          </distribute>  
        '''
def compile(Coordinate2D pt)
'''«pt.x»,«pt.y»'''
def compile(Coordinate3D pt)
'''«pt.x»,«pt.y»,«pt.z»'''

}









