// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskHealthRuleArgs : global::Pulumi.InvokeArgs
    {
        [Input("metric")]
        public string? Metric { get; set; }

        [Input("op")]
        public string? Op { get; set; }

        [Input("value")]
        public int? Value { get; set; }

        public GetJobJobSettingsSettingsTaskHealthRuleArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskHealthRuleArgs Empty => new GetJobJobSettingsSettingsTaskHealthRuleArgs();
    }
}
