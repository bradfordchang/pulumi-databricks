// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class StorageCredentialAzureManagedIdentity
    {
        /// <summary>
        /// The Resource ID of the Azure Databricks Access Connector resource, of the form `/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/rg-name/providers/Microsoft.Databricks/accessConnectors/connector-name`
        /// 
        /// `azure_service_principal` optional configuration block to use service principal as credential details for Azure:
        /// </summary>
        public readonly string AccessConnectorId;

        [OutputConstructor]
        private StorageCredentialAzureManagedIdentity(string accessConnectorId)
        {
            AccessConnectorId = accessConnectorId;
        }
    }
}
