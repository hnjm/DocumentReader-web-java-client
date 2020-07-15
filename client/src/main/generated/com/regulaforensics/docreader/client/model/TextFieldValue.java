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

/** TextFieldValue */
public class TextFieldValue {
  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ORIGINAL_VALUE = "originalValue";

  @SerializedName(SERIALIZED_NAME_ORIGINAL_VALUE)
  private String originalValue;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "pageIndex";

  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private int pageIndex;

  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private int source;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private int probability;

  public TextFieldValue withValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   *
   * @return value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public TextFieldValue withOriginalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * Get originalValue
   *
   * @return originalValue
   */
  @javax.annotation.Nullable
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  public TextFieldValue withPageIndex(int pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  /**
   * Index of image from input list
   *
   * @return pageIndex
   */
  public int getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(int pageIndex) {
    this.pageIndex = pageIndex;
  }

  public TextFieldValue withSource(int source) {
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

  public TextFieldValue withProbability(int probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Value correct recognition probability. Combined probability from single characters
   * probabilities minimum: 0 maximum: 100
   *
   * @return probability
   */
  @javax.annotation.Nullable
  public int getProbability() {
    return probability;
  }

  public void setProbability(int probability) {
    this.probability = probability;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextFieldValue textFieldValue = (TextFieldValue) o;
    return Objects.equals(this.value, textFieldValue.value)
        && Objects.equals(this.originalValue, textFieldValue.originalValue)
        && Objects.equals(this.pageIndex, textFieldValue.pageIndex)
        && Objects.equals(this.source, textFieldValue.source)
        && Objects.equals(this.probability, textFieldValue.probability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, originalValue, pageIndex, source, probability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFieldValue {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
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
