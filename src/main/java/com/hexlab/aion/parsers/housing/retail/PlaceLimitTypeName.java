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
 * <p>Java class for PlaceLimitTypeName.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="PlaceLimitTypeName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FlowerPot_owner"/>
 *     &lt;enumeration value="FlowerPot_visitor"/>
 *     &lt;enumeration value="Storage"/>
 *     &lt;enumeration value="FlowerPot"/>
 *     &lt;enumeration value="cookingTable"/>
 *     &lt;enumeration value="WallDeco_picture"/>
 *     &lt;enumeration value="Juke_box"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "PlaceLimitTypeName")
@XmlEnum
public enum PlaceLimitTypeName {

    @XmlEnumValue("FlowerPot_owner")
    FLOWER_POT_OWNER("FlowerPot_owner"),
    @XmlEnumValue("FlowerPot_visitor")
    FLOWER_POT_VISITOR("FlowerPot_visitor"),
    @XmlEnumValue("Storage")
    STORAGE("Storage"),
    @XmlEnumValue("FlowerPot")
    FLOWER_POT("FlowerPot"),
    @XmlEnumValue("cookingTable")
    COOKING_TABLE("cookingTable"),
    @XmlEnumValue("WallDeco_picture")
    WALL_DECO_PICTURE("WallDeco_picture"),
    @XmlEnumValue("Juke_box")
    JUKE_BOX("Juke_box");
    private final String value;

    PlaceLimitTypeName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlaceLimitTypeName fromValue(String v) {
        for (PlaceLimitTypeName c : PlaceLimitTypeName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
