/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.2.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Contains all document text fields data with validity and cross-source compare checks */
public class Text {
  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private int status;

  public static final String SERIALIZED_NAME_VALIDITY_STATUS = "validityStatus";

  @SerializedName(SERIALIZED_NAME_VALIDITY_STATUS)
  private int validityStatus;

  public static final String SERIALIZED_NAME_COMPARISON_STATUS = "comparisonStatus";

  @SerializedName(SERIALIZED_NAME_COMPARISON_STATUS)
  private int comparisonStatus;

  public static final String SERIALIZED_NAME_FIELD_LIST = "fieldList";

  @SerializedName(SERIALIZED_NAME_FIELD_LIST)
  private List<com.regula.documentreader.webclient.model.ext.TextField> fieldList =
      new ArrayList<com.regula.documentreader.webclient.model.ext.TextField>();

  public static final String SERIALIZED_NAME_AVAILABLE_SOURCE_LIST = "availableSourceList";

  @SerializedName(SERIALIZED_NAME_AVAILABLE_SOURCE_LIST)
  private List<TextAvailableSource> availableSourceList = new ArrayList<TextAvailableSource>();

  public Text withStatus(int status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Text withValidityStatus(int validityStatus) {
    this.validityStatus = validityStatus;
    return this;
  }

  /**
   * Get validityStatus
   *
   * @return validityStatus
   */
  public int getValidityStatus() {
    return validityStatus;
  }

  public void setValidityStatus(int validityStatus) {
    this.validityStatus = validityStatus;
  }

  public Text withComparisonStatus(int comparisonStatus) {
    this.comparisonStatus = comparisonStatus;
    return this;
  }

  /**
   * Get comparisonStatus
   *
   * @return comparisonStatus
   */
  public int getComparisonStatus() {
    return comparisonStatus;
  }

  public void setComparisonStatus(int comparisonStatus) {
    this.comparisonStatus = comparisonStatus;
  }

  public Text withFieldList(
      List<com.regula.documentreader.webclient.model.ext.TextField> fieldList) {
    this.fieldList = fieldList;
    return this;
  }

  public Text addFieldListItem(
      com.regula.documentreader.webclient.model.ext.TextField fieldListItem) {
    this.fieldList.add(fieldListItem);
    return this;
  }

  /**
   * Get fieldList
   *
   * @return fieldList
   */
  public List<com.regula.documentreader.webclient.model.ext.TextField> getFieldList() {
    return fieldList;
  }

  public void setFieldList(
      List<com.regula.documentreader.webclient.model.ext.TextField> fieldList) {
    this.fieldList = fieldList;
  }

  public Text withAvailableSourceList(List<TextAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
    return this;
  }

  public Text addAvailableSourceListItem(TextAvailableSource availableSourceListItem) {
    this.availableSourceList.add(availableSourceListItem);
    return this;
  }

  /**
   * Get availableSourceList
   *
   * @return availableSourceList
   */
  public List<TextAvailableSource> getAvailableSourceList() {
    return availableSourceList;
  }

  public void setAvailableSourceList(List<TextAvailableSource> availableSourceList) {
    this.availableSourceList = availableSourceList;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Text text = (Text) o;
    return Objects.equals(this.status, text.status)
        && Objects.equals(this.validityStatus, text.validityStatus)
        && Objects.equals(this.comparisonStatus, text.comparisonStatus)
        && Objects.equals(this.fieldList, text.fieldList)
        && Objects.equals(this.availableSourceList, text.availableSourceList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, validityStatus, comparisonStatus, fieldList, availableSourceList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Text {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    comparisonStatus: ").append(toIndentedString(comparisonStatus)).append("\n");
    sb.append("    fieldList: ").append(toIndentedString(fieldList)).append("\n");
    sb.append("    availableSourceList: ")
        .append(toIndentedString(availableSourceList))
        .append("\n");
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
