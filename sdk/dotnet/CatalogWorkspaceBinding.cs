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
    ///     var sandboxCatalog = new Databricks.Catalog("sandboxCatalog", new()
    ///     {
    ///         IsolationMode = "ISOLATED",
    ///     });
    /// 
    ///     var sandboxCatalogWorkspaceBinding = new Databricks.CatalogWorkspaceBinding("sandboxCatalogWorkspaceBinding", new()
    ///     {
    ///         CatalogName = sandboxCatalog.Name,
    ///         WorkspaceId = databricks_mws_workspaces.Other.Workspace_id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// -&gt; **Note** Importing this resource is not currently supported.
    /// </summary>
    [DatabricksResourceType("databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding")]
    public partial class CatalogWorkspaceBinding : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of Catalog. Change forces creation of a new resource.
        /// </summary>
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        /// <summary>
        /// ID of the workspace. Change forces creation of a new resource.
        /// </summary>
        [Output("workspaceId")]
        public Output<string> WorkspaceId { get; private set; } = null!;


        /// <summary>
        /// Create a CatalogWorkspaceBinding resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CatalogWorkspaceBinding(string name, CatalogWorkspaceBindingArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding", name, args ?? new CatalogWorkspaceBindingArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CatalogWorkspaceBinding(string name, Input<string> id, CatalogWorkspaceBindingState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/catalogWorkspaceBinding:CatalogWorkspaceBinding", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CatalogWorkspaceBinding resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CatalogWorkspaceBinding Get(string name, Input<string> id, CatalogWorkspaceBindingState? state = null, CustomResourceOptions? options = null)
        {
            return new CatalogWorkspaceBinding(name, id, state, options);
        }
    }

    public sealed class CatalogWorkspaceBindingArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        /// <summary>
        /// ID of the workspace. Change forces creation of a new resource.
        /// </summary>
        [Input("workspaceId", required: true)]
        public Input<string> WorkspaceId { get; set; } = null!;

        public CatalogWorkspaceBindingArgs()
        {
        }
        public static new CatalogWorkspaceBindingArgs Empty => new CatalogWorkspaceBindingArgs();
    }

    public sealed class CatalogWorkspaceBindingState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of Catalog. Change forces creation of a new resource.
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        /// <summary>
        /// ID of the workspace. Change forces creation of a new resource.
        /// </summary>
        [Input("workspaceId")]
        public Input<string>? WorkspaceId { get; set; }

        public CatalogWorkspaceBindingState()
        {
        }
        public static new CatalogWorkspaceBindingState Empty => new CatalogWorkspaceBindingState();
    }
}
