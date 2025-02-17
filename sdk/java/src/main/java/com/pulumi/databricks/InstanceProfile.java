// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.InstanceProfileArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.InstanceProfileState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource allows you to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount. The following example demonstrates how to create an instance profile and create a cluster with it. When creating a new `databricks.InstanceProfile`, Databricks validates that it has sufficient permissions to launch instances with the instance profile. This validation uses AWS dry-run mode for the [AWS EC2 RunInstances API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_RunInstances.html).
 * 
 * &gt; **Note** Please switch to databricks.StorageCredential with Unity Catalog to manage storage credentials, which provides a better and faster way for managing credential security.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.Policy;
 * import com.pulumi.aws.iam.PolicyArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.iam.InstanceProfile;
 * import com.pulumi.aws.iam.InstanceProfileArgs;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetSparkVersionArgs;
 * import com.pulumi.databricks.inputs.GetNodeTypeArgs;
 * import com.pulumi.databricks.Cluster;
 * import com.pulumi.databricks.ClusterArgs;
 * import com.pulumi.databricks.inputs.ClusterAutoscaleArgs;
 * import com.pulumi.databricks.inputs.ClusterAwsAttributesArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var config = ctx.config();
 *         final var crossaccountRoleName = config.get(&#34;crossaccountRoleName&#34;);
 *         final var assumeRoleForEc2 = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .identifiers(&#34;ec2.amazonaws.com&#34;)
 *                     .type(&#34;Service&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var roleForS3Access = new Role(&#34;roleForS3Access&#34;, RoleArgs.builder()        
 *             .description(&#34;Role for shared access&#34;)
 *             .assumeRolePolicy(assumeRoleForEc2.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         final var passRoleForS3AccessPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;iam:PassRole&#34;)
 *                 .resources(roleForS3Access.arn())
 *                 .build())
 *             .build());
 * 
 *         var passRoleForS3AccessPolicy = new Policy(&#34;passRoleForS3AccessPolicy&#34;, PolicyArgs.builder()        
 *             .path(&#34;/&#34;)
 *             .policy(passRoleForS3AccessPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(passRoleForS3AccessPolicyDocument -&gt; passRoleForS3AccessPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *         var crossAccount = new RolePolicyAttachment(&#34;crossAccount&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(passRoleForS3AccessPolicy.arn())
 *             .role(crossaccountRoleName)
 *             .build());
 * 
 *         var sharedInstanceProfile = new InstanceProfile(&#34;sharedInstanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .role(roleForS3Access.name())
 *             .build());
 * 
 *         var sharedIndex_instanceProfileInstanceProfile = new InstanceProfile(&#34;sharedIndex/instanceProfileInstanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .instanceProfileArn(sharedInstanceProfile.arn())
 *             .build());
 * 
 *         final var latest = DatabricksFunctions.getSparkVersion();
 * 
 *         final var smallest = DatabricksFunctions.getNodeType(GetNodeTypeArgs.builder()
 *             .localDisk(true)
 *             .build());
 * 
 *         var this_ = new Cluster(&#34;this&#34;, ClusterArgs.builder()        
 *             .clusterName(&#34;Shared Autoscaling&#34;)
 *             .sparkVersion(latest.applyValue(getSparkVersionResult -&gt; getSparkVersionResult.id()))
 *             .nodeTypeId(smallest.applyValue(getNodeTypeResult -&gt; getNodeTypeResult.id()))
 *             .autoterminationMinutes(20)
 *             .autoscale(ClusterAutoscaleArgs.builder()
 *                 .minWorkers(1)
 *                 .maxWorkers(50)
 *                 .build())
 *             .awsAttributes(ClusterAwsAttributesArgs.builder()
 *                 .instanceProfileArn(sharedIndex / instanceProfileInstanceProfile.id())
 *                 .availability(&#34;SPOT&#34;)
 *                 .zoneId(&#34;us-east-1&#34;)
 *                 .firstOnDemand(1)
 *                 .spotBidPricePercent(100)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Usage with Cluster Policies
 * 
 * It is advised to keep all common configurations in Cluster Policies to maintain control of the environments launched, so `databricks.Cluster` above could be replaced with `databricks.ClusterPolicy`:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ClusterPolicy;
 * import com.pulumi.databricks.ClusterPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new ClusterPolicy(&#34;this&#34;, ClusterPolicyArgs.builder()        
 *             .definition(serializeJson(
 *                 jsonObject(
 *                     jsonProperty(&#34;aws_attributes.instance_profile_arn&#34;, jsonObject(
 *                         jsonProperty(&#34;type&#34;, &#34;fixed&#34;),
 *                         jsonProperty(&#34;value&#34;, databricks_instance_profile.shared().arn())
 *                     ))
 *                 )))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Granting access to all users
 * 
 * You can make instance profile available to all users by associating it with the special group called `users` through databricks.Group data source.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.GroupInstanceProfile;
 * import com.pulumi.databricks.GroupInstanceProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var this_ = new InstanceProfile(&#34;this&#34;, InstanceProfileArgs.builder()        
 *             .instanceProfileArn(aws_iam_instance_profile.shared().arn())
 *             .build());
 * 
 *         final var users = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;users&#34;)
 *             .build());
 * 
 *         var all = new GroupInstanceProfile(&#34;all&#34;, GroupInstanceProfileArgs.builder()        
 *             .groupId(users.applyValue(getGroupResult -&gt; getGroupResult.id()))
 *             .instanceProfileId(this_.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Usage with Databricks SQL serverless
 * 
 * When the instance profile ARN and its associated IAM role ARN don&#39;t match and the instance profile is intended for use with Databricks SQL serverless, the `iam_role_arn` parameter can be specified.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.iam.InstanceProfile;
 * import com.pulumi.aws.iam.InstanceProfileArgs;
 * import com.pulumi.databricks.InstanceProfile;
 * import com.pulumi.databricks.InstanceProfileArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var sqlServerlessAssumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;arn:aws:iam::790110701330:role/serverless-customer-resource-role&#34;)
 *                     .build())
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test(&#34;StringEquals&#34;)
 *                     .variable(&#34;sts:ExternalID&#34;)
 *                     .values(                    
 *                         &#34;databricks-serverless-&lt;YOUR_WORKSPACE_ID1&gt;&#34;,
 *                         &#34;databricks-serverless-&lt;YOUR_WORKSPACE_ID2&gt;&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var thisRole = new Role(&#34;thisRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(sqlServerlessAssumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var thisInstanceProfile = new InstanceProfile(&#34;thisInstanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .role(thisRole.name())
 *             .build());
 * 
 *         var thisIndex_instanceProfileInstanceProfile = new InstanceProfile(&#34;thisIndex/instanceProfileInstanceProfile&#34;, InstanceProfileArgs.builder()        
 *             .instanceProfileArn(thisInstanceProfile.arn())
 *             .iamRoleArn(thisRole.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * The resource instance profile can be imported using the ARN of it bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/instanceProfile:InstanceProfile this &lt;instance-profile-arn&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/instanceProfile:InstanceProfile")
public class InstanceProfile extends com.pulumi.resources.CustomResource {
    /**
     * The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    @Export(name="iamRoleArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> iamRoleArn;

    /**
     * @return The AWS IAM role ARN of the role associated with the instance profile. It must have the form `arn:aws:iam::&lt;account-id&gt;:role/&lt;name&gt;`. This field is required if your role name and instance profile name do not match and you want to use the instance profile with Databricks SQL Serverless.
     * 
     */
    public Output<Optional<String>> iamRoleArn() {
        return Codegen.optional(this.iamRoleArn);
    }
    /**
     * `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    @Export(name="instanceProfileArn", refs={String.class}, tree="[0]")
    private Output<String> instanceProfileArn;

    /**
     * @return `ARN` attribute of `aws_iam_instance_profile` output, the EC2 instance profile association to AWS IAM role. This ARN would be validated upon resource creation.
     * 
     */
    public Output<String> instanceProfileArn() {
        return this.instanceProfileArn;
    }
    /**
     * Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    @Export(name="isMetaInstanceProfile", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isMetaInstanceProfile;

    /**
     * @return Whether the instance profile is a meta instance profile. Used only in [IAM credential passthrough](https://docs.databricks.com/security/credential-passthrough/iam-passthrough.html).
     * 
     */
    public Output<Optional<Boolean>> isMetaInstanceProfile() {
        return Codegen.optional(this.isMetaInstanceProfile);
    }
    /**
     * **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    @Export(name="skipValidation", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> skipValidation;

    /**
     * @return **For advanced usage only.** If validation fails with an error message that does not indicate an IAM related permission issue, (e.g. &#34;Your requested instance type is not supported in your requested availability zone&#34;), you can pass this flag to skip the validation and forcibly add the instance profile.
     * 
     */
    public Output<Boolean> skipValidation() {
        return this.skipValidation;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceProfile(String name) {
        this(name, InstanceProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceProfile(String name, InstanceProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceProfile(String name, InstanceProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instanceProfile:InstanceProfile", name, args == null ? InstanceProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceProfile(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/instanceProfile:InstanceProfile", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static InstanceProfile get(String name, Output<String> id, @Nullable InstanceProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceProfile(name, id, state, options);
    }
}
