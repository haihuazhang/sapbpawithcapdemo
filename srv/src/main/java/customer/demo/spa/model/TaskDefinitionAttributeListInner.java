

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
 * TaskDefinitionAttributeListInner
 */

// CHECKSTYLE:OFF
public class TaskDefinitionAttributeListInner 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("label")
  private String label;

  /**
   * The type of the attribute.
   */
  public enum TypeEnum {
    /**
    * The STRING option of this TaskDefinitionAttributeListInner
    */
    STRING("string");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    /**
    * Get the value of the enum
    * @return The enum value
    */
    @JsonValue
    @Nonnull public String getValue() {
      return value;
    }

    /**
    * Get the String value of the enum value.
    * @return The enum value as String
    */
    @Override
    @Nonnull public String toString() {
      return String.valueOf(value);
    }

    /**
    * Get the enum value from a String value
    * @param value The String value
    * @return The enum value of type TaskDefinitionAttributeListInner
    */
    @JsonCreator
    @Nonnull public static TypeEnum fromValue(@Nonnull final String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link TaskDefinitionAttributeListInner} instance and return the same instance.
   *
   * @param id  The ID of the attribute.
   * @return The same instance of this {@link TaskDefinitionAttributeListInner} class
   */
   @Nonnull public TaskDefinitionAttributeListInner id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the attribute.
   * @return id  The id of this {@link TaskDefinitionAttributeListInner} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link TaskDefinitionAttributeListInner} instance.
  *
  * @param id  The ID of the attribute.
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the label of this {@link TaskDefinitionAttributeListInner} instance and return the same instance.
   *
   * @param label  The label, which represents how the attribute is presented to end users.
   * @return The same instance of this {@link TaskDefinitionAttributeListInner} class
   */
   @Nonnull public TaskDefinitionAttributeListInner label(@Nonnull final String label) {
    this.label = label;
    return this;
  }

   /**
   * The label, which represents how the attribute is presented to end users.
   * @return label  The label of this {@link TaskDefinitionAttributeListInner} instance.
  **/
  @Nonnull public String getLabel() {
    return label;
  }

  /**
  * Set the label of this {@link TaskDefinitionAttributeListInner} instance.
  *
  * @param label  The label, which represents how the attribute is presented to end users.
  */
  public void setLabel( @Nonnull final String label) {
    this.label = label;
  }

   /**
   * Set the type of this {@link TaskDefinitionAttributeListInner} instance and return the same instance.
   *
   * @param type  The type of the attribute.
   * @return The same instance of this {@link TaskDefinitionAttributeListInner} class
   */
   @Nonnull public TaskDefinitionAttributeListInner type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the attribute.
   * @return type  The type of this {@link TaskDefinitionAttributeListInner} instance.
  **/
  @Nonnull public TypeEnum getType() {
    return type;
  }

  /**
  * Set the type of this {@link TaskDefinitionAttributeListInner} instance.
  *
  * @param type  The type of the attribute.
  */
  public void setType( @Nonnull final TypeEnum type) {
    this.type = type;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TaskDefinitionAttributeListInner}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TaskDefinitionAttributeListInner} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TaskDefinitionAttributeListInner has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TaskDefinitionAttributeListInner} instance. If the map previously contained a mapping
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
    final TaskDefinitionAttributeListInner taskDefinitionAttributeListInner = (TaskDefinitionAttributeListInner) o;
    return Objects.equals(this.cloudSdkCustomFields, taskDefinitionAttributeListInner.cloudSdkCustomFields) &&
        Objects.equals(this.id, taskDefinitionAttributeListInner.id) &&
        Objects.equals(this.label, taskDefinitionAttributeListInner.label) &&
        Objects.equals(this.type, taskDefinitionAttributeListInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, label, type, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TaskDefinitionAttributeListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

