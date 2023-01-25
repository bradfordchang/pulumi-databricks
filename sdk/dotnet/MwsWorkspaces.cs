// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/mwsWorkspaces:MwsWorkspaces")]
    public partial class MwsWorkspaces : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// region of VPC
        /// </summary>
        [Output("awsRegion")]
        public Output<string?> AwsRegion { get; private set; } = null!;

        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Output("cloudResourceContainer")]
        public Output<Outputs.MwsWorkspacesCloudResourceContainer?> CloudResourceContainer { get; private set; } = null!;

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Output("creationTime")]
        public Output<int> CreationTime { get; private set; } = null!;

        [Output("credentialsId")]
        public Output<string?> CredentialsId { get; private set; } = null!;

        [Output("customerManagedKeyId")]
        public Output<string?> CustomerManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Output("deploymentName")]
        public Output<string?> DeploymentName { get; private set; } = null!;

        [Output("externalCustomerInfo")]
        public Output<Outputs.MwsWorkspacesExternalCustomerInfo?> ExternalCustomerInfo { get; private set; } = null!;

        [Output("gcpManagedNetworkConfig")]
        public Output<Outputs.MwsWorkspacesGcpManagedNetworkConfig?> GcpManagedNetworkConfig { get; private set; } = null!;

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Output("gkeConfig")]
        public Output<Outputs.MwsWorkspacesGkeConfig?> GkeConfig { get; private set; } = null!;

        [Output("isNoPublicIpEnabled")]
        public Output<bool?> IsNoPublicIpEnabled { get; private set; } = null!;

        /// <summary>
        /// region of the subnet
        /// </summary>
        [Output("location")]
        public Output<string?> Location { get; private set; } = null!;

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Output("managedServicesCustomerManagedKeyId")]
        public Output<string?> ManagedServicesCustomerManagedKeyId { get; private set; } = null!;

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Output("networkId")]
        public Output<string?> NetworkId { get; private set; } = null!;

        [Output("pricingTier")]
        public Output<string> PricingTier { get; private set; } = null!;

        [Output("privateAccessSettingsId")]
        public Output<string?> PrivateAccessSettingsId { get; private set; } = null!;

        /// <summary>
        /// `storage_configuration_id` from storage configuration
        /// </summary>
        [Output("storageConfigurationId")]
        public Output<string?> StorageConfigurationId { get; private set; } = null!;

        [Output("storageCustomerManagedKeyId")]
        public Output<string?> StorageCustomerManagedKeyId { get; private set; } = null!;

        [Output("token")]
        public Output<Outputs.MwsWorkspacesToken?> Token { get; private set; } = null!;

        [Output("workspaceId")]
        public Output<int> WorkspaceId { get; private set; } = null!;

        /// <summary>
        /// name of the workspace, will appear on UI
        /// </summary>
        [Output("workspaceName")]
        public Output<string> WorkspaceName { get; private set; } = null!;

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Output("workspaceStatus")]
        public Output<string> WorkspaceStatus { get; private set; } = null!;

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Output("workspaceStatusMessage")]
        public Output<string> WorkspaceStatusMessage { get; private set; } = null!;

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Output("workspaceUrl")]
        public Output<string> WorkspaceUrl { get; private set; } = null!;


        /// <summary>
        /// Create a MwsWorkspaces resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsWorkspaces(string name, MwsWorkspacesArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsWorkspaces:MwsWorkspaces", name, args ?? new MwsWorkspacesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsWorkspaces(string name, Input<string> id, MwsWorkspacesState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsWorkspaces:MwsWorkspaces", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "accountId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsWorkspaces resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsWorkspaces Get(string name, Input<string> id, MwsWorkspacesState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsWorkspaces(name, id, state, options);
        }
    }

    public sealed class MwsWorkspacesArgs : global::Pulumi.ResourceArgs
    {
        [Input("accountId", required: true)]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// region of VPC
        /// </summary>
        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Input("cloudResourceContainer")]
        public Input<Inputs.MwsWorkspacesCloudResourceContainerArgs>? CloudResourceContainer { get; set; }

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Input("deploymentName")]
        public Input<string>? DeploymentName { get; set; }

        [Input("externalCustomerInfo")]
        public Input<Inputs.MwsWorkspacesExternalCustomerInfoArgs>? ExternalCustomerInfo { get; set; }

        [Input("gcpManagedNetworkConfig")]
        public Input<Inputs.MwsWorkspacesGcpManagedNetworkConfigArgs>? GcpManagedNetworkConfig { get; set; }

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Input("gkeConfig")]
        public Input<Inputs.MwsWorkspacesGkeConfigArgs>? GkeConfig { get; set; }

        [Input("isNoPublicIpEnabled")]
        public Input<bool>? IsNoPublicIpEnabled { get; set; }

        /// <summary>
        /// region of the subnet
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Input("managedServicesCustomerManagedKeyId")]
        public Input<string>? ManagedServicesCustomerManagedKeyId { get; set; }

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("pricingTier")]
        public Input<string>? PricingTier { get; set; }

        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// `storage_configuration_id` from storage configuration
        /// </summary>
        [Input("storageConfigurationId")]
        public Input<string>? StorageConfigurationId { get; set; }

        [Input("storageCustomerManagedKeyId")]
        public Input<string>? StorageCustomerManagedKeyId { get; set; }

        [Input("token")]
        public Input<Inputs.MwsWorkspacesTokenArgs>? Token { get; set; }

        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        /// <summary>
        /// name of the workspace, will appear on UI
        /// </summary>
        [Input("workspaceName", required: true)]
        public Input<string> WorkspaceName { get; set; } = null!;

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Input("workspaceStatus")]
        public Input<string>? WorkspaceStatus { get; set; }

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Input("workspaceStatusMessage")]
        public Input<string>? WorkspaceStatusMessage { get; set; }

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Input("workspaceUrl")]
        public Input<string>? WorkspaceUrl { get; set; }

        public MwsWorkspacesArgs()
        {
        }
        public static new MwsWorkspacesArgs Empty => new MwsWorkspacesArgs();
    }

    public sealed class MwsWorkspacesState : global::Pulumi.ResourceArgs
    {
        [Input("accountId")]
        private Input<string>? _accountId;

        /// <summary>
        /// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
        /// </summary>
        public Input<string>? AccountId
        {
            get => _accountId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _accountId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// region of VPC
        /// </summary>
        [Input("awsRegion")]
        public Input<string>? AwsRegion { get; set; }

        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// A block that specifies GCP workspace configurations, consisting of following blocks:
        /// </summary>
        [Input("cloudResourceContainer")]
        public Input<Inputs.MwsWorkspacesCloudResourceContainerGetArgs>? CloudResourceContainer { get; set; }

        /// <summary>
        /// (Integer) time when workspace was created
        /// </summary>
        [Input("creationTime")]
        public Input<int>? CreationTime { get; set; }

        [Input("credentialsId")]
        public Input<string>? CredentialsId { get; set; }

        [Input("customerManagedKeyId")]
        public Input<string>? CustomerManagedKeyId { get; set; }

        /// <summary>
        /// part of URL as in `https://&lt;prefix&gt;-&lt;deployment-name&gt;.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
        /// </summary>
        [Input("deploymentName")]
        public Input<string>? DeploymentName { get; set; }

        [Input("externalCustomerInfo")]
        public Input<Inputs.MwsWorkspacesExternalCustomerInfoGetArgs>? ExternalCustomerInfo { get; set; }

        [Input("gcpManagedNetworkConfig")]
        public Input<Inputs.MwsWorkspacesGcpManagedNetworkConfigGetArgs>? GcpManagedNetworkConfig { get; set; }

        /// <summary>
        /// A block that specifies GKE configuration for the Databricks workspace:
        /// </summary>
        [Input("gkeConfig")]
        public Input<Inputs.MwsWorkspacesGkeConfigGetArgs>? GkeConfig { get; set; }

        [Input("isNoPublicIpEnabled")]
        public Input<bool>? IsNoPublicIpEnabled { get; set; }

        /// <summary>
        /// region of the subnet
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// `customer_managed_key_id` from customer managed keys with `use_cases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
        /// </summary>
        [Input("managedServicesCustomerManagedKeyId")]
        public Input<string>? ManagedServicesCustomerManagedKeyId { get; set; }

        /// <summary>
        /// `network_id` from networks.
        /// </summary>
        [Input("networkId")]
        public Input<string>? NetworkId { get; set; }

        [Input("pricingTier")]
        public Input<string>? PricingTier { get; set; }

        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// `storage_configuration_id` from storage configuration
        /// </summary>
        [Input("storageConfigurationId")]
        public Input<string>? StorageConfigurationId { get; set; }

        [Input("storageCustomerManagedKeyId")]
        public Input<string>? StorageCustomerManagedKeyId { get; set; }

        [Input("token")]
        public Input<Inputs.MwsWorkspacesTokenGetArgs>? Token { get; set; }

        [Input("workspaceId")]
        public Input<int>? WorkspaceId { get; set; }

        /// <summary>
        /// name of the workspace, will appear on UI
        /// </summary>
        [Input("workspaceName")]
        public Input<string>? WorkspaceName { get; set; }

        /// <summary>
        /// (String) workspace status
        /// </summary>
        [Input("workspaceStatus")]
        public Input<string>? WorkspaceStatus { get; set; }

        /// <summary>
        /// (String) updates on workspace status
        /// </summary>
        [Input("workspaceStatusMessage")]
        public Input<string>? WorkspaceStatusMessage { get; set; }

        /// <summary>
        /// (String) URL of the workspace
        /// </summary>
        [Input("workspaceUrl")]
        public Input<string>? WorkspaceUrl { get; set; }

        public MwsWorkspacesState()
        {
        }
        public static new MwsWorkspacesState Empty => new MwsWorkspacesState();
    }
}
