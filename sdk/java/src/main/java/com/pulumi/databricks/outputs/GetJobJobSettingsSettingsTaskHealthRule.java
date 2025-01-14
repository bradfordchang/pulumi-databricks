// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskHealthRule {
    private @Nullable String metric;
    private @Nullable String op;
    private @Nullable Integer value;

    private GetJobJobSettingsSettingsTaskHealthRule() {}
    public Optional<String> metric() {
        return Optional.ofNullable(this.metric);
    }
    public Optional<String> op() {
        return Optional.ofNullable(this.op);
    }
    public Optional<Integer> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskHealthRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String metric;
        private @Nullable String op;
        private @Nullable Integer value;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskHealthRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metric = defaults.metric;
    	      this.op = defaults.op;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder metric(@Nullable String metric) {
            this.metric = metric;
            return this;
        }
        @CustomType.Setter
        public Builder op(@Nullable String op) {
            this.op = op;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Integer value) {
            this.value = value;
            return this;
        }
        public GetJobJobSettingsSettingsTaskHealthRule build() {
            final var _resultValue = new GetJobJobSettingsSettingsTaskHealthRule();
            _resultValue.metric = metric;
            _resultValue.op = op;
            _resultValue.value = value;
            return _resultValue;
        }
    }
}
