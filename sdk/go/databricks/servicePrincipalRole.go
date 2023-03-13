// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource allows you to attach a role or InstanceProfile (AWS) to a databricks_service_principal.
//
// ## Example Usage
//
// # Granting a service principal access to an instance profile
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
//			instanceProfile, err := databricks.NewInstanceProfile(ctx, "instanceProfile", &databricks.InstanceProfileArgs{
//				InstanceProfileArn: pulumi.String("my_instance_profile_arn"),
//			})
//			if err != nil {
//				return err
//			}
//			this, err := databricks.NewServicePrincipal(ctx, "this", &databricks.ServicePrincipalArgs{
//				DisplayName: pulumi.String("My Service Principal"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewServicePrincipalRole(ctx, "myServicePrincipalInstanceProfile", &databricks.ServicePrincipalRoleArgs{
//				ServicePrincipalId: this.ID(),
//				Role:               instanceProfile.ID(),
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
// * UserRole to attach role or InstanceProfile (AWS) to databricks_user.
// * GroupInstanceProfile to attach InstanceProfile (AWS) to databricks_group.
// * GroupMember to attach users and groups as group members.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type ServicePrincipalRole struct {
	pulumi.CustomResourceState

	// This is the id of the role or instance profile resource.
	Role pulumi.StringOutput `pulumi:"role"`
	// This is the id of the service principal resource.
	ServicePrincipalId pulumi.StringOutput `pulumi:"servicePrincipalId"`
}

// NewServicePrincipalRole registers a new resource with the given unique name, arguments, and options.
func NewServicePrincipalRole(ctx *pulumi.Context,
	name string, args *ServicePrincipalRoleArgs, opts ...pulumi.ResourceOption) (*ServicePrincipalRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.ServicePrincipalId == nil {
		return nil, errors.New("invalid value for required argument 'ServicePrincipalId'")
	}
	var resource ServicePrincipalRole
	err := ctx.RegisterResource("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicePrincipalRole gets an existing ServicePrincipalRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicePrincipalRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicePrincipalRoleState, opts ...pulumi.ResourceOption) (*ServicePrincipalRole, error) {
	var resource ServicePrincipalRole
	err := ctx.ReadResource("databricks:index/servicePrincipalRole:ServicePrincipalRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServicePrincipalRole resources.
type servicePrincipalRoleState struct {
	// This is the id of the role or instance profile resource.
	Role *string `pulumi:"role"`
	// This is the id of the service principal resource.
	ServicePrincipalId *string `pulumi:"servicePrincipalId"`
}

type ServicePrincipalRoleState struct {
	// This is the id of the role or instance profile resource.
	Role pulumi.StringPtrInput
	// This is the id of the service principal resource.
	ServicePrincipalId pulumi.StringPtrInput
}

func (ServicePrincipalRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePrincipalRoleState)(nil)).Elem()
}

type servicePrincipalRoleArgs struct {
	// This is the id of the role or instance profile resource.
	Role string `pulumi:"role"`
	// This is the id of the service principal resource.
	ServicePrincipalId string `pulumi:"servicePrincipalId"`
}

// The set of arguments for constructing a ServicePrincipalRole resource.
type ServicePrincipalRoleArgs struct {
	// This is the id of the role or instance profile resource.
	Role pulumi.StringInput
	// This is the id of the service principal resource.
	ServicePrincipalId pulumi.StringInput
}

func (ServicePrincipalRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePrincipalRoleArgs)(nil)).Elem()
}

type ServicePrincipalRoleInput interface {
	pulumi.Input

	ToServicePrincipalRoleOutput() ServicePrincipalRoleOutput
	ToServicePrincipalRoleOutputWithContext(ctx context.Context) ServicePrincipalRoleOutput
}

func (*ServicePrincipalRole) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePrincipalRole)(nil)).Elem()
}

func (i *ServicePrincipalRole) ToServicePrincipalRoleOutput() ServicePrincipalRoleOutput {
	return i.ToServicePrincipalRoleOutputWithContext(context.Background())
}

func (i *ServicePrincipalRole) ToServicePrincipalRoleOutputWithContext(ctx context.Context) ServicePrincipalRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalRoleOutput)
}

// ServicePrincipalRoleArrayInput is an input type that accepts ServicePrincipalRoleArray and ServicePrincipalRoleArrayOutput values.
// You can construct a concrete instance of `ServicePrincipalRoleArrayInput` via:
//
//	ServicePrincipalRoleArray{ ServicePrincipalRoleArgs{...} }
type ServicePrincipalRoleArrayInput interface {
	pulumi.Input

	ToServicePrincipalRoleArrayOutput() ServicePrincipalRoleArrayOutput
	ToServicePrincipalRoleArrayOutputWithContext(context.Context) ServicePrincipalRoleArrayOutput
}

type ServicePrincipalRoleArray []ServicePrincipalRoleInput

func (ServicePrincipalRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePrincipalRole)(nil)).Elem()
}

func (i ServicePrincipalRoleArray) ToServicePrincipalRoleArrayOutput() ServicePrincipalRoleArrayOutput {
	return i.ToServicePrincipalRoleArrayOutputWithContext(context.Background())
}

func (i ServicePrincipalRoleArray) ToServicePrincipalRoleArrayOutputWithContext(ctx context.Context) ServicePrincipalRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalRoleArrayOutput)
}

// ServicePrincipalRoleMapInput is an input type that accepts ServicePrincipalRoleMap and ServicePrincipalRoleMapOutput values.
// You can construct a concrete instance of `ServicePrincipalRoleMapInput` via:
//
//	ServicePrincipalRoleMap{ "key": ServicePrincipalRoleArgs{...} }
type ServicePrincipalRoleMapInput interface {
	pulumi.Input

	ToServicePrincipalRoleMapOutput() ServicePrincipalRoleMapOutput
	ToServicePrincipalRoleMapOutputWithContext(context.Context) ServicePrincipalRoleMapOutput
}

type ServicePrincipalRoleMap map[string]ServicePrincipalRoleInput

func (ServicePrincipalRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePrincipalRole)(nil)).Elem()
}

func (i ServicePrincipalRoleMap) ToServicePrincipalRoleMapOutput() ServicePrincipalRoleMapOutput {
	return i.ToServicePrincipalRoleMapOutputWithContext(context.Background())
}

func (i ServicePrincipalRoleMap) ToServicePrincipalRoleMapOutputWithContext(ctx context.Context) ServicePrincipalRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePrincipalRoleMapOutput)
}

type ServicePrincipalRoleOutput struct{ *pulumi.OutputState }

func (ServicePrincipalRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePrincipalRole)(nil)).Elem()
}

func (o ServicePrincipalRoleOutput) ToServicePrincipalRoleOutput() ServicePrincipalRoleOutput {
	return o
}

func (o ServicePrincipalRoleOutput) ToServicePrincipalRoleOutputWithContext(ctx context.Context) ServicePrincipalRoleOutput {
	return o
}

// This is the id of the role or instance profile resource.
func (o ServicePrincipalRoleOutput) Role() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipalRole) pulumi.StringOutput { return v.Role }).(pulumi.StringOutput)
}

// This is the id of the service principal resource.
func (o ServicePrincipalRoleOutput) ServicePrincipalId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePrincipalRole) pulumi.StringOutput { return v.ServicePrincipalId }).(pulumi.StringOutput)
}

type ServicePrincipalRoleArrayOutput struct{ *pulumi.OutputState }

func (ServicePrincipalRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePrincipalRole)(nil)).Elem()
}

func (o ServicePrincipalRoleArrayOutput) ToServicePrincipalRoleArrayOutput() ServicePrincipalRoleArrayOutput {
	return o
}

func (o ServicePrincipalRoleArrayOutput) ToServicePrincipalRoleArrayOutputWithContext(ctx context.Context) ServicePrincipalRoleArrayOutput {
	return o
}

func (o ServicePrincipalRoleArrayOutput) Index(i pulumi.IntInput) ServicePrincipalRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServicePrincipalRole {
		return vs[0].([]*ServicePrincipalRole)[vs[1].(int)]
	}).(ServicePrincipalRoleOutput)
}

type ServicePrincipalRoleMapOutput struct{ *pulumi.OutputState }

func (ServicePrincipalRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePrincipalRole)(nil)).Elem()
}

func (o ServicePrincipalRoleMapOutput) ToServicePrincipalRoleMapOutput() ServicePrincipalRoleMapOutput {
	return o
}

func (o ServicePrincipalRoleMapOutput) ToServicePrincipalRoleMapOutputWithContext(ctx context.Context) ServicePrincipalRoleMapOutput {
	return o
}

func (o ServicePrincipalRoleMapOutput) MapIndex(k pulumi.StringInput) ServicePrincipalRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServicePrincipalRole {
		return vs[0].(map[string]*ServicePrincipalRole)[vs[1].(string)]
	}).(ServicePrincipalRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalRoleInput)(nil)).Elem(), &ServicePrincipalRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalRoleArrayInput)(nil)).Elem(), ServicePrincipalRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePrincipalRoleMapInput)(nil)).Elem(), ServicePrincipalRoleMap{})
	pulumi.RegisterOutputType(ServicePrincipalRoleOutput{})
	pulumi.RegisterOutputType(ServicePrincipalRoleArrayOutput{})
	pulumi.RegisterOutputType(ServicePrincipalRoleMapOutput{})
}
