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

/** ProcessRequestImage */
public class ProcessRequestImage {
  public static final String SERIALIZED_NAME_IMAGE_DATA = "ImageData";

  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private ImageData imageData;

  public static final String SERIALIZED_NAME_LIGHT_INDEX = "LightIndex";

  @SerializedName(SERIALIZED_NAME_LIGHT_INDEX)
  private int lightIndex;

  public static final String SERIALIZED_NAME_PAGE_IDX = "page_idx";

  @SerializedName(SERIALIZED_NAME_PAGE_IDX)
  private int pageIdx = 0;

  public ProcessRequestImage withImageData(ImageData imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Get imageData
   *
   * @return imageData
   */
  public ImageData getImageData() {
    return imageData;
  }

  public void setImageData(ImageData imageData) {
    this.imageData = imageData;
  }

  public ProcessRequestImage withLightIndex(int lightIndex) {
    this.lightIndex = lightIndex;
    return this;
  }

  /**
   * Get lightIndex
   *
   * @return lightIndex
   */
  public int getLightIndex() {
    return lightIndex;
  }

  public void setLightIndex(int lightIndex) {
    this.lightIndex = lightIndex;
  }

  public ProcessRequestImage withPageIdx(int pageIdx) {
    this.pageIdx = pageIdx;
    return this;
  }

  /**
   * page/image number
   *
   * @return pageIdx
   */
  @javax.annotation.Nullable
  public int getPageIdx() {
    return pageIdx;
  }

  public void setPageIdx(int pageIdx) {
    this.pageIdx = pageIdx;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessRequestImage processRequestImage = (ProcessRequestImage) o;
    return Objects.equals(this.imageData, processRequestImage.imageData)
        && Objects.equals(this.lightIndex, processRequestImage.lightIndex)
        && Objects.equals(this.pageIdx, processRequestImage.pageIdx);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageData, lightIndex, pageIdx);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessRequestImage {\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
    sb.append("    lightIndex: ").append(toIndentedString(lightIndex)).append("\n");
    sb.append("    pageIdx: ").append(toIndentedString(pageIdx)).append("\n");
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
