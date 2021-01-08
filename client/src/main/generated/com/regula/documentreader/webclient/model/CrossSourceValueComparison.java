/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 5.4.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.regula.documentreader.webclient.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/** CrossSourceValueComparison */
public class CrossSourceValueComparison {
  public static final String SERIALIZED_NAME_SOURCE_LEFT = "sourceLeft";

  @SerializedName(SERIALIZED_NAME_SOURCE_LEFT)
  private String sourceLeft;

  public static final String SERIALIZED_NAME_SOURCE_RIGHT = "sourceRight";

  @SerializedName(SERIALIZED_NAME_SOURCE_RIGHT)
  private String sourceRight;

  public static final String SERIALIZED_NAME_STATUS = "status";

  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public CrossSourceValueComparison withSourceLeft(String sourceLeft) {
    this.sourceLeft = sourceLeft;
    return this;
  }

  /**
   * Get sourceLeft
   *
   * @return sourceLeft
   */
  public String getSourceLeft() {
    return sourceLeft;
  }

  public void setSourceLeft(String sourceLeft) {
    this.sourceLeft = sourceLeft;
  }

  public CrossSourceValueComparison withSourceRight(String sourceRight) {
    this.sourceRight = sourceRight;
    return this;
  }

  /**
   * Get sourceRight
   *
   * @return sourceRight
   */
  public String getSourceRight() {
    return sourceRight;
  }

  public void setSourceRight(String sourceRight) {
    this.sourceRight = sourceRight;
  }

  public CrossSourceValueComparison withStatus(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   *
   * @return status
   */
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrossSourceValueComparison crossSourceValueComparison = (CrossSourceValueComparison) o;
    return Objects.equals(this.sourceLeft, crossSourceValueComparison.sourceLeft)
        && Objects.equals(this.sourceRight, crossSourceValueComparison.sourceRight)
        && Objects.equals(this.status, crossSourceValueComparison.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceLeft, sourceRight, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrossSourceValueComparison {\n");
    sb.append("    sourceLeft: ").append(toIndentedString(sourceLeft)).append("\n");
    sb.append("    sourceRight: ").append(toIndentedString(sourceRight)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
