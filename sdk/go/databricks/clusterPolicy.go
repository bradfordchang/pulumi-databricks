// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// This resource creates a cluster policy, which limits the ability to create clusters based on a set of rules. The policy rules limit the attributes or attribute values available for cluster creation. cluster policies have ACLs that limit their use to specific users and groups. Only admin users can create, edit, and delete policies. Admin users also have access to all policies.
//
// Cluster policies let you:
//
// * Limit users to create clusters with prescribed settings.
// * Simplify the user interface and enable more users to create their own clusters (by fixing and hiding some values).
// * Control cost by limiting per cluster maximum cost (by setting limits on attributes whose values contribute to hourly price).
//
// Cluster policy permissions limit which policies a user can select in the Policy drop-down when the user creates a cluster:
//
// * If no policies have been created in the workspace, the Policy drop-down does not display.
// * A user who has cluster create permission can select the `Free form` policy and create fully-configurable clusters.
// * A user who has both cluster create permission and access to cluster policies can select the Free form policy and policies they have access to.
// * A user that has access to only cluster policies, can select the policies they have access to.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * Dynamic Passthrough Clusters for a Group guide.
// * End to end workspace management guide.
// * getClusters data to retrieve a list of Cluster ids.
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * getCurrentUser data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
// * GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all Cluster and databricks_job.
// * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * IpAccessList to allow access from [predefined IP ranges](https://docs.databricks.com/security/network/ip-access-list.html).
// * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
// * getNodeType data to get the smallest node type for Cluster that fits search criteria, like amount of RAM or number of cores.
// * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
// * getSparkVersion data to get [Databricks Runtime (DBR)](https://docs.databricks.com/runtime/dbr.html) version that could be used for `sparkVersion` parameter in Cluster and other resources.
// * UserInstanceProfile to attach InstanceProfile (AWS) to databricks_user.
// * WorkspaceConf to manage workspace configuration for expert usage.
//
// ## Import
//
// # The resource cluster policy can be imported using the policy idbash
//
// ```sh
//
//	$ pulumi import databricks:index/clusterPolicy:ClusterPolicy this <cluster-policy-id>
//
// ```
type ClusterPolicy struct {
	pulumi.CustomResourceState

	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
	Definition pulumi.StringPtrOutput `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
	MaxClustersPerUser pulumi.IntPtrOutput `pulumi:"maxClustersPerUser"`
	// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
	Name pulumi.StringOutput `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
	PolicyFamilyDefinitionOverrides pulumi.StringPtrOutput `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
	PolicyFamilyId pulumi.StringPtrOutput `pulumi:"policyFamilyId"`
	// Canonical unique identifier for the cluster policy.
	PolicyId pulumi.StringOutput `pulumi:"policyId"`
}

// NewClusterPolicy registers a new resource with the given unique name, arguments, and options.
func NewClusterPolicy(ctx *pulumi.Context,
	name string, args *ClusterPolicyArgs, opts ...pulumi.ResourceOption) (*ClusterPolicy, error) {
	if args == nil {
		args = &ClusterPolicyArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterPolicy
	err := ctx.RegisterResource("databricks:index/clusterPolicy:ClusterPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterPolicy gets an existing ClusterPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterPolicyState, opts ...pulumi.ResourceOption) (*ClusterPolicy, error) {
	var resource ClusterPolicy
	err := ctx.ReadResource("databricks:index/clusterPolicy:ClusterPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterPolicy resources.
type clusterPolicyState struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
	Definition *string `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description *string `pulumi:"description"`
	// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
	MaxClustersPerUser *int `pulumi:"maxClustersPerUser"`
	// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
	Name *string `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
	PolicyFamilyDefinitionOverrides *string `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
	PolicyFamilyId *string `pulumi:"policyFamilyId"`
	// Canonical unique identifier for the cluster policy.
	PolicyId *string `pulumi:"policyId"`
}

type ClusterPolicyState struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
	Definition pulumi.StringPtrInput
	// Additional human-readable description of the cluster policy.
	Description pulumi.StringPtrInput
	// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
	MaxClustersPerUser pulumi.IntPtrInput
	// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
	Name pulumi.StringPtrInput
	// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
	PolicyFamilyDefinitionOverrides pulumi.StringPtrInput
	// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
	PolicyFamilyId pulumi.StringPtrInput
	// Canonical unique identifier for the cluster policy.
	PolicyId pulumi.StringPtrInput
}

func (ClusterPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterPolicyState)(nil)).Elem()
}

type clusterPolicyArgs struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
	Definition *string `pulumi:"definition"`
	// Additional human-readable description of the cluster policy.
	Description *string `pulumi:"description"`
	// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
	MaxClustersPerUser *int `pulumi:"maxClustersPerUser"`
	// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
	Name *string `pulumi:"name"`
	// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
	PolicyFamilyDefinitionOverrides *string `pulumi:"policyFamilyDefinitionOverrides"`
	// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
	PolicyFamilyId *string `pulumi:"policyFamilyId"`
}

// The set of arguments for constructing a ClusterPolicy resource.
type ClusterPolicyArgs struct {
	// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
	Definition pulumi.StringPtrInput
	// Additional human-readable description of the cluster policy.
	Description pulumi.StringPtrInput
	// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
	MaxClustersPerUser pulumi.IntPtrInput
	// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
	Name pulumi.StringPtrInput
	// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
	PolicyFamilyDefinitionOverrides pulumi.StringPtrInput
	// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
	PolicyFamilyId pulumi.StringPtrInput
}

func (ClusterPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterPolicyArgs)(nil)).Elem()
}

type ClusterPolicyInput interface {
	pulumi.Input

	ToClusterPolicyOutput() ClusterPolicyOutput
	ToClusterPolicyOutputWithContext(ctx context.Context) ClusterPolicyOutput
}

func (*ClusterPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterPolicy)(nil)).Elem()
}

func (i *ClusterPolicy) ToClusterPolicyOutput() ClusterPolicyOutput {
	return i.ToClusterPolicyOutputWithContext(context.Background())
}

func (i *ClusterPolicy) ToClusterPolicyOutputWithContext(ctx context.Context) ClusterPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPolicyOutput)
}

func (i *ClusterPolicy) ToOutput(ctx context.Context) pulumix.Output[*ClusterPolicy] {
	return pulumix.Output[*ClusterPolicy]{
		OutputState: i.ToClusterPolicyOutputWithContext(ctx).OutputState,
	}
}

// ClusterPolicyArrayInput is an input type that accepts ClusterPolicyArray and ClusterPolicyArrayOutput values.
// You can construct a concrete instance of `ClusterPolicyArrayInput` via:
//
//	ClusterPolicyArray{ ClusterPolicyArgs{...} }
type ClusterPolicyArrayInput interface {
	pulumi.Input

	ToClusterPolicyArrayOutput() ClusterPolicyArrayOutput
	ToClusterPolicyArrayOutputWithContext(context.Context) ClusterPolicyArrayOutput
}

type ClusterPolicyArray []ClusterPolicyInput

func (ClusterPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterPolicy)(nil)).Elem()
}

func (i ClusterPolicyArray) ToClusterPolicyArrayOutput() ClusterPolicyArrayOutput {
	return i.ToClusterPolicyArrayOutputWithContext(context.Background())
}

func (i ClusterPolicyArray) ToClusterPolicyArrayOutputWithContext(ctx context.Context) ClusterPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPolicyArrayOutput)
}

func (i ClusterPolicyArray) ToOutput(ctx context.Context) pulumix.Output[[]*ClusterPolicy] {
	return pulumix.Output[[]*ClusterPolicy]{
		OutputState: i.ToClusterPolicyArrayOutputWithContext(ctx).OutputState,
	}
}

// ClusterPolicyMapInput is an input type that accepts ClusterPolicyMap and ClusterPolicyMapOutput values.
// You can construct a concrete instance of `ClusterPolicyMapInput` via:
//
//	ClusterPolicyMap{ "key": ClusterPolicyArgs{...} }
type ClusterPolicyMapInput interface {
	pulumi.Input

	ToClusterPolicyMapOutput() ClusterPolicyMapOutput
	ToClusterPolicyMapOutputWithContext(context.Context) ClusterPolicyMapOutput
}

type ClusterPolicyMap map[string]ClusterPolicyInput

func (ClusterPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterPolicy)(nil)).Elem()
}

func (i ClusterPolicyMap) ToClusterPolicyMapOutput() ClusterPolicyMapOutput {
	return i.ToClusterPolicyMapOutputWithContext(context.Background())
}

func (i ClusterPolicyMap) ToClusterPolicyMapOutputWithContext(ctx context.Context) ClusterPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterPolicyMapOutput)
}

func (i ClusterPolicyMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClusterPolicy] {
	return pulumix.Output[map[string]*ClusterPolicy]{
		OutputState: i.ToClusterPolicyMapOutputWithContext(ctx).OutputState,
	}
}

type ClusterPolicyOutput struct{ *pulumi.OutputState }

func (ClusterPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterPolicy)(nil)).Elem()
}

func (o ClusterPolicyOutput) ToClusterPolicyOutput() ClusterPolicyOutput {
	return o
}

func (o ClusterPolicyOutput) ToClusterPolicyOutputWithContext(ctx context.Context) ClusterPolicyOutput {
	return o
}

func (o ClusterPolicyOutput) ToOutput(ctx context.Context) pulumix.Output[*ClusterPolicy] {
	return pulumix.Output[*ClusterPolicy]{
		OutputState: o.OutputState,
	}
}

// Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition). Cannot be used with `policyFamilyId`
func (o ClusterPolicyOutput) Definition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringPtrOutput { return v.Definition }).(pulumi.StringPtrOutput)
}

// Additional human-readable description of the cluster policy.
func (o ClusterPolicyOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Maximum number of clusters allowed per user. When omitted, there is no limit. If specified, value must be greater than zero.
func (o ClusterPolicyOutput) MaxClustersPerUser() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.IntPtrOutput { return v.MaxClustersPerUser }).(pulumi.IntPtrOutput)
}

// Cluster policy name. This must be unique. Length must be between 1 and 100 characters.
func (o ClusterPolicyOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Policy definition JSON document expressed in Databricks Policy Definition Language. The JSON document must be passed as a string and cannot be embedded in the requests. You can use this to customize the policy definition inherited from the policy family. Policy rules specified here are merged into the inherited policy definition.
func (o ClusterPolicyOutput) PolicyFamilyDefinitionOverrides() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringPtrOutput { return v.PolicyFamilyDefinitionOverrides }).(pulumi.StringPtrOutput)
}

// ID of the policy family. The cluster policy's policy definition inherits the policy family's policy definition. Cannot be used with `definition`. Use `policyFamilyDefinitionOverrides` instead to customize the policy definition.
func (o ClusterPolicyOutput) PolicyFamilyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringPtrOutput { return v.PolicyFamilyId }).(pulumi.StringPtrOutput)
}

// Canonical unique identifier for the cluster policy.
func (o ClusterPolicyOutput) PolicyId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterPolicy) pulumi.StringOutput { return v.PolicyId }).(pulumi.StringOutput)
}

type ClusterPolicyArrayOutput struct{ *pulumi.OutputState }

func (ClusterPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterPolicy)(nil)).Elem()
}

func (o ClusterPolicyArrayOutput) ToClusterPolicyArrayOutput() ClusterPolicyArrayOutput {
	return o
}

func (o ClusterPolicyArrayOutput) ToClusterPolicyArrayOutputWithContext(ctx context.Context) ClusterPolicyArrayOutput {
	return o
}

func (o ClusterPolicyArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ClusterPolicy] {
	return pulumix.Output[[]*ClusterPolicy]{
		OutputState: o.OutputState,
	}
}

func (o ClusterPolicyArrayOutput) Index(i pulumi.IntInput) ClusterPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterPolicy {
		return vs[0].([]*ClusterPolicy)[vs[1].(int)]
	}).(ClusterPolicyOutput)
}

type ClusterPolicyMapOutput struct{ *pulumi.OutputState }

func (ClusterPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterPolicy)(nil)).Elem()
}

func (o ClusterPolicyMapOutput) ToClusterPolicyMapOutput() ClusterPolicyMapOutput {
	return o
}

func (o ClusterPolicyMapOutput) ToClusterPolicyMapOutputWithContext(ctx context.Context) ClusterPolicyMapOutput {
	return o
}

func (o ClusterPolicyMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ClusterPolicy] {
	return pulumix.Output[map[string]*ClusterPolicy]{
		OutputState: o.OutputState,
	}
}

func (o ClusterPolicyMapOutput) MapIndex(k pulumi.StringInput) ClusterPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterPolicy {
		return vs[0].(map[string]*ClusterPolicy)[vs[1].(string)]
	}).(ClusterPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPolicyInput)(nil)).Elem(), &ClusterPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPolicyArrayInput)(nil)).Elem(), ClusterPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterPolicyMapInput)(nil)).Elem(), ClusterPolicyMap{})
	pulumi.RegisterOutputType(ClusterPolicyOutput{})
	pulumi.RegisterOutputType(ClusterPolicyArrayOutput{})
	pulumi.RegisterOutputType(ClusterPolicyMapOutput{})
}
