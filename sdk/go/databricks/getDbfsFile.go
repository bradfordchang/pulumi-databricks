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
//			_, err := databricks.LookupDbfsFile(ctx, &databricks.LookupDbfsFileArgs{
//				LimitFileSize: true,
//				Path:          "dbfs:/reports/some.csv",
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
// * getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
func LookupDbfsFile(ctx *pulumi.Context, args *LookupDbfsFileArgs, opts ...pulumi.InvokeOption) (*LookupDbfsFileResult, error) {
	var rv LookupDbfsFileResult
	err := ctx.Invoke("databricks:index/getDbfsFile:getDbfsFile", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getDbfsFile.
type LookupDbfsFileArgs struct {
	// Do not load content for files larger than 4MB.
	LimitFileSize bool `pulumi:"limitFileSize"`
	// Path on DBFS for the file from which to get content.
	Path string `pulumi:"path"`
}

// A collection of values returned by getDbfsFile.
type LookupDbfsFileResult struct {
	// base64-encoded file contents
	Content string `pulumi:"content"`
	// size of the file in bytes
	FileSize int `pulumi:"fileSize"`
	// The provider-assigned unique ID for this managed resource.
	Id            string `pulumi:"id"`
	LimitFileSize bool   `pulumi:"limitFileSize"`
	Path          string `pulumi:"path"`
}

func LookupDbfsFileOutput(ctx *pulumi.Context, args LookupDbfsFileOutputArgs, opts ...pulumi.InvokeOption) LookupDbfsFileResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupDbfsFileResult, error) {
			args := v.(LookupDbfsFileArgs)
			r, err := LookupDbfsFile(ctx, &args, opts...)
			var s LookupDbfsFileResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupDbfsFileResultOutput)
}

// A collection of arguments for invoking getDbfsFile.
type LookupDbfsFileOutputArgs struct {
	// Do not load content for files larger than 4MB.
	LimitFileSize pulumi.BoolInput `pulumi:"limitFileSize"`
	// Path on DBFS for the file from which to get content.
	Path pulumi.StringInput `pulumi:"path"`
}

func (LookupDbfsFileOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDbfsFileArgs)(nil)).Elem()
}

// A collection of values returned by getDbfsFile.
type LookupDbfsFileResultOutput struct{ *pulumi.OutputState }

func (LookupDbfsFileResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupDbfsFileResult)(nil)).Elem()
}

func (o LookupDbfsFileResultOutput) ToLookupDbfsFileResultOutput() LookupDbfsFileResultOutput {
	return o
}

func (o LookupDbfsFileResultOutput) ToLookupDbfsFileResultOutputWithContext(ctx context.Context) LookupDbfsFileResultOutput {
	return o
}

// base64-encoded file contents
func (o LookupDbfsFileResultOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbfsFileResult) string { return v.Content }).(pulumi.StringOutput)
}

// size of the file in bytes
func (o LookupDbfsFileResultOutput) FileSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupDbfsFileResult) int { return v.FileSize }).(pulumi.IntOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupDbfsFileResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbfsFileResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupDbfsFileResultOutput) LimitFileSize() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupDbfsFileResult) bool { return v.LimitFileSize }).(pulumi.BoolOutput)
}

func (o LookupDbfsFileResultOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v LookupDbfsFileResult) string { return v.Path }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupDbfsFileResultOutput{})
}
