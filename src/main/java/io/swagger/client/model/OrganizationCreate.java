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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * Organization represents a group of people identified by shared interests or purpose. Examples include business, department and enterprise. Because of the complex nature of many businesses, both organizations and organization units are represented by the same data. Skipped properties: id,href
 */
@Schema(description = "Organization represents a group of people identified by shared interests or purpose. Examples include business, department and enterprise. Because of the complex nature of many businesses, both organizations and organization units are represented by the same data. Skipped properties: id,href")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-20T21:27:45.774766+02:00[Europe/Stockholm]")
public class OrganizationCreate {
  @SerializedName("isHeadOffice")
  private Boolean isHeadOffice = null;

  @SerializedName("isLegalEntity")
  private Boolean isLegalEntity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nameType")
  private String nameType = null;

  @SerializedName("organizationType")
  private String organizationType = null;

  @SerializedName("tradingName")
  private String tradingName = null;

  @SerializedName("contactMedium")
  private List<ContactMedium> contactMedium = null;

  @SerializedName("creditRating")
  private List<PartyCreditProfile> creditRating = null;

  @SerializedName("existsDuring")
  private TimePeriod existsDuring = null;

  @SerializedName("externalReference")
  private List<ExternalReference> externalReference = null;

  @SerializedName("organizationChildRelationship")
  private List<OrganizationChildRelationship> organizationChildRelationship = null;

  @SerializedName("organizationIdentification")
  private List<OrganizationIdentification> organizationIdentification = null;

  @SerializedName("organizationParentRelationship")
  private OrganizationParentRelationship organizationParentRelationship = null;

  @SerializedName("otherName")
  private List<OtherNameOrganization> otherName = null;

  @SerializedName("partyCharacteristic")
  private List<Characteristic> partyCharacteristic = null;

  @SerializedName("relatedParty")
  private List<RelatedParty> relatedParty = null;

  @SerializedName("status")
  private OrganizationStateType status = null;

  @SerializedName("taxExemptionCertificate")
  private List<TaxExemptionCertificate> taxExemptionCertificate = null;

  @SerializedName("@baseType")
  private String _atBaseType = null;

  @SerializedName("@schemaLocation")
  private String _atSchemaLocation = null;

  @SerializedName("@type")
  private String _atType = null;

  public OrganizationCreate isHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
    return this;
  }

   /**
   * If value is true, the organization is the head office
   * @return isHeadOffice
  **/
  @Schema(description = "If value is true, the organization is the head office")
  public Boolean isIsHeadOffice() {
    return isHeadOffice;
  }

  public void setIsHeadOffice(Boolean isHeadOffice) {
    this.isHeadOffice = isHeadOffice;
  }

  public OrganizationCreate isLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
    return this;
  }

   /**
   * If value is true, the organization is a legal entity known by a national referential.
   * @return isLegalEntity
  **/
  @Schema(description = "If value is true, the organization is a legal entity known by a national referential.")
  public Boolean isIsLegalEntity() {
    return isLegalEntity;
  }

  public void setIsLegalEntity(Boolean isLegalEntity) {
    this.isLegalEntity = isLegalEntity;
  }

  public OrganizationCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Organization name (department name for example)
   * @return name
  **/
  @Schema(description = "Organization name (department name for example)")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public OrganizationCreate nameType(String nameType) {
    this.nameType = nameType;
    return this;
  }

   /**
   * Type of the name : Co, Inc, Ltd,…
   * @return nameType
  **/
  @Schema(description = "Type of the name : Co, Inc, Ltd,…")
  public String getNameType() {
    return nameType;
  }

  public void setNameType(String nameType) {
    this.nameType = nameType;
  }

  public OrganizationCreate organizationType(String organizationType) {
    this.organizationType = organizationType;
    return this;
  }

   /**
   * Type of Organization (company, department...)
   * @return organizationType
  **/
  @Schema(description = "Type of Organization (company, department...)")
  public String getOrganizationType() {
    return organizationType;
  }

  public void setOrganizationType(String organizationType) {
    this.organizationType = organizationType;
  }

  public OrganizationCreate tradingName(String tradingName) {
    this.tradingName = tradingName;
    return this;
  }

   /**
   * Name that the organization (unit) trades under
   * @return tradingName
  **/
  @Schema(required = true, description = "Name that the organization (unit) trades under")
  public String getTradingName() {
    return tradingName;
  }

  public void setTradingName(String tradingName) {
    this.tradingName = tradingName;
  }

  public OrganizationCreate contactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
    return this;
  }

  public OrganizationCreate addContactMediumItem(ContactMedium contactMediumItem) {
    if (this.contactMedium == null) {
      this.contactMedium = new ArrayList<ContactMedium>();
    }
    this.contactMedium.add(contactMediumItem);
    return this;
  }

   /**
   * Get contactMedium
   * @return contactMedium
  **/
  @Schema(description = "")
  public List<ContactMedium> getContactMedium() {
    return contactMedium;
  }

  public void setContactMedium(List<ContactMedium> contactMedium) {
    this.contactMedium = contactMedium;
  }

  public OrganizationCreate creditRating(List<PartyCreditProfile> creditRating) {
    this.creditRating = creditRating;
    return this;
  }

  public OrganizationCreate addCreditRatingItem(PartyCreditProfile creditRatingItem) {
    if (this.creditRating == null) {
      this.creditRating = new ArrayList<PartyCreditProfile>();
    }
    this.creditRating.add(creditRatingItem);
    return this;
  }

   /**
   * Get creditRating
   * @return creditRating
  **/
  @Schema(description = "")
  public List<PartyCreditProfile> getCreditRating() {
    return creditRating;
  }

  public void setCreditRating(List<PartyCreditProfile> creditRating) {
    this.creditRating = creditRating;
  }

  public OrganizationCreate existsDuring(TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
    return this;
  }

   /**
   * Get existsDuring
   * @return existsDuring
  **/
  @Schema(description = "")
  public TimePeriod getExistsDuring() {
    return existsDuring;
  }

  public void setExistsDuring(TimePeriod existsDuring) {
    this.existsDuring = existsDuring;
  }

  public OrganizationCreate externalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
    return this;
  }

  public OrganizationCreate addExternalReferenceItem(ExternalReference externalReferenceItem) {
    if (this.externalReference == null) {
      this.externalReference = new ArrayList<ExternalReference>();
    }
    this.externalReference.add(externalReferenceItem);
    return this;
  }

   /**
   * Get externalReference
   * @return externalReference
  **/
  @Schema(description = "")
  public List<ExternalReference> getExternalReference() {
    return externalReference;
  }

  public void setExternalReference(List<ExternalReference> externalReference) {
    this.externalReference = externalReference;
  }

  public OrganizationCreate organizationChildRelationship(List<OrganizationChildRelationship> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
    return this;
  }

  public OrganizationCreate addOrganizationChildRelationshipItem(OrganizationChildRelationship organizationChildRelationshipItem) {
    if (this.organizationChildRelationship == null) {
      this.organizationChildRelationship = new ArrayList<OrganizationChildRelationship>();
    }
    this.organizationChildRelationship.add(organizationChildRelationshipItem);
    return this;
  }

   /**
   * Get organizationChildRelationship
   * @return organizationChildRelationship
  **/
  @Schema(description = "")
  public List<OrganizationChildRelationship> getOrganizationChildRelationship() {
    return organizationChildRelationship;
  }

  public void setOrganizationChildRelationship(List<OrganizationChildRelationship> organizationChildRelationship) {
    this.organizationChildRelationship = organizationChildRelationship;
  }

  public OrganizationCreate organizationIdentification(List<OrganizationIdentification> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
    return this;
  }

  public OrganizationCreate addOrganizationIdentificationItem(OrganizationIdentification organizationIdentificationItem) {
    if (this.organizationIdentification == null) {
      this.organizationIdentification = new ArrayList<OrganizationIdentification>();
    }
    this.organizationIdentification.add(organizationIdentificationItem);
    return this;
  }

   /**
   * Get organizationIdentification
   * @return organizationIdentification
  **/
  @Schema(description = "")
  public List<OrganizationIdentification> getOrganizationIdentification() {
    return organizationIdentification;
  }

  public void setOrganizationIdentification(List<OrganizationIdentification> organizationIdentification) {
    this.organizationIdentification = organizationIdentification;
  }

  public OrganizationCreate organizationParentRelationship(OrganizationParentRelationship organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
    return this;
  }

   /**
   * Get organizationParentRelationship
   * @return organizationParentRelationship
  **/
  @Schema(description = "")
  public OrganizationParentRelationship getOrganizationParentRelationship() {
    return organizationParentRelationship;
  }

  public void setOrganizationParentRelationship(OrganizationParentRelationship organizationParentRelationship) {
    this.organizationParentRelationship = organizationParentRelationship;
  }

  public OrganizationCreate otherName(List<OtherNameOrganization> otherName) {
    this.otherName = otherName;
    return this;
  }

  public OrganizationCreate addOtherNameItem(OtherNameOrganization otherNameItem) {
    if (this.otherName == null) {
      this.otherName = new ArrayList<OtherNameOrganization>();
    }
    this.otherName.add(otherNameItem);
    return this;
  }

   /**
   * Get otherName
   * @return otherName
  **/
  @Schema(description = "")
  public List<OtherNameOrganization> getOtherName() {
    return otherName;
  }

  public void setOtherName(List<OtherNameOrganization> otherName) {
    this.otherName = otherName;
  }

  public OrganizationCreate partyCharacteristic(List<Characteristic> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
    return this;
  }

  public OrganizationCreate addPartyCharacteristicItem(Characteristic partyCharacteristicItem) {
    if (this.partyCharacteristic == null) {
      this.partyCharacteristic = new ArrayList<Characteristic>();
    }
    this.partyCharacteristic.add(partyCharacteristicItem);
    return this;
  }

   /**
   * Get partyCharacteristic
   * @return partyCharacteristic
  **/
  @Schema(description = "")
  public List<Characteristic> getPartyCharacteristic() {
    return partyCharacteristic;
  }

  public void setPartyCharacteristic(List<Characteristic> partyCharacteristic) {
    this.partyCharacteristic = partyCharacteristic;
  }

  public OrganizationCreate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public OrganizationCreate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Get relatedParty
   * @return relatedParty
  **/
  @Schema(description = "")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public OrganizationCreate status(OrganizationStateType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public OrganizationStateType getStatus() {
    return status;
  }

  public void setStatus(OrganizationStateType status) {
    this.status = status;
  }

  public OrganizationCreate taxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
    return this;
  }

  public OrganizationCreate addTaxExemptionCertificateItem(TaxExemptionCertificate taxExemptionCertificateItem) {
    if (this.taxExemptionCertificate == null) {
      this.taxExemptionCertificate = new ArrayList<TaxExemptionCertificate>();
    }
    this.taxExemptionCertificate.add(taxExemptionCertificateItem);
    return this;
  }

   /**
   * Get taxExemptionCertificate
   * @return taxExemptionCertificate
  **/
  @Schema(description = "")
  public List<TaxExemptionCertificate> getTaxExemptionCertificate() {
    return taxExemptionCertificate;
  }

  public void setTaxExemptionCertificate(List<TaxExemptionCertificate> taxExemptionCertificate) {
    this.taxExemptionCertificate = taxExemptionCertificate;
  }

  public OrganizationCreate _atBaseType(String _atBaseType) {
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

  public OrganizationCreate _atSchemaLocation(String _atSchemaLocation) {
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

  public OrganizationCreate _atType(String _atType) {
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
    OrganizationCreate organizationCreate = (OrganizationCreate) o;
    return Objects.equals(this.isHeadOffice, organizationCreate.isHeadOffice) &&
        Objects.equals(this.isLegalEntity, organizationCreate.isLegalEntity) &&
        Objects.equals(this.name, organizationCreate.name) &&
        Objects.equals(this.nameType, organizationCreate.nameType) &&
        Objects.equals(this.organizationType, organizationCreate.organizationType) &&
        Objects.equals(this.tradingName, organizationCreate.tradingName) &&
        Objects.equals(this.contactMedium, organizationCreate.contactMedium) &&
        Objects.equals(this.creditRating, organizationCreate.creditRating) &&
        Objects.equals(this.existsDuring, organizationCreate.existsDuring) &&
        Objects.equals(this.externalReference, organizationCreate.externalReference) &&
        Objects.equals(this.organizationChildRelationship, organizationCreate.organizationChildRelationship) &&
        Objects.equals(this.organizationIdentification, organizationCreate.organizationIdentification) &&
        Objects.equals(this.organizationParentRelationship, organizationCreate.organizationParentRelationship) &&
        Objects.equals(this.otherName, organizationCreate.otherName) &&
        Objects.equals(this.partyCharacteristic, organizationCreate.partyCharacteristic) &&
        Objects.equals(this.relatedParty, organizationCreate.relatedParty) &&
        Objects.equals(this.status, organizationCreate.status) &&
        Objects.equals(this.taxExemptionCertificate, organizationCreate.taxExemptionCertificate) &&
        Objects.equals(this._atBaseType, organizationCreate._atBaseType) &&
        Objects.equals(this._atSchemaLocation, organizationCreate._atSchemaLocation) &&
        Objects.equals(this._atType, organizationCreate._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHeadOffice, isLegalEntity, name, nameType, organizationType, tradingName, contactMedium, creditRating, existsDuring, externalReference, organizationChildRelationship, organizationIdentification, organizationParentRelationship, otherName, partyCharacteristic, relatedParty, status, taxExemptionCertificate, _atBaseType, _atSchemaLocation, _atType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreate {\n");
    
    sb.append("    isHeadOffice: ").append(toIndentedString(isHeadOffice)).append("\n");
    sb.append("    isLegalEntity: ").append(toIndentedString(isLegalEntity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameType: ").append(toIndentedString(nameType)).append("\n");
    sb.append("    organizationType: ").append(toIndentedString(organizationType)).append("\n");
    sb.append("    tradingName: ").append(toIndentedString(tradingName)).append("\n");
    sb.append("    contactMedium: ").append(toIndentedString(contactMedium)).append("\n");
    sb.append("    creditRating: ").append(toIndentedString(creditRating)).append("\n");
    sb.append("    existsDuring: ").append(toIndentedString(existsDuring)).append("\n");
    sb.append("    externalReference: ").append(toIndentedString(externalReference)).append("\n");
    sb.append("    organizationChildRelationship: ").append(toIndentedString(organizationChildRelationship)).append("\n");
    sb.append("    organizationIdentification: ").append(toIndentedString(organizationIdentification)).append("\n");
    sb.append("    organizationParentRelationship: ").append(toIndentedString(organizationParentRelationship)).append("\n");
    sb.append("    otherName: ").append(toIndentedString(otherName)).append("\n");
    sb.append("    partyCharacteristic: ").append(toIndentedString(partyCharacteristic)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taxExemptionCertificate: ").append(toIndentedString(taxExemptionCertificate)).append("\n");
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
