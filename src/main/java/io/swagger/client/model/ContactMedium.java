/*
 * API Party
 * ## TMF API Reference : TMF 632 - Party   ### Release : 19.0   The party API provides standardized mechanism for party management such as creation, update, retrieval, deletion and notification of events. Party can be an individual or an organization that has any kind of relation with the enterprise. Party is created to record individual or organization information before the assignment of any role. For example, within the context of a split billing mechanism, Party API allows creation of the individual or organization that will play the role of 3 rd payer for a given offer and, then, allows consultation or update of his information.  ### Resources - Organization - Individual - Hub  Party API performs the following operations : - Retrieve an organization or an individual - Retrieve a collection of organizations or individuals according to given criteria - Create a new organization or a new individual - Update an existing organization or an existing individual - Delete an existing organization or an existing individual - Notify events on organizatin or individual
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;
/**
 * Indicates the contact medium that could be used to contact the party.
 */
@Schema(description = "Indicates the contact medium that could be used to contact the party.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-20T21:27:45.774766+02:00[Europe/Stockholm]")
public class ContactMedium {
  @SerializedName("mediumType")
  private String mediumType = null;

  @SerializedName("preferred")
  private Boolean preferred = null;

  @SerializedName("characteristic")
  private MediumCharacteristic characteristic = null;

  @SerializedName("validFor")
  private TimePeriod validFor = null;

  @SerializedName("@baseType")
  private String _atBaseType = null;

  @SerializedName("@schemaLocation")
  private String _atSchemaLocation = null;

  @SerializedName("@type")
  private String _atType = null;

  public ContactMedium mediumType(String mediumType) {
    this.mediumType = mediumType;
    return this;
  }

   /**
   * Type of the contact medium, such as: email address, telephone number, postal address
   * @return mediumType
  **/
  @Schema(description = "Type of the contact medium, such as: email address, telephone number, postal address")
  public String getMediumType() {
    return mediumType;
  }

  public void setMediumType(String mediumType) {
    this.mediumType = mediumType;
  }

  public ContactMedium preferred(Boolean preferred) {
    this.preferred = preferred;
    return this;
  }

   /**
   * If true, indicates that is the preferred contact medium
   * @return preferred
  **/
  @Schema(description = "If true, indicates that is the preferred contact medium")
  public Boolean isPreferred() {
    return preferred;
  }

  public void setPreferred(Boolean preferred) {
    this.preferred = preferred;
  }

  public ContactMedium characteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
    return this;
  }

   /**
   * Get characteristic
   * @return characteristic
  **/
  @Schema(description = "")
  public MediumCharacteristic getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(MediumCharacteristic characteristic) {
    this.characteristic = characteristic;
  }

  public ContactMedium validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

   /**
   * Get validFor
   * @return validFor
  **/
  @Schema(description = "")
  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ContactMedium _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
  **/
  @Schema(description = "When sub-classing, this defines the super-class")
  public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public ContactMedium _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
  **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public ContactMedium _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
  **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactMedium contactMedium = (ContactMedium) o;
    return Objects.equals(this.mediumType, contactMedium.mediumType) &&
        Objects.equals(this.preferred, contactMedium.preferred) &&
        Objects.equals(this.characteristic, contactMedium.characteristic) &&
        Objects.equals(this.validFor, contactMedium.validFor) &&
        Objects.equals(this._atBaseType, contactMedium._atBaseType) &&
        Objects.equals(this._atSchemaLocation, contactMedium._atSchemaLocation) &&
        Objects.equals(this._atType, contactMedium._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediumType, preferred, characteristic, validFor, _atBaseType, _atSchemaLocation, _atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactMedium {\n");
    
    sb.append("    mediumType: ").append(toIndentedString(mediumType)).append("\n");
    sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
    sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
