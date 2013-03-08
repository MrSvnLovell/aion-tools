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
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for client_housing_objectsType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="client_housing_objectsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="client_housing_object" type="{}client_housing_objectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="generated_time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_housing_objectsType", propOrder = {
    "clientHousingObject"
})
public class ClientHousingObjectsType
    implements Serializable {

    @XmlElement(name = "client_housing_object")
    protected List<ClientHousingObjectType> clientHousingObject;
    @XmlAttribute(name = "generated_time")
    protected String generatedTime;

    /**
     * Gets the value of the clientHousingObject property.
     * <p/>
     * <p/>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientHousingObject property.
     * <p/>
     * <p/>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientHousingObject().add(newItem);
     * </pre>
     * <p/>
     * <p/>
     * <p/>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientHousingObjectType }
     */
    public List<ClientHousingObjectType> getClientHousingObject() {
        if (clientHousingObject == null) {
            clientHousingObject = new ArrayList<ClientHousingObjectType>();
        }
        return this.clientHousingObject;
    }

    public boolean isSetClientHousingObject() {
        return ((this.clientHousingObject != null) && (!this.clientHousingObject.isEmpty()));
    }

    public void unsetClientHousingObject() {
        this.clientHousingObject = null;
    }

    /**
     * Gets the value of the generatedTime property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getGeneratedTime() {
        return generatedTime;
    }

    /**
     * Sets the value of the generatedTime property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setGeneratedTime(String value) {
        this.generatedTime = value;
    }

    public boolean isSetGeneratedTime() {
        return (this.generatedTime != null);
    }

}
