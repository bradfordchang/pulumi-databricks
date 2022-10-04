// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskEmailNotifications extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskEmailNotifications Empty = new GetJobJobSettingsSettingsTaskEmailNotifications();

    @Import(name="alertOnLastAttempt")
    private @Nullable Boolean alertOnLastAttempt;

    public Optional<Boolean> alertOnLastAttempt() {
        return Optional.ofNullable(this.alertOnLastAttempt);
    }

    @Import(name="noAlertForSkippedRuns")
    private @Nullable Boolean noAlertForSkippedRuns;

    public Optional<Boolean> noAlertForSkippedRuns() {
        return Optional.ofNullable(this.noAlertForSkippedRuns);
    }

    @Import(name="onFailures")
    private @Nullable List<String> onFailures;

    public Optional<List<String>> onFailures() {
        return Optional.ofNullable(this.onFailures);
    }

    @Import(name="onStarts")
    private @Nullable List<String> onStarts;

    public Optional<List<String>> onStarts() {
        return Optional.ofNullable(this.onStarts);
    }

    @Import(name="onSuccesses")
    private @Nullable List<String> onSuccesses;

    public Optional<List<String>> onSuccesses() {
        return Optional.ofNullable(this.onSuccesses);
    }

    private GetJobJobSettingsSettingsTaskEmailNotifications() {}

    private GetJobJobSettingsSettingsTaskEmailNotifications(GetJobJobSettingsSettingsTaskEmailNotifications $) {
        this.alertOnLastAttempt = $.alertOnLastAttempt;
        this.noAlertForSkippedRuns = $.noAlertForSkippedRuns;
        this.onFailures = $.onFailures;
        this.onStarts = $.onStarts;
        this.onSuccesses = $.onSuccesses;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskEmailNotifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskEmailNotifications $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskEmailNotifications();
        }

        public Builder(GetJobJobSettingsSettingsTaskEmailNotifications defaults) {
            $ = new GetJobJobSettingsSettingsTaskEmailNotifications(Objects.requireNonNull(defaults));
        }

        public Builder alertOnLastAttempt(@Nullable Boolean alertOnLastAttempt) {
            $.alertOnLastAttempt = alertOnLastAttempt;
            return this;
        }

        public Builder noAlertForSkippedRuns(@Nullable Boolean noAlertForSkippedRuns) {
            $.noAlertForSkippedRuns = noAlertForSkippedRuns;
            return this;
        }

        public Builder onFailures(@Nullable List<String> onFailures) {
            $.onFailures = onFailures;
            return this;
        }

        public Builder onFailures(String... onFailures) {
            return onFailures(List.of(onFailures));
        }

        public Builder onStarts(@Nullable List<String> onStarts) {
            $.onStarts = onStarts;
            return this;
        }

        public Builder onStarts(String... onStarts) {
            return onStarts(List.of(onStarts));
        }

        public Builder onSuccesses(@Nullable List<String> onSuccesses) {
            $.onSuccesses = onSuccesses;
            return this;
        }

        public Builder onSuccesses(String... onSuccesses) {
            return onSuccesses(List.of(onSuccesses));
        }

        public GetJobJobSettingsSettingsTaskEmailNotifications build() {
            return $;
        }
    }

}
