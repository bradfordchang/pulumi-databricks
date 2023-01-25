// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetJobJobSettingsSettingsTaskNotebookTask extends com.pulumi.resources.InvokeArgs {

    public static final GetJobJobSettingsSettingsTaskNotebookTask Empty = new GetJobJobSettingsSettingsTaskNotebookTask();

    @Import(name="baseParameters")
    private @Nullable Map<String,Object> baseParameters;

    public Optional<Map<String,Object>> baseParameters() {
        return Optional.ofNullable(this.baseParameters);
    }

    @Import(name="notebookPath", required=true)
    private String notebookPath;

    public String notebookPath() {
        return this.notebookPath;
    }

    @Import(name="source")
    private @Nullable String source;

    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }

    private GetJobJobSettingsSettingsTaskNotebookTask() {}

    private GetJobJobSettingsSettingsTaskNotebookTask(GetJobJobSettingsSettingsTaskNotebookTask $) {
        this.baseParameters = $.baseParameters;
        this.notebookPath = $.notebookPath;
        this.source = $.source;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetJobJobSettingsSettingsTaskNotebookTask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetJobJobSettingsSettingsTaskNotebookTask $;

        public Builder() {
            $ = new GetJobJobSettingsSettingsTaskNotebookTask();
        }

        public Builder(GetJobJobSettingsSettingsTaskNotebookTask defaults) {
            $ = new GetJobJobSettingsSettingsTaskNotebookTask(Objects.requireNonNull(defaults));
        }

        public Builder baseParameters(@Nullable Map<String,Object> baseParameters) {
            $.baseParameters = baseParameters;
            return this;
        }

        public Builder notebookPath(String notebookPath) {
            $.notebookPath = notebookPath;
            return this;
        }

        public Builder source(@Nullable String source) {
            $.source = source;
            return this;
        }

        public GetJobJobSettingsSettingsTaskNotebookTask build() {
            $.notebookPath = Objects.requireNonNull($.notebookPath, "expected parameter 'notebookPath' to be non-null");
            return $;
        }
    }

}
