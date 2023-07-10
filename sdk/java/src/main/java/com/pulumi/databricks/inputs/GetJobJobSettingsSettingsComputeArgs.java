// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsComputeSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsComputeArgs Empty = new GetJobJobSettingsSettingsComputeArgs();

    @Import(name="computeKey")
    private @Nullable Output<String> computeKey;

    public Optional<Output<String>> computeKey() {
        return Optional.ofNullable(this.computeKey);
    }

    @Import(name="spec")
    private @Nullable Output<GetJobJobSettingsSettingsComputeSpecArgs> spec;

    public Optional<Output<GetJobJobSettingsSettingsComputeSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private GetJobJobSettingsSettingsComputeArgs() {}

    private GetJobJobSettingsSettingsComputeArgs(GetJobJobSettingsSettingsComputeArgs $) {
        this.computeKey = $.computeKey;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsComputeArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsComputeArgs();
        }

        public Builder(GetJobJobSettingsSettingsComputeArgs defaults) {
            $ = new GetJobJobSettingsSettingsComputeArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeKey(@Nullable Output<String> computeKey) {
            $.computeKey = computeKey;
            return this;
        }

        public Builder computeKey(String computeKey) {
            return computeKey(Output.of(computeKey));
        }

        public Builder spec(@Nullable Output<GetJobJobSettingsSettingsComputeSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(GetJobJobSettingsSettingsComputeSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public GetJobJobSettingsSettingsComputeArgs build() {
            return $;
        }
    }

}