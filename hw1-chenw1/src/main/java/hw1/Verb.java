

/* First created by JCasGen Thu Dec 05 17:52:35 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Thu Dec 05 17:52:35 EST 2013
 * XML source: /home/yicaoyimu/git/hw1-chenw1/hw1-chenw1/src/main/resources/hw1-chenw1-typesystem.xml
 * @generated */
public class Verb extends Base {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Verb.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Verb() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public Verb(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Verb(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public Verb(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: content

  /** getter for content - gets The actual content of the verb.
   * @generated */
  public String getContent() {
    if (Verb_Type.featOkTst && ((Verb_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "hw1.Verb");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Verb_Type)jcasType).casFeatCode_content);}
    
  /** setter for content - sets The actual content of the verb. 
   * @generated */
  public void setContent(String v) {
    if (Verb_Type.featOkTst && ((Verb_Type)jcasType).casFeat_content == null)
      jcasType.jcas.throwFeatMissing("content", "hw1.Verb");
    jcasType.ll_cas.ll_setStringValue(addr, ((Verb_Type)jcasType).casFeatCode_content, v);}    
  }

    