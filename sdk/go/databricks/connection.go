// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Lakehouse Federation is the query federation platform for Databricks. Databricks uses Unity Catalog to manage query federation. To make a dataset available for read-only querying using Lakehouse Federation, you create the following:
//
// - A connection, a securable object in Unity Catalog that specifies a path and credentials for accessing an external database system.
// - A foreign catalog
//
// # This resource manages connections in Unity Catalog
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
//			_, err := databricks.NewConnection(ctx, "mysql", &databricks.ConnectionArgs{
//				Comment:        pulumi.String("this is a connection to mysql db"),
//				ConnectionType: pulumi.String("MYSQL"),
//				Options: pulumi.Map{
//					"host":     pulumi.Any("test.mysql.database.azure.com"),
//					"password": pulumi.Any("password"),
//					"port":     pulumi.Any("3306"),
//					"user":     pulumi.Any("user"),
//				},
//				Properties: pulumi.Map{
//					"purpose": pulumi.Any("testing"),
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
//
// ## Import
//
// # This resource can be imported by `id`bash
//
// ```sh
//
//	$ pulumi import databricks:index/connection:Connection this '<metastore_id>|<name>'
//
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Free-form text.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
	ConnectionType pulumi.StringOutput `pulumi:"connectionType"`
	MetastoreId    pulumi.StringOutput `pulumi:"metastoreId"`
	// Name of the Connection.
	Name pulumi.StringOutput `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
	Options pulumi.MapOutput `pulumi:"options"`
	// Name of the connection owner.
	Owner pulumi.StringPtrOutput `pulumi:"owner"`
	// Free-form connection properties.
	Properties pulumi.MapOutput  `pulumi:"properties"`
	ReadOnly   pulumi.BoolOutput `pulumi:"readOnly"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ConnectionType == nil {
		return nil, errors.New("invalid value for required argument 'ConnectionType'")
	}
	if args.Options == nil {
		return nil, errors.New("invalid value for required argument 'Options'")
	}
	if args.Options != nil {
		args.Options = pulumi.ToSecret(args.Options).(pulumi.MapInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"options",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("databricks:index/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("databricks:index/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Free-form text.
	Comment *string `pulumi:"comment"`
	// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
	ConnectionType *string `pulumi:"connectionType"`
	MetastoreId    *string `pulumi:"metastoreId"`
	// Name of the Connection.
	Name *string `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
	Options map[string]interface{} `pulumi:"options"`
	// Name of the connection owner.
	Owner *string `pulumi:"owner"`
	// Free-form connection properties.
	Properties map[string]interface{} `pulumi:"properties"`
	ReadOnly   *bool                  `pulumi:"readOnly"`
}

type ConnectionState struct {
	// Free-form text.
	Comment pulumi.StringPtrInput
	// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
	ConnectionType pulumi.StringPtrInput
	MetastoreId    pulumi.StringPtrInput
	// Name of the Connection.
	Name pulumi.StringPtrInput
	// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
	Options pulumi.MapInput
	// Name of the connection owner.
	Owner pulumi.StringPtrInput
	// Free-form connection properties.
	Properties pulumi.MapInput
	ReadOnly   pulumi.BoolPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Free-form text.
	Comment *string `pulumi:"comment"`
	// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
	ConnectionType string  `pulumi:"connectionType"`
	MetastoreId    *string `pulumi:"metastoreId"`
	// Name of the Connection.
	Name *string `pulumi:"name"`
	// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
	Options map[string]interface{} `pulumi:"options"`
	// Name of the connection owner.
	Owner *string `pulumi:"owner"`
	// Free-form connection properties.
	Properties map[string]interface{} `pulumi:"properties"`
	ReadOnly   *bool                  `pulumi:"readOnly"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Free-form text.
	Comment pulumi.StringPtrInput
	// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
	ConnectionType pulumi.StringInput
	MetastoreId    pulumi.StringPtrInput
	// Name of the Connection.
	Name pulumi.StringPtrInput
	// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
	Options pulumi.MapInput
	// Name of the connection owner.
	Owner pulumi.StringPtrInput
	// Free-form connection properties.
	Properties pulumi.MapInput
	ReadOnly   pulumi.BoolPtrInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

// Free-form text.
func (o ConnectionOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// Connection type. `MYSQL` `POSTGRESQL` `SNOWFLAKE` `REDSHIFT` `SQLDW` `SQLSERVER` or `DATABRICKS` are supported. [Up-to-date list of connection type supported](https://docs.databricks.com/query-federation/index.html#supported-data-sources)
func (o ConnectionOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.ConnectionType }).(pulumi.StringOutput)
}

func (o ConnectionOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of the Connection.
func (o ConnectionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The key value of options required by the connection, e.g. `host`, `port`, `user` and `password`.
func (o ConnectionOutput) Options() pulumi.MapOutput {
	return o.ApplyT(func(v *Connection) pulumi.MapOutput { return v.Options }).(pulumi.MapOutput)
}

// Name of the connection owner.
func (o ConnectionOutput) Owner() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringPtrOutput { return v.Owner }).(pulumi.StringPtrOutput)
}

// Free-form connection properties.
func (o ConnectionOutput) Properties() pulumi.MapOutput {
	return o.ApplyT(func(v *Connection) pulumi.MapOutput { return v.Properties }).(pulumi.MapOutput)
}

func (o ConnectionOutput) ReadOnly() pulumi.BoolOutput {
	return o.ApplyT(func(v *Connection) pulumi.BoolOutput { return v.ReadOnly }).(pulumi.BoolOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
