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
// Retrieves information about Group members, entitlements and instance profiles.
//
// ## Example Usage
//
// # Adding user to administrative group
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
//			admins, err := databricks.LookupGroup(ctx, &databricks.LookupGroupArgs{
//				DisplayName: "admins",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			me, err := databricks.NewUser(ctx, "me", &databricks.UserArgs{
//				UserName: pulumi.String("me@example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGroupMember(ctx, "myMemberA", &databricks.GroupMemberArgs{
//				GroupId:  *pulumi.String(admins.Id),
//				MemberId: me.ID(),
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
// * End to end workspace management guide
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * Directory to manage directories in [Databricks Workpace](https://docs.databricks.com/workspace/workspace-objects.html).
// * GroupMember to attach users and groups as group members.
// * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
// * User to [manage users](https://docs.databricks.com/administration-guide/users-groups/users.html), that could be added to Group within the workspace.
func LookupGroup(ctx *pulumi.Context, args *LookupGroupArgs, opts ...pulumi.InvokeOption) (*LookupGroupResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupGroupResult
	err := ctx.Invoke("databricks:index/getGroup:getGroup", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGroup.
type LookupGroupArgs struct {
	// True if group members can create clusters
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// True if group members can create instance pools
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// Set of Group identifiers, that can be modified with GroupMember resource.
	ChildGroups         []string `pulumi:"childGroups"`
	DatabricksSqlAccess *bool    `pulumi:"databricksSqlAccess"`
	// Display name of the group. The group must exist before this resource can be planned.
	DisplayName string `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId *string `pulumi:"externalId"`
	// Set of group identifiers, that can be modified with GroupMember resource.
	Groups []string `pulumi:"groups"`
	// Set of instance profile ARNs, that can be modified by GroupInstanceProfile resource.
	InstanceProfiles []string `pulumi:"instanceProfiles"`
	// Deprecated: Please use `users`, `service_principals`, and `child_groups` instead
	Members []string `pulumi:"members"`
	// Collect information for all nested groups. *Defaults to true.*
	Recursive *bool `pulumi:"recursive"`
	// Set of ServicePrincipal identifiers, that can be modified with GroupMember resource.
	ServicePrincipals []string `pulumi:"servicePrincipals"`
	// Set of User identifiers, that can be modified with GroupMember resource.
	Users           []string `pulumi:"users"`
	WorkspaceAccess *bool    `pulumi:"workspaceAccess"`
}

// A collection of values returned by getGroup.
type LookupGroupResult struct {
	// True if group members can create clusters
	AllowClusterCreate *bool `pulumi:"allowClusterCreate"`
	// True if group members can create instance pools
	AllowInstancePoolCreate *bool `pulumi:"allowInstancePoolCreate"`
	// Set of Group identifiers, that can be modified with GroupMember resource.
	ChildGroups         []string `pulumi:"childGroups"`
	DatabricksSqlAccess *bool    `pulumi:"databricksSqlAccess"`
	DisplayName         string   `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId string `pulumi:"externalId"`
	// Set of group identifiers, that can be modified with GroupMember resource.
	Groups []string `pulumi:"groups"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Set of instance profile ARNs, that can be modified by GroupInstanceProfile resource.
	InstanceProfiles []string `pulumi:"instanceProfiles"`
	// Deprecated: Please use `users`, `service_principals`, and `child_groups` instead
	Members   []string `pulumi:"members"`
	Recursive *bool    `pulumi:"recursive"`
	// Set of ServicePrincipal identifiers, that can be modified with GroupMember resource.
	ServicePrincipals []string `pulumi:"servicePrincipals"`
	// Set of User identifiers, that can be modified with GroupMember resource.
	Users           []string `pulumi:"users"`
	WorkspaceAccess *bool    `pulumi:"workspaceAccess"`
}

func LookupGroupOutput(ctx *pulumi.Context, args LookupGroupOutputArgs, opts ...pulumi.InvokeOption) LookupGroupResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGroupResult, error) {
			args := v.(LookupGroupArgs)
			r, err := LookupGroup(ctx, &args, opts...)
			var s LookupGroupResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGroupResultOutput)
}

// A collection of arguments for invoking getGroup.
type LookupGroupOutputArgs struct {
	// True if group members can create clusters
	AllowClusterCreate pulumi.BoolPtrInput `pulumi:"allowClusterCreate"`
	// True if group members can create instance pools
	AllowInstancePoolCreate pulumi.BoolPtrInput `pulumi:"allowInstancePoolCreate"`
	// Set of Group identifiers, that can be modified with GroupMember resource.
	ChildGroups         pulumi.StringArrayInput `pulumi:"childGroups"`
	DatabricksSqlAccess pulumi.BoolPtrInput     `pulumi:"databricksSqlAccess"`
	// Display name of the group. The group must exist before this resource can be planned.
	DisplayName pulumi.StringInput `pulumi:"displayName"`
	// ID of the group in an external identity provider.
	ExternalId pulumi.StringPtrInput `pulumi:"externalId"`
	// Set of group identifiers, that can be modified with GroupMember resource.
	Groups pulumi.StringArrayInput `pulumi:"groups"`
	// Set of instance profile ARNs, that can be modified by GroupInstanceProfile resource.
	InstanceProfiles pulumi.StringArrayInput `pulumi:"instanceProfiles"`
	// Deprecated: Please use `users`, `service_principals`, and `child_groups` instead
	Members pulumi.StringArrayInput `pulumi:"members"`
	// Collect information for all nested groups. *Defaults to true.*
	Recursive pulumi.BoolPtrInput `pulumi:"recursive"`
	// Set of ServicePrincipal identifiers, that can be modified with GroupMember resource.
	ServicePrincipals pulumi.StringArrayInput `pulumi:"servicePrincipals"`
	// Set of User identifiers, that can be modified with GroupMember resource.
	Users           pulumi.StringArrayInput `pulumi:"users"`
	WorkspaceAccess pulumi.BoolPtrInput     `pulumi:"workspaceAccess"`
}

func (LookupGroupOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupArgs)(nil)).Elem()
}

// A collection of values returned by getGroup.
type LookupGroupResultOutput struct{ *pulumi.OutputState }

func (LookupGroupResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGroupResult)(nil)).Elem()
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutput() LookupGroupResultOutput {
	return o
}

func (o LookupGroupResultOutput) ToLookupGroupResultOutputWithContext(ctx context.Context) LookupGroupResultOutput {
	return o
}

// True if group members can create clusters
func (o LookupGroupResultOutput) AllowClusterCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGroupResult) *bool { return v.AllowClusterCreate }).(pulumi.BoolPtrOutput)
}

// True if group members can create instance pools
func (o LookupGroupResultOutput) AllowInstancePoolCreate() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGroupResult) *bool { return v.AllowInstancePoolCreate }).(pulumi.BoolPtrOutput)
}

// Set of Group identifiers, that can be modified with GroupMember resource.
func (o LookupGroupResultOutput) ChildGroups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.ChildGroups }).(pulumi.StringArrayOutput)
}

func (o LookupGroupResultOutput) DatabricksSqlAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGroupResult) *bool { return v.DatabricksSqlAccess }).(pulumi.BoolPtrOutput)
}

func (o LookupGroupResultOutput) DisplayName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.DisplayName }).(pulumi.StringOutput)
}

// ID of the group in an external identity provider.
func (o LookupGroupResultOutput) ExternalId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.ExternalId }).(pulumi.StringOutput)
}

// Set of group identifiers, that can be modified with GroupMember resource.
func (o LookupGroupResultOutput) Groups() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.Groups }).(pulumi.StringArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGroupResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGroupResult) string { return v.Id }).(pulumi.StringOutput)
}

// Set of instance profile ARNs, that can be modified by GroupInstanceProfile resource.
func (o LookupGroupResultOutput) InstanceProfiles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.InstanceProfiles }).(pulumi.StringArrayOutput)
}

// Deprecated: Please use `users`, `service_principals`, and `child_groups` instead
func (o LookupGroupResultOutput) Members() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.Members }).(pulumi.StringArrayOutput)
}

func (o LookupGroupResultOutput) Recursive() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGroupResult) *bool { return v.Recursive }).(pulumi.BoolPtrOutput)
}

// Set of ServicePrincipal identifiers, that can be modified with GroupMember resource.
func (o LookupGroupResultOutput) ServicePrincipals() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.ServicePrincipals }).(pulumi.StringArrayOutput)
}

// Set of User identifiers, that can be modified with GroupMember resource.
func (o LookupGroupResultOutput) Users() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGroupResult) []string { return v.Users }).(pulumi.StringArrayOutput)
}

func (o LookupGroupResultOutput) WorkspaceAccess() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupGroupResult) *bool { return v.WorkspaceAccess }).(pulumi.BoolPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGroupResultOutput{})
}
