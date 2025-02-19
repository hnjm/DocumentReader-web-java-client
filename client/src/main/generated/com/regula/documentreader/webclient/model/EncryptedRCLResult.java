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
import java.util.Arrays;
import java.util.Objects;

/** EncryptedRCLResult */
public class EncryptedRCLResult extends ResultItem {
  public static final String SERIALIZED_NAME_ENCRYPTED_R_C_L = "EncryptedRCL";

  @SerializedName(SERIALIZED_NAME_ENCRYPTED_R_C_L)
  private byte[] encryptedRCL;

  public EncryptedRCLResult withEncryptedRCL(byte[] encryptedRCL) {
    this.encryptedRCL = encryptedRCL;
    return this;
  }

  /**
   * Base64 encoded data
   *
   * @return encryptedRCL
   */
  public byte[] getEncryptedRCL() {
    return encryptedRCL;
  }

  public void setEncryptedRCL(byte[] encryptedRCL) {
    this.encryptedRCL = encryptedRCL;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EncryptedRCLResult encryptedRCLResult = (EncryptedRCLResult) o;
    return Arrays.equals(this.encryptedRCL, encryptedRCLResult.encryptedRCL) && super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(encryptedRCL), super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptedRCLResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    encryptedRCL: ").append(toIndentedString(encryptedRCL)).append("\n");
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
