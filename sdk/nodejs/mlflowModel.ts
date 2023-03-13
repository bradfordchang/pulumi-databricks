// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const test = new databricks.MlflowModel("test", {
 *     description: "My MLflow model description",
 *     tags: [
 *         {
 *             key: "key1",
 *             value: "value1",
 *         },
 *         {
 *             key: "key2",
 *             value: "value2",
 *         },
 *     ],
 * });
 * ```
 * ## Access Control
 *
 * * databricks.Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.
 *
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.ModelServing to serve this model on a Databricks serving endpoint.
 * * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 *
 * ## Import
 *
 * The model resource can be imported using the name bash
 *
 * ```sh
 *  $ pulumi import databricks:index/mlflowModel:MlflowModel this <name>
 * ```
 */
export class MlflowModel extends pulumi.CustomResource {
    /**
     * Get an existing MlflowModel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MlflowModelState, opts?: pulumi.CustomResourceOptions): MlflowModel {
        return new MlflowModel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/mlflowModel:MlflowModel';

    /**
     * Returns true if the given object is an instance of MlflowModel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MlflowModel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MlflowModel.__pulumiType;
    }

    public readonly creationTimestamp!: pulumi.Output<number>;
    /**
     * The description of the MLflow model.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    public readonly lastUpdatedTimestamp!: pulumi.Output<number>;
    /**
     * Name of MLflow model. Change of name triggers new resource.
     */
    public readonly name!: pulumi.Output<string>;
    public readonly registeredModelId!: pulumi.Output<string>;
    /**
     * Tags for the MLflow model.
     */
    public readonly tags!: pulumi.Output<outputs.MlflowModelTag[] | undefined>;
    public readonly userId!: pulumi.Output<string>;

    /**
     * Create a MlflowModel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: MlflowModelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MlflowModelArgs | MlflowModelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MlflowModelState | undefined;
            resourceInputs["creationTimestamp"] = state ? state.creationTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["lastUpdatedTimestamp"] = state ? state.lastUpdatedTimestamp : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["registeredModelId"] = state ? state.registeredModelId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as MlflowModelArgs | undefined;
            resourceInputs["creationTimestamp"] = args ? args.creationTimestamp : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["lastUpdatedTimestamp"] = args ? args.lastUpdatedTimestamp : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["registeredModelId"] = args ? args.registeredModelId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["userId"] = args ? args.userId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MlflowModel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MlflowModel resources.
 */
export interface MlflowModelState {
    creationTimestamp?: pulumi.Input<number>;
    /**
     * The description of the MLflow model.
     */
    description?: pulumi.Input<string>;
    lastUpdatedTimestamp?: pulumi.Input<number>;
    /**
     * Name of MLflow model. Change of name triggers new resource.
     */
    name?: pulumi.Input<string>;
    registeredModelId?: pulumi.Input<string>;
    /**
     * Tags for the MLflow model.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.MlflowModelTag>[]>;
    userId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MlflowModel resource.
 */
export interface MlflowModelArgs {
    creationTimestamp?: pulumi.Input<number>;
    /**
     * The description of the MLflow model.
     */
    description?: pulumi.Input<string>;
    lastUpdatedTimestamp?: pulumi.Input<number>;
    /**
     * Name of MLflow model. Change of name triggers new resource.
     */
    name?: pulumi.Input<string>;
    registeredModelId?: pulumi.Input<string>;
    /**
     * Tags for the MLflow model.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.MlflowModelTag>[]>;
    userId?: pulumi.Input<string>;
}
