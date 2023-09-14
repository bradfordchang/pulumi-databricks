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

// ## Import
//
// # The resource Repo can be imported using the Repo ID (obtained via UI or using API) bash
//
// ```sh
//
//	$ pulumi import databricks:index/repo:Repo this repo_id
//
// ```
type Repo struct {
	pulumi.CustomResourceState

	// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
	Branch pulumi.StringOutput `pulumi:"branch"`
	// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
	CommitHash pulumi.StringOutput `pulumi:"commitHash"`
	// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
	GitProvider pulumi.StringOutput `pulumi:"gitProvider"`
	// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
	Path           pulumi.StringOutput         `pulumi:"path"`
	SparseCheckout RepoSparseCheckoutPtrOutput `pulumi:"sparseCheckout"`
	// name of the tag for initial checkout.  Conflicts with `branch`.
	Tag pulumi.StringPtrOutput `pulumi:"tag"`
	// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewRepo registers a new resource with the given unique name, arguments, and options.
func NewRepo(ctx *pulumi.Context,
	name string, args *RepoArgs, opts ...pulumi.ResourceOption) (*Repo, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Repo
	err := ctx.RegisterResource("databricks:index/repo:Repo", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRepo gets an existing Repo resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRepo(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RepoState, opts ...pulumi.ResourceOption) (*Repo, error) {
	var resource Repo
	err := ctx.ReadResource("databricks:index/repo:Repo", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Repo resources.
type repoState struct {
	// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
	Branch *string `pulumi:"branch"`
	// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
	CommitHash *string `pulumi:"commitHash"`
	// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
	GitProvider *string `pulumi:"gitProvider"`
	// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
	Path           *string             `pulumi:"path"`
	SparseCheckout *RepoSparseCheckout `pulumi:"sparseCheckout"`
	// name of the tag for initial checkout.  Conflicts with `branch`.
	Tag *string `pulumi:"tag"`
	// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
	Url *string `pulumi:"url"`
}

type RepoState struct {
	// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
	Branch pulumi.StringPtrInput
	// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
	CommitHash pulumi.StringPtrInput
	// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
	GitProvider pulumi.StringPtrInput
	// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
	Path           pulumi.StringPtrInput
	SparseCheckout RepoSparseCheckoutPtrInput
	// name of the tag for initial checkout.  Conflicts with `branch`.
	Tag pulumi.StringPtrInput
	// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
	Url pulumi.StringPtrInput
}

func (RepoState) ElementType() reflect.Type {
	return reflect.TypeOf((*repoState)(nil)).Elem()
}

type repoArgs struct {
	// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
	Branch *string `pulumi:"branch"`
	// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
	CommitHash *string `pulumi:"commitHash"`
	// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
	GitProvider *string `pulumi:"gitProvider"`
	// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
	Path           *string             `pulumi:"path"`
	SparseCheckout *RepoSparseCheckout `pulumi:"sparseCheckout"`
	// name of the tag for initial checkout.  Conflicts with `branch`.
	Tag *string `pulumi:"tag"`
	// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a Repo resource.
type RepoArgs struct {
	// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
	Branch pulumi.StringPtrInput
	// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
	CommitHash pulumi.StringPtrInput
	// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
	GitProvider pulumi.StringPtrInput
	// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
	Path           pulumi.StringPtrInput
	SparseCheckout RepoSparseCheckoutPtrInput
	// name of the tag for initial checkout.  Conflicts with `branch`.
	Tag pulumi.StringPtrInput
	// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
	Url pulumi.StringInput
}

func (RepoArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*repoArgs)(nil)).Elem()
}

type RepoInput interface {
	pulumi.Input

	ToRepoOutput() RepoOutput
	ToRepoOutputWithContext(ctx context.Context) RepoOutput
}

func (*Repo) ElementType() reflect.Type {
	return reflect.TypeOf((**Repo)(nil)).Elem()
}

func (i *Repo) ToRepoOutput() RepoOutput {
	return i.ToRepoOutputWithContext(context.Background())
}

func (i *Repo) ToRepoOutputWithContext(ctx context.Context) RepoOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoOutput)
}

func (i *Repo) ToOutput(ctx context.Context) pulumix.Output[*Repo] {
	return pulumix.Output[*Repo]{
		OutputState: i.ToRepoOutputWithContext(ctx).OutputState,
	}
}

// RepoArrayInput is an input type that accepts RepoArray and RepoArrayOutput values.
// You can construct a concrete instance of `RepoArrayInput` via:
//
//	RepoArray{ RepoArgs{...} }
type RepoArrayInput interface {
	pulumi.Input

	ToRepoArrayOutput() RepoArrayOutput
	ToRepoArrayOutputWithContext(context.Context) RepoArrayOutput
}

type RepoArray []RepoInput

func (RepoArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repo)(nil)).Elem()
}

func (i RepoArray) ToRepoArrayOutput() RepoArrayOutput {
	return i.ToRepoArrayOutputWithContext(context.Background())
}

func (i RepoArray) ToRepoArrayOutputWithContext(ctx context.Context) RepoArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoArrayOutput)
}

func (i RepoArray) ToOutput(ctx context.Context) pulumix.Output[[]*Repo] {
	return pulumix.Output[[]*Repo]{
		OutputState: i.ToRepoArrayOutputWithContext(ctx).OutputState,
	}
}

// RepoMapInput is an input type that accepts RepoMap and RepoMapOutput values.
// You can construct a concrete instance of `RepoMapInput` via:
//
//	RepoMap{ "key": RepoArgs{...} }
type RepoMapInput interface {
	pulumi.Input

	ToRepoMapOutput() RepoMapOutput
	ToRepoMapOutputWithContext(context.Context) RepoMapOutput
}

type RepoMap map[string]RepoInput

func (RepoMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repo)(nil)).Elem()
}

func (i RepoMap) ToRepoMapOutput() RepoMapOutput {
	return i.ToRepoMapOutputWithContext(context.Background())
}

func (i RepoMap) ToRepoMapOutputWithContext(ctx context.Context) RepoMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RepoMapOutput)
}

func (i RepoMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Repo] {
	return pulumix.Output[map[string]*Repo]{
		OutputState: i.ToRepoMapOutputWithContext(ctx).OutputState,
	}
}

type RepoOutput struct{ *pulumi.OutputState }

func (RepoOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Repo)(nil)).Elem()
}

func (o RepoOutput) ToRepoOutput() RepoOutput {
	return o
}

func (o RepoOutput) ToRepoOutputWithContext(ctx context.Context) RepoOutput {
	return o
}

func (o RepoOutput) ToOutput(ctx context.Context) pulumix.Output[*Repo] {
	return pulumix.Output[*Repo]{
		OutputState: o.OutputState,
	}
}

// name of the branch for initial checkout. If not specified, the default branch of the repository will be used.  Conflicts with `tag`.  If `branch` is removed, and `tag` isn't specified, then the repository will stay at the previously checked out state.
func (o RepoOutput) Branch() pulumi.StringOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringOutput { return v.Branch }).(pulumi.StringOutput)
}

// Hash of the HEAD commit at time of the last executed operation. It won't change if you manually perform pull operation via UI or API
func (o RepoOutput) CommitHash() pulumi.StringOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringOutput { return v.CommitHash }).(pulumi.StringOutput)
}

// case insensitive name of the Git provider.  Following values are supported right now (could be a subject for a change, consult [Repos API documentation](https://docs.databricks.com/dev-tools/api/latest/repos.html)): `gitHub`, `gitHubEnterprise`, `bitbucketCloud`, `bitbucketServer`, `azureDevOpsServices`, `gitLab`, `gitLabEnterpriseEdition`, `awsCodeCommit`.
func (o RepoOutput) GitProvider() pulumi.StringOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringOutput { return v.GitProvider }).(pulumi.StringOutput)
}

// path to put the checked out Repo. If not specified, then repo will be created in the user's repo directory (`/Repos/<username>/...`).  If the value changes, repo is re-created.
func (o RepoOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

func (o RepoOutput) SparseCheckout() RepoSparseCheckoutPtrOutput {
	return o.ApplyT(func(v *Repo) RepoSparseCheckoutPtrOutput { return v.SparseCheckout }).(RepoSparseCheckoutPtrOutput)
}

// name of the tag for initial checkout.  Conflicts with `branch`.
func (o RepoOutput) Tag() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringPtrOutput { return v.Tag }).(pulumi.StringPtrOutput)
}

// The URL of the Git Repository to clone from. If the value changes, repo is re-created.
func (o RepoOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Repo) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type RepoArrayOutput struct{ *pulumi.OutputState }

func (RepoArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Repo)(nil)).Elem()
}

func (o RepoArrayOutput) ToRepoArrayOutput() RepoArrayOutput {
	return o
}

func (o RepoArrayOutput) ToRepoArrayOutputWithContext(ctx context.Context) RepoArrayOutput {
	return o
}

func (o RepoArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Repo] {
	return pulumix.Output[[]*Repo]{
		OutputState: o.OutputState,
	}
}

func (o RepoArrayOutput) Index(i pulumi.IntInput) RepoOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Repo {
		return vs[0].([]*Repo)[vs[1].(int)]
	}).(RepoOutput)
}

type RepoMapOutput struct{ *pulumi.OutputState }

func (RepoMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Repo)(nil)).Elem()
}

func (o RepoMapOutput) ToRepoMapOutput() RepoMapOutput {
	return o
}

func (o RepoMapOutput) ToRepoMapOutputWithContext(ctx context.Context) RepoMapOutput {
	return o
}

func (o RepoMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Repo] {
	return pulumix.Output[map[string]*Repo]{
		OutputState: o.OutputState,
	}
}

func (o RepoMapOutput) MapIndex(k pulumi.StringInput) RepoOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Repo {
		return vs[0].(map[string]*Repo)[vs[1].(string)]
	}).(RepoOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RepoInput)(nil)).Elem(), &Repo{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepoArrayInput)(nil)).Elem(), RepoArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RepoMapInput)(nil)).Elem(), RepoMap{})
	pulumi.RegisterOutputType(RepoOutput{})
	pulumi.RegisterOutputType(RepoArrayOutput{})
	pulumi.RegisterOutputType(RepoMapOutput{})
}
