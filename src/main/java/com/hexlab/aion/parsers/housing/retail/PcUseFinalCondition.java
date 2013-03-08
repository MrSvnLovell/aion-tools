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
 * <p>Java class for PcUseFinalCondition.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PcUseFinalCondition">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *     &lt;enumeration value="0"/>
 *     &lt;enumeration value="1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "PcUseFinalCondition")
@XmlEnum(Byte.class)
public enum PcUseFinalCondition {

    @XmlEnumValue("0")
    TRUE(((byte) 0)),
    @XmlEnumValue("1")
    FALSE(((byte) 1));
    private final byte value;

    PcUseFinalCondition(byte v) {
        value = v;
    }

    public byte value() {
        return value;
    }

    public static PcUseFinalCondition fromValue(byte v) {
        for (PcUseFinalCondition c : PcUseFinalCondition.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
