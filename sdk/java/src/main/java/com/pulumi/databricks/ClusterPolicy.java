// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ClusterPolicyArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ClusterPolicyState;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * This resource creates a cluster policy, which limits the ability to create clusters based on a set of rules. The policy rules limit the attributes or attribute values available for cluster creation. cluster policies have ACLs that limit their use to specific users and groups. Only admin users can create, edit, and delete policies. Admin users also have access to all policies.
 * 
 * Cluster policies let you:
 * 
 * * Limit users to create clusters with prescribed settings.
 * * Simplify the user interface and enable more users to create their own clusters (by fixing and hiding some values).
 * * Control cost by limiting per cluster maximum cost (by setting limits on attributes whose values contribute to hourly price).
 * 
 * Cluster policy permissions limit which policies a user can select in the Policy drop-down when the user creates a cluster:
 * 
 * * If no policies have been created in the workspace, the Policy drop-down does not display.
 * * A user who has cluster create permission can select the `Free form` policy and create fully-configurable clusters.
 * * A user who has both cluster create permission and access to cluster policies can select the Free form policy and policies they have access to.
 * * A user that has access to only cluster policies, can select the policies they have access to.
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * Dynamic Passthrough Clusters for a Group guide
 * * End to end workspace management guide
 * * databricks.getClusters data to retrieve a list of databricks.Cluster ids.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.getCurrentUser data to retrieve information about databricks.User or databricks_service_principal, that is calling Databricks REST API.
 * * databricks.GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all databricks.Cluster and databricks_job.
 * * databricks.InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
 * * databricks.InstanceProfile to manage AWS EC2 instance profiles that users can launch databricks.Cluster and access data, like databricks_mount.
 * * databricks.IpAccessList to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
 * * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
 * * databricks.getNodeType data to get the smallest node type for databricks.Cluster that fits search criteria, like amount of RAM or number of cores.
 * * databricks.Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
 * * databricks.getSparkVersion data to get [Databricks Runtime (DBR)](https://docs.databricks.com/runtime/dbr.html) version that could be used for `spark_version` parameter in databricks.Cluster and other resources.
 * * databricks.UserInstanceProfile to attach databricks.InstanceProfile (AWS) to databricks_user.
 * * databricks.WorkspaceConf to manage workspace configuration for expert usage.
 * 
 * ## Import
 * 
 * The resource cluster policy can be imported using the policy idbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/clusterPolicy:ClusterPolicy this &lt;cluster-policy-id&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/clusterPolicy:ClusterPolicy")
public class ClusterPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    @Export(name="definition", type=String.class, parameters={})
    private Output<String> definition;

    /**
     * @return Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
     * 
     */
    public Output<String> definition() {
        return this.definition;
    }
    /**
     * Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
     * 
     */
    @Export(name="maxClustersPerUser", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxClustersPerUser;

    /**
     * @return Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
     * 
     */
    public Output<Optional<Integer>> maxClustersPerUser() {
        return Codegen.optional(this.maxClustersPerUser);
    }
    /**
     * Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Canonical unique identifier for the cluster policy.
     * 
     */
    @Export(name="policyId", type=String.class, parameters={})
    private Output<String> policyId;

    /**
     * @return Canonical unique identifier for the cluster policy.
     * 
     */
    public Output<String> policyId() {
        return this.policyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ClusterPolicy(String name) {
        this(name, ClusterPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ClusterPolicy(String name, ClusterPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ClusterPolicy(String name, ClusterPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/clusterPolicy:ClusterPolicy", name, args == null ? ClusterPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ClusterPolicy(String name, Output<String> id, @Nullable ClusterPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/clusterPolicy:ClusterPolicy", name, state, makeResourceOptions(options, id));
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
    public static ClusterPolicy get(String name, Output<String> id, @Nullable ClusterPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ClusterPolicy(name, id, state, options);
    }
}
