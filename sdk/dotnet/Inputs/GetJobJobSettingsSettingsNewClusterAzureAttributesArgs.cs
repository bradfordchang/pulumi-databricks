// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsNewClusterAzureAttributesInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("availability")]
        public Input<string>? Availability { get; set; }

        [Input("firstOnDemand")]
        public Input<int>? FirstOnDemand { get; set; }

        [Input("spotBidMaxPrice")]
        public Input<double>? SpotBidMaxPrice { get; set; }

        public GetJobJobSettingsSettingsNewClusterAzureAttributesInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsNewClusterAzureAttributesInputArgs Empty => new GetJobJobSettingsSettingsNewClusterAzureAttributesInputArgs();
    }
}
