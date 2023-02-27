// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetShareObjectPartitionValueInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the share
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        [Input("recipientPropertyKey")]
        public Input<string>? RecipientPropertyKey { get; set; }

        [Input("value")]
        public Input<string>? Value { get; set; }

        public GetShareObjectPartitionValueInputArgs()
        {
        }
        public static new GetShareObjectPartitionValueInputArgs Empty => new GetShareObjectPartitionValueInputArgs();
    }
}
