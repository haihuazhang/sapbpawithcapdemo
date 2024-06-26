

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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import customer.demo.spa.model.CustomAttribute;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * TaskInstance
 */

// CHECKSTYLE:OFF
public class TaskInstance 
// CHECKSTYLE:ON
{
  @JsonProperty("activityId")
  private String activityId;

  @JsonProperty("claimedAt")
  private OffsetDateTime claimedAt;

  @JsonProperty("completedAt")
  private OffsetDateTime completedAt;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("lastChangedAt")
  private OffsetDateTime lastChangedAt;

  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  /**
   * The priority of the user task instance.
   */
  public enum PriorityEnum {
    /**
    * The VERY_HIGH option of this TaskInstance
    */
    VERY_HIGH("VERY_HIGH"),
    
    /**
    * The HIGH option of this TaskInstance
    */
    HIGH("HIGH"),
    
    /**
    * The MEDIUM option of this TaskInstance
    */
    MEDIUM("MEDIUM"),
    
    /**
    * The LOW option of this TaskInstance
    */
    LOW("LOW");

    private String value;

    PriorityEnum(String value) {
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
    * @return The enum value of type TaskInstance
    */
    @JsonCreator
    @Nonnull public static PriorityEnum fromValue(@Nonnull final String value) {
      for (PriorityEnum b : PriorityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("priority")
  private PriorityEnum priority;

  @JsonProperty("dueDate")
  private OffsetDateTime dueDate;

  @JsonProperty("processor")
  private String processor;

  @JsonProperty("recipientUsers")
  private Set<String> recipientUsers = new LinkedHashSet<>();

  @JsonProperty("recipientGroups")
  private Set<String> recipientGroups = new LinkedHashSet<>();

  /**
   * The status of the user task instance.
   */
  public enum StatusEnum {
    /**
    * The READY option of this TaskInstance
    */
    READY("READY"),
    
    /**
    * The RESERVED option of this TaskInstance
    */
    RESERVED("RESERVED"),
    
    /**
    * The CANCELED option of this TaskInstance
    */
    CANCELED("CANCELED"),
    
    /**
    * The COMPLETED option of this TaskInstance
    */
    COMPLETED("COMPLETED");

    private String value;

    StatusEnum(String value) {
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
    * @return The enum value of type TaskInstance
    */
    @JsonCreator
    @Nonnull public static StatusEnum fromValue(@Nonnull final String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("status")
  private StatusEnum status;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("workflowDefinitionId")
  private String workflowDefinitionId;

  @JsonProperty("workflowInstanceId")
  private String workflowInstanceId;

  @JsonProperty("attributes")
  private List<CustomAttribute> attributes = new ArrayList<>();

  @JsonProperty("definitionId")
  private String definitionId;

  @JsonProperty("applicationScope")
  private String applicationScope;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the activityId of this {@link TaskInstance} instance and return the same instance.
   *
   * @param activityId  The definition ID of the user task instance. The ID is at most 255 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance activityId(@Nonnull final String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The definition ID of the user task instance. The ID is at most 255 characters long.
   * @return activityId  The activityId of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getActivityId() {
    return activityId;
  }

  /**
  * Set the activityId of this {@link TaskInstance} instance.
  *
  * @param activityId  The definition ID of the user task instance. The ID is at most 255 characters long.
  */
  public void setActivityId( @Nonnull final String activityId) {
    this.activityId = activityId;
  }

   /**
   * Set the claimedAt of this {@link TaskInstance} instance and return the same instance.
   *
   * @param claimedAt  The time when the user task instance was claimed and its status changed to RESERVED.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance claimedAt(@Nonnull final OffsetDateTime claimedAt) {
    this.claimedAt = claimedAt;
    return this;
  }

   /**
   * The time when the user task instance was claimed and its status changed to RESERVED.
   * @return claimedAt  The claimedAt of this {@link TaskInstance} instance.
  **/
  @Nonnull public OffsetDateTime getClaimedAt() {
    return claimedAt;
  }

  /**
  * Set the claimedAt of this {@link TaskInstance} instance.
  *
  * @param claimedAt  The time when the user task instance was claimed and its status changed to RESERVED.
  */
  public void setClaimedAt( @Nonnull final OffsetDateTime claimedAt) {
    this.claimedAt = claimedAt;
  }

   /**
   * Set the completedAt of this {@link TaskInstance} instance and return the same instance.
   *
   * @param completedAt  The time when the user task instance status changed to COMPLETED.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance completedAt(@Nonnull final OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The time when the user task instance status changed to COMPLETED.
   * @return completedAt  The completedAt of this {@link TaskInstance} instance.
  **/
  @Nonnull public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  /**
  * Set the completedAt of this {@link TaskInstance} instance.
  *
  * @param completedAt  The time when the user task instance status changed to COMPLETED.
  */
  public void setCompletedAt( @Nonnull final OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

   /**
   * Set the createdAt of this {@link TaskInstance} instance and return the same instance.
   *
   * @param createdAt  The time when the user task instance was created.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance createdAt(@Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time when the user task instance was created.
   * @return createdAt  The createdAt of this {@link TaskInstance} instance.
  **/
  @Nonnull public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  /**
  * Set the createdAt of this {@link TaskInstance} instance.
  *
  * @param createdAt  The time when the user task instance was created.
  */
  public void setCreatedAt( @Nonnull final OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

   /**
   * Set the createdBy of this {@link TaskInstance} instance and return the same instance.
   *
   * @param createdBy  The user who created the user task instance. The user ID is at most 255 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance createdBy(@Nonnull final String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The user who created the user task instance. The user ID is at most 255 characters long.
   * @return createdBy  The createdBy of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getCreatedBy() {
    return createdBy;
  }

  /**
  * Set the createdBy of this {@link TaskInstance} instance.
  *
  * @param createdBy  The user who created the user task instance. The user ID is at most 255 characters long.
  */
  public void setCreatedBy( @Nonnull final String createdBy) {
    this.createdBy = createdBy;
  }

   /**
   * Set the lastChangedAt of this {@link TaskInstance} instance and return the same instance.
   *
   * @param lastChangedAt  The last time the user task instance was changed.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance lastChangedAt(@Nonnull final OffsetDateTime lastChangedAt) {
    this.lastChangedAt = lastChangedAt;
    return this;
  }

   /**
   * The last time the user task instance was changed.
   * @return lastChangedAt  The lastChangedAt of this {@link TaskInstance} instance.
  **/
  @Nonnull public OffsetDateTime getLastChangedAt() {
    return lastChangedAt;
  }

  /**
  * Set the lastChangedAt of this {@link TaskInstance} instance.
  *
  * @param lastChangedAt  The last time the user task instance was changed.
  */
  public void setLastChangedAt( @Nonnull final OffsetDateTime lastChangedAt) {
    this.lastChangedAt = lastChangedAt;
  }

   /**
   * Set the description of this {@link TaskInstance} instance and return the same instance.
   *
   * @param description  The description of the user task instance.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance description(@Nonnull final String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the user task instance.
   * @return description  The description of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getDescription() {
    return description;
  }

  /**
  * Set the description of this {@link TaskInstance} instance.
  *
  * @param description  The description of the user task instance.
  */
  public void setDescription( @Nonnull final String description) {
    this.description = description;
  }

   /**
   * Set the id of this {@link TaskInstance} instance and return the same instance.
   *
   * @param id  The ID of the user task instance. The ID is at least 36 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance id(@Nonnull final String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the user task instance. The ID is at least 36 characters long.
   * @return id  The id of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getId() {
    return id;
  }

  /**
  * Set the id of this {@link TaskInstance} instance.
  *
  * @param id  The ID of the user task instance. The ID is at least 36 characters long.
  */
  public void setId( @Nonnull final String id) {
    this.id = id;
  }

   /**
   * Set the priority of this {@link TaskInstance} instance and return the same instance.
   *
   * @param priority  The priority of the user task instance.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance priority(@Nonnull final PriorityEnum priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of the user task instance.
   * @return priority  The priority of this {@link TaskInstance} instance.
  **/
  @Nonnull public PriorityEnum getPriority() {
    return priority;
  }

  /**
  * Set the priority of this {@link TaskInstance} instance.
  *
  * @param priority  The priority of the user task instance.
  */
  public void setPriority( @Nonnull final PriorityEnum priority) {
    this.priority = priority;
  }

   /**
   * Set the dueDate of this {@link TaskInstance} instance and return the same instance.
   *
   * @param dueDate  The time when the user task instance is or was due to be COMPLETED.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance dueDate(@Nonnull final OffsetDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * The time when the user task instance is or was due to be COMPLETED.
   * @return dueDate  The dueDate of this {@link TaskInstance} instance.
  **/
  @Nonnull public OffsetDateTime getDueDate() {
    return dueDate;
  }

  /**
  * Set the dueDate of this {@link TaskInstance} instance.
  *
  * @param dueDate  The time when the user task instance is or was due to be COMPLETED.
  */
  public void setDueDate( @Nonnull final OffsetDateTime dueDate) {
    this.dueDate = dueDate;
  }

   /**
   * Set the processor of this {@link TaskInstance} instance and return the same instance.
   *
   * @param processor  The user who is processing (has claimed) the user task instance. The user ID is at most 255 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance processor(@Nonnull final String processor) {
    this.processor = processor;
    return this;
  }

   /**
   * The user who is processing (has claimed) the user task instance. The user ID is at most 255 characters long.
   * @return processor  The processor of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getProcessor() {
    return processor;
  }

  /**
  * Set the processor of this {@link TaskInstance} instance.
  *
  * @param processor  The user who is processing (has claimed) the user task instance. The user ID is at most 255 characters long.
  */
  public void setProcessor( @Nonnull final String processor) {
    this.processor = processor;
  }

   /**
   * Set the recipientUsers of this {@link TaskInstance} instance and return the same instance.
   *
   * @param recipientUsers  The recipient users of the user task instance.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance recipientUsers(@Nonnull final Set<String> recipientUsers) {
    this.recipientUsers = recipientUsers;
    return this;
  }
  /**
  * Add one recipientUsers instance to this {@link TaskInstance}.
  * @param recipientUsersItem The recipientUsers that should be added
  * @return The same instance of type {@link TaskInstance}
  */
  @Nonnull public TaskInstance addrecipientUsersItem( @Nonnull final String recipientUsersItem) {
    if (this.recipientUsers == null) {
      this.recipientUsers = new LinkedHashSet<>();
    }
    this.recipientUsers.add(recipientUsersItem);
    return this;
  }

   /**
   * The recipient users of the user task instance.
   * @return recipientUsers  The recipientUsers of this {@link TaskInstance} instance.
  **/
  @Nonnull public Set<String> getRecipientUsers() {
    return recipientUsers;
  }

  /**
  * Set the recipientUsers of this {@link TaskInstance} instance.
  *
  * @param recipientUsers  The recipient users of the user task instance.
  */
  public void setRecipientUsers( @Nonnull final Set<String> recipientUsers) {
    this.recipientUsers = recipientUsers;
  }

   /**
   * Set the recipientGroups of this {@link TaskInstance} instance and return the same instance.
   *
   * @param recipientGroups  The recipient groups of the user task instance.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance recipientGroups(@Nonnull final Set<String> recipientGroups) {
    this.recipientGroups = recipientGroups;
    return this;
  }
  /**
  * Add one recipientGroups instance to this {@link TaskInstance}.
  * @param recipientGroupsItem The recipientGroups that should be added
  * @return The same instance of type {@link TaskInstance}
  */
  @Nonnull public TaskInstance addrecipientGroupsItem( @Nonnull final String recipientGroupsItem) {
    if (this.recipientGroups == null) {
      this.recipientGroups = new LinkedHashSet<>();
    }
    this.recipientGroups.add(recipientGroupsItem);
    return this;
  }

   /**
   * The recipient groups of the user task instance.
   * @return recipientGroups  The recipientGroups of this {@link TaskInstance} instance.
  **/
  @Nonnull public Set<String> getRecipientGroups() {
    return recipientGroups;
  }

  /**
  * Set the recipientGroups of this {@link TaskInstance} instance.
  *
  * @param recipientGroups  The recipient groups of the user task instance.
  */
  public void setRecipientGroups( @Nonnull final Set<String> recipientGroups) {
    this.recipientGroups = recipientGroups;
  }

   /**
   * Set the status of this {@link TaskInstance} instance and return the same instance.
   *
   * @param status  The status of the user task instance.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance status(@Nonnull final StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the user task instance.
   * @return status  The status of this {@link TaskInstance} instance.
  **/
  @Nonnull public StatusEnum getStatus() {
    return status;
  }

  /**
  * Set the status of this {@link TaskInstance} instance.
  *
  * @param status  The status of the user task instance.
  */
  public void setStatus( @Nonnull final StatusEnum status) {
    this.status = status;
  }

   /**
   * Set the subject of this {@link TaskInstance} instance and return the same instance.
   *
   * @param subject  The subject of the user task instance. The subject is at most 255 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance subject(@Nonnull final String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the user task instance. The subject is at most 255 characters long.
   * @return subject  The subject of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getSubject() {
    return subject;
  }

  /**
  * Set the subject of this {@link TaskInstance} instance.
  *
  * @param subject  The subject of the user task instance. The subject is at most 255 characters long.
  */
  public void setSubject( @Nonnull final String subject) {
    this.subject = subject;
  }

   /**
   * Set the workflowDefinitionId of this {@link TaskInstance} instance and return the same instance.
   *
   * @param workflowDefinitionId  The definition ID of the workflow the user task instance belongs to. The ID is at most 64 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance workflowDefinitionId(@Nonnull final String workflowDefinitionId) {
    this.workflowDefinitionId = workflowDefinitionId;
    return this;
  }

   /**
   * The definition ID of the workflow the user task instance belongs to. The ID is at most 64 characters long.
   * @return workflowDefinitionId  The workflowDefinitionId of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getWorkflowDefinitionId() {
    return workflowDefinitionId;
  }

  /**
  * Set the workflowDefinitionId of this {@link TaskInstance} instance.
  *
  * @param workflowDefinitionId  The definition ID of the workflow the user task instance belongs to. The ID is at most 64 characters long.
  */
  public void setWorkflowDefinitionId( @Nonnull final String workflowDefinitionId) {
    this.workflowDefinitionId = workflowDefinitionId;
  }

   /**
   * Set the workflowInstanceId of this {@link TaskInstance} instance and return the same instance.
   *
   * @param workflowInstanceId  The instance ID of the workflow the user task instance belongs to. The ID is at least 36 characters long.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance workflowInstanceId(@Nonnull final String workflowInstanceId) {
    this.workflowInstanceId = workflowInstanceId;
    return this;
  }

   /**
   * The instance ID of the workflow the user task instance belongs to. The ID is at least 36 characters long.
   * @return workflowInstanceId  The workflowInstanceId of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getWorkflowInstanceId() {
    return workflowInstanceId;
  }

  /**
  * Set the workflowInstanceId of this {@link TaskInstance} instance.
  *
  * @param workflowInstanceId  The instance ID of the workflow the user task instance belongs to. The ID is at least 36 characters long.
  */
  public void setWorkflowInstanceId( @Nonnull final String workflowInstanceId) {
    this.workflowInstanceId = workflowInstanceId;
  }

   /**
   * Set the attributes of this {@link TaskInstance} instance and return the same instance.
   *
   * @param attributes  Attributes of the user task instance. Present only if the $expand parameter in the query has the value \&quot;attributes\&quot;.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance attributes(@Nonnull final List<CustomAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }
  /**
  * Add one attributes instance to this {@link TaskInstance}.
  * @param attributesItem The attributes that should be added
  * @return The same instance of type {@link TaskInstance}
  */
  @Nonnull public TaskInstance addattributesItem( @Nonnull final CustomAttribute attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Attributes of the user task instance. Present only if the $expand parameter in the query has the value \&quot;attributes\&quot;.
   * @return attributes  The attributes of this {@link TaskInstance} instance.
  **/
  @Nonnull public List<CustomAttribute> getAttributes() {
    return attributes;
  }

  /**
  * Set the attributes of this {@link TaskInstance} instance.
  *
  * @param attributes  Attributes of the user task instance. Present only if the $expand parameter in the query has the value \&quot;attributes\&quot;.
  */
  public void setAttributes( @Nonnull final List<CustomAttribute> attributes) {
    this.attributes = attributes;
  }

   /**
   * Set the definitionId of this {@link TaskInstance} instance and return the same instance.
   *
   * @param definitionId  The definition ID of the user task. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance definitionId(@Nonnull final String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

   /**
   * The definition ID of the user task. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
   * @return definitionId  The definitionId of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getDefinitionId() {
    return definitionId;
  }

  /**
  * Set the definitionId of this {@link TaskInstance} instance.
  *
  * @param definitionId  The definition ID of the user task. It consists of the ID of the task defined in the workflow definition (task definition ID) as well as the workflow definition ID delimited by an &#39;@&#39; sign. 
  */
  public void setDefinitionId( @Nonnull final String definitionId) {
    this.definitionId = definitionId;
  }

   /**
   * Set the applicationScope of this {@link TaskInstance} instance and return the same instance.
   *
   * @param applicationScope  The scope to which the definition belongs. Either \&quot;own\&quot;, \&quot;shared\&quot; or a named scope.
   * @return The same instance of this {@link TaskInstance} class
   */
   @Nonnull public TaskInstance applicationScope(@Nonnull final String applicationScope) {
    this.applicationScope = applicationScope;
    return this;
  }

   /**
   * The scope to which the definition belongs. Either \&quot;own\&quot;, \&quot;shared\&quot; or a named scope.
   * @return applicationScope  The applicationScope of this {@link TaskInstance} instance.
  **/
  @Nonnull public String getApplicationScope() {
    return applicationScope;
  }

  /**
  * Set the applicationScope of this {@link TaskInstance} instance.
  *
  * @param applicationScope  The scope to which the definition belongs. Either \&quot;own\&quot;, \&quot;shared\&quot; or a named scope.
  */
  public void setApplicationScope( @Nonnull final String applicationScope) {
    this.applicationScope = applicationScope;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link TaskInstance}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link TaskInstance} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("TaskInstance has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link TaskInstance} instance. If the map previously contained a mapping
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
    final TaskInstance taskInstance = (TaskInstance) o;
    return Objects.equals(this.cloudSdkCustomFields, taskInstance.cloudSdkCustomFields) &&
        Objects.equals(this.activityId, taskInstance.activityId) &&
        Objects.equals(this.claimedAt, taskInstance.claimedAt) &&
        Objects.equals(this.completedAt, taskInstance.completedAt) &&
        Objects.equals(this.createdAt, taskInstance.createdAt) &&
        Objects.equals(this.createdBy, taskInstance.createdBy) &&
        Objects.equals(this.lastChangedAt, taskInstance.lastChangedAt) &&
        Objects.equals(this.description, taskInstance.description) &&
        Objects.equals(this.id, taskInstance.id) &&
        Objects.equals(this.priority, taskInstance.priority) &&
        Objects.equals(this.dueDate, taskInstance.dueDate) &&
        Objects.equals(this.processor, taskInstance.processor) &&
        Objects.equals(this.recipientUsers, taskInstance.recipientUsers) &&
        Objects.equals(this.recipientGroups, taskInstance.recipientGroups) &&
        Objects.equals(this.status, taskInstance.status) &&
        Objects.equals(this.subject, taskInstance.subject) &&
        Objects.equals(this.workflowDefinitionId, taskInstance.workflowDefinitionId) &&
        Objects.equals(this.workflowInstanceId, taskInstance.workflowInstanceId) &&
        Objects.equals(this.attributes, taskInstance.attributes) &&
        Objects.equals(this.definitionId, taskInstance.definitionId) &&
        Objects.equals(this.applicationScope, taskInstance.applicationScope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, claimedAt, completedAt, createdAt, createdBy, lastChangedAt, description, id, priority, dueDate, processor, recipientUsers, recipientGroups, status, subject, workflowDefinitionId, workflowInstanceId, attributes, definitionId, applicationScope, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class TaskInstance {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    claimedAt: ").append(toIndentedString(claimedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    lastChangedAt: ").append(toIndentedString(lastChangedAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    processor: ").append(toIndentedString(processor)).append("\n");
    sb.append("    recipientUsers: ").append(toIndentedString(recipientUsers)).append("\n");
    sb.append("    recipientGroups: ").append(toIndentedString(recipientGroups)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    workflowDefinitionId: ").append(toIndentedString(workflowDefinitionId)).append("\n");
    sb.append("    workflowInstanceId: ").append(toIndentedString(workflowInstanceId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    applicationScope: ").append(toIndentedString(applicationScope)).append("\n");
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
