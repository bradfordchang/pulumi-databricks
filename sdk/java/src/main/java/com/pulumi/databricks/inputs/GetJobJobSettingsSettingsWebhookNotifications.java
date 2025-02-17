// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceeded;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsWebhookNotificationsOnFailure;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsWebhookNotificationsOnStart;
import com.pulumi.databricks.inputs.GetJobJobSettingsSettingsWebhookNotificationsOnSuccess;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsWebhookNotifications extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsWebhookNotifications Empty = new GetJobJobSettingsSettingsWebhookNotifications();

    @Import(name="onDurationWarningThresholdExceededs")
    private @Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceeded> onDurationWarningThresholdExceededs;

    public Optional<List<GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceeded>> onDurationWarningThresholdExceededs() {
        return Optional.ofNullable(this.onDurationWarningThresholdExceededs);
    }

    @Import(name="onFailures")
    private @Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnFailure> onFailures;

    public Optional<List<GetJobJobSettingsSettingsWebhookNotificationsOnFailure>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    @Import(name="onStarts")
    private @Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnStart> onStarts;

    public Optional<List<GetJobJobSettingsSettingsWebhookNotificationsOnStart>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    @Import(name="onSuccesses")
    private @Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnSuccess> onSuccesses;

    public Optional<List<GetJobJobSettingsSettingsWebhookNotificationsOnSuccess>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private GetJobJobSettingsSettingsWebhookNotifications() {}

    private GetJobJobSettingsSettingsWebhookNotifications(GetJobJobSettingsSettingsWebhookNotifications $) {
        this.onDurationWarningThresholdExceededs = $.onDurationWarningThresholdExceededs;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsWebhookNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsWebhookNotifications $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsWebhookNotifications();
        }

        public Builder(GetJobJobSettingsSettingsWebhookNotifications defaults) {
            $ = new GetJobJobSettingsSettingsWebhookNotifications(Objects.requireNonNull(defaults));
        }

        public Builder onDurationWarningThresholdExceededs(@Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceeded> onDurationWarningThresholdExceededs) {
            $.onDurationWarningThresholdExceededs = onDurationWarningThresholdExceededs;
            return this;
        }

        public Builder onDurationWarningThresholdExceededs(GetJobJobSettingsSettingsWebhookNotificationsOnDurationWarningThresholdExceeded... onDurationWarningThresholdExceededs) {
            return onDurationWarningThresholdExceededs(List.of(onDurationWarningThresholdExceededs));
        }

        public Builder onFailures(@Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnFailure> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        public Builder onFailures(GetJobJobSettingsSettingsWebhookNotificationsOnFailure... onFailures) {
            return onFailures(List.of(onFailures));
        }

        public Builder onStarts(@Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnStart> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        public Builder onStarts(GetJobJobSettingsSettingsWebhookNotificationsOnStart... onStarts) {
            return onStarts(List.of(onStarts));
        }

        public Builder onSuccesses(@Nullable List<GetJobJobSettingsSettingsWebhookNotificationsOnSuccess> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        public Builder onSuccesses(GetJobJobSettingsSettingsWebhookNotificationsOnSuccess... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public GetJobJobSettingsSettingsWebhookNotifications build() {
            return $;
        }
    }

}
