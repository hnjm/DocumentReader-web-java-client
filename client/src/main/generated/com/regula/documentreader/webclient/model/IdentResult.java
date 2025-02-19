/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.7.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** IdentResult */
public class IdentResult extends AuthenticityCheckResultItem {
  public static final String SERIALIZED_NAME_ELEMENT_TYPE = "ElementType";

  @SerializedName(SERIALIZED_NAME_ELEMENT_TYPE)
  private Integer elementType;

  public static final String SERIALIZED_NAME_LIGHT_INDEX = "LightIndex";

  @SerializedName(SERIALIZED_NAME_LIGHT_INDEX)
  private Integer lightIndex;

  public static final String SERIALIZED_NAME_AREA = "Area";

  @SerializedName(SERIALIZED_NAME_AREA)
  private RectangleCoordinates area;

  public static final String SERIALIZED_NAME_IMAGE = "Image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private ImageData image;

  public static final String SERIALIZED_NAME_ETALON_IMAGE = "EtalonImage";

  @SerializedName(SERIALIZED_NAME_ETALON_IMAGE)
  private ImageData etalonImage;

  public static final String SERIALIZED_NAME_PERCENT_VALUE = "PercentValue";

  @SerializedName(SERIALIZED_NAME_PERCENT_VALUE)
  private Integer percentValue;

  public static final String SERIALIZED_NAME_AREA_LIST = "AreaList";

  @SerializedName(SERIALIZED_NAME_AREA_LIST)
  private AreaContainer areaList;

  public IdentResult withElementType(Integer elementType) {
    this.elementType = elementType;
    return this;
  }

  /**
   * Get elementType
   *
   * @return elementType
   */
  @javax.annotation.Nullable
  public Integer getElementType() {
    return elementType;
  }

  public void setElementType(Integer elementType) {
    this.elementType = elementType;
  }

  public IdentResult withLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
    return this;
  }

  /**
   * Get lightIndex
   *
   * @return lightIndex
   */
  @javax.annotation.Nullable
  public Integer getLightIndex() {
    return lightIndex;
  }

  public void setLightIndex(Integer lightIndex) {
    this.lightIndex = lightIndex;
  }

  public IdentResult withArea(RectangleCoordinates area) {
    this.area = area;
    return this;
  }

  /**
   * Get area
   *
   * @return area
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getArea() {
    return area;
  }

  public void setArea(RectangleCoordinates area) {
    this.area = area;
  }

  public IdentResult withImage(ImageData image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   *
   * @return image
   */
  @javax.annotation.Nullable
  public ImageData getImage() {
    return image;
  }

  public void setImage(ImageData image) {
    this.image = image;
  }

  public IdentResult withEtalonImage(ImageData etalonImage) {
    this.etalonImage = etalonImage;
    return this;
  }

  /**
   * Get etalonImage
   *
   * @return etalonImage
   */
  @javax.annotation.Nullable
  public ImageData getEtalonImage() {
    return etalonImage;
  }

  public void setEtalonImage(ImageData etalonImage) {
    this.etalonImage = etalonImage;
  }

  public IdentResult withPercentValue(Integer percentValue) {
    this.percentValue = percentValue;
    return this;
  }

  /**
   * Probability percent for IMAGE_PATTERN check or element&#39;s visibility for IR_VISIBILITY
   *
   * @return percentValue
   */
  @javax.annotation.Nullable
  public Integer getPercentValue() {
    return percentValue;
  }

  public void setPercentValue(Integer percentValue) {
    this.percentValue = percentValue;
  }

  public IdentResult withAreaList(AreaContainer areaList) {
    this.areaList = areaList;
    return this;
  }

  /**
   * Get areaList
   *
   * @return areaList
   */
  @javax.annotation.Nullable
  public AreaContainer getAreaList() {
    return areaList;
  }

  public void setAreaList(AreaContainer areaList) {
    this.areaList = areaList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentResult identResult = (IdentResult) o;
    return Objects.equals(this.elementType, identResult.elementType)
        && Objects.equals(this.lightIndex, identResult.lightIndex)
        && Objects.equals(this.area, identResult.area)
        && Objects.equals(this.image, identResult.image)
        && Objects.equals(this.etalonImage, identResult.etalonImage)
        && Objects.equals(this.percentValue, identResult.percentValue)
        && Objects.equals(this.areaList, identResult.areaList)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        elementType,
        lightIndex,
        area,
        image,
        etalonImage,
        percentValue,
        areaList,
        super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    elementType: ").append(toIndentedString(elementType)).append("\n");
    sb.append("    lightIndex: ").append(toIndentedString(lightIndex)).append("\n");
    sb.append("    area: ").append(toIndentedString(area)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    etalonImage: ").append(toIndentedString(etalonImage)).append("\n");
    sb.append("    percentValue: ").append(toIndentedString(percentValue)).append("\n");
    sb.append("    areaList: ").append(toIndentedString(areaList)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
