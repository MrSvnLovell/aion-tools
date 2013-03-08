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
 * <p>Java class for Category.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="Category">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Carpet"/>
 *     &lt;enumeration value="Curtain"/>
 *     &lt;enumeration value="Chair"/>
 *     &lt;enumeration value="Bed"/>
 *     &lt;enumeration value="Table"/>
 *     &lt;enumeration value="Decoration"/>
 *     &lt;enumeration value="Book"/>
 *     &lt;enumeration value="npc"/>
 *     &lt;enumeration value="Light"/>
 *     &lt;enumeration value="OutLight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "Category")
@XmlEnum
public enum Category {

    @XmlEnumValue("Carpet")
    CARPET("Carpet"),
    @XmlEnumValue("Curtain")
    CURTAIN("Curtain"),
    @XmlEnumValue("Chair")
    CHAIR("Chair"),
    @XmlEnumValue("Bed")
    BED("Bed"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Decoration")
    DECORATION("Decoration"),
    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("npc")
    NPC("npc"),
    @XmlEnumValue("Light")
    LIGHT("Light"),
    @XmlEnumValue("OutLight")
    OUT_LIGHT("OutLight");
    private final String value;

    Category(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Category fromValue(String v) {
        for (Category c : Category.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
