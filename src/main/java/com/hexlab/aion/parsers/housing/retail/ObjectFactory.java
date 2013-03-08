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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the generated package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */

/**
 * @author hex1r0
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ClientHousingObjects_QNAME = new QName("", "client_housing_objects");
    private final static QName _ClientHousingObjectPlaceTags_QNAME = new QName("", "client_housing_object_place_tags");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClientHousingObjectPlaceTagsType }
     */
    public ClientHousingObjectPlaceTagsType createClientHousingObjectPlaceTagsType() {
        return new ClientHousingObjectPlaceTagsType();
    }

    /**
     * Create an instance of {@link ClientHousingObjectsType }
     */
    public ClientHousingObjectsType createClientHousingObjectsType() {
        return new ClientHousingObjectsType();
    }

    /**
     * Create an instance of {@link ClientHousingObjectType }
     */
    public ClientHousingObjectType createClientHousingObjectType() {
        return new ClientHousingObjectType();
    }

    /**
     * Create an instance of {@link ClientHousingObjectPlaceTagType }
     */
    public ClientHousingObjectPlaceTagType createClientHousingObjectPlaceTagType() {
        return new ClientHousingObjectPlaceTagType();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ClientHousingObjectsType }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "client_housing_objects")
    public JAXBElement<ClientHousingObjectsType> createClientHousingObjects(ClientHousingObjectsType value) {
        return new JAXBElement<ClientHousingObjectsType>(_ClientHousingObjects_QNAME, ClientHousingObjectsType.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ClientHousingObjectPlaceTagsType }{@code >}}
     */
    @XmlElementDecl(namespace = "", name = "client_housing_object_place_tags")
    public JAXBElement<ClientHousingObjectPlaceTagsType> createClientHousingObjectPlaceTags(ClientHousingObjectPlaceTagsType value) {
        return new JAXBElement<ClientHousingObjectPlaceTagsType>(_ClientHousingObjectPlaceTags_QNAME, ClientHousingObjectPlaceTagsType.class, null, value);
    }

}
