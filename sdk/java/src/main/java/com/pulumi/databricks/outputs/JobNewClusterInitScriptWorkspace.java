// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobNewClusterInitScriptWorkspace {
    private @Nullable String destination;

    private JobNewClusterInitScriptWorkspace() {}
    public Optional<String> destination() {
        return Optional.ofNullable(this.destination);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobNewClusterInitScriptWorkspace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String destination;
        public Builder() {}
        public Builder(JobNewClusterInitScriptWorkspace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        @CustomType.Setter
        public Builder destination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }
        public JobNewClusterInitScriptWorkspace build() {
            final var _resultValue = new JobNewClusterInitScriptWorkspace();
            _resultValue.destination = destination;
            return _resultValue;
        }
    }
}
