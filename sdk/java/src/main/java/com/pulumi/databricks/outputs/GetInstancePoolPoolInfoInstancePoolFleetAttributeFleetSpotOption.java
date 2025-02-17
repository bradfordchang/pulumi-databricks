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
public final class GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption {
    private String allocationStrategy;
    private @Nullable Integer instancePoolsToUseCount;

    private GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption() {}
    public String allocationStrategy() {
        return this.allocationStrategy;
    }
    public Optional<Integer> instancePoolsToUseCount() {
        return Optional.ofNullable(this.instancePoolsToUseCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocationStrategy;
        private @Nullable Integer instancePoolsToUseCount;
        public Builder() {}
        public Builder(GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationStrategy = defaults.allocationStrategy;
    	      this.instancePoolsToUseCount = defaults.instancePoolsToUseCount;
        }

        @CustomType.Setter
        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = Objects.requireNonNull(allocationStrategy);
            return this;
        }
        @CustomType.Setter
        public Builder instancePoolsToUseCount(@Nullable Integer instancePoolsToUseCount) {
            this.instancePoolsToUseCount = instancePoolsToUseCount;
            return this;
        }
        public GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption build() {
            final var _resultValue = new GetInstancePoolPoolInfoInstancePoolFleetAttributeFleetSpotOption();
            _resultValue.allocationStrategy = allocationStrategy;
            _resultValue.instancePoolsToUseCount = instancePoolsToUseCount;
            return _resultValue;
        }
    }
}
