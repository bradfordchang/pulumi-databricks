// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.databricks.outputs.GetJobJobSettingsSettingsTriggerFileArrival;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobJobSettingsSettingsTrigger {
    private GetJobJobSettingsSettingsTriggerFileArrival fileArrival;
    private @Nullable String pauseStatus;

    private GetJobJobSettingsSettingsTrigger() {}
    public GetJobJobSettingsSettingsTriggerFileArrival fileArrival() {
        return this.fileArrival;
    }
    public Optional<String> pauseStatus() {
        return Optional.ofNullable(this.pauseStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobJobSettingsSettingsTrigger defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private GetJobJobSettingsSettingsTriggerFileArrival fileArrival;
        private @Nullable String pauseStatus;
        public Builder() {}
        public Builder(GetJobJobSettingsSettingsTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileArrival = defaults.fileArrival;
    	      this.pauseStatus = defaults.pauseStatus;
        }

        @CustomType.Setter
        public Builder fileArrival(GetJobJobSettingsSettingsTriggerFileArrival fileArrival) {
            this.fileArrival = Objects.requireNonNull(fileArrival);
            return this;
        }
        @CustomType.Setter
        public Builder pauseStatus(@Nullable String pauseStatus) {
            this.pauseStatus = pauseStatus;
            return this;
        }
        public GetJobJobSettingsSettingsTrigger build() {
            final var _resultValue = new GetJobJobSettingsSettingsTrigger();
            _resultValue.fileArrival = fileArrival;
            _resultValue.pauseStatus = pauseStatus;
            return _resultValue;
        }
    }
}
