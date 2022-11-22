// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.SqlGlobalConfigArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.SqlGlobalConfigState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace. *Please note that changing parameters of this resource will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.
 * 
 * ## Example Usage
 * ### AWS example
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SqlGlobalConfig;
 * import com.pulumi.databricks.SqlGlobalConfigArgs;
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
 *         var this_ = new SqlGlobalConfig(&#34;this&#34;, SqlGlobalConfigArgs.builder()        
 *             .securityPolicy(&#34;DATA_ACCESS_CONTROL&#34;)
 *             .instanceProfileArn(&#34;arn:....&#34;)
 *             .dataAccessConfig(Map.of(&#34;spark.sql.session.timeZone&#34;, &#34;UTC&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Azure example
 * 
 * For Azure you should use the `data_access_config` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.SqlGlobalConfig;
 * import com.pulumi.databricks.SqlGlobalConfigArgs;
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
 *         var this_ = new SqlGlobalConfig(&#34;this&#34;, SqlGlobalConfigArgs.builder()        
 *             .securityPolicy(&#34;DATA_ACCESS_CONTROL&#34;)
 *             .dataAccessConfig(Map.ofEntries(
 *                 Map.entry(&#34;spark.hadoop.fs.azure.account.auth.type&#34;, &#34;OAuth&#34;),
 *                 Map.entry(&#34;spark.hadoop.fs.azure.account.oauth.provider.type&#34;, &#34;org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider&#34;),
 *                 Map.entry(&#34;spark.hadoop.fs.azure.account.oauth2.client.id&#34;, var_.tenant_id()),
 *                 Map.entry(&#34;spark.hadoop.fs.azure.account.oauth2.client.secret&#34;, String.format(&#34;{{{{secrets/%s/%s}}}}&#34;, local.secret_scope(),local.secret_key())),
 *                 Map.entry(&#34;spark.hadoop.fs.azure.account.oauth2.client.endpoint&#34;, String.format(&#34;https://login.microsoftonline.com/%s/oauth2/token&#34;, var_.tenant_id()))
 *             ))
 *             .sqlConfigParams(Map.of(&#34;ANSI_MODE&#34;, &#34;true&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
 * * databricks.SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
 * * databricks.SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
 * 
 * ## Import
 * 
 * You can import a `databricks_sql_global_config` resource with command like the following (you need to use `global` as ID)bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/sqlGlobalConfig:SqlGlobalConfig this global
 * ```
 * 
 */
@ResourceType(type="databricks:index/sqlGlobalConfig:SqlGlobalConfig")
public class SqlGlobalConfig extends com.pulumi.resources.CustomResource {
    /**
     * - Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
     * 
     */
    @Export(name="dataAccessConfig", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> dataAccessConfig;

    /**
     * @return - Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you&#39;re specifying not permitted configuration.
     * 
     */
    public Output<Optional<Map<String,Object>>> dataAccessConfig() {
        return Codegen.optional(this.dataAccessConfig);
    }
    /**
     * - Allows the possibility to create Serverlell SQL warehouses. Default value: false.
     * 
     */
    @Export(name="enableServerlessCompute", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableServerlessCompute;

    /**
     * @return - Allows the possibility to create Serverlell SQL warehouses. Default value: false.
     * 
     */
    public Output<Optional<Boolean>> enableServerlessCompute() {
        return Codegen.optional(this.enableServerlessCompute);
    }
    /**
     * - databricks.InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     * 
     */
    @Export(name="instanceProfileArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> instanceProfileArn;

    /**
     * @return - databricks.InstanceProfile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     * 
     */
    public Output<Optional<String>> instanceProfileArn() {
        return Codegen.optional(this.instanceProfileArn);
    }
    /**
     * - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     * 
     */
    @Export(name="securityPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityPolicy;

    /**
     * @return - The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     * 
     */
    public Output<Optional<String>> securityPolicy() {
        return Codegen.optional(this.securityPolicy);
    }
    /**
     * - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     * 
     */
    @Export(name="sqlConfigParams", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> sqlConfigParams;

    /**
     * @return - SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     * 
     */
    public Output<Optional<Map<String,Object>>> sqlConfigParams() {
        return Codegen.optional(this.sqlConfigParams);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SqlGlobalConfig(String name) {
        this(name, SqlGlobalConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SqlGlobalConfig(String name, @Nullable SqlGlobalConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SqlGlobalConfig(String name, @Nullable SqlGlobalConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, args == null ? SqlGlobalConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SqlGlobalConfig(String name, Output<String> id, @Nullable SqlGlobalConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/sqlGlobalConfig:SqlGlobalConfig", name, state, makeResourceOptions(options, id));
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
    public static SqlGlobalConfig get(String name, Output<String> id, @Nullable SqlGlobalConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SqlGlobalConfig(name, id, state, options);
    }
}
