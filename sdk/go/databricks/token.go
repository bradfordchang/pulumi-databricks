// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// This resource creates [Personal Access Tokens](https://docs.databricks.com/sql/user/security/personal-access-tokens.html) for the same user that is authenticated with the provider. Most likely you should use OboToken to create [On-Behalf-Of tokens](https://docs.databricks.com/administration-guide/users-groups/service-principals.html#manage-personal-access-tokens-for-a-service-principal) for a ServicePrincipal in Databricks workspaces on AWS. Databricks workspaces on other clouds use their own native OAuth token flows.
//
// ## Example Usage
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
//			_, err := databricks.NewProvider(ctx, "createdWorkspace", &databricks.ProviderArgs{
//				Host: pulumi.Any(databricks_mws_workspaces.This.Workspace_url),
//			})
//			if err != nil {
//				return err
//			}
//			pat, err := databricks.NewToken(ctx, "pat", &databricks.TokenArgs{
//				Comment:         pulumi.String("Terraform Provisioning"),
//				LifetimeSeconds: pulumi.Int(8640000),
//			}, pulumi.Provider(databricks.Created_workspace))
//			if err != nil {
//				return err
//			}
//			ctx.Export("databricksToken", pat.TokenValue)
//			return nil
//		})
//	}
//
// ```
//
// A token can be automatically rotated by taking a dependency on the `timeRotating` resource:
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi-time/sdk/go/time"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			this, err := time.NewRotating(ctx, "this", &time.RotatingArgs{
//				RotationDays: pulumi.Int(30),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewToken(ctx, "pat", &databricks.TokenArgs{
//				Comment: this.Rfc3339.ApplyT(func(rfc3339 string) (string, error) {
//					return fmt.Sprintf("Terraform (created: %v)", rfc3339), nil
//				}).(pulumi.StringOutput),
//				LifetimeSeconds: 60 * 24 * 60 * 60,
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
// -> **Note** Importing this resource is not currently supported.
type Token struct {
	pulumi.CustomResourceState

	// (String) Comment that will appear on the user’s settings page for this token.
	Comment      pulumi.StringPtrOutput `pulumi:"comment"`
	CreationTime pulumi.IntOutput       `pulumi:"creationTime"`
	ExpiryTime   pulumi.IntOutput       `pulumi:"expiryTime"`
	// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrOutput `pulumi:"lifetimeSeconds"`
	TokenId         pulumi.StringOutput `pulumi:"tokenId"`
	// **Sensitive** value of the newly-created token.
	TokenValue pulumi.StringOutput `pulumi:"tokenValue"`
}

// NewToken registers a new resource with the given unique name, arguments, and options.
func NewToken(ctx *pulumi.Context,
	name string, args *TokenArgs, opts ...pulumi.ResourceOption) (*Token, error) {
	if args == nil {
		args = &TokenArgs{}
	}

	secrets := pulumi.AdditionalSecretOutputs([]string{
		"tokenValue",
	})
	opts = append(opts, secrets)
	var resource Token
	err := ctx.RegisterResource("databricks:index/token:Token", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetToken gets an existing Token resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TokenState, opts ...pulumi.ResourceOption) (*Token, error) {
	var resource Token
	err := ctx.ReadResource("databricks:index/token:Token", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Token resources.
type tokenState struct {
	// (String) Comment that will appear on the user’s settings page for this token.
	Comment      *string `pulumi:"comment"`
	CreationTime *int    `pulumi:"creationTime"`
	ExpiryTime   *int    `pulumi:"expiryTime"`
	// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds *int    `pulumi:"lifetimeSeconds"`
	TokenId         *string `pulumi:"tokenId"`
	// **Sensitive** value of the newly-created token.
	TokenValue *string `pulumi:"tokenValue"`
}

type TokenState struct {
	// (String) Comment that will appear on the user’s settings page for this token.
	Comment      pulumi.StringPtrInput
	CreationTime pulumi.IntPtrInput
	ExpiryTime   pulumi.IntPtrInput
	// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrInput
	TokenId         pulumi.StringPtrInput
	// **Sensitive** value of the newly-created token.
	TokenValue pulumi.StringPtrInput
}

func (TokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenState)(nil)).Elem()
}

type tokenArgs struct {
	// (String) Comment that will appear on the user’s settings page for this token.
	Comment      *string `pulumi:"comment"`
	CreationTime *int    `pulumi:"creationTime"`
	ExpiryTime   *int    `pulumi:"expiryTime"`
	// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds *int    `pulumi:"lifetimeSeconds"`
	TokenId         *string `pulumi:"tokenId"`
}

// The set of arguments for constructing a Token resource.
type TokenArgs struct {
	// (String) Comment that will appear on the user’s settings page for this token.
	Comment      pulumi.StringPtrInput
	CreationTime pulumi.IntPtrInput
	ExpiryTime   pulumi.IntPtrInput
	// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
	LifetimeSeconds pulumi.IntPtrInput
	TokenId         pulumi.StringPtrInput
}

func (TokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenArgs)(nil)).Elem()
}

type TokenInput interface {
	pulumi.Input

	ToTokenOutput() TokenOutput
	ToTokenOutputWithContext(ctx context.Context) TokenOutput
}

func (*Token) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil)).Elem()
}

func (i *Token) ToTokenOutput() TokenOutput {
	return i.ToTokenOutputWithContext(context.Background())
}

func (i *Token) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenOutput)
}

// TokenArrayInput is an input type that accepts TokenArray and TokenArrayOutput values.
// You can construct a concrete instance of `TokenArrayInput` via:
//
//	TokenArray{ TokenArgs{...} }
type TokenArrayInput interface {
	pulumi.Input

	ToTokenArrayOutput() TokenArrayOutput
	ToTokenArrayOutputWithContext(context.Context) TokenArrayOutput
}

type TokenArray []TokenInput

func (TokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Token)(nil)).Elem()
}

func (i TokenArray) ToTokenArrayOutput() TokenArrayOutput {
	return i.ToTokenArrayOutputWithContext(context.Background())
}

func (i TokenArray) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenArrayOutput)
}

// TokenMapInput is an input type that accepts TokenMap and TokenMapOutput values.
// You can construct a concrete instance of `TokenMapInput` via:
//
//	TokenMap{ "key": TokenArgs{...} }
type TokenMapInput interface {
	pulumi.Input

	ToTokenMapOutput() TokenMapOutput
	ToTokenMapOutputWithContext(context.Context) TokenMapOutput
}

type TokenMap map[string]TokenInput

func (TokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Token)(nil)).Elem()
}

func (i TokenMap) ToTokenMapOutput() TokenMapOutput {
	return i.ToTokenMapOutputWithContext(context.Background())
}

func (i TokenMap) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenMapOutput)
}

type TokenOutput struct{ *pulumi.OutputState }

func (TokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil)).Elem()
}

func (o TokenOutput) ToTokenOutput() TokenOutput {
	return o
}

func (o TokenOutput) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return o
}

// (String) Comment that will appear on the user’s settings page for this token.
func (o TokenOutput) Comment() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.Comment }).(pulumi.StringPtrOutput)
}

func (o TokenOutput) CreationTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Token) pulumi.IntOutput { return v.CreationTime }).(pulumi.IntOutput)
}

func (o TokenOutput) ExpiryTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Token) pulumi.IntOutput { return v.ExpiryTime }).(pulumi.IntOutput)
}

// (Integer) The lifetime of the token, in seconds. If no lifetime is specified, the token remains valid indefinitely.
func (o TokenOutput) LifetimeSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.IntPtrOutput { return v.LifetimeSeconds }).(pulumi.IntPtrOutput)
}

func (o TokenOutput) TokenId() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.TokenId }).(pulumi.StringOutput)
}

// **Sensitive** value of the newly-created token.
func (o TokenOutput) TokenValue() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.TokenValue }).(pulumi.StringOutput)
}

type TokenArrayOutput struct{ *pulumi.OutputState }

func (TokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Token)(nil)).Elem()
}

func (o TokenArrayOutput) ToTokenArrayOutput() TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) Index(i pulumi.IntInput) TokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Token {
		return vs[0].([]*Token)[vs[1].(int)]
	}).(TokenOutput)
}

type TokenMapOutput struct{ *pulumi.OutputState }

func (TokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Token)(nil)).Elem()
}

func (o TokenMapOutput) ToTokenMapOutput() TokenMapOutput {
	return o
}

func (o TokenMapOutput) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return o
}

func (o TokenMapOutput) MapIndex(k pulumi.StringInput) TokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Token {
		return vs[0].(map[string]*Token)[vs[1].(string)]
	}).(TokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TokenInput)(nil)).Elem(), &Token{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenArrayInput)(nil)).Elem(), TokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenMapInput)(nil)).Elem(), TokenMap{})
	pulumi.RegisterOutputType(TokenOutput{})
	pulumi.RegisterOutputType(TokenArrayOutput{})
	pulumi.RegisterOutputType(TokenMapOutput{})
}
