// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, Databases (also called Schemas), and Tables / Views.
//
// A `Schema` is contained within Catalog and can contain tables & views.
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
//			sandbox, err := databricks.NewCatalog(ctx, "sandbox", &databricks.CatalogArgs{
//				MetastoreId: pulumi.Any(databricks_metastore.This.Id),
//				Comment:     pulumi.String("this catalog is managed by terraform"),
//				Properties: pulumi.Map{
//					"purpose": pulumi.Any("testing"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewSchema(ctx, "things", &databricks.SchemaArgs{
//				CatalogName: sandbox.ID(),
//				Comment:     pulumi.String("this database is managed by terraform"),
//				Properties: pulumi.Map{
//					"kind": pulumi.Any("various"),
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
// ## Related Resources
//
// The following resources are used in the same context:
//
// * Table data to list tables within Unity Catalog.
// * Schema data to list schemas within Unity Catalog.
// * Catalog data to list catalogs within Unity Catalog.
//
// ## Import
//
// # This resource can be imported by its full namebash
//
// ```sh
//
//	$ pulumi import databricks:index/schema:Schema this <catalog_name>.<name>
//
// ```
type Schema struct {
	pulumi.CustomResourceState

	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringOutput `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Delete schema regardless of its contents.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	MetastoreId  pulumi.StringOutput  `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname/sp applicationId of the schema owner.
	Owner pulumi.StringOutput `pulumi:"owner"`
	// Extensible Schema properties.
	Properties pulumi.MapOutput `pulumi:"properties"`
	// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrOutput `pulumi:"storageRoot"`
}

// NewSchema registers a new resource with the given unique name, arguments, and options.
func NewSchema(ctx *pulumi.Context,
	name string, args *SchemaArgs, opts ...pulumi.ResourceOption) (*Schema, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CatalogName == nil {
		return nil, errors.New("invalid value for required argument 'CatalogName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Schema
	err := ctx.RegisterResource("databricks:index/schema:Schema", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchema gets an existing Schema resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchema(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaState, opts ...pulumi.ResourceOption) (*Schema, error) {
	var resource Schema
	err := ctx.ReadResource("databricks:index/schema:Schema", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schema resources.
type schemaState struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName *string `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// Delete schema regardless of its contents.
	ForceDestroy *bool   `pulumi:"forceDestroy"`
	MetastoreId  *string `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the schema owner.
	Owner *string `pulumi:"owner"`
	// Extensible Schema properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
	StorageRoot *string `pulumi:"storageRoot"`
}

type SchemaState struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringPtrInput
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// Delete schema regardless of its contents.
	ForceDestroy pulumi.BoolPtrInput
	MetastoreId  pulumi.StringPtrInput
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the schema owner.
	Owner pulumi.StringPtrInput
	// Extensible Schema properties.
	Properties pulumi.MapInput
	// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrInput
}

func (SchemaState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaState)(nil)).Elem()
}

type schemaArgs struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName string `pulumi:"catalogName"`
	// User-supplied free-form text.
	Comment *string `pulumi:"comment"`
	// Delete schema regardless of its contents.
	ForceDestroy *bool   `pulumi:"forceDestroy"`
	MetastoreId  *string `pulumi:"metastoreId"`
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the schema owner.
	Owner *string `pulumi:"owner"`
	// Extensible Schema properties.
	Properties map[string]interface{} `pulumi:"properties"`
	// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
	StorageRoot *string `pulumi:"storageRoot"`
}

// The set of arguments for constructing a Schema resource.
type SchemaArgs struct {
	// Name of parent catalog. Change forces creation of a new resource.
	CatalogName pulumi.StringInput
	// User-supplied free-form text.
	Comment pulumi.StringPtrInput
	// Delete schema regardless of its contents.
	ForceDestroy pulumi.BoolPtrInput
	MetastoreId  pulumi.StringPtrInput
	// Name of Schema relative to parent catalog. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the schema owner.
	Owner pulumi.StringPtrInput
	// Extensible Schema properties.
	Properties pulumi.MapInput
	// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
	StorageRoot pulumi.StringPtrInput
}

func (SchemaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaArgs)(nil)).Elem()
}

type SchemaInput interface {
	pulumi.Input

	ToSchemaOutput() SchemaOutput
	ToSchemaOutputWithContext(ctx context.Context) SchemaOutput
}

func (*Schema) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (i *Schema) ToSchemaOutput() SchemaOutput {
	return i.ToSchemaOutputWithContext(context.Background())
}

func (i *Schema) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaOutput)
}

func (i *Schema) ToOutput(ctx context.Context) pulumix.Output[*Schema] {
	return pulumix.Output[*Schema]{
		OutputState: i.ToSchemaOutputWithContext(ctx).OutputState,
	}
}

// SchemaArrayInput is an input type that accepts SchemaArray and SchemaArrayOutput values.
// You can construct a concrete instance of `SchemaArrayInput` via:
//
//	SchemaArray{ SchemaArgs{...} }
type SchemaArrayInput interface {
	pulumi.Input

	ToSchemaArrayOutput() SchemaArrayOutput
	ToSchemaArrayOutputWithContext(context.Context) SchemaArrayOutput
}

type SchemaArray []SchemaInput

func (SchemaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (i SchemaArray) ToSchemaArrayOutput() SchemaArrayOutput {
	return i.ToSchemaArrayOutputWithContext(context.Background())
}

func (i SchemaArray) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaArrayOutput)
}

func (i SchemaArray) ToOutput(ctx context.Context) pulumix.Output[[]*Schema] {
	return pulumix.Output[[]*Schema]{
		OutputState: i.ToSchemaArrayOutputWithContext(ctx).OutputState,
	}
}

// SchemaMapInput is an input type that accepts SchemaMap and SchemaMapOutput values.
// You can construct a concrete instance of `SchemaMapInput` via:
//
//	SchemaMap{ "key": SchemaArgs{...} }
type SchemaMapInput interface {
	pulumi.Input

	ToSchemaMapOutput() SchemaMapOutput
	ToSchemaMapOutputWithContext(context.Context) SchemaMapOutput
}

type SchemaMap map[string]SchemaInput

func (SchemaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (i SchemaMap) ToSchemaMapOutput() SchemaMapOutput {
	return i.ToSchemaMapOutputWithContext(context.Background())
}

func (i SchemaMap) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaMapOutput)
}

func (i SchemaMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Schema] {
	return pulumix.Output[map[string]*Schema]{
		OutputState: i.ToSchemaMapOutputWithContext(ctx).OutputState,
	}
}

type SchemaOutput struct{ *pulumi.OutputState }

func (SchemaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Schema)(nil)).Elem()
}

func (o SchemaOutput) ToSchemaOutput() SchemaOutput {
	return o
}

func (o SchemaOutput) ToSchemaOutputWithContext(ctx context.Context) SchemaOutput {
	return o
}

func (o SchemaOutput) ToOutput(ctx context.Context) pulumix.Output[*Schema] {
	return pulumix.Output[*Schema]{
		OutputState: o.OutputState,
	}
}

// Name of parent catalog. Change forces creation of a new resource.
func (o SchemaOutput) CatalogName() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.CatalogName }).(pulumi.StringOutput)
}

// User-supplied free-form text.
func (o SchemaOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Delete schema regardless of its contents.
func (o SchemaOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

func (o SchemaOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of Schema relative to parent catalog. Change forces creation of a new resource.
func (o SchemaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Username/groupname/sp applicationId of the schema owner.
func (o SchemaOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

// Extensible Schema properties.
func (o SchemaOutput) Properties() pulumi.MapOutput {
	return o.ApplyT(func(v *Schema) pulumi.MapOutput { return v.Properties }).(pulumi.MapOutput)
}

// Managed location of the schema. Location in cloud storage where data for managed tables will be stored. If not specified, the location will default to the catalog root location. Change forces creation of a new resource.
func (o SchemaOutput) StorageRoot() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Schema) pulumi.StringPtrOutput { return v.StorageRoot }).(pulumi.StringPtrOutput)
}

type SchemaArrayOutput struct{ *pulumi.OutputState }

func (SchemaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Schema)(nil)).Elem()
}

func (o SchemaArrayOutput) ToSchemaArrayOutput() SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToSchemaArrayOutputWithContext(ctx context.Context) SchemaArrayOutput {
	return o
}

func (o SchemaArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Schema] {
	return pulumix.Output[[]*Schema]{
		OutputState: o.OutputState,
	}
}

func (o SchemaArrayOutput) Index(i pulumi.IntInput) SchemaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].([]*Schema)[vs[1].(int)]
	}).(SchemaOutput)
}

type SchemaMapOutput struct{ *pulumi.OutputState }

func (SchemaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Schema)(nil)).Elem()
}

func (o SchemaMapOutput) ToSchemaMapOutput() SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToSchemaMapOutputWithContext(ctx context.Context) SchemaMapOutput {
	return o
}

func (o SchemaMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Schema] {
	return pulumix.Output[map[string]*Schema]{
		OutputState: o.OutputState,
	}
}

func (o SchemaMapOutput) MapIndex(k pulumi.StringInput) SchemaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Schema {
		return vs[0].(map[string]*Schema)[vs[1].(string)]
	}).(SchemaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaInput)(nil)).Elem(), &Schema{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaArrayInput)(nil)).Elem(), SchemaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaMapInput)(nil)).Elem(), SchemaMap{})
	pulumi.RegisterOutputType(SchemaOutput{})
	pulumi.RegisterOutputType(SchemaArrayOutput{})
	pulumi.RegisterOutputType(SchemaMapOutput{})
}
