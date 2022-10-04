// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    /// <summary>
    /// Use `databricks.Pipeline` to deploy [Delta Live Tables](https://docs.databricks.com/data-engineering/delta-live-tables/index.html).
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dltDemo = new Databricks.Notebook("dltDemo");
    /// 
    ///     //...
    ///     var @this = new Databricks.Pipeline("this", new()
    ///     {
    ///         Storage = "/test/first-pipeline",
    ///         Configuration = 
    ///         {
    ///             { "key1", "value1" },
    ///             { "key2", "value2" },
    ///         },
    ///         Clusters = new[]
    ///         {
    ///             new Databricks.Inputs.PipelineClusterArgs
    ///             {
    ///                 Label = "default",
    ///                 NumWorkers = 2,
    ///                 CustomTags = 
    ///                 {
    ///                     { "cluster_type", "default" },
    ///                 },
    ///             },
    ///             new Databricks.Inputs.PipelineClusterArgs
    ///             {
    ///                 Label = "maintenance",
    ///                 NumWorkers = 1,
    ///                 CustomTags = 
    ///                 {
    ///                     { "cluster_type", "maintenance" },
    ///                 },
    ///             },
    ///         },
    ///         Libraries = new[]
    ///         {
    ///             new Databricks.Inputs.PipelineLibraryArgs
    ///             {
    ///                 Notebook = new Databricks.Inputs.PipelineLibraryNotebookArgs
    ///                 {
    ///                     Path = dltDemo.Id,
    ///                 },
    ///             },
    ///         },
    ///         Continuous = false,
    ///     });
    /// 
    /// });
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
    /// * databricks.Job to manage [Databricks Jobs](https://docs.databricks.com/jobs.html) to run non-interactive code in a databricks_cluster.
    /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    /// 
    /// ## Import
    /// 
    /// The resource job can be imported using the id of the pipeline bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/pipeline:Pipeline this &lt;pipeline-id&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/pipeline:Pipeline")]
    public partial class Pipeline : global::Pulumi.CustomResource
    {
        [Output("allowDuplicateNames")]
        public Output<bool?> AllowDuplicateNames { get; private set; } = null!;

        /// <summary>
        /// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
        /// </summary>
        [Output("channel")]
        public Output<string?> Channel { get; private set; } = null!;

        /// <summary>
        /// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
        /// </summary>
        [Output("clusters")]
        public Output<ImmutableArray<Outputs.PipelineCluster>> Clusters { get; private set; } = null!;

        /// <summary>
        /// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
        /// </summary>
        [Output("configuration")]
        public Output<ImmutableDictionary<string, object>?> Configuration { get; private set; } = null!;

        /// <summary>
        /// A flag indicating whether to run the pipeline continuously. The default value is `false`.
        /// </summary>
        [Output("continuous")]
        public Output<bool?> Continuous { get; private set; } = null!;

        /// <summary>
        /// A flag indicating whether to run the pipeline in development mode. The default value is `false`.
        /// </summary>
        [Output("development")]
        public Output<bool?> Development { get; private set; } = null!;

        /// <summary>
        /// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
        /// </summary>
        [Output("edition")]
        public Output<string?> Edition { get; private set; } = null!;

        [Output("filters")]
        public Output<Outputs.PipelineFilters?> Filters { get; private set; } = null!;

        /// <summary>
        /// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
        /// </summary>
        [Output("libraries")]
        public Output<ImmutableArray<Outputs.PipelineLibrary>> Libraries { get; private set; } = null!;

        /// <summary>
        /// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A flag indicating whether to use Photon engine. The default value is `false`.
        /// </summary>
        [Output("photon")]
        public Output<bool?> Photon { get; private set; } = null!;

        /// <summary>
        /// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
        /// </summary>
        [Output("storage")]
        public Output<string?> Storage { get; private set; } = null!;

        /// <summary>
        /// The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
        /// </summary>
        [Output("target")]
        public Output<string?> Target { get; private set; } = null!;

        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Pipeline resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Pipeline(string name, PipelineArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/pipeline:Pipeline", name, args ?? new PipelineArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Pipeline(string name, Input<string> id, PipelineState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/pipeline:Pipeline", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Pipeline resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Pipeline Get(string name, Input<string> id, PipelineState? state = null, CustomResourceOptions? options = null)
        {
            return new Pipeline(name, id, state, options);
        }
    }

    public sealed class PipelineArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowDuplicateNames")]
        public Input<bool>? AllowDuplicateNames { get; set; }

        /// <summary>
        /// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("clusters")]
        private InputList<Inputs.PipelineClusterArgs>? _clusters;

        /// <summary>
        /// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
        /// </summary>
        public InputList<Inputs.PipelineClusterArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.PipelineClusterArgs>());
            set => _clusters = value;
        }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// A flag indicating whether to run the pipeline continuously. The default value is `false`.
        /// </summary>
        [Input("continuous")]
        public Input<bool>? Continuous { get; set; }

        /// <summary>
        /// A flag indicating whether to run the pipeline in development mode. The default value is `false`.
        /// </summary>
        [Input("development")]
        public Input<bool>? Development { get; set; }

        /// <summary>
        /// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        [Input("filters")]
        public Input<Inputs.PipelineFiltersArgs>? Filters { get; set; }

        [Input("libraries")]
        private InputList<Inputs.PipelineLibraryArgs>? _libraries;

        /// <summary>
        /// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
        /// </summary>
        public InputList<Inputs.PipelineLibraryArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.PipelineLibraryArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A flag indicating whether to use Photon engine. The default value is `false`.
        /// </summary>
        [Input("photon")]
        public Input<bool>? Photon { get; set; }

        /// <summary>
        /// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
        /// </summary>
        [Input("storage")]
        public Input<string>? Storage { get; set; }

        /// <summary>
        /// The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        public PipelineArgs()
        {
        }
        public static new PipelineArgs Empty => new PipelineArgs();
    }

    public sealed class PipelineState : global::Pulumi.ResourceArgs
    {
        [Input("allowDuplicateNames")]
        public Input<bool>? AllowDuplicateNames { get; set; }

        /// <summary>
        /// optional name of the release channel for Spark version used by DLT pipeline.  Supported values are: `current` (default) and `preview`.
        /// </summary>
        [Input("channel")]
        public Input<string>? Channel { get; set; }

        [Input("clusters")]
        private InputList<Inputs.PipelineClusterGetArgs>? _clusters;

        /// <summary>
        /// blocks - Clusters to run the pipeline. If none is specified, pipelines will automatically select a default cluster configuration for the pipeline. *Please note that DLT pipeline clusters are supporting only subset of attributes as described in [documentation](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-api-guide.html#pipelinesnewcluster).*  Also, note that `autoscale` block is extended with the `mode` parameter that controls the autoscaling algorithm (possible values are `ENHANCED` for new, enhanced autoscaling algorithm, or `LEGACY` for old algorithm).
        /// </summary>
        public InputList<Inputs.PipelineClusterGetArgs> Clusters
        {
            get => _clusters ?? (_clusters = new InputList<Inputs.PipelineClusterGetArgs>());
            set => _clusters = value;
        }

        [Input("configuration")]
        private InputMap<object>? _configuration;

        /// <summary>
        /// An optional list of values to apply to the entire pipeline. Elements must be formatted as key:value pairs.
        /// </summary>
        public InputMap<object> Configuration
        {
            get => _configuration ?? (_configuration = new InputMap<object>());
            set => _configuration = value;
        }

        /// <summary>
        /// A flag indicating whether to run the pipeline continuously. The default value is `false`.
        /// </summary>
        [Input("continuous")]
        public Input<bool>? Continuous { get; set; }

        /// <summary>
        /// A flag indicating whether to run the pipeline in development mode. The default value is `false`.
        /// </summary>
        [Input("development")]
        public Input<bool>? Development { get; set; }

        /// <summary>
        /// optional name of the [product edition](https://docs.databricks.com/data-engineering/delta-live-tables/delta-live-tables-concepts.html#editions). Supported values are: `core`, `pro`, `advanced` (default).
        /// </summary>
        [Input("edition")]
        public Input<string>? Edition { get; set; }

        [Input("filters")]
        public Input<Inputs.PipelineFiltersGetArgs>? Filters { get; set; }

        [Input("libraries")]
        private InputList<Inputs.PipelineLibraryGetArgs>? _libraries;

        /// <summary>
        /// blocks - Specifies pipeline code and required artifacts. Syntax resembles library configuration block with the addition of a special `notebook` type of library that should have the `path` attribute. *Right now only the `notebook` type is supported.*
        /// </summary>
        public InputList<Inputs.PipelineLibraryGetArgs> Libraries
        {
            get => _libraries ?? (_libraries = new InputList<Inputs.PipelineLibraryGetArgs>());
            set => _libraries = value;
        }

        /// <summary>
        /// A user-friendly name for this pipeline. The name can be used to identify pipeline jobs in the UI.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A flag indicating whether to use Photon engine. The default value is `false`.
        /// </summary>
        [Input("photon")]
        public Input<bool>? Photon { get; set; }

        /// <summary>
        /// A location on DBFS or cloud storage where output data and metadata required for pipeline execution are stored. By default, tables are stored in a subdirectory of this location. *Change of this parameter forces recreation of the pipeline.*
        /// </summary>
        [Input("storage")]
        public Input<string>? Storage { get; set; }

        /// <summary>
        /// The name of a database for persisting pipeline output data. Configuring the target setting allows you to view and query the pipeline output data from the Databricks UI.
        /// </summary>
        [Input("target")]
        public Input<string>? Target { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public PipelineState()
        {
        }
        public static new PipelineState Empty => new PipelineState();
    }
}
