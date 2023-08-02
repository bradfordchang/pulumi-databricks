// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// > **Note** This resource has an evolving API, which may change in future versions of the provider. Please always consult [latest documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default) in case of any questions.
//
// This data source constructs necessary AWS cross-account policy for you, which is based on [official documentation](https://docs.databricks.com/administration-guide/account-api/iam-role.html#language-Your%C2%A0VPC,%C2%A0default).
//
// ## Example Usage
//
// For more detailed usage please see getAwsAssumeRolePolicy or databricksAwsS3Mount pages.
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
//			_, err := databricks.GetAwsCrossAccountPolicy(ctx, nil, nil)
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
// * Provisioning AWS Databricks E2 with a Hub & Spoke firewall for data exfiltration protection guide
// * getAwsAssumeRolePolicy data to construct the necessary AWS STS assume role policy.
// * getAwsBucketPolicy data to configure a simple access policy for AWS S3 buckets, so that Databricks can access data in it.
// * InstanceProfile to manage AWS EC2 instance profiles that users can launch Cluster and access data, like databricks_mount.
func GetAwsCrossAccountPolicy(ctx *pulumi.Context, args *GetAwsCrossAccountPolicyArgs, opts ...pulumi.InvokeOption) (*GetAwsCrossAccountPolicyResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAwsCrossAccountPolicyResult
	err := ctx.Invoke("databricks:index/getAwsCrossAccountPolicy:getAwsCrossAccountPolicy", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyArgs struct {
	// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
	PassRoles []string `pulumi:"passRoles"`
}

// A collection of values returned by getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyResult struct {
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// AWS IAM Policy JSON document
	Json      string   `pulumi:"json"`
	PassRoles []string `pulumi:"passRoles"`
}

func GetAwsCrossAccountPolicyOutput(ctx *pulumi.Context, args GetAwsCrossAccountPolicyOutputArgs, opts ...pulumi.InvokeOption) GetAwsCrossAccountPolicyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAwsCrossAccountPolicyResult, error) {
			args := v.(GetAwsCrossAccountPolicyArgs)
			r, err := GetAwsCrossAccountPolicy(ctx, &args, opts...)
			var s GetAwsCrossAccountPolicyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAwsCrossAccountPolicyResultOutput)
}

// A collection of arguments for invoking getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyOutputArgs struct {
	// List of Data IAM role ARNs that are explicitly granted `iam:PassRole` action.
	PassRoles pulumi.StringArrayInput `pulumi:"passRoles"`
}

func (GetAwsCrossAccountPolicyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsCrossAccountPolicyArgs)(nil)).Elem()
}

// A collection of values returned by getAwsCrossAccountPolicy.
type GetAwsCrossAccountPolicyResultOutput struct{ *pulumi.OutputState }

func (GetAwsCrossAccountPolicyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAwsCrossAccountPolicyResult)(nil)).Elem()
}

func (o GetAwsCrossAccountPolicyResultOutput) ToGetAwsCrossAccountPolicyResultOutput() GetAwsCrossAccountPolicyResultOutput {
	return o
}

func (o GetAwsCrossAccountPolicyResultOutput) ToGetAwsCrossAccountPolicyResultOutputWithContext(ctx context.Context) GetAwsCrossAccountPolicyResultOutput {
	return o
}

// The provider-assigned unique ID for this managed resource.
func (o GetAwsCrossAccountPolicyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) string { return v.Id }).(pulumi.StringOutput)
}

// AWS IAM Policy JSON document
func (o GetAwsCrossAccountPolicyResultOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) string { return v.Json }).(pulumi.StringOutput)
}

func (o GetAwsCrossAccountPolicyResultOutput) PassRoles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAwsCrossAccountPolicyResult) []string { return v.PassRoles }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAwsCrossAccountPolicyResultOutput{})
}
