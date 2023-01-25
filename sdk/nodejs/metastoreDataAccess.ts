// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Each databricks.Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `databricks.MetastoreDataAccess` defines this
 *
 * ## Import
 *
 * -> **Note** Importing this resource is not currently supported.
 */
export class MetastoreDataAccess extends pulumi.CustomResource {
    /**
     * Get an existing MetastoreDataAccess resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MetastoreDataAccessState, opts?: pulumi.CustomResourceOptions): MetastoreDataAccess {
        return new MetastoreDataAccess(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/metastoreDataAccess:MetastoreDataAccess';

    /**
     * Returns true if the given object is an instance of MetastoreDataAccess.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is MetastoreDataAccess {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === MetastoreDataAccess.__pulumiType;
    }

    public readonly awsIamRole!: pulumi.Output<outputs.MetastoreDataAccessAwsIamRole | undefined>;
    public readonly azureManagedIdentity!: pulumi.Output<outputs.MetastoreDataAccessAzureManagedIdentity | undefined>;
    public readonly azureServicePrincipal!: pulumi.Output<outputs.MetastoreDataAccessAzureServicePrincipal | undefined>;
    public readonly configurationType!: pulumi.Output<string>;
    public readonly gcpServiceAccountKey!: pulumi.Output<outputs.MetastoreDataAccessGcpServiceAccountKey | undefined>;
    public readonly isDefault!: pulumi.Output<boolean | undefined>;
    /**
     * Unique identifier of the parent Metastore
     */
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a MetastoreDataAccess resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MetastoreDataAccessArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MetastoreDataAccessArgs | MetastoreDataAccessState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MetastoreDataAccessState | undefined;
            resourceInputs["awsIamRole"] = state ? state.awsIamRole : undefined;
            resourceInputs["azureManagedIdentity"] = state ? state.azureManagedIdentity : undefined;
            resourceInputs["azureServicePrincipal"] = state ? state.azureServicePrincipal : undefined;
            resourceInputs["configurationType"] = state ? state.configurationType : undefined;
            resourceInputs["gcpServiceAccountKey"] = state ? state.gcpServiceAccountKey : undefined;
            resourceInputs["isDefault"] = state ? state.isDefault : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as MetastoreDataAccessArgs | undefined;
            if ((!args || args.metastoreId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'metastoreId'");
            }
            resourceInputs["awsIamRole"] = args ? args.awsIamRole : undefined;
            resourceInputs["azureManagedIdentity"] = args ? args.azureManagedIdentity : undefined;
            resourceInputs["azureServicePrincipal"] = args ? args.azureServicePrincipal : undefined;
            resourceInputs["configurationType"] = args ? args.configurationType : undefined;
            resourceInputs["gcpServiceAccountKey"] = args ? args.gcpServiceAccountKey : undefined;
            resourceInputs["isDefault"] = args ? args.isDefault : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(MetastoreDataAccess.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering MetastoreDataAccess resources.
 */
export interface MetastoreDataAccessState {
    awsIamRole?: pulumi.Input<inputs.MetastoreDataAccessAwsIamRole>;
    azureManagedIdentity?: pulumi.Input<inputs.MetastoreDataAccessAzureManagedIdentity>;
    azureServicePrincipal?: pulumi.Input<inputs.MetastoreDataAccessAzureServicePrincipal>;
    configurationType?: pulumi.Input<string>;
    gcpServiceAccountKey?: pulumi.Input<inputs.MetastoreDataAccessGcpServiceAccountKey>;
    isDefault?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the parent Metastore
     */
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a MetastoreDataAccess resource.
 */
export interface MetastoreDataAccessArgs {
    awsIamRole?: pulumi.Input<inputs.MetastoreDataAccessAwsIamRole>;
    azureManagedIdentity?: pulumi.Input<inputs.MetastoreDataAccessAzureManagedIdentity>;
    azureServicePrincipal?: pulumi.Input<inputs.MetastoreDataAccessAzureServicePrincipal>;
    configurationType?: pulumi.Input<string>;
    gcpServiceAccountKey?: pulumi.Input<inputs.MetastoreDataAccessGcpServiceAccountKey>;
    isDefault?: pulumi.Input<boolean>;
    /**
     * Unique identifier of the parent Metastore
     */
    metastoreId: pulumi.Input<string>;
    /**
     * Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
}
