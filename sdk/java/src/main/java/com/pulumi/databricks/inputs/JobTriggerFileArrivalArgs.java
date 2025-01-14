// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTriggerFileArrivalArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTriggerFileArrivalArgs Empty = new JobTriggerFileArrivalArgs();

    /**
     * If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
     * 
     */
    @Import(name="minTimeBetweenTriggersSeconds")
    private @Nullable Output<Integer> minTimeBetweenTriggersSeconds;

    /**
     * @return If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
     * 
     */
    public Optional<Output<Integer>> minTimeBetweenTriggersSeconds() {
        return Optional.ofNullable(this.minTimeBetweenTriggersSeconds);
    }

    /**
     * URL of the job on the given workspace
     * 
     */
    @Import(name="url", required=true)
    private Output<String> url;

    /**
     * @return URL of the job on the given workspace
     * 
     */
    public Output<String> url() {
        return this.url;
    }

    /**
     * If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
     * 
     */
    @Import(name="waitAfterLastChangeSeconds")
    private @Nullable Output<Integer> waitAfterLastChangeSeconds;

    /**
     * @return If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
     * 
     */
    public Optional<Output<Integer>> waitAfterLastChangeSeconds() {
        return Optional.ofNullable(this.waitAfterLastChangeSeconds);
    }

    private JobTriggerFileArrivalArgs() {}

    private JobTriggerFileArrivalArgs(JobTriggerFileArrivalArgs $) {
        this.minTimeBetweenTriggersSeconds = $.minTimeBetweenTriggersSeconds;
        this.url = $.url;
        this.waitAfterLastChangeSeconds = $.waitAfterLastChangeSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTriggerFileArrivalArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTriggerFileArrivalArgs $;

        public Builder() {
            $ = new JobTriggerFileArrivalArgs();
        }

        public Builder(JobTriggerFileArrivalArgs defaults) {
            $ = new JobTriggerFileArrivalArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param minTimeBetweenTriggersSeconds If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder minTimeBetweenTriggersSeconds(@Nullable Output<Integer> minTimeBetweenTriggersSeconds) {
            $.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
            return this;
        }

        /**
         * @param minTimeBetweenTriggersSeconds If set, the trigger starts a run only after the specified amount of time passed since the last time the trigger fired. The minimum allowed value is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder minTimeBetweenTriggersSeconds(Integer minTimeBetweenTriggersSeconds) {
            return minTimeBetweenTriggersSeconds(Output.of(minTimeBetweenTriggersSeconds));
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        /**
         * @param url URL of the job on the given workspace
         * 
         * @return builder
         * 
         */
        public Builder url(String url) {
            return url(Output.of(url));
        }

        /**
         * @param waitAfterLastChangeSeconds If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder waitAfterLastChangeSeconds(@Nullable Output<Integer> waitAfterLastChangeSeconds) {
            $.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
            return this;
        }

        /**
         * @param waitAfterLastChangeSeconds If set, the trigger starts a run only after no file activity has occurred for the specified amount of time. This makes it possible to wait for a batch of incoming files to arrive before triggering a run. The minimum allowed value is 60 seconds.
         * 
         * @return builder
         * 
         */
        public Builder waitAfterLastChangeSeconds(Integer waitAfterLastChangeSeconds) {
            return waitAfterLastChangeSeconds(Output.of(waitAfterLastChangeSeconds));
        }

        public JobTriggerFileArrivalArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}
