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

// ## Example Usage
//
// Granting `SELECT` and `MODIFY` to `sensitive` group on all views in a _things_ Schema from _sandbox_ databricks_catalog.
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
//			thingsViews, err := databricks.GetViews(ctx, &databricks.GetViewsArgs{
//				CatalogName: "sandbox",
//				SchemaName:  "things",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			var thingsGrants []*databricks.Grants
//			for key0, val0 := range thingsViews.Ids {
//				__res, err := databricks.NewGrants(ctx, fmt.Sprintf("thingsGrants-%v", key0), &databricks.GrantsArgs{
//					View: pulumi.String(val0),
//					Grants: databricks.GrantsGrantArray{
//						&databricks.GrantsGrantArgs{
//							Principal: pulumi.String("sensitive"),
//							Privileges: pulumi.StringArray{
//								pulumi.String("SELECT"),
//								pulumi.String("MODIFY"),
//							},
//						},
//					},
//				})
//				if err != nil {
//					return err
//				}
//				thingsGrants = append(thingsGrants, __res)
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
// * Schema to manage schemas within Unity Catalog.
// * Catalog to manage catalogs within Unity Catalog.
func GetViews(ctx *pulumi.Context, args *GetViewsArgs, opts ...pulumi.InvokeOption) (*GetViewsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetViewsResult
	err := ctx.Invoke("databricks:index/getViews:getViews", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getViews.
type GetViewsArgs struct {
	// Name of databricks_catalog
	CatalogName string `pulumi:"catalogName"`
	// set of databricksView full names: *`catalog`.`schema`.`view`*
	Ids []string `pulumi:"ids"`
	// Name of databricks_schema
	SchemaName string `pulumi:"schemaName"`
}

// A collection of values returned by getViews.
type GetViewsResult struct {
	CatalogName string `pulumi:"catalogName"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// set of databricksView full names: *`catalog`.`schema`.`view`*
	Ids        []string `pulumi:"ids"`
	SchemaName string   `pulumi:"schemaName"`
}

func GetViewsOutput(ctx *pulumi.Context, args GetViewsOutputArgs, opts ...pulumi.InvokeOption) GetViewsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetViewsResult, error) {
			args := v.(GetViewsArgs)
			r, err := GetViews(ctx, &args, opts...)
			var s GetViewsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetViewsResultOutput)
}

// A collection of arguments for invoking getViews.
type GetViewsOutputArgs struct {
	// Name of databricks_catalog
	CatalogName pulumi.StringInput `pulumi:"catalogName"`
	// set of databricksView full names: *`catalog`.`schema`.`view`*
	Ids pulumi.StringArrayInput `pulumi:"ids"`
	// Name of databricks_schema
	SchemaName pulumi.StringInput `pulumi:"schemaName"`
}

func (GetViewsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetViewsArgs)(nil)).Elem()
}

// A collection of values returned by getViews.
type GetViewsResultOutput struct{ *pulumi.OutputState }

func (GetViewsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetViewsResult)(nil)).Elem()
}

func (o GetViewsResultOutput) ToGetViewsResultOutput() GetViewsResultOutput {
	return o
}

func (o GetViewsResultOutput) ToGetViewsResultOutputWithContext(ctx context.Context) GetViewsResultOutput {
	return o
}

func (o GetViewsResultOutput) ToOutput(ctx context.Context) pulumix.Output[GetViewsResult] {
	return pulumix.Output[GetViewsResult]{
		OutputState: o.OutputState,
	}
}

func (o GetViewsResultOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.CatalogName }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

// set of databricksView full names: *`catalog`.`schema`.`view`*
func (o GetViewsResultOutput) Ids() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetViewsResult) []string { return v.Ids }).(pulumi.StringArrayOutput)
}

func (o GetViewsResultOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v GetViewsResult) string { return v.SchemaName }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetViewsResultOutput{})
}
