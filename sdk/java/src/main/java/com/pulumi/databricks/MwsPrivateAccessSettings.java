// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.databricks.MwsPrivateAccessSettingsArgs;
import com.pulumi.databricks.Utilities;
import com.pulumi.databricks.inputs.MwsPrivateAccessSettingsState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * -&gt; **Note** Importing this resource is not currently supported.
 * 
 */
@ResourceType(type="databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings")
public class MwsPrivateAccessSettings extends com.pulumi.resources.CustomResource {
    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Output<Optional<String>> accountId() {
        return Codegen.optional(this.accountId);
    }
    /**
     * An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    @Export(name="allowedVpcEndpointIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedVpcEndpointIds;

    /**
     * @return An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    public Output<Optional<List<String>>> allowedVpcEndpointIds() {
        return Codegen.optional(this.allowedVpcEndpointIds);
    }
    /**
     * The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    @Export(name="privateAccessLevel", type=String.class, parameters={})
    private Output</* @Nullable */ String> privateAccessLevel;

    /**
     * @return The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    public Output<Optional<String>> privateAccessLevel() {
        return Codegen.optional(this.privateAccessLevel);
    }
    /**
     * Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    @Export(name="privateAccessSettingsId", type=String.class, parameters={})
    private Output<String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    public Output<String> privateAccessSettingsId() {
        return this.privateAccessSettingsId;
    }
    /**
     * Name of Private Access Settings in Databricks Account
     * 
     */
    @Export(name="privateAccessSettingsName", type=String.class, parameters={})
    private Output<String> privateAccessSettingsName;

    /**
     * @return Name of Private Access Settings in Databricks Account
     * 
     */
    public Output<String> privateAccessSettingsName() {
        return this.privateAccessSettingsName;
    }
    /**
     * If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    @Export(name="publicAccessEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> publicAccessEnabled;

    /**
     * @return If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    public Output<Optional<Boolean>> publicAccessEnabled() {
        return Codegen.optional(this.publicAccessEnabled);
    }
    /**
     * Region of AWS VPC
     * 
     */
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return Region of AWS VPC
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Status of Private Access Settings
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Status of Private Access Settings
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MwsPrivateAccessSettings(String name) {
        this(name, MwsPrivateAccessSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MwsPrivateAccessSettings(String name, MwsPrivateAccessSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MwsPrivateAccessSettings(String name, MwsPrivateAccessSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, args == null ? MwsPrivateAccessSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MwsPrivateAccessSettings(String name, Output<String> id, @Nullable MwsPrivateAccessSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("databricks:index/mwsPrivateAccessSettings:MwsPrivateAccessSettings", name, state, makeResourceOptions(options, id));
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
    public static MwsPrivateAccessSettings get(String name, Output<String> id, @Nullable MwsPrivateAccessSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MwsPrivateAccessSettings(name, id, state, options);
    }
}
