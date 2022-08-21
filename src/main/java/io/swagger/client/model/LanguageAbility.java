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
 * Ability of an individual to understand or converse in a language.
 */
@Schema(description = "Ability of an individual to understand or converse in a language.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-20T21:27:45.774766+02:00[Europe/Stockholm]")
public class LanguageAbility {
  @SerializedName("isFavouriteLanguage")
  private Boolean isFavouriteLanguage = null;

  @SerializedName("languageCode")
  private String languageCode = null;

  @SerializedName("languageName")
  private String languageName = null;

  @SerializedName("listeningProficiency")
  private String listeningProficiency = null;

  @SerializedName("readingProficiency")
  private String readingProficiency = null;

  @SerializedName("speakingProficiency")
  private String speakingProficiency = null;

  @SerializedName("writingProficiency")
  private String writingProficiency = null;

  @SerializedName("validFor")
  private TimePeriod validFor = null;

  @SerializedName("@baseType")
  private String _atBaseType = null;

  @SerializedName("@schemaLocation")
  private String _atSchemaLocation = null;

  @SerializedName("@type")
  private String _atType = null;

  public LanguageAbility isFavouriteLanguage(Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
    return this;
  }

   /**
   * A “true” value specifies whether the language is considered by the individual as his favourite one
   * @return isFavouriteLanguage
  **/
  @Schema(description = "A “true” value specifies whether the language is considered by the individual as his favourite one")
  public Boolean isIsFavouriteLanguage() {
    return isFavouriteLanguage;
  }

  public void setIsFavouriteLanguage(Boolean isFavouriteLanguage) {
    this.isFavouriteLanguage = isFavouriteLanguage;
  }

  public LanguageAbility languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

   /**
   * Language code (RFC 5646)
   * @return languageCode
  **/
  @Schema(description = "Language code (RFC 5646)")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  public LanguageAbility languageName(String languageName) {
    this.languageName = languageName;
    return this;
  }

   /**
   * Language name
   * @return languageName
  **/
  @Schema(description = "Language name")
  public String getLanguageName() {
    return languageName;
  }

  public void setLanguageName(String languageName) {
    this.languageName = languageName;
  }

  public LanguageAbility listeningProficiency(String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
    return this;
  }

   /**
   * Listening proficiency evaluated for this language
   * @return listeningProficiency
  **/
  @Schema(description = "Listening proficiency evaluated for this language")
  public String getListeningProficiency() {
    return listeningProficiency;
  }

  public void setListeningProficiency(String listeningProficiency) {
    this.listeningProficiency = listeningProficiency;
  }

  public LanguageAbility readingProficiency(String readingProficiency) {
    this.readingProficiency = readingProficiency;
    return this;
  }

   /**
   * Reading proficiency evaluated for this language
   * @return readingProficiency
  **/
  @Schema(description = "Reading proficiency evaluated for this language")
  public String getReadingProficiency() {
    return readingProficiency;
  }

  public void setReadingProficiency(String readingProficiency) {
    this.readingProficiency = readingProficiency;
  }

  public LanguageAbility speakingProficiency(String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
    return this;
  }

   /**
   * Speaking proficiency evaluated for this language
   * @return speakingProficiency
  **/
  @Schema(description = "Speaking proficiency evaluated for this language")
  public String getSpeakingProficiency() {
    return speakingProficiency;
  }

  public void setSpeakingProficiency(String speakingProficiency) {
    this.speakingProficiency = speakingProficiency;
  }

  public LanguageAbility writingProficiency(String writingProficiency) {
    this.writingProficiency = writingProficiency;
    return this;
  }

   /**
   * Writing proficiency evaluated for this language
   * @return writingProficiency
  **/
  @Schema(description = "Writing proficiency evaluated for this language")
  public String getWritingProficiency() {
    return writingProficiency;
  }

  public void setWritingProficiency(String writingProficiency) {
    this.writingProficiency = writingProficiency;
  }

  public LanguageAbility validFor(TimePeriod validFor) {
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

  public LanguageAbility _atBaseType(String _atBaseType) {
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

  public LanguageAbility _atSchemaLocation(String _atSchemaLocation) {
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

  public LanguageAbility _atType(String _atType) {
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
    LanguageAbility languageAbility = (LanguageAbility) o;
    return Objects.equals(this.isFavouriteLanguage, languageAbility.isFavouriteLanguage) &&
        Objects.equals(this.languageCode, languageAbility.languageCode) &&
        Objects.equals(this.languageName, languageAbility.languageName) &&
        Objects.equals(this.listeningProficiency, languageAbility.listeningProficiency) &&
        Objects.equals(this.readingProficiency, languageAbility.readingProficiency) &&
        Objects.equals(this.speakingProficiency, languageAbility.speakingProficiency) &&
        Objects.equals(this.writingProficiency, languageAbility.writingProficiency) &&
        Objects.equals(this.validFor, languageAbility.validFor) &&
        Objects.equals(this._atBaseType, languageAbility._atBaseType) &&
        Objects.equals(this._atSchemaLocation, languageAbility._atSchemaLocation) &&
        Objects.equals(this._atType, languageAbility._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFavouriteLanguage, languageCode, languageName, listeningProficiency, readingProficiency, speakingProficiency, writingProficiency, validFor, _atBaseType, _atSchemaLocation, _atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LanguageAbility {\n");
    
    sb.append("    isFavouriteLanguage: ").append(toIndentedString(isFavouriteLanguage)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    languageName: ").append(toIndentedString(languageName)).append("\n");
    sb.append("    listeningProficiency: ").append(toIndentedString(listeningProficiency)).append("\n");
    sb.append("    readingProficiency: ").append(toIndentedString(readingProficiency)).append("\n");
    sb.append("    speakingProficiency: ").append(toIndentedString(speakingProficiency)).append("\n");
    sb.append("    writingProficiency: ").append(toIndentedString(writingProficiency)).append("\n");
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
