// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-databricks/sdk/go/databricks/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use `Pipeline` to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-databricks/sdk/go/databricks"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			dltDemoNotebook, err := databricks.NewNotebook(ctx, "dltDemoNotebook", nil)
//			if err != nil {
//				return err
//			}
//			dltDemoRepo, err := databricks.NewRepo(ctx, "dltDemoRepo", nil)
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewPipeline(ctx, "this", &databricks.PipelineArgs{
//				Storage: pulumi.String("/test/first-pipeline"),
//				Configuration: pulumi.AnyMap{
//					"key1": pulumi.Any("value1"),
//					"key2": pulumi.Any("value2"),
//				},
//				Clusters: databricks.PipelineClusterArray{
//					&databricks.PipelineClusterArgs{
//						Label:      pulumi.String("default"),
//						NumWorkers: pulumi.Int(2),
//						CustomTags: pulumi.AnyMap{
//							"cluster_type": pulumi.Any("default"),
//						},
//					},
//					&databricks.PipelineClusterArgs{
//						Label:      pulumi.String("maintenance"),
//						NumWorkers: pulumi.Int(1),
//						CustomTags: pulumi.AnyMap{
//							"cluster_type": pulumi.Any("maintenance"),
//						},
//					},
//				},
//				Libraries: databricks.PipelineLibraryArray{
//					&databricks.PipelineLibraryArgs{
//						Notebook: &databricks.PipelineLibraryNotebookArgs{
//							Path: dltDemoNotebook.ID(),
//						},
//					},
//					&databricks.PipelineLibraryArgs{
//						File: &databricks.PipelineLibraryFileArgs{
//							Path: dltDemoRepo.Path.ApplyT(func(path string) (string, error) {
//								return fmt.Sprintf("%v/pipeline.sql", path), nil
//							}).(pulumi.StringOutput),
//						},
//					},
//				},
//				Continuous: pulumi.Bool(false),
//				Notifications: databricks.PipelineNotificationArray{
//					&databricks.PipelineNotificationArgs{
//						EmailRecipients: pulumi.StringArray{
//							pulumi.String("user@domain.com"),
//							pulumi.String("user1@domain.com"),
//						},
//						Alerts: pulumi.StringArray{
//							pulumi.String("on-update-failure"),
//							pulumi.String("on-update-fatal-failure"),
//							pulumi.String("on-update-success"),
//							pulumi.String("on-flow-failure"),
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
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * getPipelines to retrieve [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html) pipeline data.
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
// * Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
//
// ## Import
//
// # The resource job can be imported using the id of the pipeline bash
//
// ```sh
//
//	$ pulumi import databricks:index/pipeline:Pipeline this <pipeline-id>
//
// ```
type Pipeline struct {
	pulumi.CustomResourceState

	AllowDuplicateNames pulumi.BoolPtrOutput `pulumi:"allowDuplicateNames"`
	// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
	Catalog pulumi.StringPtrOutput `pulumi:"catalog"`
	// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
	Channel pulumi.StringPtrOutput `pulumi:"channel"`
	// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
	Clusters PipelineClusterArrayOutput `pulumi:"clusters"`
	// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
	Configuration pulumi.MapOutput `pulumi:"configuration"`
	// A flag indicating whether to run the pipeline continuously. The default value is `false`.
	Continuous pulumi.BoolPtrOutput `pulumi:"continuous"`
	// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
	Development pulumi.BoolPtrOutput `pulumi:"development"`
	// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
	Edition pulumi.StringPtrOutput   `pulumi:"edition"`
	Filters PipelineFiltersPtrOutput `pulumi:"filters"`
	// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
	Libraries PipelineLibraryArrayOutput `pulumi:"libraries"`
	// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
	Name          pulumi.StringOutput             `pulumi:"name"`
	Notifications PipelineNotificationArrayOutput `pulumi:"notifications"`
	// A flag indicating whether to use Photon engine. The default value is `false`.
	Photon     pulumi.BoolPtrOutput `pulumi:"photon"`
	Serverless pulumi.BoolPtrOutput `pulumi:"serverless"`
	// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
	Storage pulumi.StringPtrOutput `pulumi:"storage"`
	// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
	Target pulumi.StringPtrOutput `pulumi:"target"`
	Url    pulumi.StringOutput    `pulumi:"url"`
}

// NewPipeline registers a new resource with the given unique name, arguments, and options.
func NewPipeline(ctx *pulumi.Context,
	name string, args *PipelineArgs, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	if args == nil {
		args = &PipelineArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Pipeline
	err := ctx.RegisterResource("databricks:index/pipeline:Pipeline", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPipeline gets an existing Pipeline resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPipeline(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PipelineState, opts ...pulumi.ResourceOption) (*Pipeline, error) {
	var resource Pipeline
	err := ctx.ReadResource("databricks:index/pipeline:Pipeline", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Pipeline resources.
type pipelineState struct {
	AllowDuplicateNames *bool `pulumi:"allowDuplicateNames"`
	// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
	Catalog *string `pulumi:"catalog"`
	// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
	Channel *string `pulumi:"channel"`
	// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
	Clusters []PipelineCluster `pulumi:"clusters"`
	// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
	Configuration map[string]interface{} `pulumi:"configuration"`
	// A flag indicating whether to run the pipeline continuously. The default value is `false`.
	Continuous *bool `pulumi:"continuous"`
	// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
	Development *bool `pulumi:"development"`
	// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
	Edition *string          `pulumi:"edition"`
	Filters *PipelineFilters `pulumi:"filters"`
	// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
	Libraries []PipelineLibrary `pulumi:"libraries"`
	// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
	Name          *string                `pulumi:"name"`
	Notifications []PipelineNotification `pulumi:"notifications"`
	// A flag indicating whether to use Photon engine. The default value is `false`.
	Photon     *bool `pulumi:"photon"`
	Serverless *bool `pulumi:"serverless"`
	// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
	Storage *string `pulumi:"storage"`
	// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
	Target *string `pulumi:"target"`
	Url    *string `pulumi:"url"`
}

type PipelineState struct {
	AllowDuplicateNames pulumi.BoolPtrInput
	// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
	Catalog pulumi.StringPtrInput
	// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
	Channel pulumi.StringPtrInput
	// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
	Clusters PipelineClusterArrayInput
	// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
	Configuration pulumi.MapInput
	// A flag indicating whether to run the pipeline continuously. The default value is `false`.
	Continuous pulumi.BoolPtrInput
	// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
	Development pulumi.BoolPtrInput
	// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
	Edition pulumi.StringPtrInput
	Filters PipelineFiltersPtrInput
	// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
	Libraries PipelineLibraryArrayInput
	// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
	Name          pulumi.StringPtrInput
	Notifications PipelineNotificationArrayInput
	// A flag indicating whether to use Photon engine. The default value is `false`.
	Photon     pulumi.BoolPtrInput
	Serverless pulumi.BoolPtrInput
	// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
	Storage pulumi.StringPtrInput
	// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
	Target pulumi.StringPtrInput
	Url    pulumi.StringPtrInput
}

func (PipelineState) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineState)(nil)).Elem()
}

type pipelineArgs struct {
	AllowDuplicateNames *bool `pulumi:"allowDuplicateNames"`
	// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
	Catalog *string `pulumi:"catalog"`
	// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
	Channel *string `pulumi:"channel"`
	// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
	Clusters []PipelineCluster `pulumi:"clusters"`
	// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
	Configuration map[string]interface{} `pulumi:"configuration"`
	// A flag indicating whether to run the pipeline continuously. The default value is `false`.
	Continuous *bool `pulumi:"continuous"`
	// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
	Development *bool `pulumi:"development"`
	// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
	Edition *string          `pulumi:"edition"`
	Filters *PipelineFilters `pulumi:"filters"`
	// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
	Libraries []PipelineLibrary `pulumi:"libraries"`
	// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
	Name          *string                `pulumi:"name"`
	Notifications []PipelineNotification `pulumi:"notifications"`
	// A flag indicating whether to use Photon engine. The default value is `false`.
	Photon     *bool `pulumi:"photon"`
	Serverless *bool `pulumi:"serverless"`
	// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
	Storage *string `pulumi:"storage"`
	// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
	Target *string `pulumi:"target"`
}

// The set of arguments for constructing a Pipeline resource.
type PipelineArgs struct {
	AllowDuplicateNames pulumi.BoolPtrInput
	// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
	Catalog pulumi.StringPtrInput
	// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
	Channel pulumi.StringPtrInput
	// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
	Clusters PipelineClusterArrayInput
	// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
	Configuration pulumi.MapInput
	// A flag indicating whether to run the pipeline continuously. The default value is `false`.
	Continuous pulumi.BoolPtrInput
	// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
	Development pulumi.BoolPtrInput
	// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
	Edition pulumi.StringPtrInput
	Filters PipelineFiltersPtrInput
	// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
	Libraries PipelineLibraryArrayInput
	// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
	Name          pulumi.StringPtrInput
	Notifications PipelineNotificationArrayInput
	// A flag indicating whether to use Photon engine. The default value is `false`.
	Photon     pulumi.BoolPtrInput
	Serverless pulumi.BoolPtrInput
	// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
	Storage pulumi.StringPtrInput
	// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
	Target pulumi.StringPtrInput
}

func (PipelineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pipelineArgs)(nil)).Elem()
}

type PipelineInput interface {
	pulumi.Input

	ToPipelineOutput() PipelineOutput
	ToPipelineOutputWithContext(ctx context.Context) PipelineOutput
}

func (*Pipeline) ElementType() reflect.Type {
	return reflect.TypeOf((**Pipeline)(nil)).Elem()
}

func (i *Pipeline) ToPipelineOutput() PipelineOutput {
	return i.ToPipelineOutputWithContext(context.Background())
}

func (i *Pipeline) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineOutput)
}

// PipelineArrayInput is an input type that accepts PipelineArray and PipelineArrayOutput values.
// You can construct a concrete instance of `PipelineArrayInput` via:
//
//	PipelineArray{ PipelineArgs{...} }
type PipelineArrayInput interface {
	pulumi.Input

	ToPipelineArrayOutput() PipelineArrayOutput
	ToPipelineArrayOutputWithContext(context.Context) PipelineArrayOutput
}

type PipelineArray []PipelineInput

func (PipelineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pipeline)(nil)).Elem()
}

func (i PipelineArray) ToPipelineArrayOutput() PipelineArrayOutput {
	return i.ToPipelineArrayOutputWithContext(context.Background())
}

func (i PipelineArray) ToPipelineArrayOutputWithContext(ctx context.Context) PipelineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineArrayOutput)
}

// PipelineMapInput is an input type that accepts PipelineMap and PipelineMapOutput values.
// You can construct a concrete instance of `PipelineMapInput` via:
//
//	PipelineMap{ "key": PipelineArgs{...} }
type PipelineMapInput interface {
	pulumi.Input

	ToPipelineMapOutput() PipelineMapOutput
	ToPipelineMapOutputWithContext(context.Context) PipelineMapOutput
}

type PipelineMap map[string]PipelineInput

func (PipelineMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pipeline)(nil)).Elem()
}

func (i PipelineMap) ToPipelineMapOutput() PipelineMapOutput {
	return i.ToPipelineMapOutputWithContext(context.Background())
}

func (i PipelineMap) ToPipelineMapOutputWithContext(ctx context.Context) PipelineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PipelineMapOutput)
}

type PipelineOutput struct{ *pulumi.OutputState }

func (PipelineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Pipeline)(nil)).Elem()
}

func (o PipelineOutput) ToPipelineOutput() PipelineOutput {
	return o
}

func (o PipelineOutput) ToPipelineOutputWithContext(ctx context.Context) PipelineOutput {
	return o
}

func (o PipelineOutput) AllowDuplicateNames() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.BoolPtrOutput { return v.AllowDuplicateNames }).(pulumi.BoolPtrOutput)
}

// The name of catalog in Unity Catalog. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `storage`).
func (o PipelineOutput) Catalog() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.Catalog }).(pulumi.StringPtrOutput)
}

// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `CURRENT` (default) and `PREVIEW`.
func (o PipelineOutput) Channel() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.Channel }).(pulumi.StringPtrOutput)
}

// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
func (o PipelineOutput) Clusters() PipelineClusterArrayOutput {
	return o.ApplyT(func(v *Pipeline) PipelineClusterArrayOutput { return v.Clusters }).(PipelineClusterArrayOutput)
}

// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
func (o PipelineOutput) Configuration() pulumi.MapOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.MapOutput { return v.Configuration }).(pulumi.MapOutput)
}

// A flag indicating whether to run the pipeline continuously. The default value is `false`.
func (o PipelineOutput) Continuous() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.BoolPtrOutput { return v.Continuous }).(pulumi.BoolPtrOutput)
}

// A flag indicating whether to run the pipeline in development mode. The default value is `true`.
func (o PipelineOutput) Development() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.BoolPtrOutput { return v.Development }).(pulumi.BoolPtrOutput)
}

// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `CORE`, `PRO`, `ADVANCED` (default).
func (o PipelineOutput) Edition() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.Edition }).(pulumi.StringPtrOutput)
}

func (o PipelineOutput) Filters() PipelineFiltersPtrOutput {
	return o.ApplyT(func(v *Pipeline) PipelineFiltersPtrOutput { return v.Filters }).(PipelineFiltersPtrOutput)
}

// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` & `file` library types that should have the `path` attribute. *Right now only the `notebook` & `file` types are supported.*
func (o PipelineOutput) Libraries() PipelineLibraryArrayOutput {
	return o.ApplyT(func(v *Pipeline) PipelineLibraryArrayOutput { return v.Libraries }).(PipelineLibraryArrayOutput)
}

// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
func (o PipelineOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

func (o PipelineOutput) Notifications() PipelineNotificationArrayOutput {
	return o.ApplyT(func(v *Pipeline) PipelineNotificationArrayOutput { return v.Notifications }).(PipelineNotificationArrayOutput)
}

// A flag indicating whether to use Photon engine. The default value is `false`.
func (o PipelineOutput) Photon() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.BoolPtrOutput { return v.Photon }).(pulumi.BoolPtrOutput)
}

func (o PipelineOutput) Serverless() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.BoolPtrOutput { return v.Serverless }).(pulumi.BoolPtrOutput)
}

// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.* (Conflicts with `catalog`).
func (o PipelineOutput) Storage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.Storage }).(pulumi.StringPtrOutput)
}

// The name of a database (in either the Hive metastore or in a UC catalog) for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
func (o PipelineOutput) Target() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringPtrOutput { return v.Target }).(pulumi.StringPtrOutput)
}

func (o PipelineOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Pipeline) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type PipelineArrayOutput struct{ *pulumi.OutputState }

func (PipelineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Pipeline)(nil)).Elem()
}

func (o PipelineArrayOutput) ToPipelineArrayOutput() PipelineArrayOutput {
	return o
}

func (o PipelineArrayOutput) ToPipelineArrayOutputWithContext(ctx context.Context) PipelineArrayOutput {
	return o
}

func (o PipelineArrayOutput) Index(i pulumi.IntInput) PipelineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Pipeline {
		return vs[0].([]*Pipeline)[vs[1].(int)]
	}).(PipelineOutput)
}

type PipelineMapOutput struct{ *pulumi.OutputState }

func (PipelineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Pipeline)(nil)).Elem()
}

func (o PipelineMapOutput) ToPipelineMapOutput() PipelineMapOutput {
	return o
}

func (o PipelineMapOutput) ToPipelineMapOutputWithContext(ctx context.Context) PipelineMapOutput {
	return o
}

func (o PipelineMapOutput) MapIndex(k pulumi.StringInput) PipelineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Pipeline {
		return vs[0].(map[string]*Pipeline)[vs[1].(string)]
	}).(PipelineOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineInput)(nil)).Elem(), &Pipeline{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineArrayInput)(nil)).Elem(), PipelineArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PipelineMapInput)(nil)).Elem(), PipelineMap{})
	pulumi.RegisterOutputType(PipelineOutput{})
	pulumi.RegisterOutputType(PipelineArrayOutput{})
	pulumi.RegisterOutputType(PipelineMapOutput{})
}
