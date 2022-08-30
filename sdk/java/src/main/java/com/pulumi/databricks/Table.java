// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.TableArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.TableState;
import com.pulumi.databricks.outputs.TableColumn;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * &gt; **Public Preview** This feature is in [Public Preview](https://docs.databricks.com/release-notes/release-types.html). Contact your Databricks representative to request access.
 * 
 * Within a metastore, Unity Catalog provides a 3-level namespace for organizing data: Catalogs, databases (also called schemas), and tables / views.
 * 
 * &gt; **Note** This resource has an evolving API, which will change in the upcoming versions of the provider in order to simplify user experience.
 * 
 * A `databricks.Table` is contained within databricks_schema.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Catalog;
 * import com.pulumi.databricks.CatalogArgs;
 * import com.pulumi.databricks.Schema;
 * import com.pulumi.databricks.SchemaArgs;
 * import com.pulumi.databricks.Table;
 * import com.pulumi.databricks.TableArgs;
 * import com.pulumi.databricks.inputs.TableColumnArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var sandbox = new Catalog(&#34;sandbox&#34;, CatalogArgs.builder()        
 *             .metastoreId(databricks_metastore.this().id())
 *             .comment(&#34;this catalog is managed by terraform&#34;)
 *             .properties(Map.of(&#34;purpose&#34;, &#34;testing&#34;))
 *             .build());
 * 
 *         var things = new Schema(&#34;things&#34;, SchemaArgs.builder()        
 *             .catalogName(sandbox.id())
 *             .comment(&#34;this database is managed by terraform&#34;)
 *             .properties(Map.of(&#34;kind&#34;, &#34;various&#34;))
 *             .build());
 * 
 *         var thing = new Table(&#34;thing&#34;, TableArgs.builder()        
 *             .catalogName(sandbox.id())
 *             .schemaName(things.name())
 *             .tableType(&#34;MANAGED&#34;)
 *             .dataSourceFormat(&#34;DELTA&#34;)
 *             .columns(            
 *                 TableColumnArgs.builder()
 *                     .name(&#34;id&#34;)
 *                     .position(0)
 *                     .typeName(&#34;INT&#34;)
 *                     .typeText(&#34;int&#34;)
 *                     .typeJson(&#34;{\&#34;name\&#34;:\&#34;id\&#34;,\&#34;type\&#34;:\&#34;integer\&#34;,\&#34;nullable\&#34;:true,\&#34;metadata\&#34;:{}}&#34;)
 *                     .build(),
 *                 TableColumnArgs.builder()
 *                     .name(&#34;name&#34;)
 *                     .position(1)
 *                     .typeName(&#34;STRING&#34;)
 *                     .typeText(&#34;varchar(64)&#34;)
 *                     .typeJson(&#34;{\&#34;name\&#34;:\&#34;name\&#34;,\&#34;type\&#34;:\&#34;varchar(64)\&#34;,\&#34;nullable\&#34;:true,\&#34;metadata\&#34;:{}}&#34;)
 *                     .build())
 *             .comment(&#34;this table is managed by terraform&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(databricks.workspace())
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.Table data to list tables within Unity Catalog.
 * * databricks.Schema data to list schemas within Unity Catalog.
 * * databricks.Catalog data to list catalogs within Unity Catalog.
 * 
 * ## Import
 * 
 * This resource can be imported by full name*`catalog`.`schema`.`table`*bash
 * 
 * ```sh
 *  $ pulumi import databricks:index/table:Table this &lt;full-name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/table:Table")
public class Table extends com.pulumi.resources.CustomResource {
    /**
     * Name of parent catalog
     * 
     */
    @Export(name="catalogName", type=String.class, parameters={})
    private Output<String> catalogName;

    /**
     * @return Name of parent catalog
     * 
     */
    public Output<String> catalogName() {
        return this.catalogName;
    }
    @Export(name="columns", type=List.class, parameters={TableColumn.class})
    private Output<List<TableColumn>> columns;

    public Output<List<TableColumn>> columns() {
        return this.columns;
    }
    /**
     * User-supplied free-form text.
     * 
     */
    @Export(name="comment", type=String.class, parameters={})
    private Output</* @Nullable */ String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`
     * 
     */
    @Export(name="dataSourceFormat", type=String.class, parameters={})
    private Output<String> dataSourceFormat;

    /**
     * @return External tables are supported in multiple data source formats. The string constants identifying these formats are `DELTA`, `CSV`, `JSON`, `AVRO`, `PARQUET`, `ORC`, `TEXT`
     * 
     */
    public Output<String> dataSourceFormat() {
        return this.dataSourceFormat;
    }
    /**
     * User-visible name of column
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-visible name of column
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the table owner.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the table owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Extensible Table properties.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> properties;

    /**
     * @return Extensible Table properties.
     * 
     */
    public Output<Optional<Map<String,Object>>> properties() {
        return Codegen.optional(this.properties);
    }
    /**
     * Name of parent Schema relative to parent Catalog
     * 
     */
    @Export(name="schemaName", type=String.class, parameters={})
    private Output<String> schemaName;

    /**
     * @return Name of parent Schema relative to parent Catalog
     * 
     */
    public Output<String> schemaName() {
        return this.schemaName;
    }
    /**
     * For EXTERNAL Tables only: the name of storage credential to use. This cannot be updated
     * 
     */
    @Export(name="storageCredentialName", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageCredentialName;

    /**
     * @return For EXTERNAL Tables only: the name of storage credential to use. This cannot be updated
     * 
     */
    public Output<Optional<String>> storageCredentialName() {
        return Codegen.optional(this.storageCredentialName);
    }
    /**
     * URL of storage location for Table data (required for EXTERNAL Tables. For Managed Tables, if the path is provided it needs to be a Staging Table path that has been generated through the Staging Table API, otherwise should be empty)
     * 
     */
    @Export(name="storageLocation", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageLocation;

    /**
     * @return URL of storage location for Table data (required for EXTERNAL Tables. For Managed Tables, if the path is provided it needs to be a Staging Table path that has been generated through the Staging Table API, otherwise should be empty)
     * 
     */
    public Output<Optional<String>> storageLocation() {
        return Codegen.optional(this.storageLocation);
    }
    /**
     * Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`
     * 
     */
    @Export(name="tableType", type=String.class, parameters={})
    private Output<String> tableType;

    /**
     * @return Distinguishes a view vs. managed/external Table. `MANAGED`, `EXTERNAL` or `VIEW`
     * 
     */
    public Output<String> tableType() {
        return this.tableType;
    }
    /**
     * SQL text defining the view (for `table_type == &#34;VIEW&#34;`)
     * 
     */
    @Export(name="viewDefinition", type=String.class, parameters={})
    private Output</* @Nullable */ String> viewDefinition;

    /**
     * @return SQL text defining the view (for `table_type == &#34;VIEW&#34;`)
     * 
     */
    public Output<Optional<String>> viewDefinition() {
        return Codegen.optional(this.viewDefinition);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Table(String name) {
        this(name, TableArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Table(String name, TableArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Table(String name, TableArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/table:Table", name, args == null ? TableArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Table(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/table:Table", name, state, makeResourceOptions(options, id));
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
    public static Table get(String name, Output<String> id, @Nullable TableState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Table(name, id, state, options);
    }
}
