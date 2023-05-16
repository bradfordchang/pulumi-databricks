// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.LibraryArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.LibraryState;
import com.pulumi.databricks.outputs.LibraryCran;
import com.pulumi.databricks.outputs.LibraryMaven;
import com.pulumi.databricks.outputs.LibraryPypi;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Installs a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster. Each different type of library has a slightly different syntax. It&#39;s possible to set only one type of library within one resource. Otherwise, the plan will fail with an error.
 * 
 * &gt; **Note** `databricks.Library` resource would always start the associated cluster if it&#39;s not running, so make sure to have auto-termination configured. It&#39;s not possible to atomically change the version of the same library without cluster restart. Libraries are fully removed from the cluster only after restart.
 * 
 * ## Installing library on all clusters
 * 
 * You can install libraries on all clusters with the help of databricks.getClusters data resource:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetClustersArgs;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryPypiArgs;
 * import com.pulumi.codegen.internal.KeyedValue;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var all = DatabricksFunctions.getClusters();
 * 
 *         final var cli = all.applyValue(getClustersResult -&gt; {
 *             final var resources = new ArrayList&lt;Library&gt;();
 *             for (var range : KeyedValue.of(getClustersResult.ids()) {
 *                 var resource = new Library(&#34;cli-&#34; + range.key(), LibraryArgs.builder()                
 *                     .clusterId(range.key())
 *                     .pypi(LibraryPypiArgs.builder()
 *                         .package_(&#34;databricks-cli&#34;)
 *                         .build())
 *                     .build());
 * 
 *                 resources.add(resource);
 *             }
 * 
 *             return resources;
 *         });
 * 
 *     }
 * }
 * ```
 * 
 * ## Java/Scala JAR
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DbfsFile;
 * import com.pulumi.databricks.DbfsFileArgs;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var appDbfsFile = new DbfsFile(&#34;appDbfsFile&#34;, DbfsFileArgs.builder()        
 *             .source(String.format(&#34;%s/app-0.0.1.jar&#34;, path.module()))
 *             .path(&#34;/FileStore/app-0.0.1.jar&#34;)
 *             .build());
 * 
 *         var appLibrary = new Library(&#34;appLibrary&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .jar(appDbfsFile.dbfsPath())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Java/Scala Maven
 * 
 * Installing artifacts from Maven repository. You can also optionally specify a `repo` parameter for a custom Maven-style repository, that should be accessible without any authentication. Maven libraries are resolved in Databricks Control Plane, so repo should be accessible from it. It can even be properly configured [maven s3 wagon](https://github.com/seahen/maven-s3-wagon), [AWS CodeArtifact](https://aws.amazon.com/codeartifact/) or [Azure Artifacts](https://azure.microsoft.com/en-us/services/devops/artifacts/).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryMavenArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var deequ = new Library(&#34;deequ&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .maven(LibraryMavenArgs.builder()
 *                 .coordinates(&#34;com.amazon.deequ:deequ:1.0.4&#34;)
 *                 .exclusions(&#34;org.apache.avro:avro&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Python Wheel
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DbfsFile;
 * import com.pulumi.databricks.DbfsFileArgs;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var appDbfsFile = new DbfsFile(&#34;appDbfsFile&#34;, DbfsFileArgs.builder()        
 *             .source(String.format(&#34;%s/baz.whl&#34;, path.module()))
 *             .path(&#34;/FileStore/baz.whl&#34;)
 *             .build());
 * 
 *         var appLibrary = new Library(&#34;appLibrary&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .whl(appDbfsFile.dbfsPath())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Python PyPI
 * 
 * Installing Python PyPI artifacts. You can optionally also specify the `repo` parameter for a custom PyPI mirror, which should be accessible without any authentication for the network that cluster runs in.
 * 
 * &gt; **Note** `repo` host should be accessible from the Internet by Databricks control plane. If connectivity to custom PyPI repositories is required, please modify cluster-node `/etc/pip.conf` through databricks_global_init_script.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryPypiArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var fbprophet = new Library(&#34;fbprophet&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .pypi(LibraryPypiArgs.builder()
 *                 .package_(&#34;fbprophet==0.6&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Python EGG
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DbfsFile;
 * import com.pulumi.databricks.DbfsFileArgs;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var appDbfsFile = new DbfsFile(&#34;appDbfsFile&#34;, DbfsFileArgs.builder()        
 *             .source(String.format(&#34;%s/foo.egg&#34;, path.module()))
 *             .path(&#34;/FileStore/foo.egg&#34;)
 *             .build());
 * 
 *         var appLibrary = new Library(&#34;appLibrary&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .egg(appDbfsFile.dbfsPath())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## R CRan
 * 
 * Installing artifacts from CRan. You can also optionally specify a `repo` parameter for a custom cran mirror.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Library;
 * import com.pulumi.databricks.LibraryArgs;
 * import com.pulumi.databricks.inputs.LibraryCranArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var rkeops = new Library(&#34;rkeops&#34;, LibraryArgs.builder()        
 *             .clusterId(databricks_cluster.this().id())
 *             .cran(LibraryCranArgs.builder()
 *                 .package_(&#34;rkeops&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * End to end workspace management guide.
 * * databricks.getClusters data to retrieve a list of databricks.Cluster ids.
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.ClusterPolicy to create a databricks.Cluster policy, which limits the ability to create clusters based on a set of rules.
 * * databricks.DbfsFile data to get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.getDbfsFilePaths data to get list of file names from get file content from [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.DbfsFile to manage relatively small files on [Databricks File System (DBFS)](https://docs.databricks.com/data/databricks-file-system.html).
 * * databricks.GlobalInitScript to manage [global init scripts](https://docs.databricks.com/clusters/init-scripts.html#global-init-scripts), which are run on all databricks.Cluster and databricks_job.
 * * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
 * * databricks.Mount to [mount your cloud storage](https://docs.databricks.com/data/databricks-file-system.html#mount-object-storage-to-dbfs) on `dbfs:/mnt/name`.
 * * databricks.Pipeline to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
 * * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
 * 
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/library:Library")
public class Library extends com.pulumi.resources.CustomResource {
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    public Output<String> clusterId() {
        return this.clusterId;
    }
    @Export(name="cran", type=LibraryCran.class, parameters={})
    private Output</* @Nullable */ LibraryCran> cran;

    public Output<Optional<LibraryCran>> cran() {
        return Codegen.optional(this.cran);
    }
    @Export(name="egg", type=String.class, parameters={})
    private Output</* @Nullable */ String> egg;

    public Output<Optional<String>> egg() {
        return Codegen.optional(this.egg);
    }
    @Export(name="jar", type=String.class, parameters={})
    private Output</* @Nullable */ String> jar;

    public Output<Optional<String>> jar() {
        return Codegen.optional(this.jar);
    }
    @Export(name="maven", type=LibraryMaven.class, parameters={})
    private Output</* @Nullable */ LibraryMaven> maven;

    public Output<Optional<LibraryMaven>> maven() {
        return Codegen.optional(this.maven);
    }
    @Export(name="pypi", type=LibraryPypi.class, parameters={})
    private Output</* @Nullable */ LibraryPypi> pypi;

    public Output<Optional<LibraryPypi>> pypi() {
        return Codegen.optional(this.pypi);
    }
    @Export(name="whl", type=String.class, parameters={})
    private Output</* @Nullable */ String> whl;

    public Output<Optional<String>> whl() {
        return Codegen.optional(this.whl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Library(String name) {
        this(name, LibraryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Library(String name, LibraryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Library(String name, LibraryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/library:Library", name, args == null ? LibraryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Library(String name, Output<String> id, @Nullable LibraryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/library:Library", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Library get(String name, Output<String> id, @Nullable LibraryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Library(name, id, state, options);
    }
}
