// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Retrieve all clusters on this workspace on AWS or GCP:
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
//			_, err := databricks.GetClusters(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// Retrieve all clusters with "Shared" in their cluster name on this Azure Databricks workspace:
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
//			_, err := databricks.GetClusters(ctx, &databricks.GetClustersArgs{
//				ClusterNameContains: pulumi.StringRef("shared"),
//			}, nil)
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
// * Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
// * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
func GetClusters(ctx *pulumi.Context, args *GetClustersArgs, opts ...pulumi.InvokeOption) (*GetClustersResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetClustersResult
	err := ctx.Invoke("databricks:index/getClusters:getClusters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getClusters.
type GetClustersArgs struct {
	// Only return Cluster ids that match the given name string.
	ClusterNameContains *string `pulumi:"clusterNameContains"`
}

// A collection of values returned by getClusters.
type GetClustersResult struct {
	ClusterNameContains *string `pulumi:"clusterNameContains"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// list of Cluster ids
	Ids []string `pulumi:"ids"`
}

func GetClustersOutput(ctx *pulumi.Context, args GetClustersOutputArgs, opts ...pulumi.InvokeOption) GetClustersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetClustersResult, error) {
			args := v.(GetClustersArgs)
			r, err := GetClusters(ctx, &args, opts...)
			var s GetClustersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetClustersResultOutput)
}

// A collection of arguments for invoking getClusters.
type GetClustersOutputArgs struct {
	// Only return Cluster ids that match the given name string.
	ClusterNameContains pulumi.StringPtrInput `pulumi:"clusterNameContains"`
}

func (GetClustersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersArgs)(nil)).Elem()
}

// A collection of values returned by getClusters.
type GetClustersResultOutput struct{ *pulumi.OutputState }

func (GetClustersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetClustersResult)(nil)).Elem()
}

func (o GetClustersResultOutput) ToGetClustersResultOutput() GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ToGetClustersResultOutputWithContext(ctx context.Context) GetClustersResultOutput {
	return o
}

func (o GetClustersResultOutput) ClusterNameContains() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetClustersResult) *string { return v.ClusterNameContains }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetClustersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetClustersResult) string { return v.Id }).(pulumi.StringOutput)
}

// list of Cluster ids
func (o GetClustersResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetClustersResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetClustersResultOutput{})
}
