// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryParameterDatetimesecRangeRange;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryParameterDatetimesecRange {
    private @Nullable SqlQueryParameterDatetimesecRangeRange range;
    /**
     * @return The default value for this parameter.
     * 
     */
    private @Nullable String value;

    private SqlQueryParameterDatetimesecRange() {}
    public Optional<SqlQueryParameterDatetimesecRangeRange> range() {
        return Optional.ofNullable(this.range);
    }
    /**
     * @return The default value for this parameter.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterDatetimesecRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryParameterDatetimesecRangeRange range;
        private @Nullable String value;
        public Builder() {}
        public Builder(SqlQueryParameterDatetimesecRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder range(@Nullable SqlQueryParameterDatetimesecRangeRange range) {
            this.range = range;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public SqlQueryParameterDatetimesecRange build() {
            final var o = new SqlQueryParameterDatetimesecRange();
            o.range = range;
            o.value = value;
            return o;
        }
    }
}
