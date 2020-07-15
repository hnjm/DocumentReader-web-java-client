/*
 * Regula Document Reader Web API
 * Regula Document Reader Web API
 *
 * The version of the OpenAPI document: 5.1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regulaforensics.docreader.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** AvailableSource */
public class AvailableSource {
  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private int source;

  public static final String SERIALIZED_NAME_VALIDITY_STATUS = "validityStatus";

  @SerializedName(SERIALIZED_NAME_VALIDITY_STATUS)
  private int validityStatus;

  public AvailableSource withSource(int source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   *
   * @return source
   */
  public int getSource() {
    return source;
  }

  public void setSource(int source) {
    this.source = source;
  }

  public AvailableSource withValidityStatus(int validityStatus) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableSource availableSource = (AvailableSource) o;
    return Objects.equals(this.source, availableSource.source)
        && Objects.equals(this.validityStatus, availableSource.validityStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, validityStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableSource {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    validityStatus: ").append(toIndentedString(validityStatus)).append("\n");
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
