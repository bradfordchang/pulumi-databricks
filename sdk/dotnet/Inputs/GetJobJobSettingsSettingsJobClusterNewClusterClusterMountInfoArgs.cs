// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("localMountDirPath", required: true)]
        public Input<string> LocalMountDirPath { get; set; } = null!;

        [Input("networkFilesystemInfo", required: true)]
        public Input<Inputs.GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoNetworkFilesystemInfoInputArgs> NetworkFilesystemInfo { get; set; } = null!;

        [Input("remoteMountDirPath")]
        public Input<string>? RemoteMountDirPath { get; set; }

        public GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoInputArgs()
        {
        }
        public static new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoInputArgs Empty => new GetJobJobSettingsSettingsJobClusterNewClusterClusterMountInfoInputArgs();
    }
}
