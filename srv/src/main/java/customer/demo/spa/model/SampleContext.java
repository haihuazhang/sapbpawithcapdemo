

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
 * SampleContext
 */

// CHECKSTYLE:OFF
public class SampleContext 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("content")
  private Object content;

  @JsonProperty("modelElementId")
  private String modelElementId;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link SampleContext} instance and return the same instance.
   *
   * @param id  The ID of the default start context. The ID is at most 255 characters long.
   * @return The same instance of this {@link SampleContext} class
   */
   @Nonnull public SampleContext id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the default start context. The ID is at most 255 characters long.
   * @return id  The id of this {@link SampleContext} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link SampleContext} instance.
  *
  * @param id  The ID of the default start context. The ID is at most 255 characters long.
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the content of this {@link SampleContext} instance and return the same instance.
   *
   * @param content  The default start context configured in the start event.
   * @return The same instance of this {@link SampleContext} class
   */
   @Nonnull public SampleContext content(@Nonnull final Object content) {
    this.content = content;
    return this;
  }

   /**
   * The default start context configured in the start event.
   * @return content  The content of this {@link SampleContext} instance.
  **/
  @Nonnull public Object getContent() {
    return content;
  }

  /**
  * Set the content of this {@link SampleContext} instance.
  *
  * @param content  The default start context configured in the start event.
  */
  public void setContent( @Nonnull final Object content) {
    this.content = content;
  }

   /**
   * Set the modelElementId of this {@link SampleContext} instance and return the same instance.
   *
   * @param modelElementId  The ID of the start event for which the default start context is configured. The ID is at most 255 characters long.
   * @return The same instance of this {@link SampleContext} class
   */
   @Nonnull public SampleContext modelElementId(@Nonnull final String modelElementId) {
    this.modelElementId = modelElementId;
    return this;
  }

   /**
   * The ID of the start event for which the default start context is configured. The ID is at most 255 characters long.
   * @return modelElementId  The modelElementId of this {@link SampleContext} instance.
  **/
  @Nonnull public String getModelElementId() {
    return modelElementId;
  }

  /**
  * Set the modelElementId of this {@link SampleContext} instance.
  *
  * @param modelElementId  The ID of the start event for which the default start context is configured. The ID is at most 255 characters long.
  */
  public void setModelElementId( @Nonnull final String modelElementId) {
    this.modelElementId = modelElementId;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link SampleContext}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link SampleContext} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("SampleContext has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link SampleContext} instance. If the map previously contained a mapping
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
    final SampleContext sampleContext = (SampleContext) o;
    return Objects.equals(this.cloudSdkCustomFields, sampleContext.cloudSdkCustomFields) &&
        Objects.equals(this.id, sampleContext.id) &&
        Objects.equals(this.content, sampleContext.content) &&
        Objects.equals(this.modelElementId, sampleContext.modelElementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, content, modelElementId, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class SampleContext {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    modelElementId: ").append(toIndentedString(modelElementId)).append("\n");
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

