// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.GlobalInitScriptArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.GlobalInitScriptState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * The resource global init script can be imported using script IDbash
 * 
 * ```sh
 *  $ pulumi import databricks:index/globalInitScript:GlobalInitScript this script_id
 * ```
 * 
 */
@ResourceType(type="databricks:index/globalInitScript:GlobalInitScript")
public class GlobalInitScript extends com.pulumi.resources.CustomResource {
    @Export(name="contentBase64", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentBase64;

    public Output<Optional<String>> contentBase64() {
        return Codegen.optional(this.contentBase64);
    }
    /**
     * specifies if the script is enabled for execution, or not
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return specifies if the script is enabled for execution, or not
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    @Export(name="md5", type=String.class, parameters={})
    private Output</* @Nullable */ String> md5;

    public Output<Optional<String>> md5() {
        return Codegen.optional(this.md5);
    }
    /**
     * - the name of the script.  It should be unique
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return - the name of the script.  It should be unique
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * - the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
     * 
     */
    @Export(name="position", type=Integer.class, parameters={})
    private Output<Integer> position;

    /**
     * @return - the position of a global init script, where `0` represents the first global init script to run, `1` is the second global init script to run, and so on. When omitted, the script gets the last position.
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }
    /**
     * Path to script&#39;s source code on local filesystem. Conflicts with `content_base64`
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Path to script&#39;s source code on local filesystem. Conflicts with `content_base64`
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalInitScript(String name) {
        this(name, GlobalInitScriptArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalInitScript(String name, @Nullable GlobalInitScriptArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalInitScript(String name, @Nullable GlobalInitScriptArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/globalInitScript:GlobalInitScript", name, args == null ? GlobalInitScriptArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalInitScript(String name, Output<String> id, @Nullable GlobalInitScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/globalInitScript:GlobalInitScript", name, state, makeResourceOptions(options, id));
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
    public static GlobalInitScript get(String name, Output<String> id, @Nullable GlobalInitScriptState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalInitScript(name, id, state, options);
    }
}