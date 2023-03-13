// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
 *
 * - `databricks.StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
 * - databricks.ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
 *
 * ## Example Usage
 *
 * For AWS
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const external = new databricks.StorageCredential("external", {
 *     awsIamRole: {
 *         roleArn: aws_iam_role.external_data_access.arn,
 *     },
 *     comment: "Managed by TF",
 * });
 * const externalCreds = new databricks.Grants("externalCreds", {
 *     storageCredential: external.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["CREATE_TABLE"],
 *     }],
 * });
 * ```
 *
 * For Azure
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const externalMi = new databricks.StorageCredential("externalMi", {
 *     azureManagedIdentity: {
 *         accessConnectorId: azurerm_databricks_access_connector.example.id,
 *     },
 *     comment: "Managed identity credential managed by TF",
 * });
 * const externalCreds = new databricks.Grants("externalCreds", {
 *     storageCredential: databricks_storage_credential.external.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["CREATE_TABLE"],
 *     }],
 * });
 * ```
 *
 * For GCP
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as databricks from "@pulumi/databricks";
 *
 * const external = new databricks.StorageCredential("external", {databricksGcpServiceAccount: {}});
 * const externalCreds = new databricks.Grants("externalCreds", {
 *     storageCredential: external.id,
 *     grants: [{
 *         principal: "Data Engineers",
 *         privileges: ["CREATE_TABLE"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * This resource can be imported by namebash
 *
 * ```sh
 *  $ pulumi import databricks:index/storageCredential:StorageCredential this <name>
 * ```
 */
export class StorageCredential extends pulumi.CustomResource {
    /**
     * Get an existing StorageCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: StorageCredentialState, opts?: pulumi.CustomResourceOptions): StorageCredential {
        return new StorageCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'databricks:index/storageCredential:StorageCredential';

    /**
     * Returns true if the given object is an instance of StorageCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is StorageCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === StorageCredential.__pulumiType;
    }

    public readonly awsIamRole!: pulumi.Output<outputs.StorageCredentialAwsIamRole | undefined>;
    public readonly azureManagedIdentity!: pulumi.Output<outputs.StorageCredentialAzureManagedIdentity | undefined>;
    public readonly azureServicePrincipal!: pulumi.Output<outputs.StorageCredentialAzureServicePrincipal | undefined>;
    public readonly comment!: pulumi.Output<string | undefined>;
    public readonly databricksGcpServiceAccount!: pulumi.Output<outputs.StorageCredentialDatabricksGcpServiceAccount>;
    public readonly gcpServiceAccountKey!: pulumi.Output<outputs.StorageCredentialGcpServiceAccountKey | undefined>;
    public readonly metastoreId!: pulumi.Output<string>;
    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Username/groupname/sp applicationId of the storage credential owner.
     */
    public readonly owner!: pulumi.Output<string>;

    /**
     * Create a StorageCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: StorageCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: StorageCredentialArgs | StorageCredentialState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as StorageCredentialState | undefined;
            resourceInputs["awsIamRole"] = state ? state.awsIamRole : undefined;
            resourceInputs["azureManagedIdentity"] = state ? state.azureManagedIdentity : undefined;
            resourceInputs["azureServicePrincipal"] = state ? state.azureServicePrincipal : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["databricksGcpServiceAccount"] = state ? state.databricksGcpServiceAccount : undefined;
            resourceInputs["gcpServiceAccountKey"] = state ? state.gcpServiceAccountKey : undefined;
            resourceInputs["metastoreId"] = state ? state.metastoreId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["owner"] = state ? state.owner : undefined;
        } else {
            const args = argsOrState as StorageCredentialArgs | undefined;
            resourceInputs["awsIamRole"] = args ? args.awsIamRole : undefined;
            resourceInputs["azureManagedIdentity"] = args ? args.azureManagedIdentity : undefined;
            resourceInputs["azureServicePrincipal"] = args ? args.azureServicePrincipal : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["databricksGcpServiceAccount"] = args ? args.databricksGcpServiceAccount : undefined;
            resourceInputs["gcpServiceAccountKey"] = args ? args.gcpServiceAccountKey : undefined;
            resourceInputs["metastoreId"] = args ? args.metastoreId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["owner"] = args ? args.owner : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(StorageCredential.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering StorageCredential resources.
 */
export interface StorageCredentialState {
    awsIamRole?: pulumi.Input<inputs.StorageCredentialAwsIamRole>;
    azureManagedIdentity?: pulumi.Input<inputs.StorageCredentialAzureManagedIdentity>;
    azureServicePrincipal?: pulumi.Input<inputs.StorageCredentialAzureServicePrincipal>;
    comment?: pulumi.Input<string>;
    databricksGcpServiceAccount?: pulumi.Input<inputs.StorageCredentialDatabricksGcpServiceAccount>;
    gcpServiceAccountKey?: pulumi.Input<inputs.StorageCredentialGcpServiceAccountKey>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the storage credential owner.
     */
    owner?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a StorageCredential resource.
 */
export interface StorageCredentialArgs {
    awsIamRole?: pulumi.Input<inputs.StorageCredentialAwsIamRole>;
    azureManagedIdentity?: pulumi.Input<inputs.StorageCredentialAzureManagedIdentity>;
    azureServicePrincipal?: pulumi.Input<inputs.StorageCredentialAzureServicePrincipal>;
    comment?: pulumi.Input<string>;
    databricksGcpServiceAccount?: pulumi.Input<inputs.StorageCredentialDatabricksGcpServiceAccount>;
    gcpServiceAccountKey?: pulumi.Input<inputs.StorageCredentialGcpServiceAccountKey>;
    metastoreId?: pulumi.Input<string>;
    /**
     * Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Username/groupname/sp applicationId of the storage credential owner.
     */
    owner?: pulumi.Input<string>;
}
