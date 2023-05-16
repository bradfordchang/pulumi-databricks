// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ServicePrincipalArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ServicePrincipalState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Directly manage [Service Principals](https://docs.databricks.com/administration-guide/users-groups/service-principals.html) that could be added to databricks.Group in Databricks workspace or account.
 * 
 * &gt; **Note** To assign account level service principals to workspace use databricks_mws_permission_assignment.
 * 
 * To create service principals in the Databricks account, the provider must be configured with `host = &#34;https://accounts.cloud.databricks.com&#34;` on AWS deployments or `host = &#34;https://accounts.azuredatabricks.net&#34;` and authenticate using AAD tokens on Azure deployments
 * 
 * ## Example Usage
 * 
 * Creating regular service principal:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating service principal with administrative permissions - referencing special `admins` databricks.Group in databricks.GroupMember resource:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetGroupArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.databricks.GroupMember;
 * import com.pulumi.databricks.GroupMemberArgs;
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
 *         final var admins = DatabricksFunctions.getGroup(GetGroupArgs.builder()
 *             .displayName(&#34;admins&#34;)
 *             .build());
 * 
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build());
 * 
 *         var i_am_admin = new GroupMember(&#34;i-am-admin&#34;, GroupMemberArgs.builder()        
 *             .groupId(admins.applyValue(getGroupResult -&gt; getGroupResult.id()))
 *             .memberId(sp.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating service principal with cluster create permissions:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
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
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .allowClusterCreate(true)
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .displayName(&#34;Example service principal&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating service principal in AWS Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var mws = new Provider(&#34;mws&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.cloud.databricks.com&#34;)
 *             .accountId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .username(var_.databricks_account_username())
 *             .password(var_.databricks_account_password())
 *             .build());
 * 
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .displayName(&#34;Automation-only SP&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.mws())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * Creating service principal in Azure Databricks account:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Provider;
 * import com.pulumi.databricks.ProviderArgs;
 * import com.pulumi.databricks.ServicePrincipal;
 * import com.pulumi.databricks.ServicePrincipalArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var azureAccount = new Provider(&#34;azureAccount&#34;, ProviderArgs.builder()        
 *             .host(&#34;https://accounts.azuredatabricks.net&#34;)
 *             .accountId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .authType(&#34;azure-cli&#34;)
 *             .build());
 * 
 *         var sp = new ServicePrincipal(&#34;sp&#34;, ServicePrincipalArgs.builder()        
 *             .applicationId(&#34;00000000-0000-0000-0000-000000000000&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.azure_account())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
 * * databricks.Group data to retrieve information about databricks.Group members, entitlements and instance profiles.
 * * databricks.GroupMember to attach users and groups as group members.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and more to manage secrets for the service principal (only for AWS deployments)
 * 
 * ## Import
 * 
 * The resource scim service principal can be imported using its id, for example `2345678901234567`. To get the service principal ID, call [Get service principals](https://docs.databricks.com/dev-tools/api/latest/scim/scim-sp.html#get-service-principals). bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/servicePrincipal:ServicePrincipal me &lt;service-principal-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/servicePrincipal:ServicePrincipal")
public class ServicePrincipal extends com.pulumi.resources.CustomResource {
    /**
     * Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Either service principal is active or not. True by default, but can be set to false in case of service principal deactivation with preserving service principal assets.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    @Export(name="allowClusterCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowClusterCreate;

    /**
     * @return Allow the service principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and `cluster_id` argument. Everyone without `allow_cluster_create` argument set, but with permission to use Cluster Policy would be able to create clusters, but within the boundaries of that specific policy.
     * 
     */
    public Output<Optional<Boolean>> allowClusterCreate() {
        return Codegen.optional(this.allowClusterCreate);
    }
    /**
     * Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    @Export(name="allowInstancePoolCreate", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> allowInstancePoolCreate;

    /**
     * @return Allow the service principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with databricks.Permissions and instance_pool_id argument.
     * 
     */
    public Output<Optional<Boolean>> allowInstancePoolCreate() {
        return Codegen.optional(this.allowInstancePoolCreate);
    }
    /**
     * This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     * 
     */
    @Export(name="applicationId", type=String.class, parameters={})
    private Output<String> applicationId;

    /**
     * @return This is the Azure Application ID of the given Azure service principal and will be their form of access and identity. On other clouds than Azure this value is auto-generated.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    @Export(name="databricksSqlAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> databricksSqlAccess;

    /**
     * @return This is a field to allow the group to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature through databricks_sql_endpoint.
     * 
     */
    public Output<Optional<Boolean>> databricksSqlAccess() {
        return Codegen.optional(this.databricksSqlAccess);
    }
    /**
     * This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return This is an alias for the service principal and can be the full name of the service principal.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * ID of the service principal in an external identity provider.
     * 
     */
    @Export(name="externalId", type=String.class, parameters={})
    private Output</* @Nullable */ String> externalId;

    /**
     * @return ID of the service principal in an external identity provider.
     * 
     */
    public Output<Optional<String>> externalId() {
        return Codegen.optional(this.externalId);
    }
    @Export(name="force", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> force;

    public Output<Optional<Boolean>> force() {
        return Codegen.optional(this.force);
    }
    /**
     * This flag determines whether the service principal&#39;s home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteHomeDir", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDeleteHomeDir;

    /**
     * @return This flag determines whether the service principal&#39;s home directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteHomeDir() {
        return Codegen.optional(this.forceDeleteHomeDir);
    }
    /**
     * This flag determines whether the service principal&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    @Export(name="forceDeleteRepos", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDeleteRepos;

    /**
     * @return This flag determines whether the service principal&#39;s repo directory is deleted when the user is deleted. It will have no impact when in the accounts SCIM API. False by default.
     * 
     */
    public Output<Optional<Boolean>> forceDeleteRepos() {
        return Codegen.optional(this.forceDeleteRepos);
    }
    /**
     * Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Export(name="home", type=String.class, parameters={})
    private Output<String> home;

    /**
     * @return Home folder of the service principal, e.g. `/Users/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Output<String> home() {
        return this.home;
    }
    /**
     * Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    @Export(name="repos", type=String.class, parameters={})
    private Output<String> repos;

    /**
     * @return Personal Repos location of the service principal, e.g. `/Repos/00000000-0000-0000-0000-000000000000`.
     * 
     */
    public Output<String> repos() {
        return this.repos;
    }
    /**
     * This is a field to allow the group to have access to Databricks Workspace.
     * 
     */
    @Export(name="workspaceAccess", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> workspaceAccess;

    /**
     * @return This is a field to allow the group to have access to Databricks Workspace.
     * 
     */
    public Output<Optional<Boolean>> workspaceAccess() {
        return Codegen.optional(this.workspaceAccess);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePrincipal(String name) {
        this(name, ServicePrincipalArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePrincipal(String name, @Nullable ServicePrincipalArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePrincipal(String name, @Nullable ServicePrincipalArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipal:ServicePrincipal", name, args == null ? ServicePrincipalArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePrincipal(String name, Output<String> id, @Nullable ServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/servicePrincipal:ServicePrincipal", name, state, makeResourceOptions(options, id));
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
    public static ServicePrincipal get(String name, Output<String> id, @Nullable ServicePrincipalState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePrincipal(name, id, state, options);
    }
}
