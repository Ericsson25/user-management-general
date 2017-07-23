//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.23 at 08:15:36 AM CEST 
//


package manuscript.module.user.management.request;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import manuscript.module.user.management.bean.Password;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for changePasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changePasswordRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Password" type="{http://manuscript/module/user/management/bean}password"/&gt;
 *         &lt;element name="OldPassword" type="{http://manuscript/module/user/management/bean}passwordType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "changePasswordRequest", propOrder = {
    "password",
    "oldPassword"
})
public class ChangePasswordRequest implements HashCode2, ToString2
{

    @XmlElement(name = "Password", required = true)
    @NotNull
    @Valid
    protected Password password;
    @XmlElement(name = "OldPassword", required = true)
    @NotNull
    protected String oldPassword;

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link Password }
     *     
     */
    public Password getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link Password }
     *     
     */
    public void setPassword(Password value) {
        this.password = value;
    }

    /**
     * Gets the value of the oldPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the value of the oldPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldPassword(String value) {
        this.oldPassword = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Password thePassword;
            thePassword = this.getPassword();
            strategy.appendField(locator, this, "password", buffer, thePassword, (this.password!= null));
        }
        {
            String theOldPassword;
            theOldPassword = this.getOldPassword();
            strategy.appendField(locator, this, "oldPassword", buffer, theOldPassword, (this.oldPassword!= null));
        }
        return buffer;
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Password thePassword;
            thePassword = this.getPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "password", thePassword), currentHashCode, thePassword, (this.password!= null));
        }
        {
            String theOldPassword;
            theOldPassword = this.getOldPassword();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "oldPassword", theOldPassword), currentHashCode, theOldPassword, (this.oldPassword!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
