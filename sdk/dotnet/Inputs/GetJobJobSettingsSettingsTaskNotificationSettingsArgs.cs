// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsTaskNotificationSettingsInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("alertOnLastAttempt")]
        public Input<bool>? AlertOnLastAttempt { get; set; }

        [Input("noAlertForCanceledRuns")]
        public Input<bool>? NoAlertForCanceledRuns { get; set; }

        [Input("noAlertForSkippedRuns")]
        public Input<bool>? NoAlertForSkippedRuns { get; set; }

        public GetJobJobSettingsSettingsTaskNotificationSettingsInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsTaskNotificationSettingsInputArgs Empty => new GetJobJobSettingsSettingsTaskNotificationSettingsInputArgs();
    }
}
