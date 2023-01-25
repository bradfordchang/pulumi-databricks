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
    public sealed class JobJobClusterNewClusterDockerImage
    {
        public readonly Outputs.JobJobClusterNewClusterDockerImageBasicAuth? BasicAuth;
        /// <summary>
        /// URL of the Git repository to use.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private JobJobClusterNewClusterDockerImage(
            Outputs.JobJobClusterNewClusterDockerImageBasicAuth? basicAuth,

            string url)
        {
            BasicAuth = basicAuth;
            Url = url;
        }
    }
}
