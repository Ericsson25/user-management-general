//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 10:02:07 PM CEST 
//


package manuscript.module.user.management.response;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.user.management.bean.AcademicDisciplines;
import manuscript.module.user.management.bean.BasicResponse;


/**
 * <p>Java class for userRegistrationPreloadResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userRegistrationPreloadResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://manuscript/module/user/management/bean}basicResponse"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcademicDisciplines" type="{http://manuscript/module/user/management/bean}academicDisciplines" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userRegistrationPreloadResponse", propOrder = {
    "academicDisciplines"
})
public class UserRegistrationPreloadResponse
    extends BasicResponse
{

    @XmlElement(name = "AcademicDisciplines", required = true)
    @NotNull
    @Size(min = 1)
    @Valid
    protected List<AcademicDisciplines> academicDisciplines;

    /**
     * Gets the value of the academicDisciplines property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicDisciplines property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicDisciplines().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicDisciplines }
     * 
     * 
     */
    public List<AcademicDisciplines> getAcademicDisciplines() {
        if (academicDisciplines == null) {
            academicDisciplines = new ArrayList<AcademicDisciplines>();
        }
        return this.academicDisciplines;
    }

    public void setAcademicDisciplines(List<AcademicDisciplines> value) {
        this.academicDisciplines = null;
        if (value!= null) {
            List<AcademicDisciplines> draftl = this.getAcademicDisciplines();
            draftl.addAll(value);
        }
    }

}
