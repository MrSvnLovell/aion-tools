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

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PlaceArea.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PlaceArea">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="interior"/>
 *     &lt;enumeration value="exterior"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "PlaceArea")
@XmlEnum
public enum PlaceArea {

    @XmlEnumValue("interior")
    INTERIOR("interior"),
    @XmlEnumValue("exterior")
    EXTERIOR("exterior"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    PlaceArea(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceArea fromValue(String v) {
        for (PlaceArea c : PlaceArea.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
