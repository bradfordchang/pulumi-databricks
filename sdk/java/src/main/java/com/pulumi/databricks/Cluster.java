// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ClusterArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ClusterState;
import com.pulumi.databricks.outputs.ClusterAutoscale;
import com.pulumi.databricks.outputs.ClusterAwsAttributes;
import com.pulumi.databricks.outputs.ClusterAzureAttributes;
import com.pulumi.databricks.outputs.ClusterClusterLogConf;
import com.pulumi.databricks.outputs.ClusterDockerImage;
import com.pulumi.databricks.outputs.ClusterGcpAttributes;
import com.pulumi.databricks.outputs.ClusterInitScript;
import com.pulumi.databricks.outputs.ClusterLibrary;
import com.pulumi.databricks.outputs.ClusterWorkloadType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource cluster can be imported using cluster id. bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/cluster:Cluster this &lt;cluster-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/cluster:Cluster")
public class Cluster extends com.pulumi.resources.CustomResource {
    /**
     * Whether to use policy default values for missing cluster attributes.
     * 
     */
    @Export(name="applyPolicyDefaultValues", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> applyPolicyDefaultValues;

    /**
     * @return Whether to use policy default values for missing cluster attributes.
     * 
     */
    public Output<Optional<Boolean>> applyPolicyDefaultValues() {
        return Codegen.optional(this.applyPolicyDefaultValues);
    }
    @Export(name="autoscale", type=ClusterAutoscale.class, parameters={})
    private Output</* @Nullable */ ClusterAutoscale> autoscale;

    public Output<Optional<ClusterAutoscale>> autoscale() {
        return Codegen.optional(this.autoscale);
    }
    /**
     * Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination. Defaults to `60`.  *We highly recommend having this setting present for Interactive/BI clusters.*
     * 
     */
    @Export(name="autoterminationMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> autoterminationMinutes;

    /**
     * @return Automatically terminate the cluster after being inactive for this time in minutes. If specified, the threshold must be between 10 and 10000 minutes. You can also set this value to 0 to explicitly disable automatic termination. Defaults to `60`.  *We highly recommend having this setting present for Interactive/BI clusters.*
     * 
     */
    public Output<Optional<Integer>> autoterminationMinutes() {
        return Codegen.optional(this.autoterminationMinutes);
    }
    @Export(name="awsAttributes", type=ClusterAwsAttributes.class, parameters={})
    private Output</* @Nullable */ ClusterAwsAttributes> awsAttributes;

    public Output<Optional<ClusterAwsAttributes>> awsAttributes() {
        return Codegen.optional(this.awsAttributes);
    }
    @Export(name="azureAttributes", type=ClusterAzureAttributes.class, parameters={})
    private Output</* @Nullable */ ClusterAzureAttributes> azureAttributes;

    public Output<Optional<ClusterAzureAttributes>> azureAttributes() {
        return Codegen.optional(this.azureAttributes);
    }
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="clusterLogConf", type=ClusterClusterLogConf.class, parameters={})
    private Output</* @Nullable */ ClusterClusterLogConf> clusterLogConf;

    public Output<Optional<ClusterClusterLogConf>> clusterLogConf() {
        return Codegen.optional(this.clusterLogConf);
    }
    /**
     * Cluster name, which doesn’t have to be unique. If not specified at creation, the cluster name will be an empty string.
     * 
     */
    @Export(name="clusterName", type=String.class, parameters={})
    private Output</* @Nullable */ String> clusterName;

    /**
     * @return Cluster name, which doesn’t have to be unique. If not specified at creation, the cluster name will be an empty string.
     * 
     */
    public Output<Optional<String>> clusterName() {
        return Codegen.optional(this.clusterName);
    }
    /**
     * Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS EC2 instances and EBS volumes) with these tags in addition to `default_tags`.
     * 
     */
    @Export(name="customTags", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> customTags;

    /**
     * @return Additional tags for cluster resources. Databricks will tag all cluster resources (e.g., AWS EC2 instances and EBS volumes) with these tags in addition to `default_tags`.
     * 
     */
    public Output<Optional<Map<String,Object>>> customTags() {
        return Codegen.optional(this.customTags);
    }
    /**
     * Select the security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    @Export(name="dataSecurityMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSecurityMode;

    /**
     * @return Select the security features of the cluster. Unity Catalog requires `SINGLE_USER` or `USER_ISOLATION` mode. `LEGACY_PASSTHROUGH` for passthrough cluster and `LEGACY_TABLE_ACL` for Table ACL cluster. Default to `NONE`, i.e. no security feature enabled.
     * 
     */
    public Output<Optional<String>> dataSecurityMode() {
        return Codegen.optional(this.dataSecurityMode);
    }
    /**
     * (map) Tags that are added by Databricks by default, regardless of any custom_tags that may have been added. These include: Vendor: Databricks, Creator: &lt;username_of_creator&gt;, ClusterName: &lt;name_of_cluster&gt;, ClusterId: &lt;id_of_cluster&gt;, Name: &lt;Databricks internal use&gt;
     * 
     */
    @Export(name="defaultTags", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> defaultTags;

    /**
     * @return (map) Tags that are added by Databricks by default, regardless of any custom_tags that may have been added. These include: Vendor: Databricks, Creator: &lt;username_of_creator&gt;, ClusterName: &lt;name_of_cluster&gt;, ClusterId: &lt;id_of_cluster&gt;, Name: &lt;Databricks internal use&gt;
     * 
     */
    public Output<Map<String,Object>> defaultTags() {
        return this.defaultTags;
    }
    @Export(name="dockerImage", type=ClusterDockerImage.class, parameters={})
    private Output</* @Nullable */ ClusterDockerImage> dockerImage;

    public Output<Optional<ClusterDockerImage>> dockerImage() {
        return Codegen.optional(this.dockerImage);
    }
    /**
     * similar to `instance_pool_id`, but for driver node. If omitted, and `instance_pool_id` is specified, then the driver will be allocated from that pool.
     * 
     */
    @Export(name="driverInstancePoolId", type=String.class, parameters={})
    private Output<String> driverInstancePoolId;

    /**
     * @return similar to `instance_pool_id`, but for driver node. If omitted, and `instance_pool_id` is specified, then the driver will be allocated from that pool.
     * 
     */
    public Output<String> driverInstancePoolId() {
        return this.driverInstancePoolId;
    }
    /**
     * The node type of the Spark driver. This field is optional; if unset, API will set the driver node type to the same value as `node_type_id` defined above.
     * 
     */
    @Export(name="driverNodeTypeId", type=String.class, parameters={})
    private Output<String> driverNodeTypeId;

    /**
     * @return The node type of the Spark driver. This field is optional; if unset, API will set the driver node type to the same value as `node_type_id` defined above.
     * 
     */
    public Output<String> driverNodeTypeId() {
        return this.driverNodeTypeId;
    }
    /**
     * If you don’t want to allocate a fixed number of EBS volumes at cluster creation time, use autoscaling local storage. With autoscaling local storage, Databricks monitors the amount of free disk space available on your cluster’s Spark workers. If a worker begins to run too low on disk, Databricks automatically attaches a new EBS volume to the worker before it runs out of disk space. EBS volumes are attached up to a limit of 5 TB of total disk space per instance (including the instance’s local storage). To scale down EBS usage, make sure you have `autotermination_minutes` and `autoscale` attributes set. More documentation available at [cluster configuration page](https://docs.databricks.com/clusters/configure.html#autoscaling-local-storage-1).
     * 
     */
    @Export(name="enableElasticDisk", type=Boolean.class, parameters={})
    private Output<Boolean> enableElasticDisk;

    /**
     * @return If you don’t want to allocate a fixed number of EBS volumes at cluster creation time, use autoscaling local storage. With autoscaling local storage, Databricks monitors the amount of free disk space available on your cluster’s Spark workers. If a worker begins to run too low on disk, Databricks automatically attaches a new EBS volume to the worker before it runs out of disk space. EBS volumes are attached up to a limit of 5 TB of total disk space per instance (including the instance’s local storage). To scale down EBS usage, make sure you have `autotermination_minutes` and `autoscale` attributes set. More documentation available at [cluster configuration page](https://docs.databricks.com/clusters/configure.html#autoscaling-local-storage-1).
     * 
     */
    public Output<Boolean> enableElasticDisk() {
        return this.enableElasticDisk;
    }
    /**
     * Some instance types you use to run clusters may have locally attached disks. Databricks may store shuffle data or temporary data on these locally attached disks. To ensure that all data at rest is encrypted for all storage types, including shuffle data stored temporarily on your cluster’s local disks, you can enable local disk encryption. When local disk encryption is enabled, Databricks generates an encryption key locally unique to each cluster node and uses it to encrypt all data stored on local disks. The scope of the key is local to each cluster node and is destroyed along with the cluster node itself. During its lifetime, the key resides in memory for encryption and decryption and is stored encrypted on the disk. *Your workloads may run more slowly because of the performance impact of reading and writing encrypted data to and from local volumes. This feature is not available for all Azure Databricks subscriptions. Contact your Microsoft or Databricks account representative to request access.*
     * 
     */
    @Export(name="enableLocalDiskEncryption", type=Boolean.class, parameters={})
    private Output<Boolean> enableLocalDiskEncryption;

    /**
     * @return Some instance types you use to run clusters may have locally attached disks. Databricks may store shuffle data or temporary data on these locally attached disks. To ensure that all data at rest is encrypted for all storage types, including shuffle data stored temporarily on your cluster’s local disks, you can enable local disk encryption. When local disk encryption is enabled, Databricks generates an encryption key locally unique to each cluster node and uses it to encrypt all data stored on local disks. The scope of the key is local to each cluster node and is destroyed along with the cluster node itself. During its lifetime, the key resides in memory for encryption and decryption and is stored encrypted on the disk. *Your workloads may run more slowly because of the performance impact of reading and writing encrypted data to and from local volumes. This feature is not available for all Azure Databricks subscriptions. Contact your Microsoft or Databricks account representative to request access.*
     * 
     */
    public Output<Boolean> enableLocalDiskEncryption() {
        return this.enableLocalDiskEncryption;
    }
    @Export(name="gcpAttributes", type=ClusterGcpAttributes.class, parameters={})
    private Output</* @Nullable */ ClusterGcpAttributes> gcpAttributes;

    public Output<Optional<ClusterGcpAttributes>> gcpAttributes() {
        return Codegen.optional(this.gcpAttributes);
    }
    /**
     * An optional token to guarantee the idempotency of cluster creation requests. If an active cluster with the provided token already exists, the request will not create a new cluster, but it will return the existing running cluster&#39;s ID instead. If you specify the idempotency token, upon failure, you can retry until the request succeeds. Databricks platform guarantees to launch exactly one cluster with that idempotency token. This token should have at most 64 characters.
     * 
     */
    @Export(name="idempotencyToken", type=String.class, parameters={})
    private Output</* @Nullable */ String> idempotencyToken;

    /**
     * @return An optional token to guarantee the idempotency of cluster creation requests. If an active cluster with the provided token already exists, the request will not create a new cluster, but it will return the existing running cluster&#39;s ID instead. If you specify the idempotency token, upon failure, you can retry until the request succeeds. Databricks platform guarantees to launch exactly one cluster with that idempotency token. This token should have at most 64 characters.
     * 
     */
    public Output<Optional<String>> idempotencyToken() {
        return Codegen.optional(this.idempotencyToken);
    }
    @Export(name="initScripts", type=List.class, parameters={ClusterInitScript.class})
    private Output</* @Nullable */ List<ClusterInitScript>> initScripts;

    public Output<Optional<List<ClusterInitScript>>> initScripts() {
        return Codegen.optional(this.initScripts);
    }
    /**
     * - To reduce cluster start time, you can attach a cluster to a predefined pool of idle instances. When attached to a pool, a cluster allocates its driver and worker nodes from the pool. If the pool does not have sufficient idle resources to accommodate the cluster’s request, it expands by allocating new instances from the instance provider. When an attached cluster changes its state to `TERMINATED`, the instances it used are returned to the pool and reused by a different cluster.
     * 
     */
    @Export(name="instancePoolId", type=String.class, parameters={})
    private Output</* @Nullable */ String> instancePoolId;

    /**
     * @return - To reduce cluster start time, you can attach a cluster to a predefined pool of idle instances. When attached to a pool, a cluster allocates its driver and worker nodes from the pool. If the pool does not have sufficient idle resources to accommodate the cluster’s request, it expands by allocating new instances from the instance provider. When an attached cluster changes its state to `TERMINATED`, the instances it used are returned to the pool and reused by a different cluster.
     * 
     */
    public Output<Optional<String>> instancePoolId() {
        return Codegen.optional(this.instancePoolId);
    }
    /**
     * boolean value specifying if the cluster is pinned (not pinned by default). You must be a Databricks administrator to use this.  The pinned clusters&#39; maximum number is [limited to 70](https://docs.databricks.com/clusters/clusters-manage.html#pin-a-cluster), so `apply` may fail if you have more than that.
     * 
     */
    @Export(name="isPinned", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isPinned;

    /**
     * @return boolean value specifying if the cluster is pinned (not pinned by default). You must be a Databricks administrator to use this.  The pinned clusters&#39; maximum number is [limited to 70](https://docs.databricks.com/clusters/clusters-manage.html#pin-a-cluster), so `apply` may fail if you have more than that.
     * 
     */
    public Output<Optional<Boolean>> isPinned() {
        return Codegen.optional(this.isPinned);
    }
    @Export(name="libraries", type=List.class, parameters={ClusterLibrary.class})
    private Output</* @Nullable */ List<ClusterLibrary>> libraries;

    public Output<Optional<List<ClusterLibrary>>> libraries() {
        return Codegen.optional(this.libraries);
    }
    /**
     * Any supported databricks.getNodeType id. If `instance_pool_id` is specified, this field is not needed.
     * 
     */
    @Export(name="nodeTypeId", type=String.class, parameters={})
    private Output<String> nodeTypeId;

    /**
     * @return Any supported databricks.getNodeType id. If `instance_pool_id` is specified, this field is not needed.
     * 
     */
    public Output<String> nodeTypeId() {
        return this.nodeTypeId;
    }
    @Export(name="numWorkers", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> numWorkers;

    public Output<Optional<Integer>> numWorkers() {
        return Codegen.optional(this.numWorkers);
    }
    /**
     * Identifier of Cluster Policy to validate cluster and preset certain defaults. *The primary use for cluster policies is to allow users to create policy-scoped clusters via UI rather than sharing configuration for API-created clusters.* For example, when you specify `policy_id` of [external metastore](https://docs.databricks.com/administration-guide/clusters/policies.html#external-metastore-policy) policy, you still have to fill in relevant keys for `spark_conf`.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output</* @Nullable */ String> policyId;

    /**
     * @return Identifier of Cluster Policy to validate cluster and preset certain defaults. *The primary use for cluster policies is to allow users to create policy-scoped clusters via UI rather than sharing configuration for API-created clusters.* For example, when you specify `policy_id` of [external metastore](https://docs.databricks.com/administration-guide/clusters/policies.html#external-metastore-policy) policy, you still have to fill in relevant keys for `spark_conf`.
     * 
     */
    public Output<Optional<String>> policyId() {
        return Codegen.optional(this.policyId);
    }
    /**
     * The type of runtime engine to use. If not specified, the runtime engine type is inferred based on the spark_version value. Allowed values include: `PHOTON`, `STANDARD`.
     * 
     */
    @Export(name="runtimeEngine", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeEngine;

    /**
     * @return The type of runtime engine to use. If not specified, the runtime engine type is inferred based on the spark_version value. Allowed values include: `PHOTON`, `STANDARD`.
     * 
     */
    public Output<Optional<String>> runtimeEngine() {
        return Codegen.optional(this.runtimeEngine);
    }
    /**
     * The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    @Export(name="singleUserName", type=String.class, parameters={})
    private Output</* @Nullable */ String> singleUserName;

    /**
     * @return The optional user name of the user to assign to an interactive cluster. This field is required when using standard AAD Passthrough for Azure Data Lake Storage (ADLS) with a single-user cluster (i.e., not high-concurrency clusters).
     * 
     */
    public Output<Optional<String>> singleUserName() {
        return Codegen.optional(this.singleUserName);
    }
    /**
     * Map with key-value pairs to fine-tune Spark clusters, where you can provide custom [Spark configuration properties](https://spark.apache.org/docs/latest/configuration.html) in a cluster configuration.
     * 
     */
    @Export(name="sparkConf", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> sparkConf;

    /**
     * @return Map with key-value pairs to fine-tune Spark clusters, where you can provide custom [Spark configuration properties](https://spark.apache.org/docs/latest/configuration.html) in a cluster configuration.
     * 
     */
    public Output<Optional<Map<String,Object>>> sparkConf() {
        return Codegen.optional(this.sparkConf);
    }
    /**
     * Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    @Export(name="sparkEnvVars", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> sparkEnvVars;

    /**
     * @return Map with environment variable key-value pairs to fine-tune Spark clusters. Key-value pairs of the form (X,Y) are exported (i.e., X=&#39;Y&#39;) while launching the driver and workers.
     * 
     */
    public Output<Optional<Map<String,Object>>> sparkEnvVars() {
        return Codegen.optional(this.sparkEnvVars);
    }
    /**
     * [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster. Any supported databricks.getSparkVersion id.  We advise using Cluster Policies to restrict the list of versions for simplicity while maintaining enough control.
     * 
     */
    @Export(name="sparkVersion", type=String.class, parameters={})
    private Output<String> sparkVersion;

    /**
     * @return [Runtime version](https://docs.databricks.com/runtime/index.html) of the cluster. Any supported databricks.getSparkVersion id.  We advise using Cluster Policies to restrict the list of versions for simplicity while maintaining enough control.
     * 
     */
    public Output<String> sparkVersion() {
        return this.sparkVersion;
    }
    /**
     * SSH public key contents that will be added to each Spark node in this cluster. The corresponding private keys can be used to login with the user name ubuntu on port 2200. You can specify up to 10 keys.
     * 
     */
    @Export(name="sshPublicKeys", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> sshPublicKeys;

    /**
     * @return SSH public key contents that will be added to each Spark node in this cluster. The corresponding private keys can be used to login with the user name ubuntu on port 2200. You can specify up to 10 keys.
     * 
     */
    public Output<Optional<List<String>>> sshPublicKeys() {
        return Codegen.optional(this.sshPublicKeys);
    }
    /**
     * (string) State of the cluster.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return (string) State of the cluster.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    @Export(name="url", type=String.class, parameters={})
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }
    @Export(name="workloadType", type=ClusterWorkloadType.class, parameters={})
    private Output</* @Nullable */ ClusterWorkloadType> workloadType;

    public Output<Optional<ClusterWorkloadType>> workloadType() {
        return Codegen.optional(this.workloadType);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Cluster(String name) {
        this(name, ClusterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Cluster(String name, ClusterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Cluster(String name, ClusterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/cluster:Cluster", name, args == null ? ClusterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Cluster(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/cluster:Cluster", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Cluster get(String name, Output<String> id, @Nullable ClusterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Cluster(name, id, state, options);
    }
}
