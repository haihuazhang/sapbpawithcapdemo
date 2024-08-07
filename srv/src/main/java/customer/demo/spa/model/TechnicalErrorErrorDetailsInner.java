

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * TechnicalErrorErrorDetailsInner
 */

// CHECKSTYLE:OFF
public class TechnicalErrorErrorDetailsInner 
// CHECKSTYLE:ON
{
  @JsonProperty("severity")
  private String severity;

  @JsonProperty("message")
  private String message;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the severity of this {@link TechnicalErrorErrorDetailsInner} instance and return the same instance.
   *
   * @param severity  The severity of the error.
   * @return The same instance of this {@link TechnicalErrorErrorDetailsInner} class
   */
   @Nonnull public TechnicalErrorErrorDetailsInner severity(@Nonnull final String severity) {
    this.severity = severity;
    return this;
  }

   /**
   * The severity of the error.
   * @return severity  The severity of this {@link TechnicalErrorErrorDetailsInner} instance.
  **/
  @Nonnull public String getSeverity() {
    return severity;
  }

  /**
  * Set the severity of this {@link TechnicalErrorErrorDetailsInner} instance.
  *
  * @param severity  The severity of the error.
  */
  public void setSeverity( @Nonnull final String severity) {
    this.severity = severity;
  }

   /**
   * Set the message of this {@link TechnicalErrorErrorDetailsInner} instance and return the same instance.
   *
   * @param message  The detailed error message.
   * @return The same instance of this {@link TechnicalErrorErrorDetailsInner} class
   */
   @Nonnull public TechnicalErrorErrorDetailsInner message(@Nonnull final String message) {
    this.message = message;
    return this;
  }

   /**
   * The detailed error message.
   * @return message  The message of this {@link TechnicalErrorErrorDetailsInner} instance.
  **/
  @Nonnull public String getMessage() {
    return message;
  }

  /**
  * Set the message of this {@link TechnicalErrorErrorDetailsInner} instance.
  *
  * @param message  The detailed error message.
  */
  public void setMessage( @Nonnull final String message) {
    this.message = message;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TechnicalErrorErrorDetailsInner}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TechnicalErrorErrorDetailsInner} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TechnicalErrorErrorDetailsInner has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TechnicalErrorErrorDetailsInner} instance. If the map previously contained a mapping
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
    final TechnicalErrorErrorDetailsInner technicalErrorErrorDetailsInner = (TechnicalErrorErrorDetailsInner) o;
    return Objects.equals(this.cloudSdkCustomFields, technicalErrorErrorDetailsInner.cloudSdkCustomFields) &&
        Objects.equals(this.severity, technicalErrorErrorDetailsInner.severity) &&
        Objects.equals(this.message, technicalErrorErrorDetailsInner.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(severity, message, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TechnicalErrorErrorDetailsInner {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

