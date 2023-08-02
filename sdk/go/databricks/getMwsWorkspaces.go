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
// Lists all MwsWorkspaces in Databricks Account.
//
// > **Note** `accountId` provider configuration property is required for this resource to work.
//
// ## Example Usage
//
// # Listing all workspaces in
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
//			all, err := databricks.LookupMwsWorkspaces(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			ctx.Export("allMwsWorkspaces", all.Ids)
//			return nil
//		})
//	}
//
// ```
// ## Related Resources
//
// The following resources are used in the same context:
//
// * MwsWorkspaces to manage Databricks E2 Workspaces.
// * MetastoreAssignment
func LookupMwsWorkspaces(ctx *pulumi.Context, args *LookupMwsWorkspacesArgs, opts ...pulumi.InvokeOption) (*LookupMwsWorkspacesResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupMwsWorkspacesResult
	err := ctx.Invoke("databricks:index/getMwsWorkspaces:getMwsWorkspaces", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMwsWorkspaces.
type LookupMwsWorkspacesArgs struct {
	// name-to-id map for all of the workspaces in the account
	Ids map[string]interface{} `pulumi:"ids"`
}

// A collection of values returned by getMwsWorkspaces.
type LookupMwsWorkspacesResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// name-to-id map for all of the workspaces in the account
	Ids map[string]interface{} `pulumi:"ids"`
}

func LookupMwsWorkspacesOutput(ctx *pulumi.Context, args LookupMwsWorkspacesOutputArgs, opts ...pulumi.InvokeOption) LookupMwsWorkspacesResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupMwsWorkspacesResult, error) {
			args := v.(LookupMwsWorkspacesArgs)
			r, err := LookupMwsWorkspaces(ctx, &args, opts...)
			var s LookupMwsWorkspacesResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupMwsWorkspacesResultOutput)
}

// A collection of arguments for invoking getMwsWorkspaces.
type LookupMwsWorkspacesOutputArgs struct {
	// name-to-id map for all of the workspaces in the account
	Ids pulumi.MapInput `pulumi:"ids"`
}

func (LookupMwsWorkspacesOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMwsWorkspacesArgs)(nil)).Elem()
}

// A collection of values returned by getMwsWorkspaces.
type LookupMwsWorkspacesResultOutput struct{ *pulumi.OutputState }

func (LookupMwsWorkspacesResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupMwsWorkspacesResult)(nil)).Elem()
}

func (o LookupMwsWorkspacesResultOutput) ToLookupMwsWorkspacesResultOutput() LookupMwsWorkspacesResultOutput {
	return o
}

func (o LookupMwsWorkspacesResultOutput) ToLookupMwsWorkspacesResultOutputWithContext(ctx context.Context) LookupMwsWorkspacesResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o LookupMwsWorkspacesResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupMwsWorkspacesResult) string { return v.Id }).(pulumi.StringOutput)
}

// name-to-id map for all of the workspaces in the account
func (o LookupMwsWorkspacesResultOutput) Ids() pulumi.MapOutput {
	return o.ApplyT(func(v LookupMwsWorkspacesResult) map[string]interface{} { return v.Ids }).(pulumi.MapOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupMwsWorkspacesResultOutput{})
}
