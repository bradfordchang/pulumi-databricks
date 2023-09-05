// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Lakehouse Federation is the query federation platform for Databricks. Databricks uses Unity Catalog to manage query federation. To make a dataset available for read-only querying using Lakehouse Federation, you create the following:
 *
 * - A connection, a securable object in Unity Catalog that specifies a path and credentials for accessing an external database system.
 * - A foreign catalog
 *
 * This resource manages connections in Unity Catalog
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const mysql = new databricks.Connection("mysql", {
 *     comment: "this is a connection to mysql db",
 *     connectionType: "MYSQL",
 *     options: {
 *         host: "test.mysql.database.azure.com",
 *         password: "password",
 *         port: "3306",
 *         user: "user",
 *     },
 *     properties: {
 *         purpose: "testing",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by `name` bash
 *
 * ```sh
 *  $ pulumi import databricks:index/connection:Connection this <connection_name>
 * ```
 */
export class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState, opts?: pulumi.CustomResourceOptions): Connection {
        return new Connection(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/connection:Connection';

    /**
     * Returns true if the given object is an instance of Connection.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Connection {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Connection.__pulumiType;
    }

    /**
     * Free-form text.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     */
    public readonly connectionType!: pulumi.Output<string>;
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of the Connection.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
     */
    public readonly options!: pulumi.Output<{[key: string]: any}>;
    /**
     * Name of the connection owner.
     */
    public readonly owner!: pulumi.Output<string | undefined>;
    /**
     * Free-form connection properties.
     */
    public readonly properties!: pulumi.Output<{[key: string]: any} | undefined>;
    public readonly readOnly!: pulumi.Output<boolean>;

    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConnectionArgs | ConnectionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConnectionState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["connectionType"] = state ? state.connectionType : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["options"] = state ? state.options : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
            resourceInputs["properties"] = state ? state.properties : undefined;
            resourceInputs["readOnly"] = state ? state.readOnly : undefined;
        } else {
            const args = argsOrState as ConnectionArgs | undefined;
            if ((!args || args.connectionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'connectionType'");
            }
            if ((!args || args.options === undefined) && !opts.urn) {
                throw new Error("Missing required property 'options'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["connectionType"] = args ? args.connectionType : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["options"] = args?.options ? pulumi.secret(args.options) : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
            resourceInputs["properties"] = args ? args.properties : undefined;
            resourceInputs["readOnly"] = args ? args.readOnly : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["options"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Connection.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Free-form text.
     */
    comment?: pulumi.Input<string>;
    /**
     * Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     */
    connectionType?: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of the Connection.
     */
    name?: pulumi.Input<string>;
    /**
     * The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
     */
    options?: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the connection owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Free-form connection properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
    readOnly?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Free-form text.
     */
    comment?: pulumi.Input<string>;
    /**
     * Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
     */
    connectionType: pulumi.Input<string>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of the Connection.
     */
    name?: pulumi.Input<string>;
    /**
     * The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
     */
    options: pulumi.Input<{[key: string]: any}>;
    /**
     * Name of the connection owner.
     */
    owner?: pulumi.Input<string>;
    /**
     * Free-form connection properties.
     */
    properties?: pulumi.Input<{[key: string]: any}>;
    readOnly?: pulumi.Input<boolean>;
}