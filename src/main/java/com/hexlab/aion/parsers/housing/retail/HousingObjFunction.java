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
 * <p>Java class for HousingObjFunction.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="HousingObjFunction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Chair"/>
 *     &lt;enumeration value="storage"/>
 *     &lt;enumeration value="postbox"/>
 *     &lt;enumeration value="npctype"/>
 *     &lt;enumeration value="picture"/>
 *     &lt;enumeration value="UseCount"/>
 *     &lt;enumeration value="jukebox"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "HousingObjFunction")
@XmlEnum
public enum HousingObjFunction {

    @XmlEnumValue("Chair")
    CHAIR("Chair"),
    @XmlEnumValue("storage")
    STORAGE("storage"),
    @XmlEnumValue("postbox")
    POSTBOX("postbox"),
    @XmlEnumValue("npctype")
    NPCTYPE("npctype"),
    @XmlEnumValue("picture")
    PICTURE("picture"),
    @XmlEnumValue("UseCount")
    USE_COUNT("UseCount"),
    @XmlEnumValue("jukebox")
    JUKEBOX("jukebox");
    private final String value;

    HousingObjFunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HousingObjFunction fromValue(String v) {
        for (HousingObjFunction c : HousingObjFunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
