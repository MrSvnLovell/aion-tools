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
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for client_housing_objectType complex type.
 * <p/>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p/>
 * <pre>
 * &lt;complexType name="client_housing_objectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="desc_long" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="category" type="{}Category"/>
 *         &lt;element name="tooltip_type" type="{}RequestCategory" minOccurs="0"/>
 *         &lt;element name="request_category" type="{}RequestCategory" minOccurs="0"/>
 *         &lt;element name="quality" type="{}Quality"/>
 *         &lt;element name="housingobj_function" type="{}HousingObjFunction" minOccurs="0"/>
 *         &lt;element name="in_house_warehouse_idx" type="{}InHouseWarehouseIdx" minOccurs="0"/>
 *         &lt;element name="pc_use_type" type="{}PcUseType" minOccurs="0"/>
 *         &lt;element name="owner_usecount_per_day" type="{}OwnerUseCountPerDay" minOccurs="0"/>
 *         &lt;element name="pc_use_count_max" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="pc_use_final_condition" type="{}PcUseFinalCondition" minOccurs="0"/>
 *         &lt;element name="required_item" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="check_type" type="{}CheckType" minOccurs="0"/>
 *         &lt;element name="erase_value" type="{}EraseValue" minOccurs="0"/>
 *         &lt;element name="reward_use" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reward_final" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="use_delay" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="use_cooltime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="place_limit_tag" type="{}PlaceLimitTypeName" minOccurs="0"/>
 *         &lt;element name="npcname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="place_area" type="{}PlaceArea"/>
 *         &lt;element name="place_location" type="{}PlaceLocation"/>
 *         &lt;element name="talking_distance" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="housingobj_max_use_days" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="housingobj_max_use" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *         &lt;element name="dir" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mesh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default_color" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fx_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fx_bone_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="icon_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cursor_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user_animation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ui_sound_type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="housing_script_setpos" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

/**
 * @author hex1r0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_housing_objectType", propOrder = {
    "id",
    "name",
    "desc",
    "descLong",
    "category",
    "tooltipType",
    "requestCategory",
    "quality",
    "housingobjFunction",
    "inHouseWarehouseIdx",
    "pcUseType",
    "ownerUsecountPerDay",
    "pcUseCountMax",
    "pcUseFinalCondition",
    "requiredItem",
    "checkType",
    "eraseValue",
    "rewardUse",
    "rewardFinal",
    "useDelay",
    "useCooltime",
    "placeLimitTag",
    "npcname",
    "type",
    "placeArea",
    "placeLocation",
    "talkingDistance",
    "housingobjMaxUseDays",
    "housingobjMaxUse",
    "dir",
    "mesh",
    "defaultColor",
    "fxName",
    "fxBoneName",
    "iconName",
    "cursorType",
    "userAnimation",
    "uiSoundType",
    "housingScriptSetpos"
})
public class ClientHousingObjectType
    implements Serializable {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String desc;
    @XmlElement(name = "desc_long")
    protected String descLong;
    @XmlElement(required = true)
    protected Category category;
    @XmlElement(name = "tooltip_type")
    protected RequestCategory tooltipType;
    @XmlElement(name = "request_category")
    protected RequestCategory requestCategory;
    @XmlElement(required = true)
    protected Quality quality;
    @XmlElement(name = "housingobj_function")
    protected HousingObjFunction housingobjFunction;
    @XmlElement(name = "in_house_warehouse_idx")
    protected InHouseWarehouseIdx inHouseWarehouseIdx;
    @XmlElement(name = "pc_use_type")
    protected PcUseType pcUseType;
    @XmlElement(name = "owner_usecount_per_day")
    protected OwnerUseCountPerDay ownerUsecountPerDay;
    @XmlElement(name = "pc_use_count_max")
    protected Short pcUseCountMax;
    @XmlElement(name = "pc_use_final_condition")
    protected PcUseFinalCondition pcUseFinalCondition;
    @XmlElement(name = "required_item")
    protected String requiredItem;
    @XmlElement(name = "check_type")
    protected CheckType checkType;
    @XmlElement(name = "erase_value")
    protected EraseValue eraseValue;
    @XmlElement(name = "reward_use")
    protected String rewardUse;
    @XmlElement(name = "reward_final")
    protected String rewardFinal;
    @XmlElement(name = "use_delay")
    protected Short useDelay;
    @XmlElement(name = "use_cooltime")
    protected Integer useCooltime;
    @XmlElement(name = "place_limit_tag")
    protected PlaceLimitTypeName placeLimitTag;
    protected String npcname;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(name = "place_area", required = true)
    protected PlaceArea placeArea;
    @XmlElement(name = "place_location", required = true)
    protected PlaceLocation placeLocation;
    @XmlElement(name = "talking_distance")
    protected float talkingDistance;
    @XmlElement(name = "housingobj_max_use_days")
    protected Short housingobjMaxUseDays;
    @XmlElement(name = "housingobj_max_use")
    protected Byte housingobjMaxUse;
    @XmlElement(required = true)
    protected String dir;
    @XmlElement(required = true)
    protected String mesh;
    @XmlElement(name = "default_color")
    protected String defaultColor;
    @XmlElement(name = "fx_name")
    protected String fxName;
    @XmlElement(name = "fx_bone_name")
    protected String fxBoneName;
    @XmlElement(name = "icon_name", required = true)
    protected String iconName;
    @XmlElement(name = "cursor_type", required = true)
    protected String cursorType;
    @XmlElement(name = "user_animation")
    protected String userAnimation;
    @XmlElement(name = "ui_sound_type", required = true)
    protected String uiSoundType;
    @XmlElement(name = "housing_script_setpos")
    protected Byte housingScriptSetpos;

    /**
     * Gets the value of the id property.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     */
    public void setId(int value) {
        this.id = value;
    }

    public boolean isSetId() {
        return true;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

    public boolean isSetName() {
        return (this.name != null);
    }

    /**
     * Gets the value of the desc property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    public boolean isSetDesc() {
        return (this.desc != null);
    }

    /**
     * Gets the value of the descLong property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDescLong() {
        return descLong;
    }

    /**
     * Sets the value of the descLong property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDescLong(String value) {
        this.descLong = value;
    }

    public boolean isSetDescLong() {
        return (this.descLong != null);
    }

    /**
     * Gets the value of the category property.
     *
     * @return possible object is
     *         {@link Category }
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     *
     * @param value
     *     allowed object is
     *     {@link Category }
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    public boolean isSetCategory() {
        return (this.category != null);
    }

    /**
     * Gets the value of the tooltipType property.
     *
     * @return possible object is
     *         {@link RequestCategory }
     */
    public RequestCategory getTooltipType() {
        return tooltipType;
    }

    /**
     * Sets the value of the tooltipType property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestCategory }
     */
    public void setTooltipType(RequestCategory value) {
        this.tooltipType = value;
    }

    public boolean isSetTooltipType() {
        return (this.tooltipType != null);
    }

    /**
     * Gets the value of the requestCategory property.
     *
     * @return possible object is
     *         {@link RequestCategory }
     */
    public RequestCategory getRequestCategory() {
        return requestCategory;
    }

    /**
     * Sets the value of the requestCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link RequestCategory }
     */
    public void setRequestCategory(RequestCategory value) {
        this.requestCategory = value;
    }

    public boolean isSetRequestCategory() {
        return (this.requestCategory != null);
    }

    /**
     * Gets the value of the quality property.
     *
     * @return possible object is
     *         {@link Quality }
     */
    public Quality getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     *
     * @param value
     *     allowed object is
     *     {@link Quality }
     */
    public void setQuality(Quality value) {
        this.quality = value;
    }

    public boolean isSetQuality() {
        return (this.quality != null);
    }

    /**
     * Gets the value of the housingobjFunction property.
     *
     * @return possible object is
     *         {@link HousingObjFunction }
     */
    public HousingObjFunction getHousingobjFunction() {
        return housingobjFunction;
    }

    /**
     * Sets the value of the housingobjFunction property.
     *
     * @param value
     *     allowed object is
     *     {@link HousingObjFunction }
     */
    public void setHousingobjFunction(HousingObjFunction value) {
        this.housingobjFunction = value;
    }

    public boolean isSetHousingobjFunction() {
        return (this.housingobjFunction != null);
    }

    /**
     * Gets the value of the inHouseWarehouseIdx property.
     *
     * @return possible object is
     *         {@link InHouseWarehouseIdx }
     */
    public InHouseWarehouseIdx getInHouseWarehouseIdx() {
        return inHouseWarehouseIdx;
    }

    /**
     * Sets the value of the inHouseWarehouseIdx property.
     *
     * @param value
     *     allowed object is
     *     {@link InHouseWarehouseIdx }
     */
    public void setInHouseWarehouseIdx(InHouseWarehouseIdx value) {
        this.inHouseWarehouseIdx = value;
    }

    public boolean isSetInHouseWarehouseIdx() {
        return (this.inHouseWarehouseIdx != null);
    }

    /**
     * Gets the value of the pcUseType property.
     *
     * @return possible object is
     *         {@link PcUseType }
     */
    public PcUseType getPcUseType() {
        return pcUseType;
    }

    /**
     * Sets the value of the pcUseType property.
     *
     * @param value
     *     allowed object is
     *     {@link PcUseType }
     */
    public void setPcUseType(PcUseType value) {
        this.pcUseType = value;
    }

    public boolean isSetPcUseType() {
        return (this.pcUseType != null);
    }

    /**
     * Gets the value of the ownerUsecountPerDay property.
     *
     * @return possible object is
     *         {@link OwnerUseCountPerDay }
     */
    public OwnerUseCountPerDay getOwnerUsecountPerDay() {
        return ownerUsecountPerDay;
    }

    /**
     * Sets the value of the ownerUsecountPerDay property.
     *
     * @param value
     *     allowed object is
     *     {@link OwnerUseCountPerDay }
     */
    public void setOwnerUsecountPerDay(OwnerUseCountPerDay value) {
        this.ownerUsecountPerDay = value;
    }

    public boolean isSetOwnerUsecountPerDay() {
        return (this.ownerUsecountPerDay != null);
    }

    /**
     * Gets the value of the pcUseCountMax property.
     *
     * @return possible object is
     *         {@link Short }
     */
    public Short getPcUseCountMax() {
        return pcUseCountMax;
    }

    /**
     * Sets the value of the pcUseCountMax property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     */
    public void setPcUseCountMax(Short value) {
        this.pcUseCountMax = value;
    }

    public boolean isSetPcUseCountMax() {
        return (this.pcUseCountMax != null);
    }

    /**
     * Gets the value of the pcUseFinalCondition property.
     *
     * @return possible object is
     *         {@link PcUseFinalCondition }
     */
    public PcUseFinalCondition getPcUseFinalCondition() {
        return pcUseFinalCondition;
    }

    /**
     * Sets the value of the pcUseFinalCondition property.
     *
     * @param value
     *     allowed object is
     *     {@link PcUseFinalCondition }
     */
    public void setPcUseFinalCondition(PcUseFinalCondition value) {
        this.pcUseFinalCondition = value;
    }

    public boolean isSetPcUseFinalCondition() {
        return (this.pcUseFinalCondition != null);
    }

    /**
     * Gets the value of the requiredItem property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRequiredItem() {
        return requiredItem;
    }

    /**
     * Sets the value of the requiredItem property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setRequiredItem(String value) {
        this.requiredItem = value;
    }

    public boolean isSetRequiredItem() {
        return (this.requiredItem != null);
    }

    /**
     * Gets the value of the checkType property.
     *
     * @return possible object is
     *         {@link CheckType }
     */
    public CheckType getCheckType() {
        return checkType;
    }

    /**
     * Sets the value of the checkType property.
     *
     * @param value
     *     allowed object is
     *     {@link CheckType }
     */
    public void setCheckType(CheckType value) {
        this.checkType = value;
    }

    public boolean isSetCheckType() {
        return (this.checkType != null);
    }

    /**
     * Gets the value of the eraseValue property.
     *
     * @return possible object is
     *         {@link EraseValue }
     */
    public EraseValue getEraseValue() {
        return eraseValue;
    }

    /**
     * Sets the value of the eraseValue property.
     *
     * @param value
     *     allowed object is
     *     {@link EraseValue }
     */
    public void setEraseValue(EraseValue value) {
        this.eraseValue = value;
    }

    public boolean isSetEraseValue() {
        return (this.eraseValue != null);
    }

    /**
     * Gets the value of the rewardUse property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRewardUse() {
        return rewardUse;
    }

    /**
     * Sets the value of the rewardUse property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setRewardUse(String value) {
        this.rewardUse = value;
    }

    public boolean isSetRewardUse() {
        return (this.rewardUse != null);
    }

    /**
     * Gets the value of the rewardFinal property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getRewardFinal() {
        return rewardFinal;
    }

    /**
     * Sets the value of the rewardFinal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setRewardFinal(String value) {
        this.rewardFinal = value;
    }

    public boolean isSetRewardFinal() {
        return (this.rewardFinal != null);
    }

    /**
     * Gets the value of the useDelay property.
     *
     * @return possible object is
     *         {@link Short }
     */
    public Short getUseDelay() {
        return useDelay;
    }

    /**
     * Sets the value of the useDelay property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     */
    public void setUseDelay(Short value) {
        this.useDelay = value;
    }

    public boolean isSetUseDelay() {
        return (this.useDelay != null);
    }

    /**
     * Gets the value of the useCooltime property.
     *
     * @return possible object is
     *         {@link Integer }
     */
    public Integer getUseCooltime() {
        return useCooltime;
    }

    /**
     * Sets the value of the useCooltime property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     */
    public void setUseCooltime(Integer value) {
        this.useCooltime = value;
    }

    public boolean isSetUseCooltime() {
        return (this.useCooltime != null);
    }

    /**
     * Gets the value of the placeLimitTag property.
     *
     * @return possible object is
     *         {@link PlaceLimitTypeName }
     */
    public PlaceLimitTypeName getPlaceLimitTag() {
        return placeLimitTag;
    }

    /**
     * Sets the value of the placeLimitTag property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaceLimitTypeName }
     */
    public void setPlaceLimitTag(PlaceLimitTypeName value) {
        this.placeLimitTag = value;
    }

    public boolean isSetPlaceLimitTag() {
        return (this.placeLimitTag != null);
    }

    /**
     * Gets the value of the npcname property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getNpcname() {
        return npcname;
    }

    /**
     * Sets the value of the npcname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setNpcname(String value) {
        this.npcname = value;
    }

    public boolean isSetNpcname() {
        return (this.npcname != null);
    }

    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    public boolean isSetType() {
        return (this.type != null);
    }

    /**
     * Gets the value of the placeArea property.
     *
     * @return possible object is
     *         {@link PlaceArea }
     */
    public PlaceArea getPlaceArea() {
        return placeArea;
    }

    /**
     * Sets the value of the placeArea property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaceArea }
     */
    public void setPlaceArea(PlaceArea value) {
        this.placeArea = value;
    }

    public boolean isSetPlaceArea() {
        return (this.placeArea != null);
    }

    /**
     * Gets the value of the placeLocation property.
     *
     * @return possible object is
     *         {@link PlaceLocation }
     */
    public PlaceLocation getPlaceLocation() {
        return placeLocation;
    }

    /**
     * Sets the value of the placeLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link PlaceLocation }
     */
    public void setPlaceLocation(PlaceLocation value) {
        this.placeLocation = value;
    }

    public boolean isSetPlaceLocation() {
        return (this.placeLocation != null);
    }

    /**
     * Gets the value of the talkingDistance property.
     */
    public float getTalkingDistance() {
        return talkingDistance;
    }

    /**
     * Sets the value of the talkingDistance property.
     */
    public void setTalkingDistance(float value) {
        this.talkingDistance = value;
    }

    public boolean isSetTalkingDistance() {
        return true;
    }

    /**
     * Gets the value of the housingobjMaxUseDays property.
     *
     * @return possible object is
     *         {@link Short }
     */
    public Short getHousingobjMaxUseDays() {
        return housingobjMaxUseDays;
    }

    /**
     * Sets the value of the housingobjMaxUseDays property.
     *
     * @param value
     *     allowed object is
     *     {@link Short }
     */
    public void setHousingobjMaxUseDays(Short value) {
        this.housingobjMaxUseDays = value;
    }

    public boolean isSetHousingobjMaxUseDays() {
        return (this.housingobjMaxUseDays != null);
    }

    /**
     * Gets the value of the housingobjMaxUse property.
     *
     * @return possible object is
     *         {@link Byte }
     */
    public Byte getHousingobjMaxUse() {
        return housingobjMaxUse;
    }

    /**
     * Sets the value of the housingobjMaxUse property.
     *
     * @param value
     *     allowed object is
     *     {@link Byte }
     */
    public void setHousingobjMaxUse(Byte value) {
        this.housingobjMaxUse = value;
    }

    public boolean isSetHousingobjMaxUse() {
        return (this.housingobjMaxUse != null);
    }

    /**
     * Gets the value of the dir property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDir(String value) {
        this.dir = value;
    }

    public boolean isSetDir() {
        return (this.dir != null);
    }

    /**
     * Gets the value of the mesh property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getMesh() {
        return mesh;
    }

    /**
     * Sets the value of the mesh property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setMesh(String value) {
        this.mesh = value;
    }

    public boolean isSetMesh() {
        return (this.mesh != null);
    }

    /**
     * Gets the value of the defaultColor property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getDefaultColor() {
        return defaultColor;
    }

    /**
     * Sets the value of the defaultColor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setDefaultColor(String value) {
        this.defaultColor = value;
    }

    public boolean isSetDefaultColor() {
        return (this.defaultColor != null);
    }

    /**
     * Gets the value of the fxName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFxName() {
        return fxName;
    }

    /**
     * Sets the value of the fxName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setFxName(String value) {
        this.fxName = value;
    }

    public boolean isSetFxName() {
        return (this.fxName != null);
    }

    /**
     * Gets the value of the fxBoneName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getFxBoneName() {
        return fxBoneName;
    }

    /**
     * Sets the value of the fxBoneName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setFxBoneName(String value) {
        this.fxBoneName = value;
    }

    public boolean isSetFxBoneName() {
        return (this.fxBoneName != null);
    }

    /**
     * Gets the value of the iconName property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getIconName() {
        return iconName;
    }

    /**
     * Sets the value of the iconName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setIconName(String value) {
        this.iconName = value;
    }

    public boolean isSetIconName() {
        return (this.iconName != null);
    }

    /**
     * Gets the value of the cursorType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getCursorType() {
        return cursorType;
    }

    /**
     * Sets the value of the cursorType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setCursorType(String value) {
        this.cursorType = value;
    }

    public boolean isSetCursorType() {
        return (this.cursorType != null);
    }

    /**
     * Gets the value of the userAnimation property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUserAnimation() {
        return userAnimation;
    }

    /**
     * Sets the value of the userAnimation property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setUserAnimation(String value) {
        this.userAnimation = value;
    }

    public boolean isSetUserAnimation() {
        return (this.userAnimation != null);
    }

    /**
     * Gets the value of the uiSoundType property.
     *
     * @return possible object is
     *         {@link String }
     */
    public String getUiSoundType() {
        return uiSoundType;
    }

    /**
     * Sets the value of the uiSoundType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     */
    public void setUiSoundType(String value) {
        this.uiSoundType = value;
    }

    public boolean isSetUiSoundType() {
        return (this.uiSoundType != null);
    }

    /**
     * Gets the value of the housingScriptSetpos property.
     *
     * @return possible object is
     *         {@link Byte }
     */
    public Byte getHousingScriptSetpos() {
        return housingScriptSetpos;
    }

    /**
     * Sets the value of the housingScriptSetpos property.
     *
     * @param value
     *     allowed object is
     *     {@link Byte }
     */
    public void setHousingScriptSetpos(Byte value) {
        this.housingScriptSetpos = value;
    }

    public boolean isSetHousingScriptSetpos() {
        return (this.housingScriptSetpos != null);
    }

}
