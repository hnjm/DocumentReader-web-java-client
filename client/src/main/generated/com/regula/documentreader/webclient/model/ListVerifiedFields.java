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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** ListVerifiedFields */
public class ListVerifiedFields {
  public static final String SERIALIZED_NAME_P_FIELD_MAPS = "pFieldMaps";

  @SerializedName(SERIALIZED_NAME_P_FIELD_MAPS)
  private List<VerifiedFieldMap> pFieldMaps = null;

  public ListVerifiedFields withPFieldMaps(List<VerifiedFieldMap> pFieldMaps) {
    this.pFieldMaps = pFieldMaps;
    return this;
  }

  public ListVerifiedFields addPFieldMapsItem(VerifiedFieldMap pFieldMapsItem) {
    if (this.pFieldMaps == null) {
      this.pFieldMaps = new ArrayList<VerifiedFieldMap>();
    }
    this.pFieldMaps.add(pFieldMapsItem);
    return this;
  }

  /**
   * Get pFieldMaps
   *
   * @return pFieldMaps
   */
  @javax.annotation.Nullable
  public List<VerifiedFieldMap> getpFieldMaps() {
    return pFieldMaps;
  }

  public void setpFieldMaps(List<VerifiedFieldMap> pFieldMaps) {
    this.pFieldMaps = pFieldMaps;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVerifiedFields listVerifiedFields = (ListVerifiedFields) o;
    return Objects.equals(this.pFieldMaps, listVerifiedFields.pFieldMaps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pFieldMaps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVerifiedFields {\n");
    sb.append("    pFieldMaps: ").append(toIndentedString(pFieldMaps)).append("\n");
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
