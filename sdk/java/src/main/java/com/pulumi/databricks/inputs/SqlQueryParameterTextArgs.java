// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SqlQueryParameterTextArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlQueryParameterTextArgs Empty = new SqlQueryParameterTextArgs();

    /**
     * The default value for this parameter.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The default value for this parameter.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SqlQueryParameterTextArgs() {}

    private SqlQueryParameterTextArgs(SqlQueryParameterTextArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlQueryParameterTextArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlQueryParameterTextArgs $;

        public Builder() {
            $ = new SqlQueryParameterTextArgs();
        }

        public Builder(SqlQueryParameterTextArgs defaults) {
            $ = new SqlQueryParameterTextArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param value The default value for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The default value for this parameter.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SqlQueryParameterTextArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
