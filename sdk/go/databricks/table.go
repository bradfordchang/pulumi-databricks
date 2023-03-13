// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type Table struct {
	pulumi.CustomResourceState

	CatalogName           pulumi.StringOutput    `pulumi:"catalogName"`
	Columns               TableColumnArrayOutput `pulumi:"columns"`
	Comment               pulumi.StringPtrOutput `pulumi:"comment"`
	DataSourceFormat      pulumi.StringOutput    `pulumi:"dataSourceFormat"`
	Name                  pulumi.StringOutput    `pulumi:"name"`
	Owner                 pulumi.StringOutput    `pulumi:"owner"`
	Properties            pulumi.MapOutput       `pulumi:"properties"`
	SchemaName            pulumi.StringOutput    `pulumi:"schemaName"`
	StorageCredentialName pulumi.StringPtrOutput `pulumi:"storageCredentialName"`
	StorageLocation       pulumi.StringPtrOutput `pulumi:"storageLocation"`
	TableType             pulumi.StringOutput    `pulumi:"tableType"`
	ViewDefinition        pulumi.StringPtrOutput `pulumi:"viewDefinition"`
}

// NewTable registers a new resource with the given unique name, arguments, and options.
func NewTable(ctx *pulumi.Context,
	name string, args *TableArgs, opts ...pulumi.ResourceOption) (*Table, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	if args.Columns == nil {
		return nil, errors.New("invalid value for required argument 'Columns'")
	}
	if args.DataSourceFormat == nil {
		return nil, errors.New("invalid value for required argument 'DataSourceFormat'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	if args.TableType == nil {
		return nil, errors.New("invalid value for required argument 'TableType'")
	}
	var resource Table
	err := ctx.RegisterResource("databricks:index/table:Table", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTable gets an existing Table resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTable(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TableState, opts ...pulumi.ResourceOption) (*Table, error) {
	var resource Table
	err := ctx.ReadResource("databricks:index/table:Table", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Table resources.
type tableState struct {
	CatalogName           *string                `pulumi:"catalogName"`
	Columns               []TableColumn          `pulumi:"columns"`
	Comment               *string                `pulumi:"comment"`
	DataSourceFormat      *string                `pulumi:"dataSourceFormat"`
	Name                  *string                `pulumi:"name"`
	Owner                 *string                `pulumi:"owner"`
	Properties            map[string]interface{} `pulumi:"properties"`
	SchemaName            *string                `pulumi:"schemaName"`
	StorageCredentialName *string                `pulumi:"storageCredentialName"`
	StorageLocation       *string                `pulumi:"storageLocation"`
	TableType             *string                `pulumi:"tableType"`
	ViewDefinition        *string                `pulumi:"viewDefinition"`
}

type TableState struct {
	CatalogName           pulumi.StringPtrInput
	Columns               TableColumnArrayInput
	Comment               pulumi.StringPtrInput
	DataSourceFormat      pulumi.StringPtrInput
	Name                  pulumi.StringPtrInput
	Owner                 pulumi.StringPtrInput
	Properties            pulumi.MapInput
	SchemaName            pulumi.StringPtrInput
	StorageCredentialName pulumi.StringPtrInput
	StorageLocation       pulumi.StringPtrInput
	TableType             pulumi.StringPtrInput
	ViewDefinition        pulumi.StringPtrInput
}

func (TableState) ElementType() reflect.Type {
	return reflect.TypeOf((*tableState)(nil)).Elem()
}

type tableArgs struct {
	CatalogName           string                 `pulumi:"catalogName"`
	Columns               []TableColumn          `pulumi:"columns"`
	Comment               *string                `pulumi:"comment"`
	DataSourceFormat      string                 `pulumi:"dataSourceFormat"`
	Name                  *string                `pulumi:"name"`
	Owner                 *string                `pulumi:"owner"`
	Properties            map[string]interface{} `pulumi:"properties"`
	SchemaName            string                 `pulumi:"schemaName"`
	StorageCredentialName *string                `pulumi:"storageCredentialName"`
	StorageLocation       *string                `pulumi:"storageLocation"`
	TableType             string                 `pulumi:"tableType"`
	ViewDefinition        *string                `pulumi:"viewDefinition"`
}

// The set of arguments for constructing a Table resource.
type TableArgs struct {
	CatalogName           pulumi.StringInput
	Columns               TableColumnArrayInput
	Comment               pulumi.StringPtrInput
	DataSourceFormat      pulumi.StringInput
	Name                  pulumi.StringPtrInput
	Owner                 pulumi.StringPtrInput
	Properties            pulumi.MapInput
	SchemaName            pulumi.StringInput
	StorageCredentialName pulumi.StringPtrInput
	StorageLocation       pulumi.StringPtrInput
	TableType             pulumi.StringInput
	ViewDefinition        pulumi.StringPtrInput
}

func (TableArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tableArgs)(nil)).Elem()
}

type TableInput interface {
	pulumi.Input

	ToTableOutput() TableOutput
	ToTableOutputWithContext(ctx context.Context) TableOutput
}

func (*Table) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (i *Table) ToTableOutput() TableOutput {
	return i.ToTableOutputWithContext(context.Background())
}

func (i *Table) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableOutput)
}

// TableArrayInput is an input type that accepts TableArray and TableArrayOutput values.
// You can construct a concrete instance of `TableArrayInput` via:
//
//	TableArray{ TableArgs{...} }
type TableArrayInput interface {
	pulumi.Input

	ToTableArrayOutput() TableArrayOutput
	ToTableArrayOutputWithContext(context.Context) TableArrayOutput
}

type TableArray []TableInput

func (TableArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (i TableArray) ToTableArrayOutput() TableArrayOutput {
	return i.ToTableArrayOutputWithContext(context.Background())
}

func (i TableArray) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableArrayOutput)
}

// TableMapInput is an input type that accepts TableMap and TableMapOutput values.
// You can construct a concrete instance of `TableMapInput` via:
//
//	TableMap{ "key": TableArgs{...} }
type TableMapInput interface {
	pulumi.Input

	ToTableMapOutput() TableMapOutput
	ToTableMapOutputWithContext(context.Context) TableMapOutput
}

type TableMap map[string]TableInput

func (TableMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (i TableMap) ToTableMapOutput() TableMapOutput {
	return i.ToTableMapOutputWithContext(context.Background())
}

func (i TableMap) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TableMapOutput)
}

type TableOutput struct{ *pulumi.OutputState }

func (TableOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Table)(nil)).Elem()
}

func (o TableOutput) ToTableOutput() TableOutput {
	return o
}

func (o TableOutput) ToTableOutputWithContext(ctx context.Context) TableOutput {
	return o
}

func (o TableOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.CatalogName }).(pulumi.StringOutput)
}

func (o TableOutput) Columns() TableColumnArrayOutput {
	return o.ApplyT(func(v *Table) TableColumnArrayOutput { return v.Columns }).(TableColumnArrayOutput)
}

func (o TableOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o TableOutput) DataSourceFormat() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.DataSourceFormat }).(pulumi.StringOutput)
}

func (o TableOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o TableOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

func (o TableOutput) Properties() pulumi.MapOutput {
	return o.ApplyT(func(v *Table) pulumi.MapOutput { return v.Properties }).(pulumi.MapOutput)
}

func (o TableOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

func (o TableOutput) StorageCredentialName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.StorageCredentialName }).(pulumi.StringPtrOutput)
}

func (o TableOutput) StorageLocation() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.StorageLocation }).(pulumi.StringPtrOutput)
}

func (o TableOutput) TableType() pulumi.StringOutput {
	return o.ApplyT(func(v *Table) pulumi.StringOutput { return v.TableType }).(pulumi.StringOutput)
}

func (o TableOutput) ViewDefinition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Table) pulumi.StringPtrOutput { return v.ViewDefinition }).(pulumi.StringPtrOutput)
}

type TableArrayOutput struct{ *pulumi.OutputState }

func (TableArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Table)(nil)).Elem()
}

func (o TableArrayOutput) ToTableArrayOutput() TableArrayOutput {
	return o
}

func (o TableArrayOutput) ToTableArrayOutputWithContext(ctx context.Context) TableArrayOutput {
	return o
}

func (o TableArrayOutput) Index(i pulumi.IntInput) TableOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Table {
		return vs[0].([]*Table)[vs[1].(int)]
	}).(TableOutput)
}

type TableMapOutput struct{ *pulumi.OutputState }

func (TableMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Table)(nil)).Elem()
}

func (o TableMapOutput) ToTableMapOutput() TableMapOutput {
	return o
}

func (o TableMapOutput) ToTableMapOutputWithContext(ctx context.Context) TableMapOutput {
	return o
}

func (o TableMapOutput) MapIndex(k pulumi.StringInput) TableOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Table {
		return vs[0].(map[string]*Table)[vs[1].(string)]
	}).(TableOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TableInput)(nil)).Elem(), &Table{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableArrayInput)(nil)).Elem(), TableArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TableMapInput)(nil)).Elem(), TableMap{})
	pulumi.RegisterOutputType(TableOutput{})
	pulumi.RegisterOutputType(TableArrayOutput{})
	pulumi.RegisterOutputType(TableMapOutput{})
}
