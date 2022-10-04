// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskSparkPythonTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskSparkPythonTask Empty = new GetJobJobSettingsSettingsTaskSparkPythonTask();

    @Import(name="parameters")
    private @Nullable List<String> parameters;

    public Optional<List<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="pythonFile", required=true)
    private String pythonFile;

    public String pythonFile() {
        return this.pythonFile;
    }

    private GetJobJobSettingsSettingsTaskSparkPythonTask() {}

    private GetJobJobSettingsSettingsTaskSparkPythonTask(GetJobJobSettingsSettingsTaskSparkPythonTask $) {
        this.parameters = $.parameters;
        this.pythonFile = $.pythonFile;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskSparkPythonTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskSparkPythonTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskSparkPythonTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskSparkPythonTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskSparkPythonTask(Objects.requireNonNull(defaults));
        }

        public Builder parameters(@Nullable List<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder pythonFile(String pythonFile) {
            $.pythonFile = pythonFile;
            return this;
        }

        public GetJobJobSettingsSettingsTaskSparkPythonTask build() {
            $.pythonFile = Objects.requireNonNull($.pythonFile, "expected parameter 'pythonFile' to be non-null");
            return $;
        }
    }

}
