// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNewClusterAutoscale extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNewClusterAutoscale Empty = new GetJobJobSettingsSettingsTaskNewClusterAutoscale();

    @Import(name="maxWorkers")
    private @Nullable Integer maxWorkers;

    public Optional<Integer> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }

    @Import(name="minWorkers")
    private @Nullable Integer minWorkers;

    public Optional<Integer> minWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }

    private GetJobJobSettingsSettingsTaskNewClusterAutoscale() {}

    private GetJobJobSettingsSettingsTaskNewClusterAutoscale(GetJobJobSettingsSettingsTaskNewClusterAutoscale $) {
        this.maxWorkers = $.maxWorkers;
        this.minWorkers = $.minWorkers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNewClusterAutoscale defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNewClusterAutoscale $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNewClusterAutoscale();
        }

        public Builder(GetJobJobSettingsSettingsTaskNewClusterAutoscale defaults) {
            $ = new GetJobJobSettingsSettingsTaskNewClusterAutoscale(Objects.requireNonNull(defaults));
        }

        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            $.maxWorkers = maxWorkers;
            return this;
        }

        public Builder minWorkers(@Nullable Integer minWorkers) {
            $.minWorkers = minWorkers;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNewClusterAutoscale build() {
            return $;
        }
    }

}
