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

// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type MwsWorkspaces struct {
	pulumi.CustomResourceState

	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// region of VPC.
	AwsRegion pulumi.StringPtrOutput `pulumi:"awsRegion"`
	Cloud     pulumi.StringOutput    `pulumi:"cloud"`
	// A block that specifies GCP workspace configurations, consisting of following blocks:
	CloudResourceContainer MwsWorkspacesCloudResourceContainerPtrOutput `pulumi:"cloudResourceContainer"`
	// (Integer) time when workspace was created
	CreationTime  pulumi.IntOutput       `pulumi:"creationTime"`
	CredentialsId pulumi.StringPtrOutput `pulumi:"credentialsId"`
	// Deprecated: Use managed_services_customer_managed_key_id instead
	CustomerManagedKeyId pulumi.StringPtrOutput `pulumi:"customerManagedKeyId"`
	// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
	DeploymentName          pulumi.StringPtrOutput                        `pulumi:"deploymentName"`
	ExternalCustomerInfo    MwsWorkspacesExternalCustomerInfoPtrOutput    `pulumi:"externalCustomerInfo"`
	GcpManagedNetworkConfig MwsWorkspacesGcpManagedNetworkConfigPtrOutput `pulumi:"gcpManagedNetworkConfig"`
	// A block that specifies GKE configuration for the Databricks workspace:
	GkeConfig           MwsWorkspacesGkeConfigPtrOutput `pulumi:"gkeConfig"`
	IsNoPublicIpEnabled pulumi.BoolPtrOutput            `pulumi:"isNoPublicIpEnabled"`
	// region of the subnet.
	Location pulumi.StringPtrOutput `pulumi:"location"`
	// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
	ManagedServicesCustomerManagedKeyId pulumi.StringPtrOutput `pulumi:"managedServicesCustomerManagedKeyId"`
	// `networkId` from networks.
	NetworkId   pulumi.StringPtrOutput `pulumi:"networkId"`
	PricingTier pulumi.StringOutput    `pulumi:"pricingTier"`
	// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
	PrivateAccessSettingsId pulumi.StringPtrOutput `pulumi:"privateAccessSettingsId"`
	// `storageConfigurationId` from storage configuration.
	StorageConfigurationId      pulumi.StringPtrOutput      `pulumi:"storageConfigurationId"`
	StorageCustomerManagedKeyId pulumi.StringPtrOutput      `pulumi:"storageCustomerManagedKeyId"`
	Token                       MwsWorkspacesTokenPtrOutput `pulumi:"token"`
	// (String) workspace id
	WorkspaceId pulumi.IntOutput `pulumi:"workspaceId"`
	// name of the workspace, will appear on UI.
	WorkspaceName pulumi.StringOutput `pulumi:"workspaceName"`
	// (String) workspace status
	WorkspaceStatus pulumi.StringOutput `pulumi:"workspaceStatus"`
	// (String) updates on workspace status
	WorkspaceStatusMessage pulumi.StringOutput `pulumi:"workspaceStatusMessage"`
	// (String) URL of the workspace
	WorkspaceUrl pulumi.StringOutput `pulumi:"workspaceUrl"`
}

// NewMwsWorkspaces registers a new resource with the given unique name, arguments, and options.
func NewMwsWorkspaces(ctx *pulumi.Context,
	name string, args *MwsWorkspacesArgs, opts ...pulumi.ResourceOption) (*MwsWorkspaces, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.WorkspaceName == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceName'")
	}
	if args.AccountId != nil {
		args.AccountId = pulumi.ToSecret(args.AccountId).(pulumi.StringInput)
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"accountId",
	})
	opts = append(opts, secrets)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource MwsWorkspaces
	err := ctx.RegisterResource("databricks:index/mwsWorkspaces:MwsWorkspaces", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMwsWorkspaces gets an existing MwsWorkspaces resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMwsWorkspaces(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MwsWorkspacesState, opts ...pulumi.ResourceOption) (*MwsWorkspaces, error) {
	var resource MwsWorkspaces
	err := ctx.ReadResource("databricks:index/mwsWorkspaces:MwsWorkspaces", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MwsWorkspaces resources.
type mwsWorkspacesState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
	AccountId *string `pulumi:"accountId"`
	// region of VPC.
	AwsRegion *string `pulumi:"awsRegion"`
	Cloud     *string `pulumi:"cloud"`
	// A block that specifies GCP workspace configurations, consisting of following blocks:
	CloudResourceContainer *MwsWorkspacesCloudResourceContainer `pulumi:"cloudResourceContainer"`
	// (Integer) time when workspace was created
	CreationTime  *int    `pulumi:"creationTime"`
	CredentialsId *string `pulumi:"credentialsId"`
	// Deprecated: Use managed_services_customer_managed_key_id instead
	CustomerManagedKeyId *string `pulumi:"customerManagedKeyId"`
	// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
	DeploymentName          *string                               `pulumi:"deploymentName"`
	ExternalCustomerInfo    *MwsWorkspacesExternalCustomerInfo    `pulumi:"externalCustomerInfo"`
	GcpManagedNetworkConfig *MwsWorkspacesGcpManagedNetworkConfig `pulumi:"gcpManagedNetworkConfig"`
	// A block that specifies GKE configuration for the Databricks workspace:
	GkeConfig           *MwsWorkspacesGkeConfig `pulumi:"gkeConfig"`
	IsNoPublicIpEnabled *bool                   `pulumi:"isNoPublicIpEnabled"`
	// region of the subnet.
	Location *string `pulumi:"location"`
	// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
	ManagedServicesCustomerManagedKeyId *string `pulumi:"managedServicesCustomerManagedKeyId"`
	// `networkId` from networks.
	NetworkId   *string `pulumi:"networkId"`
	PricingTier *string `pulumi:"pricingTier"`
	// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
	PrivateAccessSettingsId *string `pulumi:"privateAccessSettingsId"`
	// `storageConfigurationId` from storage configuration.
	StorageConfigurationId      *string             `pulumi:"storageConfigurationId"`
	StorageCustomerManagedKeyId *string             `pulumi:"storageCustomerManagedKeyId"`
	Token                       *MwsWorkspacesToken `pulumi:"token"`
	// (String) workspace id
	WorkspaceId *int `pulumi:"workspaceId"`
	// name of the workspace, will appear on UI.
	WorkspaceName *string `pulumi:"workspaceName"`
	// (String) workspace status
	WorkspaceStatus *string `pulumi:"workspaceStatus"`
	// (String) updates on workspace status
	WorkspaceStatusMessage *string `pulumi:"workspaceStatusMessage"`
	// (String) URL of the workspace
	WorkspaceUrl *string `pulumi:"workspaceUrl"`
}

type MwsWorkspacesState struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
	AccountId pulumi.StringPtrInput
	// region of VPC.
	AwsRegion pulumi.StringPtrInput
	Cloud     pulumi.StringPtrInput
	// A block that specifies GCP workspace configurations, consisting of following blocks:
	CloudResourceContainer MwsWorkspacesCloudResourceContainerPtrInput
	// (Integer) time when workspace was created
	CreationTime  pulumi.IntPtrInput
	CredentialsId pulumi.StringPtrInput
	// Deprecated: Use managed_services_customer_managed_key_id instead
	CustomerManagedKeyId pulumi.StringPtrInput
	// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
	DeploymentName          pulumi.StringPtrInput
	ExternalCustomerInfo    MwsWorkspacesExternalCustomerInfoPtrInput
	GcpManagedNetworkConfig MwsWorkspacesGcpManagedNetworkConfigPtrInput
	// A block that specifies GKE configuration for the Databricks workspace:
	GkeConfig           MwsWorkspacesGkeConfigPtrInput
	IsNoPublicIpEnabled pulumi.BoolPtrInput
	// region of the subnet.
	Location pulumi.StringPtrInput
	// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
	ManagedServicesCustomerManagedKeyId pulumi.StringPtrInput
	// `networkId` from networks.
	NetworkId   pulumi.StringPtrInput
	PricingTier pulumi.StringPtrInput
	// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
	PrivateAccessSettingsId pulumi.StringPtrInput
	// `storageConfigurationId` from storage configuration.
	StorageConfigurationId      pulumi.StringPtrInput
	StorageCustomerManagedKeyId pulumi.StringPtrInput
	Token                       MwsWorkspacesTokenPtrInput
	// (String) workspace id
	WorkspaceId pulumi.IntPtrInput
	// name of the workspace, will appear on UI.
	WorkspaceName pulumi.StringPtrInput
	// (String) workspace status
	WorkspaceStatus pulumi.StringPtrInput
	// (String) updates on workspace status
	WorkspaceStatusMessage pulumi.StringPtrInput
	// (String) URL of the workspace
	WorkspaceUrl pulumi.StringPtrInput
}

func (MwsWorkspacesState) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsWorkspacesState)(nil)).Elem()
}

type mwsWorkspacesArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
	AccountId string `pulumi:"accountId"`
	// region of VPC.
	AwsRegion *string `pulumi:"awsRegion"`
	Cloud     *string `pulumi:"cloud"`
	// A block that specifies GCP workspace configurations, consisting of following blocks:
	CloudResourceContainer *MwsWorkspacesCloudResourceContainer `pulumi:"cloudResourceContainer"`
	// (Integer) time when workspace was created
	CreationTime  *int    `pulumi:"creationTime"`
	CredentialsId *string `pulumi:"credentialsId"`
	// Deprecated: Use managed_services_customer_managed_key_id instead
	CustomerManagedKeyId *string `pulumi:"customerManagedKeyId"`
	// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
	DeploymentName          *string                               `pulumi:"deploymentName"`
	ExternalCustomerInfo    *MwsWorkspacesExternalCustomerInfo    `pulumi:"externalCustomerInfo"`
	GcpManagedNetworkConfig *MwsWorkspacesGcpManagedNetworkConfig `pulumi:"gcpManagedNetworkConfig"`
	// A block that specifies GKE configuration for the Databricks workspace:
	GkeConfig           *MwsWorkspacesGkeConfig `pulumi:"gkeConfig"`
	IsNoPublicIpEnabled *bool                   `pulumi:"isNoPublicIpEnabled"`
	// region of the subnet.
	Location *string `pulumi:"location"`
	// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
	ManagedServicesCustomerManagedKeyId *string `pulumi:"managedServicesCustomerManagedKeyId"`
	// `networkId` from networks.
	NetworkId   *string `pulumi:"networkId"`
	PricingTier *string `pulumi:"pricingTier"`
	// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
	PrivateAccessSettingsId *string `pulumi:"privateAccessSettingsId"`
	// `storageConfigurationId` from storage configuration.
	StorageConfigurationId      *string             `pulumi:"storageConfigurationId"`
	StorageCustomerManagedKeyId *string             `pulumi:"storageCustomerManagedKeyId"`
	Token                       *MwsWorkspacesToken `pulumi:"token"`
	// (String) workspace id
	WorkspaceId *int `pulumi:"workspaceId"`
	// name of the workspace, will appear on UI.
	WorkspaceName string `pulumi:"workspaceName"`
	// (String) workspace status
	WorkspaceStatus *string `pulumi:"workspaceStatus"`
	// (String) updates on workspace status
	WorkspaceStatusMessage *string `pulumi:"workspaceStatusMessage"`
	// (String) URL of the workspace
	WorkspaceUrl *string `pulumi:"workspaceUrl"`
}

// The set of arguments for constructing a MwsWorkspaces resource.
type MwsWorkspacesArgs struct {
	// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
	AccountId pulumi.StringInput
	// region of VPC.
	AwsRegion pulumi.StringPtrInput
	Cloud     pulumi.StringPtrInput
	// A block that specifies GCP workspace configurations, consisting of following blocks:
	CloudResourceContainer MwsWorkspacesCloudResourceContainerPtrInput
	// (Integer) time when workspace was created
	CreationTime  pulumi.IntPtrInput
	CredentialsId pulumi.StringPtrInput
	// Deprecated: Use managed_services_customer_managed_key_id instead
	CustomerManagedKeyId pulumi.StringPtrInput
	// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
	DeploymentName          pulumi.StringPtrInput
	ExternalCustomerInfo    MwsWorkspacesExternalCustomerInfoPtrInput
	GcpManagedNetworkConfig MwsWorkspacesGcpManagedNetworkConfigPtrInput
	// A block that specifies GKE configuration for the Databricks workspace:
	GkeConfig           MwsWorkspacesGkeConfigPtrInput
	IsNoPublicIpEnabled pulumi.BoolPtrInput
	// region of the subnet.
	Location pulumi.StringPtrInput
	// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
	ManagedServicesCustomerManagedKeyId pulumi.StringPtrInput
	// `networkId` from networks.
	NetworkId   pulumi.StringPtrInput
	PricingTier pulumi.StringPtrInput
	// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
	PrivateAccessSettingsId pulumi.StringPtrInput
	// `storageConfigurationId` from storage configuration.
	StorageConfigurationId      pulumi.StringPtrInput
	StorageCustomerManagedKeyId pulumi.StringPtrInput
	Token                       MwsWorkspacesTokenPtrInput
	// (String) workspace id
	WorkspaceId pulumi.IntPtrInput
	// name of the workspace, will appear on UI.
	WorkspaceName pulumi.StringInput
	// (String) workspace status
	WorkspaceStatus pulumi.StringPtrInput
	// (String) updates on workspace status
	WorkspaceStatusMessage pulumi.StringPtrInput
	// (String) URL of the workspace
	WorkspaceUrl pulumi.StringPtrInput
}

func (MwsWorkspacesArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*mwsWorkspacesArgs)(nil)).Elem()
}

type MwsWorkspacesInput interface {
	pulumi.Input

	ToMwsWorkspacesOutput() MwsWorkspacesOutput
	ToMwsWorkspacesOutputWithContext(ctx context.Context) MwsWorkspacesOutput
}

func (*MwsWorkspaces) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsWorkspaces)(nil)).Elem()
}

func (i *MwsWorkspaces) ToMwsWorkspacesOutput() MwsWorkspacesOutput {
	return i.ToMwsWorkspacesOutputWithContext(context.Background())
}

func (i *MwsWorkspaces) ToMwsWorkspacesOutputWithContext(ctx context.Context) MwsWorkspacesOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsWorkspacesOutput)
}

// MwsWorkspacesArrayInput is an input type that accepts MwsWorkspacesArray and MwsWorkspacesArrayOutput values.
// You can construct a concrete instance of `MwsWorkspacesArrayInput` via:
//
//	MwsWorkspacesArray{ MwsWorkspacesArgs{...} }
type MwsWorkspacesArrayInput interface {
	pulumi.Input

	ToMwsWorkspacesArrayOutput() MwsWorkspacesArrayOutput
	ToMwsWorkspacesArrayOutputWithContext(context.Context) MwsWorkspacesArrayOutput
}

type MwsWorkspacesArray []MwsWorkspacesInput

func (MwsWorkspacesArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsWorkspaces)(nil)).Elem()
}

func (i MwsWorkspacesArray) ToMwsWorkspacesArrayOutput() MwsWorkspacesArrayOutput {
	return i.ToMwsWorkspacesArrayOutputWithContext(context.Background())
}

func (i MwsWorkspacesArray) ToMwsWorkspacesArrayOutputWithContext(ctx context.Context) MwsWorkspacesArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsWorkspacesArrayOutput)
}

// MwsWorkspacesMapInput is an input type that accepts MwsWorkspacesMap and MwsWorkspacesMapOutput values.
// You can construct a concrete instance of `MwsWorkspacesMapInput` via:
//
//	MwsWorkspacesMap{ "key": MwsWorkspacesArgs{...} }
type MwsWorkspacesMapInput interface {
	pulumi.Input

	ToMwsWorkspacesMapOutput() MwsWorkspacesMapOutput
	ToMwsWorkspacesMapOutputWithContext(context.Context) MwsWorkspacesMapOutput
}

type MwsWorkspacesMap map[string]MwsWorkspacesInput

func (MwsWorkspacesMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsWorkspaces)(nil)).Elem()
}

func (i MwsWorkspacesMap) ToMwsWorkspacesMapOutput() MwsWorkspacesMapOutput {
	return i.ToMwsWorkspacesMapOutputWithContext(context.Background())
}

func (i MwsWorkspacesMap) ToMwsWorkspacesMapOutputWithContext(ctx context.Context) MwsWorkspacesMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MwsWorkspacesMapOutput)
}

type MwsWorkspacesOutput struct{ *pulumi.OutputState }

func (MwsWorkspacesOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MwsWorkspaces)(nil)).Elem()
}

func (o MwsWorkspacesOutput) ToMwsWorkspacesOutput() MwsWorkspacesOutput {
	return o
}

func (o MwsWorkspacesOutput) ToMwsWorkspacesOutputWithContext(ctx context.Context) MwsWorkspacesOutput {
	return o
}

// Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/).
func (o MwsWorkspacesOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// region of VPC.
func (o MwsWorkspacesOutput) AwsRegion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.AwsRegion }).(pulumi.StringPtrOutput)
}

func (o MwsWorkspacesOutput) Cloud() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.Cloud }).(pulumi.StringOutput)
}

// A block that specifies GCP workspace configurations, consisting of following blocks:
func (o MwsWorkspacesOutput) CloudResourceContainer() MwsWorkspacesCloudResourceContainerPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) MwsWorkspacesCloudResourceContainerPtrOutput { return v.CloudResourceContainer }).(MwsWorkspacesCloudResourceContainerPtrOutput)
}

// (Integer) time when workspace was created
func (o MwsWorkspacesOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

func (o MwsWorkspacesOutput) CredentialsId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.CredentialsId }).(pulumi.StringPtrOutput)
}

// Deprecated: Use managed_services_customer_managed_key_id instead
func (o MwsWorkspacesOutput) CustomerManagedKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.CustomerManagedKeyId }).(pulumi.StringPtrOutput)
}

// part of URL as in `https://<prefix>-<deployment-name>.cloud.databricks.com`. Deployment name cannot be used until a deployment name prefix is defined. Please contact your Databricks representative. Once a new deployment prefix is added/updated, it only will affect the new workspaces created.
func (o MwsWorkspacesOutput) DeploymentName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.DeploymentName }).(pulumi.StringPtrOutput)
}

func (o MwsWorkspacesOutput) ExternalCustomerInfo() MwsWorkspacesExternalCustomerInfoPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) MwsWorkspacesExternalCustomerInfoPtrOutput { return v.ExternalCustomerInfo }).(MwsWorkspacesExternalCustomerInfoPtrOutput)
}

func (o MwsWorkspacesOutput) GcpManagedNetworkConfig() MwsWorkspacesGcpManagedNetworkConfigPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) MwsWorkspacesGcpManagedNetworkConfigPtrOutput { return v.GcpManagedNetworkConfig }).(MwsWorkspacesGcpManagedNetworkConfigPtrOutput)
}

// A block that specifies GKE configuration for the Databricks workspace:
func (o MwsWorkspacesOutput) GkeConfig() MwsWorkspacesGkeConfigPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) MwsWorkspacesGkeConfigPtrOutput { return v.GkeConfig }).(MwsWorkspacesGkeConfigPtrOutput)
}

func (o MwsWorkspacesOutput) IsNoPublicIpEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.BoolPtrOutput { return v.IsNoPublicIpEnabled }).(pulumi.BoolPtrOutput)
}

// region of the subnet.
func (o MwsWorkspacesOutput) Location() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.Location }).(pulumi.StringPtrOutput)
}

// `customerManagedKeyId` from customer managed keys with `useCases` set to `MANAGED_SERVICES`. This is used to encrypt the workspace's notebook and secret data in the control plane.
func (o MwsWorkspacesOutput) ManagedServicesCustomerManagedKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.ManagedServicesCustomerManagedKeyId }).(pulumi.StringPtrOutput)
}

// `networkId` from networks.
func (o MwsWorkspacesOutput) NetworkId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.NetworkId }).(pulumi.StringPtrOutput)
}

func (o MwsWorkspacesOutput) PricingTier() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.PricingTier }).(pulumi.StringOutput)
}

// Canonical unique identifier of MwsPrivateAccessSettings in Databricks Account.
func (o MwsWorkspacesOutput) PrivateAccessSettingsId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.PrivateAccessSettingsId }).(pulumi.StringPtrOutput)
}

// `storageConfigurationId` from storage configuration.
func (o MwsWorkspacesOutput) StorageConfigurationId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.StorageConfigurationId }).(pulumi.StringPtrOutput)
}

func (o MwsWorkspacesOutput) StorageCustomerManagedKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringPtrOutput { return v.StorageCustomerManagedKeyId }).(pulumi.StringPtrOutput)
}

func (o MwsWorkspacesOutput) Token() MwsWorkspacesTokenPtrOutput {
	return o.ApplyT(func(v *MwsWorkspaces) MwsWorkspacesTokenPtrOutput { return v.Token }).(MwsWorkspacesTokenPtrOutput)
}

// (String) workspace id
func (o MwsWorkspacesOutput) WorkspaceId() pulumi.IntOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.IntOutput { return v.WorkspaceId }).(pulumi.IntOutput)
}

// name of the workspace, will appear on UI.
func (o MwsWorkspacesOutput) WorkspaceName() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.WorkspaceName }).(pulumi.StringOutput)
}

// (String) workspace status
func (o MwsWorkspacesOutput) WorkspaceStatus() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.WorkspaceStatus }).(pulumi.StringOutput)
}

// (String) updates on workspace status
func (o MwsWorkspacesOutput) WorkspaceStatusMessage() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.WorkspaceStatusMessage }).(pulumi.StringOutput)
}

// (String) URL of the workspace
func (o MwsWorkspacesOutput) WorkspaceUrl() pulumi.StringOutput {
	return o.ApplyT(func(v *MwsWorkspaces) pulumi.StringOutput { return v.WorkspaceUrl }).(pulumi.StringOutput)
}

type MwsWorkspacesArrayOutput struct{ *pulumi.OutputState }

func (MwsWorkspacesArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MwsWorkspaces)(nil)).Elem()
}

func (o MwsWorkspacesArrayOutput) ToMwsWorkspacesArrayOutput() MwsWorkspacesArrayOutput {
	return o
}

func (o MwsWorkspacesArrayOutput) ToMwsWorkspacesArrayOutputWithContext(ctx context.Context) MwsWorkspacesArrayOutput {
	return o
}

func (o MwsWorkspacesArrayOutput) Index(i pulumi.IntInput) MwsWorkspacesOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MwsWorkspaces {
		return vs[0].([]*MwsWorkspaces)[vs[1].(int)]
	}).(MwsWorkspacesOutput)
}

type MwsWorkspacesMapOutput struct{ *pulumi.OutputState }

func (MwsWorkspacesMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MwsWorkspaces)(nil)).Elem()
}

func (o MwsWorkspacesMapOutput) ToMwsWorkspacesMapOutput() MwsWorkspacesMapOutput {
	return o
}

func (o MwsWorkspacesMapOutput) ToMwsWorkspacesMapOutputWithContext(ctx context.Context) MwsWorkspacesMapOutput {
	return o
}

func (o MwsWorkspacesMapOutput) MapIndex(k pulumi.StringInput) MwsWorkspacesOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MwsWorkspaces {
		return vs[0].(map[string]*MwsWorkspaces)[vs[1].(string)]
	}).(MwsWorkspacesOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MwsWorkspacesInput)(nil)).Elem(), &MwsWorkspaces{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsWorkspacesArrayInput)(nil)).Elem(), MwsWorkspacesArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MwsWorkspacesMapInput)(nil)).Elem(), MwsWorkspacesMap{})
	pulumi.RegisterOutputType(MwsWorkspacesOutput{})
	pulumi.RegisterOutputType(MwsWorkspacesArrayOutput{})
	pulumi.RegisterOutputType(MwsWorkspacesMapOutput{})
}
