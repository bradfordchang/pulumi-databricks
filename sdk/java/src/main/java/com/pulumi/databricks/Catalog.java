// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.CatalogArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.CatalogState;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.Catalog;
 * import com.pulumi.databricks.CatalogArgs;
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
 * This resource can be imported by namebash
 * 
 * ```sh
 *  $ pulumi import databricks:index/catalog:Catalog this &lt;name&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/catalog:Catalog")
public class Catalog extends com.pulumi.resources.CustomResource {
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
     * Delete catalog regardless of its contents.
     * 
     */
    @Export(name="forceDestroy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Delete catalog regardless of its contents.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    @Export(name="metastoreId", type=String.class, parameters={})
    private Output<String> metastoreId;

    public Output<String> metastoreId() {
        return this.metastoreId;
    }
    /**
     * Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Username/groupname/sp application_id of the catalog owner.
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the catalog owner.
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * Extensible Catalog properties.
     * 
     */
    @Export(name="properties", type=Map.class, parameters={String.class, Object.class})
    private Output</* @Nullable */ Map<String,Object>> properties;

    /**
     * @return Extensible Catalog properties.
     * 
     */
    public Output<Optional<Map<String,Object>>> properties() {
        return Codegen.optional(this.properties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Catalog(String name) {
        this(name, CatalogArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Catalog(String name, @Nullable CatalogArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Catalog(String name, @Nullable CatalogArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/catalog:Catalog", name, args == null ? CatalogArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Catalog(String name, Output<String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/catalog:Catalog", name, state, makeResourceOptions(options, id));
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
    public static Catalog get(String name, Output<String> id, @Nullable CatalogState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Catalog(name, id, state, options);
    }
}
