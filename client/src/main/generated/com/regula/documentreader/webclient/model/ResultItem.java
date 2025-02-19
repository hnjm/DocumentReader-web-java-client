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

/** Common fields for all result objects */
public class ResultItem {
  public static final String SERIALIZED_NAME_BUF_LENGTH = "buf_length";

  @SerializedName(SERIALIZED_NAME_BUF_LENGTH)
  private Integer bufLength;

  public static final String SERIALIZED_NAME_LIGHT = "light";

  @SerializedName(SERIALIZED_NAME_LIGHT)
  private Integer light;

  public static final String SERIALIZED_NAME_LIST_IDX = "list_idx";

  @SerializedName(SERIALIZED_NAME_LIST_IDX)
  private Integer listIdx;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  private Integer pageIdx;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";

  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  protected Integer resultType = 0;

  public ResultItem withBufLength(Integer bufLength) {
    this.bufLength = bufLength;
    return this;
  }

  /**
   * Get bufLength
   *
   * @return bufLength
   */
  @javax.annotation.Nullable
  public Integer getBufLength() {
    return bufLength;
  }

  public void setBufLength(Integer bufLength) {
    this.bufLength = bufLength;
  }

  public ResultItem withLight(Integer light) {
    this.light = light;
    return this;
  }

  /**
   * Get light
   *
   * @return light
   */
  @javax.annotation.Nullable
  public Integer getLight() {
    return light;
  }

  public void setLight(Integer light) {
    this.light = light;
  }

  public ResultItem withListIdx(Integer listIdx) {
    this.listIdx = listIdx;
    return this;
  }

  /**
   * Get listIdx
   *
   * @return listIdx
   */
  @javax.annotation.Nullable
  public Integer getListIdx() {
    return listIdx;
  }

  public void setListIdx(Integer listIdx) {
    this.listIdx = listIdx;
  }

  public ResultItem withPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * Get pageIdx
   *
   * @return pageIdx
   */
  @javax.annotation.Nullable
  public Integer getPageIdx() {
    return pageIdx;
  }

  public void setPageIdx(Integer pageIdx) {
    this.pageIdx = pageIdx;
  }

  public ResultItem withResultType(Integer resultType) {
    this.resultType = resultType;
    return this;
  }

  /**
   * Same as Result type, but used for safe parsing of not-described values. See Result type.
   *
   * @return resultType
   */
  public Integer getResultType() {
    return resultType;
  }

  public void setResultType(Integer resultType) {
    this.resultType = resultType;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultItem resultItem = (ResultItem) o;
    return Objects.equals(this.bufLength, resultItem.bufLength)
        && Objects.equals(this.light, resultItem.light)
        && Objects.equals(this.listIdx, resultItem.listIdx)
        && Objects.equals(this.pageIdx, resultItem.pageIdx)
        && Objects.equals(this.resultType, resultItem.resultType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bufLength, light, listIdx, pageIdx, resultType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultItem {\n");
    sb.append("    bufLength: ").append(toIndentedString(bufLength)).append("\n");
    sb.append("    light: ").append(toIndentedString(light)).append("\n");
    sb.append("    listIdx: ").append(toIndentedString(listIdx)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
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
