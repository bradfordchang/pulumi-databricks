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
//			_, err := databricks.LookupDirectory(ctx, &databricks.LookupDirectoryArgs{
//				Path: "/Production",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupDirectory(ctx *pulumi.Context, args *LookupDirectoryArgs, opts ...pulumi.InvokeOption) (*LookupDirectoryResult, error) {
	var rv LookupDirectoryResult
	err := ctx.Invoke("databricks:index/getDirectory:getDirectory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDirectory.
type LookupDirectoryArgs struct {
	// directory object ID
	ObjectId *int `pulumi:"objectId"`
	// Path to a directory in the workspace
	Path string `pulumi:"path"`
}

// A collection of values returned by getDirectory.
type LookupDirectoryResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// directory object ID
	ObjectId int    `pulumi:"objectId"`
	Path     string `pulumi:"path"`
}

func LookupDirectoryOutput(ctx *pulumi.Context, args LookupDirectoryOutputArgs, opts ...pulumi.InvokeOption) LookupDirectoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDirectoryResult, error) {
			args := v.(LookupDirectoryArgs)
			r, err := LookupDirectory(ctx, &args, opts...)
			var s LookupDirectoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDirectoryResultOutput)
}

// A collection of arguments for invoking getDirectory.
type LookupDirectoryOutputArgs struct {
	// directory object ID
	ObjectId pulumi.IntPtrInput `pulumi:"objectId"`
	// Path to a directory in the workspace
	Path pulumi.StringInput `pulumi:"path"`
}

func (LookupDirectoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDirectoryArgs)(nil)).Elem()
}

// A collection of values returned by getDirectory.
type LookupDirectoryResultOutput struct{ *pulumi.OutputState }

func (LookupDirectoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDirectoryResult)(nil)).Elem()
}

func (o LookupDirectoryResultOutput) ToLookupDirectoryResultOutput() LookupDirectoryResultOutput {
	return o
}

func (o LookupDirectoryResultOutput) ToLookupDirectoryResultOutputWithContext(ctx context.Context) LookupDirectoryResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDirectoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// directory object ID
func (o LookupDirectoryResultOutput) ObjectId() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDirectoryResult) int { return v.ObjectId }).(pulumi.IntOutput)
}

func (o LookupDirectoryResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDirectoryResult) string { return v.Path }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDirectoryResultOutput{})
}
