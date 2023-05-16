// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks
{
    public static class GetTables
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Granting `SELECT` and `MODIFY` to `sensitive` group on all tables a _things_ databricks.Schema from _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using System.Threading.Tasks;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(async() =&gt; 
        /// {
        ///     var thingsTables = await Databricks.GetTables.InvokeAsync(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///         SchemaName = "things",
        ///     });
        /// 
        ///     var thingsGrants = new List&lt;Databricks.Grants&gt;();
        ///     foreach (var range in )
        ///     {
        ///         thingsGrants.Add(new Databricks.Grants($"thingsGrants-{range.Key}", new()
        ///         {
        ///             Table = range.Value,
        ///             GrantDetails = new[]
        ///             {
        ///                 new Databricks.Inputs.GrantsGrantArgs
        ///                 {
        ///                     Principal = "sensitive",
        ///                     Privileges = new[]
        ///                     {
        ///                         "SELECT",
        ///                         "MODIFY",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Task<GetTablesResult> InvokeAsync(GetTablesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTablesResult>("databricks:index/getTables:getTables", args ?? new GetTablesArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Granting `SELECT` and `MODIFY` to `sensitive` group on all tables a _things_ databricks.Schema from _sandbox_ databricks_catalog:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using System.Threading.Tasks;
        /// using Pulumi;
        /// using Databricks = Pulumi.Databricks;
        /// 
        /// return await Deployment.RunAsync(async() =&gt; 
        /// {
        ///     var thingsTables = await Databricks.GetTables.InvokeAsync(new()
        ///     {
        ///         CatalogName = "sandbox",
        ///         SchemaName = "things",
        ///     });
        /// 
        ///     var thingsGrants = new List&lt;Databricks.Grants&gt;();
        ///     foreach (var range in )
        ///     {
        ///         thingsGrants.Add(new Databricks.Grants($"thingsGrants-{range.Key}", new()
        ///         {
        ///             Table = range.Value,
        ///             GrantDetails = new[]
        ///             {
        ///                 new Databricks.Inputs.GrantsGrantArgs
        ///                 {
        ///                     Principal = "sensitive",
        ///                     Privileges = new[]
        ///                     {
        ///                         "SELECT",
        ///                         "MODIFY",
        ///                     },
        ///                 },
        ///             },
        ///         }));
        ///     }
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Related Resources
        /// 
        /// The following resources are used in the same context:
        /// 
        /// * databricks.Schema to manage schemas within Unity Catalog.
        /// * databricks.Catalog to manage catalogs within Unity Catalog.
        /// </summary>
        public static Output<GetTablesResult> Invoke(GetTablesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTablesResult>("databricks:index/getTables:getTables", args ?? new GetTablesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTablesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public string CatalogName { get; set; } = null!;

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// set of databricks.Table full names: *`catalog`.`schema`.`table`*
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Name of databricks_schema
        /// </summary>
        [Input("schemaName", required: true)]
        public string SchemaName { get; set; } = null!;

        public GetTablesArgs()
        {
        }
        public static new GetTablesArgs Empty => new GetTablesArgs();
    }

    public sealed class GetTablesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of databricks_catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// set of databricks.Table full names: *`catalog`.`schema`.`table`*
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// Name of databricks_schema
        /// </summary>
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        public GetTablesInvokeArgs()
        {
        }
        public static new GetTablesInvokeArgs Empty => new GetTablesInvokeArgs();
    }


    [OutputType]
    public sealed class GetTablesResult
    {
        public readonly string CatalogName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// set of databricks.Table full names: *`catalog`.`schema`.`table`*
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly string SchemaName;

        [OutputConstructor]
        private GetTablesResult(
            string catalogName,

            string id,

            ImmutableArray<string> ids,

            string schemaName)
        {
            CatalogName = catalogName;
            Id = id;
            Ids = ids;
            SchemaName = schemaName;
        }
    }
}
