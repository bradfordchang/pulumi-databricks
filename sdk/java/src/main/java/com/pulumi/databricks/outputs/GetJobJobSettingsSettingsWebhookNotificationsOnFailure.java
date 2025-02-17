// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobJobSettingsSettingsWebhookNotificationsOnFailure {
    /**
     * @return the id of databricks.Job if the resource was matched by name.
     * 
     */
    private String id;

    private GetJobJobSettingsSettingsWebhookNotificationsOnFailure() {}
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

    public static Builder builder(GetJobJobSettingsSettingsWebhookNotificationsOnFailure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsWebhookNotificationsOnFailure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetJobJobSettingsSettingsWebhookNotificationsOnFailure build() {
            final var _resultValue = new GetJobJobSettingsSettingsWebhookNotificationsOnFailure();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
