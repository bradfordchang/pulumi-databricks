// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class MetastoreDataAccessAzureManagedIdentityArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
        /// 
        /// `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
        /// </summary>
        [Input("accessConnectorId", required: true)]
        public Input<string> AccessConnectorId { get; set; } = null!;

        public MetastoreDataAccessAzureManagedIdentityArgs()
        {
        }
        public static new MetastoreDataAccessAzureManagedIdentityArgs Empty => new MetastoreDataAccessAzureManagedIdentityArgs();
    }
}
