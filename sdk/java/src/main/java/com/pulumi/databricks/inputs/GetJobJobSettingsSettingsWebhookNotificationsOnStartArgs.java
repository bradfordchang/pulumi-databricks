// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs Empty = new GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs();

    @Import(name="id", required=true)
    private Output<String> id;

    public Output<String> id() {
        return this.id;
    }

    private GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs() {}

    private GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs(GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs();
        }

        public Builder(GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs defaults) {
            $ = new GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs(Objects.requireNonNull(defaults));
        }

        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetJobJobSettingsSettingsWebhookNotificationsOnStartArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
