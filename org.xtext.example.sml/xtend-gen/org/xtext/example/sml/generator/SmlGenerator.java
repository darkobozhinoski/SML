/**
 * generated by Xtext 2.16.0
 */
package org.xtext.example.sml.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.sml.sml.Arena;
import org.xtext.example.sml.sml.AtomicIndicator;
import org.xtext.example.sml.sml.CircleD;
import org.xtext.example.sml.sml.CompoundIndicator;
import org.xtext.example.sml.sml.Condition;
import org.xtext.example.sml.sml.Coordinate;
import org.xtext.example.sml.sml.Dimension;
import org.xtext.example.sml.sml.ElementDescription;
import org.xtext.example.sml.sml.Environment;
import org.xtext.example.sml.sml.EnvironmentElement;
import org.xtext.example.sml.sml.EnvironmentElements;
import org.xtext.example.sml.sml.Indicator;
import org.xtext.example.sml.sml.Light;
import org.xtext.example.sml.sml.MissionObjective;
import org.xtext.example.sml.sml.Model;
import org.xtext.example.sml.sml.Obstacle;
import org.xtext.example.sml.sml.Occurence;
import org.xtext.example.sml.sml.Penalty;
import org.xtext.example.sml.sml.Position;
import org.xtext.example.sml.sml.RectangleD;
import org.xtext.example.sml.sml.Region;
import org.xtext.example.sml.sml.Reward;
import org.xtext.example.sml.sml.Scope;
import org.xtext.example.sml.sml.Swarmconf;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class SmlGenerator extends AbstractGenerator {
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    final Model model = ((Model) _head);
    EObject _head_1 = IterableExtensions.<EObject>head(resource.getContents());
    Model model1 = ((Model) _head_1);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!-- ********* -->");
    _builder.newLine();
    _builder.append("<!-- * Arena * -->");
    _builder.newLine();
    _builder.append("<!-- ********* -->\t");
    _builder.newLine();
    _builder.append("\t        ");
    {
      Arena _arenas = model.getArenas();
      boolean _tripleNotEquals = (_arenas != null);
      if (_tripleNotEquals) {
        CharSequence _compile = this.compile(model.getArenas());
        _builder.append(_compile, "\t        ");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t      \t\t\t");
    {
      Swarmconf _sw = model.getSw();
      boolean _tripleNotEquals_1 = (_sw != null);
      if (_tripleNotEquals_1) {
        CharSequence _compile_1 = this.compile(model.getSw());
        _builder.append(_compile_1, "\t      \t\t\t");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t      \t\t\t");
    {
      Environment _env = model.getEnv();
      boolean _tripleNotEquals_2 = (_env != null);
      if (_tripleNotEquals_2) {
        CharSequence _compile_2 = this.compile(model.getEnv());
        _builder.append(_compile_2, "\t      \t\t\t");
        _builder.append(" ");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ******************* -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- * Physics engines * -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ******************* -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<physics_engines>");
    _builder.newLine();
    _builder.append("\t      \t\t    ");
    _builder.append("<dynamics2d id=\"dyn2d\" />");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("</physics_engines>");
    _builder.newLine();
    _builder.append("\t      \t\t");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ********* -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- * Media * -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ********* -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<media>");
    _builder.newLine();
    _builder.append("\t      \t\t    ");
    _builder.append("<led id=\"leds\" grid_size=\"1,1,1\"/>");
    _builder.newLine();
    _builder.append("\t      \t\t    ");
    _builder.append("<range_and_bearing id=\"ircom\"/>");
    _builder.newLine();
    _builder.append("\t      \t\t    ");
    _builder.append("<range_and_bearing id=\"rab\"/>");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("</media>");
    _builder.newLine();
    _builder.append("\t      \t\t");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ***************** -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- * Visualization * -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<!-- ***************** -->");
    _builder.newLine();
    _builder.append("\t      \t\t  ");
    _builder.append("<visualization/>");
    _builder.newLine();
    _builder.append("\t      \t\t");
    _builder.newLine();
    _builder.append("\t      \t\t");
    _builder.append("</argos-configuration>");
    _builder.newLine();
    fsa.generateFile("setup.xml", _builder);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(" ");
    _builder_1.append("#include \"mission.h\"");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("ChocolateMission1LoopFunction::ChocolateMission1LoopFunction(const ChocolateMission1LoopFunction& orig) {}");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("ChocolateMission1LoopFunction::~ChocolateMission1LoopFunction() {}");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("void ChocolateMission1LoopFunction::Destroy() {}");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("Real ChocolateMission1LoopFunction::GetObjectiveFunction() {}");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("/****************************************/");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("argos::CColor ChocolateMission1LoopFunction::GetFloorColor(const argos::CVector2& c_position_on_plane) {");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("CVector2 vCurrentPoint(c_position_on_plane.GetX(), c_position_on_plane.GetY());");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("Real d = (m_cCoordBlackSpot - vCurrentPoint).Length();");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("if (d <= m_fRadius) {");
    _builder_1.newLine();
    _builder_1.append("     ");
    _builder_1.append("return CColor::BLACK;");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.newLine();
    _builder_1.append("   ");
    _builder_1.append("return CColor::GRAY50;");
    _builder_1.newLine();
    _builder_1.append(" ");
    _builder_1.append("}");
    _builder_1.newLine();
    {
      MissionObjective _ob = model1.getOb();
      boolean _tripleNotEquals_3 = (_ob != null);
      if (_tripleNotEquals_3) {
        CharSequence _compile_3 = this.compile(model1.getOb());
        _builder_1.append(_compile_3);
      }
    }
    _builder_1.append("  ");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("CVector3 ChocolateMission1LoopFunction::GetRandomPosition() {");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Real a;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Real b;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Real temp;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("a = m_pcRng->Uniform(CRange<Real>(0.0f, 1.0f));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("b = m_pcRng->Uniform(CRange<Real>(0.0f, 1.0f));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("// If b < a, swap them");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("if (b < a) {");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("temp = a;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("a = b;");
    _builder_1.newLine();
    _builder_1.append("    ");
    _builder_1.append("b = temp;");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Real fPosX = b * m_fDistributionRadius * cos(2 * CRadians::PI.GetValue() * (a/b));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("Real fPosY = b * m_fDistributionRadius * sin(2 * CRadians::PI.GetValue() * (a/b));");
    _builder_1.newLine();
    _builder_1.append("  ");
    _builder_1.append("return CVector3(fPosX, fPosY, 0);");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("REGISTER_LOOP_FUNCTIONS(ChocolateMission1LoopFunction, \"chocolate_mission1_loop_functions\");");
    _builder_1.newLine();
    fsa.generateFile("loopfunctions.cpp", _builder_1);
  }
  
  public CharSequence compile(final Arena A) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((A != null)) {
        _builder.append("<arena size=\"");
        CharSequence _compile = this.compile(A.getS().getDimensions());
        _builder.append(_compile);
        _builder.append("\" center=\"");
        CharSequence _compile_1 = this.compile(A.getS().getReferencepoint());
        _builder.append(_compile_1);
        _builder.append("\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t           ");
        CharSequence _compileWalls = this.compileWalls(Integer.valueOf(4));
        _builder.append(_compileWalls, "\t           ");
        _builder.append("</arena>");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Region d) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((d != null)) {
        CharSequence _compile = this.compile(d.getDimensions());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Environment en) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<EnvironmentElements> _environment = en.getEnvironment();
      for(final EnvironmentElements e : _environment) {
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        {
          if ((e instanceof ElementDescription)) {
            CharSequence _compile = this.compile(((ElementDescription) e));
            _builder.append(_compile);
            _builder.newLineIfNotEmpty();
          } else {
            if ((e instanceof EnvironmentElement)) {
              CharSequence _compile_1 = this.compile(((EnvironmentElement) e));
              _builder.append(_compile_1);
            }
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t       \t        ");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Swarmconf sw) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<distribute>");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("<position method=\"");
    String _dis = sw.getPr().getDis();
    _builder.append(_dis, "\t             ");
    _builder.append("\" ");
    {
      String _dis_1 = sw.getPr().getDis();
      boolean _equals = Objects.equal(_dis_1, "uniform");
      if (_equals) {
        _builder.append(" min=\"0,0,0\" max=\"");
        CharSequence _compile = this.compile(sw.getPr().getK());
        _builder.append(_compile, "\t             ");
        _builder.append("\" />");
      } else {
        String _dis_2 = sw.getPr().getDis();
        boolean _equals_1 = Objects.equal(_dis_2, "gaussian");
        if (_equals_1) {
          _builder.append(" mean=\"0,0,0\" std_dev=\"360,0,0\" />");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("<orientation method=\"");
    String _dis_3 = sw.getPr().getDis();
    _builder.append(_dis_3, "\t             ");
    _builder.append("\" ");
    {
      String _dis_4 = sw.getPr().getDis();
      boolean _equals_2 = Objects.equal(_dis_4, "uniform");
      if (_equals_2) {
        _builder.append(" min=\"0,0,0\" max=\"");
        CharSequence _compile_1 = this.compile(sw.getPr().getK());
        _builder.append(_compile_1, "\t             ");
        _builder.append("\" />");
      } else {
        String _dis_5 = sw.getPr().getDis();
        boolean _equals_3 = Objects.equal(_dis_5, "gaussian");
        if (_equals_3) {
          _builder.append(" mean=\"0,0,0\" std_dev=\"360,0,0\" />");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("<entity quantity=\"");
    int _n = sw.getX().getN();
    _builder.append(_n, "\t             ");
    _builder.append("\" max_trials=\"100\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t               ");
    _builder.append("<");
    String _r = sw.getR();
    _builder.append(_r, "\t               ");
    _builder.append(" id=\"");
    String _substring = sw.getR().toString().substring(0, 2);
    _builder.append(_substring, "\t               ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t                 ");
    _builder.append("<controller ");
    {
      String _r_1 = sw.getR();
      boolean _equals_4 = Objects.equal(_r_1, "foot-boot");
      if (_equals_4) {
        _builder.append(" config=\"fdc\"");
      } else {
        String _r_2 = sw.getR();
        boolean _equals_5 = Objects.equal(_r_2, "e-puck");
        if (_equals_5) {
          _builder.append(" config=\"automode\"");
        }
      }
    }
    _builder.append(" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t               ");
    _builder.append("</");
    String _r_3 = sw.getR();
    _builder.append(_r_3, "\t               ");
    _builder.append(" >");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("</entity>");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("</distribute>  ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Coordinate n) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((n != null)) {
        String _x = n.getX();
        _builder.append(_x);
        _builder.append(",");
        String _y = n.getY();
        _builder.append(_y);
      }
    }
    return _builder;
  }
  
  public CharSequence compileWalls(final Integer n) {
    StringConcatenation _builder = new StringConcatenation();
    {
      IntegerRange _upTo = new IntegerRange(0, (n).intValue());
      for(final Integer i : _upTo) {
        _builder.append("<box id=\"wall");
        _builder.append(n);
        _builder.append("\" size=\"2,0.1,0.5\" movable=\"false\">");
        _builder.newLineIfNotEmpty();
        _builder.append("\t            ");
        _builder.append("<body position=\"0,1,0\" orientation=\"0,0,0\" />");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t          ");
    _builder.append("</box>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final ElementDescription ed) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("<distribute>");
    _builder.newLine();
    _builder.append("\t             ");
    _builder.append("<position method=\"");
    String _dis = ed.getR().getDis();
    _builder.append(_dis, "\t             ");
    _builder.append("\" ");
    {
      String _dis_1 = ed.getR().getDis();
      boolean _equals = Objects.equal(_dis_1, "uniform");
      if (_equals) {
        _builder.append(" min=\"0,0,0\" max=\"");
        CharSequence _compile = this.compile(ed.getR().getK());
        _builder.append(_compile, "\t             ");
        _builder.append("\" />");
      } else {
        String _dis_2 = ed.getR().getDis();
        boolean _equals_1 = Objects.equal(_dis_2, "gaussian");
        if (_equals_1) {
          _builder.append(" mean=\"0,0,0\" std_dev=\"360,0,0\" />");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("<orientation method=\"");
    String _dis_3 = ed.getR().getDis();
    _builder.append(_dis_3, "\t             ");
    _builder.append("\" ");
    {
      String _dis_4 = ed.getR().getDis();
      boolean _equals_2 = Objects.equal(_dis_4, "uniform");
      if (_equals_2) {
        _builder.append(" min=\"0,0,0\" max=\"");
        CharSequence _compile_1 = this.compile(ed.getR().getK());
        _builder.append(_compile_1, "\t             ");
        _builder.append("\" />");
      } else {
        String _dis_5 = ed.getR().getDis();
        boolean _equals_3 = Objects.equal(_dis_5, "gaussian");
        if (_equals_3) {
          _builder.append(" mean=\"0,0,0\" std_dev=\"360,0,0\" />");
        }
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t             ");
    _builder.append("<entity quantity=\"");
    int _n = ed.getX().getN();
    _builder.append(_n, "\t             ");
    _builder.append("\" max_trials=\"100\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t                 ");
    _builder.append("<box id=\"b");
    double _random = Math.random();
    double _multiply = (_random * 100);
    _builder.append(_multiply, "\t                 ");
    _builder.append("\" size=\"");
    double _random_1 = Math.random();
    double _multiply_1 = (_random_1 * 49);
    double _plus = (_multiply_1 + 1);
    _builder.append(_plus, "\t                 ");
    _builder.append(",");
    double _random_2 = Math.random();
    double _multiply_2 = (_random_2 * 49);
    double _plus_1 = (_multiply_2 + 1);
    _builder.append(_plus_1, "\t                 ");
    _builder.append(",");
    double _random_3 = Math.random();
    double _multiply_3 = (_random_3 * 49);
    double _plus_2 = (_multiply_3 + 1);
    _builder.append(_plus_2, "\t                 ");
    _builder.append("\" movable=\"false\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("</entity>");
    _builder.newLine();
    _builder.append("\t           ");
    _builder.append("</distribute>  ");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final EnvironmentElement en) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((en instanceof Obstacle)) {
        _builder.newLineIfNotEmpty();
        CharSequence _compile = this.compile(((Obstacle) en));
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
      } else {
        if ((en instanceof org.xtext.example.sml.sml.Object)) {
          CharSequence _compile_1 = this.compile(((org.xtext.example.sml.sml.Object) en));
          _builder.append(_compile_1);
          _builder.newLineIfNotEmpty();
        } else {
          if ((en instanceof Light)) {
            CharSequence _compile_2 = this.compile(((Light) en));
            _builder.append(_compile_2);
            _builder.newLineIfNotEmpty();
            _builder.append("\t       \t        ");
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Obstacle ob) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<box id=\"wall");
    double _random = Math.random();
    double _multiply = (_random * 100);
    _builder.append(_multiply);
    _builder.append("\" size=\"");
    CharSequence _compile = this.compile(ob.getR().getDimensions());
    _builder.append(_compile);
    _builder.append("\" movable=\"false\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<body position=\"");
    CharSequence _compile_1 = this.compile(ob.getR().getReferencepoint());
    _builder.append(_compile_1, "\t            ");
    _builder.append("\" orientation=\"0,0,0\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t          ");
    _builder.append("</box>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final org.xtext.example.sml.sml.Object ob) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<box id=\"wall");
    double _random = Math.random();
    double _multiply = (_random * 100);
    _builder.append(_multiply);
    _builder.append("\" size=\"");
    CharSequence _compile = this.compile(ob.getR().getDimensions());
    _builder.append(_compile);
    _builder.append("\" movable=\"true\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t            ");
    _builder.append("<body position=\"");
    CharSequence _compile_1 = this.compile(ob.getR().getReferencepoint());
    _builder.append(_compile_1, "\t            ");
    _builder.append("\" orientation=\"0,0,0\" />");
    _builder.newLineIfNotEmpty();
    _builder.append("\t          ");
    _builder.append("</box>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final Light l) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<light id=\"light");
    double _random = Math.random();
    double _multiply = (_random * 100);
    _builder.append(_multiply);
    _builder.append("\" position=\"");
    CharSequence _compile = this.compile(l.getP());
    _builder.append(_compile);
    _builder.append("\" orientation=\"0,0,0\" color=\"");
    String _c = l.getC();
    _builder.append(_c);
    _builder.append("\" intensity=\"0.0\" medium=\"leds\"/>");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compile(final Dimension d) {
    CharSequence _xifexpression = null;
    if ((d instanceof RectangleD)) {
      _xifexpression = this.compile(((RectangleD) d));
    } else {
      CharSequence _xifexpression_1 = null;
      if ((d instanceof CircleD)) {
        _xifexpression_1 = this.compile(((CircleD) d));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final Position pt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((pt != null)) {
        CharSequence _compile = this.compile(pt.getPoint());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final RectangleD k) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((k != null)) {
        String _l = k.getL();
        _builder.append(_l);
        _builder.append(", ");
        String _w = k.getW();
        _builder.append(_w);
        _builder.append(", ");
        String _h = k.getH();
        _builder.append(_h);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final CircleD k) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((k != null)) {
        String _r = k.getR();
        _builder.append(_r);
        _builder.append(" ");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final MissionObjective ob) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Indicator> _in = ob.getIn();
      for(final Indicator o : _in) {
        CharSequence _compile = this.compile(o);
        _builder.append(_compile);
        _builder.newLineIfNotEmpty();
        _builder.append("          ");
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Indicator in) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("          ");
    {
      if ((in != null)) {
        CharSequence _compile = this.compile(in.getSp());
        _builder.append(_compile, "          ");
      }
    }
    _builder.newLineIfNotEmpty();
    {
      EObject _oc = in.getOc();
      if ((_oc instanceof AtomicIndicator)) {
        EObject _oc_1 = in.getOc();
        CharSequence _compile_1 = this.compile(((AtomicIndicator) _oc_1));
        _builder.append(_compile_1);
        _builder.newLineIfNotEmpty();
      } else {
        EObject _oc_2 = in.getOc();
        if ((_oc_2 instanceof CompoundIndicator)) {
          EObject _oc_3 = in.getOc();
          CharSequence _compile_2 = this.compile(((CompoundIndicator) _oc_3));
          _builder.append(_compile_2);
          _builder.newLineIfNotEmpty();
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Scope s) {
    StringConcatenation _builder = new StringConcatenation();
    {
      int _length = s.getSp().length();
      boolean _tripleEquals = (_length == 20);
      if (_tripleEquals) {
        _builder.newLineIfNotEmpty();
        _builder.append("void ChocolateMission1LoopFunction::PostStep() {");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("CSpace::TMapPerType& tEpuckMap = GetSpace().GetEntitiesByType(\"epuck\");");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("CVector2 cEpuckPosition(0,0);");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("for (CSpace::TMapPerType::iterator it = tEpuckMap.begin(); it != tEpuckMap.end(); ++it) {");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("CEPuckEntity* pcEpuck = any_cast<CEPuckEntity*>(it->second);");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("cEpuckPosition.Set(pcEpuck->GetEmbodiedEntity().GetOriginAnchor().Position.GetX(),");
        _builder.newLine();
        _builder.append("                       ");
        _builder.append("pcEpuck->GetEmbodiedEntity().GetOriginAnchor().Position.GetY());");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("Real fDistanceSpot = (m_cCoordBlackSpot - cEpuckPosition).Length();");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("if (fDistanceSpot <= m_fRadius) {");
        _builder.newLine();
        _builder.append("      ");
        _builder.append("m_unScoreSpot += reward;");
        _builder.newLine();
        _builder.append("    ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("}\t       ");
        _builder.newLine();
      } else {
        int _length_1 = s.getSp().length();
        boolean _tripleEquals_1 = (_length_1 == 25);
        if (_tripleEquals_1) {
          _builder.append("void ChocolateSPCLoopFunction::PostExperiment() {");
          _builder.newLine();
          _builder.append("   ");
          _builder.append("CSpace::TMapPerType& tEpuckMap = GetSpace().GetEntitiesByType(\"epuck\");");
          _builder.newLine();
          _builder.append("  \t         ");
          _builder.append("CVector2 cEpuckPosition(0,0);");
          _builder.newLine();
          _builder.append("  \t         ");
          _builder.append("for (CSpace::TMapPerType::iterator it = tEpuckMap.begin(); it != tEpuckMap.end(); ++it) {");
          _builder.newLine();
          _builder.append("  \t           ");
          _builder.append("CEPuckEntity* pcEpuck = any_cast<CEPuckEntity*>(it->second);");
          _builder.newLine();
          _builder.append("  \t           ");
          _builder.append("cEpuckPosition.Set(pcEpuck->GetEmbodiedEntity().GetOriginAnchor().Position.GetX(),");
          _builder.newLine();
          _builder.append("  \t                              ");
          _builder.append("pcEpuck->GetEmbodiedEntity().GetOriginAnchor().Position.GetY());");
          _builder.newLine();
          _builder.append("  \t           ");
          _builder.append("Real fDistanceSpot = (m_cCoordBlackSpot - cEpuckPosition).Length();");
          _builder.newLine();
          _builder.append("  \t           ");
          _builder.append("if(IsOnSquareArea(cEpuckPosition))  m_unScoreSpot += reward;");
          _builder.newLine();
          _builder.append("  \t           ");
          _builder.newLine();
          _builder.append("  \t         ");
          _builder.newLine();
          _builder.append("  \t ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _builder.append("\t      ");
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final AtomicIndicator ai) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((ai != null)) {
        CharSequence _compile = this.compile(ai.getOc());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final CompoundIndicator ci) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((ci != null)) {
        CharSequence _compile = this.compile(ci.getOc());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Occurence oc) {
    CharSequence _xifexpression = null;
    if ((oc instanceof Reward)) {
      _xifexpression = this.compile(((Reward) oc));
    } else {
      CharSequence _xifexpression_1 = null;
      if ((oc instanceof Penalty)) {
        _xifexpression_1 = this.compile(((Penalty) oc));
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence compile(final Reward r) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((r != null)) {
        _builder.newLineIfNotEmpty();
        _builder.append("ChocolateMission1LoopFunction::ChocolateMission1LoopFunction() {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("m_unScoreSpot = 0;");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("m_fObjectiveFunction = 0;");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("reward =");
        String _k = r.getK();
        _builder.append(_k, "\t\t\t\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        CharSequence _compile = this.compile(r.getC());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Penalty p) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((p != null)) {
        _builder.newLineIfNotEmpty();
        _builder.append("ChocolateMission1LoopFunction::ChocolateMission1LoopFunction() {");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("m_unScoreSpot = 0;");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("m_fObjectiveFunction = 0;");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t");
        _builder.append("reward =");
        String _k = p.getK();
        _builder.append(_k, "\t\t\t\t\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        CharSequence _compile = this.compile(p.getC());
        _builder.append(_compile);
      }
    }
    return _builder;
  }
  
  public CharSequence compile(final Condition c) {
    StringConcatenation _builder = new StringConcatenation();
    {
      Dimension _dimensions = c.getR().getDimensions();
      if ((_dimensions instanceof CircleD)) {
        _builder.append("m_unScoreSpot = 0;");
        _builder.newLine();
        _builder.append("m_fRadius= ");
        CharSequence _compile = this.compile(c.getR().getDimensions());
        _builder.append(_compile);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append("m_cCoordBlackSport = CVector2(");
        CharSequence _compile_1 = this.compile(c.getR().getReferencepoint());
        _builder.append(_compile_1);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("            \t          \t\t\t\t\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t       \t       ");
        _builder.append("bool ChocolateMission1LoopFunction::IsOnCircleArea(CVector2 c_point) {");
        _builder.newLine();
        _builder.append("\t       \t           ");
        _builder.append("Real fDistanceSpot = (c_point - m_cCoordCircleSpot).Length();");
        _builder.newLine();
        _builder.append("\t       \t           ");
        _builder.append("if (fDistanceSpot <= m_fRadius){");
        _builder.newLine();
        _builder.append("\t       \t               ");
        _builder.append("return true;");
        _builder.newLine();
        _builder.append("\t       \t           ");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t       \t           ");
        _builder.append("return false;");
        _builder.newLine();
        _builder.append("\t       \t       ");
        _builder.append("}");
        _builder.newLine();
      } else {
        Dimension _dimensions_1 = c.getR().getDimensions();
        if ((_dimensions_1 instanceof RectangleD)) {
          _builder.append("}");
          _builder.newLine();
          _builder.append("bool ChocolateSPCLoopFunction::IsOnSquareArea(CVector2 c_point){");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("CRange<Real> cRangeSquareX(m_cCoordSquareSpot.GetX() - m_fSideSquare/2.0f, m_cCoordSquareSpot.GetX() + m_fSideSquare/2.0f);");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("CRange<Real> cRangeSquareY(m_cCoordSquareSpot.GetY() - m_fSideSquare/2.0f, m_cCoordSquareSpot.GetY() + m_fSideSquare/2.0f);");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("if (cRangeSquareX.WithinMinBoundIncludedMaxBoundIncluded(c_point.GetX()) &&");
          _builder.newLine();
          _builder.append("            ");
          _builder.append("cRangeSquareY.WithinMinBoundIncludedMaxBoundIncluded(c_point.GetY())) {");
          _builder.newLine();
          _builder.append("        ");
          _builder.append("return true;");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("}");
          _builder.newLine();
          _builder.append("    ");
          _builder.append("return false;");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _builder.append(" ");
        }
      }
    }
    return _builder;
  }
}
