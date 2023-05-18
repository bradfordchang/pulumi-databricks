// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobNotificationSettingsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Bool) don't send alert for cancelled runs.
        /// </summary>
        [Input("noAlertForCanceledRuns")]
        public Input<bool>? NoAlertForCanceledRuns { get; set; }

        /// <summary>
        /// (Bool) don't send alert for skipped runs. (It's recommended to use the corresponding setting in the `notification_settings` configuration block).
        /// </summary>
        [Input("noAlertForSkippedRuns")]
        public Input<bool>? NoAlertForSkippedRuns { get; set; }

        public JobNotificationSettingsArgs()
        {
        }
        public static new JobNotificationSettingsArgs Empty => new JobNotificationSettingsArgs();
    }
}