// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class InstancePoolGcpAttributesArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
        /// </summary>
        [Input("gcpAvailability")]
        public Input<string>? GcpAvailability { get; set; }

        /// <summary>
        /// Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
        /// </summary>
        [Input("localSsdCount")]
        public Input<int>? LocalSsdCount { get; set; }

        public InstancePoolGcpAttributesArgs()
        {
        }
        public static new InstancePoolGcpAttributesArgs Empty => new InstancePoolGcpAttributesArgs();
    }
}
