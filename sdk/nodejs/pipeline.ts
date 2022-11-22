// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Use `databricks.Pipeline` to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const dltDemo = new databricks.Notebook("dltDemo", {});
 * //...
 * const _this = new databricks.Pipeline("this", {
 *     storage: "/test/first-pipeline",
 *     configuration: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 *     clusters: [
 *         {
 *             label: "default",
 *             numWorkers: 2,
 *             customTags: {
 *                 cluster_type: "default",
 *             },
 *         },
 *         {
 *             label: "maintenance",
 *             numWorkers: 1,
 *             customTags: {
 *                 cluster_type: "maintenance",
 *             },
 *         },
 *     ],
 *     libraries: [{
 *         notebook: {
 *             path: dltDemo.id,
 *         },
 *     }],
 *     continuous: false,
 * });
 * ```
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 *
 * ## Import
 *
 * The resource job can be imported using the id of the pipeline bash
 *
 * ```sh
 *  $ pulumi import databricks:index/pipeline:Pipeline this <pipeline-id>
 * ```
 */
export class Pipeline extends pulumi.CustomResource {
    /**
     * Get an existing Pipeline resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipelineState, opts?: pulumi.CustomResourceOptions): Pipeline {
        return new Pipeline(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/pipeline:Pipeline';

    /**
     * Returns true if the given object is an instance of Pipeline.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pipeline {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pipeline.__pulumiType;
    }

    public readonly allowDuplicateNames!: pulumi.Output<boolean | undefined>;
    /**
     * optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     */
    public readonly channel!: pulumi.Output<string | undefined>;
    /**
     * blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
     */
    public readonly clusters!: pulumi.Output<outputs.PipelineCluster[] | undefined>;
    /**
     * An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     */
    public readonly configuration!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * A flag indicating whether to run the pipeline continuously. The default value is `false`.
     */
    public readonly continuous!: pulumi.Output<boolean | undefined>;
    /**
     * A flag indicating whether to run the pipeline in development mode. The default value is `true`.
     */
    public readonly development!: pulumi.Output<boolean | undefined>;
    /**
     * optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     */
    public readonly edition!: pulumi.Output<string | undefined>;
    public readonly filters!: pulumi.Output<outputs.PipelineFilters | undefined>;
    /**
     * blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     */
    public readonly libraries!: pulumi.Output<outputs.PipelineLibrary[] | undefined>;
    /**
     * A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A flag indicating whether to use Photon engine. The default value is `false`.
     */
    public readonly photon!: pulumi.Output<boolean | undefined>;
    /**
     * A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     */
    public readonly storage!: pulumi.Output<string | undefined>;
    /**
     * The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     */
    public readonly target!: pulumi.Output<string | undefined>;
    public /*out*/ readonly url!: pulumi.Output<string>;

    /**
     * Create a Pipeline resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PipelineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipelineArgs | PipelineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipelineState | undefined;
            resourceInputs["allowDuplicateNames"] = state ? state.allowDuplicateNames : undefined;
            resourceInputs["channel"] = state ? state.channel : undefined;
            resourceInputs["clusters"] = state ? state.clusters : undefined;
            resourceInputs["configuration"] = state ? state.configuration : undefined;
            resourceInputs["continuous"] = state ? state.continuous : undefined;
            resourceInputs["development"] = state ? state.development : undefined;
            resourceInputs["edition"] = state ? state.edition : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["libraries"] = state ? state.libraries : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["photon"] = state ? state.photon : undefined;
            resourceInputs["storage"] = state ? state.storage : undefined;
            resourceInputs["target"] = state ? state.target : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as PipelineArgs | undefined;
            resourceInputs["allowDuplicateNames"] = args ? args.allowDuplicateNames : undefined;
            resourceInputs["channel"] = args ? args.channel : undefined;
            resourceInputs["clusters"] = args ? args.clusters : undefined;
            resourceInputs["configuration"] = args ? args.configuration : undefined;
            resourceInputs["continuous"] = args ? args.continuous : undefined;
            resourceInputs["development"] = args ? args.development : undefined;
            resourceInputs["edition"] = args ? args.edition : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["libraries"] = args ? args.libraries : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["photon"] = args ? args.photon : undefined;
            resourceInputs["storage"] = args ? args.storage : undefined;
            resourceInputs["target"] = args ? args.target : undefined;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pipeline.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pipeline resources.
 */
export interface PipelineState {
    allowDuplicateNames?: pulumi.Input<boolean>;
    /**
     * optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     */
    channel?: pulumi.Input<string>;
    /**
     * blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
     */
    clusters?: pulumi.Input<pulumi.Input<inputs.PipelineCluster>[]>;
    /**
     * An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     */
    configuration?: pulumi.Input<{[key: string]: any}>;
    /**
     * A flag indicating whether to run the pipeline continuously. The default value is `false`.
     */
    continuous?: pulumi.Input<boolean>;
    /**
     * A flag indicating whether to run the pipeline in development mode. The default value is `true`.
     */
    development?: pulumi.Input<boolean>;
    /**
     * optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     */
    edition?: pulumi.Input<string>;
    filters?: pulumi.Input<inputs.PipelineFilters>;
    /**
     * blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.PipelineLibrary>[]>;
    /**
     * A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     */
    name?: pulumi.Input<string>;
    /**
     * A flag indicating whether to use Photon engine. The default value is `false`.
     */
    photon?: pulumi.Input<boolean>;
    /**
     * A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     */
    storage?: pulumi.Input<string>;
    /**
     * The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     */
    target?: pulumi.Input<string>;
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Pipeline resource.
 */
export interface PipelineArgs {
    allowDuplicateNames?: pulumi.Input<boolean>;
    /**
     * optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
     */
    channel?: pulumi.Input<string>;
    /**
     * blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
     */
    clusters?: pulumi.Input<pulumi.Input<inputs.PipelineCluster>[]>;
    /**
     * An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
     */
    configuration?: pulumi.Input<{[key: string]: any}>;
    /**
     * A flag indicating whether to run the pipeline continuously. The default value is `false`.
     */
    continuous?: pulumi.Input<boolean>;
    /**
     * A flag indicating whether to run the pipeline in development mode. The default value is `true`.
     */
    development?: pulumi.Input<boolean>;
    /**
     * optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
     */
    edition?: pulumi.Input<string>;
    filters?: pulumi.Input<inputs.PipelineFilters>;
    /**
     * blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
     */
    libraries?: pulumi.Input<pulumi.Input<inputs.PipelineLibrary>[]>;
    /**
     * A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
     */
    name?: pulumi.Input<string>;
    /**
     * A flag indicating whether to use Photon engine. The default value is `false`.
     */
    photon?: pulumi.Input<boolean>;
    /**
     * A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
     */
    storage?: pulumi.Input<string>;
    /**
     * The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
     */
    target?: pulumi.Input<string>;
}
