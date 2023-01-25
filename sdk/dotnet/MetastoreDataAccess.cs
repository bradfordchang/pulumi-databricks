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
    /// Each databricks.Metastore requires an IAM role that will be assumed by Unity Catalog to access data. `databricks.MetastoreDataAccess` defines this
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/metastoreDataAccess:MetastoreDataAccess")]
    public partial class MetastoreDataAccess : global::Pulumi.CustomResource
    {
        [Output("awsIamRole")]
        public Output<Outputs.MetastoreDataAccessAwsIamRole?> AwsIamRole { get; private set; } = null!;

        [Output("azureManagedIdentity")]
        public Output<Outputs.MetastoreDataAccessAzureManagedIdentity?> AzureManagedIdentity { get; private set; } = null!;

        [Output("azureServicePrincipal")]
        public Output<Outputs.MetastoreDataAccessAzureServicePrincipal?> AzureServicePrincipal { get; private set; } = null!;

        [Output("configurationType")]
        public Output<string> ConfigurationType { get; private set; } = null!;

        [Output("gcpServiceAccountKey")]
        public Output<Outputs.MetastoreDataAccessGcpServiceAccountKey?> GcpServiceAccountKey { get; private set; } = null!;

        [Output("isDefault")]
        public Output<bool?> IsDefault { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Output("metastoreId")]
        public Output<string> MetastoreId { get; private set; } = null!;

        /// <summary>
        /// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a MetastoreDataAccess resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MetastoreDataAccess(string name, MetastoreDataAccessArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, args ?? new MetastoreDataAccessArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MetastoreDataAccess(string name, Input<string> id, MetastoreDataAccessState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/metastoreDataAccess:MetastoreDataAccess", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MetastoreDataAccess resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MetastoreDataAccess Get(string name, Input<string> id, MetastoreDataAccessState? state = null, CustomResourceOptions? options = null)
        {
            return new MetastoreDataAccess(name, id, state, options);
        }
    }

    public sealed class MetastoreDataAccessArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.MetastoreDataAccessAwsIamRoleArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.MetastoreDataAccessAzureManagedIdentityArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.MetastoreDataAccessAzureServicePrincipalArgs>? AzureServicePrincipal { get; set; }

        [Input("configurationType")]
        public Input<string>? ConfigurationType { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.MetastoreDataAccessGcpServiceAccountKeyArgs>? GcpServiceAccountKey { get; set; }

        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Input("metastoreId", required: true)]
        public Input<string> MetastoreId { get; set; } = null!;

        /// <summary>
        /// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public MetastoreDataAccessArgs()
        {
        }
        public static new MetastoreDataAccessArgs Empty => new MetastoreDataAccessArgs();
    }

    public sealed class MetastoreDataAccessState : global::Pulumi.ResourceArgs
    {
        [Input("awsIamRole")]
        public Input<Inputs.MetastoreDataAccessAwsIamRoleGetArgs>? AwsIamRole { get; set; }

        [Input("azureManagedIdentity")]
        public Input<Inputs.MetastoreDataAccessAzureManagedIdentityGetArgs>? AzureManagedIdentity { get; set; }

        [Input("azureServicePrincipal")]
        public Input<Inputs.MetastoreDataAccessAzureServicePrincipalGetArgs>? AzureServicePrincipal { get; set; }

        [Input("configurationType")]
        public Input<string>? ConfigurationType { get; set; }

        [Input("gcpServiceAccountKey")]
        public Input<Inputs.MetastoreDataAccessGcpServiceAccountKeyGetArgs>? GcpServiceAccountKey { get; set; }

        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Unique identifier of the parent Metastore
        /// </summary>
        [Input("metastoreId")]
        public Input<string>? MetastoreId { get; set; }

        /// <summary>
        /// Name of Data Access Configuration, which must be unique within the databricks_metastore. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public MetastoreDataAccessState()
        {
        }
        public static new MetastoreDataAccessState Empty => new MetastoreDataAccessState();
    }
}
