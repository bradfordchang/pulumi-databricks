// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsPipelineTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsPipelineTask Empty = new GetJobJobSettingsSettingsPipelineTask();

    @Import(name="fullRefresh")
    private @Nullable Boolean fullRefresh;

    public Optional<Boolean> fullRefresh() {
        return Optional.ofNullable(this.fullRefresh);
    }

    @Import(name="pipelineId", required=true)
    private String pipelineId;

    public String pipelineId() {
        return this.pipelineId;
    }

    private GetJobJobSettingsSettingsPipelineTask() {}

    private GetJobJobSettingsSettingsPipelineTask(GetJobJobSettingsSettingsPipelineTask $) {
        this.fullRefresh = $.fullRefresh;
        this.pipelineId = $.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsPipelineTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsPipelineTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsPipelineTask();
        }

        public Builder(GetJobJobSettingsSettingsPipelineTask defaults) {
            $ = new GetJobJobSettingsSettingsPipelineTask(Objects.requireNonNull(defaults));
        }

        public Builder fullRefresh(@Nullable Boolean fullRefresh) {
            $.fullRefresh = fullRefresh;
            return this;
        }

        public Builder pipelineId(String pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        public GetJobJobSettingsSettingsPipelineTask build() {
            $.pipelineId = Objects.requireNonNull($.pipelineId, "expected parameter 'pipelineId' to be non-null");
            return $;
        }
    }

}
