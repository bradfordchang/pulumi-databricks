// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class GetJobJobSettingsSettingsNewClusterArgs : global::Pulumi.InvokeArgs
    {
        [Input("applyPolicyDefaultValues")]
        public bool? ApplyPolicyDefaultValues { get; set; }

        [Input("autoscale")]
        public Inputs.GetJobJobSettingsSettingsNewClusterAutoscaleArgs? Autoscale { get; set; }

        [Input("autoterminationMinutes")]
        public int? AutoterminationMinutes { get; set; }

        [Input("awsAttributes")]
        public Inputs.GetJobJobSettingsSettingsNewClusterAwsAttributesArgs? AwsAttributes { get; set; }

        [Input("azureAttributes")]
        public Inputs.GetJobJobSettingsSettingsNewClusterAzureAttributesArgs? AzureAttributes { get; set; }

        [Input("clusterId")]
        public string? ClusterId { get; set; }

        [Input("clusterLogConf")]
        public Inputs.GetJobJobSettingsSettingsNewClusterClusterLogConfArgs? ClusterLogConf { get; set; }

        [Input("clusterMountInfos")]
        private List<Inputs.GetJobJobSettingsSettingsNewClusterClusterMountInfoArgs>? _clusterMountInfos;
        public List<Inputs.GetJobJobSettingsSettingsNewClusterClusterMountInfoArgs> ClusterMountInfos
        {
            get => _clusterMountInfos ?? (_clusterMountInfos = new List<Inputs.GetJobJobSettingsSettingsNewClusterClusterMountInfoArgs>());
            set => _clusterMountInfos = value;
        }

        [Input("clusterName")]
        public string? ClusterName { get; set; }

        [Input("customTags")]
        private Dictionary<string, object>? _customTags;
        public Dictionary<string, object> CustomTags
        {
            get => _customTags ?? (_customTags = new Dictionary<string, object>());
            set => _customTags = value;
        }

        [Input("dataSecurityMode")]
        public string? DataSecurityMode { get; set; }

        [Input("dockerImage")]
        public Inputs.GetJobJobSettingsSettingsNewClusterDockerImageArgs? DockerImage { get; set; }

        [Input("driverInstancePoolId", required: true)]
        public string DriverInstancePoolId { get; set; } = null!;

        [Input("driverNodeTypeId", required: true)]
        public string DriverNodeTypeId { get; set; } = null!;

        [Input("enableElasticDisk", required: true)]
        public bool EnableElasticDisk { get; set; }

        [Input("enableLocalDiskEncryption", required: true)]
        public bool EnableLocalDiskEncryption { get; set; }

        [Input("gcpAttributes")]
        public Inputs.GetJobJobSettingsSettingsNewClusterGcpAttributesArgs? GcpAttributes { get; set; }

        [Input("idempotencyToken")]
        public string? IdempotencyToken { get; set; }

        [Input("initScripts")]
        private List<Inputs.GetJobJobSettingsSettingsNewClusterInitScriptArgs>? _initScripts;
        public List<Inputs.GetJobJobSettingsSettingsNewClusterInitScriptArgs> InitScripts
        {
            get => _initScripts ?? (_initScripts = new List<Inputs.GetJobJobSettingsSettingsNewClusterInitScriptArgs>());
            set => _initScripts = value;
        }

        [Input("instancePoolId")]
        public string? InstancePoolId { get; set; }

        [Input("nodeTypeId", required: true)]
        public string NodeTypeId { get; set; } = null!;

        [Input("numWorkers", required: true)]
        public int NumWorkers { get; set; }

        [Input("policyId")]
        public string? PolicyId { get; set; }

        [Input("runtimeEngine")]
        public string? RuntimeEngine { get; set; }

        [Input("singleUserName")]
        public string? SingleUserName { get; set; }

        [Input("sparkConf")]
        private Dictionary<string, object>? _sparkConf;
        public Dictionary<string, object> SparkConf
        {
            get => _sparkConf ?? (_sparkConf = new Dictionary<string, object>());
            set => _sparkConf = value;
        }

        [Input("sparkEnvVars")]
        private Dictionary<string, object>? _sparkEnvVars;
        public Dictionary<string, object> SparkEnvVars
        {
            get => _sparkEnvVars ?? (_sparkEnvVars = new Dictionary<string, object>());
            set => _sparkEnvVars = value;
        }

        [Input("sparkVersion", required: true)]
        public string SparkVersion { get; set; } = null!;

        [Input("sshPublicKeys")]
        private List<string>? _sshPublicKeys;
        public List<string> SshPublicKeys
        {
            get => _sshPublicKeys ?? (_sshPublicKeys = new List<string>());
            set => _sshPublicKeys = value;
        }

        [Input("workloadType")]
        public Inputs.GetJobJobSettingsSettingsNewClusterWorkloadTypeArgs? WorkloadType { get; set; }

        public GetJobJobSettingsSettingsNewClusterArgs()
        {
        }
        public static new GetJobJobSettingsSettingsNewClusterArgs Empty => new GetJobJobSettingsSettingsNewClusterArgs();
    }
}
