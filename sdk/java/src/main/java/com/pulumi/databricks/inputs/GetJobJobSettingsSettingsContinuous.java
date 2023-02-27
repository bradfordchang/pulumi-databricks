// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetJobJobSettingsSettingsContinuous extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsContinuous Empty = new GetJobJobSettingsSettingsContinuous();

    @Import(name="pauseStatus", required=true)
    private String pauseStatus;

    public String pauseStatus() {
        return this.pauseStatus;
    }

    private GetJobJobSettingsSettingsContinuous() {}

    private GetJobJobSettingsSettingsContinuous(GetJobJobSettingsSettingsContinuous $) {
        this.pauseStatus = $.pauseStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsContinuous defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsContinuous $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsContinuous();
        }

        public Builder(GetJobJobSettingsSettingsContinuous defaults) {
            $ = new GetJobJobSettingsSettingsContinuous(Objects.requireNonNull(defaults));
        }

        public Builder pauseStatus(String pauseStatus) {
            $.pauseStatus = pauseStatus;
            return this;
        }

        public GetJobJobSettingsSettingsContinuous build() {
            $.pauseStatus = Objects.requireNonNull($.pauseStatus, "expected parameter 'pauseStatus' to be non-null");
            return $;
        }
    }

}
