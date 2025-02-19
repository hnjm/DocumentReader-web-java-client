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

/** OriginalSymbol */
public class OriginalSymbol {
  public static final String SERIALIZED_NAME_CODE = "code";

  @SerializedName(SERIALIZED_NAME_CODE)
  private Long code;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Integer probability;

  public static final String SERIALIZED_NAME_RECT = "rect";

  @SerializedName(SERIALIZED_NAME_RECT)
  private RectangleCoordinates rect;

  public OriginalSymbol withCode(Long code) {
    this.code = code;
    return this;
  }

  /**
   * Unicode symbol code
   *
   * @return code
   */
  @javax.annotation.Nullable
  public Long getCode() {
    return code;
  }

  public void setCode(Long code) {
    this.code = code;
  }

  public OriginalSymbol withProbability(Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Probability of correctness reading of a single character minimum: 0 maximum: 100
   *
   * @return probability
   */
  @javax.annotation.Nullable
  public Integer getProbability() {
    return probability;
  }

  public void setProbability(Integer probability) {
    this.probability = probability;
  }

  public OriginalSymbol withRect(RectangleCoordinates rect) {
    this.rect = rect;
    return this;
  }

  /**
   * Get rect
   *
   * @return rect
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getRect() {
    return rect;
  }

  public void setRect(RectangleCoordinates rect) {
    this.rect = rect;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginalSymbol originalSymbol = (OriginalSymbol) o;
    return Objects.equals(this.code, originalSymbol.code)
        && Objects.equals(this.probability, originalSymbol.probability)
        && Objects.equals(this.rect, originalSymbol.rect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, probability, rect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginalSymbol {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    rect: ").append(toIndentedString(rect)).append("\n");
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
