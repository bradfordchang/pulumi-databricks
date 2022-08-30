// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MetastoreState extends com.pulumi.resources.ResourceArgs {

    public static final MetastoreState Empty = new MetastoreState();

    @Import(name="cloud")
    private @Nullable Output<String> cloud;

    public Optional<Output<String>> cloud() {
        return Optional.ofNullable(this.cloud);
    }

    @Import(name="createdAt")
    private @Nullable Output<Integer> createdAt;

    public Optional<Output<Integer>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    @Import(name="createdBy")
    private @Nullable Output<String> createdBy;

    public Optional<Output<String>> createdBy() {
        return Optional.ofNullable(this.createdBy);
    }

    @Import(name="defaultDataAccessConfigId")
    private @Nullable Output<String> defaultDataAccessConfigId;

    public Optional<Output<String>> defaultDataAccessConfigId() {
        return Optional.ofNullable(this.defaultDataAccessConfigId);
    }

    /**
     * The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     * 
     */
    @Import(name="deltaSharingOrganizationName")
    private @Nullable Output<String> deltaSharingOrganizationName;

    /**
     * @return The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
     * 
     */
    public Optional<Output<String>> deltaSharingOrganizationName() {
        return Optional.ofNullable(this.deltaSharingOrganizationName);
    }

    /**
     * Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     * 
     */
    @Import(name="deltaSharingRecipientTokenLifetimeInSeconds")
    private @Nullable Output<Integer> deltaSharingRecipientTokenLifetimeInSeconds;

    /**
     * @return Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
     * 
     */
    public Optional<Output<Integer>> deltaSharingRecipientTokenLifetimeInSeconds() {
        return Optional.ofNullable(this.deltaSharingRecipientTokenLifetimeInSeconds);
    }

    /**
     * Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    @Import(name="deltaSharingScope")
    private @Nullable Output<String> deltaSharingScope;

    /**
     * @return Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
     * 
     */
    public Optional<Output<String>> deltaSharingScope() {
        return Optional.ofNullable(this.deltaSharingScope);
    }

    /**
     * Destroy metastore regardless of its contents.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return Destroy metastore regardless of its contents.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    @Import(name="globalMetastoreId")
    private @Nullable Output<String> globalMetastoreId;

    public Optional<Output<String>> globalMetastoreId() {
        return Optional.ofNullable(this.globalMetastoreId);
    }

    /**
     * Name of metastore.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of metastore.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the metastore owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the metastore owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Path on cloud storage account, where managed databricks.Table are stored. Change forces creation of a new resource.
     * 
     */
    @Import(name="storageRoot")
    private @Nullable Output<String> storageRoot;

    /**
     * @return Path on cloud storage account, where managed databricks.Table are stored. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> storageRoot() {
        return Optional.ofNullable(this.storageRoot);
    }

    @Import(name="updatedAt")
    private @Nullable Output<Integer> updatedAt;

    public Optional<Output<Integer>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="updatedBy")
    private @Nullable Output<String> updatedBy;

    public Optional<Output<String>> updatedBy() {
        return Optional.ofNullable(this.updatedBy);
    }

    private MetastoreState() {}

    private MetastoreState(MetastoreState $) {
        this.cloud = $.cloud;
        this.createdAt = $.createdAt;
        this.createdBy = $.createdBy;
        this.defaultDataAccessConfigId = $.defaultDataAccessConfigId;
        this.deltaSharingOrganizationName = $.deltaSharingOrganizationName;
        this.deltaSharingRecipientTokenLifetimeInSeconds = $.deltaSharingRecipientTokenLifetimeInSeconds;
        this.deltaSharingScope = $.deltaSharingScope;
        this.forceDestroy = $.forceDestroy;
        this.globalMetastoreId = $.globalMetastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.region = $.region;
        this.storageRoot = $.storageRoot;
        this.updatedAt = $.updatedAt;
        this.updatedBy = $.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetastoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetastoreState $;

        public Builder() {
            $ = new MetastoreState();
        }

        public Builder(MetastoreState defaults) {
            $ = new MetastoreState(Objects.requireNonNull(defaults));
        }

        public Builder cloud(@Nullable Output<String> cloud) {
            $.cloud = cloud;
            return this;
        }

        public Builder cloud(String cloud) {
            return cloud(Output.of(cloud));
        }

        public Builder createdAt(@Nullable Output<Integer> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(Integer createdAt) {
            return createdAt(Output.of(createdAt));
        }

        public Builder createdBy(@Nullable Output<String> createdBy) {
            $.createdBy = createdBy;
            return this;
        }

        public Builder createdBy(String createdBy) {
            return createdBy(Output.of(createdBy));
        }

        public Builder defaultDataAccessConfigId(@Nullable Output<String> defaultDataAccessConfigId) {
            $.defaultDataAccessConfigId = defaultDataAccessConfigId;
            return this;
        }

        public Builder defaultDataAccessConfigId(String defaultDataAccessConfigId) {
            return defaultDataAccessConfigId(Output.of(defaultDataAccessConfigId));
        }

        /**
         * @param deltaSharingOrganizationName The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingOrganizationName(@Nullable Output<String> deltaSharingOrganizationName) {
            $.deltaSharingOrganizationName = deltaSharingOrganizationName;
            return this;
        }

        /**
         * @param deltaSharingOrganizationName The organization name of a Delta Sharing entity. This field is used for Databricks to Databricks sharing. Once this is set it cannot be removed and can only be modified to another valid value. To delete this value please taint and recreate the resource.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingOrganizationName(String deltaSharingOrganizationName) {
            return deltaSharingOrganizationName(Output.of(deltaSharingOrganizationName));
        }

        /**
         * @param deltaSharingRecipientTokenLifetimeInSeconds Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingRecipientTokenLifetimeInSeconds(@Nullable Output<Integer> deltaSharingRecipientTokenLifetimeInSeconds) {
            $.deltaSharingRecipientTokenLifetimeInSeconds = deltaSharingRecipientTokenLifetimeInSeconds;
            return this;
        }

        /**
         * @param deltaSharingRecipientTokenLifetimeInSeconds Required along with `delta_sharing_scope`. Used to set expiration duration in seconds on recipient data access tokens. Set to 0 for unlimited duration.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingRecipientTokenLifetimeInSeconds(Integer deltaSharingRecipientTokenLifetimeInSeconds) {
            return deltaSharingRecipientTokenLifetimeInSeconds(Output.of(deltaSharingRecipientTokenLifetimeInSeconds));
        }

        /**
         * @param deltaSharingScope Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingScope(@Nullable Output<String> deltaSharingScope) {
            $.deltaSharingScope = deltaSharingScope;
            return this;
        }

        /**
         * @param deltaSharingScope Required along with `delta_sharing_recipient_token_lifetime_in_seconds`. Used to enable delta sharing on the metastore. Valid values: INTERNAL, INTERNAL_AND_EXTERNAL.
         * 
         * @return builder
         * 
         */
        public Builder deltaSharingScope(String deltaSharingScope) {
            return deltaSharingScope(Output.of(deltaSharingScope));
        }

        /**
         * @param forceDestroy Destroy metastore regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy Destroy metastore regardless of its contents.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        public Builder globalMetastoreId(@Nullable Output<String> globalMetastoreId) {
            $.globalMetastoreId = globalMetastoreId;
            return this;
        }

        public Builder globalMetastoreId(String globalMetastoreId) {
            return globalMetastoreId(Output.of(globalMetastoreId));
        }

        /**
         * @param name Name of metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of metastore.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the metastore owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the metastore owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param storageRoot Path on cloud storage account, where managed databricks.Table are stored. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(@Nullable Output<String> storageRoot) {
            $.storageRoot = storageRoot;
            return this;
        }

        /**
         * @param storageRoot Path on cloud storage account, where managed databricks.Table are stored. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder storageRoot(String storageRoot) {
            return storageRoot(Output.of(storageRoot));
        }

        public Builder updatedAt(@Nullable Output<Integer> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(Integer updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public Builder updatedBy(@Nullable Output<String> updatedBy) {
            $.updatedBy = updatedBy;
            return this;
        }

        public Builder updatedBy(String updatedBy) {
            return updatedBy(Output.of(updatedBy));
        }

        public MetastoreState build() {
            return $;
        }
    }

}
