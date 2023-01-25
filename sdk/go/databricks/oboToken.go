// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type OboToken struct {
	pulumi.CustomResourceState

	// Application ID of ServicePrincipal to create a PAT token for.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// Comment that describes the purpose of the token.
	Comment pulumi.StringPtrOutput `pulumi:"comment"`
	// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrOutput `pulumi:"lifetimeSeconds"`
	// **Sensitive** value of the newly-created token.
	TokenValue pulumi.StringOutput `pulumi:"tokenValue"`
}

// NewOboToken registers a new resource with the given unique name, arguments, and options.
func NewOboToken(ctx *pulumi.Context,
	name string, args *OboTokenArgs, opts ...pulumi.ResourceOption) (*OboToken, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tokenValue",
	})
	opts = append(opts, secrets)
	var resource OboToken
	err := ctx.RegisterResource("databricks:index/oboToken:OboToken", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOboToken gets an existing OboToken resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOboToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OboTokenState, opts ...pulumi.ResourceOption) (*OboToken, error) {
	var resource OboToken
	err := ctx.ReadResource("databricks:index/oboToken:OboToken", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OboToken resources.
type oboTokenState struct {
	// Application ID of ServicePrincipal to create a PAT token for.
	ApplicationId *string `pulumi:"applicationId"`
	// Comment that describes the purpose of the token.
	Comment *string `pulumi:"comment"`
	// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds *int `pulumi:"lifetimeSeconds"`
	// **Sensitive** value of the newly-created token.
	TokenValue *string `pulumi:"tokenValue"`
}

type OboTokenState struct {
	// Application ID of ServicePrincipal to create a PAT token for.
	ApplicationId pulumi.StringPtrInput
	// Comment that describes the purpose of the token.
	Comment pulumi.StringPtrInput
	// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrInput
	// **Sensitive** value of the newly-created token.
	TokenValue pulumi.StringPtrInput
}

func (OboTokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*oboTokenState)(nil)).Elem()
}

type oboTokenArgs struct {
	// Application ID of ServicePrincipal to create a PAT token for.
	ApplicationId string `pulumi:"applicationId"`
	// Comment that describes the purpose of the token.
	Comment *string `pulumi:"comment"`
	// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds *int `pulumi:"lifetimeSeconds"`
}

// The set of arguments for constructing a OboToken resource.
type OboTokenArgs struct {
	// Application ID of ServicePrincipal to create a PAT token for.
	ApplicationId pulumi.StringInput
	// Comment that describes the purpose of the token.
	Comment pulumi.StringPtrInput
	// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrInput
}

func (OboTokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oboTokenArgs)(nil)).Elem()
}

type OboTokenInput interface {
	pulumi.Input

	ToOboTokenOutput() OboTokenOutput
	ToOboTokenOutputWithContext(ctx context.Context) OboTokenOutput
}

func (*OboToken) ElementType() reflect.Type {
	return reflect.TypeOf((**OboToken)(nil)).Elem()
}

func (i *OboToken) ToOboTokenOutput() OboTokenOutput {
	return i.ToOboTokenOutputWithContext(context.Background())
}

func (i *OboToken) ToOboTokenOutputWithContext(ctx context.Context) OboTokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OboTokenOutput)
}

// OboTokenArrayInput is an input type that accepts OboTokenArray and OboTokenArrayOutput values.
// You can construct a concrete instance of `OboTokenArrayInput` via:
//
//	OboTokenArray{ OboTokenArgs{...} }
type OboTokenArrayInput interface {
	pulumi.Input

	ToOboTokenArrayOutput() OboTokenArrayOutput
	ToOboTokenArrayOutputWithContext(context.Context) OboTokenArrayOutput
}

type OboTokenArray []OboTokenInput

func (OboTokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OboToken)(nil)).Elem()
}

func (i OboTokenArray) ToOboTokenArrayOutput() OboTokenArrayOutput {
	return i.ToOboTokenArrayOutputWithContext(context.Background())
}

func (i OboTokenArray) ToOboTokenArrayOutputWithContext(ctx context.Context) OboTokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OboTokenArrayOutput)
}

// OboTokenMapInput is an input type that accepts OboTokenMap and OboTokenMapOutput values.
// You can construct a concrete instance of `OboTokenMapInput` via:
//
//	OboTokenMap{ "key": OboTokenArgs{...} }
type OboTokenMapInput interface {
	pulumi.Input

	ToOboTokenMapOutput() OboTokenMapOutput
	ToOboTokenMapOutputWithContext(context.Context) OboTokenMapOutput
}

type OboTokenMap map[string]OboTokenInput

func (OboTokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OboToken)(nil)).Elem()
}

func (i OboTokenMap) ToOboTokenMapOutput() OboTokenMapOutput {
	return i.ToOboTokenMapOutputWithContext(context.Background())
}

func (i OboTokenMap) ToOboTokenMapOutputWithContext(ctx context.Context) OboTokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OboTokenMapOutput)
}

type OboTokenOutput struct{ *pulumi.OutputState }

func (OboTokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OboToken)(nil)).Elem()
}

func (o OboTokenOutput) ToOboTokenOutput() OboTokenOutput {
	return o
}

func (o OboTokenOutput) ToOboTokenOutputWithContext(ctx context.Context) OboTokenOutput {
	return o
}

// Application ID of ServicePrincipal to create a PAT token for.
func (o OboTokenOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *OboToken) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// Comment that describes the purpose of the token.
func (o OboTokenOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *OboToken) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

// The number of seconds before the token expires. Token resource is re-created when it expires. If no lifetime is specified, the token remains valid indefinitely.
func (o OboTokenOutput) LifetimeSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *OboToken) pulumi.IntPtrOutput { return v.LifetimeSeconds }).(pulumi.IntPtrOutput)
}

// **Sensitive** value of the newly-created token.
func (o OboTokenOutput) TokenValue() pulumi.StringOutput {
	return o.ApplyT(func(v *OboToken) pulumi.StringOutput { return v.TokenValue }).(pulumi.StringOutput)
}

type OboTokenArrayOutput struct{ *pulumi.OutputState }

func (OboTokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OboToken)(nil)).Elem()
}

func (o OboTokenArrayOutput) ToOboTokenArrayOutput() OboTokenArrayOutput {
	return o
}

func (o OboTokenArrayOutput) ToOboTokenArrayOutputWithContext(ctx context.Context) OboTokenArrayOutput {
	return o
}

func (o OboTokenArrayOutput) Index(i pulumi.IntInput) OboTokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OboToken {
		return vs[0].([]*OboToken)[vs[1].(int)]
	}).(OboTokenOutput)
}

type OboTokenMapOutput struct{ *pulumi.OutputState }

func (OboTokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OboToken)(nil)).Elem()
}

func (o OboTokenMapOutput) ToOboTokenMapOutput() OboTokenMapOutput {
	return o
}

func (o OboTokenMapOutput) ToOboTokenMapOutputWithContext(ctx context.Context) OboTokenMapOutput {
	return o
}

func (o OboTokenMapOutput) MapIndex(k pulumi.StringInput) OboTokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OboToken {
		return vs[0].(map[string]*OboToken)[vs[1].(string)]
	}).(OboTokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OboTokenInput)(nil)).Elem(), &OboToken{})
	pulumi.RegisterInputType(reflect.TypeOf((*OboTokenArrayInput)(nil)).Elem(), OboTokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OboTokenMapInput)(nil)).Elem(), OboTokenMap{})
	pulumi.RegisterOutputType(OboTokenOutput{})
	pulumi.RegisterOutputType(OboTokenArrayOutput{})
	pulumi.RegisterOutputType(OboTokenMapOutput{})
}
