// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This resource configures the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all databricks.SqlEndpoint of workspace. *Please note that changing parameters of this resource will restart all running databricks_sql_endpoint.*  To use this resource you need to be an administrator.
 *
 * ## Example Usage
 * ### AWS example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.SqlGlobalConfig("this", {
 *     securityPolicy: "DATA_ACCESS_CONTROL",
 *     instanceProfileArn: "arn:....",
 *     dataAccessConfig: {
 *         "spark.sql.session.timeZone": "UTC",
 *     },
 * });
 * ```
 * ### Azure example
 *
 * For Azure you should use the `dataAccessConfig` to provide the service principal configuration. You can use the Databricks SQL Admin Console UI to help you generate the right configuration values.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.SqlGlobalConfig("this", {
 *     securityPolicy: "DATA_ACCESS_CONTROL",
 *     dataAccessConfig: {
 *         "spark.hadoop.fs.azure.account.auth.type": "OAuth",
 *         "spark.hadoop.fs.azure.account.oauth.provider.type": "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
 *         "spark.hadoop.fs.azure.account.oauth2.client.id": _var.application_id,
 *         "spark.hadoop.fs.azure.account.oauth2.client.secret": `{{secrets/${local.secret_scope}/${local.secret_key}}}`,
 *         "spark.hadoop.fs.azure.account.oauth2.client.endpoint": `https://login.microsoftonline.com/${_var.tenant_id}/oauth2/token`,
 *     },
 *     sqlConfigParams: {
 *         ANSI_MODE: "true",
 *     },
 * });
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
 */
export class SqlGlobalConfig extends pulumi.CustomResource {
    /**
     * Get an existing SqlGlobalConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SqlGlobalConfigState, opts?: pulumi.CustomResourceOptions): SqlGlobalConfig {
        return new SqlGlobalConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/sqlGlobalConfig:SqlGlobalConfig';

    /**
     * Returns true if the given object is an instance of SqlGlobalConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SqlGlobalConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SqlGlobalConfig.__pulumiType;
    }

    /**
     * Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
     */
    public readonly dataAccessConfig!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * Allows the possibility to create Serverless SQL warehouses. Default value: false.
     */
    public readonly enableServerlessCompute!: pulumi.Output<boolean | undefined>;
    /**
     * databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     */
    public readonly instanceProfileArn!: pulumi.Output<string | undefined>;
    /**
     * The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     */
    public readonly securityPolicy!: pulumi.Output<string | undefined>;
    /**
     * SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     */
    public readonly sqlConfigParams!: pulumi.Output<{[key: string]: any} | undefined>;

    /**
     * Create a SqlGlobalConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: SqlGlobalConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SqlGlobalConfigArgs | SqlGlobalConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SqlGlobalConfigState | undefined;
            resourceInputs["dataAccessConfig"] = state ? state.dataAccessConfig : undefined;
            resourceInputs["enableServerlessCompute"] = state ? state.enableServerlessCompute : undefined;
            resourceInputs["instanceProfileArn"] = state ? state.instanceProfileArn : undefined;
            resourceInputs["securityPolicy"] = state ? state.securityPolicy : undefined;
            resourceInputs["sqlConfigParams"] = state ? state.sqlConfigParams : undefined;
        } else {
            const args = argsOrState as SqlGlobalConfigArgs | undefined;
            resourceInputs["dataAccessConfig"] = args ? args.dataAccessConfig : undefined;
            resourceInputs["enableServerlessCompute"] = args ? args.enableServerlessCompute : undefined;
            resourceInputs["instanceProfileArn"] = args ? args.instanceProfileArn : undefined;
            resourceInputs["securityPolicy"] = args ? args.securityPolicy : undefined;
            resourceInputs["sqlConfigParams"] = args ? args.sqlConfigParams : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(SqlGlobalConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SqlGlobalConfig resources.
 */
export interface SqlGlobalConfigState {
    /**
     * Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
     */
    dataAccessConfig?: pulumi.Input<{[key: string]: any}>;
    /**
     * Allows the possibility to create Serverless SQL warehouses. Default value: false.
     */
    enableServerlessCompute?: pulumi.Input<boolean>;
    /**
     * databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     */
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     */
    securityPolicy?: pulumi.Input<string>;
    /**
     * SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     */
    sqlConfigParams?: pulumi.Input<{[key: string]: any}>;
}

/**
 * The set of arguments for constructing a SqlGlobalConfig resource.
 */
export interface SqlGlobalConfigArgs {
    /**
     * Data access configuration for databricks_sql_endpoint, such as configuration for an external Hive metastore, Hadoop Filesystem configuration, etc.  Please note that the list of supported configuration properties is limited, so refer to the [documentation](https://docs.databricks.com/sql/admin/data-access-configuration.html#supported-properties) for a full list.  Apply will fail if you're specifying not permitted configuration.
     */
    dataAccessConfig?: pulumi.Input<{[key: string]: any}>;
    /**
     * Allows the possibility to create Serverless SQL warehouses. Default value: false.
     */
    enableServerlessCompute?: pulumi.Input<boolean>;
    /**
     * databricks_instance_profile used to access storage from databricks_sql_endpoint. Please note that this parameter is only for AWS, and will generate an error if used on other clouds.
     */
    instanceProfileArn?: pulumi.Input<string>;
    /**
     * The policy for controlling access to datasets. Default value: `DATA_ACCESS_CONTROL`, consult documentation for list of possible values
     */
    securityPolicy?: pulumi.Input<string>;
    /**
     * SQL Configuration Parameters let you override the default behavior for all sessions with all endpoints.
     */
    sqlConfigParams?: pulumi.Input<{[key: string]: any}>;
}
