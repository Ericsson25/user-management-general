//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 10:02:07 PM CEST 
//


package manuscript.module.user.management.request;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the manuscript.module.user.management.request package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: manuscript.module.user.management.request
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserRegistrationRequest }
     * 
     */
    public UserRegistrationRequest createUserRegistrationRequest() {
        return new UserRegistrationRequest();
    }

    /**
     * Create an instance of {@link SavePersonalDataRequest }
     * 
     */
    public SavePersonalDataRequest createSavePersonalDataRequest() {
        return new SavePersonalDataRequest();
    }

    /**
     * Create an instance of {@link ChangePasswordRequest }
     * 
     */
    public ChangePasswordRequest createChangePasswordRequest() {
        return new ChangePasswordRequest();
    }

    /**
     * Create an instance of {@link UpdatePassword }
     * 
     */
    public UpdatePassword createUpdatePassword() {
        return new UpdatePassword();
    }

    /**
     * Create an instance of {@link UpdateAcademicDisciplinesRequest }
     * 
     */
    public UpdateAcademicDisciplinesRequest createUpdateAcademicDisciplinesRequest() {
        return new UpdateAcademicDisciplinesRequest();
    }

}
