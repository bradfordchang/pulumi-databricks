// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// Getting the existing cluster id of specific Job by name or by id:
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
//			this, err := databricks.LookupJob(ctx, &GetJobArgs{
//				JobName: pulumi.StringRef("My job"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("clusterId", this.JobSettings.Settings.NewCluster.NumWorkers)
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * getJobs data to get all jobs and their names from a workspace.
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
func LookupJob(ctx *pulumi.Context, args *LookupJobArgs, opts ...pulumi.InvokeOption) (*LookupJobResult, error) {
	var rv LookupJobResult
	err := ctx.Invoke("databricks:index/getJob:getJob", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getJob.
type LookupJobArgs struct {
	// the id of Job if the resource was matched by name.
	JobId *string `pulumi:"jobId"`
	// the job name of Job if the resource was matched by id.
	JobName *string `pulumi:"jobName"`
	// the same fields as in databricks_job.
	JobSettings *GetJobJobSettings `pulumi:"jobSettings"`
}

// A collection of values returned by getJob.
type LookupJobResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// the id of Job if the resource was matched by name.
	JobId string `pulumi:"jobId"`
	// the job name of Job if the resource was matched by id.
	JobName string `pulumi:"jobName"`
	// the same fields as in databricks_job.
	JobSettings GetJobJobSettings `pulumi:"jobSettings"`
}

func LookupJobOutput(ctx *pulumi.Context, args LookupJobOutputArgs, opts ...pulumi.InvokeOption) LookupJobResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupJobResult, error) {
			args := v.(LookupJobArgs)
			r, err := LookupJob(ctx, &args, opts...)
			var s LookupJobResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupJobResultOutput)
}

// A collection of arguments for invoking getJob.
type LookupJobOutputArgs struct {
	// the id of Job if the resource was matched by name.
	JobId pulumi.StringPtrInput `pulumi:"jobId"`
	// the job name of Job if the resource was matched by id.
	JobName pulumi.StringPtrInput `pulumi:"jobName"`
	// the same fields as in databricks_job.
	JobSettings GetJobJobSettingsPtrInput `pulumi:"jobSettings"`
}

func (LookupJobOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJobArgs)(nil)).Elem()
}

// A collection of values returned by getJob.
type LookupJobResultOutput struct{ *pulumi.OutputState }

func (LookupJobResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupJobResult)(nil)).Elem()
}

func (o LookupJobResultOutput) ToLookupJobResultOutput() LookupJobResultOutput {
	return o
}

func (o LookupJobResultOutput) ToLookupJobResultOutputWithContext(ctx context.Context) LookupJobResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupJobResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.Id }).(pulumi.StringOutput)
}

// the id of Job if the resource was matched by name.
func (o LookupJobResultOutput) JobId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.JobId }).(pulumi.StringOutput)
}

// the job name of Job if the resource was matched by id.
func (o LookupJobResultOutput) JobName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupJobResult) string { return v.JobName }).(pulumi.StringOutput)
}

// the same fields as in databricks_job.
func (o LookupJobResultOutput) JobSettings() GetJobJobSettingsOutput {
	return o.ApplyT(func(v LookupJobResult) GetJobJobSettings { return v.JobSettings }).(GetJobJobSettingsOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupJobResultOutput{})
}
