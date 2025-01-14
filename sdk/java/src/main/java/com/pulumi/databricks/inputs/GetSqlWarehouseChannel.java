// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlWarehouseChannel extends com.pulumi.resources.InvokeArgs {

    public static final GetSqlWarehouseChannel Empty = new GetSqlWarehouseChannel();

    /**
     * Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSqlWarehouseChannel() {}

    private GetSqlWarehouseChannel(GetSqlWarehouseChannel $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlWarehouseChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlWarehouseChannel $;

        public Builder() {
            $ = new GetSqlWarehouseChannel();
        }

        public Builder(GetSqlWarehouseChannel defaults) {
            $ = new GetSqlWarehouseChannel(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the SQL warehouse to search (case-sensitive).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetSqlWarehouseChannel build() {
            return $;
        }
    }

}
