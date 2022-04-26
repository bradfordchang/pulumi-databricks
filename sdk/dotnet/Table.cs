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
    /// &gt; **Private Preview** This feature is in [Private Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.
    /// 
    /// Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, databases (also called schemas), and tables / views.
    /// 
    /// &gt; **Note** This resource has an evolving API, which will change in the upcoming versions of the provider in order to simplify user experience.
    /// 
    /// A `databricks.Table` is contained within databricks_schema.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Databricks = Pulumi.Databricks;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var sandbox = new Databricks.Catalog("sandbox", new Databricks.CatalogArgs
    ///         {
    ///             MetastoreId = databricks_metastore.This.Id,
    ///             Comment = "this catalog is managed by terraform",
    ///             Properties = 
    ///             {
    ///                 { "purpose", "testing" },
    ///             },
    ///         });
    ///         var things = new Databricks.Schema("things", new Databricks.SchemaArgs
    ///         {
    ///             CatalogName = sandbox.Id,
    ///             Comment = "this database is managed by terraform",
    ///             Properties = 
    ///             {
    ///                 { "kind", "various" },
    ///             },
    ///         });
    ///         var thing = new Databricks.Table("thing", new Databricks.TableArgs
    ///         {
    ///             CatalogName = sandbox.Id,
    ///             SchemaName = things.Name,
    ///             TableType = "MANAGED",
    ///             DataSourceFormat = "DELTA",
    ///             Columns = 
    ///             {
    ///                 new Databricks.Inputs.TableColumnArgs
    ///                 {
    ///                     Name = "id",
    ///                     Position = 0,
    ///                     TypeName = "INT",
    ///                     TypeText = "int",
    ///                     TypeJson = "{\"name\":\"id\",\"type\":\"integer\",\"nullable\":true,\"metadata\":{}}",
    ///                 },
    ///                 new Databricks.Inputs.TableColumnArgs
    ///                 {
    ///                     Name = "name",
    ///                     Position = 1,
    ///                     TypeName = "STRING",
    ///                     TypeText = "varchar(64)",
    ///                     TypeJson = "{\"name\":\"name\",\"type\":\"varchar(64)\",\"nullable\":true,\"metadata\":{}}",
    ///                 },
    ///             },
    ///             Comment = "this table is managed by terraform",
    ///         }, new CustomResourceOptions
    ///         {
    ///             Provider = databricks.Workspace,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ## Related Resources
    /// 
    /// The following resources are used in the same context:
    /// 
    /// * databricks.Table data to list tables within Unity Catalog.
    /// * databricks.Schema data to list schemas within Unity Catalog.
    /// * databricks.Catalog data to list catalogs within Unity Catalog.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by full name*`catalog`.`schema`.`table`*bash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/table:Table this &lt;full-name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/table:Table")]
    public partial class Table : Pulumi.CustomResource
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        [Output("columns")]
        public Output<ImmutableArray<Outputs.TableColumn>> Columns { get; private set; } = null!;

        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`
        /// </summary>
        [Output("dataSourceFormat")]
        public Output<string> DataSourceFormat { get; private set; } = null!;

        /// <summary>
        /// User-visible name of column
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Username/groupname of Table owner. Currently this field can only be changed after the resource is created.
        /// </summary>
        [Output("owner")]
        public Output<string> Owner { get; private set; } = null!;

        /// <summary>
        /// Extensible Table properties.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, object>?> Properties { get; private set; } = null!;

        /// <summary>
        /// Name of parent Schema relative to parent Catalog
        /// </summary>
        [Output("schemaName")]
        public Output<string> SchemaName { get; private set; } = null!;

        /// <summary>
        /// For EXTERNAL Tables only: the name of storage credential to use. This cannot be updated
        /// </summary>
        [Output("storageCredentialName")]
        public Output<string?> StorageCredentialName { get; private set; } = null!;

        /// <summary>
        /// URL of storage location for Table data (required for EXTERNAL Tables. For Managed Tables, if the path is provided it needs to be a Staging Table path that has been generated through the Staging Table API, otherwise should be empty)
        /// </summary>
        [Output("storageLocation")]
        public Output<string?> StorageLocation { get; private set; } = null!;

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`
        /// </summary>
        [Output("tableType")]
        public Output<string> TableType { get; private set; } = null!;

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`)
        /// </summary>
        [Output("viewDefinition")]
        public Output<string?> ViewDefinition { get; private set; } = null!;


        /// <summary>
        /// Create a Table resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Table(string name, TableArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/table:Table", name, args ?? new TableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Table(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/table:Table", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Table resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Table Get(string name, Input<string> id, TableState? state = null, CustomResourceOptions? options = null)
        {
            return new Table(name, id, state, options);
        }
    }

    public sealed class TableArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("columns", required: true)]
        private InputList<Inputs.TableColumnArgs>? _columns;
        public InputList<Inputs.TableColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.TableColumnArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`
        /// </summary>
        [Input("dataSourceFormat", required: true)]
        public Input<string> DataSourceFormat { get; set; } = null!;

        /// <summary>
        /// User-visible name of column
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname of Table owner. Currently this field can only be changed after the resource is created.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Extensible Table properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        /// <summary>
        /// Name of parent Schema relative to parent Catalog
        /// </summary>
        [Input("schemaName", required: true)]
        public Input<string> SchemaName { get; set; } = null!;

        /// <summary>
        /// For EXTERNAL Tables only: the name of storage credential to use. This cannot be updated
        /// </summary>
        [Input("storageCredentialName")]
        public Input<string>? StorageCredentialName { get; set; }

        /// <summary>
        /// URL of storage location for Table data (required for EXTERNAL Tables. For Managed Tables, if the path is provided it needs to be a Staging Table path that has been generated through the Staging Table API, otherwise should be empty)
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`
        /// </summary>
        [Input("tableType", required: true)]
        public Input<string> TableType { get; set; } = null!;

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`)
        /// </summary>
        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public TableArgs()
        {
        }
    }

    public sealed class TableState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        [Input("columns")]
        private InputList<Inputs.TableColumnGetArgs>? _columns;
        public InputList<Inputs.TableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.TableColumnGetArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// User-supplied free-form text.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`
        /// </summary>
        [Input("dataSourceFormat")]
        public Input<string>? DataSourceFormat { get; set; }

        /// <summary>
        /// User-visible name of column
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Username/groupname of Table owner. Currently this field can only be changed after the resource is created.
        /// </summary>
        [Input("owner")]
        public Input<string>? Owner { get; set; }

        [Input("properties")]
        private InputMap<object>? _properties;

        /// <summary>
        /// Extensible Table properties.
        /// </summary>
        public InputMap<object> Properties
        {
            get => _properties ?? (_properties = new InputMap<object>());
            set => _properties = value;
        }

        /// <summary>
        /// Name of parent Schema relative to parent Catalog
        /// </summary>
        [Input("schemaName")]
        public Input<string>? SchemaName { get; set; }

        /// <summary>
        /// For EXTERNAL Tables only: the name of storage credential to use. This cannot be updated
        /// </summary>
        [Input("storageCredentialName")]
        public Input<string>? StorageCredentialName { get; set; }

        /// <summary>
        /// URL of storage location for Table data (required for EXTERNAL Tables. For Managed Tables, if the path is provided it needs to be a Staging Table path that has been generated through the Staging Table API, otherwise should be empty)
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`
        /// </summary>
        [Input("tableType")]
        public Input<string>? TableType { get; set; }

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`)
        /// </summary>
        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public TableState()
        {
        }
    }
}