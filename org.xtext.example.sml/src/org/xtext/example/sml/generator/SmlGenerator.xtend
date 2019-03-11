/*
 * generated by Xtext 2.16.0
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
import org.xtext.example.sml.sml.Coordinate
import org.xtext.example.sml.sml.Dimension
//import org.xtext.example.sml.sml.RectnagleD
import org.xtext.example.sml.sml.Region
import org.xtext.example.sml.sml.Arena
import org.xtext.example.sml.sml.Position
import org.xtext.example.sml.sml.RectangleD
import org.xtext.example.sml.sml.Swarmconf
import org.xtext.example.sml.sml.CircleD
import org.xtext.example.sml.sml.Light
import org.xtext.example.sml.sml.Obstacle
import org.xtext.example.sml.sml.Object
import org.xtext.example.sml.sml.EnvironmentElement
import org.xtext.example.sml.sml.EnvironmentElements
import org.xtext.example.sml.sml.ProbabilisticDecription
import org.xtext.example.sml.sml.Environment
import org.xtext.example.sml.sml.ElementDescription
import java.util.Random;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class SmlGenerator extends AbstractGenerator {
	@Inject extension IQualifiedNameProvider
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	
     val model = resource.contents.head as Model
		fsa.generateFile('setup.xml', '''
		  <!-- ********* -->
		  <!-- * Arena * -->
		  <!-- ********* -->	
	        �IF model.arenas !== null��model.arenas.compile� �ENDIF�
	      			�IF model.sw !== null��model.sw.compile� �ENDIF�
	      			�IF model.env !== null��model.env.compile� �ENDIF�
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
	      		  <visualization/>
	      		
	      		</argos-configuration>
	      		''')
	          	
	          	
	          	
	             // for (e : resource.allContents.toIterable.filter(Entity)) {
	               //   fsa.generateFile(
	                //      e.fullyQualifiedName.toString("/") + ".java",
	                 //     e.compile)
	                 
	                 		//FOR Arena t : model.arenas�
	      		 	//	t.compile�
	      			//ENDFOR�
	              //}
	          }
	          
	      
	          
	           def compile(Arena A) 
	           '''�IF A !== null�<arena size="�A.s.dimensions.compile�" center="�A.s.referencepoint.compile�">
	           �compileWalls(4)�</arena>�ENDIF�'''
	          
	        def compile(Region d) '''�IF d !== null��d.dimensions.compile��ENDIF�'''
	        
	       def compile(Environment en) {
	       	'''�FOR e: en.environment� 
	       			�IF e instanceof ElementDescription�
	       	        �(e as ElementDescription).compile�
	       	        �ELSEIF e instanceof EnvironmentElement�
	       	        �(e as EnvironmentElement).compile��ENDIF�
	       	        �ENDFOR�'''
	       }
	       
	       	
	       	//for (e: en.environment) 
	       		//if (e instanceof EnvironmentElement)
	             	//(e as EnvironmentElement).compile
	          //   if (e instanceof ElementDescription)
	            //    (e as ElementDescription).compile
	             //else compileWalls(7);
	      
	          
	        def compile(Swarmconf sw)''' <distribute>
	             <position method="�sw.pr.dis�" �IF sw.pr.dis == "uniform"� min="0,0,0" max="�sw.pr.k.compile�" />�ELSEIF sw.pr.dis  == "gaussian"� mean="0,0,0" std_dev="360,0,0" />�ENDIF�
	             <orientation method="�sw.pr.dis�" �IF sw.pr.dis == "uniform"� min="0,0,0" max="�sw.pr.k.compile�" />�ELSEIF sw.pr.dis  == "gaussian"� mean="0,0,0" std_dev="360,0,0" />�ENDIF�
	             <entity quantity="�sw.x.n�" max_trials="100">
	               <�sw.r� id="�sw.r.toString.substring(0,2)�">
	                 <controller �IF sw.r == "foot-boot"� config="fdc"�ELSEIF sw.r  == "e-puck"� config="automode"�ENDIF� />
	               </�sw.r� >
	            </entity>
	           </distribute>  
	         '''
	        
	        
	             
	      def compile(Coordinate n) '''�IF n !== null��n.x�,�n.y��ENDIF�'''
	       
	       def compileWalls(Integer n){
	       	'''�FOR i: 0..n�<box id="wall�n�" size="2,0.1,0.5" movable="false">
	            <body position="0,1,0" orientation="0,0,0" />�ENDFOR�
	          </box>
	          '''
	          } 
	       
	       
	        def compile(ElementDescription ed)''' <distribute>
	             <position method="�ed.r.dis�" �IF ed.r.dis == "uniform"� min="0,0,0" max="�ed.r.k.compile�" />�ELSEIF ed.r.dis  == "gaussian"� mean="0,0,0" std_dev="360,0,0" />�ENDIF�
	             <orientation method="�ed.r.dis�" �IF ed.r.dis == "uniform"� min="0,0,0" max="�ed.r.k.compile�" />�ELSEIF ed.r.dis  == "gaussian"� mean="0,0,0" std_dev="360,0,0" />�ENDIF�
	             <entity quantity="�ed.x.n�" max_trials="100">
	                 <box id="b�Math.random() *100�" size="�Math.random() * 49 + 1�,�Math.random() * 49 + 1�,�Math.random() * 49 + 1�" movable="false" />
	            </entity>
	           </distribute>  
	         '''
	        
	        
	       def compile(EnvironmentElement en)
	       	'''�IF en instanceof Obstacle�
	       	        �(en as Obstacle).compile�
	       	        �ELSEIF en instanceof Object�
	       	        �(en as Object).compile�
	       	         �ELSEIF en instanceof Light�
	       	          �(en as Light).compile�
	       	        �ENDIF�'''
	       	  
	        
	      
	      
	      // if (en instanceof Obstacle)
	        //      	(en as Obstacle).compile
	          // else if (en instanceof Object)
	            //    (en as Object).compile
	           //else if(en instanceof Light)
	           //	(en as Light).compile
	           //'''<darko12/>'''
	        
	      def compile(Obstacle ob)
	      	'''<box id="wall�Math.random() *100�" size="�ob.r.dimensions.compile�" movable="false">
	            <body position="�ob.r.referencepoint.compile�" orientation="0,0,0" />
	          </box>
	          '''
	      	
	      
	      
	      def compile(Object ob)
	      		'''<box id="wall�Math.random() *100�" size="�ob.r.dimensions.compile�" movable="true">
	            <body position="�ob.r.referencepoint.compile�" orientation="0,0,0" />
	          </box>
	          '''
	          
	      def compile(Light l)
	      	'''<light id="light�Math.random() *100�" position="�l.p.compile�" orientation="0,0,0" color="�l.c�" intensity="0.0" medium="leds"/>
	          '''
	       
	         def compile(Dimension d){   
	              if (d instanceof RectangleD)
	              	(d as RectangleD).compile
	             else if (d instanceof CircleD)
	                (d as CircleD).compile
	             }
	             
	         def compile(Position pt) '''�IF pt !== null��pt.point.compile��ENDIF�'''
	                
	             
	      
	       
	       def compile(RectangleD k)'''�IF k !== null��k.l�, �k.w�, �k.h��ENDIF�'''
	       def compile(CircleD k)'''�IF k !== null��k.r� �ENDIF�'''
	          
	          
	          
	          
	      //    def compile(Entity e) ''' 
	      
	      
	      
	          // �d.referencepoint.compile� 
	          
	          
	          
	          
	      //        �IF e.eContainer.fullyQualifiedName !== null�
	      //            package �e.eContainer.fullyQualifiedName�;
	      //        �ENDIF�
	      //        
	      //        public class �e.name� �IF e.superType !== null
	      //                �extends �e.superType.fullyQualifiedName� �ENDIF�{
	      //            �FOR f : e.features�
	      //                �f.compile�
	      //            �ENDFOR�
	      //        }
	      //    '''
	      // 
	      //    def compile(Feature f) '''
	      //        private �f.type.fullyQualifiedName� �f.name�;
	      //        
	      //        public �f.type.fullyQualifiedName� get�f.name.toFirstUpper�() {
	      //            return �f.name�;
	      //        }
	      //        
	      //        public void set�f.name.toFirstUpper�(�f.type.fullyQualifiedName� �f.name�) {
	      //            this.�f.name� = �f.name�;
	      //        }
	      //    '''
	      }
	      
	      
	      //    ;
	      
	        
	       