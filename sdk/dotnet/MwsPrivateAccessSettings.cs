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
    [DatabricksResourceType("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings")]
    public partial class MwsPrivateAccessSettings : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
        /// </summary>
        [Output("allowedVpcEndpointIds")]
        public Output<ImmutableArray<string>> AllowedVpcEndpointIds { get; private set; } = null!;

        /// <summary>
        /// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
        /// </summary>
        [Output("privateAccessLevel")]
        public Output<string?> PrivateAccessLevel { get; private set; } = null!;

        /// <summary>
        /// Canonical unique identifier of Private Access Settings in Databricks Account
        /// </summary>
        [Output("privateAccessSettingsId")]
        public Output<string> PrivateAccessSettingsId { get; private set; } = null!;

        /// <summary>
        /// Name of Private Access Settings in Databricks Account
        /// </summary>
        [Output("privateAccessSettingsName")]
        public Output<string> PrivateAccessSettingsName { get; private set; } = null!;

        /// <summary>
        /// If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network.
        /// </summary>
        [Output("publicAccessEnabled")]
        public Output<bool?> PublicAccessEnabled { get; private set; } = null!;

        /// <summary>
        /// Region of AWS VPC or the Google Cloud VPC network
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// (AWS only) Status of Private Access Settings
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a MwsPrivateAccessSettings resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MwsPrivateAccessSettings(string name, MwsPrivateAccessSettingsArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, args ?? new MwsPrivateAccessSettingsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MwsPrivateAccessSettings(string name, Input<string> id, MwsPrivateAccessSettingsState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing MwsPrivateAccessSettings resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MwsPrivateAccessSettings Get(string name, Input<string> id, MwsPrivateAccessSettingsState? state = null, CustomResourceOptions? options = null)
        {
            return new MwsPrivateAccessSettings(name, id, state, options);
        }
    }

    public sealed class MwsPrivateAccessSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("allowedVpcEndpointIds")]
        private InputList<string>? _allowedVpcEndpointIds;

        /// <summary>
        /// An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
        /// </summary>
        public InputList<string> AllowedVpcEndpointIds
        {
            get => _allowedVpcEndpointIds ?? (_allowedVpcEndpointIds = new InputList<string>());
            set => _allowedVpcEndpointIds = value;
        }

        /// <summary>
        /// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
        /// </summary>
        [Input("privateAccessLevel")]
        public Input<string>? PrivateAccessLevel { get; set; }

        /// <summary>
        /// Canonical unique identifier of Private Access Settings in Databricks Account
        /// </summary>
        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// Name of Private Access Settings in Databricks Account
        /// </summary>
        [Input("privateAccessSettingsName", required: true)]
        public Input<string> PrivateAccessSettingsName { get; set; } = null!;

        /// <summary>
        /// If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network.
        /// </summary>
        [Input("publicAccessEnabled")]
        public Input<bool>? PublicAccessEnabled { get; set; }

        /// <summary>
        /// Region of AWS VPC or the Google Cloud VPC network
        /// </summary>
        [Input("region", required: true)]
        public Input<string> Region { get; set; } = null!;

        /// <summary>
        /// (AWS only) Status of Private Access Settings
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public MwsPrivateAccessSettingsArgs()
        {
        }
        public static new MwsPrivateAccessSettingsArgs Empty => new MwsPrivateAccessSettingsArgs();
    }

    public sealed class MwsPrivateAccessSettingsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Account Id that could be found in the Accounts Console for [AWS](https://accounts.cloud.databricks.com/) or [GCP](https://accounts.gcp.databricks.com/)
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        [Input("allowedVpcEndpointIds")]
        private InputList<string>? _allowedVpcEndpointIds;

        /// <summary>
        /// An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
        /// </summary>
        public InputList<string> AllowedVpcEndpointIds
        {
            get => _allowedVpcEndpointIds ?? (_allowedVpcEndpointIds = new InputList<string>());
            set => _allowedVpcEndpointIds = value;
        }

        /// <summary>
        /// The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
        /// </summary>
        [Input("privateAccessLevel")]
        public Input<string>? PrivateAccessLevel { get; set; }

        /// <summary>
        /// Canonical unique identifier of Private Access Settings in Databricks Account
        /// </summary>
        [Input("privateAccessSettingsId")]
        public Input<string>? PrivateAccessSettingsId { get; set; }

        /// <summary>
        /// Name of Private Access Settings in Databricks Account
        /// </summary>
        [Input("privateAccessSettingsName")]
        public Input<string>? PrivateAccessSettingsName { get; set; }

        /// <summary>
        /// If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false`, the workspace can be accessed only over VPC endpoints, and not over the public network.
        /// </summary>
        [Input("publicAccessEnabled")]
        public Input<bool>? PublicAccessEnabled { get; set; }

        /// <summary>
        /// Region of AWS VPC or the Google Cloud VPC network
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// (AWS only) Status of Private Access Settings
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public MwsPrivateAccessSettingsState()
        {
        }
        public static new MwsPrivateAccessSettingsState Empty => new MwsPrivateAccessSettingsState();
    }
}
