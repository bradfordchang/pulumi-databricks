// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Outputs
{

    [OutputType]
    public sealed class InstancePoolGcpAttributes
    {
        /// <summary>
        /// Availability type used for all nodes. Valid values are `PREEMPTIBLE_GCP`, `PREEMPTIBLE_WITH_FALLBACK_GCP` and `ON_DEMAND_GCP`, default: `ON_DEMAND_GCP`.
        /// </summary>
        public readonly string? GcpAvailability;
        /// <summary>
        /// Number of local SSD disks (each is 375GB in size) that will be attached to each node of the cluster.
        /// </summary>
        public readonly int? LocalSsdCount;

        [OutputConstructor]
        private InstancePoolGcpAttributes(
            string? gcpAvailability,

            int? localSsdCount)
        {
            GcpAvailability = gcpAvailability;
            LocalSsdCount = localSsdCount;
        }
    }
}
