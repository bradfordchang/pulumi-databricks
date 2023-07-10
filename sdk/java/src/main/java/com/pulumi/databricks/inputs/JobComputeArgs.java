// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobComputeSpecArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobComputeArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobComputeArgs Empty = new JobComputeArgs();

    @Import(name="computeKey")
    private @Nullable Output<String> computeKey;

    public Optional<Output<String>> computeKey() {
        return Optional.ofNullable(this.computeKey);
    }

    @Import(name="spec")
    private @Nullable Output<JobComputeSpecArgs> spec;

    public Optional<Output<JobComputeSpecArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    private JobComputeArgs() {}

    private JobComputeArgs(JobComputeArgs $) {
        this.computeKey = $.computeKey;
        this.spec = $.spec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobComputeArgs $;

        public Builder() {
            $ = new JobComputeArgs();
        }

        public Builder(JobComputeArgs defaults) {
            $ = new JobComputeArgs(Objects.requireNonNull(defaults));
        }

        public Builder computeKey(@Nullable Output<String> computeKey) {
            $.computeKey = computeKey;
            return this;
        }

        public Builder computeKey(String computeKey) {
            return computeKey(Output.of(computeKey));
        }

        public Builder spec(@Nullable Output<JobComputeSpecArgs> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(JobComputeSpecArgs spec) {
            return spec(Output.of(spec));
        }

        public JobComputeArgs build() {
            return $;
        }
    }

}
