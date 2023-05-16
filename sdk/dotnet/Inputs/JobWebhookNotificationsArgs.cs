// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class JobWebhookNotificationsArgs : global::Pulumi.ResourceArgs
    {
        [Input("onFailures")]
        private InputList<Inputs.JobWebhookNotificationsOnFailureArgs>? _onFailures;

        /// <summary>
        /// (List) list of notification IDs to call when the run fails. A maximum of 3 destinations can be specified.
        /// 
        /// Note that the `id` is not to be confused with the name of the alert destination. The `id` can be retrieved through the API or the URL of Databricks UI `https://&lt;workspace host&gt;/sql/destinations/&lt;notification id&gt;?o=&lt;workspace id&gt;`
        /// 
        /// Example
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// </summary>
        public InputList<Inputs.JobWebhookNotificationsOnFailureArgs> OnFailures
        {
            get => _onFailures ?? (_onFailures = new InputList<Inputs.JobWebhookNotificationsOnFailureArgs>());
            set => _onFailures = value;
        }

        [Input("onStarts")]
        private InputList<Inputs.JobWebhookNotificationsOnStartArgs>? _onStarts;

        /// <summary>
        /// (List) list of notification IDs to call when the run starts. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobWebhookNotificationsOnStartArgs> OnStarts
        {
            get => _onStarts ?? (_onStarts = new InputList<Inputs.JobWebhookNotificationsOnStartArgs>());
            set => _onStarts = value;
        }

        [Input("onSuccesses")]
        private InputList<Inputs.JobWebhookNotificationsOnSuccessArgs>? _onSuccesses;

        /// <summary>
        /// (List) list of notification IDs to call when the run completes successfully. A maximum of 3 destinations can be specified.
        /// </summary>
        public InputList<Inputs.JobWebhookNotificationsOnSuccessArgs> OnSuccesses
        {
            get => _onSuccesses ?? (_onSuccesses = new InputList<Inputs.JobWebhookNotificationsOnSuccessArgs>());
            set => _onSuccesses = value;
        }

        public JobWebhookNotificationsArgs()
        {
        }
        public static new JobWebhookNotificationsArgs Empty => new JobWebhookNotificationsArgs();
    }
}
