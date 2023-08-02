// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobEmailNotifications {
    /**
     * @return (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    private @Nullable Boolean alertOnLastAttempt;
    /**
     * @return (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
     * 
     */
    private @Nullable Boolean noAlertForSkippedRuns;
    /**
     * @return (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     */
    private @Nullable List<String> onDurationWarningThresholdExceededs;
    /**
     * @return (List) list of emails to notify when the run fails.
     * 
     */
    private @Nullable List<String> onFailures;
    /**
     * @return (List) list of emails to notify when the run starts.
     * 
     */
    private @Nullable List<String> onStarts;
    /**
     * @return (List) list of emails to notify when the run completes successfully.
     * 
     */
    private @Nullable List<String> onSuccesses;

    private JobEmailNotifications() {}
    /**
     * @return (Bool) do not send notifications to recipients specified in `on_start` for the retried runs and do not send notifications to recipients specified in `on_failure` until the last retry of the run.
     * 
     */
    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }
    /**
     * @return (Bool) don&#39;t send alert for skipped runs. (It&#39;s recommended to use the corresponding setting in the `notification_settings` configuration block).
     * 
     */
    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }
    /**
     * @return (List) list of emails to notify when the duration of a run exceeds the threshold specified by the `RUN_DURATION_SECONDS` metric in the `health` block.
     * 
     */
    public List<String> onDurationWarningThresholdExceededs() {
        return this.onDurationWarningThresholdExceededs == null ? List.of() : this.onDurationWarningThresholdExceededs;
    }
    /**
     * @return (List) list of emails to notify when the run fails.
     * 
     */
    public List<String> onFailures() {
        return this.onFailures == null ? List.of() : this.onFailures;
    }
    /**
     * @return (List) list of emails to notify when the run starts.
     * 
     */
    public List<String> onStarts() {
        return this.onStarts == null ? List.of() : this.onStarts;
    }
    /**
     * @return (List) list of emails to notify when the run completes successfully.
     * 
     */
    public List<String> onSuccesses() {
        return this.onSuccesses == null ? List.of() : this.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobEmailNotifications defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean alertOnLastAttempt;
        private @Nullable Boolean noAlertForSkippedRuns;
        private @Nullable List<String> onDurationWarningThresholdExceededs;
        private @Nullable List<String> onFailures;
        private @Nullable List<String> onStarts;
        private @Nullable List<String> onSuccesses;
        public Builder() {}
        public Builder(JobEmailNotifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertOnLastAttempt = defaults.alertOnLastAttempt;
    	      this.noAlertForSkippedRuns = defaults.noAlertForSkippedRuns;
    	      this.onDurationWarningThresholdExceededs = defaults.onDurationWarningThresholdExceededs;
    	      this.onFailures = defaults.onFailures;
    	      this.onStarts = defaults.onStarts;
    	      this.onSuccesses = defaults.onSuccesses;
        }

        @CustomType.Setter
        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {
            this.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }
        @CustomType.Setter
        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {
            this.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }
        @CustomType.Setter
        public Builder onDurationWarningThresholdExceededs(@Nullable List<String> onDurationWarningThresholdExceededs) {
            this.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }
        public Builder onDurationWarningThresholdExceededs(String... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }
        @CustomType.Setter
        public Builder onFailures(@Nullable List<String> onFailures) {
            this.onFailures = onFailures;
            return this;
        }
        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }
        @CustomType.Setter
        public Builder onStarts(@Nullable List<String> onStarts) {
            this.onStarts = onStarts;
            return this;
        }
        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }
        @CustomType.Setter
        public Builder onSuccesses(@Nullable List<String> onSuccesses) {
            this.onSuccesses = onSuccesses;
            return this;
        }
        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }
        public JobEmailNotifications build() {
            final var o = new JobEmailNotifications();
            o.alertOnLastAttempt = alertOnLastAttempt;
            o.noAlertForSkippedRuns = noAlertForSkippedRuns;
            o.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            o.onFailures = onFailures;
            o.onStarts = onStarts;
            o.onSuccesses = onSuccesses;
            return o;
        }
    }
}
