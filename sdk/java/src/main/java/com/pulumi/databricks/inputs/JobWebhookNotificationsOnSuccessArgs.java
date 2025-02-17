// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JobWebhookNotificationsOnSuccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobWebhookNotificationsOnSuccessArgs Empty = new JobWebhookNotificationsOnSuccessArgs();

    /**
     * ID of the job
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return ID of the job
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private JobWebhookNotificationsOnSuccessArgs() {}

    private JobWebhookNotificationsOnSuccessArgs(JobWebhookNotificationsOnSuccessArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobWebhookNotificationsOnSuccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobWebhookNotificationsOnSuccessArgs $;

        public Builder() {
            $ = new JobWebhookNotificationsOnSuccessArgs();
        }

        public Builder(JobWebhookNotificationsOnSuccessArgs defaults) {
            $ = new JobWebhookNotificationsOnSuccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id ID of the job
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public JobWebhookNotificationsOnSuccessArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
