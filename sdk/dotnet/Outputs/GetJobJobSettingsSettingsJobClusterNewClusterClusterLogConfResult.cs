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
    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfResult
    {
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsResult? Dbfs;
        public readonly Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Result? S3;

        [OutputConstructor]
        private GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfResult(
            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfDbfsResult? dbfs,

            Outputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterLogConfS3Result? s3)
        {
            Dbfs = dbfs;
            S3 = s3;
        }
    }
}
