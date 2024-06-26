

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
 * A reference to a file in the remote repository
 */

// CHECKSTYLE:OFF
public class AttachmentsContextGroupsValueRefsInner 
// CHECKSTYLE:ON
{
  @JsonProperty("objectId")
  private String objectId;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the objectId of this {@link AttachmentsContextGroupsValueRefsInner} instance and return the same instance.
   *
   * @param objectId  ID of the file in the remote repository
   * @return The same instance of this {@link AttachmentsContextGroupsValueRefsInner} class
   */
   @Nonnull public AttachmentsContextGroupsValueRefsInner objectId(@Nonnull final String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * ID of the file in the remote repository
   * @return objectId  The objectId of this {@link AttachmentsContextGroupsValueRefsInner} instance.
  **/
  @Nonnull public String getObjectId() {
    return objectId;
  }

  /**
  * Set the objectId of this {@link AttachmentsContextGroupsValueRefsInner} instance.
  *
  * @param objectId  ID of the file in the remote repository
  */
  public void setObjectId( @Nonnull final String objectId) {
    this.objectId = objectId;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link AttachmentsContextGroupsValueRefsInner}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link AttachmentsContextGroupsValueRefsInner} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("AttachmentsContextGroupsValueRefsInner has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link AttachmentsContextGroupsValueRefsInner} instance. If the map previously contained a mapping
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
    final AttachmentsContextGroupsValueRefsInner attachmentsContextGroupsValueRefsInner = (AttachmentsContextGroupsValueRefsInner) o;
    return Objects.equals(this.cloudSdkCustomFields, attachmentsContextGroupsValueRefsInner.cloudSdkCustomFields) &&
        Objects.equals(this.objectId, attachmentsContextGroupsValueRefsInner.objectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentsContextGroupsValueRefsInner {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
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

