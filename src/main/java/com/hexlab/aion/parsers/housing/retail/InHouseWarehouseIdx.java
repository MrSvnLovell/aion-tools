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
 * <p>Java class for InHouseWarehouseIdx.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;simpleType name="InHouseWarehouseIdx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *     &lt;enumeration value="1"/>
 *     &lt;enumeration value="2"/>
 *     &lt;enumeration value="3"/>
 *     &lt;enumeration value="9"/>
 *     &lt;enumeration value="10"/>
 *     &lt;enumeration value="4"/>
 *     &lt;enumeration value="11"/>
 *     &lt;enumeration value="12"/>
 *     &lt;enumeration value="5"/>
 *     &lt;enumeration value="6"/>
 *     &lt;enumeration value="7"/>
 *     &lt;enumeration value="8"/>
 *     &lt;enumeration value="14"/>
 *     &lt;enumeration value="16"/>
 *     &lt;enumeration value="18"/>
 *     &lt;enumeration value="20"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlType(name = "InHouseWarehouseIdx")
@XmlEnum(Byte.class)
public enum InHouseWarehouseIdx {

    @XmlEnumValue("1")
    HOUSE_STORAGE_01(((byte) 1)),
    @XmlEnumValue("2")
    HOUSE_STORAGE_02(((byte) 2)),
    @XmlEnumValue("3")
    HOUSE_STORAGE_03(((byte) 3)),
    @XmlEnumValue("9")
    HOUSE_STORAGE_09(((byte) 9)),
    @XmlEnumValue("10")
    HOUSE_STORAGE_10(((byte) 10)),
    @XmlEnumValue("4")
    HOUSE_STORAGE_04(((byte) 4)),
    @XmlEnumValue("11")
    HOUSE_STORAGE_11(((byte) 11)),
    @XmlEnumValue("12")
    HOUSE_STORAGE_12(((byte) 12)),
    @XmlEnumValue("5")
    HOUSE_STORAGE_05(((byte) 5)),
    @XmlEnumValue("6")
    HOUSE_STORAGE_06(((byte) 6)),
    @XmlEnumValue("7")
    HOUSE_STORAGE_07(((byte) 7)),
    @XmlEnumValue("8")
    HOUSE_STORAGE_08(((byte) 8)),
    @XmlEnumValue("14")
    HOUSE_STORAGE_14(((byte) 14)),
    @XmlEnumValue("16")
    HOUSE_STORAGE_16(((byte) 16)),
    @XmlEnumValue("18")
    HOUSE_STORAGE_18(((byte) 18)),
    @XmlEnumValue("20")
    HOUSE_STORAGE_20(((byte) 20));
    private final byte value;

    InHouseWarehouseIdx(byte v) {
        value = v;
    }

    public byte value() {
        return value;
    }

    public static InHouseWarehouseIdx fromValue(byte v) {
        for (InHouseWarehouseIdx c : InHouseWarehouseIdx.values()) {
            if (c.value == v) {
                return c;
            }
        }
        throw new IllegalArgumentException(String.valueOf(v));
    }

}
