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

// To manage [SQLA resources](https://docs.databricks.com/sql/get-started/concepts.html) you must have `databricksSqlAccess` on your Group or databricks_user.
//
// **Note:** documentation for this resource is a work in progress.
//
// A query may have one or more visualizations.
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
//			sharedDir, err := databricks.NewDirectory(ctx, "sharedDir", &databricks.DirectoryArgs{
//				Path: pulumi.String("/Shared/Queries"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewSqlQuery(ctx, "q1", &databricks.SqlQueryArgs{
//				DataSourceId: pulumi.Any(databricks_sql_endpoint.Example.Data_source_id),
//				Query:        pulumi.String("                        SELECT {{ p1 }} AS p1\n                        WHERE 1=1\n                        AND p2 in ({{ p2 }})\n                        AND event_date > date '{{ p3 }}'\n"),
//				Parent: sharedDir.ObjectId.ApplyT(func(objectId int) (string, error) {
//					return fmt.Sprintf("folders/%v", objectId), nil
//				}).(pulumi.StringOutput),
//				RunAsRole: pulumi.String("viewer"),
//				Parameters: databricks.SqlQueryParameterArray{
//					&databricks.SqlQueryParameterArgs{
//						Name:  pulumi.String("p1"),
//						Title: pulumi.String("Title for p1"),
//						Text: &databricks.SqlQueryParameterTextArgs{
//							Value: pulumi.String("default"),
//						},
//					},
//					&databricks.SqlQueryParameterArgs{
//						Name:  pulumi.String("p2"),
//						Title: pulumi.String("Title for p2"),
//						Enum: &databricks.SqlQueryParameterEnumArgs{
//							Options: pulumi.StringArray{
//								pulumi.String("default"),
//								pulumi.String("foo"),
//								pulumi.String("bar"),
//							},
//							Value: pulumi.String("default"),
//							Multiple: &databricks.SqlQueryParameterEnumMultipleArgs{
//								Prefix:    pulumi.String("\""),
//								Suffix:    pulumi.String("\""),
//								Separator: pulumi.String(","),
//							},
//						},
//					},
//					&databricks.SqlQueryParameterArgs{
//						Name:  pulumi.String("p3"),
//						Title: pulumi.String("Title for p3"),
//						Date: &databricks.SqlQueryParameterDateArgs{
//							Value: pulumi.String("2022-01-01"),
//						},
//					},
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("t1"),
//					pulumi.String("t2"),
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
// Example permission to share query with all users:
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
//			_, err := databricks.NewPermissions(ctx, "q1", &databricks.PermissionsArgs{
//				SqlQueryId: pulumi.Any(databricks_sql_query.Q1.Id),
//				AccessControls: databricks.PermissionsAccessControlArray{
//					&databricks.PermissionsAccessControlArgs{
//						GroupName:       pulumi.Any(data.Databricks_group.Users.Display_name),
//						PermissionLevel: pulumi.String("CAN_RUN"),
//					},
//					&databricks.PermissionsAccessControlArgs{
//						GroupName:       pulumi.Any(data.Databricks_group.Team.Display_name),
//						PermissionLevel: pulumi.String("CAN_EDIT"),
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
// ## Troubleshooting
//
// In case you see `Error: cannot create sql query: Internal Server Error` during `pulumi up`; double check that you are using the correct `dataSourceId`
//
// Operations on `SqlQuery` schedules are ⛔️ deprecated. You can create, update or delete a schedule for SQLA and other Databricks resources using the Job resource.
//
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * SqlDashboard to manage Databricks SQL [Dashboards](https://docs.databricks.com/sql/user/dashboards/index.html).
// * SqlEndpoint to manage Databricks SQL [Endpoints](https://docs.databricks.com/sql/admin/sql-endpoints.html).
// * SqlGlobalConfig to configure the security policy, databricks_instance_profile, and [data access properties](https://docs.databricks.com/sql/admin/data-access-configuration.html) for all SqlEndpoint of workspace.
// * SqlPermissions to manage data object access control lists in Databricks workspaces for things like tables, views, databases, and [more](https://docs.databricks.com/security/access-control/table-acls/object-privileges.html).
// * Job to schedule Databricks SQL queries (as well as dashboards and alerts) using Databricks Jobs.
//
// ## Import
//
// You can import a `databricks_sql_query` resource with ID like the followingbash
//
// ```sh
//
//	$ pulumi import databricks:index/sqlQuery:SqlQuery this <query-id>
//
// ```
type SqlQuery struct {
	pulumi.CustomResourceState

	CreatedAt pulumi.StringOutput `pulumi:"createdAt"`
	// Data source ID of a SQL warehouse
	DataSourceId pulumi.StringOutput `pulumi:"dataSourceId"`
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The title of this query that appears in list views, widget headings, and on the query page.
	Name       pulumi.StringOutput          `pulumi:"name"`
	Parameters SqlQueryParameterArrayOutput `pulumi:"parameters"`
	// The identifier of the workspace folder containing the object.
	Parent pulumi.StringPtrOutput `pulumi:"parent"`
	// The text of the query to be run.
	Query pulumi.StringOutput `pulumi:"query"`
	// Run as role. Possible values are `viewer`, `owner`.
	RunAsRole pulumi.StringPtrOutput `pulumi:"runAsRole"`
	// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
	Schedule  SqlQuerySchedulePtrOutput `pulumi:"schedule"`
	Tags      pulumi.StringArrayOutput  `pulumi:"tags"`
	UpdatedAt pulumi.StringOutput       `pulumi:"updatedAt"`
}

// NewSqlQuery registers a new resource with the given unique name, arguments, and options.
func NewSqlQuery(ctx *pulumi.Context,
	name string, args *SqlQueryArgs, opts ...pulumi.ResourceOption) (*SqlQuery, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DataSourceId == nil {
		return nil, errors.New("invalid value for required argument 'DataSourceId'")
	}
	if args.Query == nil {
		return nil, errors.New("invalid value for required argument 'Query'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SqlQuery
	err := ctx.RegisterResource("databricks:index/sqlQuery:SqlQuery", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSqlQuery gets an existing SqlQuery resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSqlQuery(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SqlQueryState, opts ...pulumi.ResourceOption) (*SqlQuery, error) {
	var resource SqlQuery
	err := ctx.ReadResource("databricks:index/sqlQuery:SqlQuery", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SqlQuery resources.
type sqlQueryState struct {
	CreatedAt *string `pulumi:"createdAt"`
	// Data source ID of a SQL warehouse
	DataSourceId *string `pulumi:"dataSourceId"`
	// General description that conveys additional information about this query such as usage notes.
	Description *string `pulumi:"description"`
	// The title of this query that appears in list views, widget headings, and on the query page.
	Name       *string             `pulumi:"name"`
	Parameters []SqlQueryParameter `pulumi:"parameters"`
	// The identifier of the workspace folder containing the object.
	Parent *string `pulumi:"parent"`
	// The text of the query to be run.
	Query *string `pulumi:"query"`
	// Run as role. Possible values are `viewer`, `owner`.
	RunAsRole *string `pulumi:"runAsRole"`
	// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
	Schedule  *SqlQuerySchedule `pulumi:"schedule"`
	Tags      []string          `pulumi:"tags"`
	UpdatedAt *string           `pulumi:"updatedAt"`
}

type SqlQueryState struct {
	CreatedAt pulumi.StringPtrInput
	// Data source ID of a SQL warehouse
	DataSourceId pulumi.StringPtrInput
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrInput
	// The title of this query that appears in list views, widget headings, and on the query page.
	Name       pulumi.StringPtrInput
	Parameters SqlQueryParameterArrayInput
	// The identifier of the workspace folder containing the object.
	Parent pulumi.StringPtrInput
	// The text of the query to be run.
	Query pulumi.StringPtrInput
	// Run as role. Possible values are `viewer`, `owner`.
	RunAsRole pulumi.StringPtrInput
	// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
	Schedule  SqlQuerySchedulePtrInput
	Tags      pulumi.StringArrayInput
	UpdatedAt pulumi.StringPtrInput
}

func (SqlQueryState) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlQueryState)(nil)).Elem()
}

type sqlQueryArgs struct {
	CreatedAt *string `pulumi:"createdAt"`
	// Data source ID of a SQL warehouse
	DataSourceId string `pulumi:"dataSourceId"`
	// General description that conveys additional information about this query such as usage notes.
	Description *string `pulumi:"description"`
	// The title of this query that appears in list views, widget headings, and on the query page.
	Name       *string             `pulumi:"name"`
	Parameters []SqlQueryParameter `pulumi:"parameters"`
	// The identifier of the workspace folder containing the object.
	Parent *string `pulumi:"parent"`
	// The text of the query to be run.
	Query string `pulumi:"query"`
	// Run as role. Possible values are `viewer`, `owner`.
	RunAsRole *string `pulumi:"runAsRole"`
	// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
	Schedule  *SqlQuerySchedule `pulumi:"schedule"`
	Tags      []string          `pulumi:"tags"`
	UpdatedAt *string           `pulumi:"updatedAt"`
}

// The set of arguments for constructing a SqlQuery resource.
type SqlQueryArgs struct {
	CreatedAt pulumi.StringPtrInput
	// Data source ID of a SQL warehouse
	DataSourceId pulumi.StringInput
	// General description that conveys additional information about this query such as usage notes.
	Description pulumi.StringPtrInput
	// The title of this query that appears in list views, widget headings, and on the query page.
	Name       pulumi.StringPtrInput
	Parameters SqlQueryParameterArrayInput
	// The identifier of the workspace folder containing the object.
	Parent pulumi.StringPtrInput
	// The text of the query to be run.
	Query pulumi.StringInput
	// Run as role. Possible values are `viewer`, `owner`.
	RunAsRole pulumi.StringPtrInput
	// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
	Schedule  SqlQuerySchedulePtrInput
	Tags      pulumi.StringArrayInput
	UpdatedAt pulumi.StringPtrInput
}

func (SqlQueryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sqlQueryArgs)(nil)).Elem()
}

type SqlQueryInput interface {
	pulumi.Input

	ToSqlQueryOutput() SqlQueryOutput
	ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput
}

func (*SqlQuery) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlQuery)(nil)).Elem()
}

func (i *SqlQuery) ToSqlQueryOutput() SqlQueryOutput {
	return i.ToSqlQueryOutputWithContext(context.Background())
}

func (i *SqlQuery) ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryOutput)
}

func (i *SqlQuery) ToOutput(ctx context.Context) pulumix.Output[*SqlQuery] {
	return pulumix.Output[*SqlQuery]{
		OutputState: i.ToSqlQueryOutputWithContext(ctx).OutputState,
	}
}

// SqlQueryArrayInput is an input type that accepts SqlQueryArray and SqlQueryArrayOutput values.
// You can construct a concrete instance of `SqlQueryArrayInput` via:
//
//	SqlQueryArray{ SqlQueryArgs{...} }
type SqlQueryArrayInput interface {
	pulumi.Input

	ToSqlQueryArrayOutput() SqlQueryArrayOutput
	ToSqlQueryArrayOutputWithContext(context.Context) SqlQueryArrayOutput
}

type SqlQueryArray []SqlQueryInput

func (SqlQueryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlQuery)(nil)).Elem()
}

func (i SqlQueryArray) ToSqlQueryArrayOutput() SqlQueryArrayOutput {
	return i.ToSqlQueryArrayOutputWithContext(context.Background())
}

func (i SqlQueryArray) ToSqlQueryArrayOutputWithContext(ctx context.Context) SqlQueryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryArrayOutput)
}

func (i SqlQueryArray) ToOutput(ctx context.Context) pulumix.Output[[]*SqlQuery] {
	return pulumix.Output[[]*SqlQuery]{
		OutputState: i.ToSqlQueryArrayOutputWithContext(ctx).OutputState,
	}
}

// SqlQueryMapInput is an input type that accepts SqlQueryMap and SqlQueryMapOutput values.
// You can construct a concrete instance of `SqlQueryMapInput` via:
//
//	SqlQueryMap{ "key": SqlQueryArgs{...} }
type SqlQueryMapInput interface {
	pulumi.Input

	ToSqlQueryMapOutput() SqlQueryMapOutput
	ToSqlQueryMapOutputWithContext(context.Context) SqlQueryMapOutput
}

type SqlQueryMap map[string]SqlQueryInput

func (SqlQueryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlQuery)(nil)).Elem()
}

func (i SqlQueryMap) ToSqlQueryMapOutput() SqlQueryMapOutput {
	return i.ToSqlQueryMapOutputWithContext(context.Background())
}

func (i SqlQueryMap) ToSqlQueryMapOutputWithContext(ctx context.Context) SqlQueryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SqlQueryMapOutput)
}

func (i SqlQueryMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*SqlQuery] {
	return pulumix.Output[map[string]*SqlQuery]{
		OutputState: i.ToSqlQueryMapOutputWithContext(ctx).OutputState,
	}
}

type SqlQueryOutput struct{ *pulumi.OutputState }

func (SqlQueryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SqlQuery)(nil)).Elem()
}

func (o SqlQueryOutput) ToSqlQueryOutput() SqlQueryOutput {
	return o
}

func (o SqlQueryOutput) ToSqlQueryOutputWithContext(ctx context.Context) SqlQueryOutput {
	return o
}

func (o SqlQueryOutput) ToOutput(ctx context.Context) pulumix.Output[*SqlQuery] {
	return pulumix.Output[*SqlQuery]{
		OutputState: o.OutputState,
	}
}

func (o SqlQueryOutput) CreatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.CreatedAt }).(pulumi.StringOutput)
}

// Data source ID of a SQL warehouse
func (o SqlQueryOutput) DataSourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.DataSourceId }).(pulumi.StringOutput)
}

// General description that conveys additional information about this query such as usage notes.
func (o SqlQueryOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The title of this query that appears in list views, widget headings, and on the query page.
func (o SqlQueryOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o SqlQueryOutput) Parameters() SqlQueryParameterArrayOutput {
	return o.ApplyT(func(v *SqlQuery) SqlQueryParameterArrayOutput { return v.Parameters }).(SqlQueryParameterArrayOutput)
}

// The identifier of the workspace folder containing the object.
func (o SqlQueryOutput) Parent() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringPtrOutput { return v.Parent }).(pulumi.StringPtrOutput)
}

// The text of the query to be run.
func (o SqlQueryOutput) Query() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.Query }).(pulumi.StringOutput)
}

// Run as role. Possible values are `viewer`, `owner`.
func (o SqlQueryOutput) RunAsRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringPtrOutput { return v.RunAsRole }).(pulumi.StringPtrOutput)
}

// Deprecated: Operations on `databricks_sql_query` schedules are deprecated. Please use `databricks_job` resource to schedule a `sql_task`.
func (o SqlQueryOutput) Schedule() SqlQuerySchedulePtrOutput {
	return o.ApplyT(func(v *SqlQuery) SqlQuerySchedulePtrOutput { return v.Schedule }).(SqlQuerySchedulePtrOutput)
}

func (o SqlQueryOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

func (o SqlQueryOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *SqlQuery) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type SqlQueryArrayOutput struct{ *pulumi.OutputState }

func (SqlQueryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SqlQuery)(nil)).Elem()
}

func (o SqlQueryArrayOutput) ToSqlQueryArrayOutput() SqlQueryArrayOutput {
	return o
}

func (o SqlQueryArrayOutput) ToSqlQueryArrayOutputWithContext(ctx context.Context) SqlQueryArrayOutput {
	return o
}

func (o SqlQueryArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*SqlQuery] {
	return pulumix.Output[[]*SqlQuery]{
		OutputState: o.OutputState,
	}
}

func (o SqlQueryArrayOutput) Index(i pulumi.IntInput) SqlQueryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SqlQuery {
		return vs[0].([]*SqlQuery)[vs[1].(int)]
	}).(SqlQueryOutput)
}

type SqlQueryMapOutput struct{ *pulumi.OutputState }

func (SqlQueryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SqlQuery)(nil)).Elem()
}

func (o SqlQueryMapOutput) ToSqlQueryMapOutput() SqlQueryMapOutput {
	return o
}

func (o SqlQueryMapOutput) ToSqlQueryMapOutputWithContext(ctx context.Context) SqlQueryMapOutput {
	return o
}

func (o SqlQueryMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*SqlQuery] {
	return pulumix.Output[map[string]*SqlQuery]{
		OutputState: o.OutputState,
	}
}

func (o SqlQueryMapOutput) MapIndex(k pulumi.StringInput) SqlQueryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SqlQuery {
		return vs[0].(map[string]*SqlQuery)[vs[1].(string)]
	}).(SqlQueryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryInput)(nil)).Elem(), &SqlQuery{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryArrayInput)(nil)).Elem(), SqlQueryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SqlQueryMapInput)(nil)).Elem(), SqlQueryMap{})
	pulumi.RegisterOutputType(SqlQueryOutput{})
	pulumi.RegisterOutputType(SqlQueryArrayOutput{})
	pulumi.RegisterOutputType(SqlQueryMapOutput{})
}
