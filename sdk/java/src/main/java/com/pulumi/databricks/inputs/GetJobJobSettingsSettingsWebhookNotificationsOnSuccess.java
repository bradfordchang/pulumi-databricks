// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsWebhookNotificationsOnSuccess extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsWebhookNotificationsOnSuccess Empty = new GetJobJobSettingsSettingsWebhookNotificationsOnSuccess();

    /**
     * the id of databricks.Job if the resource was matched by name.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetJobJobSettingsSettingsWebhookNotificationsOnSuccess() {}

    private GetJobJobSettingsSettingsWebhookNotificationsOnSuccess(GetJobJobSettingsSettingsWebhookNotificationsOnSuccess $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsWebhookNotificationsOnSuccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsWebhookNotificationsOnSuccess $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnSuccess();
        }

        public Builder(GetJobJobSettingsSettingsWebhookNotificationsOnSuccess defaults) {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnSuccess(Objects.requireNonNull(defaults));
        }

        /**
         * @param id the id of databricks.Job if the resource was matched by name.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetJobJobSettingsSettingsWebhookNotificationsOnSuccess build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
