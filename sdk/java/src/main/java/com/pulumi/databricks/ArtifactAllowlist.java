// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.ArtifactAllowlistArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.ArtifactAllowlistState;
import com.pulumi.databricks.outputs.ArtifactAllowlistArtifactMatcher;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.databricks.ArtifactAllowlist;
 * import com.pulumi.databricks.ArtifactAllowlistArgs;
 * import com.pulumi.databricks.inputs.ArtifactAllowlistArtifactMatcherArgs;
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
 *         var initScripts = new ArtifactAllowlist(&#34;initScripts&#34;, ArtifactAllowlistArgs.builder()        
 *             .artifactMatchers(ArtifactAllowlistArtifactMatcherArgs.builder()
 *                 .artifact(&#34;/Volumes/inits&#34;)
 *                 .matchType(&#34;PREFIX_MATCH&#34;)
 *                 .build())
 *             .artifactType(&#34;INIT_SCRIPT&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Related Resources
 * 
 * The following resources are used in the same context:
 * 
 * * databricks.Cluster to create [Databricks Clusters](https://docs.databricks.com/clusters/index.html).
 * * databricks.Library to install a [library](https://docs.databricks.com/libraries/index.html) on databricks_cluster.
 * 
 * ## Import
 * 
 * This resource can be imported by namebash
 * 
 * ```sh
 *  $ pulumi import databricks:index/artifactAllowlist:ArtifactAllowlist this &lt;metastore_id&gt;|&lt;artifact_type&gt;
 * ```
 * 
 */
@ResourceType(type="databricks:index/artifactAllowlist:ArtifactAllowlist")
public class ArtifactAllowlist extends com.pulumi.resources.CustomResource {
    @Export(name="artifactMatchers", refs={List.class,ArtifactAllowlistArtifactMatcher.class}, tree="[0,1]")
    private Output<List<ArtifactAllowlistArtifactMatcher>> artifactMatchers;

    public Output<List<ArtifactAllowlistArtifactMatcher>> artifactMatchers() {
        return this.artifactMatchers;
    }
    /**
     * The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
     * 
     */
    @Export(name="artifactType", refs={String.class}, tree="[0]")
    private Output<String> artifactType;

    /**
     * @return The artifact type of the allowlist. Can be `INIT_SCRIPT`, `LIBRARY_JAR` or `LIBRARY_MAVEN`. Change forces creation of a new resource.
     * 
     */
    public Output<String> artifactType() {
        return this.artifactType;
    }
    /**
     * Time at which this artifact allowlist was set.
     * 
     */
    @Export(name="createdAt", refs={Integer.class}, tree="[0]")
    private Output<Integer> createdAt;

    /**
     * @return Time at which this artifact allowlist was set.
     * 
     */
    public Output<Integer> createdAt() {
        return this.createdAt;
    }
    /**
     * Identity that set the artifact allowlist.
     * 
     */
    @Export(name="createdBy", refs={String.class}, tree="[0]")
    private Output<String> createdBy;

    /**
     * @return Identity that set the artifact allowlist.
     * 
     */
    public Output<String> createdBy() {
        return this.createdBy;
    }
    /**
     * ID of the parent metastore.
     * 
     */
    @Export(name="metastoreId", refs={String.class}, tree="[0]")
    private Output<String> metastoreId;

    /**
     * @return ID of the parent metastore.
     * 
     */
    public Output<String> metastoreId() {
        return this.metastoreId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ArtifactAllowlist(String name) {
        this(name, ArtifactAllowlistArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ArtifactAllowlist(String name, ArtifactAllowlistArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ArtifactAllowlist(String name, ArtifactAllowlistArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/artifactAllowlist:ArtifactAllowlist", name, args == null ? ArtifactAllowlistArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ArtifactAllowlist(String name, Output<String> id, @Nullable ArtifactAllowlistState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/artifactAllowlist:ArtifactAllowlist", name, state, makeResourceOptions(options, id));
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
    public static ArtifactAllowlist get(String name, Output<String> id, @Nullable ArtifactAllowlistState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ArtifactAllowlist(name, id, state, options);
    }
}