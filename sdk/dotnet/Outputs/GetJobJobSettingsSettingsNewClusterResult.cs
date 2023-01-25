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
    public sealed class GetJobJobSettingsSettingsNewClusterResult
    {
        public readonly bool? ApplyPolicyDefaultValues;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterAutoscaleResult? Autoscale;
        public readonly int? AutoterminationMinutes;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterAwsAttributesResult? AwsAttributes;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterAzureAttributesResult? AzureAttributes;
        public readonly string? ClusterId;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterClusterLogConfResult? ClusterLogConf;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsNewClusterClusterMountInfoResult> ClusterMountInfos;
        public readonly string? ClusterName;
        public readonly ImmutableDictionary<string, object>? CustomTags;
        public readonly string? DataSecurityMode;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterDockerImageResult? DockerImage;
        public readonly string DriverInstancePoolId;
        public readonly string DriverNodeTypeId;
        public readonly bool EnableElasticDisk;
        public readonly bool EnableLocalDiskEncryption;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterGcpAttributesResult? GcpAttributes;
        public readonly string? IdempotencyToken;
        public readonly ImmutableArray<Outputs.GetJobJobSettingsSettingsNewClusterInitScriptResult> InitScripts;
        public readonly string? InstancePoolId;
        public readonly string NodeTypeId;
        public readonly int NumWorkers;
        public readonly string? PolicyId;
        public readonly string? RuntimeEngine;
        public readonly string? SingleUserName;
        public readonly ImmutableDictionary<string, object>? SparkConf;
        public readonly ImmutableDictionary<string, object>? SparkEnvVars;
        public readonly string SparkVersion;
        public readonly ImmutableArray<string> SshPublicKeys;
        public readonly Outputs.GetJobJobSettingsSettingsNewClusterWorkloadTypeResult? WorkloadType;

        [OutputConstructor]
        private GetJobJobSettingsSettingsNewClusterResult(
            bool? applyPolicyDefaultValues,

            Outputs.GetJobJobSettingsSettingsNewClusterAutoscaleResult? autoscale,

            int? autoterminationMinutes,

            Outputs.GetJobJobSettingsSettingsNewClusterAwsAttributesResult? awsAttributes,

            Outputs.GetJobJobSettingsSettingsNewClusterAzureAttributesResult? azureAttributes,

            string? clusterId,

            Outputs.GetJobJobSettingsSettingsNewClusterClusterLogConfResult? clusterLogConf,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsNewClusterClusterMountInfoResult> clusterMountInfos,

            string? clusterName,

            ImmutableDictionary<string, object>? customTags,

            string? dataSecurityMode,

            Outputs.GetJobJobSettingsSettingsNewClusterDockerImageResult? dockerImage,

            string driverInstancePoolId,

            string driverNodeTypeId,

            bool enableElasticDisk,

            bool enableLocalDiskEncryption,

            Outputs.GetJobJobSettingsSettingsNewClusterGcpAttributesResult? gcpAttributes,

            string? idempotencyToken,

            ImmutableArray<Outputs.GetJobJobSettingsSettingsNewClusterInitScriptResult> initScripts,

            string? instancePoolId,

            string nodeTypeId,

            int numWorkers,

            string? policyId,

            string? runtimeEngine,

            string? singleUserName,

            ImmutableDictionary<string, object>? sparkConf,

            ImmutableDictionary<string, object>? sparkEnvVars,

            string sparkVersion,

            ImmutableArray<string> sshPublicKeys,

            Outputs.GetJobJobSettingsSettingsNewClusterWorkloadTypeResult? workloadType)
        {
            ApplyPolicyDefaultValues = applyPolicyDefaultValues;
            Autoscale = autoscale;
            AutoterminationMinutes = autoterminationMinutes;
            AwsAttributes = awsAttributes;
            AzureAttributes = azureAttributes;
            ClusterId = clusterId;
            ClusterLogConf = clusterLogConf;
            ClusterMountInfos = clusterMountInfos;
            ClusterName = clusterName;
            CustomTags = customTags;
            DataSecurityMode = dataSecurityMode;
            DockerImage = dockerImage;
            DriverInstancePoolId = driverInstancePoolId;
            DriverNodeTypeId = driverNodeTypeId;
            EnableElasticDisk = enableElasticDisk;
            EnableLocalDiskEncryption = enableLocalDiskEncryption;
            GcpAttributes = gcpAttributes;
            IdempotencyToken = idempotencyToken;
            InitScripts = initScripts;
            InstancePoolId = instancePoolId;
            NodeTypeId = nodeTypeId;
            NumWorkers = numWorkers;
            PolicyId = policyId;
            RuntimeEngine = runtimeEngine;
            SingleUserName = singleUserName;
            SparkConf = sparkConf;
            SparkEnvVars = sparkEnvVars;
            SparkVersion = sparkVersion;
            SshPublicKeys = sshPublicKeys;
            WorkloadType = workloadType;
        }
    }
}
