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
    public sealed class GetJobJobSettingsSettingsTaskNewClusterClusterLogConfResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsTaskNewClusterClusterLogConfDbfsResult? Dbfs;
        public readonly Outputs.GetJobJobSettingsSettingsTaskNewClusterClusterLogConfS3Result? S3;

        [OutputConstructor]
        private GetJobJobSettingsSettingsTaskNewClusterClusterLogConfResult(
            Outputs.GetJobJobSettingsSettingsTaskNewClusterClusterLogConfDbfsResult? dbfs,

            Outputs.GetJobJobSettingsSettingsTaskNewClusterClusterLogConfS3Result? s3)
        {
            Dbfs = dbfs;
            S3 = s3;
        }
    }
}
