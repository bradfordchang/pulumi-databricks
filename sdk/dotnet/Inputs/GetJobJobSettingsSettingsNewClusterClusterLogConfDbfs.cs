// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsNewClusterClusterLogConfDbfsArgs : global::Pulumi.InvokeArgs
    {
        [Input("destination", required: true)]
        public string Destination { get; set; } = null!;

        public GetJobJobSettingsSettingsNewClusterClusterLogConfDbfsArgs()
        {
        }
        public static new GetJobJobSettingsSettingsNewClusterClusterLogConfDbfsArgs Empty => new GetJobJobSettingsSettingsNewClusterClusterLogConfDbfsArgs();
    }
}
