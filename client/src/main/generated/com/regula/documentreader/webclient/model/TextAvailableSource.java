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
import java.util.Objects;

/** TextAvailableSource */
public class TextAvailableSource {
  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_VALIDITY_STATUS = "validityStatus";

  @SerializedName(SERIALIZED_NAME_VALIDITY_STATUS)
  private int validityStatus;

  public static final String SERIALIZED_NAME_CONTAINER_TYPE = "containerType";

  @SerializedName(SERIALIZED_NAME_CONTAINER_TYPE)
  private int containerType;

  public TextAvailableSource withSource(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public TextAvailableSource withValidityStatus(int validityStatus) {
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

  public TextAvailableSource withContainerType(int containerType) {
    this.containerType = containerType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return containerType
   */
  @javax.annotation.Nullable
  public int getContainerType() {
    return containerType;
  }

  public void setContainerType(int containerType) {
    this.containerType = containerType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextAvailableSource textAvailableSource = (TextAvailableSource) o;
    return Objects.equals(this.source, textAvailableSource.source)
        && Objects.equals(this.validityStatus, textAvailableSource.validityStatus)
        && Objects.equals(this.containerType, textAvailableSource.containerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, validityStatus, containerType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextAvailableSource {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
    sb.append("    containerType: ").append(toIndentedString(containerType)).append("\n");
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
