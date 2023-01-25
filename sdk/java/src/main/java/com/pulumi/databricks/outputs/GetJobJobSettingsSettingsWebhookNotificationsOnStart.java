// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsWebhookNotificationsOnStart {
    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    private String id;

    private GetJobJobSettingsSettingsWebhookNotificationsOnStart() {}
    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsWebhookNotificationsOnStart defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsWebhookNotificationsOnStart defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetJobJobSettingsSettingsWebhookNotificationsOnStart build() {
            final var o = new GetJobJobSettingsSettingsWebhookNotificationsOnStart();
            o.id = id;
            return o;
        }
    }
}
