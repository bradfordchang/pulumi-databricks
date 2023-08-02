// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSqlWarehouseChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetSqlWarehouseChannelArgs Empty = new GetSqlWarehouseChannelArgs();

    /**
     * Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the SQL warehouse to search (case-sensitive).
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetSqlWarehouseChannelArgs() {}

    private GetSqlWarehouseChannelArgs(GetSqlWarehouseChannelArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSqlWarehouseChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSqlWarehouseChannelArgs $;

        public Builder() {
            $ = new GetSqlWarehouseChannelArgs();
        }

        public Builder(GetSqlWarehouseChannelArgs defaults) {
            $ = new GetSqlWarehouseChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the SQL warehouse to search (case-sensitive).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the SQL warehouse to search (case-sensitive).
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetSqlWarehouseChannelArgs build() {
            return $;
        }
    }

}
