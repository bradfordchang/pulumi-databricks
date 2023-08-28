// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskRunJobTaskArgs : global::Pulumi.InvokeArgs
    {
        [Input("jobId", required: true)]
        public int JobId { get; set; }

        [Input("jobParameters")]
        private Dictionary<string, object>? _jobParameters;
        public Dictionary<string, object> JobParameters
        {
            get => _jobParameters ?? (_jobParameters = new Dictionary<string, object>());
            set => _jobParameters = value;
        }

        public GetJobJobSettingsSettingsTaskRunJobTaskArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskRunJobTaskArgs Empty => new GetJobJobSettingsSettingsTaskRunJobTaskArgs();
    }
}
