// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobJobClusterNewClusterAutoscale {
    private @Nullable Integer maxWorkers;
    private @Nullable Integer minWorkers;

    private JobJobClusterNewClusterAutoscale() {}
    public Optional<Integer> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }
    public Optional<Integer> minWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobJobClusterNewClusterAutoscale defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer maxWorkers;
        private @Nullable Integer minWorkers;
        public Builder() {}
        public Builder(JobJobClusterNewClusterAutoscale defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
        }

        @CustomType.Setter
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder minWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }
        public JobJobClusterNewClusterAutoscale build() {
            final var o = new JobJobClusterNewClusterAutoscale();
            o.maxWorkers = maxWorkers;
            o.minWorkers = minWorkers;
            return o;
        }
    }
}