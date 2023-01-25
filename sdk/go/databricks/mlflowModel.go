// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
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
//			_, err := databricks.NewMlflowModel(ctx, "test", &databricks.MlflowModelArgs{
//				Description: pulumi.String("My MLflow model description"),
//				Tags: databricks.MlflowModelTagArray{
//					&databricks.MlflowModelTagArgs{
//						Key:   pulumi.String("key1"),
//						Value: pulumi.String("value1"),
//					},
//					&databricks.MlflowModelTagArgs{
//						Key:   pulumi.String("key2"),
//						Value: pulumi.String("value2"),
//					},
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
// ## Access Control
//
// * Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
// * MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
// * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
// * Notebook data to export a notebook from Databricks Workspace.
// * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
//
// ## Import
//
// # The model resource can be imported using the name bash
//
// ```sh
//
//	$ pulumi import databricks:index/mlflowModel:MlflowModel this <name>
//
// ```
type MlflowModel struct {
	pulumi.CustomResourceState

	CreationTimestamp pulumi.IntOutput `pulumi:"creationTimestamp"`
	// The description of the MLflow model.
	Description          pulumi.StringPtrOutput `pulumi:"description"`
	LastUpdatedTimestamp pulumi.IntOutput       `pulumi:"lastUpdatedTimestamp"`
	// Name of MLflow model. Change of name triggers new resource.
	Name              pulumi.StringOutput `pulumi:"name"`
	RegisteredModelId pulumi.StringOutput `pulumi:"registeredModelId"`
	// Tags for the MLflow model.
	Tags   MlflowModelTagArrayOutput `pulumi:"tags"`
	UserId pulumi.StringOutput       `pulumi:"userId"`
}

// NewMlflowModel registers a new resource with the given unique name, arguments, and options.
func NewMlflowModel(ctx *pulumi.Context,
	name string, args *MlflowModelArgs, opts ...pulumi.ResourceOption) (*MlflowModel, error) {
	if args == nil {
		args = &MlflowModelArgs{}
	}

	var resource MlflowModel
	err := ctx.RegisterResource("databricks:index/mlflowModel:MlflowModel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMlflowModel gets an existing MlflowModel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMlflowModel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MlflowModelState, opts ...pulumi.ResourceOption) (*MlflowModel, error) {
	var resource MlflowModel
	err := ctx.ReadResource("databricks:index/mlflowModel:MlflowModel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MlflowModel resources.
type mlflowModelState struct {
	CreationTimestamp *int `pulumi:"creationTimestamp"`
	// The description of the MLflow model.
	Description          *string `pulumi:"description"`
	LastUpdatedTimestamp *int    `pulumi:"lastUpdatedTimestamp"`
	// Name of MLflow model. Change of name triggers new resource.
	Name              *string `pulumi:"name"`
	RegisteredModelId *string `pulumi:"registeredModelId"`
	// Tags for the MLflow model.
	Tags   []MlflowModelTag `pulumi:"tags"`
	UserId *string          `pulumi:"userId"`
}

type MlflowModelState struct {
	CreationTimestamp pulumi.IntPtrInput
	// The description of the MLflow model.
	Description          pulumi.StringPtrInput
	LastUpdatedTimestamp pulumi.IntPtrInput
	// Name of MLflow model. Change of name triggers new resource.
	Name              pulumi.StringPtrInput
	RegisteredModelId pulumi.StringPtrInput
	// Tags for the MLflow model.
	Tags   MlflowModelTagArrayInput
	UserId pulumi.StringPtrInput
}

func (MlflowModelState) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowModelState)(nil)).Elem()
}

type mlflowModelArgs struct {
	CreationTimestamp *int `pulumi:"creationTimestamp"`
	// The description of the MLflow model.
	Description          *string `pulumi:"description"`
	LastUpdatedTimestamp *int    `pulumi:"lastUpdatedTimestamp"`
	// Name of MLflow model. Change of name triggers new resource.
	Name              *string `pulumi:"name"`
	RegisteredModelId *string `pulumi:"registeredModelId"`
	// Tags for the MLflow model.
	Tags   []MlflowModelTag `pulumi:"tags"`
	UserId *string          `pulumi:"userId"`
}

// The set of arguments for constructing a MlflowModel resource.
type MlflowModelArgs struct {
	CreationTimestamp pulumi.IntPtrInput
	// The description of the MLflow model.
	Description          pulumi.StringPtrInput
	LastUpdatedTimestamp pulumi.IntPtrInput
	// Name of MLflow model. Change of name triggers new resource.
	Name              pulumi.StringPtrInput
	RegisteredModelId pulumi.StringPtrInput
	// Tags for the MLflow model.
	Tags   MlflowModelTagArrayInput
	UserId pulumi.StringPtrInput
}

func (MlflowModelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mlflowModelArgs)(nil)).Elem()
}

type MlflowModelInput interface {
	pulumi.Input

	ToMlflowModelOutput() MlflowModelOutput
	ToMlflowModelOutputWithContext(ctx context.Context) MlflowModelOutput
}

func (*MlflowModel) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowModel)(nil)).Elem()
}

func (i *MlflowModel) ToMlflowModelOutput() MlflowModelOutput {
	return i.ToMlflowModelOutputWithContext(context.Background())
}

func (i *MlflowModel) ToMlflowModelOutputWithContext(ctx context.Context) MlflowModelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowModelOutput)
}

// MlflowModelArrayInput is an input type that accepts MlflowModelArray and MlflowModelArrayOutput values.
// You can construct a concrete instance of `MlflowModelArrayInput` via:
//
//	MlflowModelArray{ MlflowModelArgs{...} }
type MlflowModelArrayInput interface {
	pulumi.Input

	ToMlflowModelArrayOutput() MlflowModelArrayOutput
	ToMlflowModelArrayOutputWithContext(context.Context) MlflowModelArrayOutput
}

type MlflowModelArray []MlflowModelInput

func (MlflowModelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowModel)(nil)).Elem()
}

func (i MlflowModelArray) ToMlflowModelArrayOutput() MlflowModelArrayOutput {
	return i.ToMlflowModelArrayOutputWithContext(context.Background())
}

func (i MlflowModelArray) ToMlflowModelArrayOutputWithContext(ctx context.Context) MlflowModelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowModelArrayOutput)
}

// MlflowModelMapInput is an input type that accepts MlflowModelMap and MlflowModelMapOutput values.
// You can construct a concrete instance of `MlflowModelMapInput` via:
//
//	MlflowModelMap{ "key": MlflowModelArgs{...} }
type MlflowModelMapInput interface {
	pulumi.Input

	ToMlflowModelMapOutput() MlflowModelMapOutput
	ToMlflowModelMapOutputWithContext(context.Context) MlflowModelMapOutput
}

type MlflowModelMap map[string]MlflowModelInput

func (MlflowModelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowModel)(nil)).Elem()
}

func (i MlflowModelMap) ToMlflowModelMapOutput() MlflowModelMapOutput {
	return i.ToMlflowModelMapOutputWithContext(context.Background())
}

func (i MlflowModelMap) ToMlflowModelMapOutputWithContext(ctx context.Context) MlflowModelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MlflowModelMapOutput)
}

type MlflowModelOutput struct{ *pulumi.OutputState }

func (MlflowModelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MlflowModel)(nil)).Elem()
}

func (o MlflowModelOutput) ToMlflowModelOutput() MlflowModelOutput {
	return o
}

func (o MlflowModelOutput) ToMlflowModelOutputWithContext(ctx context.Context) MlflowModelOutput {
	return o
}

func (o MlflowModelOutput) CreationTimestamp() pulumi.IntOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.IntOutput { return v.CreationTimestamp }).(pulumi.IntOutput)
}

// The description of the MLflow model.
func (o MlflowModelOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

func (o MlflowModelOutput) LastUpdatedTimestamp() pulumi.IntOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.IntOutput { return v.LastUpdatedTimestamp }).(pulumi.IntOutput)
}

// Name of MLflow model. Change of name triggers new resource.
func (o MlflowModelOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o MlflowModelOutput) RegisteredModelId() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.StringOutput { return v.RegisteredModelId }).(pulumi.StringOutput)
}

// Tags for the MLflow model.
func (o MlflowModelOutput) Tags() MlflowModelTagArrayOutput {
	return o.ApplyT(func(v *MlflowModel) MlflowModelTagArrayOutput { return v.Tags }).(MlflowModelTagArrayOutput)
}

func (o MlflowModelOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *MlflowModel) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type MlflowModelArrayOutput struct{ *pulumi.OutputState }

func (MlflowModelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MlflowModel)(nil)).Elem()
}

func (o MlflowModelArrayOutput) ToMlflowModelArrayOutput() MlflowModelArrayOutput {
	return o
}

func (o MlflowModelArrayOutput) ToMlflowModelArrayOutputWithContext(ctx context.Context) MlflowModelArrayOutput {
	return o
}

func (o MlflowModelArrayOutput) Index(i pulumi.IntInput) MlflowModelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MlflowModel {
		return vs[0].([]*MlflowModel)[vs[1].(int)]
	}).(MlflowModelOutput)
}

type MlflowModelMapOutput struct{ *pulumi.OutputState }

func (MlflowModelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MlflowModel)(nil)).Elem()
}

func (o MlflowModelMapOutput) ToMlflowModelMapOutput() MlflowModelMapOutput {
	return o
}

func (o MlflowModelMapOutput) ToMlflowModelMapOutputWithContext(ctx context.Context) MlflowModelMapOutput {
	return o
}

func (o MlflowModelMapOutput) MapIndex(k pulumi.StringInput) MlflowModelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MlflowModel {
		return vs[0].(map[string]*MlflowModel)[vs[1].(string)]
	}).(MlflowModelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowModelInput)(nil)).Elem(), &MlflowModel{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowModelArrayInput)(nil)).Elem(), MlflowModelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MlflowModelMapInput)(nil)).Elem(), MlflowModelMap{})
	pulumi.RegisterOutputType(MlflowModelOutput{})
	pulumi.RegisterOutputType(MlflowModelArrayOutput{})
	pulumi.RegisterOutputType(MlflowModelMapOutput{})
}
