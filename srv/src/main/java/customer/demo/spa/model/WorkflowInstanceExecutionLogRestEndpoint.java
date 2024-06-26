

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
 * Information about the service task.
 */

// CHECKSTYLE:OFF
public class WorkflowInstanceExecutionLogRestEndpoint 
// CHECKSTYLE:ON
{
  @JsonProperty("httpMethod")
  private String httpMethod;

  @JsonProperty("destinationName")
  private String destinationName;

  @JsonProperty("destinationSubdomain")
  private String destinationSubdomain;

  @JsonProperty("destinationUrl")
  private String destinationUrl;

  @JsonProperty("relativePath")
  private String relativePath;

  @JsonAnySetter
  @JsonAnyGetter
  private final Map<String, Object> cloudSdkCustomFields = new LinkedHashMap<>();

   /**
   * Set the httpMethod of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance and return the same instance.
   *
   * @param httpMethod  The HTTP method.
   * @return The same instance of this {@link WorkflowInstanceExecutionLogRestEndpoint} class
   */
   @Nonnull public WorkflowInstanceExecutionLogRestEndpoint httpMethod(@Nonnull final String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * The HTTP method.
   * @return httpMethod  The httpMethod of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  **/
  @Nonnull public String getHttpMethod() {
    return httpMethod;
  }

  /**
  * Set the httpMethod of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  *
  * @param httpMethod  The HTTP method.
  */
  public void setHttpMethod( @Nonnull final String httpMethod) {
    this.httpMethod = httpMethod;
  }

   /**
   * Set the destinationName of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance and return the same instance.
   *
   * @param destinationName  The name of the destination.
   * @return The same instance of this {@link WorkflowInstanceExecutionLogRestEndpoint} class
   */
   @Nonnull public WorkflowInstanceExecutionLogRestEndpoint destinationName(@Nonnull final String destinationName) {
    this.destinationName = destinationName;
    return this;
  }

   /**
   * The name of the destination.
   * @return destinationName  The destinationName of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  **/
  @Nonnull public String getDestinationName() {
    return destinationName;
  }

  /**
  * Set the destinationName of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  *
  * @param destinationName  The name of the destination.
  */
  public void setDestinationName( @Nonnull final String destinationName) {
    this.destinationName = destinationName;
  }

   /**
   * Set the destinationSubdomain of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance and return the same instance.
   *
   * @param destinationSubdomain  The subdomain of the account in which the destination was looked up.
   * @return The same instance of this {@link WorkflowInstanceExecutionLogRestEndpoint} class
   */
   @Nonnull public WorkflowInstanceExecutionLogRestEndpoint destinationSubdomain(@Nonnull final String destinationSubdomain) {
    this.destinationSubdomain = destinationSubdomain;
    return this;
  }

   /**
   * The subdomain of the account in which the destination was looked up.
   * @return destinationSubdomain  The destinationSubdomain of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  **/
  @Nonnull public String getDestinationSubdomain() {
    return destinationSubdomain;
  }

  /**
  * Set the destinationSubdomain of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  *
  * @param destinationSubdomain  The subdomain of the account in which the destination was looked up.
  */
  public void setDestinationSubdomain( @Nonnull final String destinationSubdomain) {
    this.destinationSubdomain = destinationSubdomain;
  }

   /**
   * Set the destinationUrl of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance and return the same instance.
   *
   * @param destinationUrl  The URL configured in the destination.
   * @return The same instance of this {@link WorkflowInstanceExecutionLogRestEndpoint} class
   */
   @Nonnull public WorkflowInstanceExecutionLogRestEndpoint destinationUrl(@Nonnull final String destinationUrl) {
    this.destinationUrl = destinationUrl;
    return this;
  }

   /**
   * The URL configured in the destination.
   * @return destinationUrl  The destinationUrl of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  **/
  @Nonnull public String getDestinationUrl() {
    return destinationUrl;
  }

  /**
  * Set the destinationUrl of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  *
  * @param destinationUrl  The URL configured in the destination.
  */
  public void setDestinationUrl( @Nonnull final String destinationUrl) {
    this.destinationUrl = destinationUrl;
  }

   /**
   * Set the relativePath of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance and return the same instance.
   *
   * @param relativePath  The relative URL configured in the service task.
   * @return The same instance of this {@link WorkflowInstanceExecutionLogRestEndpoint} class
   */
   @Nonnull public WorkflowInstanceExecutionLogRestEndpoint relativePath(@Nonnull final String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

   /**
   * The relative URL configured in the service task.
   * @return relativePath  The relativePath of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  **/
  @Nonnull public String getRelativePath() {
    return relativePath;
  }

  /**
  * Set the relativePath of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
  *
  * @param relativePath  The relative URL configured in the service task.
  */
  public void setRelativePath( @Nonnull final String relativePath) {
    this.relativePath = relativePath;
  }

  /**
   * Get the names of the unrecognizable properties of the {@link WorkflowInstanceExecutionLogRestEndpoint}.
   * @return The set of properties names
   */
  @JsonIgnore
  @Nonnull
  public Set<String> getCustomFieldNames() {
    return cloudSdkCustomFields.keySet();
  }

  /**
   * Get the value of an unrecognizable property of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance.
   * @param name  The name of the property
   * @return The value of the property
   * @throws NoSuchElementException  If no property with the given name could be found.
   */
  @Nullable
  public Object getCustomField(@Nonnull final String name) throws NoSuchElementException {
    if( !cloudSdkCustomFields.containsKey(name) ) {
        throw new NoSuchElementException("WorkflowInstanceExecutionLogRestEndpoint has no field with name '" + name + "'.");
    }
    return cloudSdkCustomFields.get(name);
  }

  /**
   * Set an unrecognizable property of this {@link WorkflowInstanceExecutionLogRestEndpoint} instance. If the map previously contained a mapping
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
    final WorkflowInstanceExecutionLogRestEndpoint workflowInstanceExecutionLogRestEndpoint = (WorkflowInstanceExecutionLogRestEndpoint) o;
    return Objects.equals(this.cloudSdkCustomFields, workflowInstanceExecutionLogRestEndpoint.cloudSdkCustomFields) &&
        Objects.equals(this.httpMethod, workflowInstanceExecutionLogRestEndpoint.httpMethod) &&
        Objects.equals(this.destinationName, workflowInstanceExecutionLogRestEndpoint.destinationName) &&
        Objects.equals(this.destinationSubdomain, workflowInstanceExecutionLogRestEndpoint.destinationSubdomain) &&
        Objects.equals(this.destinationUrl, workflowInstanceExecutionLogRestEndpoint.destinationUrl) &&
        Objects.equals(this.relativePath, workflowInstanceExecutionLogRestEndpoint.relativePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpMethod, destinationName, destinationSubdomain, destinationUrl, relativePath, cloudSdkCustomFields);
  }

  @Override
  @Nonnull public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowInstanceExecutionLogRestEndpoint {\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    destinationName: ").append(toIndentedString(destinationName)).append("\n");
    sb.append("    destinationSubdomain: ").append(toIndentedString(destinationSubdomain)).append("\n");
    sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
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
