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
        [Input("gcpAvailability")]
        public Input<string>? GcpAvailability { get; set; }

        public InstancePoolGcpAttributesArgs()
        {
        }
        public static new InstancePoolGcpAttributesArgs Empty => new InstancePoolGcpAttributesArgs();
    }
}
