// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.JobWebhookNotificationsOnFailureArgs;
import com.pulumi.databricks.inputs.JobWebhookNotificationsOnStartArgs;
import com.pulumi.databricks.inputs.JobWebhookNotificationsOnSuccessArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobWebhookNotificationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobWebhookNotificationsArgs Empty = new JobWebhookNotificationsArgs();

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onFailures")
    private @Nullable Output<List<JobWebhookNotificationsOnFailureArgs>> onFailures;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<JobWebhookNotificationsOnFailureArgs>>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onStarts")
    private @Nullable Output<List<JobWebhookNotificationsOnStartArgs>> onStarts;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<JobWebhookNotificationsOnStartArgs>>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    /**
     * (List) list of emails to notify on failure
     * 
     */
    @Import(name="onSuccesses")
    private @Nullable Output<List<JobWebhookNotificationsOnSuccessArgs>> onSuccesses;

    /**
     * @return (List) list of emails to notify on failure
     * 
     */
    public Optional<Output<List<JobWebhookNotificationsOnSuccessArgs>>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private JobWebhookNotificationsArgs() {}

    private JobWebhookNotificationsArgs(JobWebhookNotificationsArgs $) {
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobWebhookNotificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobWebhookNotificationsArgs $;

        public Builder() {
            $ = new JobWebhookNotificationsArgs();
        }

        public Builder(JobWebhookNotificationsArgs defaults) {
            $ = new JobWebhookNotificationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(@Nullable Output<List<JobWebhookNotificationsOnFailureArgs>> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(List<JobWebhookNotificationsOnFailureArgs> onFailures) {
            return onFailures(Output.of(onFailures));
        }

        /**
         * @param onFailures (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onFailures(JobWebhookNotificationsOnFailureArgs... onFailures) {
            return onFailures(List.of(onFailures));
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(@Nullable Output<List<JobWebhookNotificationsOnStartArgs>> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(List<JobWebhookNotificationsOnStartArgs> onStarts) {
            return onStarts(Output.of(onStarts));
        }

        /**
         * @param onStarts (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onStarts(JobWebhookNotificationsOnStartArgs... onStarts) {
            return onStarts(List.of(onStarts));
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(@Nullable Output<List<JobWebhookNotificationsOnSuccessArgs>> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(List<JobWebhookNotificationsOnSuccessArgs> onSuccesses) {
            return onSuccesses(Output.of(onSuccesses));
        }

        /**
         * @param onSuccesses (List) list of emails to notify on failure
         * 
         * @return builder
         * 
         */
        public Builder onSuccesses(JobWebhookNotificationsOnSuccessArgs... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public JobWebhookNotificationsArgs build() {
            return $;
        }
    }

}