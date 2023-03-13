// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/s3"
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			databricksAccountId := cfg.RequireObject("databricksAccountId")
//			rootStorageBucket, err := s3.NewBucketV2(ctx, "rootStorageBucket", &s3.BucketV2Args{
//				Acl: pulumi.String("private"),
//				Versionings: s3.BucketV2VersioningArray{
//					&s3.BucketV2VersioningArgs{
//						Enabled: pulumi.Bool(false),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewMwsStorageConfigurations(ctx, "this", &databricks.MwsStorageConfigurationsArgs{
//				AccountId:                pulumi.Any(databricksAccountId),
//				StorageConfigurationName: pulumi.String(fmt.Sprintf("%v-storage", _var.Prefix)),
//				BucketName:               rootStorageBucket.Bucket,
//			}, pulumi.Provider(databricks.Mws))
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
// * Provisioning Databricks on AWS guide.
// * Provisioning Databricks on AWS with PrivateLink guide.
// * MwsCredentials to configure the cross-account role for creation of new workspaces within AWS.
// * MwsCustomerManagedKeys to configure KMS keys for new workspaces within AWS.
// * MwsLogDelivery to configure delivery of [billable usage logs](https://docs.databricks.com/administration-guide/account-settings/billable-usage-delivery.html) and [audit logs](https://docs.databricks.com/administration-guide/account-settings/audit-logs.html).
// * MwsNetworks to [configure VPC](https://docs.databricks.com/administration-guide/cloud-configurations/aws/customer-managed-vpc.html) & subnets for new workspaces within AWS.
// * MwsWorkspaces to set up [workspaces in E2 architecture on AWS](https://docs.databricks.com/getting-started/overview.html#e2-architecture-1).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MwsStorageConfigurations struct {
	pulumi.CustomResourceState

	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// name of AWS S3 bucket
	BucketName   pulumi.StringOutput `pulumi:"bucketName"`
	CreationTime pulumi.IntOutput    `pulumi:"creationTime"`
	// (String) id of storage config to be used for `databricksMwsWorkspace` resource.
	StorageConfigurationId pulumi.StringOutput `pulumi:"storageConfigurationId"`
	// name under which this storage configuration is stored
	StorageConfigurationName pulumi.StringOutput `pulumi:"storageConfigurationName"`
}

// NewMwsStorageConfigurations registers a new resource with the given unique name, arguments, and options.
func NewMwsStorageConfigurations(ctx *pulumi.Context,
	name string, args *MwsStorageConfigurationsArgs, opts ...pulumi.ResourceOption) (*MwsStorageConfigurations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.BucketName == nil {
		return nil, errors.New("invalid value for required argument 'BucketName'")
	}
	if args.StorageConfigurationName == nil {
		return nil, errors.New("invalid value for required argument 'StorageConfigurationName'")
	}
	if args.AccountId != nil {
		args.AccountId = pulumi.ToSecret(args.AccountId).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accountId",
	})
	opts = append(opts, secrets)
	var resource MwsStorageConfigurations
	err := ctx.RegisterResource("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsStorageConfigurations gets an existing MwsStorageConfigurations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsStorageConfigurations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsStorageConfigurationsState, opts ...pulumi.ResourceOption) (*MwsStorageConfigurations, error) {
	var resource MwsStorageConfigurations
	err := ctx.ReadResource("databricks:index/mwsStorageConfigurations:MwsStorageConfigurations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsStorageConfigurations resources.
type mwsStorageConfigurationsState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId *string `pulumi:"accountId"`
	// name of AWS S3 bucket
	BucketName   *string `pulumi:"bucketName"`
	CreationTime *int    `pulumi:"creationTime"`
	// (String) id of storage config to be used for `databricksMwsWorkspace` resource.
	StorageConfigurationId *string `pulumi:"storageConfigurationId"`
	// name under which this storage configuration is stored
	StorageConfigurationName *string `pulumi:"storageConfigurationName"`
}

type MwsStorageConfigurationsState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringPtrInput
	// name of AWS S3 bucket
	BucketName   pulumi.StringPtrInput
	CreationTime pulumi.IntPtrInput
	// (String) id of storage config to be used for `databricksMwsWorkspace` resource.
	StorageConfigurationId pulumi.StringPtrInput
	// name under which this storage configuration is stored
	StorageConfigurationName pulumi.StringPtrInput
}

func (MwsStorageConfigurationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsStorageConfigurationsState)(nil)).Elem()
}

type mwsStorageConfigurationsArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId string `pulumi:"accountId"`
	// name of AWS S3 bucket
	BucketName string `pulumi:"bucketName"`
	// name under which this storage configuration is stored
	StorageConfigurationName string `pulumi:"storageConfigurationName"`
}

// The set of arguments for constructing a MwsStorageConfigurations resource.
type MwsStorageConfigurationsArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
	AccountId pulumi.StringInput
	// name of AWS S3 bucket
	BucketName pulumi.StringInput
	// name under which this storage configuration is stored
	StorageConfigurationName pulumi.StringInput
}

func (MwsStorageConfigurationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsStorageConfigurationsArgs)(nil)).Elem()
}

type MwsStorageConfigurationsInput interface {
	pulumi.Input

	ToMwsStorageConfigurationsOutput() MwsStorageConfigurationsOutput
	ToMwsStorageConfigurationsOutputWithContext(ctx context.Context) MwsStorageConfigurationsOutput
}

func (*MwsStorageConfigurations) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsStorageConfigurations)(nil)).Elem()
}

func (i *MwsStorageConfigurations) ToMwsStorageConfigurationsOutput() MwsStorageConfigurationsOutput {
	return i.ToMwsStorageConfigurationsOutputWithContext(context.Background())
}

func (i *MwsStorageConfigurations) ToMwsStorageConfigurationsOutputWithContext(ctx context.Context) MwsStorageConfigurationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsStorageConfigurationsOutput)
}

// MwsStorageConfigurationsArrayInput is an input type that accepts MwsStorageConfigurationsArray and MwsStorageConfigurationsArrayOutput values.
// You can construct a concrete instance of `MwsStorageConfigurationsArrayInput` via:
//
//	MwsStorageConfigurationsArray{ MwsStorageConfigurationsArgs{...} }
type MwsStorageConfigurationsArrayInput interface {
	pulumi.Input

	ToMwsStorageConfigurationsArrayOutput() MwsStorageConfigurationsArrayOutput
	ToMwsStorageConfigurationsArrayOutputWithContext(context.Context) MwsStorageConfigurationsArrayOutput
}

type MwsStorageConfigurationsArray []MwsStorageConfigurationsInput

func (MwsStorageConfigurationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsStorageConfigurations)(nil)).Elem()
}

func (i MwsStorageConfigurationsArray) ToMwsStorageConfigurationsArrayOutput() MwsStorageConfigurationsArrayOutput {
	return i.ToMwsStorageConfigurationsArrayOutputWithContext(context.Background())
}

func (i MwsStorageConfigurationsArray) ToMwsStorageConfigurationsArrayOutputWithContext(ctx context.Context) MwsStorageConfigurationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsStorageConfigurationsArrayOutput)
}

// MwsStorageConfigurationsMapInput is an input type that accepts MwsStorageConfigurationsMap and MwsStorageConfigurationsMapOutput values.
// You can construct a concrete instance of `MwsStorageConfigurationsMapInput` via:
//
//	MwsStorageConfigurationsMap{ "key": MwsStorageConfigurationsArgs{...} }
type MwsStorageConfigurationsMapInput interface {
	pulumi.Input

	ToMwsStorageConfigurationsMapOutput() MwsStorageConfigurationsMapOutput
	ToMwsStorageConfigurationsMapOutputWithContext(context.Context) MwsStorageConfigurationsMapOutput
}

type MwsStorageConfigurationsMap map[string]MwsStorageConfigurationsInput

func (MwsStorageConfigurationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsStorageConfigurations)(nil)).Elem()
}

func (i MwsStorageConfigurationsMap) ToMwsStorageConfigurationsMapOutput() MwsStorageConfigurationsMapOutput {
	return i.ToMwsStorageConfigurationsMapOutputWithContext(context.Background())
}

func (i MwsStorageConfigurationsMap) ToMwsStorageConfigurationsMapOutputWithContext(ctx context.Context) MwsStorageConfigurationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsStorageConfigurationsMapOutput)
}

type MwsStorageConfigurationsOutput struct{ *pulumi.OutputState }

func (MwsStorageConfigurationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsStorageConfigurations)(nil)).Elem()
}

func (o MwsStorageConfigurationsOutput) ToMwsStorageConfigurationsOutput() MwsStorageConfigurationsOutput {
	return o
}

func (o MwsStorageConfigurationsOutput) ToMwsStorageConfigurationsOutputWithContext(ctx context.Context) MwsStorageConfigurationsOutput {
	return o
}

// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
func (o MwsStorageConfigurationsOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsStorageConfigurations) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// name of AWS S3 bucket
func (o MwsStorageConfigurationsOutput) BucketName() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsStorageConfigurations) pulumi.StringOutput { return v.BucketName }).(pulumi.StringOutput)
}

func (o MwsStorageConfigurationsOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsStorageConfigurations) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

// (String) id of storage config to be used for `databricksMwsWorkspace` resource.
func (o MwsStorageConfigurationsOutput) StorageConfigurationId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsStorageConfigurations) pulumi.StringOutput { return v.StorageConfigurationId }).(pulumi.StringOutput)
}

// name under which this storage configuration is stored
func (o MwsStorageConfigurationsOutput) StorageConfigurationName() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsStorageConfigurations) pulumi.StringOutput { return v.StorageConfigurationName }).(pulumi.StringOutput)
}

type MwsStorageConfigurationsArrayOutput struct{ *pulumi.OutputState }

func (MwsStorageConfigurationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsStorageConfigurations)(nil)).Elem()
}

func (o MwsStorageConfigurationsArrayOutput) ToMwsStorageConfigurationsArrayOutput() MwsStorageConfigurationsArrayOutput {
	return o
}

func (o MwsStorageConfigurationsArrayOutput) ToMwsStorageConfigurationsArrayOutputWithContext(ctx context.Context) MwsStorageConfigurationsArrayOutput {
	return o
}

func (o MwsStorageConfigurationsArrayOutput) Index(i pulumi.IntInput) MwsStorageConfigurationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsStorageConfigurations {
		return vs[0].([]*MwsStorageConfigurations)[vs[1].(int)]
	}).(MwsStorageConfigurationsOutput)
}

type MwsStorageConfigurationsMapOutput struct{ *pulumi.OutputState }

func (MwsStorageConfigurationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsStorageConfigurations)(nil)).Elem()
}

func (o MwsStorageConfigurationsMapOutput) ToMwsStorageConfigurationsMapOutput() MwsStorageConfigurationsMapOutput {
	return o
}

func (o MwsStorageConfigurationsMapOutput) ToMwsStorageConfigurationsMapOutputWithContext(ctx context.Context) MwsStorageConfigurationsMapOutput {
	return o
}

func (o MwsStorageConfigurationsMapOutput) MapIndex(k pulumi.StringInput) MwsStorageConfigurationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsStorageConfigurations {
		return vs[0].(map[string]*MwsStorageConfigurations)[vs[1].(string)]
	}).(MwsStorageConfigurationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsStorageConfigurationsInput)(nil)).Elem(), &MwsStorageConfigurations{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsStorageConfigurationsArrayInput)(nil)).Elem(), MwsStorageConfigurationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsStorageConfigurationsMapInput)(nil)).Elem(), MwsStorageConfigurationsMap{})
	pulumi.RegisterOutputType(MwsStorageConfigurationsOutput{})
	pulumi.RegisterOutputType(MwsStorageConfigurationsArrayOutput{})
	pulumi.RegisterOutputType(MwsStorageConfigurationsMapOutput{})
}
