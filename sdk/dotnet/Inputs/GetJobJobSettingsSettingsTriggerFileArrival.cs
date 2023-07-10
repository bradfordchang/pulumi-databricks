// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTriggerFileArrivalArgs : global::Pulumi.InvokeArgs
    {
        [Input("minTimeBetweenTriggersSeconds")]
        public int? MinTimeBetweenTriggersSeconds { get; set; }

        [Input("url", required: true)]
        public string Url { get; set; } = null!;

        [Input("waitAfterLastChangeSeconds")]
        public int? WaitAfterLastChangeSeconds { get; set; }

        public GetJobJobSettingsSettingsTriggerFileArrivalArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTriggerFileArrivalArgs Empty => new GetJobJobSettingsSettingsTriggerFileArrivalArgs();
    }
}
