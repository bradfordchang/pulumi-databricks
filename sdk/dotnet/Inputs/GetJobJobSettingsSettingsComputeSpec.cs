// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsComputeSpecArgs : global::Pulumi.InvokeArgs
    {
        [Input("kind")]
        public string? Kind { get; set; }

        public GetJobJobSettingsSettingsComputeSpecArgs()
        {
        }
        public static new GetJobJobSettingsSettingsComputeSpecArgs Empty => new GetJobJobSettingsSettingsComputeSpecArgs();
    }
}
