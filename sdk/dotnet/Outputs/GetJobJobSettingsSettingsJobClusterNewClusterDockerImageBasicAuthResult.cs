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
    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterDockerImageBasicAuthResult
    {
        public readonly string Password;
        public readonly string Username;

        [OutputConstructor]
        private GetJobJobSettingsSettingsJobClusterNewClusterDockerImageBasicAuthResult(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}
