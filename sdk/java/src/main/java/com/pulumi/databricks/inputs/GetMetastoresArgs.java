// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMetastoresArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMetastoresArgs Empty = new GetMetastoresArgs();

    /**
     * Mapping of name to id of databricks_metastore
     * 
     */
    @Import(name="ids")
    private @Nullable Output<Map<String,Object>> ids;

    /**
     * @return Mapping of name to id of databricks_metastore
     * 
     */
    public Optional<Output<Map<String,Object>>> ids() {
        return Optional.ofNullable(this.ids);
    }

    private GetMetastoresArgs() {}

    private GetMetastoresArgs(GetMetastoresArgs $) {
        this.ids = $.ids;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMetastoresArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMetastoresArgs $;

        public Builder() {
            $ = new GetMetastoresArgs();
        }

        public Builder(GetMetastoresArgs defaults) {
            $ = new GetMetastoresArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ids Mapping of name to id of databricks_metastore
         * 
         * @return builder
         * 
         */
        public Builder ids(@Nullable Output<Map<String,Object>> ids) {
            $.ids = ids;
            return this;
        }

        /**
         * @param ids Mapping of name to id of databricks_metastore
         * 
         * @return builder
         * 
         */
        public Builder ids(Map<String,Object> ids) {
            return ids(Output.of(ids));
        }

        public GetMetastoresArgs build() {
            return $;
        }
    }

}
