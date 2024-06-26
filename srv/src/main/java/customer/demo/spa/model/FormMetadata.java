

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
import customer.demo.spa.model.FormMetadataWorkflowDefinitionsInner;
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
 * FormMetadata
 */

// CHECKSTYLE:OFF
public class FormMetadata 
// CHECKSTYLE:ON
{
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("revision")
  private String revision;

  /**
   * The type of the form definition version.
   */
  public enum TypeEnum {
    /**
    * The START option of this FormMetadata
    */
    START("start"),
    
    /**
    * The TASK option of this FormMetadata
    */
    TASK("task");

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
    * @return The enum value of type FormMetadata
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

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("workflowDefinitions")
  private List<FormMetadataWorkflowDefinitionsInner> workflowDefinitions = new ArrayList<>();

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the id of this {@link FormMetadata} instance and return the same instance.
   *
   * @param id  The definition ID of the form definition. The ID is at most 255 characters long. 
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The definition ID of the form definition. The ID is at most 255 characters long. 
   * @return id  The id of this {@link FormMetadata} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link FormMetadata} instance.
  *
  * @param id  The definition ID of the form definition. The ID is at most 255 characters long. 
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the name of this {@link FormMetadata} instance and return the same instance.
   *
   * @param name  The name of the form definition, in the original language.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata name(@Nonnull final String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form definition, in the original language.
   * @return name  The name of this {@link FormMetadata} instance.
  **/
  @Nonnull public String getName() {
    return name;
  }

  /**
  * Set the name of this {@link FormMetadata} instance.
  *
  * @param name  The name of the form definition, in the original language.
  */
  public void setName( @Nonnull final String name) {
    this.name = name;
  }

   /**
   * Set the version of this {@link FormMetadata} instance and return the same instance.
   *
   * @param version  The technical version of the form definition version.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata version(@Nonnull final Integer version) {
    this.version = version;
    return this;
  }

   /**
   * The technical version of the form definition version.
   * @return version  The version of this {@link FormMetadata} instance.
  **/
  @Nonnull public Integer getVersion() {
    return version;
  }

  /**
  * Set the version of this {@link FormMetadata} instance.
  *
  * @param version  The technical version of the form definition version.
  */
  public void setVersion( @Nonnull final Integer version) {
    this.version = version;
  }

   /**
   * Set the revision of this {@link FormMetadata} instance and return the same instance.
   *
   * @param revision  The revision of the form definition version.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata revision(@Nonnull final String revision) {
    this.revision = revision;
    return this;
  }

   /**
   * The revision of the form definition version.
   * @return revision  The revision of this {@link FormMetadata} instance.
  **/
  @Nonnull public String getRevision() {
    return revision;
  }

  /**
  * Set the revision of this {@link FormMetadata} instance.
  *
  * @param revision  The revision of the form definition version.
  */
  public void setRevision( @Nonnull final String revision) {
    this.revision = revision;
  }

   /**
   * Set the type of this {@link FormMetadata} instance and return the same instance.
   *
   * @param type  The type of the form definition version.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata type(@Nonnull final TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the form definition version.
   * @return type  The type of this {@link FormMetadata} instance.
  **/
  @Nonnull public TypeEnum getType() {
    return type;
  }

  /**
  * Set the type of this {@link FormMetadata} instance.
  *
  * @param type  The type of the form definition version.
  */
  public void setType( @Nonnull final TypeEnum type) {
    this.type = type;
  }

   /**
   * Set the createdAt of this {@link FormMetadata} instance and return the same instance.
   *
   * @param createdAt  The time when the form definition version was deployed.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the form definition version was deployed.
   * @return createdAt  The createdAt of this {@link FormMetadata} instance.
  **/
  @Nonnull public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
  * Set the createdAt of this {@link FormMetadata} instance.
  *
  * @param createdAt  The time when the form definition version was deployed.
  */
  public void setCreatedAt( @Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

   /**
   * Set the createdBy of this {@link FormMetadata} instance and return the same instance.
   *
   * @param createdBy  The ID of the user who deployed the form definition version.
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata createdBy(@Nonnull final String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The ID of the user who deployed the form definition version.
   * @return createdBy  The createdBy of this {@link FormMetadata} instance.
  **/
  @Nonnull public String getCreatedBy() {
    return createdBy;
  }

  /**
  * Set the createdBy of this {@link FormMetadata} instance.
  *
  * @param createdBy  The ID of the user who deployed the form definition version.
  */
  public void setCreatedBy( @Nonnull final String createdBy) {
    this.createdBy = createdBy;
  }

   /**
   * Set the workflowDefinitions of this {@link FormMetadata} instance and return the same instance.
   *
   * @param workflowDefinitions  A list of workflow definitions in case the form definition version is of type &#39;start&#39;
   * @return The same instance of this {@link FormMetadata} class
   */
   @Nonnull public FormMetadata workflowDefinitions(@Nonnull final List<FormMetadataWorkflowDefinitionsInner> workflowDefinitions) {
    this.workflowDefinitions = workflowDefinitions;
    return this;
  }
  /**
  * Add one workflowDefinitions instance to this {@link FormMetadata}.
  * @param workflowDefinitionsItem The workflowDefinitions that should be added
  * @return The same instance of type {@link FormMetadata}
  */
  @Nonnull public FormMetadata addworkflowDefinitionsItem( @Nonnull final FormMetadataWorkflowDefinitionsInner workflowDefinitionsItem) {
    if (this.workflowDefinitions == null) {
      this.workflowDefinitions = new ArrayList<>();
    }
    this.workflowDefinitions.add(workflowDefinitionsItem);
    return this;
  }

   /**
   * A list of workflow definitions in case the form definition version is of type &#39;start&#39;
   * @return workflowDefinitions  The workflowDefinitions of this {@link FormMetadata} instance.
  **/
  @Nonnull public List<FormMetadataWorkflowDefinitionsInner> getWorkflowDefinitions() {
    return workflowDefinitions;
  }

  /**
  * Set the workflowDefinitions of this {@link FormMetadata} instance.
  *
  * @param workflowDefinitions  A list of workflow definitions in case the form definition version is of type &#39;start&#39;
  */
  public void setWorkflowDefinitions( @Nonnull final List<FormMetadataWorkflowDefinitionsInner> workflowDefinitions) {
    this.workflowDefinitions = workflowDefinitions;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link FormMetadata}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link FormMetadata} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("FormMetadata has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link FormMetadata} instance. If the map previously contained a mapping
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
    final FormMetadata formMetadata = (FormMetadata) o;
    return Objects.equals(this.cloudSdkCustomFields, formMetadata.cloudSdkCustomFields) &&
        Objects.equals(this.id, formMetadata.id) &&
        Objects.equals(this.name, formMetadata.name) &&
        Objects.equals(this.version, formMetadata.version) &&
        Objects.equals(this.revision, formMetadata.revision) &&
        Objects.equals(this.type, formMetadata.type) &&
        Objects.equals(this.createdAt, formMetadata.createdAt) &&
        Objects.equals(this.createdBy, formMetadata.createdBy) &&
        Objects.equals(this.workflowDefinitions, formMetadata.workflowDefinitions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, revision, type, createdAt, createdBy, workflowDefinitions, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class FormMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    workflowDefinitions: ").append(toIndentedString(workflowDefinitions)).append("\n");
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
