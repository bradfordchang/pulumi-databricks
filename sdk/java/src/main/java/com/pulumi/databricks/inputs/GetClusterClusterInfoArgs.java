// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetClusterClusterInfoAutoscaleArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoAwsAttributesArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoAzureAttributesArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoClusterLogConfArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoClusterLogStatusArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoDockerImageArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoDriverArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoExecutorArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoGcpAttributesArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoInitScriptArgs;
import com.pulumi.databricks.inputs.GetClusterClusterInfoTerminationReasonArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterClusterInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetClusterClusterInfoArgs Empty = new GetClusterClusterInfoArgs();

    @Import(name="autoscale")
    private @Nullable Output<GetClusterClusterInfoAutoscaleArgs> autoscale;

    public Optional<Output<GetClusterClusterInfoAutoscaleArgs>> autoscale() {
        return Optional.ofNullable(this.autoscale);
    }

    /**
     * Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
     * 
     */
    @Import(name="autoterminationMinutes")
    private @Nullable Output<Integer> autoterminationMinutes;

    /**
     * @return Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
     * 
     */
    public Optional<Output<Integer>> autoterminationMinutes() {
        return Optional.ofNullable(this.autoterminationMinutes);
    }

    @Import(name="awsAttributes")
    private @Nullable Output<GetClusterClusterInfoAwsAttributesArgs> awsAttributes;

    public Optional<Output<GetClusterClusterInfoAwsAttributesArgs>> awsAttributes() {
        return Optional.ofNullable(this.awsAttributes);
    }

    @Import(name="azureAttributes")
    private @Nullable Output<GetClusterClusterInfoAzureAttributesArgs> azureAttributes;

    public Optional<Output<GetClusterClusterInfoAzureAttributesArgs>> azureAttributes() {
        return Optional.ofNullable(this.azureAttributes);
    }

    @Import(name="clusterCores")
    private @Nullable Output<Double> clusterCores;

    public Optional<Output<Double>> clusterCores() {
        return Optional.ofNullable(this.clusterCores);
    }

    /**
     * The id of the cluster
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return The id of the cluster
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    @Import(name="clusterLogConf")
    private @Nullable Output<GetClusterClusterInfoClusterLogConfArgs> clusterLogConf;

    public Optional<Output<GetClusterClusterInfoClusterLogConfArgs>> clusterLogConf() {
        return Optional.ofNullable(this.clusterLogConf);
    }

    @Import(name="clusterLogStatus")
    private @Nullable Output<GetClusterClusterInfoClusterLogStatusArgs> clusterLogStatus;

    public Optional<Output<GetClusterClusterInfoClusterLogStatusArgs>> clusterLogStatus() {
        return Optional.ofNullable(this.clusterLogStatus);
    }

    @Import(name="clusterMemoryMb")
    private @Nullable Output<Integer> clusterMemoryMb;

    public Optional<Output<Integer>> clusterMemoryMb() {
        return Optional.ofNullable(this.clusterMemoryMb);
    }

    /**
     * The exact name of the cluster to search
     * 
     */
    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    /**
     * @return The exact name of the cluster to search
     * 
     */
    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="clusterSource")
    private @Nullable Output<String> clusterSource;

    public Optional<Output<String>> clusterSource() {
        return Optional.ofNullable(this.clusterSource);
    }

    @Import(name="creatorUserName")
    private @Nullable Output<String> creatorUserName;

    public Optional<Output<String>> creatorUserName() {
        return Optional.ofNullable(this.creatorUserName);
    }

    /**
     * Additional tags for cluster resources.
     * 
     */
    @Import(name="customTags")
    private @Nullable Output<Map<String,Object>> customTags;

    /**
     * @return Additional tags for cluster resources.
     * 
     */
    public Optional<Output<Map<String,Object>>> customTags() {
        return Optional.ofNullable(this.customTags);
    }

    /**
     * Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    @Import(name="dataSecurityMode")
    private @Nullable Output<String> dataSecurityMode;

    /**
     * @return Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    public Optional<Output<String>> dataSecurityMode() {
        return Optional.ofNullable(this.dataSecurityMode);
    }

    @Import(name="defaultTags", required=true)
    private Output<Map<String,Object>> defaultTags;

    public Output<Map<String,Object>> defaultTags() {
        return this.defaultTags;
    }

    @Import(name="dockerImage")
    private @Nullable Output<GetClusterClusterInfoDockerImageArgs> dockerImage;

    public Optional<Output<GetClusterClusterInfoDockerImageArgs>> dockerImage() {
        return Optional.ofNullable(this.dockerImage);
    }

    @Import(name="driver")
    private @Nullable Output<GetClusterClusterInfoDriverArgs> driver;

    public Optional<Output<GetClusterClusterInfoDriverArgs>> driver() {
        return Optional.ofNullable(this.driver);
    }

    /**
     * similar to `instance_pool_id`, but for driver node.
     * 
     */
    @Import(name="driverInstancePoolId", required=true)
    private Output<String> driverInstancePoolId;

    /**
     * @return similar to `instance_pool_id`, but for driver node.
     * 
     */
    public Output<String> driverInstancePoolId() {
        return this.driverInstancePoolId;
    }

    /**
     * The node type of the Spark driver.
     * 
     */
    @Import(name="driverNodeTypeId")
    private @Nullable Output<String> driverNodeTypeId;

    /**
     * @return The node type of the Spark driver.
     * 
     */
    public Optional<Output<String>> driverNodeTypeId() {
        return Optional.ofNullable(this.driverNodeTypeId);
    }

    /**
     * Use autoscaling local storage.
     * 
     */
    @Import(name="enableElasticDisk")
    private @Nullable Output<Boolean> enableElasticDisk;

    /**
     * @return Use autoscaling local storage.
     * 
     */
    public Optional<Output<Boolean>> enableElasticDisk() {
        return Optional.ofNullable(this.enableElasticDisk);
    }

    /**
     * Enable local disk encryption.
     * 
     */
    @Import(name="enableLocalDiskEncryption")
    private @Nullable Output<Boolean> enableLocalDiskEncryption;

    /**
     * @return Enable local disk encryption.
     * 
     */
    public Optional<Output<Boolean>> enableLocalDiskEncryption() {
        return Optional.ofNullable(this.enableLocalDiskEncryption);
    }

    @Import(name="executors")
    private @Nullable Output<List<GetClusterClusterInfoExecutorArgs>> executors;

    public Optional<Output<List<GetClusterClusterInfoExecutorArgs>>> executors() {
        return Optional.ofNullable(this.executors);
    }

    @Import(name="gcpAttributes")
    private @Nullable Output<GetClusterClusterInfoGcpAttributesArgs> gcpAttributes;

    public Optional<Output<GetClusterClusterInfoGcpAttributesArgs>> gcpAttributes() {
        return Optional.ofNullable(this.gcpAttributes);
    }

    @Import(name="initScripts")
    private @Nullable Output<List<GetClusterClusterInfoInitScriptArgs>> initScripts;

    public Optional<Output<List<GetClusterClusterInfoInitScriptArgs>>> initScripts() {
        return Optional.ofNullable(this.initScripts);
    }

    /**
     * The pool of idle instances the cluster is attached to.
     * 
     */
    @Import(name="instancePoolId")
    private @Nullable Output<String> instancePoolId;

    /**
     * @return The pool of idle instances the cluster is attached to.
     * 
     */
    public Optional<Output<String>> instancePoolId() {
        return Optional.ofNullable(this.instancePoolId);
    }

    @Import(name="jdbcPort")
    private @Nullable Output<Integer> jdbcPort;

    public Optional<Output<Integer>> jdbcPort() {
        return Optional.ofNullable(this.jdbcPort);
    }

    @Import(name="lastActivityTime")
    private @Nullable Output<Integer> lastActivityTime;

    public Optional<Output<Integer>> lastActivityTime() {
        return Optional.ofNullable(this.lastActivityTime);
    }

    @Import(name="lastStateLossTime")
    private @Nullable Output<Integer> lastStateLossTime;

    public Optional<Output<Integer>> lastStateLossTime() {
        return Optional.ofNullable(this.lastStateLossTime);
    }

    /**
     * Any supported databricks.getNodeType id.
     * 
     */
    @Import(name="nodeTypeId")
    private @Nullable Output<String> nodeTypeId;

    /**
     * @return Any supported databricks.getNodeType id.
     * 
     */
    public Optional<Output<String>> nodeTypeId() {
        return Optional.ofNullable(this.nodeTypeId);
    }

    @Import(name="numWorkers")
    private @Nullable Output<Integer> numWorkers;

    public Optional<Output<Integer>> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }

    /**
     * Identifier of Cluster Policy to validate cluster and preset certain defaults.
     * 
     */
    @Import(name="policyId")
    private @Nullable Output<String> policyId;

    /**
     * @return Identifier of Cluster Policy to validate cluster and preset certain defaults.
     * 
     */
    public Optional<Output<String>> policyId() {
        return Optional.ofNullable(this.policyId);
    }

    /**
     * The type of runtime of the cluster
     * 
     */
    @Import(name="runtimeEngine")
    private @Nullable Output<String> runtimeEngine;

    /**
     * @return The type of runtime of the cluster
     * 
     */
    public Optional<Output<String>> runtimeEngine() {
        return Optional.ofNullable(this.runtimeEngine);
    }

    /**
     * The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    @Import(name="singleUserName")
    private @Nullable Output<String> singleUserName;

    /**
     * @return The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    public Optional<Output<String>> singleUserName() {
        return Optional.ofNullable(this.singleUserName);
    }

    /**
     * Map with key-value pairs to fine-tune Spark clusters.
     * 
     */
    @Import(name="sparkConf")
    private @Nullable Output<Map<String,Object>> sparkConf;

    /**
     * @return Map with key-value pairs to fine-tune Spark clusters.
     * 
     */
    public Optional<Output<Map<String,Object>>> sparkConf() {
        return Optional.ofNullable(this.sparkConf);
    }

    @Import(name="sparkContextId")
    private @Nullable Output<Integer> sparkContextId;

    public Optional<Output<Integer>> sparkContextId() {
        return Optional.ofNullable(this.sparkContextId);
    }

    /**
     * Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    @Import(name="sparkEnvVars")
    private @Nullable Output<Map<String,Object>> sparkEnvVars;

    /**
     * @return Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    public Optional<Output<Map<String,Object>>> sparkEnvVars() {
        return Optional.ofNullable(this.sparkEnvVars);
    }

    /**
     * [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
     * 
     */
    @Import(name="sparkVersion", required=true)
    private Output<String> sparkVersion;

    /**
     * @return [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
     * 
     */
    public Output<String> sparkVersion() {
        return this.sparkVersion;
    }

    /**
     * SSH public key contents that will be added to each Spark node in this cluster.
     * 
     */
    @Import(name="sshPublicKeys")
    private @Nullable Output<List<String>> sshPublicKeys;

    /**
     * @return SSH public key contents that will be added to each Spark node in this cluster.
     * 
     */
    public Optional<Output<List<String>>> sshPublicKeys() {
        return Optional.ofNullable(this.sshPublicKeys);
    }

    @Import(name="startTime")
    private @Nullable Output<Integer> startTime;

    public Optional<Output<Integer>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    @Import(name="state", required=true)
    private Output<String> state;

    public Output<String> state() {
        return this.state;
    }

    @Import(name="stateMessage")
    private @Nullable Output<String> stateMessage;

    public Optional<Output<String>> stateMessage() {
        return Optional.ofNullable(this.stateMessage);
    }

    @Import(name="terminateTime")
    private @Nullable Output<Integer> terminateTime;

    public Optional<Output<Integer>> terminateTime() {
        return Optional.ofNullable(this.terminateTime);
    }

    @Import(name="terminationReason")
    private @Nullable Output<GetClusterClusterInfoTerminationReasonArgs> terminationReason;

    public Optional<Output<GetClusterClusterInfoTerminationReasonArgs>> terminationReason() {
        return Optional.ofNullable(this.terminationReason);
    }

    private GetClusterClusterInfoArgs() {}

    private GetClusterClusterInfoArgs(GetClusterClusterInfoArgs $) {
        this.autoscale = $.autoscale;
        this.autoterminationMinutes = $.autoterminationMinutes;
        this.awsAttributes = $.awsAttributes;
        this.azureAttributes = $.azureAttributes;
        this.clusterCores = $.clusterCores;
        this.clusterId = $.clusterId;
        this.clusterLogConf = $.clusterLogConf;
        this.clusterLogStatus = $.clusterLogStatus;
        this.clusterMemoryMb = $.clusterMemoryMb;
        this.clusterName = $.clusterName;
        this.clusterSource = $.clusterSource;
        this.creatorUserName = $.creatorUserName;
        this.customTags = $.customTags;
        this.dataSecurityMode = $.dataSecurityMode;
        this.defaultTags = $.defaultTags;
        this.dockerImage = $.dockerImage;
        this.driver = $.driver;
        this.driverInstancePoolId = $.driverInstancePoolId;
        this.driverNodeTypeId = $.driverNodeTypeId;
        this.enableElasticDisk = $.enableElasticDisk;
        this.enableLocalDiskEncryption = $.enableLocalDiskEncryption;
        this.executors = $.executors;
        this.gcpAttributes = $.gcpAttributes;
        this.initScripts = $.initScripts;
        this.instancePoolId = $.instancePoolId;
        this.jdbcPort = $.jdbcPort;
        this.lastActivityTime = $.lastActivityTime;
        this.lastStateLossTime = $.lastStateLossTime;
        this.nodeTypeId = $.nodeTypeId;
        this.numWorkers = $.numWorkers;
        this.policyId = $.policyId;
        this.runtimeEngine = $.runtimeEngine;
        this.singleUserName = $.singleUserName;
        this.sparkConf = $.sparkConf;
        this.sparkContextId = $.sparkContextId;
        this.sparkEnvVars = $.sparkEnvVars;
        this.sparkVersion = $.sparkVersion;
        this.sshPublicKeys = $.sshPublicKeys;
        this.startTime = $.startTime;
        this.state = $.state;
        this.stateMessage = $.stateMessage;
        this.terminateTime = $.terminateTime;
        this.terminationReason = $.terminationReason;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterClusterInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterClusterInfoArgs $;

        public Builder() {
            $ = new GetClusterClusterInfoArgs();
        }

        public Builder(GetClusterClusterInfoArgs defaults) {
            $ = new GetClusterClusterInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder autoscale(@Nullable Output<GetClusterClusterInfoAutoscaleArgs> autoscale) {
            $.autoscale = autoscale;
            return this;
        }

        public Builder autoscale(GetClusterClusterInfoAutoscaleArgs autoscale) {
            return autoscale(Output.of(autoscale));
        }

        /**
         * @param autoterminationMinutes Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
         * 
         * @return builder
         * 
         */
        public Builder autoterminationMinutes(@Nullable Output<Integer> autoterminationMinutes) {
            $.autoterminationMinutes = autoterminationMinutes;
            return this;
        }

        /**
         * @param autoterminationMinutes Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination.
         * 
         * @return builder
         * 
         */
        public Builder autoterminationMinutes(Integer autoterminationMinutes) {
            return autoterminationMinutes(Output.of(autoterminationMinutes));
        }

        public Builder awsAttributes(@Nullable Output<GetClusterClusterInfoAwsAttributesArgs> awsAttributes) {
            $.awsAttributes = awsAttributes;
            return this;
        }

        public Builder awsAttributes(GetClusterClusterInfoAwsAttributesArgs awsAttributes) {
            return awsAttributes(Output.of(awsAttributes));
        }

        public Builder azureAttributes(@Nullable Output<GetClusterClusterInfoAzureAttributesArgs> azureAttributes) {
            $.azureAttributes = azureAttributes;
            return this;
        }

        public Builder azureAttributes(GetClusterClusterInfoAzureAttributesArgs azureAttributes) {
            return azureAttributes(Output.of(azureAttributes));
        }

        public Builder clusterCores(@Nullable Output<Double> clusterCores) {
            $.clusterCores = clusterCores;
            return this;
        }

        public Builder clusterCores(Double clusterCores) {
            return clusterCores(Output.of(clusterCores));
        }

        /**
         * @param clusterId The id of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId The id of the cluster
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        public Builder clusterLogConf(@Nullable Output<GetClusterClusterInfoClusterLogConfArgs> clusterLogConf) {
            $.clusterLogConf = clusterLogConf;
            return this;
        }

        public Builder clusterLogConf(GetClusterClusterInfoClusterLogConfArgs clusterLogConf) {
            return clusterLogConf(Output.of(clusterLogConf));
        }

        public Builder clusterLogStatus(@Nullable Output<GetClusterClusterInfoClusterLogStatusArgs> clusterLogStatus) {
            $.clusterLogStatus = clusterLogStatus;
            return this;
        }

        public Builder clusterLogStatus(GetClusterClusterInfoClusterLogStatusArgs clusterLogStatus) {
            return clusterLogStatus(Output.of(clusterLogStatus));
        }

        public Builder clusterMemoryMb(@Nullable Output<Integer> clusterMemoryMb) {
            $.clusterMemoryMb = clusterMemoryMb;
            return this;
        }

        public Builder clusterMemoryMb(Integer clusterMemoryMb) {
            return clusterMemoryMb(Output.of(clusterMemoryMb));
        }

        /**
         * @param clusterName The exact name of the cluster to search
         * 
         * @return builder
         * 
         */
        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The exact name of the cluster to search
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder clusterSource(@Nullable Output<String> clusterSource) {
            $.clusterSource = clusterSource;
            return this;
        }

        public Builder clusterSource(String clusterSource) {
            return clusterSource(Output.of(clusterSource));
        }

        public Builder creatorUserName(@Nullable Output<String> creatorUserName) {
            $.creatorUserName = creatorUserName;
            return this;
        }

        public Builder creatorUserName(String creatorUserName) {
            return creatorUserName(Output.of(creatorUserName));
        }

        /**
         * @param customTags Additional tags for cluster resources.
         * 
         * @return builder
         * 
         */
        public Builder customTags(@Nullable Output<Map<String,Object>> customTags) {
            $.customTags = customTags;
            return this;
        }

        /**
         * @param customTags Additional tags for cluster resources.
         * 
         * @return builder
         * 
         */
        public Builder customTags(Map<String,Object> customTags) {
            return customTags(Output.of(customTags));
        }

        /**
         * @param dataSecurityMode Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
         * 
         * @return builder
         * 
         */
        public Builder dataSecurityMode(@Nullable Output<String> dataSecurityMode) {
            $.dataSecurityMode = dataSecurityMode;
            return this;
        }

        /**
         * @param dataSecurityMode Security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
         * 
         * @return builder
         * 
         */
        public Builder dataSecurityMode(String dataSecurityMode) {
            return dataSecurityMode(Output.of(dataSecurityMode));
        }

        public Builder defaultTags(Output<Map<String,Object>> defaultTags) {
            $.defaultTags = defaultTags;
            return this;
        }

        public Builder defaultTags(Map<String,Object> defaultTags) {
            return defaultTags(Output.of(defaultTags));
        }

        public Builder dockerImage(@Nullable Output<GetClusterClusterInfoDockerImageArgs> dockerImage) {
            $.dockerImage = dockerImage;
            return this;
        }

        public Builder dockerImage(GetClusterClusterInfoDockerImageArgs dockerImage) {
            return dockerImage(Output.of(dockerImage));
        }

        public Builder driver(@Nullable Output<GetClusterClusterInfoDriverArgs> driver) {
            $.driver = driver;
            return this;
        }

        public Builder driver(GetClusterClusterInfoDriverArgs driver) {
            return driver(Output.of(driver));
        }

        /**
         * @param driverInstancePoolId similar to `instance_pool_id`, but for driver node.
         * 
         * @return builder
         * 
         */
        public Builder driverInstancePoolId(Output<String> driverInstancePoolId) {
            $.driverInstancePoolId = driverInstancePoolId;
            return this;
        }

        /**
         * @param driverInstancePoolId similar to `instance_pool_id`, but for driver node.
         * 
         * @return builder
         * 
         */
        public Builder driverInstancePoolId(String driverInstancePoolId) {
            return driverInstancePoolId(Output.of(driverInstancePoolId));
        }

        /**
         * @param driverNodeTypeId The node type of the Spark driver.
         * 
         * @return builder
         * 
         */
        public Builder driverNodeTypeId(@Nullable Output<String> driverNodeTypeId) {
            $.driverNodeTypeId = driverNodeTypeId;
            return this;
        }

        /**
         * @param driverNodeTypeId The node type of the Spark driver.
         * 
         * @return builder
         * 
         */
        public Builder driverNodeTypeId(String driverNodeTypeId) {
            return driverNodeTypeId(Output.of(driverNodeTypeId));
        }

        /**
         * @param enableElasticDisk Use autoscaling local storage.
         * 
         * @return builder
         * 
         */
        public Builder enableElasticDisk(@Nullable Output<Boolean> enableElasticDisk) {
            $.enableElasticDisk = enableElasticDisk;
            return this;
        }

        /**
         * @param enableElasticDisk Use autoscaling local storage.
         * 
         * @return builder
         * 
         */
        public Builder enableElasticDisk(Boolean enableElasticDisk) {
            return enableElasticDisk(Output.of(enableElasticDisk));
        }

        /**
         * @param enableLocalDiskEncryption Enable local disk encryption.
         * 
         * @return builder
         * 
         */
        public Builder enableLocalDiskEncryption(@Nullable Output<Boolean> enableLocalDiskEncryption) {
            $.enableLocalDiskEncryption = enableLocalDiskEncryption;
            return this;
        }

        /**
         * @param enableLocalDiskEncryption Enable local disk encryption.
         * 
         * @return builder
         * 
         */
        public Builder enableLocalDiskEncryption(Boolean enableLocalDiskEncryption) {
            return enableLocalDiskEncryption(Output.of(enableLocalDiskEncryption));
        }

        public Builder executors(@Nullable Output<List<GetClusterClusterInfoExecutorArgs>> executors) {
            $.executors = executors;
            return this;
        }

        public Builder executors(List<GetClusterClusterInfoExecutorArgs> executors) {
            return executors(Output.of(executors));
        }

        public Builder executors(GetClusterClusterInfoExecutorArgs... executors) {
            return executors(List.of(executors));
        }

        public Builder gcpAttributes(@Nullable Output<GetClusterClusterInfoGcpAttributesArgs> gcpAttributes) {
            $.gcpAttributes = gcpAttributes;
            return this;
        }

        public Builder gcpAttributes(GetClusterClusterInfoGcpAttributesArgs gcpAttributes) {
            return gcpAttributes(Output.of(gcpAttributes));
        }

        public Builder initScripts(@Nullable Output<List<GetClusterClusterInfoInitScriptArgs>> initScripts) {
            $.initScripts = initScripts;
            return this;
        }

        public Builder initScripts(List<GetClusterClusterInfoInitScriptArgs> initScripts) {
            return initScripts(Output.of(initScripts));
        }

        public Builder initScripts(GetClusterClusterInfoInitScriptArgs... initScripts) {
            return initScripts(List.of(initScripts));
        }

        /**
         * @param instancePoolId The pool of idle instances the cluster is attached to.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(@Nullable Output<String> instancePoolId) {
            $.instancePoolId = instancePoolId;
            return this;
        }

        /**
         * @param instancePoolId The pool of idle instances the cluster is attached to.
         * 
         * @return builder
         * 
         */
        public Builder instancePoolId(String instancePoolId) {
            return instancePoolId(Output.of(instancePoolId));
        }

        public Builder jdbcPort(@Nullable Output<Integer> jdbcPort) {
            $.jdbcPort = jdbcPort;
            return this;
        }

        public Builder jdbcPort(Integer jdbcPort) {
            return jdbcPort(Output.of(jdbcPort));
        }

        public Builder lastActivityTime(@Nullable Output<Integer> lastActivityTime) {
            $.lastActivityTime = lastActivityTime;
            return this;
        }

        public Builder lastActivityTime(Integer lastActivityTime) {
            return lastActivityTime(Output.of(lastActivityTime));
        }

        public Builder lastStateLossTime(@Nullable Output<Integer> lastStateLossTime) {
            $.lastStateLossTime = lastStateLossTime;
            return this;
        }

        public Builder lastStateLossTime(Integer lastStateLossTime) {
            return lastStateLossTime(Output.of(lastStateLossTime));
        }

        /**
         * @param nodeTypeId Any supported databricks.getNodeType id.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeId(@Nullable Output<String> nodeTypeId) {
            $.nodeTypeId = nodeTypeId;
            return this;
        }

        /**
         * @param nodeTypeId Any supported databricks.getNodeType id.
         * 
         * @return builder
         * 
         */
        public Builder nodeTypeId(String nodeTypeId) {
            return nodeTypeId(Output.of(nodeTypeId));
        }

        public Builder numWorkers(@Nullable Output<Integer> numWorkers) {
            $.numWorkers = numWorkers;
            return this;
        }

        public Builder numWorkers(Integer numWorkers) {
            return numWorkers(Output.of(numWorkers));
        }

        /**
         * @param policyId Identifier of Cluster Policy to validate cluster and preset certain defaults.
         * 
         * @return builder
         * 
         */
        public Builder policyId(@Nullable Output<String> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId Identifier of Cluster Policy to validate cluster and preset certain defaults.
         * 
         * @return builder
         * 
         */
        public Builder policyId(String policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param runtimeEngine The type of runtime of the cluster
         * 
         * @return builder
         * 
         */
        public Builder runtimeEngine(@Nullable Output<String> runtimeEngine) {
            $.runtimeEngine = runtimeEngine;
            return this;
        }

        /**
         * @param runtimeEngine The type of runtime of the cluster
         * 
         * @return builder
         * 
         */
        public Builder runtimeEngine(String runtimeEngine) {
            return runtimeEngine(Output.of(runtimeEngine));
        }

        /**
         * @param singleUserName The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
         * 
         * @return builder
         * 
         */
        public Builder singleUserName(@Nullable Output<String> singleUserName) {
            $.singleUserName = singleUserName;
            return this;
        }

        /**
         * @param singleUserName The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
         * 
         * @return builder
         * 
         */
        public Builder singleUserName(String singleUserName) {
            return singleUserName(Output.of(singleUserName));
        }

        /**
         * @param sparkConf Map with key-value pairs to fine-tune Spark clusters.
         * 
         * @return builder
         * 
         */
        public Builder sparkConf(@Nullable Output<Map<String,Object>> sparkConf) {
            $.sparkConf = sparkConf;
            return this;
        }

        /**
         * @param sparkConf Map with key-value pairs to fine-tune Spark clusters.
         * 
         * @return builder
         * 
         */
        public Builder sparkConf(Map<String,Object> sparkConf) {
            return sparkConf(Output.of(sparkConf));
        }

        public Builder sparkContextId(@Nullable Output<Integer> sparkContextId) {
            $.sparkContextId = sparkContextId;
            return this;
        }

        public Builder sparkContextId(Integer sparkContextId) {
            return sparkContextId(Output.of(sparkContextId));
        }

        /**
         * @param sparkEnvVars Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
         * 
         * @return builder
         * 
         */
        public Builder sparkEnvVars(@Nullable Output<Map<String,Object>> sparkEnvVars) {
            $.sparkEnvVars = sparkEnvVars;
            return this;
        }

        /**
         * @param sparkEnvVars Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
         * 
         * @return builder
         * 
         */
        public Builder sparkEnvVars(Map<String,Object> sparkEnvVars) {
            return sparkEnvVars(Output.of(sparkEnvVars));
        }

        /**
         * @param sparkVersion [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder sparkVersion(Output<String> sparkVersion) {
            $.sparkVersion = sparkVersion;
            return this;
        }

        /**
         * @param sparkVersion [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder sparkVersion(String sparkVersion) {
            return sparkVersion(Output.of(sparkVersion));
        }

        /**
         * @param sshPublicKeys SSH public key contents that will be added to each Spark node in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKeys(@Nullable Output<List<String>> sshPublicKeys) {
            $.sshPublicKeys = sshPublicKeys;
            return this;
        }

        /**
         * @param sshPublicKeys SSH public key contents that will be added to each Spark node in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKeys(List<String> sshPublicKeys) {
            return sshPublicKeys(Output.of(sshPublicKeys));
        }

        /**
         * @param sshPublicKeys SSH public key contents that will be added to each Spark node in this cluster.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKeys(String... sshPublicKeys) {
            return sshPublicKeys(List.of(sshPublicKeys));
        }

        public Builder startTime(@Nullable Output<Integer> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(Integer startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder state(Output<String> state) {
            $.state = state;
            return this;
        }

        public Builder state(String state) {
            return state(Output.of(state));
        }

        public Builder stateMessage(@Nullable Output<String> stateMessage) {
            $.stateMessage = stateMessage;
            return this;
        }

        public Builder stateMessage(String stateMessage) {
            return stateMessage(Output.of(stateMessage));
        }

        public Builder terminateTime(@Nullable Output<Integer> terminateTime) {
            $.terminateTime = terminateTime;
            return this;
        }

        public Builder terminateTime(Integer terminateTime) {
            return terminateTime(Output.of(terminateTime));
        }

        public Builder terminationReason(@Nullable Output<GetClusterClusterInfoTerminationReasonArgs> terminationReason) {
            $.terminationReason = terminationReason;
            return this;
        }

        public Builder terminationReason(GetClusterClusterInfoTerminationReasonArgs terminationReason) {
            return terminationReason(Output.of(terminationReason));
        }

        public GetClusterClusterInfoArgs build() {
            $.defaultTags = Objects.requireNonNull($.defaultTags, "expected parameter 'defaultTags' to be non-null");
            $.driverInstancePoolId = Objects.requireNonNull($.driverInstancePoolId, "expected parameter 'driverInstancePoolId' to be non-null");
            $.sparkVersion = Objects.requireNonNull($.sparkVersion, "expected parameter 'sparkVersion' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}
