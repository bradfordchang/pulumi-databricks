// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobWebhookNotificationsOnFailureGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the system notification that is notified when an event defined in `webhook_notifications` is triggered.
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        public JobWebhookNotificationsOnFailureGetArgs()
        {
        }
        public static new JobWebhookNotificationsOnFailureGetArgs Empty => new JobWebhookNotificationsOnFailureGetArgs();
    }
}
