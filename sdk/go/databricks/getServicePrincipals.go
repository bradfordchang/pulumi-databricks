// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Related Resources
//
// The following resources are used in the same context:
//
// * End to end workspace management guide.
// * getCurrentUser data to retrieve information about User or databricks_service_principal, that is calling Databricks REST API.
// * Group to manage [groups in Databricks Workspace](https://docs.databricks.com/administration-guide/users-groups/groups.html) or [Account Console](https://accounts.cloud.databricks.com/) (for AWS deployments).
// * Group data to retrieve information about Group members, entitlements and instance profiles.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * GroupMember to attach users and groups as group members.
// * Permissions to manage [access control](https://docs.databricks.com/security/access-control/index.html) in Databricks workspace.
// * databricksService principal to manage service principals
func GetServicePrincipals(ctx *pulumi.Context, args *GetServicePrincipalsArgs, opts ...pulumi.InvokeOption) (*GetServicePrincipalsResult, error) {
	var rv GetServicePrincipalsResult
	err := ctx.Invoke("databricks:index/getServicePrincipals:getServicePrincipals", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getServicePrincipals.
type GetServicePrincipalsArgs struct {
	// List of `applicationIds` of service principals Individual service principal can be retrieved using ServicePrincipal data source
	ApplicationIds []string `pulumi:"applicationIds"`
	// Only return ServicePrincipal display name that match the given name string
	DisplayNameContains *string `pulumi:"displayNameContains"`
}

// A collection of values returned by getServicePrincipals.
type GetServicePrincipalsResult struct {
	// List of `applicationIds` of service principals Individual service principal can be retrieved using ServicePrincipal data source
	ApplicationIds      []string `pulumi:"applicationIds"`
	DisplayNameContains string   `pulumi:"displayNameContains"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}

func GetServicePrincipalsOutput(ctx *pulumi.Context, args GetServicePrincipalsOutputArgs, opts ...pulumi.InvokeOption) GetServicePrincipalsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetServicePrincipalsResult, error) {
			args := v.(GetServicePrincipalsArgs)
			r, err := GetServicePrincipals(ctx, &args, opts...)
			var s GetServicePrincipalsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetServicePrincipalsResultOutput)
}

// A collection of arguments for invoking getServicePrincipals.
type GetServicePrincipalsOutputArgs struct {
	// List of `applicationIds` of service principals Individual service principal can be retrieved using ServicePrincipal data source
	ApplicationIds pulumi.StringArrayInput `pulumi:"applicationIds"`
	// Only return ServicePrincipal display name that match the given name string
	DisplayNameContains pulumi.StringPtrInput `pulumi:"displayNameContains"`
}

func (GetServicePrincipalsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicePrincipalsArgs)(nil)).Elem()
}

// A collection of values returned by getServicePrincipals.
type GetServicePrincipalsResultOutput struct{ *pulumi.OutputState }

func (GetServicePrincipalsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetServicePrincipalsResult)(nil)).Elem()
}

func (o GetServicePrincipalsResultOutput) ToGetServicePrincipalsResultOutput() GetServicePrincipalsResultOutput {
	return o
}

func (o GetServicePrincipalsResultOutput) ToGetServicePrincipalsResultOutputWithContext(ctx context.Context) GetServicePrincipalsResultOutput {
	return o
}

// List of `applicationIds` of service principals Individual service principal can be retrieved using ServicePrincipal data source
func (o GetServicePrincipalsResultOutput) ApplicationIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetServicePrincipalsResult) []string { return v.ApplicationIds }).(pulumi.StringArrayOutput)
}

func (o GetServicePrincipalsResultOutput) DisplayNameContains() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicePrincipalsResult) string { return v.DisplayNameContains }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetServicePrincipalsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetServicePrincipalsResult) string { return v.Id }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetServicePrincipalsResultOutput{})
}
