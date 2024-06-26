

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
import customer.demo.spa.model.TaskDefinitionAttributeListInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * TaskDefinitionListInner
 */

// CHECKSTYLE:OFF
public class TaskDefinitionListInner 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("attributeDefinitions")
  private List<TaskDefinitionAttributeListInner> attributeDefinitions = new ArrayList<>();

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link TaskDefinitionListInner} instance and return the same instance.
   *
   * @param id  The definition ID of the task definition. The ID is at most 511 characters long. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
   * @return The same instance of this {@link TaskDefinitionListInner} class
   */
   @Nonnull public TaskDefinitionListInner id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The definition ID of the task definition. The ID is at most 511 characters long. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
   * @return id  The id of this {@link TaskDefinitionListInner} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link TaskDefinitionListInner} instance.
  *
  * @param id  The definition ID of the task definition. The ID is at most 511 characters long. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the name of this {@link TaskDefinitionListInner} instance and return the same instance.
   *
   * @param name  The name of the corresponding task in the workflow definition, in the original language. The value is taken from the latest workflow definition where the task definition exists.
   * @return The same instance of this {@link TaskDefinitionListInner} class
   */
   @Nonnull public TaskDefinitionListInner name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the corresponding task in the workflow definition, in the original language. The value is taken from the latest workflow definition where the task definition exists.
   * @return name  The name of this {@link TaskDefinitionListInner} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link TaskDefinitionListInner} instance.
  *
  * @param name  The name of the corresponding task in the workflow definition, in the original language. The value is taken from the latest workflow definition where the task definition exists.
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
   * Set the createdAt of this {@link TaskDefinitionListInner} instance and return the same instance.
   *
   * @param createdAt  The time when the task definition was created.
   * @return The same instance of this {@link TaskDefinitionListInner} class
   */
   @Nonnull public TaskDefinitionListInner createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the task definition was created.
   * @return createdAt  The createdAt of this {@link TaskDefinitionListInner} instance.
  **/
  @Nonnull public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
  * Set the createdAt of this {@link TaskDefinitionListInner} instance.
  *
  * @param createdAt  The time when the task definition was created.
  */
  public void setCreatedAt( @Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

   /**
   * Set the attributeDefinitions of this {@link TaskDefinitionListInner} instance and return the same instance.
   *
   * @param attributeDefinitions  The attributeDefinitions of this {@link TaskDefinitionListInner}
   * @return The same instance of this {@link TaskDefinitionListInner} class
   */
   @Nonnull public TaskDefinitionListInner attributeDefinitions(@Nonnull final List<TaskDefinitionAttributeListInner> attributeDefinitions) {
    this.attributeDefinitions = attributeDefinitions;
    return this;
  }
  /**
  * Add one attributeDefinitions instance to this {@link TaskDefinitionListInner}.
  * @param attributeDefinitionsItem The attributeDefinitions that should be added
  * @return The same instance of type {@link TaskDefinitionListInner}
  */
  @Nonnull public TaskDefinitionListInner addattributeDefinitionsItem( @Nonnull final TaskDefinitionAttributeListInner attributeDefinitionsItem) {
    if (this.attributeDefinitions == null) {
      this.attributeDefinitions = new ArrayList<>();
    }
    this.attributeDefinitions.add(attributeDefinitionsItem);
    return this;
  }

   /**
   * Get attributeDefinitions
   * @return attributeDefinitions  The attributeDefinitions of this {@link TaskDefinitionListInner} instance.
  **/
  @Nonnull public List<TaskDefinitionAttributeListInner> getAttributeDefinitions() {
    return attributeDefinitions;
  }

  /**
  * Set the attributeDefinitions of this {@link TaskDefinitionListInner} instance.
  *
  * @param attributeDefinitions  The attributeDefinitions of this {@link TaskDefinitionListInner}
  */
  public void setAttributeDefinitions( @Nonnull final List<TaskDefinitionAttributeListInner> attributeDefinitions) {
    this.attributeDefinitions = attributeDefinitions;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TaskDefinitionListInner}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TaskDefinitionListInner} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TaskDefinitionListInner has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TaskDefinitionListInner} instance. If the map previously contained a mapping
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
    final TaskDefinitionListInner taskDefinitionListInner = (TaskDefinitionListInner) o;
    return Objects.equals(this.cloudSdkCustomFields, taskDefinitionListInner.cloudSdkCustomFields) &&
        Objects.equals(this.id, taskDefinitionListInner.id) &&
        Objects.equals(this.name, taskDefinitionListInner.name) &&
        Objects.equals(this.createdAt, taskDefinitionListInner.createdAt) &&
        Objects.equals(this.attributeDefinitions, taskDefinitionListInner.attributeDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdAt, attributeDefinitions, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TaskDefinitionListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    attributeDefinitions: ").append(toIndentedString(attributeDefinitions)).append("\n");
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

