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
    public sealed class StorageCredentialAzureServicePrincipal
    {
        /// <summary>
        /// The application ID of the application registration within the referenced AAD tenant
        /// </summary>
        public readonly string ApplicationId;
        /// <summary>
        /// The client secret generated for the above app ID in AAD. **This field is redacted on output**
        /// 
        /// `databricks_gcp_service_account` optional configuration block for creating a Databricks-managed GCP Service Account:
        /// </summary>
        public readonly string ClientSecret;
        /// <summary>
        /// The directory ID corresponding to the Azure Active Directory (AAD) tenant of the application
        /// </summary>
        public readonly string DirectoryId;

        [OutputConstructor]
        private StorageCredentialAzureServicePrincipal(
            string applicationId,

            string clientSecret,

            string directoryId)
        {
            ApplicationId = applicationId;
            ClientSecret = clientSecret;
            DirectoryId = directoryId;
        }
    }
}
