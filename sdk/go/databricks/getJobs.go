// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Related Resources
//
// The following resources are used in the same context:
//
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
func GetJobs(ctx *pulumi.Context, args *GetJobsArgs, opts ...pulumi.InvokeOption) (*GetJobsResult, error) {
	var rv GetJobsResult
	err := ctx.Invoke("databricks:index/getJobs:getJobs", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJobs.
type GetJobsArgs struct {
	// map of Job names to ids
	Ids map[string]interface{} `pulumi:"ids"`
}

// A collection of values returned by getJobs.
type GetJobsResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// map of Job names to ids
	Ids map[string]interface{} `pulumi:"ids"`
}

func GetJobsOutput(ctx *pulumi.Context, args GetJobsOutputArgs, opts ...pulumi.InvokeOption) GetJobsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetJobsResult, error) {
			args := v.(GetJobsArgs)
			r, err := GetJobs(ctx, &args, opts...)
			var s GetJobsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetJobsResultOutput)
}

// A collection of arguments for invoking getJobs.
type GetJobsOutputArgs struct {
	// map of Job names to ids
	Ids pulumi.MapInput `pulumi:"ids"`
}

func (GetJobsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobsArgs)(nil)).Elem()
}

// A collection of values returned by getJobs.
type GetJobsResultOutput struct{ *pulumi.OutputState }

func (GetJobsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetJobsResult)(nil)).Elem()
}

func (o GetJobsResultOutput) ToGetJobsResultOutput() GetJobsResultOutput {
	return o
}

func (o GetJobsResultOutput) ToGetJobsResultOutputWithContext(ctx context.Context) GetJobsResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetJobsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetJobsResult) string { return v.Id }).(pulumi.StringOutput)
}

// map of Job names to ids
func (o GetJobsResultOutput) Ids() pulumi.MapOutput {
	return o.ApplyT(func(v GetJobsResult) map[string]interface{} { return v.Ids }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(GetJobsResultOutput{})
}
