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
// # The workspace file resource can be imported using workspace file path bash
//
// ```sh
//
//	$ pulumi import databricks:index/workspaceFile:WorkspaceFile this /path/to/file
//
// ```
type WorkspaceFile struct {
	pulumi.CustomResourceState

	ContentBase64 pulumi.StringPtrOutput `pulumi:"contentBase64"`
	Md5           pulumi.StringPtrOutput `pulumi:"md5"`
	// Unique identifier for a workspace file
	ObjectId pulumi.IntOutput `pulumi:"objectId"`
	// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
	Path pulumi.StringOutput `pulumi:"path"`
	// Path to file on local filesystem. Conflicts with `contentBase64`.
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// Routable URL of the workspace file
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewWorkspaceFile registers a new resource with the given unique name, arguments, and options.
func NewWorkspaceFile(ctx *pulumi.Context,
	name string, args *WorkspaceFileArgs, opts ...pulumi.ResourceOption) (*WorkspaceFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Path == nil {
		return nil, errors.New("invalid value for required argument 'Path'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource WorkspaceFile
	err := ctx.RegisterResource("databricks:index/workspaceFile:WorkspaceFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkspaceFile gets an existing WorkspaceFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkspaceFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkspaceFileState, opts ...pulumi.ResourceOption) (*WorkspaceFile, error) {
	var resource WorkspaceFile
	err := ctx.ReadResource("databricks:index/workspaceFile:WorkspaceFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WorkspaceFile resources.
type workspaceFileState struct {
	ContentBase64 *string `pulumi:"contentBase64"`
	Md5           *string `pulumi:"md5"`
	// Unique identifier for a workspace file
	ObjectId *int `pulumi:"objectId"`
	// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
	Path *string `pulumi:"path"`
	// Path to file on local filesystem. Conflicts with `contentBase64`.
	Source *string `pulumi:"source"`
	// Routable URL of the workspace file
	Url *string `pulumi:"url"`
}

type WorkspaceFileState struct {
	ContentBase64 pulumi.StringPtrInput
	Md5           pulumi.StringPtrInput
	// Unique identifier for a workspace file
	ObjectId pulumi.IntPtrInput
	// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
	Path pulumi.StringPtrInput
	// Path to file on local filesystem. Conflicts with `contentBase64`.
	Source pulumi.StringPtrInput
	// Routable URL of the workspace file
	Url pulumi.StringPtrInput
}

func (WorkspaceFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceFileState)(nil)).Elem()
}

type workspaceFileArgs struct {
	ContentBase64 *string `pulumi:"contentBase64"`
	Md5           *string `pulumi:"md5"`
	// Unique identifier for a workspace file
	ObjectId *int `pulumi:"objectId"`
	// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
	Path string `pulumi:"path"`
	// Path to file on local filesystem. Conflicts with `contentBase64`.
	Source *string `pulumi:"source"`
}

// The set of arguments for constructing a WorkspaceFile resource.
type WorkspaceFileArgs struct {
	ContentBase64 pulumi.StringPtrInput
	Md5           pulumi.StringPtrInput
	// Unique identifier for a workspace file
	ObjectId pulumi.IntPtrInput
	// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
	Path pulumi.StringInput
	// Path to file on local filesystem. Conflicts with `contentBase64`.
	Source pulumi.StringPtrInput
}

func (WorkspaceFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workspaceFileArgs)(nil)).Elem()
}

type WorkspaceFileInput interface {
	pulumi.Input

	ToWorkspaceFileOutput() WorkspaceFileOutput
	ToWorkspaceFileOutputWithContext(ctx context.Context) WorkspaceFileOutput
}

func (*WorkspaceFile) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceFile)(nil)).Elem()
}

func (i *WorkspaceFile) ToWorkspaceFileOutput() WorkspaceFileOutput {
	return i.ToWorkspaceFileOutputWithContext(context.Background())
}

func (i *WorkspaceFile) ToWorkspaceFileOutputWithContext(ctx context.Context) WorkspaceFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceFileOutput)
}

// WorkspaceFileArrayInput is an input type that accepts WorkspaceFileArray and WorkspaceFileArrayOutput values.
// You can construct a concrete instance of `WorkspaceFileArrayInput` via:
//
//	WorkspaceFileArray{ WorkspaceFileArgs{...} }
type WorkspaceFileArrayInput interface {
	pulumi.Input

	ToWorkspaceFileArrayOutput() WorkspaceFileArrayOutput
	ToWorkspaceFileArrayOutputWithContext(context.Context) WorkspaceFileArrayOutput
}

type WorkspaceFileArray []WorkspaceFileInput

func (WorkspaceFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceFile)(nil)).Elem()
}

func (i WorkspaceFileArray) ToWorkspaceFileArrayOutput() WorkspaceFileArrayOutput {
	return i.ToWorkspaceFileArrayOutputWithContext(context.Background())
}

func (i WorkspaceFileArray) ToWorkspaceFileArrayOutputWithContext(ctx context.Context) WorkspaceFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceFileArrayOutput)
}

// WorkspaceFileMapInput is an input type that accepts WorkspaceFileMap and WorkspaceFileMapOutput values.
// You can construct a concrete instance of `WorkspaceFileMapInput` via:
//
//	WorkspaceFileMap{ "key": WorkspaceFileArgs{...} }
type WorkspaceFileMapInput interface {
	pulumi.Input

	ToWorkspaceFileMapOutput() WorkspaceFileMapOutput
	ToWorkspaceFileMapOutputWithContext(context.Context) WorkspaceFileMapOutput
}

type WorkspaceFileMap map[string]WorkspaceFileInput

func (WorkspaceFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceFile)(nil)).Elem()
}

func (i WorkspaceFileMap) ToWorkspaceFileMapOutput() WorkspaceFileMapOutput {
	return i.ToWorkspaceFileMapOutputWithContext(context.Background())
}

func (i WorkspaceFileMap) ToWorkspaceFileMapOutputWithContext(ctx context.Context) WorkspaceFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkspaceFileMapOutput)
}

type WorkspaceFileOutput struct{ *pulumi.OutputState }

func (WorkspaceFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WorkspaceFile)(nil)).Elem()
}

func (o WorkspaceFileOutput) ToWorkspaceFileOutput() WorkspaceFileOutput {
	return o
}

func (o WorkspaceFileOutput) ToWorkspaceFileOutputWithContext(ctx context.Context) WorkspaceFileOutput {
	return o
}

func (o WorkspaceFileOutput) ContentBase64() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.StringPtrOutput { return v.ContentBase64 }).(pulumi.StringPtrOutput)
}

func (o WorkspaceFileOutput) Md5() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.StringPtrOutput { return v.Md5 }).(pulumi.StringPtrOutput)
}

// Unique identifier for a workspace file
func (o WorkspaceFileOutput) ObjectId() pulumi.IntOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.IntOutput { return v.ObjectId }).(pulumi.IntOutput)
}

// The absolute path of the workspace file, beginning with "/", e.g. "/Demo".
func (o WorkspaceFileOutput) Path() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.StringOutput { return v.Path }).(pulumi.StringOutput)
}

// Path to file on local filesystem. Conflicts with `contentBase64`.
func (o WorkspaceFileOutput) Source() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.StringPtrOutput { return v.Source }).(pulumi.StringPtrOutput)
}

// Routable URL of the workspace file
func (o WorkspaceFileOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *WorkspaceFile) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type WorkspaceFileArrayOutput struct{ *pulumi.OutputState }

func (WorkspaceFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WorkspaceFile)(nil)).Elem()
}

func (o WorkspaceFileArrayOutput) ToWorkspaceFileArrayOutput() WorkspaceFileArrayOutput {
	return o
}

func (o WorkspaceFileArrayOutput) ToWorkspaceFileArrayOutputWithContext(ctx context.Context) WorkspaceFileArrayOutput {
	return o
}

func (o WorkspaceFileArrayOutput) Index(i pulumi.IntInput) WorkspaceFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WorkspaceFile {
		return vs[0].([]*WorkspaceFile)[vs[1].(int)]
	}).(WorkspaceFileOutput)
}

type WorkspaceFileMapOutput struct{ *pulumi.OutputState }

func (WorkspaceFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WorkspaceFile)(nil)).Elem()
}

func (o WorkspaceFileMapOutput) ToWorkspaceFileMapOutput() WorkspaceFileMapOutput {
	return o
}

func (o WorkspaceFileMapOutput) ToWorkspaceFileMapOutputWithContext(ctx context.Context) WorkspaceFileMapOutput {
	return o
}

func (o WorkspaceFileMapOutput) MapIndex(k pulumi.StringInput) WorkspaceFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WorkspaceFile {
		return vs[0].(map[string]*WorkspaceFile)[vs[1].(string)]
	}).(WorkspaceFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceFileInput)(nil)).Elem(), &WorkspaceFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceFileArrayInput)(nil)).Elem(), WorkspaceFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkspaceFileMapInput)(nil)).Elem(), WorkspaceFileMap{})
	pulumi.RegisterOutputType(WorkspaceFileOutput{})
	pulumi.RegisterOutputType(WorkspaceFileArrayOutput{})
	pulumi.RegisterOutputType(WorkspaceFileMapOutput{})
}
