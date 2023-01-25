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
    public sealed class GetClusterClusterInfoResult
    {
        public readonly Outputs.GetClusterClusterInfoAutoscaleResult? Autoscale;
        /// <summary>
        /// Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
        /// </summary>
        public readonly int? AutoterminationMinutes;
        public readonly Outputs.GetClusterClusterInfoAwsAttributesResult? AwsAttributes;
        public readonly Outputs.GetClusterClusterInfoAzureAttributesResult? AzureAttributes;
        public readonly double? ClusterCores;
        /// <summary>
        /// The id of the cluster
        /// </summary>
        public readonly string? ClusterId;
        public readonly Outputs.GetClusterClusterInfoClusterLogConfResult? ClusterLogConf;
        public readonly Outputs.GetClusterClusterInfoClusterLogStatusResult? ClusterLogStatus;
        public readonly int? ClusterMemoryMb;
        /// <summary>
        /// The exact name of the cluster to search
        /// </summary>
        public readonly string? ClusterName;
        public readonly string? ClusterSource;
        public readonly string? CreatorUserName;
        /// <summary>
        /// Additional tags for cluster resources.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? CustomTags;
        /// <summary>
        /// Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
        /// </summary>
        public readonly string? DataSecurityMode;
        public readonly ImmutableDictionary<string, object> DefaultTags;
        public readonly Outputs.GetClusterClusterInfoDockerImageResult? DockerImage;
        public readonly Outputs.GetClusterClusterInfoDriverResult? Driver;
        /// <summary>
        /// similar to `instance_pool_id`, but for driver node.
        /// </summary>
        public readonly string DriverInstancePoolId;
        /// <summary>
        /// The node type of the Spark driver.
        /// </summary>
        public readonly string? DriverNodeTypeId;
        /// <summary>
        /// Use autoscaling local storage.
        /// </summary>
        public readonly bool? EnableElasticDisk;
        /// <summary>
        /// Enable local disk encryption.
        /// </summary>
        public readonly bool? EnableLocalDiskEncryption;
        public readonly ImmutableArray<Outputs.GetClusterClusterInfoExecutorResult> Executors;
        public readonly Outputs.GetClusterClusterInfoGcpAttributesResult? GcpAttributes;
        public readonly ImmutableArray<Outputs.GetClusterClusterInfoInitScriptResult> InitScripts;
        /// <summary>
        /// The pool of idle instances the cluster is attached to.
        /// </summary>
        public readonly string? InstancePoolId;
        public readonly int? JdbcPort;
        public readonly int? LastActivityTime;
        public readonly int? LastStateLossTime;
        /// <summary>
        /// Any supported databricks.getNodeType id.
        /// </summary>
        public readonly string? NodeTypeId;
        public readonly int? NumWorkers;
        /// <summary>
        /// Identifier of Cluster Policy to validate cluster and preset certain defaults.
        /// </summary>
        public readonly string? PolicyId;
        /// <summary>
        /// The type of runtime of the cluster
        /// </summary>
        public readonly string? RuntimeEngine;
        /// <summary>
        /// The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
        /// </summary>
        public readonly string? SingleUserName;
        /// <summary>
        /// Map with key-value pairs to fine-tune Spark clusters.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? SparkConf;
        public readonly int? SparkContextId;
        /// <summary>
        /// Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X='Y') while launching the driver and workers.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? SparkEnvVars;
        /// <summary>
        /// [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
        /// </summary>
        public readonly string SparkVersion;
        /// <summary>
        /// SSH public key contents that will be added to each Spark node in this cluster.
        /// </summary>
        public readonly ImmutableArray<string> SshPublicKeys;
        public readonly int? StartTime;
        public readonly string State;
        public readonly string? StateMessage;
        public readonly int? TerminateTime;
        public readonly Outputs.GetClusterClusterInfoTerminationReasonResult? TerminationReason;

        [OutputConstructor]
        private GetClusterClusterInfoResult(
            Outputs.GetClusterClusterInfoAutoscaleResult? autoscale,

            int? autoterminationMinutes,

            Outputs.GetClusterClusterInfoAwsAttributesResult? awsAttributes,

            Outputs.GetClusterClusterInfoAzureAttributesResult? azureAttributes,

            double? clusterCores,

            string? clusterId,

            Outputs.GetClusterClusterInfoClusterLogConfResult? clusterLogConf,

            Outputs.GetClusterClusterInfoClusterLogStatusResult? clusterLogStatus,

            int? clusterMemoryMb,

            string? clusterName,

            string? clusterSource,

            string? creatorUserName,

            ImmutableDictionary<string, object>? customTags,

            string? dataSecurityMode,

            ImmutableDictionary<string, object> defaultTags,

            Outputs.GetClusterClusterInfoDockerImageResult? dockerImage,

            Outputs.GetClusterClusterInfoDriverResult? driver,

            string driverInstancePoolId,

            string? driverNodeTypeId,

            bool? enableElasticDisk,

            bool? enableLocalDiskEncryption,

            ImmutableArray<Outputs.GetClusterClusterInfoExecutorResult> executors,

            Outputs.GetClusterClusterInfoGcpAttributesResult? gcpAttributes,

            ImmutableArray<Outputs.GetClusterClusterInfoInitScriptResult> initScripts,

            string? instancePoolId,

            int? jdbcPort,

            int? lastActivityTime,

            int? lastStateLossTime,

            string? nodeTypeId,

            int? numWorkers,

            string? policyId,

            string? runtimeEngine,

            string? singleUserName,

            ImmutableDictionary<string, object>? sparkConf,

            int? sparkContextId,

            ImmutableDictionary<string, object>? sparkEnvVars,

            string sparkVersion,

            ImmutableArray<string> sshPublicKeys,

            int? startTime,

            string state,

            string? stateMessage,

            int? terminateTime,

            Outputs.GetClusterClusterInfoTerminationReasonResult? terminationReason)
        {
            Autoscale = autoscale;
            AutoterminationMinutes = autoterminationMinutes;
            AwsAttributes = awsAttributes;
            AzureAttributes = azureAttributes;
            ClusterCores = clusterCores;
            ClusterId = clusterId;
            ClusterLogConf = clusterLogConf;
            ClusterLogStatus = clusterLogStatus;
            ClusterMemoryMb = clusterMemoryMb;
            ClusterName = clusterName;
            ClusterSource = clusterSource;
            CreatorUserName = creatorUserName;
            CustomTags = customTags;
            DataSecurityMode = dataSecurityMode;
            DefaultTags = defaultTags;
            DockerImage = dockerImage;
            Driver = driver;
            DriverInstancePoolId = driverInstancePoolId;
            DriverNodeTypeId = driverNodeTypeId;
            EnableElasticDisk = enableElasticDisk;
            EnableLocalDiskEncryption = enableLocalDiskEncryption;
            Executors = executors;
            GcpAttributes = gcpAttributes;
            InitScripts = initScripts;
            InstancePoolId = instancePoolId;
            JdbcPort = jdbcPort;
            LastActivityTime = lastActivityTime;
            LastStateLossTime = lastStateLossTime;
            NodeTypeId = nodeTypeId;
            NumWorkers = numWorkers;
            PolicyId = policyId;
            RuntimeEngine = runtimeEngine;
            SingleUserName = singleUserName;
            SparkConf = sparkConf;
            SparkContextId = sparkContextId;
            SparkEnvVars = sparkEnvVars;
            SparkVersion = sparkVersion;
            SshPublicKeys = sshPublicKeys;
            StartTime = startTime;
            State = state;
            StateMessage = stateMessage;
            TerminateTime = terminateTime;
            TerminationReason = terminationReason;
        }
    }
}
