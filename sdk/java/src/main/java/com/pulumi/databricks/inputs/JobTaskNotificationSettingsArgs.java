// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobTaskNotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobTaskNotificationSettingsArgs Empty = new JobTaskNotificationSettingsArgs();

    /**
     * (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    @Import(name="alertOnLastAttempt")
    private @Nullable Output<Boolean> alertOnLastAttempt;

    /**
     * @return (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    public Optional<Output<Boolean>> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }

    /**
     * (Bool) don&#39;t send alert for cancelled runs.
     * 
     */
    @Import(name="noAlertForCanceledRuns")
    private @Nullable Output<Boolean> noAlertForCanceledRuns;

    /**
     * @return (Bool) don&#39;t send alert for cancelled runs.
     * 
     */
    public Optional<Output<Boolean>> noAlertForCanceledRuns() {
        return Optional.ofNullable(this.noAlertForCanceledRuns);
    }

    /**
     * (Bool) don&#39;t send alert for skipped runs.
     * 
     */
    @Import(name="noAlertForSkippedRuns")
    private @Nullable Output<Boolean> noAlertForSkippedRuns;

    /**
     * @return (Bool) don&#39;t send alert for skipped runs.
     * 
     */
    public Optional<Output<Boolean>> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    private JobTaskNotificationSettingsArgs() {}

    private JobTaskNotificationSettingsArgs(JobTaskNotificationSettingsArgs $) {
        this.alertOnLastAttempt = $.alertOnLastAttempt;
        this.noAlertForCanceledRuns = $.noAlertForCanceledRuns;
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobTaskNotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobTaskNotificationSettingsArgs $;

        public Builder() {
            $ = new JobTaskNotificationSettingsArgs();
        }

        public Builder(JobTaskNotificationSettingsArgs defaults) {
            $ = new JobTaskNotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertOnLastAttempt (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
         * 
         * @return builder
         * 
         */
        public Builder alertOnLastAttempt(@Nullable Output<Boolean> alertOnLastAttempt) {
            $.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }

        /**
         * @param alertOnLastAttempt (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
         * 
         * @return builder
         * 
         */
        public Builder alertOnLastAttempt(Boolean alertOnLastAttempt) {
            return alertOnLastAttempt(Output.of(alertOnLastAttempt));
        }

        /**
         * @param noAlertForCanceledRuns (Bool) don&#39;t send alert for cancelled runs.
         * 
         * @return builder
         * 
         */
        public Builder noAlertForCanceledRuns(@Nullable Output<Boolean> noAlertForCanceledRuns) {
            $.noAlertForCanceledRuns = noAlertForCanceledRuns;
            return this;
        }

        /**
         * @param noAlertForCanceledRuns (Bool) don&#39;t send alert for cancelled runs.
         * 
         * @return builder
         * 
         */
        public Builder noAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
            return noAlertForCanceledRuns(Output.of(noAlertForCanceledRuns));
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs.
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(@Nullable Output<Boolean> noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        /**
         * @param noAlertForSkippedRuns (Bool) don&#39;t send alert for skipped runs.
         * 
         * @return builder
         * 
         */
        public Builder noAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
            return noAlertForSkippedRuns(Output.of(noAlertForSkippedRuns));
        }

        public JobTaskNotificationSettingsArgs build() {
            return $;
        }
    }

}
