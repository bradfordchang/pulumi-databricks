// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class ClusterClusterMountInfoNetworkFilesystemInfoArgs : global::Pulumi.ResourceArgs
    {
        [Input("mountOptions")]
        public Input<string>? MountOptions { get; set; }

        [Input("serverAddress", required: true)]
        public Input<string> ServerAddress { get; set; } = null!;

        public ClusterClusterMountInfoNetworkFilesystemInfoArgs()
        {
        }
        public static new ClusterClusterMountInfoNetworkFilesystemInfoArgs Empty => new ClusterClusterMountInfoNetworkFilesystemInfoArgs();
    }
}
