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
    /// This resource allows you to create [MLflow models](https://docs.databricks.com/applications/mlflow/models.html) in Databricks.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var test = new Databricks.MlflowModel("test", new()
    ///     {
    ///         Description = "My MLflow model description",
    ///         Tags = new[]
    ///         {
    ///             new Databricks.Inputs.MlflowModelTagArgs
    ///             {
    ///                 Key = "key1",
    ///                 Value = "value1",
    ///             },
    ///             new Databricks.Inputs.MlflowModelTagArgs
    ///             {
    ///                 Key = "key2",
    ///                 Value = "value2",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ## Access Control
    /// 
    /// * databricks.Permissions can control which groups or individual users can *Read*, *Edit*, *Manage Staging Versions*, *Manage Production Versions*, and *Manage* individual models.
    /// 
    /// ## Related Resources
    /// 
    /// The following resources are often used in the same context:
    /// 
    /// * End to end workspace management guide.
    /// * databricks.ModelServing to serve this model on a Databricks serving endpoint.
    /// * databricks.Directory to manage directories in [Databricks Workspace](https://docs.databricks.com/workspace/workspace-objects.html).
    /// * databricks.MlflowExperiment to manage [MLflow experiments](https://docs.databricks.com/data/data-sources/mlflow-experiment.html) in Databricks.
    /// * databricks.Notebook to manage [Databricks Notebooks](https://docs.databricks.com/notebooks/index.html).
    /// * databricks.Notebook data to export a notebook from Databricks Workspace.
    /// * databricks.Repo to manage [Databricks Repos](https://docs.databricks.com/repos.html).
    /// 
    /// ## Import
    /// 
    /// The model resource can be imported using the name bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/mlflowModel:MlflowModel this &lt;name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/mlflowModel:MlflowModel")]
    public partial class MlflowModel : global::Pulumi.CustomResource
    {
        [Output("creationTimestamp")]
        public Output<int?> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// The description of the MLflow model.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("lastUpdatedTimestamp")]
        public Output<int?> LastUpdatedTimestamp { get; private set; } = null!;

        /// <summary>
        /// Name of MLflow model. Change of name triggers new resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Tags for the MLflow model.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.MlflowModelTag>> Tags { get; private set; } = null!;

        [Output("userId")]
        public Output<string?> UserId { get; private set; } = null!;


        /// <summary>
        /// Create a MlflowModel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MlflowModel(string name, MlflowModelArgs? args = null, CustomResourceOptions? options = null)
            : base("databricks:index/mlflowModel:MlflowModel", name, args ?? new MlflowModelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MlflowModel(string name, Input<string> id, MlflowModelState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/mlflowModel:MlflowModel", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MlflowModel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MlflowModel Get(string name, Input<string> id, MlflowModelState? state = null, CustomResourceOptions? options = null)
        {
            return new MlflowModel(name, id, state, options);
        }
    }

    public sealed class MlflowModelArgs : global::Pulumi.ResourceArgs
    {
        [Input("creationTimestamp")]
        public Input<int>? CreationTimestamp { get; set; }

        /// <summary>
        /// The description of the MLflow model.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("lastUpdatedTimestamp")]
        public Input<int>? LastUpdatedTimestamp { get; set; }

        /// <summary>
        /// Name of MLflow model. Change of name triggers new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.MlflowModelTagArgs>? _tags;

        /// <summary>
        /// Tags for the MLflow model.
        /// </summary>
        public InputList<Inputs.MlflowModelTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MlflowModelTagArgs>());
            set => _tags = value;
        }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MlflowModelArgs()
        {
        }
        public static new MlflowModelArgs Empty => new MlflowModelArgs();
    }

    public sealed class MlflowModelState : global::Pulumi.ResourceArgs
    {
        [Input("creationTimestamp")]
        public Input<int>? CreationTimestamp { get; set; }

        /// <summary>
        /// The description of the MLflow model.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("lastUpdatedTimestamp")]
        public Input<int>? LastUpdatedTimestamp { get; set; }

        /// <summary>
        /// Name of MLflow model. Change of name triggers new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputList<Inputs.MlflowModelTagGetArgs>? _tags;

        /// <summary>
        /// Tags for the MLflow model.
        /// </summary>
        public InputList<Inputs.MlflowModelTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.MlflowModelTagGetArgs>());
            set => _tags = value;
        }

        [Input("userId")]
        public Input<string>? UserId { get; set; }

        public MlflowModelState()
        {
        }
        public static new MlflowModelState Empty => new MlflowModelState();
    }
}
