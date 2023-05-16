// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// To work with external tables, Unity Catalog introduces two new objects to access and work with external cloud storage:
//
// - `StorageCredential` represents authentication methods to access cloud storage (e.g. an IAM role for Amazon S3 or a service principal/managed identity for Azure Storage). Storage credentials are access-controlled to determine which users can use the credential.
// - ExternalLocation are objects that combine a cloud storage path with a Storage Credential that can be used to access the location.
//
// ## Example Usage
//
// # For AWS
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
//			external, err := databricks.NewStorageCredential(ctx, "external", &databricks.StorageCredentialArgs{
//				AwsIamRole: &databricks.StorageCredentialAwsIamRoleArgs{
//					RoleArn: pulumi.Any(aws_iam_role.External_data_access.Arn),
//				},
//				Comment: pulumi.String("Managed by TF"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: external.ID(),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_TABLE"),
//						},
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
//
// # For Azure
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
//			_, err := databricks.NewStorageCredential(ctx, "externalMi", &databricks.StorageCredentialArgs{
//				AzureManagedIdentity: &databricks.StorageCredentialAzureManagedIdentityArgs{
//					AccessConnectorId: pulumi.Any(azurerm_databricks_access_connector.Example.Id),
//				},
//				Comment: pulumi.String("Managed identity credential managed by TF"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: pulumi.Any(databricks_storage_credential.External.Id),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_TABLE"),
//						},
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
//
// # For GCP
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
//			external, err := databricks.NewStorageCredential(ctx, "external", &databricks.StorageCredentialArgs{
//				DatabricksGcpServiceAccount: nil,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewGrants(ctx, "externalCreds", &databricks.GrantsArgs{
//				StorageCredential: external.ID(),
//				Grants: databricks.GrantsGrantArray{
//					&databricks.GrantsGrantArgs{
//						Principal: pulumi.String("Data Engineers"),
//						Privileges: pulumi.StringArray{
//							pulumi.String("CREATE_TABLE"),
//						},
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
//
// ## Import
//
// # This resource can be imported by namebash
//
// ```sh
//
//	$ pulumi import databricks:index/storageCredential:StorageCredential this <name>
//
// ```
type StorageCredential struct {
	pulumi.CustomResourceState

	AwsIamRole                  StorageCredentialAwsIamRolePtrOutput               `pulumi:"awsIamRole"`
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrOutput     `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrOutput    `pulumi:"azureServicePrincipal"`
	Comment                     pulumi.StringPtrOutput                             `pulumi:"comment"`
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountOutput `pulumi:"databricksGcpServiceAccount"`
	GcpServiceAccountKey        StorageCredentialGcpServiceAccountKeyPtrOutput     `pulumi:"gcpServiceAccountKey"`
	MetastoreId                 pulumi.StringOutput                                `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	Owner pulumi.StringOutput `pulumi:"owner"`
}

// NewStorageCredential registers a new resource with the given unique name, arguments, and options.
func NewStorageCredential(ctx *pulumi.Context,
	name string, args *StorageCredentialArgs, opts ...pulumi.ResourceOption) (*StorageCredential, error) {
	if args == nil {
		args = &StorageCredentialArgs{}
	}

	var resource StorageCredential
	err := ctx.RegisterResource("databricks:index/storageCredential:StorageCredential", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStorageCredential gets an existing StorageCredential resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStorageCredential(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StorageCredentialState, opts ...pulumi.ResourceOption) (*StorageCredential, error) {
	var resource StorageCredential
	err := ctx.ReadResource("databricks:index/storageCredential:StorageCredential", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StorageCredential resources.
type storageCredentialState struct {
	AwsIamRole                  *StorageCredentialAwsIamRole                  `pulumi:"awsIamRole"`
	AzureManagedIdentity        *StorageCredentialAzureManagedIdentity        `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       *StorageCredentialAzureServicePrincipal       `pulumi:"azureServicePrincipal"`
	Comment                     *string                                       `pulumi:"comment"`
	DatabricksGcpServiceAccount *StorageCredentialDatabricksGcpServiceAccount `pulumi:"databricksGcpServiceAccount"`
	GcpServiceAccountKey        *StorageCredentialGcpServiceAccountKey        `pulumi:"gcpServiceAccountKey"`
	MetastoreId                 *string                                       `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	Owner *string `pulumi:"owner"`
}

type StorageCredentialState struct {
	AwsIamRole                  StorageCredentialAwsIamRolePtrInput
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrInput
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrInput
	Comment                     pulumi.StringPtrInput
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountPtrInput
	GcpServiceAccountKey        StorageCredentialGcpServiceAccountKeyPtrInput
	MetastoreId                 pulumi.StringPtrInput
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the storage credential owner.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	Owner pulumi.StringPtrInput
}

func (StorageCredentialState) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCredentialState)(nil)).Elem()
}

type storageCredentialArgs struct {
	AwsIamRole                  *StorageCredentialAwsIamRole                  `pulumi:"awsIamRole"`
	AzureManagedIdentity        *StorageCredentialAzureManagedIdentity        `pulumi:"azureManagedIdentity"`
	AzureServicePrincipal       *StorageCredentialAzureServicePrincipal       `pulumi:"azureServicePrincipal"`
	Comment                     *string                                       `pulumi:"comment"`
	DatabricksGcpServiceAccount *StorageCredentialDatabricksGcpServiceAccount `pulumi:"databricksGcpServiceAccount"`
	GcpServiceAccountKey        *StorageCredentialGcpServiceAccountKey        `pulumi:"gcpServiceAccountKey"`
	MetastoreId                 *string                                       `pulumi:"metastoreId"`
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name *string `pulumi:"name"`
	// Username/groupname/sp applicationId of the storage credential owner.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	Owner *string `pulumi:"owner"`
}

// The set of arguments for constructing a StorageCredential resource.
type StorageCredentialArgs struct {
	AwsIamRole                  StorageCredentialAwsIamRolePtrInput
	AzureManagedIdentity        StorageCredentialAzureManagedIdentityPtrInput
	AzureServicePrincipal       StorageCredentialAzureServicePrincipalPtrInput
	Comment                     pulumi.StringPtrInput
	DatabricksGcpServiceAccount StorageCredentialDatabricksGcpServiceAccountPtrInput
	GcpServiceAccountKey        StorageCredentialGcpServiceAccountKeyPtrInput
	MetastoreId                 pulumi.StringPtrInput
	// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
	Name pulumi.StringPtrInput
	// Username/groupname/sp applicationId of the storage credential owner.
	//
	// `awsIamRole` optional configuration block for credential details for AWS:
	Owner pulumi.StringPtrInput
}

func (StorageCredentialArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*storageCredentialArgs)(nil)).Elem()
}

type StorageCredentialInput interface {
	pulumi.Input

	ToStorageCredentialOutput() StorageCredentialOutput
	ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput
}

func (*StorageCredential) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCredential)(nil)).Elem()
}

func (i *StorageCredential) ToStorageCredentialOutput() StorageCredentialOutput {
	return i.ToStorageCredentialOutputWithContext(context.Background())
}

func (i *StorageCredential) ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialOutput)
}

// StorageCredentialArrayInput is an input type that accepts StorageCredentialArray and StorageCredentialArrayOutput values.
// You can construct a concrete instance of `StorageCredentialArrayInput` via:
//
//	StorageCredentialArray{ StorageCredentialArgs{...} }
type StorageCredentialArrayInput interface {
	pulumi.Input

	ToStorageCredentialArrayOutput() StorageCredentialArrayOutput
	ToStorageCredentialArrayOutputWithContext(context.Context) StorageCredentialArrayOutput
}

type StorageCredentialArray []StorageCredentialInput

func (StorageCredentialArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCredential)(nil)).Elem()
}

func (i StorageCredentialArray) ToStorageCredentialArrayOutput() StorageCredentialArrayOutput {
	return i.ToStorageCredentialArrayOutputWithContext(context.Background())
}

func (i StorageCredentialArray) ToStorageCredentialArrayOutputWithContext(ctx context.Context) StorageCredentialArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialArrayOutput)
}

// StorageCredentialMapInput is an input type that accepts StorageCredentialMap and StorageCredentialMapOutput values.
// You can construct a concrete instance of `StorageCredentialMapInput` via:
//
//	StorageCredentialMap{ "key": StorageCredentialArgs{...} }
type StorageCredentialMapInput interface {
	pulumi.Input

	ToStorageCredentialMapOutput() StorageCredentialMapOutput
	ToStorageCredentialMapOutputWithContext(context.Context) StorageCredentialMapOutput
}

type StorageCredentialMap map[string]StorageCredentialInput

func (StorageCredentialMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCredential)(nil)).Elem()
}

func (i StorageCredentialMap) ToStorageCredentialMapOutput() StorageCredentialMapOutput {
	return i.ToStorageCredentialMapOutputWithContext(context.Background())
}

func (i StorageCredentialMap) ToStorageCredentialMapOutputWithContext(ctx context.Context) StorageCredentialMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StorageCredentialMapOutput)
}

type StorageCredentialOutput struct{ *pulumi.OutputState }

func (StorageCredentialOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StorageCredential)(nil)).Elem()
}

func (o StorageCredentialOutput) ToStorageCredentialOutput() StorageCredentialOutput {
	return o
}

func (o StorageCredentialOutput) ToStorageCredentialOutputWithContext(ctx context.Context) StorageCredentialOutput {
	return o
}

func (o StorageCredentialOutput) AwsIamRole() StorageCredentialAwsIamRolePtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAwsIamRolePtrOutput { return v.AwsIamRole }).(StorageCredentialAwsIamRolePtrOutput)
}

func (o StorageCredentialOutput) AzureManagedIdentity() StorageCredentialAzureManagedIdentityPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAzureManagedIdentityPtrOutput {
		return v.AzureManagedIdentity
	}).(StorageCredentialAzureManagedIdentityPtrOutput)
}

func (o StorageCredentialOutput) AzureServicePrincipal() StorageCredentialAzureServicePrincipalPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialAzureServicePrincipalPtrOutput {
		return v.AzureServicePrincipal
	}).(StorageCredentialAzureServicePrincipalPtrOutput)
}

func (o StorageCredentialOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o StorageCredentialOutput) DatabricksGcpServiceAccount() StorageCredentialDatabricksGcpServiceAccountOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialDatabricksGcpServiceAccountOutput {
		return v.DatabricksGcpServiceAccount
	}).(StorageCredentialDatabricksGcpServiceAccountOutput)
}

func (o StorageCredentialOutput) GcpServiceAccountKey() StorageCredentialGcpServiceAccountKeyPtrOutput {
	return o.ApplyT(func(v *StorageCredential) StorageCredentialGcpServiceAccountKeyPtrOutput {
		return v.GcpServiceAccountKey
	}).(StorageCredentialGcpServiceAccountKeyPtrOutput)
}

func (o StorageCredentialOutput) MetastoreId() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.MetastoreId }).(pulumi.StringOutput)
}

// Name of Storage Credentials, which must be unique within the databricks_metastore. Change forces creation of a new resource.
func (o StorageCredentialOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Username/groupname/sp applicationId of the storage credential owner.
//
// `awsIamRole` optional configuration block for credential details for AWS:
func (o StorageCredentialOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v *StorageCredential) pulumi.StringOutput { return v.Owner }).(pulumi.StringOutput)
}

type StorageCredentialArrayOutput struct{ *pulumi.OutputState }

func (StorageCredentialArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StorageCredential)(nil)).Elem()
}

func (o StorageCredentialArrayOutput) ToStorageCredentialArrayOutput() StorageCredentialArrayOutput {
	return o
}

func (o StorageCredentialArrayOutput) ToStorageCredentialArrayOutputWithContext(ctx context.Context) StorageCredentialArrayOutput {
	return o
}

func (o StorageCredentialArrayOutput) Index(i pulumi.IntInput) StorageCredentialOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StorageCredential {
		return vs[0].([]*StorageCredential)[vs[1].(int)]
	}).(StorageCredentialOutput)
}

type StorageCredentialMapOutput struct{ *pulumi.OutputState }

func (StorageCredentialMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StorageCredential)(nil)).Elem()
}

func (o StorageCredentialMapOutput) ToStorageCredentialMapOutput() StorageCredentialMapOutput {
	return o
}

func (o StorageCredentialMapOutput) ToStorageCredentialMapOutputWithContext(ctx context.Context) StorageCredentialMapOutput {
	return o
}

func (o StorageCredentialMapOutput) MapIndex(k pulumi.StringInput) StorageCredentialOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StorageCredential {
		return vs[0].(map[string]*StorageCredential)[vs[1].(string)]
	}).(StorageCredentialOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialInput)(nil)).Elem(), &StorageCredential{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialArrayInput)(nil)).Elem(), StorageCredentialArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StorageCredentialMapInput)(nil)).Elem(), StorageCredentialMap{})
	pulumi.RegisterOutputType(StorageCredentialOutput{})
	pulumi.RegisterOutputType(StorageCredentialArrayOutput{})
	pulumi.RegisterOutputType(StorageCredentialMapOutput{})
}
