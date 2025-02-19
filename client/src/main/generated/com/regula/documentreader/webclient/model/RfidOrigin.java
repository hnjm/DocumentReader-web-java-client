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

/** Location of data in RFID chip */
public class RfidOrigin {
  public static final String SERIALIZED_NAME_DG = "dg";

  @SerializedName(SERIALIZED_NAME_DG)
  private Integer dg;

  public static final String SERIALIZED_NAME_DG_TAG = "dgTag";

  @SerializedName(SERIALIZED_NAME_DG_TAG)
  private Integer dgTag;

  public static final String SERIALIZED_NAME_TAG_ENTRY = "tagEntry";

  @SerializedName(SERIALIZED_NAME_TAG_ENTRY)
  private Integer tagEntry;

  public static final String SERIALIZED_NAME_ENTRY_VIEW = "entryView";

  @SerializedName(SERIALIZED_NAME_ENTRY_VIEW)
  private Integer entryView;

  public RfidOrigin withDg(Integer dg) {
    this.dg = dg;
    return this;
  }

  /**
   * Source data group file
   *
   * @return dg
   */
  public Integer getDg() {
    return dg;
  }

  public void setDg(Integer dg) {
    this.dg = dg;
  }

  public RfidOrigin withDgTag(Integer dgTag) {
    this.dgTag = dgTag;
    return this;
  }

  /**
   * Index of the source record of the image with biometric information in the information data
   * group
   *
   * @return dgTag
   */
  @javax.annotation.Nullable
  public Integer getDgTag() {
    return dgTag;
  }

  public void setDgTag(Integer dgTag) {
    this.dgTag = dgTag;
  }

  public RfidOrigin withTagEntry(Integer tagEntry) {
    this.tagEntry = tagEntry;
    return this;
  }

  /**
   * Index of the template in the record with biometric data
   *
   * @return tagEntry
   */
  @javax.annotation.Nullable
  public Integer getTagEntry() {
    return tagEntry;
  }

  public void setTagEntry(Integer tagEntry) {
    this.tagEntry = tagEntry;
  }

  public RfidOrigin withEntryView(Integer entryView) {
    this.entryView = entryView;
    return this;
  }

  /**
   * Index of the variant of the biometric data template
   *
   * @return entryView
   */
  @javax.annotation.Nullable
  public Integer getEntryView() {
    return entryView;
  }

  public void setEntryView(Integer entryView) {
    this.entryView = entryView;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RfidOrigin rfidOrigin = (RfidOrigin) o;
    return Objects.equals(this.dg, rfidOrigin.dg)
        && Objects.equals(this.dgTag, rfidOrigin.dgTag)
        && Objects.equals(this.tagEntry, rfidOrigin.tagEntry)
        && Objects.equals(this.entryView, rfidOrigin.entryView);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dg, dgTag, tagEntry, entryView);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RfidOrigin {\n");
    sb.append("    dg: ").append(toIndentedString(dg)).append("\n");
    sb.append("    dgTag: ").append(toIndentedString(dgTag)).append("\n");
    sb.append("    tagEntry: ").append(toIndentedString(tagEntry)).append("\n");
    sb.append("    entryView: ").append(toIndentedString(entryView)).append("\n");
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
