// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskDependsOn {
    private @Nullable String taskKey;

    private GetJobJobSettingsSettingsTaskDependsOn() {}
    public Optional<String> taskKey() {
        return Optional.ofNullable(this.taskKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskDependsOn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String taskKey;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskDependsOn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.taskKey = defaults.taskKey;
        }

        @CustomType.Setter
        public Builder taskKey(@Nullable String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public GetJobJobSettingsSettingsTaskDependsOn build() {
            final var o = new GetJobJobSettingsSettingsTaskDependsOn();
            o.taskKey = taskKey;
            return o;
        }
    }
}
