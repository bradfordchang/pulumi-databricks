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

// These resources are invoked in the account context. Permission Assignment Account API endpoints are restricted to account admins. Provider must have `accountId` attribute configured. Account Id that could be found in the bottom left corner of Accounts Console
//
// ## Example Usage
//
// In account context, adding account-level group to a workspace:
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
//			dataEng, err := databricks.NewGroup(ctx, "dataEng", nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addAdminGroup", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: dataEng.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("ADMIN"),
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
// In account context, adding account-level user to a workspace:
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
//			me, err := databricks.NewUser(ctx, "me", &databricks.UserArgs{
//				UserName: pulumi.String("me@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addUser", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: me.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("USER"),
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
// In account context, adding account-level service principal to a workspace:
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
//			sp, err := databricks.NewServicePrincipal(ctx, "sp", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("Automation-only SP"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsPermissionAssignment(ctx, "addAdminSpn", &databricks.MwsPermissionAssignmentArgs{
//				WorkspaceId: pulumi.Any(databricks_mws_workspaces.This.Workspace_id),
//				PrincipalId: sp.ID(),
//				Permissions: pulumi.StringArray{
//					pulumi.String("ADMIN"),
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
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupMember to attach users and groups as group members.
// * PermissionAssignment to manage permission assignment from a workspace context
//
// ## Import
//
// The resource `databricks_mws_permission_assignment` can be imported using the workspace id and principal id bash
//
// ```sh
//
//	$ pulumi import databricks:index/mwsPermissionAssignment:MwsPermissionAssignment this "workspace_id|principal_id"
//
// ```
type MwsPermissionAssignment struct {
	pulumi.CustomResourceState

	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayOutput `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
	PrincipalId pulumi.IntOutput `pulumi:"principalId"`
	// Databricks workspace ID.
	WorkspaceId pulumi.IntOutput `pulumi:"workspaceId"`
}

// NewMwsPermissionAssignment registers a new resource with the given unique name, arguments, and options.
func NewMwsPermissionAssignment(ctx *pulumi.Context,
	name string, args *MwsPermissionAssignmentArgs, opts ...pulumi.ResourceOption) (*MwsPermissionAssignment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.PrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'PrincipalId'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MwsPermissionAssignment
	err := ctx.RegisterResource("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsPermissionAssignment gets an existing MwsPermissionAssignment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsPermissionAssignment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsPermissionAssignmentState, opts ...pulumi.ResourceOption) (*MwsPermissionAssignment, error) {
	var resource MwsPermissionAssignment
	err := ctx.ReadResource("databricks:index/mwsPermissionAssignment:MwsPermissionAssignment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsPermissionAssignment resources.
type mwsPermissionAssignmentState struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions []string `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
	PrincipalId *int `pulumi:"principalId"`
	// Databricks workspace ID.
	WorkspaceId *int `pulumi:"workspaceId"`
}

type MwsPermissionAssignmentState struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayInput
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
	PrincipalId pulumi.IntPtrInput
	// Databricks workspace ID.
	WorkspaceId pulumi.IntPtrInput
}

func (MwsPermissionAssignmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPermissionAssignmentState)(nil)).Elem()
}

type mwsPermissionAssignmentArgs struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions []string `pulumi:"permissions"`
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
	PrincipalId int `pulumi:"principalId"`
	// Databricks workspace ID.
	WorkspaceId int `pulumi:"workspaceId"`
}

// The set of arguments for constructing a MwsPermissionAssignment resource.
type MwsPermissionAssignmentArgs struct {
	// The list of workspace permissions to assign to the principal:
	// * `"USER"` - Can access the workspace with basic privileges.
	// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
	Permissions pulumi.StringArrayInput
	// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
	PrincipalId pulumi.IntInput
	// Databricks workspace ID.
	WorkspaceId pulumi.IntInput
}

func (MwsPermissionAssignmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsPermissionAssignmentArgs)(nil)).Elem()
}

type MwsPermissionAssignmentInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput
	ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput
}

func (*MwsPermissionAssignment) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPermissionAssignment)(nil)).Elem()
}

func (i *MwsPermissionAssignment) ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput {
	return i.ToMwsPermissionAssignmentOutputWithContext(context.Background())
}

func (i *MwsPermissionAssignment) ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentOutput)
}

func (i *MwsPermissionAssignment) ToOutput(ctx context.Context) pulumix.Output[*MwsPermissionAssignment] {
	return pulumix.Output[*MwsPermissionAssignment]{
		OutputState: i.ToMwsPermissionAssignmentOutputWithContext(ctx).OutputState,
	}
}

// MwsPermissionAssignmentArrayInput is an input type that accepts MwsPermissionAssignmentArray and MwsPermissionAssignmentArrayOutput values.
// You can construct a concrete instance of `MwsPermissionAssignmentArrayInput` via:
//
//	MwsPermissionAssignmentArray{ MwsPermissionAssignmentArgs{...} }
type MwsPermissionAssignmentArrayInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput
	ToMwsPermissionAssignmentArrayOutputWithContext(context.Context) MwsPermissionAssignmentArrayOutput
}

type MwsPermissionAssignmentArray []MwsPermissionAssignmentInput

func (MwsPermissionAssignmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPermissionAssignment)(nil)).Elem()
}

func (i MwsPermissionAssignmentArray) ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput {
	return i.ToMwsPermissionAssignmentArrayOutputWithContext(context.Background())
}

func (i MwsPermissionAssignmentArray) ToMwsPermissionAssignmentArrayOutputWithContext(ctx context.Context) MwsPermissionAssignmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentArrayOutput)
}

func (i MwsPermissionAssignmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*MwsPermissionAssignment] {
	return pulumix.Output[[]*MwsPermissionAssignment]{
		OutputState: i.ToMwsPermissionAssignmentArrayOutputWithContext(ctx).OutputState,
	}
}

// MwsPermissionAssignmentMapInput is an input type that accepts MwsPermissionAssignmentMap and MwsPermissionAssignmentMapOutput values.
// You can construct a concrete instance of `MwsPermissionAssignmentMapInput` via:
//
//	MwsPermissionAssignmentMap{ "key": MwsPermissionAssignmentArgs{...} }
type MwsPermissionAssignmentMapInput interface {
	pulumi.Input

	ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput
	ToMwsPermissionAssignmentMapOutputWithContext(context.Context) MwsPermissionAssignmentMapOutput
}

type MwsPermissionAssignmentMap map[string]MwsPermissionAssignmentInput

func (MwsPermissionAssignmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPermissionAssignment)(nil)).Elem()
}

func (i MwsPermissionAssignmentMap) ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput {
	return i.ToMwsPermissionAssignmentMapOutputWithContext(context.Background())
}

func (i MwsPermissionAssignmentMap) ToMwsPermissionAssignmentMapOutputWithContext(ctx context.Context) MwsPermissionAssignmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsPermissionAssignmentMapOutput)
}

func (i MwsPermissionAssignmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*MwsPermissionAssignment] {
	return pulumix.Output[map[string]*MwsPermissionAssignment]{
		OutputState: i.ToMwsPermissionAssignmentMapOutputWithContext(ctx).OutputState,
	}
}

type MwsPermissionAssignmentOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentOutput) ToMwsPermissionAssignmentOutput() MwsPermissionAssignmentOutput {
	return o
}

func (o MwsPermissionAssignmentOutput) ToMwsPermissionAssignmentOutputWithContext(ctx context.Context) MwsPermissionAssignmentOutput {
	return o
}

func (o MwsPermissionAssignmentOutput) ToOutput(ctx context.Context) pulumix.Output[*MwsPermissionAssignment] {
	return pulumix.Output[*MwsPermissionAssignment]{
		OutputState: o.OutputState,
	}
}

// The list of workspace permissions to assign to the principal:
// * `"USER"` - Can access the workspace with basic privileges.
// * `"ADMIN"` - Can access the workspace and has workspace admin privileges to manage users and groups, workspace configurations, and more.
func (o MwsPermissionAssignmentOutput) Permissions() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.StringArrayOutput { return v.Permissions }).(pulumi.StringArrayOutput)
}

// Databricks ID of the user, service principal, or group. The principal ID can be retrieved using the SCIM API, or using databricks_user, ServicePrincipal or Group data sources.
func (o MwsPermissionAssignmentOutput) PrincipalId() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.IntOutput { return v.PrincipalId }).(pulumi.IntOutput)
}

// Databricks workspace ID.
func (o MwsPermissionAssignmentOutput) WorkspaceId() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsPermissionAssignment) pulumi.IntOutput { return v.WorkspaceId }).(pulumi.IntOutput)
}

type MwsPermissionAssignmentArrayOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentArrayOutput) ToMwsPermissionAssignmentArrayOutput() MwsPermissionAssignmentArrayOutput {
	return o
}

func (o MwsPermissionAssignmentArrayOutput) ToMwsPermissionAssignmentArrayOutputWithContext(ctx context.Context) MwsPermissionAssignmentArrayOutput {
	return o
}

func (o MwsPermissionAssignmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*MwsPermissionAssignment] {
	return pulumix.Output[[]*MwsPermissionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o MwsPermissionAssignmentArrayOutput) Index(i pulumi.IntInput) MwsPermissionAssignmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsPermissionAssignment {
		return vs[0].([]*MwsPermissionAssignment)[vs[1].(int)]
	}).(MwsPermissionAssignmentOutput)
}

type MwsPermissionAssignmentMapOutput struct{ *pulumi.OutputState }

func (MwsPermissionAssignmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsPermissionAssignment)(nil)).Elem()
}

func (o MwsPermissionAssignmentMapOutput) ToMwsPermissionAssignmentMapOutput() MwsPermissionAssignmentMapOutput {
	return o
}

func (o MwsPermissionAssignmentMapOutput) ToMwsPermissionAssignmentMapOutputWithContext(ctx context.Context) MwsPermissionAssignmentMapOutput {
	return o
}

func (o MwsPermissionAssignmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*MwsPermissionAssignment] {
	return pulumix.Output[map[string]*MwsPermissionAssignment]{
		OutputState: o.OutputState,
	}
}

func (o MwsPermissionAssignmentMapOutput) MapIndex(k pulumi.StringInput) MwsPermissionAssignmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsPermissionAssignment {
		return vs[0].(map[string]*MwsPermissionAssignment)[vs[1].(string)]
	}).(MwsPermissionAssignmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentInput)(nil)).Elem(), &MwsPermissionAssignment{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentArrayInput)(nil)).Elem(), MwsPermissionAssignmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsPermissionAssignmentMapInput)(nil)).Elem(), MwsPermissionAssignmentMap{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentOutput{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentArrayOutput{})
	pulumi.RegisterOutputType(MwsPermissionAssignmentMapOutput{})
}
