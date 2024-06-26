

/*
 * Workflow
 * This API uses the workflow capability of SAP Build Process Automation. With the API, you can, for example, start new workflow instances and work with tasks.  Note: These APIs are designed for loosely coupled clients. This means:  - If SAP Build Process Automation adds fields to responses, the API version number does not increase. Your client must ignore new fields. - The order of fields in responses and of entries in arrays may change. This applies unless the API provides an explicit means to specify the desired order. 
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package customer.demo.spa.model;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * WorkflowInstanceErrorMessageListInner
 */

// CHECKSTYLE:OFF
public class WorkflowInstanceErrorMessageListInner 
// CHECKSTYLE:ON
{
  @JsonProperty("activityId")
  private String activityId;

  @JsonProperty("activityName")
  private String activityName;

  @JsonProperty("errorCode")
  private String errorCode;

  @JsonProperty("logId")
  private String logId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the activityId of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param activityId  The ID of the model element where the error occurred. The ID is at most 255 characters long.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner activityId(@Nonnull final String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The ID of the model element where the error occurred. The ID is at most 255 characters long.
   * @return activityId  The activityId of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public String getActivityId() {
    return activityId;
  }

  /**
  * Set the activityId of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param activityId  The ID of the model element where the error occurred. The ID is at most 255 characters long.
  */
  public void setActivityId( @Nonnull final String activityId) {
    this.activityId = activityId;
  }

   /**
   * Set the activityName of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param activityName  The name of the model element where the error occurred. The name is at most 255 characters long.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner activityName(@Nonnull final String activityName) {
    this.activityName = activityName;
    return this;
  }

   /**
   * The name of the model element where the error occurred. The name is at most 255 characters long.
   * @return activityName  The activityName of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public String getActivityName() {
    return activityName;
  }

  /**
  * Set the activityName of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param activityName  The name of the model element where the error occurred. The name is at most 255 characters long.
  */
  public void setActivityName( @Nonnull final String activityName) {
    this.activityName = activityName;
  }

   /**
   * Set the errorCode of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param errorCode  The error category.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner errorCode(@Nonnull final String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * The error category.
   * @return errorCode  The errorCode of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public String getErrorCode() {
    return errorCode;
  }

  /**
  * Set the errorCode of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param errorCode  The error category.
  */
  public void setErrorCode( @Nonnull final String errorCode) {
    this.errorCode = errorCode;
  }

   /**
   * Set the logId of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param logId  The log ID referring to the error.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner logId(@Nonnull final String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * The log ID referring to the error.
   * @return logId  The logId of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public String getLogId() {
    return logId;
  }

  /**
  * Set the logId of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param logId  The log ID referring to the error.
  */
  public void setLogId( @Nonnull final String logId) {
    this.logId = logId;
  }

   /**
   * Set the message of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param message  The error message.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

   /**
   * The error message.
   * @return message  The message of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public String getMessage() {
    return message;
  }

  /**
  * Set the message of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param message  The error message.
  */
  public void setMessage( @Nonnull final String message) {
    this.message = message;
  }

   /**
   * Set the timestamp of this {@link WorkflowInstanceErrorMessageListInner} instance and return the same instance.
   *
   * @param timestamp  The time when the error occurred.
   * @return The same instance of this {@link WorkflowInstanceErrorMessageListInner} class
   */
   @Nonnull public WorkflowInstanceErrorMessageListInner timestamp(@Nonnull final OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The time when the error occurred.
   * @return timestamp  The timestamp of this {@link WorkflowInstanceErrorMessageListInner} instance.
  **/
  @Nonnull public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  /**
  * Set the timestamp of this {@link WorkflowInstanceErrorMessageListInner} instance.
  *
  * @param timestamp  The time when the error occurred.
  */
  public void setTimestamp( @Nonnull final OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link WorkflowInstanceErrorMessageListInner}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link WorkflowInstanceErrorMessageListInner} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("WorkflowInstanceErrorMessageListInner has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link WorkflowInstanceErrorMessageListInner} instance. If the map previously contained a mapping
   * for the key, the old value is replaced by the specified value.
   * @param customFieldName The name of the property
   * @param customFieldValue The value of the property
   */
  @JsonIgnore
  public void setCustomField( @Nonnull String customFieldName, @Nullable Object customFieldValue )
  {
      cloudSdkCustomFields.put(customFieldName, customFieldValue);
  }


  @Override
  public boolean equals(@Nullable final java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final WorkflowInstanceErrorMessageListInner workflowInstanceErrorMessageListInner = (WorkflowInstanceErrorMessageListInner) o;
    return Objects.equals(this.cloudSdkCustomFields, workflowInstanceErrorMessageListInner.cloudSdkCustomFields) &&
        Objects.equals(this.activityId, workflowInstanceErrorMessageListInner.activityId) &&
        Objects.equals(this.activityName, workflowInstanceErrorMessageListInner.activityName) &&
        Objects.equals(this.errorCode, workflowInstanceErrorMessageListInner.errorCode) &&
        Objects.equals(this.logId, workflowInstanceErrorMessageListInner.logId) &&
        Objects.equals(this.message, workflowInstanceErrorMessageListInner.message) &&
        Objects.equals(this.timestamp, workflowInstanceErrorMessageListInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityName, errorCode, logId, message, timestamp, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstanceErrorMessageListInner {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    cloudSdkCustomFields.forEach((k,v) -> sb.append("    ").append(k).append(": ").append(toIndentedString(v)).append("\n"));
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(final java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

