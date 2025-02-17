// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MwsNetworksErrorMessage {
    private @Nullable String errorMessage;
    private @Nullable String errorType;

    private MwsNetworksErrorMessage() {}
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }
    public Optional<String> errorType() {
        return Optional.ofNullable(this.errorType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MwsNetworksErrorMessage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable String errorType;
        public Builder() {}
        public Builder(MwsNetworksErrorMessage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.errorType = defaults.errorType;
        }

        @CustomType.Setter
        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        @CustomType.Setter
        public Builder errorType(@Nullable String errorType) {
            this.errorType = errorType;
            return this;
        }
        public MwsNetworksErrorMessage build() {
            final var _resultValue = new MwsNetworksErrorMessage();
            _resultValue.errorMessage = errorMessage;
            _resultValue.errorType = errorType;
            return _resultValue;
        }
    }
}
