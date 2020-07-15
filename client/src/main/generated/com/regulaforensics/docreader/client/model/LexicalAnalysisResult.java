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

/**
 * Lexical data analysis allows you to compare the results of reading the text data of the MRZ, the
 * document filling area, barcodes and data from the memory of the RFID chip for an additional
 * assessment of the authenticity of the document
 */
public class LexicalAnalysisResult extends ResultItem {
  public static final String SERIALIZED_NAME_LIST_VERIFIED_FIELDS = "ListVerifiedFields";

  @SerializedName(SERIALIZED_NAME_LIST_VERIFIED_FIELDS)
  private ListVerifiedFields listVerifiedFields;

  public LexicalAnalysisResult withListVerifiedFields(ListVerifiedFields listVerifiedFields) {
    this.listVerifiedFields = listVerifiedFields;
    return this;
  }

  /**
   * Get listVerifiedFields
   *
   * @return listVerifiedFields
   */
  @javax.annotation.Nullable
  public ListVerifiedFields getListVerifiedFields() {
    return listVerifiedFields;
  }

  public void setListVerifiedFields(ListVerifiedFields listVerifiedFields) {
    this.listVerifiedFields = listVerifiedFields;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LexicalAnalysisResult lexicalAnalysisResult = (LexicalAnalysisResult) o;
    return Objects.equals(this.listVerifiedFields, lexicalAnalysisResult.listVerifiedFields)
        && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listVerifiedFields, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LexicalAnalysisResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    listVerifiedFields: ").append(toIndentedString(listVerifiedFields)).append("\n");
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
