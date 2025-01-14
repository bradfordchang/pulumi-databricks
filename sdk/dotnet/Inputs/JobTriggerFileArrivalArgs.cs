// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobTriggerFileArrivalArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
        /// </summary>
        [Input("minTimeBetweenTriggersSeconds")]
        public Input<int>? MinTimeBetweenTriggersSeconds { get; set; }

        /// <summary>
        /// URL of the job on the given workspace
        /// </summary>
        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        /// <summary>
        /// If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
        /// </summary>
        [Input("waitAfterLastChangeSeconds")]
        public Input<int>? WaitAfterLastChangeSeconds { get; set; }

        public JobTriggerFileArrivalArgs()
        {
        }
        public static new JobTriggerFileArrivalArgs Empty => new JobTriggerFileArrivalArgs();
    }
}
