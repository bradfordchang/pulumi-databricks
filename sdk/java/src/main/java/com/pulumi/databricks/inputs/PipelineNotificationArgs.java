// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PipelineNotificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PipelineNotificationArgs Empty = new PipelineNotificationArgs();

    /**
     * non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
     * * `on-update-success` - a pipeline update completes successfully.
     * * `on-update-failure` - a pipeline update fails with a retryable error.
     * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
     * * `on-flow-failure` - a single data flow fails.
     * 
     */
    @Import(name="alerts", required=true)
    private Output<List<String>> alerts;

    /**
     * @return non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
     * * `on-update-success` - a pipeline update completes successfully.
     * * `on-update-failure` - a pipeline update fails with a retryable error.
     * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
     * * `on-flow-failure` - a single data flow fails.
     * 
     */
    public Output<List<String>> alerts() {
        return this.alerts;
    }

    /**
     * non-empty list of emails to notify.
     * 
     */
    @Import(name="emailRecipients", required=true)
    private Output<List<String>> emailRecipients;

    /**
     * @return non-empty list of emails to notify.
     * 
     */
    public Output<List<String>> emailRecipients() {
        return this.emailRecipients;
    }

    private PipelineNotificationArgs() {}

    private PipelineNotificationArgs(PipelineNotificationArgs $) {
        this.alerts = $.alerts;
        this.emailRecipients = $.emailRecipients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PipelineNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PipelineNotificationArgs $;

        public Builder() {
            $ = new PipelineNotificationArgs();
        }

        public Builder(PipelineNotificationArgs defaults) {
            $ = new PipelineNotificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alerts non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
         * * `on-update-success` - a pipeline update completes successfully.
         * * `on-update-failure` - a pipeline update fails with a retryable error.
         * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
         * * `on-flow-failure` - a single data flow fails.
         * 
         * @return builder
         * 
         */
        public Builder alerts(Output<List<String>> alerts) {
            $.alerts = alerts;
            return this;
        }

        /**
         * @param alerts non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
         * * `on-update-success` - a pipeline update completes successfully.
         * * `on-update-failure` - a pipeline update fails with a retryable error.
         * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
         * * `on-flow-failure` - a single data flow fails.
         * 
         * @return builder
         * 
         */
        public Builder alerts(List<String> alerts) {
            return alerts(Output.of(alerts));
        }

        /**
         * @param alerts non-empty list of alert types. Right now following alert types are supported, consult documentation for actual list
         * * `on-update-success` - a pipeline update completes successfully.
         * * `on-update-failure` - a pipeline update fails with a retryable error.
         * * `on-update-fatal-failure` - a pipeline update fails with a non-retryable (fatal) error.
         * * `on-flow-failure` - a single data flow fails.
         * 
         * @return builder
         * 
         */
        public Builder alerts(String... alerts) {
            return alerts(List.of(alerts));
        }

        /**
         * @param emailRecipients non-empty list of emails to notify.
         * 
         * @return builder
         * 
         */
        public Builder emailRecipients(Output<List<String>> emailRecipients) {
            $.emailRecipients = emailRecipients;
            return this;
        }

        /**
         * @param emailRecipients non-empty list of emails to notify.
         * 
         * @return builder
         * 
         */
        public Builder emailRecipients(List<String> emailRecipients) {
            return emailRecipients(Output.of(emailRecipients));
        }

        /**
         * @param emailRecipients non-empty list of emails to notify.
         * 
         * @return builder
         * 
         */
        public Builder emailRecipients(String... emailRecipients) {
            return emailRecipients(List.of(emailRecipients));
        }

        public PipelineNotificationArgs build() {
            $.alerts = Objects.requireNonNull($.alerts, "expected parameter 'alerts' to be non-null");
            $.emailRecipients = Objects.requireNonNull($.emailRecipients, "expected parameter 'emailRecipients' to be non-null");
            return $;
        }
    }

}
