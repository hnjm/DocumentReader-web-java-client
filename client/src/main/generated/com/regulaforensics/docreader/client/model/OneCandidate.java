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
import java.math.BigDecimal;
import java.util.Objects;

/** Contains information about one document type candidate */
public class OneCandidate {
  public static final String SERIALIZED_NAME_DOCUMENT_NAME = "DocumentName";

  @SerializedName(SERIALIZED_NAME_DOCUMENT_NAME)
  private String documentName;

  public static final String SERIALIZED_NAME_I_D = "ID";

  @SerializedName(SERIALIZED_NAME_I_D)
  private int ID;

  public static final String SERIALIZED_NAME_P = "P";

  @SerializedName(SERIALIZED_NAME_P)
  private BigDecimal P;

  public static final String SERIALIZED_NAME_RF_I_D_PRESENCE = "RFID_Presence";

  @SerializedName(SERIALIZED_NAME_RF_I_D_PRESENCE)
  private int rfIDPresence;

  public static final String SERIALIZED_NAME_FD_S_I_D_LIST = "FDSIDList";

  @SerializedName(SERIALIZED_NAME_FD_S_I_D_LIST)
  private TFDSIDList fdSIDList;

  public static final String SERIALIZED_NAME_NECESSARY_LIGHTS = "NecessaryLights";

  @SerializedName(SERIALIZED_NAME_NECESSARY_LIGHTS)
  private int necessaryLights;

  public static final String SERIALIZED_NAME_CHECK_AUTHENTICITY = "CheckAuthenticity";

  @SerializedName(SERIALIZED_NAME_CHECK_AUTHENTICITY)
  private int checkAuthenticity;

  public static final String SERIALIZED_NAME_UV_EXP = "UVExp";

  @SerializedName(SERIALIZED_NAME_UV_EXP)
  private int uvExp;

  public static final String SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS =
      "AuthenticityNecessaryLights";

  @SerializedName(SERIALIZED_NAME_AUTHENTICITY_NECESSARY_LIGHTS)
  private int authenticityNecessaryLights;

  public OneCandidate withDocumentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Document name
   *
   * @return documentName
   */
  @javax.annotation.Nullable
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public OneCandidate withID(int ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique document type template identifier (Regula&#39;s internal numeric code)
   *
   * @return ID
   */
  @javax.annotation.Nullable
  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public OneCandidate withP(BigDecimal P) {
    this.P = P;
    return this;
  }

  /**
   * A measure of the likelihood of correct recognition in the analysis of this type of document
   * minimum: 0 maximum: 1
   *
   * @return P
   */
  @javax.annotation.Nullable
  public BigDecimal getP() {
    return P;
  }

  public void setP(BigDecimal P) {
    this.P = P;
  }

  public OneCandidate withRfIDPresence(int rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
    return this;
  }

  /**
   * Get rfIDPresence
   *
   * @return rfIDPresence
   */
  @javax.annotation.Nullable
  public int getRfIDPresence() {
    return rfIDPresence;
  }

  public void setRfIDPresence(int rfIDPresence) {
    this.rfIDPresence = rfIDPresence;
  }

  public OneCandidate withFdSIDList(TFDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
    return this;
  }

  /**
   * Get fdSIDList
   *
   * @return fdSIDList
   */
  @javax.annotation.Nullable
  public TFDSIDList getFdSIDList() {
    return fdSIDList;
  }

  public void setFdSIDList(TFDSIDList fdSIDList) {
    this.fdSIDList = fdSIDList;
  }

  public OneCandidate withNecessaryLights(int necessaryLights) {
    this.necessaryLights = necessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (Light enum) required to conduct OCR for this type
   * of document
   *
   * @return necessaryLights
   */
  @javax.annotation.Nullable
  public int getNecessaryLights() {
    return necessaryLights;
  }

  public void setNecessaryLights(int necessaryLights) {
    this.necessaryLights = necessaryLights;
  }

  public OneCandidate withCheckAuthenticity(int checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
    return this;
  }

  /**
   * Set of authentication options provided for this type of document (combination of Authenticity
   * enum)
   *
   * @return checkAuthenticity
   */
  @javax.annotation.Nullable
  public int getCheckAuthenticity() {
    return checkAuthenticity;
  }

  public void setCheckAuthenticity(int checkAuthenticity) {
    this.checkAuthenticity = checkAuthenticity;
  }

  public OneCandidate withUvExp(int uvExp) {
    this.uvExp = uvExp;
    return this;
  }

  /**
   * The required exposure value of the camera when receiving images of a document of this type for
   * a UV lighting scheme
   *
   * @return uvExp
   */
  @javax.annotation.Nullable
  public int getUvExp() {
    return uvExp;
  }

  public void setUvExp(int uvExp) {
    this.uvExp = uvExp;
  }

  public OneCandidate withAuthenticityNecessaryLights(int authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
    return this;
  }

  /**
   * Combination of lighting scheme identifiers (combination of Light enum) needed to perform all
   * authenticity checks specified in CheckAuthenticity
   *
   * @return authenticityNecessaryLights
   */
  @javax.annotation.Nullable
  public int getAuthenticityNecessaryLights() {
    return authenticityNecessaryLights;
  }

  public void setAuthenticityNecessaryLights(int authenticityNecessaryLights) {
    this.authenticityNecessaryLights = authenticityNecessaryLights;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneCandidate oneCandidate = (OneCandidate) o;
    return Objects.equals(this.documentName, oneCandidate.documentName)
        && Objects.equals(this.ID, oneCandidate.ID)
        && Objects.equals(this.P, oneCandidate.P)
        && Objects.equals(this.rfIDPresence, oneCandidate.rfIDPresence)
        && Objects.equals(this.fdSIDList, oneCandidate.fdSIDList)
        && Objects.equals(this.necessaryLights, oneCandidate.necessaryLights)
        && Objects.equals(this.checkAuthenticity, oneCandidate.checkAuthenticity)
        && Objects.equals(this.uvExp, oneCandidate.uvExp)
        && Objects.equals(
            this.authenticityNecessaryLights, oneCandidate.authenticityNecessaryLights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        documentName,
        ID,
        P,
        rfIDPresence,
        fdSIDList,
        necessaryLights,
        checkAuthenticity,
        uvExp,
        authenticityNecessaryLights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneCandidate {\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    P: ").append(toIndentedString(P)).append("\n");
    sb.append("    rfIDPresence: ").append(toIndentedString(rfIDPresence)).append("\n");
    sb.append("    fdSIDList: ").append(toIndentedString(fdSIDList)).append("\n");
    sb.append("    necessaryLights: ").append(toIndentedString(necessaryLights)).append("\n");
    sb.append("    checkAuthenticity: ").append(toIndentedString(checkAuthenticity)).append("\n");
    sb.append("    uvExp: ").append(toIndentedString(uvExp)).append("\n");
    sb.append("    authenticityNecessaryLights: ")
        .append(toIndentedString(authenticityNecessaryLights))
        .append("\n");
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
