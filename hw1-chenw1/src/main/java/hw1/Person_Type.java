
/* First created by JCasGen Thu Dec 05 17:52:35 EST 2013 */
package hw1;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;

/** 
 * Updated by JCasGen Thu Dec 05 17:52:35 EST 2013
 * @generated */
public class Person_Type extends Base_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Person_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Person_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Person(addr, Person_Type.this);
  			   Person_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Person(addr, Person_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Person.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("hw1.Person");
 
  /** @generated */
  final Feature casFeat_isSubject;
  /** @generated */
  final int     casFeatCode_isSubject;
  /** @generated */ 
  public boolean getIsSubject(int addr) {
        if (featOkTst && casFeat_isSubject == null)
      jcas.throwFeatMissing("isSubject", "hw1.Person");
    return ll_cas.ll_getBooleanValue(addr, casFeatCode_isSubject);
  }
  /** @generated */    
  public void setIsSubject(int addr, boolean v) {
        if (featOkTst && casFeat_isSubject == null)
      jcas.throwFeatMissing("isSubject", "hw1.Person");
    ll_cas.ll_setBooleanValue(addr, casFeatCode_isSubject, v);}
    
  
 
  /** @generated */
  final Feature casFeat_name;
  /** @generated */
  final int     casFeatCode_name;
  /** @generated */ 
  public String getName(int addr) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "hw1.Person");
    return ll_cas.ll_getStringValue(addr, casFeatCode_name);
  }
  /** @generated */    
  public void setName(int addr, String v) {
        if (featOkTst && casFeat_name == null)
      jcas.throwFeatMissing("name", "hw1.Person");
    ll_cas.ll_setStringValue(addr, casFeatCode_name, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public Person_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_isSubject = jcas.getRequiredFeatureDE(casType, "isSubject", "uima.cas.Boolean", featOkTst);
    casFeatCode_isSubject  = (null == casFeat_isSubject) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_isSubject).getCode();

 
    casFeat_name = jcas.getRequiredFeatureDE(casType, "name", "uima.cas.String", featOkTst);
    casFeatCode_name  = (null == casFeat_name) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_name).getCode();

  }
}



    