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
import org.threeten.bp.OffsetDateTime;

import java.util.Objects;
/**
 * The notification data structure
 */
@Schema(description = "The notification data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-08-20T21:27:45.774766+02:00[Europe/Stockholm]")
public class OrganizationCreateEvent {
  @SerializedName("eventId")
  private String eventId = null;

  @SerializedName("eventTime")
  private OffsetDateTime eventTime = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("timeOcurred")
  private OffsetDateTime timeOcurred = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("priority")
  private String priority = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("correlationId")
  private String correlationId = null;

  @SerializedName("event")
  private OrganizationCreateEventPayload event = null;

  public OrganizationCreateEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  @Schema(description = "The identifier of the notification.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public OrganizationCreateEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  @Schema(description = "Time of the event occurrence.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public OrganizationCreateEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An explnatory of the event.
   * @return description
  **/
  @Schema(description = "An explnatory of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrganizationCreateEvent timeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  @Schema(description = "The time the event occured.")
  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public OrganizationCreateEvent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  @Schema(description = "The title of the event.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrganizationCreateEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  @Schema(description = "The type of the notification.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public OrganizationCreateEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  @Schema(description = "The domain of the event.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public OrganizationCreateEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  @Schema(description = "A priority.")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public OrganizationCreateEvent href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the ProcessFlow
   * @return href
  **/
  @Schema(description = "Reference of the ProcessFlow")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public OrganizationCreateEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the Process flow
   * @return id
  **/
  @Schema(description = "Identifier of the Process flow")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrganizationCreateEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  @Schema(description = "The correlation id for this event.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public OrganizationCreateEvent event(OrganizationCreateEventPayload event) {
    this.event = event;
    return this;
  }

   /**
   * Get event
   * @return event
  **/
  @Schema(description = "")
  public OrganizationCreateEventPayload getEvent() {
    return event;
  }

  public void setEvent(OrganizationCreateEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationCreateEvent organizationCreateEvent = (OrganizationCreateEvent) o;
    return Objects.equals(this.eventId, organizationCreateEvent.eventId) &&
        Objects.equals(this.eventTime, organizationCreateEvent.eventTime) &&
        Objects.equals(this.description, organizationCreateEvent.description) &&
        Objects.equals(this.timeOcurred, organizationCreateEvent.timeOcurred) &&
        Objects.equals(this.title, organizationCreateEvent.title) &&
        Objects.equals(this.eventType, organizationCreateEvent.eventType) &&
        Objects.equals(this.domain, organizationCreateEvent.domain) &&
        Objects.equals(this.priority, organizationCreateEvent.priority) &&
        Objects.equals(this.href, organizationCreateEvent.href) &&
        Objects.equals(this.id, organizationCreateEvent.id) &&
        Objects.equals(this.correlationId, organizationCreateEvent.correlationId) &&
        Objects.equals(this.event, organizationCreateEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventId, eventTime, description, timeOcurred, title, eventType, domain, priority, href, id, correlationId, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationCreateEvent {\n");
    
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
