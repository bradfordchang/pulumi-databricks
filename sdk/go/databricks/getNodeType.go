// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** If you have a fully automated setup with workspaces created by databricks_mws_workspaces, please make sure to add dependsOn attribute in order to prevent _default auth: cannot configure default credentials_ errors.
//
// Gets the smallest node type for Cluster that fits search criteria, like amount of RAM or number of cores. [AWS](https://databricks.com/product/aws-pricing/instance-types) or [Azure](https://azure.microsoft.com/en-us/pricing/details/databricks/). Internally data source fetches [node types](https://docs.databricks.com/dev-tools/api/latest/clusters.html#list-node-types) available per cloud, similar to executing `databricks clusters list-node-types`, and filters it to return the smallest possible node with criteria.
//
// > **Note** This is experimental functionality, which aims to simplify things. In case of wrong parameters given (e.g. `minGpus = 876`) or no nodes matching, data source will return cloud-default node type, even though it doesn't match search criteria specified by data source arguments: [i3.xlarge](https://aws.amazon.com/ec2/instance-types/i3/) for AWS or [Standard_D3_v2](https://docs.microsoft.com/en-us/azure/cloud-services/cloud-services-sizes-specs#dv2-series) for Azure.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			withGpu, err := databricks.GetNodeType(ctx, &databricks.GetNodeTypeArgs{
//				LocalDisk: pulumi.BoolRef(true),
//				MinCores:  pulumi.IntRef(16),
//				GbPerCore: pulumi.IntRef(1),
//				MinGpus:   pulumi.IntRef(1),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			gpuMl, err := databricks.GetSparkVersion(ctx, &databricks.GetSparkVersionArgs{
//				Gpu: pulumi.BoolRef(true),
//				Ml:  pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewCluster(ctx, "research", &databricks.ClusterArgs{
//				ClusterName:            pulumi.String("Research Cluster"),
//				SparkVersion:           *pulumi.String(gpuMl.Id),
//				NodeTypeId:             *pulumi.String(withGpu.Id),
//				AutoterminationMinutes: pulumi.Int(20),
//				Autoscale: &databricks.ClusterAutoscaleArgs{
//					MinWorkers: pulumi.Int(1),
//					MaxWorkers: pulumi.Int(50),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide.
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
// * InstancePool to manage [instance pools](https://docs.databricks.com/clusters/instance-pools/index.html) to reduce cluster start and auto-scaling times by maintaining a set of idle, ready-to-use instances.
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
func GetNodeType(ctx *pulumi.Context, args *GetNodeTypeArgs, opts ...pulumi.InvokeOption) (*GetNodeTypeResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetNodeTypeResult
	err := ctx.Invoke("databricks:index/getNodeType:getNodeType", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNodeType.
type GetNodeTypeArgs struct {
	// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
	// * `General Purpose` (all clouds)
	// * `General Purpose (HDD)` (Azure)
	// * `Compute Optimized` (all clouds)
	// * `Memory Optimized` (all clouds)
	// * `Memory Optimized (Remote HDD)` (Azure)
	// * `Storage Optimized` (AWS, Azure)
	// * `GPU Accelerated` (AWS, Azure)
	Category *string `pulumi:"category"`
	// if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
	Fleet *bool `pulumi:"fleet"`
	// Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
	GbPerCore *int `pulumi:"gbPerCore"`
	// if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
	Graviton *bool `pulumi:"graviton"`
	// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
	Id *string `pulumi:"id"`
	// . Pick only nodes that have IO Cache. Defaults to *false*.
	IsIoCacheEnabled *bool `pulumi:"isIoCacheEnabled"`
	// Pick only nodes with local storage. Defaults to *false*.
	LocalDisk *bool `pulumi:"localDisk"`
	// Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
	LocalDiskMinSize *int `pulumi:"localDiskMinSize"`
	// Minimum number of CPU cores available on instance. Defaults to *0*.
	MinCores *int `pulumi:"minCores"`
	// Minimum number of GPU's attached to instance. Defaults to *0*.
	MinGpus *int `pulumi:"minGpus"`
	// Minimum amount of memory per node in gigabytes. Defaults to *0*.
	MinMemoryGb *int `pulumi:"minMemoryGb"`
	// Pick only nodes that can run Photon driver. Defaults to *false*.
	PhotonDriverCapable *bool `pulumi:"photonDriverCapable"`
	// Pick only nodes that can run Photon workers. Defaults to *false*.
	PhotonWorkerCapable *bool `pulumi:"photonWorkerCapable"`
	// Pick only nodes that support port forwarding. Defaults to *false*.
	SupportPortForwarding *bool `pulumi:"supportPortForwarding"`
}

// A collection of values returned by getNodeType.
type GetNodeTypeResult struct {
	Category  *string `pulumi:"category"`
	Fleet     *bool   `pulumi:"fleet"`
	GbPerCore *int    `pulumi:"gbPerCore"`
	Graviton  *bool   `pulumi:"graviton"`
	// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
	Id                    string `pulumi:"id"`
	IsIoCacheEnabled      *bool  `pulumi:"isIoCacheEnabled"`
	LocalDisk             *bool  `pulumi:"localDisk"`
	LocalDiskMinSize      *int   `pulumi:"localDiskMinSize"`
	MinCores              *int   `pulumi:"minCores"`
	MinGpus               *int   `pulumi:"minGpus"`
	MinMemoryGb           *int   `pulumi:"minMemoryGb"`
	PhotonDriverCapable   *bool  `pulumi:"photonDriverCapable"`
	PhotonWorkerCapable   *bool  `pulumi:"photonWorkerCapable"`
	SupportPortForwarding *bool  `pulumi:"supportPortForwarding"`
}

func GetNodeTypeOutput(ctx *pulumi.Context, args GetNodeTypeOutputArgs, opts ...pulumi.InvokeOption) GetNodeTypeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetNodeTypeResult, error) {
			args := v.(GetNodeTypeArgs)
			r, err := GetNodeType(ctx, &args, opts...)
			var s GetNodeTypeResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetNodeTypeResultOutput)
}

// A collection of arguments for invoking getNodeType.
type GetNodeTypeOutputArgs struct {
	// Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq '.node_types[]|.category'|sort |uniq`):
	// * `General Purpose` (all clouds)
	// * `General Purpose (HDD)` (Azure)
	// * `Compute Optimized` (all clouds)
	// * `Memory Optimized` (all clouds)
	// * `Memory Optimized (Remote HDD)` (Azure)
	// * `Storage Optimized` (AWS, Azure)
	// * `GPU Accelerated` (AWS, Azure)
	Category pulumi.StringPtrInput `pulumi:"category"`
	// if we should limit the search only to [AWS fleet instance types](https://docs.databricks.com/compute/aws-fleet-instances.html). Default to *false*.
	Fleet pulumi.BoolPtrInput `pulumi:"fleet"`
	// Number of gigabytes per core available on instance. Conflicts with `minMemoryGb`. Defaults to *0*.
	GbPerCore pulumi.IntPtrInput `pulumi:"gbPerCore"`
	// if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
	Graviton pulumi.BoolPtrInput `pulumi:"graviton"`
	// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
	Id pulumi.StringPtrInput `pulumi:"id"`
	// . Pick only nodes that have IO Cache. Defaults to *false*.
	IsIoCacheEnabled pulumi.BoolPtrInput `pulumi:"isIoCacheEnabled"`
	// Pick only nodes with local storage. Defaults to *false*.
	LocalDisk pulumi.BoolPtrInput `pulumi:"localDisk"`
	// Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
	LocalDiskMinSize pulumi.IntPtrInput `pulumi:"localDiskMinSize"`
	// Minimum number of CPU cores available on instance. Defaults to *0*.
	MinCores pulumi.IntPtrInput `pulumi:"minCores"`
	// Minimum number of GPU's attached to instance. Defaults to *0*.
	MinGpus pulumi.IntPtrInput `pulumi:"minGpus"`
	// Minimum amount of memory per node in gigabytes. Defaults to *0*.
	MinMemoryGb pulumi.IntPtrInput `pulumi:"minMemoryGb"`
	// Pick only nodes that can run Photon driver. Defaults to *false*.
	PhotonDriverCapable pulumi.BoolPtrInput `pulumi:"photonDriverCapable"`
	// Pick only nodes that can run Photon workers. Defaults to *false*.
	PhotonWorkerCapable pulumi.BoolPtrInput `pulumi:"photonWorkerCapable"`
	// Pick only nodes that support port forwarding. Defaults to *false*.
	SupportPortForwarding pulumi.BoolPtrInput `pulumi:"supportPortForwarding"`
}

func (GetNodeTypeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypeArgs)(nil)).Elem()
}

// A collection of values returned by getNodeType.
type GetNodeTypeResultOutput struct{ *pulumi.OutputState }

func (GetNodeTypeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetNodeTypeResult)(nil)).Elem()
}

func (o GetNodeTypeResultOutput) ToGetNodeTypeResultOutput() GetNodeTypeResultOutput {
	return o
}

func (o GetNodeTypeResultOutput) ToGetNodeTypeResultOutputWithContext(ctx context.Context) GetNodeTypeResultOutput {
	return o
}

func (o GetNodeTypeResultOutput) Category() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *string { return v.Category }).(pulumi.StringPtrOutput)
}

func (o GetNodeTypeResultOutput) Fleet() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.Fleet }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) GbPerCore() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.GbPerCore }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) Graviton() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.Graviton }).(pulumi.BoolPtrOutput)
}

// node type, that can be used for databricks_job, databricks_cluster, or databricks_instance_pool.
func (o GetNodeTypeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetNodeTypeResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetNodeTypeResultOutput) IsIoCacheEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.IsIoCacheEnabled }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) LocalDisk() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.LocalDisk }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) LocalDiskMinSize() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.LocalDiskMinSize }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) MinCores() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinCores }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) MinGpus() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinGpus }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) MinMemoryGb() pulumi.IntPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *int { return v.MinMemoryGb }).(pulumi.IntPtrOutput)
}

func (o GetNodeTypeResultOutput) PhotonDriverCapable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.PhotonDriverCapable }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) PhotonWorkerCapable() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.PhotonWorkerCapable }).(pulumi.BoolPtrOutput)
}

func (o GetNodeTypeResultOutput) SupportPortForwarding() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetNodeTypeResult) *bool { return v.SupportPortForwarding }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetNodeTypeResultOutput{})
}
