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

/** DocVisualExtendedField */
public class DocVisualExtendedField {
  public static final String SERIALIZED_NAME_W_FIELD_TYPE = "wFieldType";

  @SerializedName(SERIALIZED_NAME_W_FIELD_TYPE)
  private Integer wFieldType;

  public static final String SERIALIZED_NAME_FIELD_NAME = "FieldName";

  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName;

  public static final String SERIALIZED_NAME_W_L_C_I_D = "wLCID";

  @SerializedName(SERIALIZED_NAME_W_L_C_I_D)
  private Integer wLCID;

  public static final String SERIALIZED_NAME_STRINGS_RESULT = "StringsResult";

  @SerializedName(SERIALIZED_NAME_STRINGS_RESULT)
  private List<StringRecognitionResult> stringsResult = null;

  public static final String SERIALIZED_NAME_BUF_TEXT = "Buf_Text";

  @SerializedName(SERIALIZED_NAME_BUF_TEXT)
  private String bufText;

  public static final String SERIALIZED_NAME_FIELD_RECT = "FieldRect";

  @SerializedName(SERIALIZED_NAME_FIELD_RECT)
  private RectangleCoordinates fieldRect;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_D_G = "RFID_OriginDG";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_D_G)
  private Integer rfIDOriginDG;

  public static final String SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY = "RFID_OriginTagEntry";

  @SerializedName(SERIALIZED_NAME_RF_I_D_ORIGIN_TAG_ENTRY)
  private Integer rfIDOriginTagEntry;

  public DocVisualExtendedField withWFieldType(Integer wFieldType) {
    this.wFieldType = wFieldType;
    return this;
  }

  /**
   * Get wFieldType
   *
   * @return wFieldType
   */
  public Integer getwFieldType() {
    return wFieldType;
  }

  public void setwFieldType(Integer wFieldType) {
    this.wFieldType = wFieldType;
  }

  public DocVisualExtendedField withFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Field name. Only use to search values for fields with fieldType&#x3D;50(other). In general, use
   * wFieldType for lookup.
   *
   * @return fieldName
   */
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public DocVisualExtendedField withWLCID(Integer wLCID) {
    this.wLCID = wLCID;
    return this;
  }

  /**
   * Get wLCID
   *
   * @return wLCID
   */
  public Integer getwLCID() {
    return wLCID;
  }

  public void setwLCID(Integer wLCID) {
    this.wLCID = wLCID;
  }

  public DocVisualExtendedField withStringsResult(List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
    return this;
  }

  public DocVisualExtendedField addStringsResultItem(StringRecognitionResult stringsResultItem) {
    if (this.stringsResult == null) {
      this.stringsResult = new ArrayList<StringRecognitionResult>();
    }
    this.stringsResult.add(stringsResultItem);
    return this;
  }

  /**
   * Array of recognizing probabilities for a each line of text field. Only for Result.VISUAL_TEXT
   * and Result.MRZ_TEXT results.
   *
   * @return stringsResult
   */
  @javax.annotation.Nullable
  public List<StringRecognitionResult> getStringsResult() {
    return stringsResult;
  }

  public void setStringsResult(List<StringRecognitionResult> stringsResult) {
    this.stringsResult = stringsResult;
  }

  public DocVisualExtendedField withBufText(String bufText) {
    this.bufText = bufText;
    return this;
  }

  /**
   * Text field data in UTF8 format. Results of reading different lines of a multi-line field are
   * separated by &#39;^&#39;
   *
   * @return bufText
   */
  @javax.annotation.Nullable
  public String getBufText() {
    return bufText;
  }

  public void setBufText(String bufText) {
    this.bufText = bufText;
  }

  public DocVisualExtendedField withFieldRect(RectangleCoordinates fieldRect) {
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

  public DocVisualExtendedField withRfIDOriginDG(Integer rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
    return this;
  }

  /**
   * Origin data group information. Only for Result.RFID_TEXT results.
   *
   * @return rfIDOriginDG
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginDG() {
    return rfIDOriginDG;
  }

  public void setRfIDOriginDG(Integer rfIDOriginDG) {
    this.rfIDOriginDG = rfIDOriginDG;
  }

  public DocVisualExtendedField withRfIDOriginTagEntry(Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
    return this;
  }

  /**
   * Index of the text field record in origin data group. Only for Result.RFID_TEXT results.
   *
   * @return rfIDOriginTagEntry
   */
  @javax.annotation.Nullable
  public Integer getRfIDOriginTagEntry() {
    return rfIDOriginTagEntry;
  }

  public void setRfIDOriginTagEntry(Integer rfIDOriginTagEntry) {
    this.rfIDOriginTagEntry = rfIDOriginTagEntry;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocVisualExtendedField docVisualExtendedField = (DocVisualExtendedField) o;
    return Objects.equals(this.wFieldType, docVisualExtendedField.wFieldType)
        && Objects.equals(this.fieldName, docVisualExtendedField.fieldName)
        && Objects.equals(this.wLCID, docVisualExtendedField.wLCID)
        && Objects.equals(this.stringsResult, docVisualExtendedField.stringsResult)
        && Objects.equals(this.bufText, docVisualExtendedField.bufText)
        && Objects.equals(this.fieldRect, docVisualExtendedField.fieldRect)
        && Objects.equals(this.rfIDOriginDG, docVisualExtendedField.rfIDOriginDG)
        && Objects.equals(this.rfIDOriginTagEntry, docVisualExtendedField.rfIDOriginTagEntry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        wFieldType,
        fieldName,
        wLCID,
        stringsResult,
        bufText,
        fieldRect,
        rfIDOriginDG,
        rfIDOriginTagEntry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocVisualExtendedField {\n");
    sb.append("    wFieldType: ").append(toIndentedString(wFieldType)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    wLCID: ").append(toIndentedString(wLCID)).append("\n");
    sb.append("    stringsResult: ").append(toIndentedString(stringsResult)).append("\n");
    sb.append("    bufText: ").append(toIndentedString(bufText)).append("\n");
    sb.append("    fieldRect: ").append(toIndentedString(fieldRect)).append("\n");
    sb.append("    rfIDOriginDG: ").append(toIndentedString(rfIDOriginDG)).append("\n");
    sb.append("    rfIDOriginTagEntry: ").append(toIndentedString(rfIDOriginTagEntry)).append("\n");
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
