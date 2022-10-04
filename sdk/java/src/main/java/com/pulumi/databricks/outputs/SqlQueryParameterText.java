// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlQueryParameterText {
    private String value;

    private SqlQueryParameterText() {}
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterText defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(SqlQueryParameterText defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public SqlQueryParameterText build() {
            final var o = new SqlQueryParameterText();
            o.value = value;
            return o;
        }
    }
}