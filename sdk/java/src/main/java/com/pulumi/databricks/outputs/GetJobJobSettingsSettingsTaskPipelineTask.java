// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTaskPipelineTask {
    private @Nullable Boolean fullRefresh;
    private String pipelineId;

    private GetJobJobSettingsSettingsTaskPipelineTask() {}
    public Optional<Boolean> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }
    public String pipelineId() {
        return this.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTaskPipelineTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean fullRefresh;
        private String pipelineId;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTaskPipelineTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullRefresh = defaults.fullRefresh;
    	      this.pipelineId = defaults.pipelineId;
        }

        @CustomType.Setter
        public Builder fullRefresh(@Nullable Boolean fullRefresh) {
            this.fullRefresh = fullRefresh;
            return this;
        }
        @CustomType.Setter
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }
        public GetJobJobSettingsSettingsTaskPipelineTask build() {
            final var o = new GetJobJobSettingsSettingsTaskPipelineTask();
            o.fullRefresh = fullRefresh;
            o.pipelineId = pipelineId;
            return o;
        }
    }
}
