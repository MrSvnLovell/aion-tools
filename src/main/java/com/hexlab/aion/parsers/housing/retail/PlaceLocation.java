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
 * <p>Java class for PlaceLocation.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PlaceLocation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Wall"/>
 *     &lt;enumeration value="Floor"/>
 *     &lt;enumeration value="stack"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "PlaceLocation")
@XmlEnum
public enum PlaceLocation {

    @XmlEnumValue("Wall")
    WALL("Wall"),
    @XmlEnumValue("Floor")
    FLOOR("Floor"),
    @XmlEnumValue("stack")
    STACK("stack");
    private final String value;

    PlaceLocation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceLocation fromValue(String v) {
        for (PlaceLocation c : PlaceLocation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
