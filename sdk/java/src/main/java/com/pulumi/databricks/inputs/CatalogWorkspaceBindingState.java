// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogWorkspaceBindingState extends com.pulumi.resources.ResourceArgs {

    public static final CatalogWorkspaceBindingState Empty = new CatalogWorkspaceBindingState();

    /**
     * Name of Catalog. Change forces creation of a new resource.
     * 
     */
    @Import(name="catalogName")
    private @Nullable Output<String> catalogName;

    /**
     * @return Name of Catalog. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> catalogName() {
        return Optional.ofNullable(this.catalogName);
    }

    /**
     * ID of the workspace. Change forces creation of a new resource.
     * 
     */
    @Import(name="workspaceId")
    private @Nullable Output<String> workspaceId;

    /**
     * @return ID of the workspace. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> workspaceId() {
        return Optional.ofNullable(this.workspaceId);
    }

    private CatalogWorkspaceBindingState() {}

    private CatalogWorkspaceBindingState(CatalogWorkspaceBindingState $) {
        this.catalogName = $.catalogName;
        this.workspaceId = $.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogWorkspaceBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogWorkspaceBindingState $;

        public Builder() {
            $ = new CatalogWorkspaceBindingState();
        }

        public Builder(CatalogWorkspaceBindingState defaults) {
            $ = new CatalogWorkspaceBindingState(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Name of Catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(@Nullable Output<String> catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param catalogName Name of Catalog. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            return catalogName(Output.of(catalogName));
        }

        /**
         * @param workspaceId ID of the workspace. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(@Nullable Output<String> workspaceId) {
            $.workspaceId = workspaceId;
            return this;
        }

        /**
         * @param workspaceId ID of the workspace. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder workspaceId(String workspaceId) {
            return workspaceId(Output.of(workspaceId));
        }

        public CatalogWorkspaceBindingState build() {
            return $;
        }
    }

}
