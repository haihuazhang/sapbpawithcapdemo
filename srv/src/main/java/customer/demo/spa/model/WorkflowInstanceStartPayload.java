

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
 * WorkflowInstanceStartPayload
 */

// CHECKSTYLE:OFF
public class WorkflowInstanceStartPayload 
// CHECKSTYLE:ON
{
  @JsonProperty("definitionId")
  private String definitionId;

  @JsonProperty("context")
  private Object context;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the definitionId of this {@link WorkflowInstanceStartPayload} instance and return the same instance.
   *
   * @param definitionId  Specify the ID of the workflow definition for which an instance should be started. The ID is at most 64 characters long.
   * @return The same instance of this {@link WorkflowInstanceStartPayload} class
   */
   @Nonnull public WorkflowInstanceStartPayload definitionId(@Nonnull final String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

   /**
   * Specify the ID of the workflow definition for which an instance should be started. The ID is at most 64 characters long.
   * @return definitionId  The definitionId of this {@link WorkflowInstanceStartPayload} instance.
  **/
  @Nonnull public String getDefinitionId() {
    return definitionId;
  }

  /**
  * Set the definitionId of this {@link WorkflowInstanceStartPayload} instance.
  *
  * @param definitionId  Specify the ID of the workflow definition for which an instance should be started. The ID is at most 64 characters long.
  */
  public void setDefinitionId( @Nonnull final String definitionId) {
    this.definitionId = definitionId;
  }

   /**
   * Set the context of this {@link WorkflowInstanceStartPayload} instance and return the same instance.
   *
   * @param context  Specify the initial context of the workflow instance.
   * @return The same instance of this {@link WorkflowInstanceStartPayload} class
   */
   @Nonnull public WorkflowInstanceStartPayload context(@Nonnull final Object context) {
    this.context = context;
    return this;
  }

   /**
   * Specify the initial context of the workflow instance.
   * @return context  The context of this {@link WorkflowInstanceStartPayload} instance.
  **/
  @Nonnull public Object getContext() {
    return context;
  }

  /**
  * Set the context of this {@link WorkflowInstanceStartPayload} instance.
  *
  * @param context  Specify the initial context of the workflow instance.
  */
  public void setContext( @Nonnull final Object context) {
    this.context = context;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link WorkflowInstanceStartPayload}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link WorkflowInstanceStartPayload} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("WorkflowInstanceStartPayload has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link WorkflowInstanceStartPayload} instance. If the map previously contained a mapping
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
    final WorkflowInstanceStartPayload workflowInstanceStartPayload = (WorkflowInstanceStartPayload) o;
    return Objects.equals(this.cloudSdkCustomFields, workflowInstanceStartPayload.cloudSdkCustomFields) &&
        Objects.equals(this.definitionId, workflowInstanceStartPayload.definitionId) &&
        Objects.equals(this.context, workflowInstanceStartPayload.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(definitionId, context, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstanceStartPayload {\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

