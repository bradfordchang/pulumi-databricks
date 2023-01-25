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
    public sealed class GetInstancePoolPoolInfoStatsResult
    {
        public readonly int? IdleCount;
        public readonly int? PendingIdleCount;
        public readonly int? PendingUsedCount;
        public readonly int? UsedCount;

        [OutputConstructor]
        private GetInstancePoolPoolInfoStatsResult(
            int? idleCount,

            int? pendingIdleCount,

            int? pendingUsedCount,

            int? usedCount)
        {
            IdleCount = idleCount;
            PendingIdleCount = pendingIdleCount;
            PendingUsedCount = pendingUsedCount;
            UsedCount = usedCount;
        }
    }
}
