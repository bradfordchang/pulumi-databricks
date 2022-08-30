// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CatalogArgs extends com.pulumi.resources.ResourceArgs {

    public static final CatalogArgs Empty = new CatalogArgs();

    /**
     * User-supplied free-form text.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return User-supplied free-form text.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    @Import(name="metastoreId")
    private @Nullable Output<String> metastoreId;

    public Optional<Output<String>> metastoreId() {
        return Optional.ofNullable(this.metastoreId);
    }

    /**
     * Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of Catalog relative to parent metastore. Change forces creation of a new resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Username/groupname/sp application_id of the catalog owner.
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return Username/groupname/sp application_id of the catalog owner.
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Extensible Catalog properties.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,Object>> properties;

    /**
     * @return Extensible Catalog properties.
     * 
     */
    public Optional<Output<Map<String,Object>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    private CatalogArgs() {}

    private CatalogArgs(CatalogArgs $) {
        this.comment = $.comment;
        this.metastoreId = $.metastoreId;
        this.name = $.name;
        this.owner = $.owner;
        this.properties = $.properties;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CatalogArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CatalogArgs $;

        public Builder() {
            $ = new CatalogArgs();
        }

        public Builder(CatalogArgs defaults) {
            $ = new CatalogArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment User-supplied free-form text.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        public Builder metastoreId(@Nullable Output<String> metastoreId) {
            $.metastoreId = metastoreId;
            return this;
        }

        public Builder metastoreId(String metastoreId) {
            return metastoreId(Output.of(metastoreId));
        }

        /**
         * @param name Name of Catalog relative to parent metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of Catalog relative to parent metastore. Change forces creation of a new resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param owner Username/groupname/sp application_id of the catalog owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner Username/groupname/sp application_id of the catalog owner.
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param properties Extensible Catalog properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,Object>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Extensible Catalog properties.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,Object> properties) {
            return properties(Output.of(properties));
        }

        public CatalogArgs build() {
            return $;
        }
    }

}
