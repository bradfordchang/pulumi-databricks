// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsComputeSpecInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        public GetJobJobSettingsSettingsComputeSpecInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsComputeSpecInputArgs Empty => new GetJobJobSettingsSettingsComputeSpecInputArgs();
    }
}
