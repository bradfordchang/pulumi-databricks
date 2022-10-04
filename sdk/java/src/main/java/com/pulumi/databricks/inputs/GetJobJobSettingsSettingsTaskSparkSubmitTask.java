// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskSparkSubmitTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskSparkSubmitTask Empty = new GetJobJobSettingsSettingsTaskSparkSubmitTask();

    @Import(name="parameters")
    private @Nullable List<String> parameters;

    public Optional<List<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private GetJobJobSettingsSettingsTaskSparkSubmitTask() {}

    private GetJobJobSettingsSettingsTaskSparkSubmitTask(GetJobJobSettingsSettingsTaskSparkSubmitTask $) {
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSparkSubmitTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSparkSubmitTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSparkSubmitTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskSparkSubmitTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskSparkSubmitTask(Objects.requireNonNull(defaults));
        }

        public Builder parameters(@Nullable List<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public GetJobJobSettingsSettingsTaskSparkSubmitTask build() {
            return $;
        }
    }

}
