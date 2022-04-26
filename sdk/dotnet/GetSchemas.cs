// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetSchemas
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Listing all schemas in a _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sandbox = Output.Create(Databricks.GetSchemas.InvokeAsync(new Databricks.GetSchemasArgs
        ///         {
        ///             CatalogName = "sandbox",
        ///         }));
        ///         this.AllSandboxSchemas = sandbox;
        ///     }
        /// 
        ///     [Output("allSandboxSchemas")]
        ///     public Output&lt;string&gt; AllSandboxSchemas { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Table to manage tables within Unity Catalog.
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetSchemasResult> InvokeAsync(GetSchemasArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetSchemasResult>("databricks:index/getSchemas:getSchemas", args ?? new GetSchemasArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Listing all schemas in a _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var sandbox = Output.Create(Databricks.GetSchemas.InvokeAsync(new Databricks.GetSchemasArgs
        ///         {
        ///             CatalogName = "sandbox",
        ///         }));
        ///         this.AllSandboxSchemas = sandbox;
        ///     }
        /// 
        ///     [Output("allSandboxSchemas")]
        ///     public Output&lt;string&gt; AllSandboxSchemas { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Table to manage tables within Unity Catalog.
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetSchemasResult> Invoke(GetSchemasInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetSchemasResult>("databricks:index/getSchemas:getSchemas", args ?? new GetSchemasInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSchemasArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public string CatalogName { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// set of databricks.Schema full names: *`catalog`.`schema`*
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        public GetSchemasArgs()
        {
        }
    }

    public sealed class GetSchemasInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// set of databricks.Schema full names: *`catalog`.`schema`*
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        public GetSchemasInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetSchemasResult
    {
        public readonly string CatalogName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// set of databricks.Schema full names: *`catalog`.`schema`*
        /// </summary>
        public readonly ImmutableArray<string> Ids;

        [OutputConstructor]
        private GetSchemasResult(
            string catalogName,

            string id,

            ImmutableArray<string> ids)
        {
            CatalogName = catalogName;
            Id = id;
            Ids = ids;
        }
    }
}