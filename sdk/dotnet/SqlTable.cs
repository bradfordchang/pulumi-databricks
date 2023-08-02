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
    /// Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, databases (also called schemas), and tables / views.
    /// 
    /// A `databricks.SqlTable` is contained within databricks_schema, and can represent either a managed table, an external table or a view.
    /// 
    /// This resource creates and updates the Unity Catalog table/view by executing the necessary SQL queries on a special auto-terminating cluster it would create for this operation.
    /// 
    /// ## Import
    /// 
    /// This resource can be imported by its full namebash
    /// 
    /// ```sh
    ///  $ pulumi import databricks:index/sqlTable:SqlTable this &lt;catalog_name&gt;.&lt;schema_name&gt;.&lt;name&gt;
    /// ```
    /// </summary>
    [DatabricksResourceType("databricks:index/sqlTable:SqlTable")]
    public partial class SqlTable : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Output("catalogName")]
        public Output<string> CatalogName { get; private set; } = null!;

        [Output("clusterId")]
        public Output<string> ClusterId { get; private set; } = null!;

        [Output("columns")]
        public Output<ImmutableArray<Outputs.SqlTableColumn>> Columns { get; private set; } = null!;

        /// <summary>
        /// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
        /// </summary>
        [Output("dataSourceFormat")]
        public Output<string?> DataSourceFormat { get; private set; } = null!;

        /// <summary>
        /// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Extensible Table properties.
        /// </summary>
        [Output("properties")]
        public Output<ImmutableDictionary<string, object>> Properties { get; private set; } = null!;

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
        /// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
        /// </summary>
        [Output("storageLocation")]
        public Output<string?> StorageLocation { get; private set; } = null!;

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
        /// </summary>
        [Output("tableType")]
        public Output<string> TableType { get; private set; } = null!;

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
        /// </summary>
        [Output("viewDefinition")]
        public Output<string?> ViewDefinition { get; private set; } = null!;


        /// <summary>
        /// Create a SqlTable resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SqlTable(string name, SqlTableArgs args, CustomResourceOptions? options = null)
            : base("databricks:index/sqlTable:SqlTable", name, args ?? new SqlTableArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SqlTable(string name, Input<string> id, SqlTableState? state = null, CustomResourceOptions? options = null)
            : base("databricks:index/sqlTable:SqlTable", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SqlTable resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SqlTable Get(string name, Input<string> id, SqlTableState? state = null, CustomResourceOptions? options = null)
        {
            return new SqlTable(name, id, state, options);
        }
    }

    public sealed class SqlTableArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Input("catalogName", required: true)]
        public Input<string> CatalogName { get; set; } = null!;

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("columns")]
        private InputList<Inputs.SqlTableColumnArgs>? _columns;
        public InputList<Inputs.SqlTableColumnArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.SqlTableColumnArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
        /// </summary>
        [Input("dataSourceFormat")]
        public Input<string>? DataSourceFormat { get; set; }

        /// <summary>
        /// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
        /// </summary>
        [Input("tableType", required: true)]
        public Input<string> TableType { get; set; } = null!;

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
        /// </summary>
        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public SqlTableArgs()
        {
        }
        public static new SqlTableArgs Empty => new SqlTableArgs();
    }

    public sealed class SqlTableState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of parent catalog
        /// </summary>
        [Input("catalogName")]
        public Input<string>? CatalogName { get; set; }

        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("columns")]
        private InputList<Inputs.SqlTableColumnGetArgs>? _columns;
        public InputList<Inputs.SqlTableColumnGetArgs> Columns
        {
            get => _columns ?? (_columns = new InputList<Inputs.SqlTableColumnGetArgs>());
            set => _columns = value;
        }

        /// <summary>
        /// User-supplied free-form text. Changing comment is not currently supported on `VIEW` table_type.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`. Change forces creation of a new resource. Not supported for `MANAGED` tables or `VIEW`.
        /// </summary>
        [Input("dataSourceFormat")]
        public Input<string>? DataSourceFormat { get; set; }

        /// <summary>
        /// Name of table relative to parent catalog and schema. Change forces creation of a new resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

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
        /// URL of storage location for Table data (required for EXTERNAL Tables). Not supported for `VIEW` or `MANAGED` table_type.
        /// </summary>
        [Input("storageLocation")]
        public Input<string>? StorageLocation { get; set; }

        /// <summary>
        /// Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`. Change forces creation of a new resource.
        /// </summary>
        [Input("tableType")]
        public Input<string>? TableType { get; set; }

        /// <summary>
        /// SQL text defining the view (for `table_type == "VIEW"`). Not supported for `MANAGED` or `EXTERNAL` table_type.
        /// </summary>
        [Input("viewDefinition")]
        public Input<string>? ViewDefinition { get; set; }

        public SqlTableState()
        {
        }
        public static new SqlTableState Empty => new SqlTableState();
    }
}
