// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetInstancePoolPoolInfoArgs : global::Pulumi.InvokeArgs
    {
        [Input("awsAttributes")]
        public Inputs.GetInstancePoolPoolInfoAwsAttributesArgs? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Inputs.GetInstancePoolPoolInfoAzureAttributesArgs? AzureAttributes { get; set; }

        [Input("customTags")]
        private Dictionary<string, object>? _customTags;
        public Dictionary<string, object> CustomTags
        {
            get => _customTags ?? (_customTags = new Dictionary<string, object>());
            set => _customTags = value;
        }

        [Input("defaultTags", required: true)]
        private Dictionary<string, object>? _defaultTags;
        public Dictionary<string, object> DefaultTags
        {
            get => _defaultTags ?? (_defaultTags = new Dictionary<string, object>());
            set => _defaultTags = value;
        }

        [Input("diskSpec")]
        public Inputs.GetInstancePoolPoolInfoDiskSpecArgs? DiskSpec { get; set; }

        [Input("enableElasticDisk")]
        public bool? EnableElasticDisk { get; set; }

        [Input("gcpAttributes")]
        public Inputs.GetInstancePoolPoolInfoGcpAttributesArgs? GcpAttributes { get; set; }

        [Input("idleInstanceAutoterminationMinutes", required: true)]
        public int IdleInstanceAutoterminationMinutes { get; set; }

        [Input("instancePoolFleetAttributes")]
        private List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs>? _instancePoolFleetAttributes;
        public List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs> InstancePoolFleetAttributes
        {
            get => _instancePoolFleetAttributes ?? (_instancePoolFleetAttributes = new List<Inputs.GetInstancePoolPoolInfoInstancePoolFleetAttributeArgs>());
            set => _instancePoolFleetAttributes = value;
        }

        [Input("instancePoolId", required: true)]
        public string InstancePoolId { get; set; } = null!;

        [Input("instancePoolName", required: true)]
        public string InstancePoolName { get; set; } = null!;

        [Input("maxCapacity")]
        public int? MaxCapacity { get; set; }

        [Input("minIdleInstances")]
        public int? MinIdleInstances { get; set; }

        [Input("nodeTypeId")]
        public string? NodeTypeId { get; set; }

        [Input("preloadedDockerImages")]
        private List<Inputs.GetInstancePoolPoolInfoPreloadedDockerImageArgs>? _preloadedDockerImages;
        public List<Inputs.GetInstancePoolPoolInfoPreloadedDockerImageArgs> PreloadedDockerImages
        {
            get => _preloadedDockerImages ?? (_preloadedDockerImages = new List<Inputs.GetInstancePoolPoolInfoPreloadedDockerImageArgs>());
            set => _preloadedDockerImages = value;
        }

        [Input("preloadedSparkVersions")]
        private List<string>? _preloadedSparkVersions;
        public List<string> PreloadedSparkVersions
        {
            get => _preloadedSparkVersions ?? (_preloadedSparkVersions = new List<string>());
            set => _preloadedSparkVersions = value;
        }

        [Input("state")]
        public string? State { get; set; }

        [Input("stats")]
        public Inputs.GetInstancePoolPoolInfoStatsArgs? Stats { get; set; }

        public GetInstancePoolPoolInfoArgs()
        {
        }
        public static new GetInstancePoolPoolInfoArgs Empty => new GetInstancePoolPoolInfoArgs();
    }
}
