// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to set entitlements to existing databricks_users, Group or databricks_service_principal.
//
// > **Note** You must define entitlements of a principal using either `Entitlements` or directly within one of databricks_users, Group or databricks_service_principal. Having entitlements defined in both resources will result in non-deterministic behaviour.
//
// ## Example Usage
//
// Setting entitlements for a regular user:
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
//			meUser, err := databricks.LookupUser(ctx, &databricks.LookupUserArgs{
//				UserName: pulumi.StringRef("me@example.com"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewEntitlements(ctx, "meEntitlements", &databricks.EntitlementsArgs{
//				UserId:                  *pulumi.String(meUser.Id),
//				AllowClusterCreate:      pulumi.Bool(true),
//				AllowInstancePoolCreate: pulumi.Bool(true),
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
// Setting entitlements for a service principal:
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
//			thisServicePrincipal, err := databricks.LookupServicePrincipal(ctx, &databricks.LookupServicePrincipalArgs{
//				ApplicationId: pulumi.StringRef("11111111-2222-3333-4444-555666777888"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewEntitlements(ctx, "thisEntitlements", &databricks.EntitlementsArgs{
//				ServicePrincipalId:      *pulumi.String(thisServicePrincipal.SpId),
//				AllowClusterCreate:      pulumi.Bool(true),
//				AllowInstancePoolCreate: pulumi.Bool(true),
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
// # Setting entitlements to all users in a workspace - referencing special `users` Group
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
//			users, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "users",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewEntitlements(ctx, "workspace-users", &databricks.EntitlementsArgs{
//				GroupId:                 *pulumi.String(users.Id),
//				AllowClusterCreate:      pulumi.Bool(true),
//				AllowInstancePoolCreate: pulumi.Bool(true),
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
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * GroupMember to attach users and groups as group members.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
// * User data to retrieve information about databricks_user.
//
// ## Import
//
// The resource can be imported using a synthetic identifier. Examples of valid synthetic identifiers are* `user/user_id` - user `user_id`. * `group/group_id` - group `group_id`. * `spn/spn_id` - service principal `spn_id`. bash
//
// ```sh
//
//	$ pulumi import databricks:index/entitlements:Entitlements me user/<user-id>
//
// ```
type Entitlements struct {
	pulumi.CustomResourceState

	// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrOutput `pulumi:"allowClusterCreate"`
	// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrOutput `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrOutput `pulumi:"databricksSqlAccess"`
	// Canonical unique identifier for the group.
	GroupId pulumi.StringPtrOutput `pulumi:"groupId"`
	// Canonical unique identifier for the service principal.
	ServicePrincipalId pulumi.StringPtrOutput `pulumi:"servicePrincipalId"`
	// Canonical unique identifier for the user.
	UserId pulumi.StringPtrOutput `pulumi:"userId"`
	// This is a field to allow the principal to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrOutput `pulumi:"workspaceAccess"`
}

// NewEntitlements registers a new resource with the given unique name, arguments, and options.
func NewEntitlements(ctx *pulumi.Context,
	name string, args *EntitlementsArgs, opts ...pulumi.ResourceOption) (*Entitlements, error) {
	if args == nil {
		args = &EntitlementsArgs{}
	}

	var resource Entitlements
	err := ctx.RegisterResource("databricks:index/entitlements:Entitlements", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEntitlements gets an existing Entitlements resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEntitlements(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EntitlementsState, opts ...pulumi.ResourceOption) (*Entitlements, error) {
	var resource Entitlements
	err := ctx.ReadResource("databricks:index/entitlements:Entitlements", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Entitlements resources.
type entitlementsState struct {
	// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// Canonical unique identifier for the group.
	GroupId *string `pulumi:"groupId"`
	// Canonical unique identifier for the service principal.
	ServicePrincipalId *string `pulumi:"servicePrincipalId"`
	// Canonical unique identifier for the user.
	UserId *string `pulumi:"userId"`
	// This is a field to allow the principal to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

type EntitlementsState struct {
	// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// Canonical unique identifier for the group.
	GroupId pulumi.StringPtrInput
	// Canonical unique identifier for the service principal.
	ServicePrincipalId pulumi.StringPtrInput
	// Canonical unique identifier for the user.
	UserId pulumi.StringPtrInput
	// This is a field to allow the principal to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (EntitlementsState) ElementType() reflect.Type {
	return reflect.TypeOf((*entitlementsState)(nil)).Elem()
}

type entitlementsArgs struct {
	// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess *bool `pulumi:"databricksSqlAccess"`
	// Canonical unique identifier for the group.
	GroupId *string `pulumi:"groupId"`
	// Canonical unique identifier for the service principal.
	ServicePrincipalId *string `pulumi:"servicePrincipalId"`
	// Canonical unique identifier for the user.
	UserId *string `pulumi:"userId"`
	// This is a field to allow the principal to have access to Databricks Workspace.
	WorkspaceAccess *bool `pulumi:"workspaceAccess"`
}

// The set of arguments for constructing a Entitlements resource.
type EntitlementsArgs struct {
	// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
	AllowClusterCreate pulumi.BoolPtrInput
	// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
	AllowInstancePoolCreate pulumi.BoolPtrInput
	// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
	DatabricksSqlAccess pulumi.BoolPtrInput
	// Canonical unique identifier for the group.
	GroupId pulumi.StringPtrInput
	// Canonical unique identifier for the service principal.
	ServicePrincipalId pulumi.StringPtrInput
	// Canonical unique identifier for the user.
	UserId pulumi.StringPtrInput
	// This is a field to allow the principal to have access to Databricks Workspace.
	WorkspaceAccess pulumi.BoolPtrInput
}

func (EntitlementsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*entitlementsArgs)(nil)).Elem()
}

type EntitlementsInput interface {
	pulumi.Input

	ToEntitlementsOutput() EntitlementsOutput
	ToEntitlementsOutputWithContext(ctx context.Context) EntitlementsOutput
}

func (*Entitlements) ElementType() reflect.Type {
	return reflect.TypeOf((**Entitlements)(nil)).Elem()
}

func (i *Entitlements) ToEntitlementsOutput() EntitlementsOutput {
	return i.ToEntitlementsOutputWithContext(context.Background())
}

func (i *Entitlements) ToEntitlementsOutputWithContext(ctx context.Context) EntitlementsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntitlementsOutput)
}

// EntitlementsArrayInput is an input type that accepts EntitlementsArray and EntitlementsArrayOutput values.
// You can construct a concrete instance of `EntitlementsArrayInput` via:
//
//	EntitlementsArray{ EntitlementsArgs{...} }
type EntitlementsArrayInput interface {
	pulumi.Input

	ToEntitlementsArrayOutput() EntitlementsArrayOutput
	ToEntitlementsArrayOutputWithContext(context.Context) EntitlementsArrayOutput
}

type EntitlementsArray []EntitlementsInput

func (EntitlementsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Entitlements)(nil)).Elem()
}

func (i EntitlementsArray) ToEntitlementsArrayOutput() EntitlementsArrayOutput {
	return i.ToEntitlementsArrayOutputWithContext(context.Background())
}

func (i EntitlementsArray) ToEntitlementsArrayOutputWithContext(ctx context.Context) EntitlementsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntitlementsArrayOutput)
}

// EntitlementsMapInput is an input type that accepts EntitlementsMap and EntitlementsMapOutput values.
// You can construct a concrete instance of `EntitlementsMapInput` via:
//
//	EntitlementsMap{ "key": EntitlementsArgs{...} }
type EntitlementsMapInput interface {
	pulumi.Input

	ToEntitlementsMapOutput() EntitlementsMapOutput
	ToEntitlementsMapOutputWithContext(context.Context) EntitlementsMapOutput
}

type EntitlementsMap map[string]EntitlementsInput

func (EntitlementsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Entitlements)(nil)).Elem()
}

func (i EntitlementsMap) ToEntitlementsMapOutput() EntitlementsMapOutput {
	return i.ToEntitlementsMapOutputWithContext(context.Background())
}

func (i EntitlementsMap) ToEntitlementsMapOutputWithContext(ctx context.Context) EntitlementsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EntitlementsMapOutput)
}

type EntitlementsOutput struct{ *pulumi.OutputState }

func (EntitlementsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Entitlements)(nil)).Elem()
}

func (o EntitlementsOutput) ToEntitlementsOutput() EntitlementsOutput {
	return o
}

func (o EntitlementsOutput) ToEntitlementsOutputWithContext(ctx context.Context) EntitlementsOutput {
	return o
}

// Allow the principal to have cluster create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and `clusterId` argument. Everyone without `allowClusterCreate` argument set, but with permission to use Cluster Policy would be able to create clusters, but within boundaries of that specific policy.
func (o EntitlementsOutput) AllowClusterCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.BoolPtrOutput { return v.AllowClusterCreate }).(pulumi.BoolPtrOutput)
}

// Allow the principal to have instance pool create privileges. Defaults to false. More fine grained permissions could be assigned with Permissions and instancePoolId argument.
func (o EntitlementsOutput) AllowInstancePoolCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.BoolPtrOutput { return v.AllowInstancePoolCreate }).(pulumi.BoolPtrOutput)
}

// This is a field to allow the principal to have access to [Databricks SQL](https://databricks.com/product/databricks-sql) feature in User Interface and through databricks_sql_endpoint.
func (o EntitlementsOutput) DatabricksSqlAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.BoolPtrOutput { return v.DatabricksSqlAccess }).(pulumi.BoolPtrOutput)
}

// Canonical unique identifier for the group.
func (o EntitlementsOutput) GroupId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.StringPtrOutput { return v.GroupId }).(pulumi.StringPtrOutput)
}

// Canonical unique identifier for the service principal.
func (o EntitlementsOutput) ServicePrincipalId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.StringPtrOutput { return v.ServicePrincipalId }).(pulumi.StringPtrOutput)
}

// Canonical unique identifier for the user.
func (o EntitlementsOutput) UserId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.StringPtrOutput { return v.UserId }).(pulumi.StringPtrOutput)
}

// This is a field to allow the principal to have access to Databricks Workspace.
func (o EntitlementsOutput) WorkspaceAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Entitlements) pulumi.BoolPtrOutput { return v.WorkspaceAccess }).(pulumi.BoolPtrOutput)
}

type EntitlementsArrayOutput struct{ *pulumi.OutputState }

func (EntitlementsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Entitlements)(nil)).Elem()
}

func (o EntitlementsArrayOutput) ToEntitlementsArrayOutput() EntitlementsArrayOutput {
	return o
}

func (o EntitlementsArrayOutput) ToEntitlementsArrayOutputWithContext(ctx context.Context) EntitlementsArrayOutput {
	return o
}

func (o EntitlementsArrayOutput) Index(i pulumi.IntInput) EntitlementsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Entitlements {
		return vs[0].([]*Entitlements)[vs[1].(int)]
	}).(EntitlementsOutput)
}

type EntitlementsMapOutput struct{ *pulumi.OutputState }

func (EntitlementsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Entitlements)(nil)).Elem()
}

func (o EntitlementsMapOutput) ToEntitlementsMapOutput() EntitlementsMapOutput {
	return o
}

func (o EntitlementsMapOutput) ToEntitlementsMapOutputWithContext(ctx context.Context) EntitlementsMapOutput {
	return o
}

func (o EntitlementsMapOutput) MapIndex(k pulumi.StringInput) EntitlementsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Entitlements {
		return vs[0].(map[string]*Entitlements)[vs[1].(string)]
	}).(EntitlementsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EntitlementsInput)(nil)).Elem(), &Entitlements{})
	pulumi.RegisterInputType(reflect.TypeOf((*EntitlementsArrayInput)(nil)).Elem(), EntitlementsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EntitlementsMapInput)(nil)).Elem(), EntitlementsMap{})
	pulumi.RegisterOutputType(EntitlementsOutput{})
	pulumi.RegisterOutputType(EntitlementsArrayOutput{})
	pulumi.RegisterOutputType(EntitlementsMapOutput{})
}
