// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MwsPrivateAccessSettingsState extends com.pulumi.resources.ResourceArgs {

    public static final MwsPrivateAccessSettingsState Empty = new MwsPrivateAccessSettingsState();

    /**
     * Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    @Import(name="allowedVpcEndpointIds")
    private @Nullable Output<List<String>> allowedVpcEndpointIds;

    /**
     * @return An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
     * 
     */
    public Optional<Output<List<String>>> allowedVpcEndpointIds() {
        return Optional.ofNullable(this.allowedVpcEndpointIds);
    }

    /**
     * The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    @Import(name="privateAccessLevel")
    private @Nullable Output<String> privateAccessLevel;

    /**
     * @return The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
     * 
     */
    public Optional<Output<String>> privateAccessLevel() {
        return Optional.ofNullable(this.privateAccessLevel);
    }

    /**
     * Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    @Import(name="privateAccessSettingsId")
    private @Nullable Output<String> privateAccessSettingsId;

    /**
     * @return Canonical unique identifier of Private Access Settings in Databricks Account
     * 
     */
    public Optional<Output<String>> privateAccessSettingsId() {
        return Optional.ofNullable(this.privateAccessSettingsId);
    }

    /**
     * Name of Private Access Settings in Databricks Account
     * 
     */
    @Import(name="privateAccessSettingsName")
    private @Nullable Output<String> privateAccessSettingsName;

    /**
     * @return Name of Private Access Settings in Databricks Account
     * 
     */
    public Optional<Output<String>> privateAccessSettingsName() {
        return Optional.ofNullable(this.privateAccessSettingsName);
    }

    /**
     * - If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    @Import(name="publicAccessEnabled")
    private @Nullable Output<Boolean> publicAccessEnabled;

    /**
     * @return - If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
     * 
     */
    public Optional<Output<Boolean>> publicAccessEnabled() {
        return Optional.ofNullable(this.publicAccessEnabled);
    }

    /**
     * Region of AWS VPC
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region of AWS VPC
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Status of Private Access Settings
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Status of Private Access Settings
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private MwsPrivateAccessSettingsState() {}

    private MwsPrivateAccessSettingsState(MwsPrivateAccessSettingsState $) {
        this.accountId = $.accountId;
        this.allowedVpcEndpointIds = $.allowedVpcEndpointIds;
        this.privateAccessLevel = $.privateAccessLevel;
        this.privateAccessSettingsId = $.privateAccessSettingsId;
        this.privateAccessSettingsName = $.privateAccessSettingsName;
        this.publicAccessEnabled = $.publicAccessEnabled;
        this.region = $.region;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MwsPrivateAccessSettingsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MwsPrivateAccessSettingsState $;

        public Builder() {
            $ = new MwsPrivateAccessSettingsState();
        }

        public Builder(MwsPrivateAccessSettingsState defaults) {
            $ = new MwsPrivateAccessSettingsState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account Id that could be found in the bottom left corner of [Accounts Console](https://accounts.cloud.databricks.com/)
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param allowedVpcEndpointIds An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcEndpointIds(@Nullable Output<List<String>> allowedVpcEndpointIds) {
            $.allowedVpcEndpointIds = allowedVpcEndpointIds;
            return this;
        }

        /**
         * @param allowedVpcEndpointIds An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcEndpointIds(List<String> allowedVpcEndpointIds) {
            return allowedVpcEndpointIds(Output.of(allowedVpcEndpointIds));
        }

        /**
         * @param allowedVpcEndpointIds An array of databricks.MwsVpcEndpoint `vpc_endpoint_id` (not `id`). Only used when `private_access_level` is set to `ENDPOINT`. This is an allow list of databricks.MwsVpcEndpoint that in your account that can connect to your databricks.MwsWorkspaces over AWS PrivateLink. If hybrid access to your workspace is enabled by setting `public_access_enabled` to true, then this control only works for PrivateLink connections. To control how your workspace is accessed via public internet, see the article for databricks_ip_access_list.
         * 
         * @return builder
         * 
         */
        public Builder allowedVpcEndpointIds(String... allowedVpcEndpointIds) {
            return allowedVpcEndpointIds(List.of(allowedVpcEndpointIds));
        }

        /**
         * @param privateAccessLevel The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
         * 
         * @return builder
         * 
         */
        public Builder privateAccessLevel(@Nullable Output<String> privateAccessLevel) {
            $.privateAccessLevel = privateAccessLevel;
            return this;
        }

        /**
         * @param privateAccessLevel The private access level controls which VPC endpoints can connect to the UI or API of any workspace that attaches this private access settings object. `ACCOUNT` level access _(default)_ lets only databricks.MwsVpcEndpoint that are registered in your Databricks account connect to your databricks_mws_workspaces. `ENDPOINT` level access lets only specified databricks.MwsVpcEndpoint connect to your workspace. Please see the `allowed_vpc_endpoint_ids` documentation for more details.
         * 
         * @return builder
         * 
         */
        public Builder privateAccessLevel(String privateAccessLevel) {
            return privateAccessLevel(Output.of(privateAccessLevel));
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of Private Access Settings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(@Nullable Output<String> privateAccessSettingsId) {
            $.privateAccessSettingsId = privateAccessSettingsId;
            return this;
        }

        /**
         * @param privateAccessSettingsId Canonical unique identifier of Private Access Settings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsId(String privateAccessSettingsId) {
            return privateAccessSettingsId(Output.of(privateAccessSettingsId));
        }

        /**
         * @param privateAccessSettingsName Name of Private Access Settings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsName(@Nullable Output<String> privateAccessSettingsName) {
            $.privateAccessSettingsName = privateAccessSettingsName;
            return this;
        }

        /**
         * @param privateAccessSettingsName Name of Private Access Settings in Databricks Account
         * 
         * @return builder
         * 
         */
        public Builder privateAccessSettingsName(String privateAccessSettingsName) {
            return privateAccessSettingsName(Output.of(privateAccessSettingsName));
        }

        /**
         * @param publicAccessEnabled - If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessEnabled(@Nullable Output<Boolean> publicAccessEnabled) {
            $.publicAccessEnabled = publicAccessEnabled;
            return this;
        }

        /**
         * @param publicAccessEnabled - If `true`, the databricks.MwsWorkspaces can be accessed over the databricks.MwsVpcEndpoint as well as over the public network. In such a case, you could also configure an databricks.IpAccessList for the workspace, to restrict the source networks that could be used to access it over the public network. If `false` (default), the workspace can be accessed only over VPC endpoints, and not over the public network.
         * 
         * @return builder
         * 
         */
        public Builder publicAccessEnabled(Boolean publicAccessEnabled) {
            return publicAccessEnabled(Output.of(publicAccessEnabled));
        }

        /**
         * @param region Region of AWS VPC
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region of AWS VPC
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param status Status of Private Access Settings
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Status of Private Access Settings
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public MwsPrivateAccessSettingsState build() {
            return $;
        }
    }

}