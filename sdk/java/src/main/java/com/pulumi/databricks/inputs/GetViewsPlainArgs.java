// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetViewsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetViewsPlainArgs Empty = new GetViewsPlainArgs();

    /**
     * Name of databricks_catalog
     * 
     */
    @Import(name="catalogName", required=true)
    private String catalogName;

    /**
     * @return Name of databricks_catalog
     * 
     */
    public String catalogName() {
        return this.catalogName;
    }

    /**
     * set of databricks_view full names: *`catalog`.`schema`.`view`*
     * 
     */
    @Import(name="ids")
    private @Nullable List<String> ids;

    /**
     * @return set of databricks_view full names: *`catalog`.`schema`.`view`*
     * 
     */
    public Optional<List<String>> ids() {
        return Optional.ofNullable(this.ids);
    }

    /**
     * Name of databricks_schema
     * 
     */
    @Import(name="schemaName", required=true)
    private String schemaName;

    /**
     * @return Name of databricks_schema
     * 
     */
    public String schemaName() {
        return this.schemaName;
    }

    private GetViewsPlainArgs() {}

    private GetViewsPlainArgs(GetViewsPlainArgs $) {
        this.catalogName = $.catalogName;
        this.ids = $.ids;
        this.schemaName = $.schemaName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetViewsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetViewsPlainArgs $;

        public Builder() {
            $ = new GetViewsPlainArgs();
        }

        public Builder(GetViewsPlainArgs defaults) {
            $ = new GetViewsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param catalogName Name of databricks_catalog
         * 
         * @return builder
         * 
         */
        public Builder catalogName(String catalogName) {
            $.catalogName = catalogName;
            return this;
        }

        /**
         * @param ids set of databricks_view full names: *`catalog`.`schema`.`view`*
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable List<String> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids set of databricks_view full names: *`catalog`.`schema`.`view`*
         * 
         * @return builder
         * 
         */
        public Builder ids(String... ids) {
            return ids(List.of(ids));
        }

        /**
         * @param schemaName Name of databricks_schema
         * 
         * @return builder
         * 
         */
        public Builder schemaName(String schemaName) {
            $.schemaName = schemaName;
            return this;
        }

        public GetViewsPlainArgs build() {
            $.catalogName = Objects.requireNonNull($.catalogName, "expected parameter 'catalogName' to be non-null");
            $.schemaName = Objects.requireNonNull($.schemaName, "expected parameter 'schemaName' to be non-null");
            return $;
        }
    }

}
