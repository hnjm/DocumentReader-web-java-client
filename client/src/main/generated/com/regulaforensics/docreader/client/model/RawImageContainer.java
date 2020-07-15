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
import java.util.Arrays;
import java.util.Objects;

/** RawImageContainer */
public class RawImageContainer {
  public static final String SERIALIZED_NAME_FORMAT = "format";

  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_IMAGE = "image";

  @SerializedName(SERIALIZED_NAME_IMAGE)
  private byte[] image;

  public RawImageContainer withFormat(String format) {
    this.format = format;
    return this;
  }

  /**
   * Get format
   *
   * @return format
   */
  @javax.annotation.Nullable
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public RawImageContainer withImage(byte[] image) {
    this.image = image;
    return this;
  }

  /**
   * base64 encoded image
   *
   * @return image
   */
  @javax.annotation.Nullable
  public byte[] getImage() {
    return image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawImageContainer rawImageContainer = (RawImageContainer) o;
    return Objects.equals(this.format, rawImageContainer.format)
        && Arrays.equals(this.image, rawImageContainer.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, Arrays.hashCode(image));
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawImageContainer {\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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
