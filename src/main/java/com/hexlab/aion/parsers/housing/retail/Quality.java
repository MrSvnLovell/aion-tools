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
 * <p>Java class for Quality.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="Quality">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="common"/>
 *     &lt;enumeration value="legend"/>
 *     &lt;enumeration value="rare"/>
 *     &lt;enumeration value="unique"/>
 *     &lt;enumeration value="epic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "Quality")
@XmlEnum
public enum Quality {

    @XmlEnumValue("common")
    COMMON("common"),
    @XmlEnumValue("legend")
    LEGEND("legend"),
    @XmlEnumValue("rare")
    RARE("rare"),
    @XmlEnumValue("unique")
    UNIQUE("unique"),
    @XmlEnumValue("epic")
    EPIC("epic");
    private final String value;

    Quality(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Quality fromValue(String v) {
        for (Quality c : Quality.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
