// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ShareArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ShareState;
import com.pulumi.databricks.outputs.ShareObject;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Within a metastore, Unity Catalog provides the ability to create a share, which is a named object that contains a collection of tables in a metastore that you want to share as a group. A share can contain tables from only a single metastore. You can add or remove tables from a share at any time.
 * 
 * A `databricks.Share` is contained within databricks.Metastore and can contain a list of shares.
 * 
 * ## Example Usage
 * 
 * Creating a Delta Sharing share and add some existing tables to it
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.DatabricksFunctions;
 * import com.pulumi.databricks.inputs.GetTablesArgs;
 * import com.pulumi.databricks.Share;
 * import com.pulumi.databricks.ShareArgs;
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
 *         final var things = DatabricksFunctions.getTables(GetTablesArgs.builder()
 *             .catalogName(&#34;sandbox&#34;)
 *             .schemaName(&#34;things&#34;)
 *             .build());
 * 
 *         var some = new Share(&#34;some&#34;, ShareArgs.builder()        
 *             .dynamic(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are often used in the same context:
 * 
 * * databricks.Recipient to create Delta Sharing recipients.
 * * databricks.Grants to manage Delta Sharing permissions.
 * * databricks.getShares to read existing Delta Sharing shares.
 * 
 */
@ResourceType(type="databricks:index/share:Share")
public class Share extends com.pulumi.resources.CustomResource {
    /**
     * Time when the share was created.
     * 
     */
    @Export(name="createdAt", type=Integer.class, parameters={})
    private Output<Integer> createdAt;

    /**
     * @return Time when the share was created.
     * 
     */
    public Output<Integer> createdAt() {
        return this.createdAt;
    }
    /**
     * The principal that created the share.
     * 
     */
    @Export(name="createdBy", type=String.class, parameters={})
    private Output<String> createdBy;

    /**
     * @return The principal that created the share.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Full name of the object, e.g. `catalog.schema.name` for a table.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="objects", type=List.class, parameters={ShareObject.class})
    private Output</* @Nullable */ List<ShareObject>> objects;

    public Output<Optional<List<ShareObject>>> objects() {
        return Codegen.optional(this.objects);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Share(String name) {
        this(name, ShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Share(String name, @Nullable ShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Share(String name, @Nullable ShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/share:Share", name, args == null ? ShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Share(String name, Output<String> id, @Nullable ShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/share:Share", name, state, makeResourceOptions(options, id));
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
    public static Share get(String name, Output<String> id, @Nullable ShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Share(name, id, state, options);
    }
}