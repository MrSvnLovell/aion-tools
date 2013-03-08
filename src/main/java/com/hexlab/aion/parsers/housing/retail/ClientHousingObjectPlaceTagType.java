/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.hexlab.aion.parsers.housing.retail;

import java.io.Serializable;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for client_housing_object_place_tagType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="client_housing_object_place_tagType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="name" type="{}PlaceLimitTypeName"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personal_types_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="personal_typea_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="personal_typeb_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="personal_typec_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="personal_typed_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="trial_personal_types_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="trial_personal_typea_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="trial_personal_typeb_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="trial_personal_typec_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="trial_personal_typed_max" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_housing_object_place_tagType", propOrder = {
    "id",
    "name",
    "desc",
    "personalTypesMax",
    "personalTypeaMax",
    "personalTypebMax",
    "personalTypecMax",
    "personalTypedMax",
    "trialPersonalTypesMax",
    "trialPersonalTypeaMax",
    "trialPersonalTypebMax",
    "trialPersonalTypecMax",
    "trialPersonalTypedMax"
})
public class ClientHousingObjectPlaceTagType
    implements Serializable {

    protected byte id;
    @XmlElement(required = true)
    protected PlaceLimitTypeName name;
    protected String desc;
    @XmlElement(name = "personal_types_max")
    protected byte personalTypesMax;
    @XmlElement(name = "personal_typea_max")
    protected byte personalTypeaMax;
    @XmlElement(name = "personal_typeb_max")
    protected byte personalTypebMax;
    @XmlElement(name = "personal_typec_max")
    protected byte personalTypecMax;
    @XmlElement(name = "personal_typed_max")
    protected byte personalTypedMax;
    @XmlElement(name = "trial_personal_types_max")
    protected byte trialPersonalTypesMax;
    @XmlElement(name = "trial_personal_typea_max")
    protected byte trialPersonalTypeaMax;
    @XmlElement(name = "trial_personal_typeb_max")
    protected byte trialPersonalTypebMax;
    @XmlElement(name = "trial_personal_typec_max")
    protected byte trialPersonalTypecMax;
    @XmlElement(name = "trial_personal_typed_max")
    protected byte trialPersonalTypedMax;

    /**
     * Gets the value of the id property.
     */
    public byte getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(byte value) {
        this.id = value;
    }

    public boolean isSetId() {
        return true;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link PlaceLimitTypeName }
     */
    public PlaceLimitTypeName getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaceLimitTypeName }
     */
    public void setName(PlaceLimitTypeName value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    public boolean isSetDesc() {
        return (this.desc != null);
    }

    /**
     * Gets the value of the personalTypesMax property.
     */
    public byte getPersonalTypesMax() {
        return personalTypesMax;
    }

    /**
     * Sets the value of the personalTypesMax property.
     */
    public void setPersonalTypesMax(byte value) {
        this.personalTypesMax = value;
    }

    public boolean isSetPersonalTypesMax() {
        return true;
    }

    /**
     * Gets the value of the personalTypeaMax property.
     */
    public byte getPersonalTypeaMax() {
        return personalTypeaMax;
    }

    /**
     * Sets the value of the personalTypeaMax property.
     */
    public void setPersonalTypeaMax(byte value) {
        this.personalTypeaMax = value;
    }

    public boolean isSetPersonalTypeaMax() {
        return true;
    }

    /**
     * Gets the value of the personalTypebMax property.
     */
    public byte getPersonalTypebMax() {
        return personalTypebMax;
    }

    /**
     * Sets the value of the personalTypebMax property.
     */
    public void setPersonalTypebMax(byte value) {
        this.personalTypebMax = value;
    }

    public boolean isSetPersonalTypebMax() {
        return true;
    }

    /**
     * Gets the value of the personalTypecMax property.
     */
    public byte getPersonalTypecMax() {
        return personalTypecMax;
    }

    /**
     * Sets the value of the personalTypecMax property.
     */
    public void setPersonalTypecMax(byte value) {
        this.personalTypecMax = value;
    }

    public boolean isSetPersonalTypecMax() {
        return true;
    }

    /**
     * Gets the value of the personalTypedMax property.
     */
    public byte getPersonalTypedMax() {
        return personalTypedMax;
    }

    /**
     * Sets the value of the personalTypedMax property.
     */
    public void setPersonalTypedMax(byte value) {
        this.personalTypedMax = value;
    }

    public boolean isSetPersonalTypedMax() {
        return true;
    }

    /**
     * Gets the value of the trialPersonalTypesMax property.
     */
    public byte getTrialPersonalTypesMax() {
        return trialPersonalTypesMax;
    }

    /**
     * Sets the value of the trialPersonalTypesMax property.
     */
    public void setTrialPersonalTypesMax(byte value) {
        this.trialPersonalTypesMax = value;
    }

    public boolean isSetTrialPersonalTypesMax() {
        return true;
    }

    /**
     * Gets the value of the trialPersonalTypeaMax property.
     */
    public byte getTrialPersonalTypeaMax() {
        return trialPersonalTypeaMax;
    }

    /**
     * Sets the value of the trialPersonalTypeaMax property.
     */
    public void setTrialPersonalTypeaMax(byte value) {
        this.trialPersonalTypeaMax = value;
    }

    public boolean isSetTrialPersonalTypeaMax() {
        return true;
    }

    /**
     * Gets the value of the trialPersonalTypebMax property.
     */
    public byte getTrialPersonalTypebMax() {
        return trialPersonalTypebMax;
    }

    /**
     * Sets the value of the trialPersonalTypebMax property.
     */
    public void setTrialPersonalTypebMax(byte value) {
        this.trialPersonalTypebMax = value;
    }

    public boolean isSetTrialPersonalTypebMax() {
        return true;
    }

    /**
     * Gets the value of the trialPersonalTypecMax property.
     */
    public byte getTrialPersonalTypecMax() {
        return trialPersonalTypecMax;
    }

    /**
     * Sets the value of the trialPersonalTypecMax property.
     */
    public void setTrialPersonalTypecMax(byte value) {
        this.trialPersonalTypecMax = value;
    }

    public boolean isSetTrialPersonalTypecMax() {
        return true;
    }

    /**
     * Gets the value of the trialPersonalTypedMax property.
     */
    public byte getTrialPersonalTypedMax() {
        return trialPersonalTypedMax;
    }

    /**
     * Sets the value of the trialPersonalTypedMax property.
     */
    public void setTrialPersonalTypedMax(byte value) {
        this.trialPersonalTypedMax = value;
    }

    public boolean isSetTrialPersonalTypedMax() {
        return true;
    }

}
