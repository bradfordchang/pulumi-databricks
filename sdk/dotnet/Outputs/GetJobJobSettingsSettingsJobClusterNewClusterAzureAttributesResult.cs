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
    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesResult
    {
        public readonly string? Availability;
        public readonly int? FirstOnDemand;
        public readonly double? SpotBidMaxPrice;

        [OutputConstructor]
        private GetJobJobSettingsSettingsJobClusterNewClusterAzureAttributesResult(
            string? availability,

            int? firstOnDemand,

            double? spotBidMaxPrice)
        {
            Availability = availability;
            FirstOnDemand = firstOnDemand;
            SpotBidMaxPrice = spotBidMaxPrice;
        }
    }
}
