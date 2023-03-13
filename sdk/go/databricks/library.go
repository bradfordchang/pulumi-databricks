// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package databricks

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It's possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.
//
// > **Note** `Library` resource would always start the associated cluster if it's not running, so make sure to have auto-termination configured. It's not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.
//
// ## Java/Scala JAR
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
//			appDbfsFile, err := databricks.NewDbfsFile(ctx, "appDbfsFile", &databricks.DbfsFileArgs{
//				Source: pulumi.String(fmt.Sprintf("%v/app-0.0.1.jar", path.Module)),
//				Path:   pulumi.String("/FileStore/app-0.0.1.jar"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewLibrary(ctx, "appLibrary", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Jar:       appDbfsFile.DbfsPath,
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
// ## Java/Scala Maven
//
// Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).
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
//			_, err := databricks.NewLibrary(ctx, "deequ", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Maven: &databricks.LibraryMavenArgs{
//					Coordinates: pulumi.String("com.amazon.deequ:deequ:1.0.4"),
//					Exclusions: pulumi.StringArray{
//						pulumi.String("org.apache.avro:avro"),
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
// ## Python Wheel
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
//			appDbfsFile, err := databricks.NewDbfsFile(ctx, "appDbfsFile", &databricks.DbfsFileArgs{
//				Source: pulumi.String(fmt.Sprintf("%v/baz.whl", path.Module)),
//				Path:   pulumi.String("/FileStore/baz.whl"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewLibrary(ctx, "appLibrary", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Whl:       appDbfsFile.DbfsPath,
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
// ## Python PyPI
//
// Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.
//
// > **Note** `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.
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
//			_, err := databricks.NewLibrary(ctx, "fbprophet", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Pypi: &databricks.LibraryPypiArgs{
//					Package: pulumi.String("fbprophet==0.6"),
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
// ## Python EGG
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
//			appDbfsFile, err := databricks.NewDbfsFile(ctx, "appDbfsFile", &databricks.DbfsFileArgs{
//				Source: pulumi.String(fmt.Sprintf("%v/foo.egg", path.Module)),
//				Path:   pulumi.String("/FileStore/foo.egg"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = databricks.NewLibrary(ctx, "appLibrary", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Egg:       appDbfsFile.DbfsPath,
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
// ## R CRan
//
// Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.
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
//			_, err := databricks.NewLibrary(ctx, "rkeops", &databricks.LibraryArgs{
//				ClusterId: pulumi.Any(databricks_cluster.This.Id),
//				Cran: &databricks.LibraryCranArgs{
//					Package: pulumi.String("rkeops"),
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
// ## Related Resources
//
// The following resources are often used in the same context:
//
// * End to end workspace management guide.
// * getClusters data to retrieve a list of Cluster ids.
// * Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
// * ClusterPolicy to create a Cluster policy, which limits the ability to create clusters based on a set of rules.
// * DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
// * GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all Cluster and databricks_job.
// * Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
// * Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
// * Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
// * Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
//
// ## Import
//
// -> **Note** Importing this resource is not currently supported.
type Library struct {
	pulumi.CustomResourceState

	ClusterId pulumi.StringOutput    `pulumi:"clusterId"`
	Cran      LibraryCranPtrOutput   `pulumi:"cran"`
	Egg       pulumi.StringPtrOutput `pulumi:"egg"`
	Jar       pulumi.StringPtrOutput `pulumi:"jar"`
	Maven     LibraryMavenPtrOutput  `pulumi:"maven"`
	Pypi      LibraryPypiPtrOutput   `pulumi:"pypi"`
	Whl       pulumi.StringPtrOutput `pulumi:"whl"`
}

// NewLibrary registers a new resource with the given unique name, arguments, and options.
func NewLibrary(ctx *pulumi.Context,
	name string, args *LibraryArgs, opts ...pulumi.ResourceOption) (*Library, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterId == nil {
		return nil, errors.New("invalid value for required argument 'ClusterId'")
	}
	var resource Library
	err := ctx.RegisterResource("databricks:index/library:Library", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLibrary gets an existing Library resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLibrary(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LibraryState, opts ...pulumi.ResourceOption) (*Library, error) {
	var resource Library
	err := ctx.ReadResource("databricks:index/library:Library", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Library resources.
type libraryState struct {
	ClusterId *string       `pulumi:"clusterId"`
	Cran      *LibraryCran  `pulumi:"cran"`
	Egg       *string       `pulumi:"egg"`
	Jar       *string       `pulumi:"jar"`
	Maven     *LibraryMaven `pulumi:"maven"`
	Pypi      *LibraryPypi  `pulumi:"pypi"`
	Whl       *string       `pulumi:"whl"`
}

type LibraryState struct {
	ClusterId pulumi.StringPtrInput
	Cran      LibraryCranPtrInput
	Egg       pulumi.StringPtrInput
	Jar       pulumi.StringPtrInput
	Maven     LibraryMavenPtrInput
	Pypi      LibraryPypiPtrInput
	Whl       pulumi.StringPtrInput
}

func (LibraryState) ElementType() reflect.Type {
	return reflect.TypeOf((*libraryState)(nil)).Elem()
}

type libraryArgs struct {
	ClusterId string        `pulumi:"clusterId"`
	Cran      *LibraryCran  `pulumi:"cran"`
	Egg       *string       `pulumi:"egg"`
	Jar       *string       `pulumi:"jar"`
	Maven     *LibraryMaven `pulumi:"maven"`
	Pypi      *LibraryPypi  `pulumi:"pypi"`
	Whl       *string       `pulumi:"whl"`
}

// The set of arguments for constructing a Library resource.
type LibraryArgs struct {
	ClusterId pulumi.StringInput
	Cran      LibraryCranPtrInput
	Egg       pulumi.StringPtrInput
	Jar       pulumi.StringPtrInput
	Maven     LibraryMavenPtrInput
	Pypi      LibraryPypiPtrInput
	Whl       pulumi.StringPtrInput
}

func (LibraryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*libraryArgs)(nil)).Elem()
}

type LibraryInput interface {
	pulumi.Input

	ToLibraryOutput() LibraryOutput
	ToLibraryOutputWithContext(ctx context.Context) LibraryOutput
}

func (*Library) ElementType() reflect.Type {
	return reflect.TypeOf((**Library)(nil)).Elem()
}

func (i *Library) ToLibraryOutput() LibraryOutput {
	return i.ToLibraryOutputWithContext(context.Background())
}

func (i *Library) ToLibraryOutputWithContext(ctx context.Context) LibraryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LibraryOutput)
}

// LibraryArrayInput is an input type that accepts LibraryArray and LibraryArrayOutput values.
// You can construct a concrete instance of `LibraryArrayInput` via:
//
//	LibraryArray{ LibraryArgs{...} }
type LibraryArrayInput interface {
	pulumi.Input

	ToLibraryArrayOutput() LibraryArrayOutput
	ToLibraryArrayOutputWithContext(context.Context) LibraryArrayOutput
}

type LibraryArray []LibraryInput

func (LibraryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Library)(nil)).Elem()
}

func (i LibraryArray) ToLibraryArrayOutput() LibraryArrayOutput {
	return i.ToLibraryArrayOutputWithContext(context.Background())
}

func (i LibraryArray) ToLibraryArrayOutputWithContext(ctx context.Context) LibraryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LibraryArrayOutput)
}

// LibraryMapInput is an input type that accepts LibraryMap and LibraryMapOutput values.
// You can construct a concrete instance of `LibraryMapInput` via:
//
//	LibraryMap{ "key": LibraryArgs{...} }
type LibraryMapInput interface {
	pulumi.Input

	ToLibraryMapOutput() LibraryMapOutput
	ToLibraryMapOutputWithContext(context.Context) LibraryMapOutput
}

type LibraryMap map[string]LibraryInput

func (LibraryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Library)(nil)).Elem()
}

func (i LibraryMap) ToLibraryMapOutput() LibraryMapOutput {
	return i.ToLibraryMapOutputWithContext(context.Background())
}

func (i LibraryMap) ToLibraryMapOutputWithContext(ctx context.Context) LibraryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LibraryMapOutput)
}

type LibraryOutput struct{ *pulumi.OutputState }

func (LibraryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Library)(nil)).Elem()
}

func (o LibraryOutput) ToLibraryOutput() LibraryOutput {
	return o
}

func (o LibraryOutput) ToLibraryOutputWithContext(ctx context.Context) LibraryOutput {
	return o
}

func (o LibraryOutput) ClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Library) pulumi.StringOutput { return v.ClusterId }).(pulumi.StringOutput)
}

func (o LibraryOutput) Cran() LibraryCranPtrOutput {
	return o.ApplyT(func(v *Library) LibraryCranPtrOutput { return v.Cran }).(LibraryCranPtrOutput)
}

func (o LibraryOutput) Egg() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Library) pulumi.StringPtrOutput { return v.Egg }).(pulumi.StringPtrOutput)
}

func (o LibraryOutput) Jar() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Library) pulumi.StringPtrOutput { return v.Jar }).(pulumi.StringPtrOutput)
}

func (o LibraryOutput) Maven() LibraryMavenPtrOutput {
	return o.ApplyT(func(v *Library) LibraryMavenPtrOutput { return v.Maven }).(LibraryMavenPtrOutput)
}

func (o LibraryOutput) Pypi() LibraryPypiPtrOutput {
	return o.ApplyT(func(v *Library) LibraryPypiPtrOutput { return v.Pypi }).(LibraryPypiPtrOutput)
}

func (o LibraryOutput) Whl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Library) pulumi.StringPtrOutput { return v.Whl }).(pulumi.StringPtrOutput)
}

type LibraryArrayOutput struct{ *pulumi.OutputState }

func (LibraryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Library)(nil)).Elem()
}

func (o LibraryArrayOutput) ToLibraryArrayOutput() LibraryArrayOutput {
	return o
}

func (o LibraryArrayOutput) ToLibraryArrayOutputWithContext(ctx context.Context) LibraryArrayOutput {
	return o
}

func (o LibraryArrayOutput) Index(i pulumi.IntInput) LibraryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Library {
		return vs[0].([]*Library)[vs[1].(int)]
	}).(LibraryOutput)
}

type LibraryMapOutput struct{ *pulumi.OutputState }

func (LibraryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Library)(nil)).Elem()
}

func (o LibraryMapOutput) ToLibraryMapOutput() LibraryMapOutput {
	return o
}

func (o LibraryMapOutput) ToLibraryMapOutputWithContext(ctx context.Context) LibraryMapOutput {
	return o
}

func (o LibraryMapOutput) MapIndex(k pulumi.StringInput) LibraryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Library {
		return vs[0].(map[string]*Library)[vs[1].(string)]
	}).(LibraryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LibraryInput)(nil)).Elem(), &Library{})
	pulumi.RegisterInputType(reflect.TypeOf((*LibraryArrayInput)(nil)).Elem(), LibraryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LibraryMapInput)(nil)).Elem(), LibraryMap{})
	pulumi.RegisterOutputType(LibraryOutput{})
	pulumi.RegisterOutputType(LibraryArrayOutput{})
	pulumi.RegisterOutputType(LibraryMapOutput{})
}
