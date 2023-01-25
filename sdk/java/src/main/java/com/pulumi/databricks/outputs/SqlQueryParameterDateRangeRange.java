// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlQueryParameterDateRangeRange {
    private String end;
    private String start;

    private SqlQueryParameterDateRangeRange() {}
    public String end() {
        return this.end;
    }
    public String start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterDateRangeRange defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String end;
        private String start;
        public Builder() {}
        public Builder(SqlQueryParameterDateRangeRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        @CustomType.Setter
        public Builder end(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        @CustomType.Setter
        public Builder start(String start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }
        public SqlQueryParameterDateRangeRange build() {
            final var o = new SqlQueryParameterDateRangeRange();
            o.end = end;
            o.start = start;
            return o;
        }
    }
}
