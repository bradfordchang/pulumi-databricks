// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A single Metastore can be shared across Databricks workspaces, and each linked workspace has a consistent view of the data and a single set of access policies. It is only recommended to have multiple metastores when organizations wish to have hard isolation boundaries between data (note that data cannot be easily joined/queried across metastores).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			thisMetastore, err := databricks.NewMetastore(ctx, "thisMetastore", &databricks.MetastoreArgs{
//				StorageRoot:  pulumi.String(fmt.Sprintf("s3://%v/metastore", aws_s3_bucket.Metastore.Id)),
//				Owner:        pulumi.String("uc admins"),
//				ForceDestroy: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMetastoreAssignment(ctx, "thisMetastoreAssignment", &databricks.MetastoreAssignmentArgs{
//				MetastoreId: thisMetastore.ID(),
//				WorkspaceId: pulumi.Any(local.Workspace_id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type MetastoreAssignment struct {
	pulumi.CustomResourceState

	// Default catalog used for this assignment, default to `hiveMetastore`
	DefaultCatalogName pulumi.StringPtrOutput `pulumi:"defaultCatalogName"`
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringOutput `pulumi:"metastoreId"`
	// id of the workspace for the assignment
	WorkspaceId pulumi.IntOutput `pulumi:"workspaceId"`
}

// NewMetastoreAssignment registers a new resource with the given unique name, arguments, and options.
func NewMetastoreAssignment(ctx *pulumi.Context,
	name string, args *MetastoreAssignmentArgs, opts ...pulumi.ResourceOption) (*MetastoreAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MetastoreId == nil {
		return nil, errors.New("invalid value for required argument 'MetastoreId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	var resource MetastoreAssignment
	err := ctx.RegisterResource("databricks:index/metastoreAssignment:MetastoreAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMetastoreAssignment gets an existing MetastoreAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMetastoreAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MetastoreAssignmentState, opts ...pulumi.ResourceOption) (*MetastoreAssignment, error) {
	var resource MetastoreAssignment
	err := ctx.ReadResource("databricks:index/metastoreAssignment:MetastoreAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MetastoreAssignment resources.
type metastoreAssignmentState struct {
	// Default catalog used for this assignment, default to `hiveMetastore`
	DefaultCatalogName *string `pulumi:"defaultCatalogName"`
	// Unique identifier of the parent Metastore
	MetastoreId *string `pulumi:"metastoreId"`
	// id of the workspace for the assignment
	WorkspaceId *int `pulumi:"workspaceId"`
}

type MetastoreAssignmentState struct {
	// Default catalog used for this assignment, default to `hiveMetastore`
	DefaultCatalogName pulumi.StringPtrInput
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringPtrInput
	// id of the workspace for the assignment
	WorkspaceId pulumi.IntPtrInput
}

func (MetastoreAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreAssignmentState)(nil)).Elem()
}

type metastoreAssignmentArgs struct {
	// Default catalog used for this assignment, default to `hiveMetastore`
	DefaultCatalogName *string `pulumi:"defaultCatalogName"`
	// Unique identifier of the parent Metastore
	MetastoreId string `pulumi:"metastoreId"`
	// id of the workspace for the assignment
	WorkspaceId int `pulumi:"workspaceId"`
}

// The set of arguments for constructing a MetastoreAssignment resource.
type MetastoreAssignmentArgs struct {
	// Default catalog used for this assignment, default to `hiveMetastore`
	DefaultCatalogName pulumi.StringPtrInput
	// Unique identifier of the parent Metastore
	MetastoreId pulumi.StringInput
	// id of the workspace for the assignment
	WorkspaceId pulumi.IntInput
}

func (MetastoreAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*metastoreAssignmentArgs)(nil)).Elem()
}

type MetastoreAssignmentInput interface {
	pulumi.Input

	ToMetastoreAssignmentOutput() MetastoreAssignmentOutput
	ToMetastoreAssignmentOutputWithContext(ctx context.Context) MetastoreAssignmentOutput
}

func (*MetastoreAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreAssignment)(nil)).Elem()
}

func (i *MetastoreAssignment) ToMetastoreAssignmentOutput() MetastoreAssignmentOutput {
	return i.ToMetastoreAssignmentOutputWithContext(context.Background())
}

func (i *MetastoreAssignment) ToMetastoreAssignmentOutputWithContext(ctx context.Context) MetastoreAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreAssignmentOutput)
}

// MetastoreAssignmentArrayInput is an input type that accepts MetastoreAssignmentArray and MetastoreAssignmentArrayOutput values.
// You can construct a concrete instance of `MetastoreAssignmentArrayInput` via:
//
//	MetastoreAssignmentArray{ MetastoreAssignmentArgs{...} }
type MetastoreAssignmentArrayInput interface {
	pulumi.Input

	ToMetastoreAssignmentArrayOutput() MetastoreAssignmentArrayOutput
	ToMetastoreAssignmentArrayOutputWithContext(context.Context) MetastoreAssignmentArrayOutput
}

type MetastoreAssignmentArray []MetastoreAssignmentInput

func (MetastoreAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreAssignment)(nil)).Elem()
}

func (i MetastoreAssignmentArray) ToMetastoreAssignmentArrayOutput() MetastoreAssignmentArrayOutput {
	return i.ToMetastoreAssignmentArrayOutputWithContext(context.Background())
}

func (i MetastoreAssignmentArray) ToMetastoreAssignmentArrayOutputWithContext(ctx context.Context) MetastoreAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreAssignmentArrayOutput)
}

// MetastoreAssignmentMapInput is an input type that accepts MetastoreAssignmentMap and MetastoreAssignmentMapOutput values.
// You can construct a concrete instance of `MetastoreAssignmentMapInput` via:
//
//	MetastoreAssignmentMap{ "key": MetastoreAssignmentArgs{...} }
type MetastoreAssignmentMapInput interface {
	pulumi.Input

	ToMetastoreAssignmentMapOutput() MetastoreAssignmentMapOutput
	ToMetastoreAssignmentMapOutputWithContext(context.Context) MetastoreAssignmentMapOutput
}

type MetastoreAssignmentMap map[string]MetastoreAssignmentInput

func (MetastoreAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreAssignment)(nil)).Elem()
}

func (i MetastoreAssignmentMap) ToMetastoreAssignmentMapOutput() MetastoreAssignmentMapOutput {
	return i.ToMetastoreAssignmentMapOutputWithContext(context.Background())
}

func (i MetastoreAssignmentMap) ToMetastoreAssignmentMapOutputWithContext(ctx context.Context) MetastoreAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MetastoreAssignmentMapOutput)
}

type MetastoreAssignmentOutput struct{ *pulumi.OutputState }

func (MetastoreAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MetastoreAssignment)(nil)).Elem()
}

func (o MetastoreAssignmentOutput) ToMetastoreAssignmentOutput() MetastoreAssignmentOutput {
	return o
}

func (o MetastoreAssignmentOutput) ToMetastoreAssignmentOutputWithContext(ctx context.Context) MetastoreAssignmentOutput {
	return o
}

// Default catalog used for this assignment, default to `hiveMetastore`
func (o MetastoreAssignmentOutput) DefaultCatalogName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MetastoreAssignment) pulumi.StringPtrOutput { return v.DefaultCatalogName }).(pulumi.StringPtrOutput)
}

// Unique identifier of the parent Metastore
func (o MetastoreAssignmentOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *MetastoreAssignment) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// id of the workspace for the assignment
func (o MetastoreAssignmentOutput) WorkspaceId() pulumi.IntOutput {
	return o.ApplyT(func(v *MetastoreAssignment) pulumi.IntOutput { return v.WorkspaceId }).(pulumi.IntOutput)
}

type MetastoreAssignmentArrayOutput struct{ *pulumi.OutputState }

func (MetastoreAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MetastoreAssignment)(nil)).Elem()
}

func (o MetastoreAssignmentArrayOutput) ToMetastoreAssignmentArrayOutput() MetastoreAssignmentArrayOutput {
	return o
}

func (o MetastoreAssignmentArrayOutput) ToMetastoreAssignmentArrayOutputWithContext(ctx context.Context) MetastoreAssignmentArrayOutput {
	return o
}

func (o MetastoreAssignmentArrayOutput) Index(i pulumi.IntInput) MetastoreAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MetastoreAssignment {
		return vs[0].([]*MetastoreAssignment)[vs[1].(int)]
	}).(MetastoreAssignmentOutput)
}

type MetastoreAssignmentMapOutput struct{ *pulumi.OutputState }

func (MetastoreAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MetastoreAssignment)(nil)).Elem()
}

func (o MetastoreAssignmentMapOutput) ToMetastoreAssignmentMapOutput() MetastoreAssignmentMapOutput {
	return o
}

func (o MetastoreAssignmentMapOutput) ToMetastoreAssignmentMapOutputWithContext(ctx context.Context) MetastoreAssignmentMapOutput {
	return o
}

func (o MetastoreAssignmentMapOutput) MapIndex(k pulumi.StringInput) MetastoreAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MetastoreAssignment {
		return vs[0].(map[string]*MetastoreAssignment)[vs[1].(string)]
	}).(MetastoreAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreAssignmentInput)(nil)).Elem(), &MetastoreAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreAssignmentArrayInput)(nil)).Elem(), MetastoreAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MetastoreAssignmentMapInput)(nil)).Elem(), MetastoreAssignmentMap{})
	pulumi.RegisterOutputType(MetastoreAssignmentOutput{})
	pulumi.RegisterOutputType(MetastoreAssignmentArrayOutput{})
	pulumi.RegisterOutputType(MetastoreAssignmentMapOutput{})
}
