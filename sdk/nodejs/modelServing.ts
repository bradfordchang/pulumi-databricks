// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * This resource allows you to manage [Model Serving](https://docs.databricks.com/machine-learning/model-serving/index.html) endpoints in Databricks.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const _this = new databricks.ModelServing("this", {config: {
 *     servedModels: [
 *         {
 *             modelName: "ads-model",
 *             modelVersion: "2",
 *             name: "prod_model",
 *             scaleToZeroEnabled: true,
 *             workloadSize: "Small",
 *         },
 *         {
 *             modelName: "ads-model",
 *             modelVersion: "4",
 *             name: "candidate_model",
 *             scaleToZeroEnabled: false,
 *             workloadSize: "Small",
 *         },
 *     ],
 *     trafficConfig: {
 *         routes: [
 *             {
 *                 servedModelName: "prod_model",
 *                 trafficPercentage: 90,
 *             },
 *             {
 *                 servedModelName: "candidate_model",
 *                 trafficPercentage: 10,
 *             },
 *         ],
 *     },
 * }});
 * ```
 * ## Related Resources
 *
 * The following resources are often used in the same context:
 *
 * * End to end workspace management guide.
 * * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
 * * databricks.MlflowModel to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
 * * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
 * * databricks.Notebook data to export a notebook from Databricks Workspace.
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 *
 * ## Import
 *
 * The model serving resource can be imported using the name of the endpoint. bash
 *
 * ```sh
 *  $ pulumi import databricks:index/modelServing:ModelServing this <model-serving-endpoint-name>
 * ```
 */
export class ModelServing extends pulumi.CustomResource {
    /**
     * Get an existing ModelServing resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ModelServingState, opts?: pulumi.CustomResourceOptions): ModelServing {
        return new ModelServing(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/modelServing:ModelServing';

    /**
     * Returns true if the given object is an instance of ModelServing.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ModelServing {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ModelServing.__pulumiType;
    }

    /**
     * The model serving endpoint configuration.
     */
    public readonly config!: pulumi.Output<outputs.ModelServingConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a ModelServing resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ModelServingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ModelServingArgs | ModelServingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ModelServingState | undefined;
            resourceInputs["config"] = state ? state.config : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as ModelServingArgs | undefined;
            if ((!args || args.config === undefined) && !opts.urn) {
                throw new Error("Missing required property 'config'");
            }
            resourceInputs["config"] = args ? args.config : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ModelServing.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ModelServing resources.
 */
export interface ModelServingState {
    /**
     * The model serving endpoint configuration.
     */
    config?: pulumi.Input<inputs.ModelServingConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ModelServing resource.
 */
export interface ModelServingArgs {
    /**
     * The model serving endpoint configuration.
     */
    config: pulumi.Input<inputs.ModelServingConfig>;
    /**
     * The name of the model serving endpoint. This field is required and must be unique across a workspace. An endpoint name can consist of alphanumeric characters, dashes, and underscores. NOTE: Changing this name will delete the existing endpoint and create a new endpoint with the update name.
     */
    name?: pulumi.Input<string>;
}