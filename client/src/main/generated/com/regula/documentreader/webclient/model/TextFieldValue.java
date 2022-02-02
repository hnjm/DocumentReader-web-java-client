/*
 * Regula Document Reader Web API
 * Documents recognition as easy as reading two bytes.  # Clients: * [JavaScript](https://github.com/regulaforensics/DocumentReader-web-js-client) client for the browser and node.js based on axios * [Java](https://github.com/regulaforensics/DocumentReader-web-java-client) client compatible with jvm and android * [Python](https://github.com/regulaforensics/DocumentReader-web-python-client) 3.5+ client * [C#](https://github.com/regulaforensics/DocumentReader-web-csharp-client) client for .NET & .NET Core
 *
 * The version of the OpenAPI document: 6.1.0
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

/** TextFieldValue */
public class TextFieldValue {
  public static final String SERIALIZED_NAME_SOURCE = "source";

  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_VALUE = "value";

  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ORIGINAL_VALUE = "originalValue";

  @SerializedName(SERIALIZED_NAME_ORIGINAL_VALUE)
  private String originalValue;

  public static final String SERIALIZED_NAME_ORIGINAL_SYMBOLS = "originalSymbols";

  @SerializedName(SERIALIZED_NAME_ORIGINAL_SYMBOLS)
  private List<OriginalSymbol> originalSymbols = null;

  public static final String SERIALIZED_NAME_PAGE_INDEX = "pageIndex";

  @SerializedName(SERIALIZED_NAME_PAGE_INDEX)
  private Integer pageIndex;

  public static final String SERIALIZED_NAME_PROBABILITY = "probability";

  @SerializedName(SERIALIZED_NAME_PROBABILITY)
  private Integer probability;

  public static final String SERIALIZED_NAME_FIELD_RECT = "fieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_RFID_ORIGIN = "rfidOrigin";

  @SerializedName(SERIALIZED_NAME_RFID_ORIGIN)
  private RfidOrigin rfidOrigin;

  public TextFieldValue withSource(String source) {
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

  public TextFieldValue withValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * Parsed/processed value. Date format converted for output, delimiters removed
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
   * Original value as seen in the document
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

  public TextFieldValue withOriginalSymbols(List<OriginalSymbol> originalSymbols) {
    this.originalSymbols = originalSymbols;
    return this;
  }

  public TextFieldValue addOriginalSymbolsItem(OriginalSymbol originalSymbolsItem) {
    if (this.originalSymbols == null) {
      this.originalSymbols = new ArrayList<OriginalSymbol>();
    }
    this.originalSymbols.add(originalSymbolsItem);
    return this;
  }

  /**
   * Get originalSymbols
   *
   * @return originalSymbols
   */
  @javax.annotation.Nullable
  public List<OriginalSymbol> getOriginalSymbols() {
    return originalSymbols;
  }

  public void setOriginalSymbols(List<OriginalSymbol> originalSymbols) {
    this.originalSymbols = originalSymbols;
  }

  public TextFieldValue withPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  /**
   * Page index of the image from input list
   *
   * @return pageIndex
   */
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public TextFieldValue withProbability(Integer probability) {
    this.probability = probability;
    return this;
  }

  /**
   * Min recognition probability. Combined minimum probability from single characters probabilities
   * minimum: 0 maximum: 100
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

  public TextFieldValue withFieldRect(RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
    return this;
  }

  /**
   * Get fieldRect
   *
   * @return fieldRect
   */
  @javax.annotation.Nullable
  public RectangleCoordinates getFieldRect() {
    return fieldRect;
  }

  public void setFieldRect(RectangleCoordinates fieldRect) {
    this.fieldRect = fieldRect;
  }

  public TextFieldValue withRfidOrigin(RfidOrigin rfidOrigin) {
    this.rfidOrigin = rfidOrigin;
    return this;
  }

  /**
   * Get rfidOrigin
   *
   * @return rfidOrigin
   */
  @javax.annotation.Nullable
  public RfidOrigin getRfidOrigin() {
    return rfidOrigin;
  }

  public void setRfidOrigin(RfidOrigin rfidOrigin) {
    this.rfidOrigin = rfidOrigin;
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
    return Objects.equals(this.source, textFieldValue.source)
        && Objects.equals(this.value, textFieldValue.value)
        && Objects.equals(this.originalValue, textFieldValue.originalValue)
        && Objects.equals(this.originalSymbols, textFieldValue.originalSymbols)
        && Objects.equals(this.pageIndex, textFieldValue.pageIndex)
        && Objects.equals(this.probability, textFieldValue.probability)
        && Objects.equals(this.fieldRect, textFieldValue.fieldRect)
        && Objects.equals(this.rfidOrigin, textFieldValue.rfidOrigin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        source,
        value,
        originalValue,
        originalSymbols,
        pageIndex,
        probability,
        fieldRect,
        rfidOrigin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextFieldValue {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    originalSymbols: ").append(toIndentedString(originalSymbols)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    probability: ").append(toIndentedString(probability)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    rfidOrigin: ").append(toIndentedString(rfidOrigin)).append("\n");
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
