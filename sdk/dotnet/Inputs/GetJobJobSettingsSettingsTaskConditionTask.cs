// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskConditionTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("left")]
        public string? Left { get; set; }

        [Input("op")]
        public string? Op { get; set; }

        [Input("right")]
        public string? Right { get; set; }

        public GetJobJobSettingsSettingsTaskConditionTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskConditionTaskArgs Empty => new GetJobJobSettingsSettingsTaskConditionTaskArgs();
    }
}
