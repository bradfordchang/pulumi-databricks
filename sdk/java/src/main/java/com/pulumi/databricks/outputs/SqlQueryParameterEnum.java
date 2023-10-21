// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.SqlQueryParameterEnumMultiple;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SqlQueryParameterEnum {
    private @Nullable SqlQueryParameterEnumMultiple multiple;
    private List<String> options;
    /**
     * @return The default value for this parameter.
     * 
     */
    private @Nullable String value;
    private @Nullable List<String> values;

    private SqlQueryParameterEnum() {}
    public Optional<SqlQueryParameterEnumMultiple> multiple() {
        return Optional.ofNullable(this.multiple);
    }
    public List<String> options() {
        return this.options;
    }
    /**
     * @return The default value for this parameter.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlQueryParameterEnum defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SqlQueryParameterEnumMultiple multiple;
        private List<String> options;
        private @Nullable String value;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(SqlQueryParameterEnum defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiple = defaults.multiple;
    	      this.options = defaults.options;
    	      this.value = defaults.value;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder multiple(@Nullable SqlQueryParameterEnumMultiple multiple) {
            this.multiple = multiple;
            return this;
        }
        @CustomType.Setter
        public Builder options(List<String> options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        public Builder options(String... options) {
            return options(List.of(options));
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public SqlQueryParameterEnum build() {
            final var o = new SqlQueryParameterEnum();
            o.multiple = multiple;
            o.options = options;
            o.value = value;
            o.values = values;
            return o;
        }
    }
}
